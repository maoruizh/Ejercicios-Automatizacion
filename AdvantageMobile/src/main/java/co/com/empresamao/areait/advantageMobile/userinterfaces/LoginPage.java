package co.com.empresamao.areait.advantageMobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target LBL_CREATEACCOUNT = Target.the("Create account ")
            .locatedForAndroid(By.id("textViewDontHaveAnAccount"))
            .locatedForIOS(By.id(""));
}
