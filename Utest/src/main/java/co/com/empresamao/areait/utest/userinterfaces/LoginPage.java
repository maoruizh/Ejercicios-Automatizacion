package co.com.empresamao.areait.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target BTN_LOGIN_MENU_USER = Target.the("Ingresar al menu de usuario").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target TXT_LOGIN_FIRST_NAME = Target.the("User first name").located(By.id("firstName"));
    public static final Target TXT_LOGIN_LAST_NAME = Target.the("User last name").located(By.id("lastName"));
    public static final Target TXT_LOGIN_EMAIL = Target.the("User Email").located(By.id("email"));
    public static final Target TXT_LOGIN_MONTH = Target.the("Birth Month").located(By.xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target TXT_LOGIN_DAY = Target.the("Birth Day").located(By.xpath("//*[@id=\"birthDay\"]/option[8]"));
    public static final Target TXT_LOGIN_YEAR = Target.the("Birth Year").located(By.xpath("//*[@id=\"birthYear\"]/option[6]"));
    public static final Target TXT_LOGIN_LANGUAGE = Target.the("Languaje").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BTN_NEXT = Target.the("Next Step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target TXT_CITY = Target.the("City").located(By.id("city"));
    public static final Target TXT_CITY_SPECIFIC = Target.the("City").located(By.id("(//input[@id=\"city\"])[2]"));
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.id("zip"));
    public static final Target TXT_COUNTRY = Target.the("Country").located(By.name("countryId"));
    public static final Target LST_COUNTRY = Target.the("Country").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[3]"));
    public static final Target BTN_NEXT_DEVICES = Target.the("Next devices").located(By.xpath("//div[@class=\"pull-right next-step\"]"));
    public static final Target BTN_SO = Target.the("Operating System").located(By.xpath("//span[@class=\"ui-select-match-text pull-left ui-select-allow-clear\"]"));
    public static final Target LST_SO = Target.the("Operating System list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target BTN_VERSION = Target.the("Operating System button").located(By.name("osVersionId"));
    public static final Target LST_VERSION = Target.the("Version list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[27]"));
    public static final Target BTN_OS_LANGUAGE = Target.the("Language OS button ").located(By.name("osLanguageId"));
    public static final Target LST_OS_LANGUAGE = Target.the("Language OS list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[38]"));
    public static final Target BTN_MOBILE_DEVICE = Target.the("Mobile device button ").located(By.name("handsetMakerId"));
    public static final Target LST_MOBILE_DEVICE = Target.the("Mobile device list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[38]"));
    public static final Target BTN_MODEL = Target.the("Model button ").located(By.name("handsetModelId"));
    public static final Target LST_MODEL = Target.the("Model list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[491]"));
    public static final Target BTN_OPERATING_SYSTEM = Target.the("Operating System button ").located(By.name("handsetOSId"));
    public static final Target LST_OPERATING_SYSTEM = Target.the("Operating Syste list").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target BTN_NEXT_LAST_STEP = Target.the("Last Step").located(By.xpath("//div[@class=\"pull-right next-step\"]"));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target CHK_TERM_OF_USE = Target.the("Term of use").located(By.id("termOfUse"));
    public static final Target CHK_PRIVACY_SETTING = Target.the("Privacy setting").located(By.id("privacySetting"));
    public static final Target BTN_COMPLETE_SETUP = Target.the("Complete setup").located(By.xpath("//div[@class=\"pull-right next-step\"]"));

}
