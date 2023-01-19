package co.com.retoevalart.it.tcs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/user_login.feature",
        glue = "co.com.retoevalart.it.tcs.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GeneralTest {
}
