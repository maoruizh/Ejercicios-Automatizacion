package co.com.empresamao.areait.advantageMobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class BuyProductPage {
    public static final Target ICN_LAPTOP_PRODUCTS = Target.the("Seleccionar la categoria de laptops")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"))
            .locatedForIOS(By.xpath(""));

    public static final Target ICN_LAPTOP = Target.the("Seleccionar una laptop de hewlett packard")
            .locatedForAndroid(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_CHANGE_COLOR = Target.the("Cambiar a color gris")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_CHANGE_COLOR_GRAY = Target.the("Cambiar a color gris")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_QUANTITY = Target.the("Clic en el campo cantidad")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_QUANTITY2 = Target.the("Cambiar la cantidad")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_QUANTITY_APPLY = Target.the("Cambiar la cantidad")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[3]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_ADD_TO_CART = Target.the("Adicionar al carro de compras")
            .locatedForAndroid(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"))
            .locatedForIOS(By.xpath(""));

    public static final Target ICN_MENU_CART = Target.the("Abrir el menu del carro de compras")
            .locatedForAndroid(By.xpath("(//android.widget.ImageView[@content-desc=\"Cart access\"])[1]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_CHECK_PAY = Target.the("Cinfirmar la compra")
            .locatedForAndroid(By.xpath("//androidx.drawerlayout.widget.DrawerLayout[@content-desc=\"Cart Details\"]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_PAY_NOW = Target.the("Boton siguiente")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.Button"))
            .locatedForIOS(By.xpath(""));

    public static final Target LBL_SUCCESSFUL_MESSAGE = Target.the("Mensaje que confirma que la compra fue exitosa")
            .locatedForAndroid(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]"))
            .locatedForIOS(By.xpath(""));
}
