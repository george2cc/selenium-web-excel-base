package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.SelectAndCheckoutAction;
import cucumber.api.java.en.Then;
import elements.AutomationHomePageElements;
import elements.SummerDressesCatalogPageElements;
import utils.DataHelper;

public class SelectAndCheckoutSteps {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public SelectAndCheckoutSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I select a dress and proceed to checkout$")
	public void i_select_a_dress_and_proceed_to_checkout() throws Throwable {

		// set all navigation
		PageFactory.initElements(driver, AutomationHomePageElements.HeaderPage.class);
		PageFactory.initElements(driver, AutomationHomePageElements.HeaderPage.WomenPage.class);
		PageFactory.initElements(driver, AutomationHomePageElements.HeaderPage.WomenPage.DressesPage.class);

		PageFactory.initElements(driver, SummerDressesCatalogPageElements.class);
		PageFactory.initElements(driver, SummerDressesCatalogPageElements.PrintedSummerDress1.class);
		PageFactory.initElements(driver, SummerDressesCatalogPageElements.CartPopup.class);

		// execute steps from excel
		SelectAndCheckoutAction.Execute(driver, datamap);
	}
}
