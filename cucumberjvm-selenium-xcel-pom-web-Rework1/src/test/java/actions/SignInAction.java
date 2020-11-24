package actions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import elements.AutomationHomePageElements;
import elements.LoginPageElements;
import utils.Log;

public class SignInAction {
	/**
	 * 
	 * @param driver
	 * @param map
	 * @throws Exception
	 */
	public static void Execute(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
		Log.info("Click action is perfromed on Signin link");
		
		// call elements class
		AutomationHomePageElements.sign_in.click();
		
		// login action get excel details
		LoginPageElements.email.sendKeys(map.get(0).get("username"));
		Log.info(" is entered in UserName text box");
		
		LoginPageElements.password.sendKeys(map.get(0).get("password"));
		Log.info(" is entered in Password text box");
		
		LoginPageElements.signin_button.click();
		Log.info("Click action is performed on Submit button");
		Reporter.log("SignIn Action is successfully perfomred");
		
	}
}
