package co.com.empresamao.areait.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Complete {
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target CHK_TERM_OF_USE = Target.the("Term of use").located(By.id("termOfUse"));
    public static final Target CHK_PRIVACY_SETTING = Target.the("Privacy setting").located(By.id("privacySetting"));
    public static final Target BTN_COMPLETE_SETUP = Target.the("Complete setup").located(By.xpath("//div[@class=\"pull-right next-step\"]"));

}
