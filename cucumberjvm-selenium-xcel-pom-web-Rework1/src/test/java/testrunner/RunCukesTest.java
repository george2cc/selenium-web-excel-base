package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		tags = {"@contactus"},
		monochrome=true,
		dryRun = false
		)
public class RunCukesTest{
	
}