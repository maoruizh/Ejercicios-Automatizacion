import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Advantage {
    private WebDriver driver; // creamos el web driver

    @Before //esto es para que antes de que cargue la clase haga algo.
    public void setup() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.manage().window().maximize();
    }

    @Test // estas son las acciones
    public void createUser() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("menuUserLink")).click(); // esta es la manera de como se busca elemento en la página //a[@id='menuUserLink']
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Maoruizh");
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys("Aa$123456789");
        Thread.sleep(500);
        driver.findElement(By.id("sign_in_btnundefined")).click();
        Thread.sleep(3000);
    /*driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click(); // esta es la manera de como se busca el elemento en la pagina //a[@class='create-new-account ng-scope']
        Thread.sleep(4000);
        driver.findElement(By.name("usernameRegisterPage")).sendKeys("Maoruizhllu11");
        Thread.sleep(500);
        driver.findElement(By.name("emailRegisterPage")).sendKeys("prueba3@prueba1521111111.com");
        Thread.sleep(500);
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("Aa$123456789");
        Thread.sleep(500);
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Aa$123456789");
        Thread.sleep(500);
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Mao");
        Thread.sleep(500);
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Ruiz");
        Thread.sleep(500);
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3054896324");
        Thread.sleep(500);
        driver.findElement(By.name("cityRegisterPage")).sendKeys("Medellin");
        Thread.sleep(500);
        driver.findElement(By.name("addressRegisterPage")).sendKeys("Calle 65 sur # 39 235");
        Thread.sleep(500);
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Antioquia");
        Thread.sleep(500);
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("055413");
        Thread.sleep(500);
        driver.findElement(By.name("i_agree")).click();
        Thread.sleep(500);
        driver.findElement(By.id("register_btnundefined")).click();
        Thread.sleep(10000);
*/
        driver.findElement(By.id("laptopsImg")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("9")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@id='rabbit'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("quantity")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("quantity")).sendKeys("4");
        Thread.sleep(2000);
        driver.findElement(By.name("save_to_cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("menuCart")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkOutPopUp")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("next_btn")).click();
        Thread.sleep(5000);

/*
        driver.findElement(By.name("masterCredit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("creditCard")).sendKeys("123456789012");
        Thread.sleep(2000);
        driver.findElement(By.name("cvv_number")).sendKeys("2344");
        Thread.sleep(2000);
        driver.findElement(By.name("cardholder_name")).sendKeys("Mao");
        Thread.sleep(2000);
        driver.findElement(By.id("pay_now_btn_ManualPayment")).click();
        Thread.sleep(2000);
 */
        driver.findElement(By.id("pay_now_btn_MasterCredit")).click();
        Thread.sleep(2000);

        String ActualTitle = driver.findElement(By.xpath("//span[@class='roboto-regular ng-scope']")).getText();
        String ExpectedTitle = "Thank you for buying with Advantage";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @After
    public void close() {
        driver.close();

    }
}
/*
    Then(/^I see Succesful Message with text "(.*?)"$/, async (expectedMessage) => {
        let actualMessage = await addDoctor.message.getText()
        expect(actualMessage).to.be.equals(expectedMessage)
        });
 */
//hacer la tarea de web list para country
//Buscar que es gradle y cual es la diferencia con maven
//Buscar assertEquals(expected,actual);
//Como automátizar lista desplegable en selenium

//laptops - cualquier laptop - cambiar color- adicionar 4 unidades- carrito - checkout-
////a[@id='menuUserLink']