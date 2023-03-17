package co.com.empresamao.areait.advantage.stepdefinitions;

import co.com.empresamao.areait.advantage.questions.ValidateBuyMessage;
import co.com.empresamao.areait.advantage.questions.ValidateLoginMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
import co.com.empresamao.areait.advantage.tasks.LoginUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.empresamao.areait.advantage.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {
    @Managed
    WebDriver driver;

    @Given("^I want to go to the login page of advantage demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL))); asi es para un solo navegador
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
        driver.manage().window().maximize();
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser() {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser());
        theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLoginMessage.valtext()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyMessage.validateBuyMessage()));
    }
}
