package co.com.empresamao.areait.advantageMobile.tasks;

import co.com.empresamao.areait.advantageMobile.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.com.empresamao.areait.advantageMobile.userinterfaces.Mainpage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Main implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Mainpage.ICN_HAMBURGER),
                Click.on(Mainpage.LBL_LOGIN),
                Click.on(LoginPage.LBL_CREATEACCOUNT)
        );


    }
    public static Main main(){
        return instrumented(Main.class);
    }
}
