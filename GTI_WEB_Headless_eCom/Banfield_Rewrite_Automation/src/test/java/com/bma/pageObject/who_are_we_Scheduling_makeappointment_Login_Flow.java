package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class who_are_we_Scheduling_makeappointment_Login_Flow extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public who_are_we_Scheduling_makeappointment_Login_Flow(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * UI Page Element
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _who_are_we_SchedulingTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/header/right-btn")
	@FindBy(id = "schedule/addpet/moreabout/header/right-btn")
	public MobileElement _closeCTA;
	                  
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet0/name-txt")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet0")
	public MobileElement _petcard;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet0/visit-txt")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet0/visit-txt")
	public MobileElement _PetLastSeen;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet0/checked_icon-icn")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet0/checked_icon-icn")
	public MobileElement _greenCheckMark;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/makeappointment/whoareweschedule/addapet-btn")
	@FindBy(id = "makeappointment/whoareweschedule/addapet-btn")
	public MobileElement _addapetCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/makeappointment/whoareweschedule/exoticpet-txt")
	@FindBy(id = "makeappointment/whoareweschedule/exoticpet-txt")
	public MobileElement _haveanurgentreqText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/makeappointment/whoareweschedule/exoticpetlocalhospital-txt")
	@FindBy(id = "cmakeappointment/whoareweschedule/exoticpetlocalhospital-txt")
	public MobileElement _haveanurgentreqTextFor_No_preferred_hospital;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/makeappointment/whoareweschedule/exoticpetcta-txt")
	@FindBy(id = "makeappointment/whoareweschedule/exoticpetcta-txt")
	public MobileElement _callyourprefferedlocation;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/loggedinuser/whoareweschedule/next-btn")
	@FindBy(id = "schedule/loggedinuser/whoareweschedule/next-btn")
	public MobileElement _nextCTA;
	
	/*
	 * Nativa Popups
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='androidalert/popup/heading']")
	@FindBy(id = "androidalert/popup/heading")
	public MobileElement _hospitalName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='androidalert/popup/text']")
	@FindBy(id = "androidalert/popup/text")
	public MobileElement _hospitalAddress;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/androidalert/Call']")
	@FindBy(id = "androidalert/Call")
	public MobileElement _callCTA;
	
	@AndroidFindBy(id = "com.google.android.dialer:id/digits")
	@FindBy(id = "digits")
	public MobileElement _phoneNumber;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/androidalert/Directions']")
	@FindBy(id = "androidalert/Directions")
	public MobileElement _directionCTA;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/androidalert/okay']")
	@FindBy(id = "androidalert/okay")
	public MobileElement _popupsCancelCTA;
	
	/*
	 * Pets
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet0")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet0")
	public MobileElement _pet01;//Kitty

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet1")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet1")
	public MobileElement _pet02;//Piety
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet2")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet2")
	public MobileElement _pet03;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jarrod']")
	@FindBy(xpath = "//XCUIElementTypeOther[@text='Jarrod']")
	public MobileElement _pet04;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whoareweschedule/petlistview/pet0/owp-img-icn")
	@FindBy(id = "schedule/whoareweschedule/petlistview/pet0/owp-img-icn]")
	public MobileElement _OWPBadge;
	
	
	public void whoareweschedulingUI() {
		softassert.assertTrue(_who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertTrue(_closeCTA.isDisplayed());
		softassert.assertTrue(_addapetCTA.isDisplayed());	
		softassert.assertTrue(_haveanurgentreqText.isDisplayed());	
		softassert.assertTrue(_callyourprefferedlocation.isDisplayed());		
		softassert.assertAll();
	}
	
	public void verifyNativePopups() {
		softassert.assertTrue(_hospitalName.isDisplayed());
		softassert.assertTrue(_hospitalAddress.isDisplayed());
		softassert.assertTrue(_callCTA.isDisplayed());	
		softassert.assertTrue(_directionCTA.isDisplayed());	
		softassert.assertTrue(_popupsCancelCTA.isDisplayed());		
		softassert.assertAll();
	}
}
