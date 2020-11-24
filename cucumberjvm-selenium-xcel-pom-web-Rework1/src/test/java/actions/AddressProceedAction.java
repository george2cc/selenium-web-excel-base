package actions;

import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.AddressPageElements;

public class AddressProceedAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		// verify heading
		assertEquals("ADDRESSES", AddressPageElements.page_heading.getText());
		
		// get message from excel sheet
		AddressPageElements.message.sendKeys(map.get(0).get("message"));
		
		//action method
		AddressPageElements.proceed_to_checkout.click();
		Reporter.log("Address page verify and proceed successful");
	}
}
