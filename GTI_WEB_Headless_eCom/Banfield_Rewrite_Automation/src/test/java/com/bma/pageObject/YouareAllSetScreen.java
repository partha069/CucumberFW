package com.bma.pageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class YouareAllSetScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public YouareAllSetScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Everything look okay? Page element
	 */ 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _titleText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/add-to-calendar-btn")
	@FindBy(id = "schedule/steps/youareallset/add-to-calendar-btn")
	public MobileElement _addtoCalendar; //(Use)
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/see-you-soon-download-and-complete-your-forms-txt")
	@FindBy(id = "schedule/steps/youareallset/see-you-soon-download-and-complete-your-forms-txt")
	public MobileElement _updateforyourappmtText1;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/update-for-your-appmt-txt")
	@FindBy(id = "schedule/steps/youareallset/update-for-your-appmt")
	public MobileElement _updateforyourappmtText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/pet-name-txt")
	@FindBy(id = "schedule/steps/youareallset/pet-name-txt")
	public MobileElement _petNameText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Canine-owp-img-icn")
	@FindBy(id = "Canine-owp-img-icn")
	public MobileElement _OwpBadge;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/appmt-time-txt")
	@FindBy(id = "schedule/steps/youareallset/appmt-time")
	public MobileElement _appmtTimeText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/appmt-date-txt")
	@FindBy(id = "schedule/steps/youareallset/appmt-date-txt")
	public MobileElement _appmtDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/bewell-besafe-behere-txt")
	@FindBy(id = "schedule/steps/youareallset/bewell-besafe-behere")
	public MobileElement _bewellBesafeBehereText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/hospital-location-txt")
	@FindBy(id = "schedule/steps/youareallset/hospital-location")
	public MobileElement _hospitalLocationText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/doctor-details-txt")
	@FindBy(id = "schedule/steps/youareallset/doctor-details")
	public MobileElement _doctorDetailsText;
	                  
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/your-information-txt")
	@FindBy(id = "schedule/steps/youareallset/your-information")
	public MobileElement _yourInformationText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/first-name-txt")
	@FindBy(id = "schedule/steps/youareallset/first-name")
	public MobileElement _firstNameText;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/last-name-txt")
	@FindBy(id = "schedule/steps/youareallset/last-name")
	public MobileElement _lastNameText;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/contact-phone-txt")
	@FindBy(id = "schedule/steps/youareallset/contact-phone")
	public MobileElement _contactPhoneText;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/email-txt")
	@FindBy(id = "schedule/steps/youareallset/email")
	public MobileElement _emailText;
	
	/*
	 * OWP Wigets & CTAs 
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/phone")
	@FindBy(id = "schedule/steps/youareallset/phone")
	public MobileElement _callCTA;
	                  
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/reschedule-btn")
	@FindBy(id = "schedule/steps/youareallset/reschedule-btn")
	public MobileElement _RescheduleCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/cancel-btn")
	@FindBy(id = "schedule/steps/youareallset/cancel-btn")
	public MobileElement _CancelCTA;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/owp-icon-icn")
	@FindBy(id = "schedule/steps/youareallset/owp-icon-icn")
	public MobileElement _OWPWigets;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/owp-message-txt")
	@FindBy(id = "schedule/steps/youareallset/owp-message-txt")
	public MobileElement _OWPStaticText;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/visit-type-txt")
	@FindBy(id = "schedule/steps/youareallset/visit-type-txt")
	public MobileElement _visitTypeText;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/reason-for-visit")
	@FindBy(id = "schedule/steps/youareallset/reason-for-visit")
	public MobileElement _visitReasonText;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/note-for-the-vet-txt")
	@FindBy(id = "schedule/steps/youareallset/note-for-the-vet-txt")
	public MobileElement _visitNoteText;
	
	/*
	 * Popups
	 */
	//android:id/alertTitle
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	@FindBy(id = "android:id/message")
	public MobileElement _appointmentaddedPopups;
	
	@AndroidFindBy(id = "android:id/button1")
	@FindBy(id = "Okay")
	public MobileElement _okPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@FindBy(id = "OK")
	public MobileElement _allowPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "schedule/steps/youareallset/email")
	public MobileElement _denyPopups;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'See you soon')]")
	@FindBy(id = "slot-next-available-btn")
	public MobileElement _SeeYouSoonText;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/Not now")
	@FindBy(id = "Not Now")
	public MobileElement _ratingsPopups;
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/header/right-btn")
	@FindBy(id = "schedule/steps/youareallset/header/right-btn")
	public MobileElement _cancelCTA;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/done-btn")
	@FindBy(id = "schedule/steps/youareallset/done-btn")
	public MobileElement _doneCTA;
	
	/*
	 * Cancel Appointment Popups - Yes
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelmodal/close") 
	@FindBy(id = "youareallset/cancelmodal/close")
	public MobileElement _cancelAppo_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelmodal/desc") 
	@FindBy(id = "youareallset/cancelmodal/desc")
	public MobileElement _cancelAppoCancelStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelmodal/yes") 
	@FindBy(id = "youareallset/cancelmodal/yes")
	public MobileElement _cancelAppo_YesCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelmodal/no")
	@FindBy(id = "youareallset/cancelmodal/no")
	public MobileElement _cancelAppo_NoCTA;
	
	
	/*
	 * Cancel Appointment Confirmation Screen - Yes Flow
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonyesmodal/close") 
	@FindBy(id = "youareallset/cancelonyesmodal/close")
	public MobileElement _cancelConfirmation_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonyesmodal/header") 
	@FindBy(id = "youareallset/cancelonyesmodal/header")
	public MobileElement _cancelConfirmation_OkayText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonyesmodal/desc") 
	@FindBy(id = "youareallset/cancelonyesmodal/desc")
	public MobileElement _cancelConfirmation_StaticText;
	
	/*
	 * Cancel Appointment Confirmation Screen - No Flow
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonnomodal/close") 
	@FindBy(id = "youareallset/cancelonnomodal/close")
	public MobileElement _confirmation_CloseCTA; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonnomodal/header") 
	@FindBy(id = "youareallset/cancelonnomodal/header")
	public MobileElement _confirmation_OkayText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/youareallset/cancelonnomodal/desc") 
	@FindBy(id = "youareallset/cancelonnomodal/desc")
	public MobileElement _confirmation_StaticText;
	
	public void verifyedConfirmationAppPopup() throws Throwable {
		Thread.sleep(1000);
	    softassert.assertTrue(_confirmation_CloseCTA.isDisplayed());    
		softassert.assertTrue(_confirmation_OkayText.isDisplayed());
		softassert.assertTrue(_confirmation_StaticText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyedConfirmationAppPopups() throws Throwable {
		Thread.sleep(1000);
	    softassert.assertTrue(_cancelConfirmation_CloseCTA.isDisplayed());    
		softassert.assertTrue(_cancelConfirmation_OkayText.isDisplayed());
		softassert.assertTrue(_cancelConfirmation_StaticText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyedCancelAppPopups() throws Throwable {
		Thread.sleep(1000);
	    softassert.assertTrue(_cancelAppo_CloseCTA.isDisplayed());
		softassert.assertTrue(_cancelAppoCancelStaticText.isDisplayed());
		softassert.assertTrue(_cancelAppo_YesCTA.isDisplayed());
		softassert.assertTrue(_cancelAppo_NoCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
	public void verifyYourallsetPage() throws Throwable {
		Thread.sleep(800);
		WaitVisibilityOfElement(_updateforyourappmtText);
	//	softassert.assertTrue(_updateforyourappmtText.isDisplayed());
		softassert.assertTrue(_petNameText.isDisplayed());
		softassert.assertTrue(_appmtTimeText.isDisplayed());
	//	softassert.assertTrue(_bewellBesafeBehereText.isDisplayed());
		Scroll("Your information");
		softassert.assertTrue(_hospitalLocationText.isDisplayed());
		softassert.assertTrue(_doctorDetailsText.isDisplayed());
		softassert.assertTrue(_yourInformationText.isDisplayed());
		softassert.assertTrue(_firstNameText.isDisplayed());
		softassert.assertTrue(_lastNameText.isDisplayed());
		softassert.assertTrue(_contactPhoneText.isDisplayed());
		softassert.assertTrue(_emailText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyYourallsetPageForLoggedInUser() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_updateforyourappmtText1.isDisplayed());
		softassert.assertTrue(_updateforyourappmtText.isDisplayed());
		softassert.assertTrue(_petNameText.isDisplayed());
		softassert.assertTrue(_appmtTimeText.isDisplayed());
		softassert.assertTrue(_appmtDate.isDisplayed());
	//	Scroll("Your information");
		Thread.sleep(1000);
		swipeDown();
		softassert.assertTrue(_hospitalLocationText.isDisplayed());
		softassert.assertTrue(_doctorDetailsText.isDisplayed());
		softassert.assertTrue(_yourInformationText.isDisplayed());
		softassert.assertTrue(_firstNameText.isDisplayed());
		softassert.assertTrue(_lastNameText.isDisplayed());
		softassert.assertTrue(_contactPhoneText.isDisplayed());
		softassert.assertTrue(_emailText.isDisplayed());
		softassert.assertAll();	
	}
	
	
	public void verifyOWPTextAndCTA() throws Throwable {
		Thread.sleep(1000);      
		softassert.assertTrue(_callCTA.isDisplayed());
		softassert.assertTrue(_RescheduleCTA.isDisplayed());
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_addtoCalendar.isDisplayed());
		softassert.assertTrue(_OWPWigets.isDisplayed());
		softassert.assertTrue(_OWPStaticText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyOWPTextAndCTAforGuestUser() throws Throwable {
		Thread.sleep(1000);      
		softassert.assertTrue(_callCTA.isDisplayed()); 
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_addtoCalendar.isDisplayed());
		softassert.assertTrue(_OWPWigets.isDisplayed());
		softassert.assertTrue(_OWPStaticText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNonOWPTextAndCTAforGuestUser() throws Throwable {
		Thread.sleep(1000);      
		softassert.assertTrue(_callCTA.isDisplayed());
		softassert.assertTrue(_RescheduleCTA.isDisplayed());
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_addtoCalendar.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNonOWPTextAndCTAforLoggedinUser() throws Throwable {
		Thread.sleep(1000);      
		softassert.assertTrue(_callCTA.isDisplayed()); 
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_addtoCalendar.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyAppointmentsTypeAndNotes() throws Throwable {
		swipeDown();
		Thread.sleep(1000);         
		softassert.assertTrue(_visitTypeText.isDisplayed());
		softassert.assertTrue(_visitReasonText.isDisplayed());
		softassert.assertTrue(_visitNoteText.isDisplayed());
		softassert.assertAll();
	}
	
	
}
