package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Demo.feature"},
        glue = {"StepDefn"},
        plugin = {"pretty",
        "html:reports/html-reports/reports.html",
        "json:reports/json-reports/reports.json",
        "junit:reports/junit-reports/reports.xml"},
        tags = "@Regression",
        publish = true

)






public class TestRunner {
}