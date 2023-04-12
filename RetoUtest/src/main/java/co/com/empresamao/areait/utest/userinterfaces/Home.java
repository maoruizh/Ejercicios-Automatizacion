package co.com.empresamao.areait.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target BTN_LOGIN_MENU_USER = Target.the("Login user Button").located(By.xpath("//a[@class=\"unauthenticated-nav-bar__sign-up\"]"));
}
