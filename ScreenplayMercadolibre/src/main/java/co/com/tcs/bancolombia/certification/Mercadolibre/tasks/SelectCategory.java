package co.com.tcs.bancolombia.certification.Mercadolibre.tasks;

import co.com.tcs.bancolombia.certification.Mercadolibre.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tcs.bancolombia.certification.Mercadolibre.userinterfaces.HomePage.BTN_CATEGORIES;
import static co.com.tcs.bancolombia.certification.Mercadolibre.utils.Constants.NAME_CATEGORY;

public class SelectCategory implements Task {

    String category; //como se está declarando se debe de generar el constructor

    public SelectCategory(String category) {
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_COOKIES),
                Click.on(HomePage.BTN_CATEGORIES_PRINCIPAL_MENU),
                Click.on(BTN_CATEGORIES.of(category))//como esperamos una variable le decimos .of y asi ya le podemos pasar el parametro que es category
                //Scroll.to() esto me sirve para hacer scroll a un elemento en particular.
        );
        actor.remember(NAME_CATEGORY, category);
    }

    public static SelectCategory selectCategory(String category) { //aca le decimos que vamos a recibir un string porque este viene del outline category del feature
        return Tasks.instrumented(SelectCategory.class, category); // aca le pasamos el nombre de la variable category y por ende se declara en la línea 11
    }
}
