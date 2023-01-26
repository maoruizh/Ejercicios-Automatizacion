package co.com.empresamao.areait.advantageMobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Mainpage {
    public static final Target ICN_HAMBURGER = Target.the("Hamburger icon")
            .locatedForAndroid(By.id("imageViewMenu"))
            .locatedForIOS(By.id(""));

    public static final Target LBL_LOGIN = Target.the("Label login")
            .locatedForAndroid(By.id("textViewMenuUser"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_USER_NAME = Target.the("User Name")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_PASSWORD = Target.the("Password")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_LOGIN = Target.the("Login")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button"))
            .locatedForIOS(By.xpath(""));

}
