package co.com.tcs.bancolombia.certification.Demoguru99.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.assertj.core.api.SoftAssertions;

import static co.com.tcs.bancolombia.certification.Demoguru99.userinterfaces.HomePage.LST_LEFT_OPTIONS;

public class ValidateHomePageLeftOptions implements Question<Boolean> {
    private final SoftAssertions validate = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        validate.assertThatObject(LST_LEFT_OPTIONS.resolveFor(actor).getText()).isNotNull();
        return true;
    }

    public static Question<Boolean> verify() {
        return new ValidateHomePageLeftOptions();
    }
}

//esta validacion se hace demuestra de camilo posada pero aun no la entiendo. Quiero hacerla con las validaciones como las de mercado libre
//y tomando datos desde un csv