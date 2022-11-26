package co.com.empresamao.areait.utest.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.empresamao.areait.utest.userinterfaces.LoginPage.*;

public class LoginUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_LOGIN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_LOGIN_MENU_USER),
                Enter.theValue("Mao").into(TXT_LOGIN_FIRST_NAME),
                Enter.theValue("Ruiz").into(TXT_LOGIN_LAST_NAME),
                Enter.theValue("maoruizh@gmail.co").into(TXT_LOGIN_EMAIL),
                Click.on(TXT_LOGIN_MONTH),
                Click.on(TXT_LOGIN_DAY),
                Click.on(TXT_LOGIN_YEAR),
                Click.on(TXT_LOGIN_LANGUAGE),
                Enter.theValue("Spanish").into(TXT_LOGIN_LANGUAGE),
                Click.on(BTN_NEXT),
                Enter.theValue("Sabaneta, Antioquia, Colombia").into(TXT_CITY),
                Enter.theValue("055450").into(TXT_POSTAL_CODE),
                Enter.theValue("Colombia").into(TXT_COUNTRY)


        );
    }
    public static LoginUsers loginUsers() {

        return instrumented(LoginUsers.class);
    }
}
