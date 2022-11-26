package co.com.empresamao.areait.advantage.stepdefinitions;

import co.com.empresamao.areait.advantage.questions.ValidateBuyMessage;
import co.com.empresamao.areait.advantage.questions.ValidateLoginMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
import co.com.empresamao.areait.advantage.tasks.LoginUser;
import co.com.empresamao.areait.advantage.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.empresamao.areait.advantage.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {
    @Given("^I want to go to the login page of advantage demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser() {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser());
        //theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());

    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLoginMessage.valtext()));
        //theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyMessage.validateBuyMessage()));
    }
}
