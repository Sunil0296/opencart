package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page  extends Base_Page{

	
	WebDriver driver;
	
	// constructor:
	
	public Registration_Page(WebDriver driver) {
		super(driver);
	}
	
	
	
	// locators:
	
	//Enter  firstname
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	// Enter LastName
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	
	//Email
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	//Telephone
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	//Password
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPwd;
	
	//ConfirmPassword
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPwd;
	
	//Privacy Policy
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkPolicy;
	
	// Continue
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	// action methods:
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);
	}
	
	
	public void setPassword(String pwd) {
		txtPwd.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String confirmPwd) {
		txtConfirmPwd.sendKeys(confirmPwd);
	}
	
	
	public void clickPrivacyPolicy() {
		checkPolicy.click();
	}
	
	
	public void clickContinue() {
		// solution1
		continueButton.click();
	}
	
	public String getConfirmationMessage() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
	
	
	
	
	
}
