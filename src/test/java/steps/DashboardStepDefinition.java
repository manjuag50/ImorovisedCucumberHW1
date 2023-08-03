package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase{
	DashboardPage dashboardPage;
	
	
	@When("User clicks on Bank & Cash Menu button")
	public void user_clicks_on_Bank_Cash_Menu_button() {
		
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickBankCashMenu();
	}

	@When("User clicks on New account under Bank & cash menu button")
	public void user_clicks_on_New_account_under_Bank_cash_menu_button() {
		dashboardPage.clickNewAccountsMenu();
	}

//	@Then("User should be able to land on Accounts Page")
//	public void user_should_be_able_to_land_on_Accounts_Page() {
//		String expectedTitle = "Accounts- iBilling";
//		String actualTitle = dashboardPage.getAccountsPageTitle();
//		Assert.assertEquals(expectedTitle, actualTitle);
//		takeScreenshot(driver);
//	}
	@Then("User should be able to land on Accounts Page")
	public void user_should_be_able_to_land_on_Accounts_Page() {
		String expectedText = "Add New Account";
		String actualText = dashboardPage.getAccountsPageText();
		Assert.assertEquals(expectedText, actualText);
		takeScreenshot(driver);
	}

	
}
