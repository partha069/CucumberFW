package com.bma.pageObject;

import java.util.List;

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

public class BottomNavigationScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(BottomNavigationScreen.class);

	public BottomNavigationScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Bottom Navigation Elements Home, Appointments, Chat, Profile
	 */
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='bottomnav/0']")
	@FindBy(id = "bottomnav/0")
	public MobileElement _homeCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='bottomnav/1']")
	@FindBy(id = "bottomnav/1")
	public MobileElement _appointments;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='bottomnav/2']")
	@FindBy(id = "bottomnav/2")
	public MobileElement _chatCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='bottomnav/3']")
//	@FindBy(id = "bottomnav/3") 
	@FindBy(xpath = "//XCUIElementTypeButton[@name='bottomnav/3']")
	public MobileElement _profileCTA;
	
	
	/*
	 * Verify Bottom Navigation Elements
	 */
	public void verifybottomnavigationelements() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_homeCTA.isDisplayed());
		softassert.assertTrue(_appointments.isDisplayed());
		softassert.assertTrue(_chatCTA.isDisplayed());
		softassert.assertTrue(_profileCTA.isDisplayed());
		softassert.assertAll();
	}
	

}
