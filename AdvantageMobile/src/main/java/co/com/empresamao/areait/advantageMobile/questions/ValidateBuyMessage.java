package co.com.empresamao.areait.advantageMobile.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.empresamao.areait.advantageMobile.utils.Constants.*;
import static co.com.empresamao.areait.advantageMobile.userinterfaces.BuyProductPage.*;

public class ValidateBuyMessage implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_SUCCESSFUL_MESSAGE, isVisible()).forNoMoreThan(10).seconds();
        return BUY_SUCCESSFULLY.equals(Text.of(LBL_SUCCESSFUL_MESSAGE).viewedBy(actor).asString());
    }

    public static ValidateBuyMessage validateBuyMessage() {
        return new ValidateBuyMessage();
    }
}