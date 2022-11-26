package co.com.empresamao.areait.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target ICN_LOGIN_MENU_USER = Target.the("Ingresar al menu de usuario").located(By.id("menuUserLink"));
    public static final Target TXT_LOGIN_USER_NAME = Target.the("Nombre de usuario").located(By.name("username"));
    public static final Target TXT_LOGIN_PASSWORD = Target.the("Ingresar contrasena").located(By.name("password"));
    public static final Target BTN_LOGIN_SIGN_IN = Target.the("Ingresar").located(By.id("sign_in_btnundefined"));
    public static final Target LBL_LOGIN_RESULT = Target.the("Resultado nombre del login").located(By.xpath("(//span[contains(text(),'Maoruizh')])[2]"));

}
