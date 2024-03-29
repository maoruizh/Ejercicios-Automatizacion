package co.com.empresamao.areait.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/login_users.feature",
        glue = "co.com.empresamao.areait.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LoginUsers {
}
