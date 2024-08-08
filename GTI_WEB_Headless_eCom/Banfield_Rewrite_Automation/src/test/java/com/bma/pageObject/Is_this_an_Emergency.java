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

public class Is_this_an_Emergency extends Utilities {

	private static Logger logger = LogManager.getLogger(Is_this_an_Emergency.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Is_this_an_Emergency(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/emergency-popup/modal/title")
	@FindBy(id = "emergency-popup/modal/title")
	public MobileElement _is_this_an_emergency_popup_titletext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/emergency-popup/modal/desc")
	@FindBy(id = "emergency-popup/modal/desc")
	public MobileElement _is_this_an_emergency_desctext;
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/emergency-popup/modal/continuebtn']")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/emergency-popup/modal/continuebtn")
	@FindBy(id = "emergency-popup/modal/continuebtn")
	public MobileElement _is_this_an_emergency_continue_cta;
	
	public void verifyis_this_an_emergency_popup() {
		softassert.assertTrue(_is_this_an_emergency_popup_titletext.isDisplayed());
		softassert.assertTrue(_is_this_an_emergency_desctext.isDisplayed());
		softassert.assertTrue(_is_this_an_emergency_continue_cta.isDisplayed());
		softassert.assertAll();
	}
}
