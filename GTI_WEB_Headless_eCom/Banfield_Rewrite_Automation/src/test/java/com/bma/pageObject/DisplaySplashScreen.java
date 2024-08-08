package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DisplaySplashScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	ViewWelcomeScreen ViewWelcomeScreen;

	public DisplaySplashScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Splash Screen Element
	 */

	//xpath = "//android.view.ViewGroup[@text='Banfield PET HOSPITAL']"
	// id = "Banfield"
	//@AndroidFindBy(xpath = "//android.view.ViewGroup[@text='Banfield PET HOSPITAL']")
	@AndroidFindBy(id = "Banfield")
	//@iOSXCUITFindBy(xpath = "")
	public MobileElement _SplashScreen;

	
	/*
	 * Verifying the UI Element
	 */
	public void verifytheSplashScreen() {
		WaitVisibilityOfElement(_SplashScreen);
		
	}

}
