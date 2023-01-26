package co.com.empresamao.areait.advantageMobile.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;

import co.com.empresamao.areait.advantageMobile.tasks.BuyProduct;
import co.com.empresamao.areait.advantageMobile.tasks.Main;
import co.com.empresamao.areait.advantageMobile.utils.AppiumDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductSteps {
    @Given("^I want to go to the buy page of advantage demo$")
    public void iWantToGoToTheBuyPageOfAdvantageDemo() throws MalformedURLException {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Mao");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));
    }

    @When("^I enter the information to buy a product$")
    public void iEnterTheInformationToBuyAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(Main.main());
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProduct.buyProduct());
    }

    @Then("^I validate that the product was successfully purchased$")
    public void iValidateThatTheProductWasSuccessfullyPurchased() {
    }

}
