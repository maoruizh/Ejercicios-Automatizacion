package co.com.empresamao.areait.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {
    public static final Target ICN_MENU_USER = Target.the("Ingresar al menu de usuario").located(By.id("menuUserLink"));
    public static final Target LBL_CREATE_NEW_ACCOUNT = Target.the("Crear una nueva cuenta").located(By.xpath("//a[@class='create-new-account ng-scope']"));
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
    public static final Target BTN_USER = Target.the("Boton menu del usuario").located(By.id("menuUserLink")); //este selector creo que se puede cambiar por el primero de todos, verificar
    public static final Target BTN_MY_ACCOUNT = Target.the("Boton cuenta").located(By.xpath("//*[@id=\"loginMiniTitle\"]/label[1]"));
    public static final Target BTN_EDIT_PAYMENT = Target.the("Editar Datos de tarjeta").located(By.xpath("//*[@id=\"myAccountContainer\"]/div[4]/h3/a"));
    public static final Target BTN_CREDIT_CARD = Target.the("Seleccionar tarjeta de credito").located(By.xpath("//*[@id=\"paymentMethod\"]/div/div[1]/div[2]"));
    public static final Target BTN_CARD_NUMBER = Target.the("Numero de la tarjeta").located(By.id("creditCard"));
    public static final Target BTN_CVV_NUMBER = Target.the("Numero de seguridad").located(By.name("cvv_number"));
    public static final Target BTN_MM = Target.the("Mes").located(By.xpath("//*[@id=\"paymentMethod\"]/div/div[3]/sec-form/div[2]/div/sec-view[1]/div/select/option[3]"));
    public static final Target BTN_YY = Target.the("ano").located(By.xpath("//*[@id=\"paymentMethod\"]/div/div[3]/sec-form/div[2]/div/sec-view[2]/div/select/option[7]"));
    public static final Target BTN_CARD_HOLDER = Target.the("Propietario de la tarjeta").located(By.name("cardholder_name"));
    public static final Target CHK_PREFERREDPAYMENT = Target.the("Guardar metodo de pago preferente").located(By.name("save_master_credit"));
    public static final Target BTN_SAVE = Target.the("Guardar cambios").located(By.xpath("(//button[@id=\"save_btnundefined\"])[2]"));
    public static final Target BTN_CREATE_USER_MESSAGE = Target.the("valida el nombre del usuario creado").located(By.id("menuUserLink"));
    public static final Target BTN_HOME = Target.the("Regresar al inicio").located(By.xpath("/html/body/div[3]/nav/a[1]"));

}
