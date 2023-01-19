package co.com.retoevalart.it.tcs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cycle3 {
    public static final Target BTN_1 = Target.the("numero").located(By.xpath("/html/body/div[3]/form/div/button[14]"));
    public static final Target TXT_SUM673 = Target.the("Suma alrededor").located( By.xpath("/html/body/div[4]/div/div/div[2]/div/div/form/input"));
    public static final Target BTN_SEND_CYCLE4 = Target.the("Boton de enviar").located(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/form/button"));
}
