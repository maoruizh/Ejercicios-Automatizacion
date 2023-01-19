package co.com.retoevalart.it.tcs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.retoevalart.it.tcs.userinterfaces.Final.*;
public class Validate implements Question <Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        return HASH.resolveFor(actor).getText().equals("<General>c2fe0e21ce445033My0zLTU4OTUyNQ==df63afbf4da3d4b1");
    }
    public static Question<Boolean> hash() {
        return new Validate();
    }
}
