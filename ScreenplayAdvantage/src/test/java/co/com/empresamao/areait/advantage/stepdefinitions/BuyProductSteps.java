package co.com.empresamao.areait.advantage.stepdefinitions;

import co.com.empresamao.areait.advantage.questions.ValidateBuyMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
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

public class BuyProductSteps {
    @Given("^I want to go to the buy page of advantage demo$")
    public void iWantToGoToTheBuyPageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to buy a product$")
    public void iEnterTheInformationToBuyAProduct() {

        theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
    }

    @Then("^I validate that the product was successfully purchased$")
    public void iValidateThatTheProductWasSuccessfullyPurchased() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyMessage.validateBuyMessage()));

    }
}
