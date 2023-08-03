package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankCashNewAccountPage;
import pages.TestBase;

public class BankCashNewAccountStepdefinition extends TestBase {

	BankCashNewAccountPage bankCashNewAccountPage;

	@When("User enters account Title as {string}")
	public void user_enters_account_Title_as(String accountTitle) {
		bankCashNewAccountPage = PageFactory.initElements(driver, BankCashNewAccountPage.class);
		bankCashNewAccountPage.enterAccountTitle(randomNumGenerator(500) + accountTitle);

	}

	@When("User enters description as {string}")
	public void user_enters_description_as(String description) {
		bankCashNewAccountPage.enterDescription(description);
	}

	@When("User enters initial balance as {string}")
	public void user_enters_initial_balance_as(String initialBalance) {
		bankCashNewAccountPage.enterInitialBalance(initialBalance);
	}

	@When("User enters account number as {string}")
	public void user_enters_account_number_as(String accountNumber) {
		bankCashNewAccountPage.enterAccountNumber(accountNumber + randomNumGenerator(100));
	}

	@When("User enters contact person as {string}")
	public void user_enters_contact_person_as(String contactPerson) {
		bankCashNewAccountPage.enterContactPerson(contactPerson);
	}

	@When("User enters phone as {string}")
	public void user_enters_phone_as(String phone) {
		bankCashNewAccountPage.enterPhone(phone);
	}

	@When("User enters internet banking url as {string}")
	public void user_enters_internet_banking_url_as(String internetBankingURL) {
		bankCashNewAccountPage.enterInternetBankingURL(internetBankingURL);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		bankCashNewAccountPage.clickSubmit();
	}

	@Then("User should be able to land on Accounts page")
	public void user_should_be_able_to_land_on_Accounts_page() {
		String expectedText = "Manage Accounts";
		String actualText = bankCashNewAccountPage.getListAccountsPageText();
		Assert.assertEquals(expectedText, actualText);
		takeScreenshot(driver);
	}

}
