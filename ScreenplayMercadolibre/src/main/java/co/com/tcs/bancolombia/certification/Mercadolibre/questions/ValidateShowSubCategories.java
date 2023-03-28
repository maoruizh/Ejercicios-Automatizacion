package co.com.tcs.bancolombia.certification.Mercadolibre.questions;

import co.com.tcs.bancolombia.certification.Mercadolibre.userinterfaces.HomePage;
import co.com.tcs.bancolombia.certification.Mercadolibre.utils.CSVUtilities;
import co.com.tcs.bancolombia.certification.Mercadolibre.utils.OperationOnList;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.ArrayList;
import java.util.List;

import static co.com.tcs.bancolombia.certification.Mercadolibre.utils.Constants.NAME_CATEGORY;

public class ValidateShowSubCategories implements Question<Boolean> {

    private List<String> listSubCategoriesFromPage = new ArrayList<>(); //esto se hace para recibir la lista que llega del facade y convertir esa lista en una de tipo string
    // para poderla comparar contra otro sting más adelante en este caso el string de un csv
    private List<String> listSubCategoriesFromCSV = new ArrayList<>();//esto se hace para recibir la lista que llega del CSV y poderla poderla comparar
    // contra la lista que llega del WebElementFacade.

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> subCategoriesFromPage = HomePage.BTN_SUB_CATEGORIES.resolveAllFor(actor);
        //El WebElementFacade y elresolveAllFor se usa para que él tome una lista de todas las subcategorias (Aca capture los elementos)
        listSubCategoriesFromPage = OperationOnList.getListSubCategories(subCategoriesFromPage, listSubCategoriesFromPage);
        //con esta línea hago que dentro de la listsubCategoriesFromPage tengo la lista de string para comprobarlas (aca le dije que en una utilidad e hiciera la accion)

        listSubCategoriesFromCSV = CSVUtilities.getListSubcategories(actor.recall(NAME_CATEGORY));// Esto indica que la lista que viene del CSV va a llamar un método que está en la clase CSVUtilities
        //y va a obtener los datos que están en esa lista con el getListSubcategories

        //Ahora vamos a comparar lo que llega desde la PAGE contra lo que llega del CSV


        System.out.println("*From Page*");
        for (String string : listSubCategoriesFromPage) {
            System.out.println(string);
        }

        System.out.println("********************************************");

        System.out.println("*From CSV*");
        for (String string : listSubCategoriesFromCSV) {
            System.out.println(string);
        }
        return listSubCategoriesFromPage.equals(listSubCategoriesFromCSV);
    }

    public static ValidateShowSubCategories isPresent() {

        return new ValidateShowSubCategories();
    }
}