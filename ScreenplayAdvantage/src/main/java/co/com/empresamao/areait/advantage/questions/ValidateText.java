package co.com.empresamao.areait.advantage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.empresamao.areait.advantage.utils.Constants.RESULT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.empresamao.areait.advantage.userinterfaces.HomePage.LBL_RESULT;

public class ValidateText implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WaitUntil.the(LBL_RESULT, isVisible()).forNoMoreThan(10).seconds();
        return RESULT.equals(Text.of(LBL_RESULT).viewedBy(actor).asString());
    }

    public static ValidateText valtext() {
        return new ValidateText();
    }
}
