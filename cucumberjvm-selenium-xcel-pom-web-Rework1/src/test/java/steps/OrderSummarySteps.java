package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.OrderSummaryAction;
import cucumber.api.java.en.Then;
import utils.DataHelper;

public class OrderSummarySteps {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;

    public OrderSummarySteps()
    {
        driver = MasterHooks.driver;
        datamap = DataHelper.data();
    }
    
    @Then("^I verify order summary page and proceed$")
    public void i_verify_order_summary_page_and_proceed() throws Throwable {
        PageFactory.initElements(driver, elements.OrderSummaryPage.class);
        OrderSummaryAction.Execute(driver,datamap);

    }
}
