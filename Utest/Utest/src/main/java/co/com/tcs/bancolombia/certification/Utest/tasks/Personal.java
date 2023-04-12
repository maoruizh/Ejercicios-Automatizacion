package co.com.tcs.bancolombia.certification.Utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import static co.com.tcs.bancolombia.certification.Utest.userinterfaces.PersonalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Personal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOIN_TODAY),
                SendKeys.of("Mao").into(TXT_LOGIN_FIRST_NAME),
                SendKeys.of("Ruiz").into(TXT_LOGIN_LAST_NAME),
                SendKeys.of("maoruizh@gmail.co").into(TXT_LOGIN_EMAIL),
                Click.on(TXT_LOGIN_MONTH),
                Click.on(TXT_LOGIN_DAY),
                Click.on(TXT_LOGIN_YEAR),
                Click.on(TXT_LOGIN_LANGUAGE),
                SendKeys.of("Spanish").into(TXT_LOGIN_LANGUAGE),
                Click.on(BTN_NEXT)
        );

    }

    public static Personal personal(){
        return instrumented(Personal.class);
    }
}
