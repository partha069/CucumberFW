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

public class CreateAccount_LocationServiceEnableStep6 extends Utilities {

	private static Logger logger = LogManager.getLogger(CreateAccount_LocationServiceEnableStep6.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public CreateAccount_LocationServiceEnableStep6(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/locationserviceenable/heading")
	@FindBy(id = "createaccount/steps/locationserviceenable/heading")
	public MobileElement _WeCanHelpDescText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/locationserviceenable/desc")
	@FindBy(id  = "createaccount/steps/locationserviceenable/desc")
	public MobileElement _HandyRightText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/locationserviceenable/skip")
	@FindBy(id = "createaccount/steps/locationserviceenable/skip")
	public MobileElement _SkipCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/locationserviceenable/yes")
	@FindBy(id = "createaccount/steps/locationserviceenable/yes")
	public MobileElement _YesCTA;
	
	public void VerifyCreateAccountstep6UI() {
		try {
			softassert.assertTrue(_HandyRightText.isDisplayed());
			softassert.assertTrue(_WeCanHelpDescText.isDisplayed());
			softassert.assertTrue(_YesCTA.isDisplayed());
			softassert.assertTrue(_SkipCTA.isDisplayed());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 6");	
		}
	}

}
