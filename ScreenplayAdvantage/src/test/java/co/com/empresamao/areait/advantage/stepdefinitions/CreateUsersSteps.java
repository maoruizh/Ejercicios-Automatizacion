package co.com.empresamao.areait.advantage.stepdefinitions;

import co.com.empresamao.areait.advantage.questions.ValidateCreateUserMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
import co.com.empresamao.areait.advantage.tasks.CreateUsers;
import co.com.empresamao.areait.advantage.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.empresamao.areait.advantage.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;

public class CreateUsersSteps {
    @Given("^I want to go to the page of advantage demo$")
    public void iWantToGoToThePageOfAdvantageDemo() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }

    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser() {
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers());
        //theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts()); este se habilita cuando este lista toda la tarea de crear el usuario aun falta la parte de la edicion de la tarjeta de credito
    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCreateUserMessage.validateCreateUserMessage()));
    }
}

