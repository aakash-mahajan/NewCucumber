package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "features\\Login.feature",
			glue = "stepDefinition",
			plugin = "json:target\\report.json"
		)
public class LoginTestRunner {

}
