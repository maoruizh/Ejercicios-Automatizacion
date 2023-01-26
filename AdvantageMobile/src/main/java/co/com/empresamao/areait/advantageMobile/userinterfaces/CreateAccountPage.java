package co.com.empresamao.areait.advantageMobile.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage {

    public static final Target LBL_CREATEACCOUNT = Target.the("Create account ")
            .locatedForAndroid(By.id("textViewDontHaveAnAccount"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_USERNAME = Target.the("Username")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));
    public static final Target TXT_EMAIL = Target.the("Email")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_PASSWORD = Target.the("Password")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_CONFIRMPASSWORD = Target.the("ConfirmPassword")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_FIRSTNAME = Target.the("Firstname")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_LASTNAME = Target.the("Lastname")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_PHONE = Target.the("Phone")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_COUNTRY_LIST = Target.the("Country")
            .locatedForAndroid(By.id("textViewCountries"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_COUNTRY_ARGENTINA = Target.the("Country_Argentina")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_STATE = Target.the("State")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_ADDRESS = Target.the("Address")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_CITY = Target.the("City")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_ZIP = Target.the("Zip")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_REGISTER = Target.the("Register")
            .locatedForAndroid(By.id("buttonRegister"))
            .locatedForIOS(By.id(""));
}
