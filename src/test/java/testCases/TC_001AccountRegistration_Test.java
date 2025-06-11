package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.Registration_Page;
import testBase.Base_Class;

public class TC_001AccountRegistration_Test  extends Base_Class {

	
	@Test(groups = {"Regression" , "Master"})
	public void verify_account_registration() {
		
		try {
		
		logger.info("******starting testcase*********");
		
		Home_Page hp = new Home_Page(driver);
				  hp.clickMyAccount();
		logger.info("******clicking on my account*********");

				  hp.clickOnRegister();
		logger.info("******clicked on Register*********");

				   
		Registration_Page rp  = new Registration_Page(driver);
		logger.info("******providing user details*********");

				  rp.setFirstName(randomString().toUpperCase());
				  rp.setLastName(randomString().toUpperCase());
				  rp.setEmail(randomString() +"@gmail.com");
				  rp.setTelephone(randomNumber());
				String passwordd  = randomAlphaNumber();
				  rp.setPassword(passwordd);
				  rp.setConfirmPassword(passwordd);
				  rp.clickPrivacyPolicy();
				  rp.clickContinue();
		logger.info("******validating expected message*********");

				  String confmsg = rp.getConfirmationMessage();
				  if(confmsg.equals("Your Account Has Been Created!")){
					  Assert.assertTrue(true);
				  }else {
					  logger.error("Test Failed..!");
						logger.debug("debug loges...");
						Assert.assertTrue(false);;
				  }
				  
		}catch (Exception e) {
			
			Assert.fail();
		}
		logger.info("******finished testcase*********");


	}
	
	
}
