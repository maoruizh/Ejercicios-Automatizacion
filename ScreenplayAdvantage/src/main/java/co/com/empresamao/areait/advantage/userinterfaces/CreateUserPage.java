package co.com.empresamao.areait.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {
    public static final Target TXT_USER_NAME = Target.the("Nombre de usuario").located(By.name("usernameRegisterPage"));
    public static final Target TXT_USER_EMAIL = Target.the("Email del usuario").located(By.name("emailRegisterPage"));
    public static final Target TXT_PASSWORD= Target.the("Contrasena del usuario").located(By.name("passwordRegisterPage"));
    public static final Target TXT_CONFIRM_PASSWORD= Target.the("Confirmacion de la contrasena").located(By.name("confirm_passwordRegisterPage"));
    public static final Target TXT_FIRST_NAME= Target.the("Primer nombre").located(By.name("first_nameRegisterPage"));
    public static final Target TXT_LAST_NAME= Target.the("Apellido").located(By.name("last_nameRegisterPage"));
    public static final Target TXT_PHONE_NUMBER= Target.the("Numero telefonico").located(By.name("phone_numberRegisterPage"));
    public static final Target LST_COUNTRY = Target.the("Pais").located(By.name("countryListboxRegisterPage"));
    public static final Target TXT_CITY= Target.the("Ciudad").located(By.name("cityRegisterPage"));
    public static final Target TXT_ADDRESS= Target.the("Direccion").located(By.name("addressRegisterPage"));
    public static final Target TXT_STATE= Target.the("Estado").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target TXT_POSTAL_CODE= Target.the("Codigo postal").located(By.name("postal_codeRegisterPage"));
    public static final Target CHK_I_AGREE= Target.the("Estoy de acuerdo").located(By.name("i_agree"));
    public static final Target BTN_REGISTER= Target.the("Registrar").located(By.id("register_btnundefined"));
}
