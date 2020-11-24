package actions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import elements.AutomationHomePageElements;
import elements.SummerDressesCatalogPageElements;
import utils.DataHelper;

public class SelectAndCheckoutAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// navigate to summer dresses
		AutomationHomePageElements.HeaderPage.menu_women.click();
		AutomationHomePageElements.HeaderPage.WomenPage.dresses.click();
		AutomationHomePageElements.HeaderPage.WomenPage.DressesPage.summer_dresses.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(SummerDressesCatalogPageElements.PrintedSummerDress1.img_dress1);
		action.perform();
		DataHelper.storeValues.put("product_price",
				SummerDressesCatalogPageElements.PrintedSummerDress1.product_price.getText());
		SummerDressesCatalogPageElements.PrintedSummerDress1.add_cart_dress1.click();
		
		// click on pop up
		wait.until(ExpectedConditions.elementToBeClickable(SummerDressesCatalogPageElements.CartPopup.proceed_to_checkout));
		SummerDressesCatalogPageElements.CartPopup.proceed_to_checkout.click();
		Reporter.log("Select product successful");
	}
}
