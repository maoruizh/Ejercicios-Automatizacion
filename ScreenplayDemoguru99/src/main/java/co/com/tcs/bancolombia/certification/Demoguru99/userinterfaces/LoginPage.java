package co.com.tcs.bancolombia.certification.Demoguru99.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target ICN_PROJECT_BANK = Target.the("Ingresar al menu de Bank Project").located(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a"));
    public static final Target ICN_LOGIN_USER_ID = Target.the("identificacion de usuario").located(By.name("uid"));
    public static final Target ICN_LOGIN_PASSWORD = Target.the("Ingresar contrasena").located(By.name("password"));
    public static final Target BTN_LOGIN_SIGN_IN = Target.the("Ingresar").located(By.name("btnLogin"));
    public static final Target LBL_LOGIN_RESULT = Target.the("Resultado nombre del login").located(By.className("heading3"));

}
