package co.com.retoevalart.it.tcs.stepdefinitions;

import co.com.retoevalart.it.tcs.tasks.GeneralTest;
import co.com.retoevalart.it.tcs.utils.MyDriverWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.retoevalart.it.tcs.utils.Constants.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserLoginSteps {
    @Given("^I want to go to the login page of evalart$")
    public void iWantToGoToTheLoginPageOfEvalart() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriverWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to cycles test$")
    public void iEnterTheInformationToCyclesTest() {
        theActorInTheSpotlight().attemptsTo(GeneralTest.userLogin());
    }

    @Then("^I validate the correct cycle test$")
    public void iValidateTheCorrectCycleTest() {
    }

}
