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

public class CreateAccount_RecieveNotificationStep5 extends Utilities {

	private static Logger logger = LogManager.getLogger(CreateAccount_RecieveNotificationStep5.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public CreateAccount_RecieveNotificationStep5(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/receivenotification/header")
	@FindBy(id = "createaccount/steps/receivenotification/header")
	public MobileElement _WeCanHelpDescText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/receivenotification/desc")
	@FindBy(id = "createaccount/steps/receivenotification/desc")
	public MobileElement _SoundsGoodText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/receivenotification/skip")
	@FindBy(id = "createaccount/steps/receivenotification/skip")
	public MobileElement _SkipCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/receivenotification/yes")
	@FindBy(id = "createaccount/steps/receivenotification/yes")
	public MobileElement _YesCTA;
	
	public void VerifyCreateAccountstep5UI() {
		try {
			softassert.assertTrue(_WeCanHelpDescText.isDisplayed());
			softassert.assertTrue(_SoundsGoodText.isDisplayed());
			softassert.assertTrue(_SkipCTA.isDisplayed());
			softassert.assertTrue(_YesCTA.isDisplayed());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 5");	
		}
	}
}
