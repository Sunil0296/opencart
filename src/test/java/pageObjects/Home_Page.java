package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page{

	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkMyaccnt;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement linkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	public void clickMyAccount() {
		linkMyaccnt.click();
	}
	
	
	public void clickOnRegister() {
		linkRegister.click();
	}
	
	
	public void clickLogin() {
		linkLogin.click();
	}
	
}
