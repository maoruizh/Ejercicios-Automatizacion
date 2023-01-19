package co.com.empresamao.areait.advantageMobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Mainpage {
    public static final Target ICN_HAMBURGER = Target.the("Hamburger icon")
            .locatedForAndroid(By.id("imageViewMenu"))
            .locatedForIOS(By.id(""));

    public static final Target LBL_LOGIN = Target.the("Label login")
            .locatedForAndroid(By.id("textViewMenuUser"))
            .locatedForIOS(By.id(""));
}
