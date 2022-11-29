package co.com.empresamao.areait.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices {
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
}
