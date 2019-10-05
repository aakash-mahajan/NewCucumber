package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "features\\LoginDatatable.feature",
			glue = "stepDefinition",
			plugin = "json:CucumberProject\\target\\report.json"
		)

public class DatatableLoginRunner {

}
