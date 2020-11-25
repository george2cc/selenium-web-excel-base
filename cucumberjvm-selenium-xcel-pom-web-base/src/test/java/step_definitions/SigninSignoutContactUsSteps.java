package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.ContactUsAction;
import actions.SignInAction;
import actions.SignoutAction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AutomationHomePage;
import pageobjects.ContactusPage;
import pageobjects.LoginPage;
import utils.DataHelper;

public class SigninSignoutContactUsSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public SigninSignoutContactUsSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@When("^I open automationpractice website$")
	public void i_open_automationpractice_website() throws Throwable {
		driver.get("http://automationpractice.com");
	}

	@When("^I sign in$")
	public void i_sign_in() throws Throwable {
		// call each page to be loaded
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		SignInAction.Execute(driver, datamap);
	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		SignoutAction.Execute(driver, datamap);
	}
	
	@Then("^I perform contact us actions$")
	public void I_perform_contact_us_actions() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, ContactusPage.class);
		ContactUsAction.Execute(driver, datamap);

	}

}