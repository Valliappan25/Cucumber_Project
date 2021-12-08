package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "stepDefinitions",
		plugin = {"pretty", "html:target/cucumber.html","junit:target/XMLOutput.xml"},
		stepNotifications = true,
		monochrome = true,
		tags = "@TC")
public class JUnitRunner {

	
}

