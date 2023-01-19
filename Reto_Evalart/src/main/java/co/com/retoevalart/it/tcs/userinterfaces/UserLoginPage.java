package co.com.retoevalart.it.tcs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserLoginPage {
    public static final Target USER_TXT = Target.the("Campo de texto para usuario").located(By.name("username"));
    public static final Target PASSWORD_TXT = Target.the("Campo de texto para contraseña").located(By.name("password"));
    public static final Target SEND_BTN = Target.the("Botón para inicio de sesión").locatedBy("//button[@type='submit']");
}
