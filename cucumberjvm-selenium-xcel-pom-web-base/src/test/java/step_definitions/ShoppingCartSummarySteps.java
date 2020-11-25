package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.VerifyShoppingCartSummaryAction;
import cucumber.api.java.en.Then;
import pageobjects.ShoppingCartSummaryPage;
import utils.DataHelper;

public class ShoppingCartSummarySteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public ShoppingCartSummarySteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I verify details on shoppingCart summary page$")
	public void i_verify_details_on_shoppingCart_summary_page() throws Throwable {

		PageFactory.initElements(driver, ShoppingCartSummaryPage.class);
		VerifyShoppingCartSummaryAction.Execute(driver, datamap);

	}

}
