package co.com.empresamao.areait.advantage.stepdefinitions;

import co.com.empresamao.areait.advantage.questions.ValidateBuyMessage;
import co.com.empresamao.areait.advantage.questions.ValidateCreateUserMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
import co.com.empresamao.areait.advantage.tasks.CreateUsers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;

public class CreateUsersSteps {

    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser() {
        theActorInTheSpotlight().attemptsTo(CreateUsers.createUsers());
        theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
    }

    @Then("^I validate the correct user creation$")
    public void iValidateTheCorrectUserCreation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCreateUserMessage.validateCreateUserMessage()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyMessage.validateBuyMessage()));
    }
}

