package co.com.empresamao.areait.advantageMobile.stepdefinitions;

import co.com.empresamao.areait.advantageMobile.Models.CreateUserModels;
import co.com.empresamao.areait.advantageMobile.tasks.CreateUser;
import co.com.empresamao.areait.advantageMobile.tasks.Main;
import co.com.empresamao.areait.advantageMobile.utils.AppiumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;
import java.util.List;

public class CreateUserSteps {
    @Given("^I want to go to the page of advantage demo$")
    public void iWantToGoToThePageOfAdvantageDemo()throws MalformedURLException {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Mao");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));
    }

    @When("^I enter the information to create The user$")
    public void iEnterTheInformationToCreateTheUser(List<CreateUserModels>user) {
        OnStage.theActorInTheSpotlight().attemptsTo(Main.main());
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.create(user));

    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
    }

}
