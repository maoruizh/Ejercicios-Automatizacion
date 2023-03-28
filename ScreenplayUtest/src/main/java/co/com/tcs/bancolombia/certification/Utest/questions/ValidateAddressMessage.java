package co.com.tcs.bancolombia.certification.Utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.tcs.bancolombia.certification.Utest.userinterfaces.AddresPage.*;
import static co.com.tcs.bancolombia.certification.Utest.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateAddressMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_ADDRESS_MESSAGE, isVisible()).forNoMoreThan(10).seconds();
        return STEP2_ADDRES_MESSAGE.equals(Text.of(LBL_ADDRESS_MESSAGE).viewedBy(actor).asString());
    }

    public static ValidateAddressMessage validateAddressMessage() {
        return new ValidateAddressMessage();
    }
}
