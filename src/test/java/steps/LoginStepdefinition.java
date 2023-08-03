package steps;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankCashNewAccountPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepdefinition extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	

	@Before
	public void setUp() { // this method is used to initializing the driver and go the login page and can
							// enter the input field in any ORDEER
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_tecfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		takeScreenshot(driver);

	}

	@When("User enters username as {string}")
	public void User_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignIN();

	}

	@Then("user should be able to land on dashboard page")
	public void user_should_be_able_to_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

//	@When("User clicks on Bank & Cash Menu button")
//	public void user_clicks_on_Bank_Cash_Menu_button() {
//		dashboardPage.clickBankCashMenu();
//	}
//
//	@When("User clicks on New account under Bank & cash menu button")
//	public void user_clicks_on_New_account_under_Bank_cash_menu_button() {
//		dashboardPage.clickNewAccountsMenu();
//	}
//
////	@Then("User should be able to land on Accounts Page")
////	public void user_should_be_able_to_land_on_Accounts_Page() {
////		String expectedTitle = "Accounts- iBilling";
////		String actualTitle = dashboardPage.getAccountsPageTitle();
////		Assert.assertEquals(expectedTitle, actualTitle);
////		takeScreenshot(driver);
////	}
//	@Then("User should be able to land on Accounts Page")
//	public void user_should_be_able_to_land_on_Accounts_Page() {
//		String expectedText = "Add New Account";
//		String actualText = dashboardPage.getAccountsPageText();
//		Assert.assertEquals(expectedText, actualText);
//		takeScreenshot(driver);
//	}
}
