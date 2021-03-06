package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationHomePageElements extends BaseClass {

	/**
	 * Constructor add driver
	 * 
	 * @param driver
	 */
	public AutomationHomePageElements(WebDriver driver) {
		super(driver);
	}
	// add locators for the page

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public static WebElement sign_in;

	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public static WebElement contact_us;

	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public static WebElement sign_out;

	/**
	 * 
	 * parameters on under header
	 * @author George
	 *
	 */
	public static class HeaderPage {

		@FindBy(how = How.LINK_TEXT, using = "Women")
		public static WebElement menu_women;

		@FindBy(how = How.XPATH, using = "//*a[@title='Dresses']")
		public static WebElement menu_dresses;

		@FindBy(how = How.XPATH, using = "//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;

		public static class WomenPage {
			@FindBy(how = How.LINK_TEXT, using = "Dresses")
			public static WebElement dresses;

			public static class DressesPage {

				@FindBy(how = How.LINK_TEXT, using = "Summer Dresses")
				public static WebElement summer_dresses;

			}
		}

	}

}
