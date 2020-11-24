package actions;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.ShoppingCartSummaryPageElements;
import utils.DataHelper;

public class ShoppingCartSummaryAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		assertEquals("SHOPPING-CART SUMMARY\n" + "Your shopping cart contains: 1 Product",
				ShoppingCartSummaryPageElements.page_heading.getText());
		// store values in excel sheet
		assertEquals(ShoppingCartSummaryPageElements.unit_price.getText(), DataHelper.storeValues.get("product_price"));
		assertEquals(ShoppingCartSummaryPageElements.total_price.getText(), "$30.98");
		
		// actions to checkout
		ShoppingCartSummaryPageElements.proceed_to_checkout.click();
		Reporter.log("Shopping Cart Summary action verify and proceed successful");
	}
}
