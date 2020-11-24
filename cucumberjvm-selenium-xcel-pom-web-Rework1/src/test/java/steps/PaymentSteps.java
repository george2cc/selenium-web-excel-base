package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.PaymentAction;
import cucumber.api.java.en.Then;
import elements.PaymentMethodPageElements;
import utils.DataHelper;

public class PaymentSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public PaymentSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify payment details page and proceed$")
	public void i_verify_payment_details_page_and_proceed() throws Throwable {
		// call elements class
		PageFactory.initElements(driver, PaymentMethodPageElements.class);
		// call action class
		PaymentAction.Execute(driver, datamap);

	}
}
