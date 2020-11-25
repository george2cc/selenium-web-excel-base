package actions;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;
import utils.Log;

public class SignInAction {
	public static void Execute(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
		Log.info("Click action is perfromed on Signin link");
		AutomationHomePage.sign_in.click();
		Thread.sleep(3000);
		// login action
	
		LoginPage.email.sendKeys(map.get(0).get("username"));
		Log.info(" is entered in UserName text box");
		
		LoginPage.password.sendKeys(map.get(0).get("password"));
		Log.info(" is entered in Password text box");
		
		LoginPage.signin_button.click();
		Log.info("Click action is performed on Submit button");
		Reporter.log("SignIn Action is successfully perfomred");
	}
}
