package co.com.empresamao.areait.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Address {
    //public static final Target TXT_CITY = Target.the("City").located(By.id("city"));
    //public static final Target TXT_CITY_SPECIFIC = Target.the("City").located(By.id("(//input[@id=\"city\"])[2]"));
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.id("zip"));
    public static final Target TXT_COUNTRY = Target.the("Country").located(By.name("countryId"));
    public static final Target LST_COUNTRY = Target.the("Country").located(By.xpath("(//span[@class=\"ui-select-choices-row-inner\"])[3]"));
    public static final Target BTN_NEXT_DEVICES = Target.the("Next devices").located(By.xpath("//div[@class=\"pull-right next-step\"]"));
}
