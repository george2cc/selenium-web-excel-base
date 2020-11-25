package step_definitions;

import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.VerifyAddressProceedAction;
import pageobjects.AddressPage;
import utils.DataHelper;

import java.util.HashMap;
import java.util.List;

public class AddressSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public AddressSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify address and proceed$")
	public void i_verify_address_and_proceed() throws Throwable {
		PageFactory.initElements(driver, AddressPage.class);
		VerifyAddressProceedAction.Execute(driver, datamap);

	}
}
