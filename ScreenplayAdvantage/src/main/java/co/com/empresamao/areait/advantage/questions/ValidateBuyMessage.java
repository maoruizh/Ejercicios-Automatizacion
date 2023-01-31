package co.com.empresamao.areait.advantage.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.empresamao.areait.advantage.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.empresamao.areait.advantage.userinterfaces.BuyProductPage.LBL_SUCCESSFUL_MESSAGE;

public class ValidateBuyMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_SUCCESSFUL_MESSAGE, isVisible()).forNoMoreThan(10).seconds();
        return BUY_SUCCESSFULLY_MESSAGE.equals(Text.of(LBL_SUCCESSFUL_MESSAGE).answeredBy(actor).toString());
    }
    public static ValidateBuyMessage validateBuyMessage(){
        return new ValidateBuyMessage();
    }
}
