package com.co.bancolombia.certification.Demoguru99.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.bancolombia.certification.Demoguru99.userinterfaces.LoginPage.*;
import static com.co.bancolombia.certification.Demoguru99.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICN_PROJECT_BANK),
                Click.on(ICN_LOGIN_USER_ID),
                Enter.theValue(USERID).into(ICN_LOGIN_USER_ID),
                Click.on(ICN_LOGIN_PASSWORD),
                Enter.theValue(PASSWORD).into(ICN_LOGIN_PASSWORD),
                Click.on(BTN_LOGIN_SIGN_IN)
        );
    }

    public static LoginUser loginUser() {

        return instrumented(LoginUser.class);
    }
}

