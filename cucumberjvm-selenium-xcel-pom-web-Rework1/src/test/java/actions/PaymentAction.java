package actions;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.PaymentMethodPageElements;

public class PaymentAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		
		// verify heading
		assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", PaymentMethodPageElements.page_heading.getText());
		
		// action methods
		PaymentMethodPageElements.check.click();
		
		Reporter.log("Payment page verify and proceed successful");
	}
}
