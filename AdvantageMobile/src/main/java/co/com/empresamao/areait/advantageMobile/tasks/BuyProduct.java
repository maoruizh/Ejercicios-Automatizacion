package co.com.empresamao.areait.advantageMobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.empresamao.areait.advantageMobile.userinterfaces.BuyProductPage.*;

public class BuyProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICN_LAPTOP_PRODUCTS),
                Click.on(ICN_LAPTOP),
                Click.on(BTN_CHANGE_COLOR),
                Click.on(BTN_CHANGE_COLOR_GRAY),
                Click.on(BTN_QUANTITY),
                Click.on(BTN_QUANTITY2),
                Click.on(BTN_QUANTITY_APPLY),
                Click.on(BTN_ADD_TO_CART),
                Click.on(ICN_MENU_CART),
                Click.on(BTN_CHECK_PAY),
                Click.on(BTN_PAY_NOW)
        );
    }
    public static BuyProduct buyProduct (){
        return instrumented(BuyProduct.class);
    }
}

