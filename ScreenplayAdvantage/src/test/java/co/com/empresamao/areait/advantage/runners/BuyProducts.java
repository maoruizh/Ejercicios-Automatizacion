package co.com.empresamao.areait.advantage.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/buy_a_products.feature",
        glue = "co.com.empresamao.areait.advantage.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BuyProducts {
}
