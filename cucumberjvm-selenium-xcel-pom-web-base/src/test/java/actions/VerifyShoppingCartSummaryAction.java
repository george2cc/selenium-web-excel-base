package actions;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.ShoppingCartSummaryPage;
import utils.DataHelper;

public class VerifyShoppingCartSummaryAction {

	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		assertEquals("SHOPPING-CART SUMMARY\n" + "Your shopping cart contains: 1 Product",
				ShoppingCartSummaryPage.page_heading.getText());
		assertEquals(ShoppingCartSummaryPage.unit_price.getText(), DataHelper.storeValues.get("product_price"));
		assertEquals(ShoppingCartSummaryPage.total_price.getText(), "$30.98");
		ShoppingCartSummaryPage.proceed_to_checkout.click();
		Reporter.log("Shopping Cart Summary action verify and proceed successful");
	}
}
