package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.AddressProceedAction;
import actions.ShippingAddressProceedAction;
import cucumber.api.java.en.Then;
import elements.AddressPageElements;
import elements.ShippingPageElements;
import utils.DataHelper;

public class ShippingSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public ShippingSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}
	
	@Then("^I verify shipping details and proceed$")
	public void i_verify_shipping_details_and_proceed() throws Throwable {
		// add elements page
		PageFactory.initElements(driver, ShippingPageElements.class);
		// call actions class
		ShippingAddressProceedAction.Execute(driver, datamap);

	}
}
