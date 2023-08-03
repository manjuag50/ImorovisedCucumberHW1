//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//public class AddCustomerPage extends TestBase {
//	WebDriver driver;
//
//	public AddCustomerPage(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
//	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
//	WebElement FullName;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
//	WebElement Company;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
//	WebElement Email;
//	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
//	WebElement Phone;
//	@FindBy(how = How.XPATH, using = "//input[@id='address']")
//	WebElement Address;
//	@FindBy(how = How.XPATH, using = "//input[@id='state']")
//	WebElement State;
//	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
//	WebElement Zip;
//	@FindBy(how = How.XPATH, using = "//input[@id='city']")
//	WebElement City;
//	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
//	WebElement SaveButton;
//
//	public void validateAddCustomerPage(String expectedText) {
//		validateElement(ADD_CUSTOMER_HEADER_ELEMENT.getText(), expectedText, "Add Customer page is not available!!");
//	}
//
//	String insertedName;
//
//	public void insertFullName(String fullName) {
//		insertedName = fullName + randomNumGenerator(999);
//		FullName.sendKeys(fullName + randomNumGenerator(999));
//	}
//
//	public void selectCompanyName(String company) {
//		selectFromDropdown(Company,company);
//	}
//
//	public void insertEmail(String email) {
//		Email.sendKeys(randomNumGenerator(999) + email);
//	}
//
//	public void insertPhone(String phone) {
//		Phone.sendKeys(phone + randomNumGenerator(50));
//	}
//
//	public void insertAddress(String address) {
//		Address.sendKeys(address);
//	}
//
//	public void insertCity(String city) {
//		City.sendKeys(city);
//	}
//
//	public void insertState(String state) {
//		State.sendKeys(state);
//	}
//
//	public void clickSaveButton() {
//		SaveButton.click();
//	}
//	// tbody/tr[1]/td[3]/a location of name element in list customers
//
//	String before_xpath = "//tbody/tr[";
//	String after_xpath = "]/td[3]/a";
//
////	//tbody/tr[1]/td[7]/a[2]                   location of delete element corresponding to name element in list customers
//
//	String after_xpath_delete = "]/td[7]/a[2]";
//
//	public void validateInsertedNameAndDelete() throws InterruptedException {
//		for (int i = 1; i <= 10; i++) {
//			String actualName = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			if (actualName.contains(insertedName)) {
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(before_xpath + i + after_xpath_delete)).click();
//			}break;
//		}
//
//	}
//
//}
