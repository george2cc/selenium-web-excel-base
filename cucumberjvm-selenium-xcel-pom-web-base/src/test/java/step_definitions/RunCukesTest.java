package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		tags = "@wip",
		monochrome=true,
		dryRun = false
		)
public class RunCukesTest{
	
}