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

public class Duplicate_Appointment_Alert extends Utilities {

	private static Logger logger = LogManager.getLogger(Duplicate_Appointment_Alert.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Duplicate_Appointment_Alert(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * POM for guest user duplicate appointment
	 * 
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/title-txt")
	@FindBy(id = "myschedule/duplicateappointment/modal/title-txt")
	public MobileElement _duplicate_popup_titletext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/makeadditionalbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/makeadditionalbtn")
	public MobileElement _make_additional_appointment_cta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/cancelbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/cancelbtn")
	public MobileElement _cancelcta;
	
	public void verifyduplicatepopup() {
		softassert.assertTrue(_duplicate_popup_titletext.isDisplayed());
		softassert.assertTrue(_make_additional_appointment_cta.isDisplayed());
		softassert.assertTrue(_cancelcta.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * POM for loggedin user duplicate appointment
	 * 
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/title-txt")
	@FindBy(id = "myschedule/duplicateappointment/modal/title-txt")
	public MobileElement _duplicate_popup_titletext_loggedinuser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/makeadditionalbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/makeadditionalbtn")
	public MobileElement _make_additional_appointment_cta_loggedinuser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/cancelbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/cancelbtn")
	public MobileElement _edit_existing_appointment_cta_loggedinuser;
	
	public void verifyduplicatepopupforloogedinuser() {
		softassert.assertTrue(_duplicate_popup_titletext_loggedinuser.isDisplayed());
		softassert.assertTrue(_make_additional_appointment_cta_loggedinuser.isDisplayed());
		softassert.assertTrue(_edit_existing_appointment_cta_loggedinuser.isDisplayed());
		softassert.assertAll();
	}
}
