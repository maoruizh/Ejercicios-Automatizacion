package co.com.empresamao.areait.Utest.stepdefinitions;

import co.com.empresamao.areait.utest.tasks.LoginUsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.empresamao.areait.utest.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;

public class LoginUserSteps {
    @Managed(driver = "chrome")//si quieres otro navegador se puede colocar simplemente la palabra
    protected WebDriver hisBrowser;

    @Given("^I want to go to the login page of Utest$")
    public void iWantToGoToTheLoginPageOfUtest() {
        WebDriverManager.chromedriver().setup();// si quiero abrirlo con otro navegador lo cambio aca donde dice chromedriver por ejemplo: firefoxdriver
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
        hisBrowser.manage().window().maximize();
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser() {
        theActorInTheSpotlight().attemptsTo(LoginUsers.loginUsers());
    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {

    }
}
