package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashNewAccountPage {
	WebDriver driver;
	
	public BankCashNewAccountPage(WebDriver drdiver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH,using = "//input[@id='account']") WebElement AccountTitle;
	@FindBy(how = How.XPATH,using = "//input[@id='description']") WebElement Description;
	@FindBy(how = How.XPATH,using = "//input[@id='balance']") WebElement InitialBalance;
	@FindBy(how = How.XPATH,using = "//input[@id='account_number']") WebElement AccountNumber;
	@FindBy(how = How.XPATH,using = "//input[@id='contact_person']") WebElement ContactPerson;
	@FindBy(how = How.XPATH,using = "//input[@id='contact_phone']") WebElement Phone;
	@FindBy(how = How.XPATH,using = "//input[@id='ib_url']") WebElement InternetBankingURL;
	@FindBy(how = How.XPATH,using = "//button[@class='btn btn-primary']") WebElement SubmitButton;
	@FindBy(how = How.XPATH,using = "//div[@class ='ibox-title']") WebElement ListAccountsPageText;
	
	

	public void enterAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterDescription(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterPhone(String phone) {
		Phone.sendKeys(phone);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enterInternetBankingURL(String internetBankingURL) {
		InternetBankingURL.sendKeys(internetBankingURL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSubmit() {
		SubmitButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//	public String getPageTitle() {
//		return driver.getTitle();
//		}

	public String getListAccountsPageText() {
		String text = ListAccountsPageText.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
