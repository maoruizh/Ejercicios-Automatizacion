package co.com.empresamao.areait.advantage.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriversWeb {
    private static WebDriver driver;

    public static MyDriversWeb web (){
        System.setProperty("webchromedriver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions(); //estamos creando una clase ChromeOptions y le ponemos un alias que se llama options y luego instanciamos creando un nuevo método de tipo ChromeOptions
        options.addArguments("--incognito"); //luego al alias le llamamos los metodos del ChromeOptions en este caso uno de ellos es addArguments y le colocamos el valor que pide el método en este caso string y es abrir el navegador minimizado
        driver = new ChromeDriver(options); // luego llamamos el objeto driver de la clase webdriver y lo instanciamos es decir, es crear una copia basada en un modelo
        driver.manage().window().maximize(); // luego llamamos el objeto driver de la clase webdriver y le aplicamos varios metodos por ejemplo manage().window().maximize() esto es metodo de manage que a su vez tiene otro método como .window() y a su vez otro sub método .maximize()
        return new MyDriversWeb();
    }

    public WebDriver inThePage(String url){
        driver.get(url);
        return driver;
    }
}
