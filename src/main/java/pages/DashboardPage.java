package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement CustomersMenu;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement AddCustomerMenu;
	@FindBy(how = How.XPATH, using = "//a[text()='List Customers']")
	WebElement ListCustomersMenu;
	@FindBy(how = How.XPATH, using = "//h5[text()='Add Contact']")
	WebElement AddCustomerPageText;
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankcashMenu;
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")WebElement NewAccountsMenu;
	@FindBy(how = How.XPATH, using = "//div[@class ='ibox-title']")WebElement AddNewAccountsPageText;
	
	@FindBy(how = How.XPATH, using = "//a[text()='List Accounts']")
	WebElement ListAccountsMenu;

	public void clickCustomerMenuButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CustomersMenu.click();
	}

	public void clickAddCustomerMenuButton() {
		AddCustomerMenu.click();
	}

	public void clickListCustomerMenuButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ListCustomersMenu.click();
	}

	public String getAddCustomerPageTitle() {
		return driver.getTitle();
	}
//                   ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

//	public String getAddCustomerPageText() {
//		String text = AddCustomerPageText.getText();
//		
//		return text;
//	}

	public void clickBankCashMenu() {
		BankcashMenu.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void clickNewAccountsMenu() {
		NewAccountsMenu.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
//	public String getAccountsPageTitle() {
//		return driver.getTitle();
//	}
	
	public String getAccountsPageText() {
		String text = AddNewAccountsPageText.getText();
		return text;
	}
	
}
