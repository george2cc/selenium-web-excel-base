package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.ContactUsAction;
import actions.SignInAction;
import actions.SignoutAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elements.AutomationHomePageElements;
import elements.ContactusPageElements;
import elements.LoginPageElements;
import utils.DataHelper;

public class SigninSignoutContactUsSteps {

	// globals
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	/**
	 * constructor call hooks and datahelper
	 */
	public SigninSignoutContactUsSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	// snippets
	@Given("^customer is on homepage$")
	public void customer_is_on_homepage() throws Throwable {
		driver.get("http://automationpractice.com");

	}

	@When("^customer sign in$")
	public void customer_sign_in() throws Throwable {
		// call each page to be loaded
		PageFactory.initElements(driver, AutomationHomePageElements.class);
		// call login element
		PageFactory.initElements(driver, LoginPageElements.class);
		// execute steps call actions class
		SignInAction.Execute(driver, datamap);

	}

	@Then("^customer sign out$")
	public void customer_sign_out() throws Throwable {
		SignoutAction.Execute(driver, datamap);
	}

	@When("^customer perform contact us actions$")
	public void customer_perform_contact_us_actions() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePageElements.class);
		PageFactory.initElements(driver, ContactusPageElements.class);
		ContactUsAction.Execute(driver, datamap);

	}


}
