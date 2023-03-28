/*package co.com.tcs.bancolombia.certification.Demoguru99.tasks;
import co.com.tcs.bancolombia.certification.Demoguru99.questions.ValidateHomePageLeftOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import static co.com.tcs.bancolombia.certification.Demoguru99.userinterfaces.HomePage.LST_LEFT_OPTIONS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;

public class HomePageLeftOptions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> leftListOptions = LST_LEFT_OPTIONS.resolveAllFor(actor);
        actor.should(
                GivenWhenThen.seeThat(ValidateHomePageLeftOptions.validate(), containsInAnyOrder("Manager", "New Customer", "Edit Customer", "Delete Customer", "New Account", "Edit Account", "Delete Account", "Mini Statement", "Customised Statement", "Log out")
        ));
    }

    public static HomePageLeftOptions seeLeftOptions(){
        return instrumented(HomePageLeftOptions.class);
    }
}
*/