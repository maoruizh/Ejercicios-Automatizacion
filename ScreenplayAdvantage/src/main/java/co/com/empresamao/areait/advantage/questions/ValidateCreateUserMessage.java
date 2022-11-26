package co.com.empresamao.areait.advantage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage.BTN_CREATE_USER_MESSAGE;
import static co.com.empresamao.areait.advantage.utils.Constants.RESULT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCreateUserMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_CREATE_USER_MESSAGE, isVisible()).forNoMoreThan(10).seconds();
        return RESULT.equals(Text.of(BTN_CREATE_USER_MESSAGE).viewedBy(actor).asString());
    }
    public static ValidateCreateUserMessage validateCreateUserMessage(){
        return new ValidateCreateUserMessage();
    }
}
