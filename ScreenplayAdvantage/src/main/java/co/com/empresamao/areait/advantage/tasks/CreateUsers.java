package co.com.empresamao.areait.advantage.tasks;

import co.com.empresamao.areait.advantage.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.empresamao.areait.advantage.userinterfaces.HomePage.*;
import static co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage.*;

public class CreateUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.losSegundos(ICN_MENU_USER,10),
                WaitUntil.the(ICN_MENU_USER,isVisible()).forNoMoreThan(15).seconds(),
                Waiting.losSegundos(ICN_MENU_USER,10),
                Click.on(ICN_MENU_USER),
                Click.on(LBL_CREATE_NEW_ACCOUNT),

                WaitUntil.the(TXT_USER_NAME,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Maoruizh411").into(TXT_USER_NAME),
                Enter.theValue("mao@ruiz.com").into(TXT_USER_EMAIL),
                Enter.theValue("Aa$123456789").into(TXT_PASSWORD),
                Enter.theValue("Aa$123456789").into(TXT_CONFIRM_PASSWORD),
                Enter.theValue("Mao").into(TXT_FIRST_NAME),
                Enter.theValue("Ruiz").into(TXT_LAST_NAME),
                Enter.theValue("3054896324").into(TXT_PHONE_NUMBER),
                Enter.theValue("Medellin").into(TXT_CITY),
                Enter.theValue("Calle 65 sur # 39 235").into(TXT_ADDRESS),
                Enter.theValue("Antioquia").into(TXT_STATE),
                Enter.theValue("055413").into(TXT_POSTAL_CODE),
                Click.on(CHK_I_AGREE),
                Click.on(BTN_REGISTER)
        );
    }
    public static CreateUsers createUsers(){

        return instrumented (CreateUsers.class);
    }
}
