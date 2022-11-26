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
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.id("zip"));
    public static final Target TXT_COUNTRY = Target.the("Country").located(By.name("countryId"));




}
