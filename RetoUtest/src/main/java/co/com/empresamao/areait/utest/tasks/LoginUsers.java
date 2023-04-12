package co.com.empresamao.areait.utest.tasks;

import co.com.empresamao.areait.utest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.BTN_LOGIN_MENU_USER),

                SendKeys.of("Mao").into(Personal.TXT_LOGIN_FIRST_NAME),
                SendKeys.of("Ruiz").into(Personal.TXT_LOGIN_LAST_NAME),
                SendKeys.of("maoruizh@gmail.co").into(Personal.TXT_LOGIN_EMAIL),
                Click.on(Personal.TXT_LOGIN_MONTH),
                Click.on(Personal.TXT_LOGIN_DAY),
                Click.on(Personal.TXT_LOGIN_YEAR),
                Click.on(Personal.TXT_LOGIN_LANGUAGE),
                SendKeys.of("Spanish").into(Personal.TXT_LOGIN_LANGUAGE),
                Click.on(Personal.BTN_NEXT),

                Enter.theValue("Sabaneta, Antioquia, Colombia").into(Address.TXT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(Address.TXT_CITY),
                SendKeys.of(Keys.ENTER).into(Address.TXT_CITY),
                Enter.theValue("055450").into(Address.TXT_POSTAL_CODE),
                Click.on(Address.TXT_COUNTRY),
                Click.on(Address.LST_COUNTRY),
                //Enter.theValue("Colombia").into(TXT_COUNTRY),
                Click.on(Address.BTN_NEXT_DEVICES),

                Click.on(Devices.BTN_SO),
                Click.on(Devices.LST_SO),
                Click.on(Devices.BTN_VERSION),
                Click.on(Devices.LST_VERSION),
                Click.on(Devices.BTN_OS_LANGUAGE),
                Click.on(Devices.LST_OS_LANGUAGE),
                Click.on(Devices.BTN_MOBILE_DEVICE),
                Click.on(Devices.LST_MOBILE_DEVICE),
                WaitUntil.the(Devices.BTN_MODEL, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Devices.BTN_MODEL),
                Click.on(Devices.LST_MODEL),
                WaitUntil.the(Devices.BTN_OPERATING_SYSTEM, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Devices.BTN_OPERATING_SYSTEM),
                Click.on(Devices.LST_OPERATING_SYSTEM),
                Click.on(Devices.BTN_NEXT_LAST_STEP),

                Enter.theValue("Asdfghj1234567*4").into(Complete.TXT_PASSWORD),
                Enter.theValue("Asdfghj1234567*4").into(Complete.TXT_CONFIRM_PASSWORD),
                Click.on(Complete.CHK_TERM_OF_USE),
                Click.on(Complete.CHK_PRIVACY_SETTING),
                Click.on(Complete.BTN_COMPLETE_SETUP)
        );
    }

    public static LoginUsers loginUsers() {

        return instrumented(LoginUsers.class);
    }
}
