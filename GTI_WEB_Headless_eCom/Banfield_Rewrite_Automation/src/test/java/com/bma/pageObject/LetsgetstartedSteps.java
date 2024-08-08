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

public class LetsgetstartedSteps extends Utilities {
	public String path="./src/test/resources/TestData/Sprint1/makeappointmentasguest.csv";
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public LetsgetstartedSteps(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	/*
	 * UI Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/message")
	@FindBy(id = "schedule/contactinfo/message")
	public MobileElement _staticText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/firstname")
	@FindBy(id = "schedule/contactinfo/firstname")
	public MobileElement _firstName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/lastname")
	@FindBy(id = "schedule/contactinfo/lastname")
	public MobileElement _lastName;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/phone")
	@FindBy(id = "schedule/contactinfo/phone")
	public MobileElement _phone;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/email")
	@FindBy(id = "schedule/contactinfo/email")
	public MobileElement _email;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/email/Email*")
	@FindBy(id = "schedule/contactinfo/email/Email*")
	public MobileElement _emailheader;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/next")
	@FindBy(id = "schedule/contactinfo/next")
	public MobileElement _nextButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone*']")
	@FindBy(xpath = "schedule/contactinfo/phone/Phone*")
	public MobileElement _phoneheader;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _letsgetstartedTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/schedule/contactinfo/phone/error']")
	@FindBy(id = "schedule/contactinfo/phone/error")
	public MobileElement _invalidphonenumber;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/schedule/contactinfo/email/error']")
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/email/Please enter a valid email address")
	@FindBy(id = "schedule/contactinfo/email/error")
	public MobileElement _invalidemail;

	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/header/left")
	@FindBy(id = "schedule/contactinfo/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/contactinfo/header/right")
	@FindBy(id = "schedule/contactinfo/header/right")
	public MobileElement _cancelCTA;
	

	/*
	 * Verify UI Elements
	 */
	public void verifyUIElementsofContInfo() {
		softassert.assertTrue(_firstName.isDisplayed());
		softassert.assertTrue(_lastName.isDisplayed());
		softassert.assertTrue(_phone.isDisplayed());
		softassert.assertTrue(_email.isDisplayed());
		softassert.assertTrue(_letsgetstartedTitle.isDisplayed());
	}
	
	public void Entervaliddatain_letsgetstartedpage() throws Throwable {
		TapElement(_firstName);
		EnterInput(_firstName,getcsvdata(path,2, "firstname", "firstname", "lastname","phone","email"));
		HidingKeyboard();
		TapElement(_lastName);
	    EnterInput(_lastName,getcsvdata(path,2, "lastname", "firstname", "lastname","phone","email"));
	    HidingKeyboard();
	    TapElement(_phone);
	    EnterInput(_phone,getcsvdata(path,2, "phone", "firstname", "lastname","phone","email"));
	    HidingKeyboard();
	    TapElement(_email);
	    EnterInput(_email,getcsvdata(path,2, "email", "firstname", "lastname","phone","email"));
	    HidingKeyboard();
		HidingKeyboard();
	}
	
	/*
	 * Enter last Name
	 */
	public void firstname(String FirstName) {
		try {
			TapElement(_firstName);
			EnterInput(_firstName, FirstName);
			logger.info("User updated lastname successfully");
		} catch (Exception ex) {
			logger.info("User updation on lastname gets failed");
		}
	}

	/*
	 * Enter last Name
	 */
	public void lastname(String Lastname) {
		try {
			TapElement(_lastName);
			EnterInput(_lastName, Lastname);
			logger.info("User updated lastname successfully");
		} catch (Exception ex) {
			logger.info("User updation on lastname gets failed");
		}
	}

	/*
	 * Enter Phone Number
	 */
	public void phonenumber(String Phonenumber) {
		try {
			TapElement(_phone);
			EnterInput(_phone, Phonenumber);
			logger.info("User updated phonenumber successfully");
		} catch (Exception ex) {
			logger.info("User updation on phonenumber gets failed");
		}
	}
	/*
	 * Enter Email ID
	 */

	public void emailid(String EmailID) {
		try {
			TapElement(_email);
			EnterInput(_email, EmailID);
			logger.info("User updated emailid successfully");
		} catch (Exception ex) {
			logger.info("User updation on emailid gets failed");
		}
	}
	
	/*
	 * Tap on Invalid Mail CTA
	 */
	public void taponinvalidemail() {
		try {
			Scroll("_invalidemail");
			TapElement(_invalidemail);
			logger.info("User Tapped on invalide mail CTA");
		}
		catch(Exception e) {
			logger.info("User Failed to Tap on invalide mail CTA");	
		}
	}

}
