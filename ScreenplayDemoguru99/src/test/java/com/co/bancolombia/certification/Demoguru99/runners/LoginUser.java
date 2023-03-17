package com.co.bancolombia.certification.Demoguru99.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/login_users.feature",
        glue = "com.co.bancolombia.certification.Demoguru99.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LoginUser {
}
