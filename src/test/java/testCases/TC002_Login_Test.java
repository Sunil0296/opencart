package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.My_Account_Page;
import testBase.Base_Class;

public class TC002_Login_Test extends Base_Class {

	
	
	@Test(groups = {"Sanity" , "Master"})
	public void verify_Login() {
		
		logger.info("********Starting TC002_Login_Test ************");
		
		try
		{
		//Home Page
		Home_Page hp = new Home_Page(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		// Login Page
		Login_Page lp = new Login_Page(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		// My Account Page
		My_Account_Page myacp =  new My_Account_Page(driver);
		boolean targetPage = myacp.isMyAccountPageExists();
		
		Assert.assertTrue(targetPage);
		
		}
		catch (Exception e) {
			Assert.fail();
		}
		
		
		
		logger.info("********Finishing TC002_Login_Test ************");

	}
	
	
}
