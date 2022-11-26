package co.com.empresamao.areait.Utest.stepdefinitions;

import co.com.empresamao.areait.utest.tasks.LoginUsers;
import co.com.empresamao.areait.utest.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.empresamao.areait.utest.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {
    @Given("^I want to go to the login page of Utest$")
    public void iWantToGoToTheLoginPageOfUtest() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser() {
        theActorInTheSpotlight().attemptsTo(LoginUsers.loginUsers());
    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {

    }
}
