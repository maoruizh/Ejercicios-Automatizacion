package co.com.empresamao.areait.advantage.interactions;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import java.time.Duration;

public class Waiting implements Interaction {
    private Target objetivos;
    private int seconds;

    public Waiting(Target objetivos, int seconds) {
        this.objetivos = objetivos;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(objetivos.waitingForNoMoreThan(Duration.ofSeconds(seconds))).isDisplayed());
    }

    public static Waiting losSegundos (Target objetivos, int seconds){
        return Tasks.instrumented(Waiting.class,objetivos,seconds);
    }
}
