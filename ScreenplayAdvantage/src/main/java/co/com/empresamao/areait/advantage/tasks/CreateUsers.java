package co.com.empresamao.areait.advantage.tasks;

import co.com.empresamao.areait.advantage.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage.*;
import static co.com.empresamao.areait.advantage.utils.Constants.*;

public class CreateUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Waiting.losSegundos(ICN_MENU_USER,15),
                WaitUntil.the(ICN_MENU_USER,isVisible()).forNoMoreThan(15).seconds(),
                Waiting.losSegundos(ICN_MENU_USER,10),
                Click.on(ICN_MENU_USER),
                Click.on(LBL_CREATE_NEW_ACCOUNT),

                WaitUntil.the(TXT_USER_NAME,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(CREATE_SUCCESSFULLY_MESSAGE).into(TXT_USER_NAME),
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
                Click.on(BTN_REGISTER),

                WaitUntil.the(BTN_USER,isVisible()).forNoMoreThan(15).seconds(),
                Click.on( BTN_USER),
                Click.on(BTN_MY_ACCOUNT),
                Click.on(BTN_EDIT_PAYMENT),
                Click.on(BTN_CREDIT_CARD),
                Enter.theValue("123456789012").into(BTN_CARD_NUMBER),
                Waiting.losSegundos(BTN_CVV_NUMBER,15),
                WaitUntil.the(BTN_USER,isVisible()).forNoMoreThan(15).seconds(),
                SendKeys.of("2544").into(BTN_CVV_NUMBER),
                WaitUntil.the(BTN_CVV_NUMBER,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_MM),
                Click.on(BTN_YY),
                Enter.theValue("Mao").into(BTN_CARD_HOLDER),
                Click.on(CHK_PREFERREDPAYMENT),
                Click.on(BTN_SAVE),
                Click.on(BTN_HOME)
        );
    }
    public static CreateUsers createUsers(){

        return instrumented (CreateUsers.class);
    }
}
