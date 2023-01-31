package co.com.empresamao.areait.advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyProductPage {
    public static final Target ICN_LAPTOP_PRODUCTS = Target.the("Seleccionar la categoria de laptops").located(By.id("laptopsImg"));
    public static final Target ICN_LAPTOP = Target.the("Seleccionar una laptop de hewlett packard").located(By.id("9"));
    public static final Target ICN_CHANGE_COLOR = Target.the("Cambiar a color gris").located(By.xpath("(//span[@id='rabbit'])[2]"));
    public static final Target TXT_QUANTITY = Target.the("Clic en el campo cantidad").located(By.name("quantity"));
    public static final Target TXT_QUANTITY2 = Target.the("Cambiar la cantidad").located(By.name("quantity"));
    public static final Target ICN_ADD_TO_CART = Target.the("Adicionar al carro de compras").located(By.name("save_to_cart"));
    public static final Target ICN_MENU_CART = Target.the("Abrir el menu del carro de compras").located(By.id("menuCart"));
    public static final Target ICN_CHECK = Target.the("Cinfirmar la compra").located(By.id("checkOutPopUp"));
    public static final Target ICN_NEXT = Target.the("Boton siguiente").located(By.id("next_btn"));
    public static final Target ICN_CREDITCARD = Target.the("Marcar la tarjeta de credito").located(By.id("pay_now_btn_MasterCredit"));
    public static final Target LBL_SUCCESSFUL_MESSAGE = Target.the("Mensaje que confirma que la compra fue exitosa").located(By.xpath("//*[@id=\"orderPaymentSuccess\"]/h2/span"));

}
