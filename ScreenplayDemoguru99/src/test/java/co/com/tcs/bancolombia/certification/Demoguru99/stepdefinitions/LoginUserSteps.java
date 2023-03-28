
package co.com.tcs.bancolombia.certification.Demoguru99.stepdefinitions;

import co.com.tcs.bancolombia.certification.Demoguru99.models.LoginUserModel;
import co.com.tcs.bancolombia.certification.Demoguru99.questions.ValidateHomePageLeftOptions;
import co.com.tcs.bancolombia.certification.Demoguru99.tasks.LoginUser;
import co.com.tcs.bancolombia.certification.Demoguru99.utils.Constants;
import co.com.tcs.bancolombia.certification.Demoguru99.utils.MyDriverWeb;
//import com.co.bancolombia.certification.Demoguru99.questions.ValidateHomePageLeftOptions;
import co.com.tcs.bancolombia.certification.Demoguru99.questions.ValidateLoginMessage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserSteps {

    @Given("^I want to go to the login page of demoguru$")
    public void iWantToGoToTheLoginPageOfDemoguru()  {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(Constants.ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriverWeb.web().inThePage(Constants.URL)));
    }

    @When("^I enter the information to login a user$")
    public void iEnterTheInformationToLoginAUser(List<LoginUserModel> userModelList) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.loginUser(userModelList));
    }

    @Then("^I validate the correct user login$")
    public void iValidateTheCorrectUserLogin() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLoginMessage.validateLoginMessage()));
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateHomePageLeftOptions.verify(), Matchers.is(true)));
    }
}
