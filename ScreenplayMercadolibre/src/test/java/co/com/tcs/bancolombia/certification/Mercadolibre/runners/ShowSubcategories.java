package co.com.tcs.bancolombia.certification.Mercadolibre.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/show_subcategories.feature",
        glue = "co.com.tcs.bancolombia.certification.Mercadolibre.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ShowSubcategories {
}
