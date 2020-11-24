package actions;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.ShippingPageElements;

public class ShippingAddressProceedAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		// verify heading
		assertEquals("SHIPPING", ShippingPageElements.page_heading.getText());
		
		// action methods
		ShippingPageElements.terms.click();
		ShippingPageElements.proceed_to_checkout.click();
		
		Reporter.log("Shipping Address page verify and proceed successful");
	}
}
