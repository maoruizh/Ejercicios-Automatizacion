package com.co.bancolombia.certification.Demoguru99.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.co.bancolombia.certification.Demoguru99.userinterfaces.LoginPage.LBL_LOGIN_RESULT;
import static com.co.bancolombia.certification.Demoguru99.utils.Constants.LOGIN_SUCCESSFULLY_MESSAGE;


public class ValidateLoginMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LOGIN_SUCCESSFULLY_MESSAGE.equals(Text.of(LBL_LOGIN_RESULT).viewedBy(actor).asString());
    }
    public static ValidateLoginMessage validateLoginMessage() {
        return new ValidateLoginMessage();
    }
}
