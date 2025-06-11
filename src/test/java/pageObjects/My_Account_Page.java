package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account_Page extends  Base_Page{
 
	 public My_Account_Page(WebDriver driver) {
		 super(driver);
	 }
	 
	 @FindBy(xpath="//h2[normalize-space()='My Account']") // my account page heading
	 WebElement msgHeading;
	 
	 @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	 WebElement linkLogout;
	 
	 public boolean isMyAccountPageExists()
	 {
		 try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	 }
	 
	 public void clickLogout() {
		 linkLogout.click();
	 }
}
