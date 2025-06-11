package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.My_Account_Page;
import testBase.Base_Class;
import utilities.DataProviders;

public class TC003_LoginDDT  extends Base_Class{

	
	@Test(dataProvider = "LoginData" , dataProviderClass = DataProviders.class , groups = "Datadriven") // GETTING DATA FROM DATA PROVIDER CLASS
	public void verify_LoginDDT(String email, String password , String expResult) {
		
		
		logger.info("*****************Starting TEST*****************************");
		
		try {
		//Home Page
				Home_Page hp = new Home_Page(driver);
				hp.clickMyAccount();
				hp.clickLogin();
				
				
				// Login Page
				Login_Page lp = new Login_Page(driver);
				lp.setEmail(email);
				lp.setPassword(password);
				lp.clickLogin();
				
				// My Account Page
				My_Account_Page myacp =  new My_Account_Page(driver);
				boolean targetPage = myacp.isMyAccountPageExists();
				
//				if Data is valid -- login success -- test passesd  --logout
//				if Data is valid --login fail -- test fail
//				if Data id Invalid --login success -- test fail -- logout
//				if Data is Invalid -- login failed ---test pass
				
				if(expResult.equalsIgnoreCase("valid")) {
					if(targetPage==true) {
					myacp.clickLogout();
						Assert.assertTrue(true);
					}else {
						Assert.assertTrue(false);
					}
					
					if(expResult.equalsIgnoreCase("Invalid")) {
						if(targetPage==true) {
							myacp.clickLogout();
							Assert.assertTrue(false);
						}else {
							Assert.assertTrue(true);
						}
					}
				}
				
				
		}
		catch (Exception e) {
		Assert.fail();
		}
				logger.info("*****************Starting TEST*****************************");

				
	}
}
