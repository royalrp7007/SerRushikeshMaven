package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./Features/Admin.feature","./Features/AddCustomer.feature"},
		glue = "stepdefinations",
		dryRun = false,
		monochrome = true,
		publish = true,
		tags = "@smoke"
		)
public class TestRunner {

}
