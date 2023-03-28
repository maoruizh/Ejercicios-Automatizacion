package co.com.tcs.bancolombia.certification.Mercadolibre.stepsdefinitions;

import co.com.tcs.bancolombia.certification.Mercadolibre.questions.ValidateShowSubCategories;
import co.com.tcs.bancolombia.certification.Mercadolibre.tasks.SelectCategory;
import co.com.tcs.bancolombia.certification.Mercadolibre.userinterfaces.MercadoLibrePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.tcs.bancolombia.certification.Mercadolibre.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class ShowSubcategoriesStepsdefinitions {

    MercadoLibrePage mercadoLibrePage;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }
    @Given("^That the user go to the home page of mercado libre$")
    public void thatTheUserGoToTheHomePageOfMercadoLibre() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(mercadoLibrePage));
    }

    @When("^The user enter in the category (.*)$")
    public void theUserEnterInTheCategory(String category) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCategory.selectCategory(category));
    }

    @Then("^I validate that the user can see the subcategories$")
    public void iValidateThatTheUserCanSeeTheSubcategories() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateShowSubCategories.isPresent()));
    }

}
