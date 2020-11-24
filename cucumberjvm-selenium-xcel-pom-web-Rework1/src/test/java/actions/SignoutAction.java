package actions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.AutomationHomePageElements;
import utils.Log;

public class SignoutAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		
		// call elements
		AutomationHomePageElements.sign_out.click();
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
		
	}
}
