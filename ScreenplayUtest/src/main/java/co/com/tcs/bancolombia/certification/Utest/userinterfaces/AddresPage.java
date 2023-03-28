package co.com.tcs.bancolombia.certification.Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddresPage {
    public static final Target LBL_ADDRESS_MESSAGE = Target.the("City").located(By.className("sub-title"));
}
