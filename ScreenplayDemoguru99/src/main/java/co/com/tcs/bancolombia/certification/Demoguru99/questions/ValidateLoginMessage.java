package co.com.tcs.bancolombia.certification.Demoguru99.questions;

import co.com.tcs.bancolombia.certification.Demoguru99.userinterfaces.LoginPage;
import co.com.tcs.bancolombia.certification.Demoguru99.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateLoginMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constants.LOGIN_SUCCESSFULLY_MESSAGE.equals(Text.of(LoginPage.LBL_LOGIN_RESULT).viewedBy(actor).asString());
    }
    public static ValidateLoginMessage validateLoginMessage() {
        return new ValidateLoginMessage();
    }
}
