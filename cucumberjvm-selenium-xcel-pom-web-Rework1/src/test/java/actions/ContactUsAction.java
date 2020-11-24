package actions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.AutomationHomePageElements;
import elements.ContactusPageElements;

public class ContactUsAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		
		// call elements page action method
		AutomationHomePageElements.contact_us.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(10,0)");
		
		// call excel get details enter details
		ContactusPageElements.email.sendKeys((String)map.get(0).get("email"));
		ContactusPageElements.message.sendKeys(map.get(0).get("message"));
		// action click
		ContactusPageElements.submit.click();
		Assert.assertTrue(ContactusPageElements.error_message.getText().contains("There is 1 error"));
	}
}
