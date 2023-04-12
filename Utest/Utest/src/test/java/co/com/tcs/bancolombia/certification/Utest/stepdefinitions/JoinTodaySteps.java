package co.com.tcs.bancolombia.certification.Utest.stepdefinitions;
import co.com.tcs.bancolombia.certification.Utest.questions.ValidateAddressMessage;
import co.com.tcs.bancolombia.certification.Utest.questions.ValidateJoinTodayButton;
import co.com.tcs.bancolombia.certification.Utest.tasks.Personal;
import co.com.tcs.bancolombia.certification.Utest.utils.Constants;
import co.com.tcs.bancolombia.certification.Utest.userinterfaces.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class JoinTodaySteps {

    UtestPage page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(Constants.ACTOR);
    }

    @Given("^That the user go to the home page of Utest$")
    public void thatTheUserGoToTheHomePageOfUtest() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }

    @Then("^The user should validate that if he sees the (.*) button$")
    public void theUserShouldValidateThatIfHeSeesTheJoinTodayButton(String nameOption) {
        theActorInTheSpotlight().should(seeThat(ValidateJoinTodayButton.isPresent(), Matchers.equalTo(nameOption)));
    }
    @When("^I enter the personal information to personal form$")
    public void iEnterThePersonalInformationToPersonalForm() {
        theActorInTheSpotlight().attemptsTo(Personal.personal());
    }

    @Then("^I validate the the information form is ok$")
    public void iValidateTheTheInformationFormIsOk() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAddressMessage.validateAddressMessage()));
    }
}



