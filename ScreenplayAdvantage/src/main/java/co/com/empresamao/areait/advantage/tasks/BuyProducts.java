package co.com.empresamao.areait.advantage.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.empresamao.areait.advantage.userinterfaces.BuyProductPage.*;

public class BuyProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ICN_LAPTOP_PRODUCTS, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_LAPTOP_PRODUCTS),
                Click.on(ICN_LAPTOP),
                Click.on(ICN_CHANGE_COLOR),
                Click.on(TXT_QUANTITY),
                Enter.theValue("4").into(TXT_QUANTITY2),
                Click.on(ICN_ADD_TO_CART),
                Click.on(ICN_MENU_CART),
                WaitUntil.the(ICN_CHECK, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_CHECK),
                WaitUntil.the(ICN_NEXT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_NEXT),
                WaitUntil.the(ICN_CREDITCARD, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_CREDITCARD)
        );
    }

    public static BuyProducts buyProducts() {

        return instrumented(BuyProducts.class);
    }
}
