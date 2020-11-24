package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.ShoppingCartSummaryAction;
import cucumber.api.java.en.Then;
import elements.ShoppingCartSummaryPageElements;
import utils.DataHelper;

public class ShoppingCartSummarySteps {
	
	// globals
		public WebDriver driver;
		public List<HashMap<String, String>> datamap;

		/**
		 * constructor call hooks and datahelper
		 */
		public ShoppingCartSummarySteps() {
			driver = MasterHooks.driver;
			datamap = DataHelper.data();
		}

	@Then("^I verify details on shoppingCart summary page$")
	public void i_verify_details_on_shoppingCart_summary_page() throws Throwable {
		PageFactory.initElements(driver, ShoppingCartSummaryPageElements.class);
		// execute action steps
		ShoppingCartSummaryAction.Execute(driver, datamap);
	}
}
