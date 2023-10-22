package saucedemocucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/saucedemocucumber/features",
        glue = "saucedemocucumber.stepDef",
        plugin = {"html:target/HTML_report.html", "json:target/JSON_report.json", "junit:target/XML_report.xml"},
        tags = "@Regression"
)

public class run {
}
