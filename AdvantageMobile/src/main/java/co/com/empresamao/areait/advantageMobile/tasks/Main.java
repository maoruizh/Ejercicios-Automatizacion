package co.com.empresamao.areait.advantageMobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.empresamao.areait.advantageMobile.userinterfaces.Mainpage;
import co.com.empresamao.areait.advantageMobile.utils.Constants;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Main implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Mainpage.ICN_HAMBURGER),
                Click.on(Mainpage.LBL_LOGIN),
                Enter.theValue(Constants.USER_NAME).into(Mainpage.TXT_USER_NAME),
                Enter.theValue(Constants.PASSWORD).into(Mainpage.TXT_PASSWORD),
                Click.on(Mainpage.BTN_LOGIN)
        );

    }
    public static Main main(){
        return instrumented(Main.class);
    }
}
