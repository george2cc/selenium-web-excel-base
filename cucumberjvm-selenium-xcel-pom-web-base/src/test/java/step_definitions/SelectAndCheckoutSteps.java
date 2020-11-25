package step_definitions;

import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.SelectAndCheckoutAction;
import pageobjects.AutomationHomePage;
import pageobjects.SummerDressesCatalogPage;
import utils.DataHelper;

import java.util.HashMap;
import java.util.List;

public class SelectAndCheckoutSteps {

	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public SelectAndCheckoutSteps() {
		driver = MasterHooks.driver;
		datamap = DataHelper.data();
	}

	@Then("^I select a dress and proceed to checkout$")
	public void i_select_a_dress_and_proceed_to_checkout() throws Throwable {

		PageFactory.initElements(driver, AutomationHomePage.HeaderPage.class);
		PageFactory.initElements(driver, AutomationHomePage.HeaderPage.WomenPage.class);
		PageFactory.initElements(driver, AutomationHomePage.HeaderPage.WomenPage.DressesPage.class);
		PageFactory.initElements(driver, SummerDressesCatalogPage.class);
		PageFactory.initElements(driver, SummerDressesCatalogPage.PrintedSummerDress1.class);
		PageFactory.initElements(driver, SummerDressesCatalogPage.CartPopup.class);

		SelectAndCheckoutAction.Execute(driver, datamap);

	}

}
