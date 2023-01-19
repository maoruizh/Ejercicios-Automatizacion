package co.com.retoevalart.it.tcs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoevalart.it.tcs.userinterfaces.UserLoginPage.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle1.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle2.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle3.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle4.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle5.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle6.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle7.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle8.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle9.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle10.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle11.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle12.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle13.*;
import static co.com.retoevalart.it.tcs.userinterfaces.Cycle14.*;

import static co.com.retoevalart.it.tcs.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GeneralTest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(USER).into(USER_TXT),
                SendKeys.of(PASSWORD).into(PASSWORD_TXT),
                Click.on(SEND_BTN),

                Click.on(BTN_74),
                SendKeys.of("843").into(TXT_SUM843),
                Click.on(BTN_SEND_CYCLE2),

                Click.on(BTN_163),
                SendKeys.of("836").into(TXT_SUM836),
                Click.on(BTN_SEND_CYCLE3),

                Click.on(BTN_1),
                SendKeys.of("673").into(TXT_SUM673),
                Click.on(BTN_SEND_CYCLE4),

                Click.on(BTN_191),
                SendKeys.of("807").into(TXT_SUM807),
                Click.on(BTN_SEND_CYCLE5),

                Click.on(BTN_179),
                SendKeys.of("1265").into(TXT_SUM1265),
                Click.on(BTN_SEND_CYCLE6),

                Click.on(BTN_56),
                SendKeys.of("487").into(TXT_SUM487),
                Click.on(BTN_SEND_CYCLE7),

                Click.on(BTN_129),
                SendKeys.of("676").into(TXT_SUM676),
                Click.on(BTN_SEND_CYCLE8),

                Click.on(BTN_33),
                SendKeys.of("950").into(TXT_SUM950),
                Click.on(BTN_SEND_CYCLE9),

                Click.on(BTN_53),
                SendKeys.of("1158").into(TXT_SUM1158),
                Click.on(BTN_SEND_CYCLE10),

                Click.on(BTN_181),
                SendKeys.of("704").into(TXT_SUM704),
                Click.on(BTN_SEND_CYCLE11),

                Click.on(BTN_170),
                SendKeys.of("547").into(TXT_SUM547),
                Click.on(BTN_SEND_CYCLE12),

                Click.on(BTN_126),
                SendKeys.of("998").into(TXT_SUM998),
                Click.on(BTN_SEND_CYCLE13),

                Click.on(BTN_156),
                SendKeys.of("793").into(TXT_SUM793),
                Click.on(BTN_SEND_CYCLE14),

                Click.on(BTN_146),
                SendKeys.of("531").into(TXT_SUM534),//ojo que es 534 pero tengo otro numero para que no se termine la prueba
                Click.on(BTN_SEND_CYCLE15)

        );
    }

    public static GeneralTest userLogin() {
        return instrumented(GeneralTest.class);
    }
}
