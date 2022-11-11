import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Advantage2 {
    private WebDriver driver; // creamos el web driver
    private WebDriverWait wait;

    @Before //esto es para que antes de que cargue la clase haga algo.
    public void setup() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.advantageonlineshopping.com/#/");
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @Test // estas son las acciones
    public void main() throws InterruptedException {
        //createUser((ChromeDriver) driver);
        loginUser((ChromeDriver) driver);
        buyLaptop((ChromeDriver) driver);
        MasterCreditExist((ChromeDriver) driver);
        //MasterCreditNoExist((ChromeDriver) driver);
        Assert((ChromeDriver) driver);
        Thread.sleep(4000);
    }

    public void createUser(ChromeDriver driver) {
        WebElement element;
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menuUserLink"))).click(); // esta es la manera de como se busca elemento en la página //a[@id='menuUserLink']
        element = driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")); // esta es la manera de como se busca el elemento en la pagina //a[@class='create-new-account ng-scope']
        driver.executeScript("arguments[0].click();", element);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("usernameRegisterPage"))).sendKeys("Maoruizh"); // si es para mostrar la prueba a camilo usar Maoruizh22
        driver.findElement(By.name("emailRegisterPage")).sendKeys("mao@ruiz.com");
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("Aa$123456789");
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Aa$123456789");
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Mao");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Ruiz");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3054896324");
        Select country = new Select(this.driver.findElement(By.name("countryListboxRegisterPage"))); // ¿esto se puede hacer un sendKeys?
        country.selectByVisibleText("Colombia");
        driver.findElement(By.name("cityRegisterPage")).sendKeys("Medellin");
        driver.findElement(By.name("addressRegisterPage")).sendKeys("Calle 65 sur # 39 235");
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Antioquia");
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("055413");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("i_agree"))).click();
        driver.findElement(By.id("register_btnundefined")).click();
    }

    public void loginUser(ChromeDriver driver) throws InterruptedException {
        WebElement element;
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menuUserLink"))).click(); // esta es la manera de como se busca elemento en la página //a[@id='menuUserLink']
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("Maoruizh");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Aa$123456789");
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined"))).click();
    }

    public void buyLaptop(ChromeDriver driver) throws InterruptedException {
        WebElement element;
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("laptopsImg"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("9"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@id='rabbit'])[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("quantity"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.name("quantity"))).sendKeys("4");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("save_to_cart"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menuCart"))).click();
        driver.findElement(By.id("checkOutPopUp")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("next_btn"))).click();
        Thread.sleep(2000);
    }
        public void MasterCreditNoExist(ChromeDriver driver){
        driver.findElement(By.name("masterCredit")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("creditCard"))).sendKeys("123456789012");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("cvv_number"))).sendKeys("234");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("cardholder_name"))).sendKeys("Mao");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pay_now_btn_ManualPayment"))).click();
    }

    public void MasterCreditExist(ChromeDriver driver) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pay_now_btn_MasterCredit"))).click();
        Thread.sleep(3000);
    }

    public void Assert (ChromeDriver driver) throws InterruptedException {
        String ActualTitle = this.driver.findElement(By.xpath("//span[@class='roboto-regular ng-scope']")).getText();
        String ExpectedTitle = "Thank you for buying with Advantage";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        //consulte en esta pagina https://www.browserstack.com/guide/verify-and-assert-in-selenium#:~:text=assertEquals()%20is%20a%20method,shown%20in%20the%20image%20below.
    }

    @After
    public void close() {
        driver.close();
    }
}
