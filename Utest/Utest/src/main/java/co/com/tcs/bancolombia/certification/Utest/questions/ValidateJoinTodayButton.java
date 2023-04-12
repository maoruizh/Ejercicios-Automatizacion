package co.com.tcs.bancolombia.certification.Utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.bancolombia.certification.Utest.userinterfaces.PersonalPage.*;

public class ValidateJoinTodayButton implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return BTN_JOIN_TODAY.resolveAllFor(actor).get(0).getText();
    }

    public static ValidateJoinTodayButton isPresent() {
        return new ValidateJoinTodayButton();
    }
}
