package com.co.bancolombia.certification.Demoguru99.stepdefinitions;

import com.co.bancolombia.certification.Demoguru99.tasks.LoginUser;
import com.co.bancolombia.certification.Demoguru99.utils.MyDriverWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static com.co.bancolombia.certification.Demoguru99.utils.Constants.ACTOR_PAGE;
import static com.co.bancolombia.certification.Demoguru99.utils.Constants.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {
    @Given("^I want to go to the login page of demoguru$")
    public void iWantToGoToTheLoginPageOfDemoguru() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriverWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser() {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser());

    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {

    }

}
