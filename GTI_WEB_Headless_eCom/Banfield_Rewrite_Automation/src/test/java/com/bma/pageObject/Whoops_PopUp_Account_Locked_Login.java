package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Whoops_PopUp_Account_Locked_Login extends Utilities {

	private static Logger logger = LogManager.getLogger(Whoops_PopUp_Account_Locked_Login.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Whoops_PopUp_Account_Locked_Login(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/verifyid/incorrect/header")
	@FindBy(id = "createaccount/signupbanfield/verifyid/incorrect/header")
	public MobileElement _WhoopsTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/verifyid/incorrect/desc")
	@FindBy(id = "createaccount/signupbanfield/verifyid/incorrect/desc")
	public MobileElement _LookslikeyoualreadyhaveanaccountText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/verifyid/validationerror")
	@FindBy(id = "createaccount/signupbanfield/verifyid/validationerror")
	public MobileElement _OkayCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/verifyid/incorrect/close")
	@FindBy(id = "createaccount/signupbanfield/verifyid/incorrect/close")
	public MobileElement _CloseCTA;
	
	public void verifyUserAccountLocked() {
		try {
			softassert.assertTrue(_WhoopsTitle.isDisplayed());
			softassert.assertTrue(_LookslikeyoualreadyhaveanaccountText.isDisplayed());
			softassert.assertTrue(_OkayCTA.isDisplayed());
			softassert.assertAll();
			
			logger.info("User verified Whoops popup UI Elements");
		}
		catch(Exception e) {
			logger.info("User Failed to verify Whoops popup UI Elements");	
		}
	}
}
