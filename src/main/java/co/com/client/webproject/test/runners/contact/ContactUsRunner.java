package co.com.client.webproject.test.runners.contact;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/main/resources/features/ContactUs.feature"},
        glue = {"co.com.client.webproject.test.stepdefinition"},
        tags = "",
        publish = true
)
public class ContactUsRunner {
}
