import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Appu {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("http://45.79.211.118:4100/login");
        driver.manage().window().maximize();
    }
    @Test // estas son las acciones
    public void createUser() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='message-create']")).click();
        Thread.sleep(3000);
      /*
        driver.findElement(By.name("name")).sendKeys("Mauricio");
        Thread.sleep(500);
        driver.findElement(By.name("number")).sendKeys("3112575119");
        Thread.sleep(500);
        driver.findElement(By.name("email")).sendKeys("maoruizh@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys("Asdf1234*");
        Thread.sleep(500);
        driver.findElement(By.name("passwordConfirm")).sendKeys("Asdf1234*");
        Thread.sleep(5000);
*/
        driver.findElement(By.className("recaptcha-checkbox-border")).click();
        Thread.sleep(5000);

    }

    @After
    public void close() {
        driver.close();

    }
}

////label[@id='recaptcha-anchor-label']