package co.com.tcs.bancolombia.certification.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/join_today.feature",
        glue = "co.com.tcs.bancolombia.certification.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class JoinToday {
}
