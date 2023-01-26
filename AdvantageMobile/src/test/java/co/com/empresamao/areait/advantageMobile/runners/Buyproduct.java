package co.com.empresamao.areait.advantageMobile.runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/buy_Product.feature",
        glue = "co.com.empresamao.areait.advantageMobile.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class Buyproduct {
}