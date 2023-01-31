package co.com.empresamao.areait.advantage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.empresamao.areait.advantage.userinterfaces.LoginPage.LBL_LOGIN_RESULT;
import static co.com.empresamao.areait.advantage.utils.Constants.LOGIN_SUCCESSFULLY_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateLoginMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WaitUntil.the(LBL_LOGIN_RESULT, isVisible()).forNoMoreThan(10).seconds();
        return LOGIN_SUCCESSFULLY_MESSAGE.equals(Text.of(LBL_LOGIN_RESULT).answeredBy(actor).toString());
    }
    public static ValidateLoginMessage valtext() {
        return new ValidateLoginMessage();
    }
}
