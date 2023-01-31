package co.com.empresamao.areait.advantage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage.BTN_CREATE_USER_MESSAGE;
import static co.com.empresamao.areait.advantage.utils.Constants.CREATE_SUCCESSFULLY_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCreateUserMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_CREATE_USER_MESSAGE, isVisible()).forNoMoreThan(10).seconds();
        return CREATE_SUCCESSFULLY_MESSAGE.equals(Text.of(BTN_CREATE_USER_MESSAGE).answeredBy(actor).toString());
    }
    public static ValidateCreateUserMessage validateCreateUserMessage(){
        return new ValidateCreateUserMessage();
    }
}
