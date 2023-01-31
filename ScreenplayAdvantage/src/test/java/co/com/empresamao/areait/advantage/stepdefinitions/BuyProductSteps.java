package co.com.empresamao.areait.advantage.stepdefinitions;
import co.com.empresamao.areait.advantage.questions.ValidateBuyMessage;
import co.com.empresamao.areait.advantage.tasks.BuyProducts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyProductSteps {

    @When("^I enter the information to buy a product$")
    public void iEnterTheInformationToBuyAProduct() {
        theActorInTheSpotlight().attemptsTo(BuyProducts.buyProducts());
    }

    @Then("^I validate that the product was successfully purchased$")
    public void iValidateThatTheProductWasSuccessfullyPurchased() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateBuyMessage.validateBuyMessage()));
    }
}
