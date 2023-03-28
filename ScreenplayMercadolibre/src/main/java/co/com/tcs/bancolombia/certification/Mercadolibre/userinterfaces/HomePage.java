package co.com.tcs.bancolombia.certification.Mercadolibre.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_COOKIES = Target.the("Button cookies").locatedBy("//button[text()='Entendido']");
    public static final Target BTN_CATEGORIES_PRINCIPAL_MENU = Target.the("categories principal menu").located(By.className("nav-menu-categories-link"));
    public static final Target BTN_CATEGORIES = Target.the("categories").locatedBy("//a[text()='{0}']");
    //el selector sería este xpath //a[text()="Hogar y Muebles"] pero como queremos que sea dinamico entre llaves le podemos pasar las variables

    public static final Target BTN_SUB_CATEGORIES = Target.the("Sub categories").locatedBy("//h3[@class='title']");
}
// importante usar él .locateBy junto, porque este método apunta directamente a los xpath y permite recibir hasta 3 parametros