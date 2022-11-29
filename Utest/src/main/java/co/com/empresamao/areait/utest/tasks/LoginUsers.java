package co.com.empresamao.areait.utest.tasks;


import co.com.empresamao.areait.utest.userinterfaces.LoginPage;
import javafx.scene.control.Tab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
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
                //Enter.theValue("Sabaneta, Antioquia, Colombia").into(TXT_CITY),
                Enter.theValue("055450").into(TXT_POSTAL_CODE),
                Click.on(TXT_COUNTRY),
                Click.on(LST_COUNTRY),
                //Enter.theValue("Colombia").into(TXT_COUNTRY),
                Click.on(BTN_NEXT_DEVICES),
                Click.on(BTN_SO),
                Click.on(LST_SO),
                Click.on(BTN_VERSION),
                Click.on(LST_VERSION),
                Click.on(BTN_OS_LANGUAGE),
                Click.on(LST_OS_LANGUAGE),
                Click.on(BTN_MOBILE_DEVICE),
                Click.on(LST_MOBILE_DEVICE),
                WaitUntil.the(BTN_MODEL, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_MODEL),
                Click.on(LST_MODEL),
                WaitUntil.the(BTN_OPERATING_SYSTEM, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_OPERATING_SYSTEM),
                Click.on(LST_OPERATING_SYSTEM),
                Click.on(BTN_NEXT_LAST_STEP),
                Enter.theValue("Asdfghj1234567*4").into(TXT_PASSWORD),
                Enter.theValue("Asdfghj1234567*4").into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_TERM_OF_USE),
                Click.on(CHK_PRIVACY_SETTING),
                Click.on(BTN_COMPLETE_SETUP)

        );
    }

    public static LoginUsers loginUsers() {

        return instrumented(LoginUsers.class);
    }
}
