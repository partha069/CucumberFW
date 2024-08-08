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

public class HavewemetScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(HavewemetScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public HavewemetScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Have we met Page
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/havewemet/yes")
	@FindBy(id = "schedule/havewemet/yes")
	public MobileElement _yesIHaveButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/havewemet/no")
	@FindBy(id = "schedule/havewemet/no")
	public MobileElement _noIHaveButton;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/havemet/text")
	@FindBy(id = "schedule/havemet/text")
	public MobileElement _haveyoubeentoaBanfieldPetHospitalBefore;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _havewemettitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/havewemet/header/left")
	@FindBy(id = "schedule/havewemet/header/left")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/havewemet/header/right")
	@FindBy(id = "schedule/havewemet/header/right")
	public MobileElement _cancelCTA;
	
	/*
	 * Verify verify Have we mate screen
	 */
	public void verifyHavewematescreen() throws InterruptedException {
		Thread.sleep(2000);
		softassert.assertTrue(_haveyoubeentoaBanfieldPetHospitalBefore.isDisplayed());
		softassert.assertTrue(_yesIHaveButton.isDisplayed()); 
		softassert.assertTrue(_noIHaveButton.isDisplayed());
		softassert.assertAll();
	}

	/*
	 * Tapping on Yes I have CTA
	 */
	public void TapOnYesIHaveCTA(){
		try {
			WaitVisibilityOfElement(_yesIHaveButton);
			TapElement(_yesIHaveButton);
			logger.info("Tap on Yes I have CTA");
		} catch (Exception e) {
			logger.info("Failed to tap on Yes I have CTA");
		}
	}

	/*
	 * Tapping on No I'm New
	 */
	public void TapOnNoIMNew() {
		try {
			WaitElementToBeClickable(_noIHaveButton);
			TapElement(_noIHaveButton);
			logger.info("Tap on no i am new CTA");
		} catch (Exception e) {
			logger.info("Failed to tap on i am new CTA");
		}
	}
}
