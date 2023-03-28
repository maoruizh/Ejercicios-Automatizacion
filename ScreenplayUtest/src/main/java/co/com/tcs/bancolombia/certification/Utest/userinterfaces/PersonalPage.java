package co.com.tcs.bancolombia.certification.Utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage {
    public static final Target BTN_JOIN_TODAY = Target.the("join today Button").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target TXT_LOGIN_FIRST_NAME = Target.the("User first name").located(By.id("firstName"));
    public static final Target TXT_LOGIN_LAST_NAME = Target.the("User last name").located(By.id("lastName"));
    public static final Target TXT_LOGIN_EMAIL = Target.the("User Email").located(By.id("email"));
    public static final Target TXT_LOGIN_MONTH = Target.the("Birth Month").located(By.xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target TXT_LOGIN_DAY = Target.the("Birth Day").located(By.xpath("//*[@id=\"birthDay\"]/option[8]"));
    public static final Target TXT_LOGIN_YEAR = Target.the("Birth Year").located(By.xpath("//*[@id=\"birthYear\"]/option[6]"));
    public static final Target TXT_LOGIN_LANGUAGE = Target.the("Languaje").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BTN_NEXT = Target.the("Next Step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
