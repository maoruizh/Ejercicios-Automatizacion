package co.com.empresamao.areait.advantage.tasks;

import co.com.empresamao.areait.advantage.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.empresamao.areait.advantage.userinterfaces.LoginPage.*;

public class LoginUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.losSegundos(ICN_LOGIN_MENU_USER, 10),
                WaitUntil.the(ICN_LOGIN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
                Waiting.losSegundos(ICN_LOGIN_MENU_USER, 10),
                Click.on(ICN_LOGIN_MENU_USER),

                WaitUntil.the(TXT_LOGIN_USER_NAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Maoruizh5333").into(TXT_LOGIN_USER_NAME),
                Enter.theValue("Aa$123456789").into(TXT_LOGIN_PASSWORD),
                Click.on(BTN_LOGIN_SIGN_IN)
        );
    }

    public static LoginUser loginUser() {

        return instrumented(LoginUser.class);
    }
}
