package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.AddressProceedAction;
import cucumber.api.java.en.Then;
import elements.AddressPageElements;
import utils.DataHelper;

public class AddressSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public AddressSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}
	
	@Then("^I verify address and proceed$")
	public void i_verify_address_and_proceed() throws Throwable {
		// add elements page
		PageFactory.initElements(driver, AddressPageElements.class);
		// call actions class
		AddressProceedAction.Execute(driver, datamap);

	}
}
