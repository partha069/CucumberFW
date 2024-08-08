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

public class UpcomingAppointmentsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(UpcomingAppointmentsScreen.class);

	public UpcomingAppointmentsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _UpcomingAppointmentsTitle;
	
	/*
	 * No Appointments
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/comprehensive/nextdue-txt") //same
	@FindBy(id = "comprehensive/nextdue-txt")
	public MobileElement _UpcomingAppointmentsStaticTask;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/MySchedules/screen/noAppointments-img") //same
	@FindBy(id = "MySchedules/screen/noAppointments-img")
	public MobileElement _UpcomingAppointmentsCalendarLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MySchedules/screen/makeanappointment-btn") //same
	@FindBy(id = "MySchedules/screen/makeanappointment-btn")
	public MobileElement _UpcomingAppointmentsCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/schedule/slotavailability/next']") //same
	@FindBy(id = "schedule/slotavailability/next")
	public MobileElement _UpcomingAppointmentsCTA1;




	
	/*
	 * Upcoming Appointments
	 */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.banfield.react.bpht:id/ViewAppointments/pet-profile-img']")
	@FindBy(id = "ViewAppointments/pet-profile-img")
	public MobileElement _UpcomingAppointmentsLogo;  //removed
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='ViewAppointment-0-appointmentdate-text']")
	@FindBy(id = "ViewAppointment-0-appointmentdate-text")
	public MobileElement _UpcomingAppointmentsDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/viewappointments/0/pet_name-txt']") //samee
	@FindBy(id = "viewappointments/0/pet_name-txt")
	public MobileElement _UpcomingAppointmentsPetName; 
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='ViewAppointment-0-hospitalname-text']")
	@FindBy(id = "ViewAppointment-0-hospitalname-text")
	public MobileElement _UpcomingAppointmentsHospitalName;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='ViewAppointment-0-reschedule-btn']") //same..
	@FindBy(id = "ViewAppointment-0-reschedule-btn")
	public MobileElement _RescheduleCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='ViewAppointment-0-cancel-btn']") //same..
	@FindBy(id = "ViewAppointment-0-cancel-btn")
	public MobileElement _CancelCTA;
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='ViewAppointment-0-phone']") //Old Element id
//	@FindBy(id = "ViewAppointment-0-dial-icn")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/phone-number-btn")
	@FindBy(id = "viewappointments/0/phone-number-btn")
	public MobileElement _CallCTA;
	
	
	/*
	 * As Per New Story - 35760, updated new Elements 
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/clock-img-appointmentdate-text")
	@FindBy(id = "viewappointments/0/clock-img-appointmentdate-text")
	public MobileElement _dateAndTimeText;  
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/pet_item_expand_name-img")
	@FindBy(id = "viewappointments/0/pet_item_expand_name-img")
	public MobileElement _downCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/viewappointments/0/toggleview-edit-img']")
	@FindBy(id = "viewappointments/0/toggleview-edit-img")
	public MobileElement _editAndEditCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/viewappointments/0/toggle-icons-img']")
	@FindBy(id = "viewappointments/0/toggle-icons-img")
	public MobileElement _caretCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/care-img-icn")
	@FindBy(id = "viewappointments/0/care-img-icn")
	public MobileElement _appointmentIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/appoiintment-type-txt")
	@FindBy(id = "viewappointments/0/appoiintment-type-txt")
	public MobileElement _appointmentText; 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Adopted pet exam')]")
	@FindBy(id = "viewappointments/0/appointment-reasons-txt")
	public MobileElement _adoptedPetExamText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/appointment-reasons-txt")
	@FindBy(id = "viewappointments/0/appointment-reasons-txt")
	public MobileElement _appointmentTypeText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/map-img-icn")
	@FindBy(id = "viewappointments/0/map-img-icn")
	public MobileElement _mapIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/hospital-address-img")
	@FindBy(id = "viewappointments/0/hospital-address-img")
	public MobileElement _mapLink;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/hospital-name-txt")
	@FindBy(id = "viewappointments/0/hospital-name-txt")
	public MobileElement _hospitalName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewappointments/0/phone-img-icn")
	@FindBy(id = "viewappointments/0/phone-img-icn")
	public MobileElement _CallIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/doctor-img-icn")
	@FindBy(id = "view-appointments/0/doctor-img-icn")
	public MobileElement _doctorIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/doctor-name-txt")
	@FindBy(id = "view-appointments/0/doctor-name-txt")
	public MobileElement _doctorName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/client-infor-header-txt")
	@FindBy(id = "view-appointments/0/client-infor-header-txt")
	public MobileElement _yourInformationHeaderText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/client-name-txt")
	@FindBy(id = "view-appointments/0/client-name-txt")
	public MobileElement _yourInformation_cientNameText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/clinet-phone-txt")
	@FindBy(id = "view-appointments/0/clinet-phone-txt")
	public MobileElement _yourInformation_phoneNumberText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/clinet-email-txt")
	@FindBy(id = "com.banfield.react.bpht:id/view-appointments/0/clinet-email-txt")
	public MobileElement _yourInformation_emailIDText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/appointment-notes-header-txt")
	@FindBy(id = "view-appointments/0/appointment-notes-header-txt")
	public MobileElement _noteFortheVetHeaderText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/view-appointments/0/appointment-notes-data-txt")
	@FindBy(id = "view-appointments/0/appointment-notes-data-txt")
	public MobileElement _noteFortheVetNoteText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/viewappointments/0/miles-txt']")
	@FindBy(id = "viewappointments/0/miles-txt")
	public MobileElement _MilesText;
	
	
	
	
	/*
	 * Reschedule Popup - Would you like to reschedule ?
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/reschedulemodal/close") //same
	@FindBy(id = "myschedule/reschedulemodal/close")
	public MobileElement _Reschedule_Popup_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/reschedulemodal/desc") //same
	@FindBy(id = "myschedule/reschedulemodal/desc")
	public MobileElement _Reschedule_Popup_Static_Text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/reschedulemodal/no") //same
	@FindBy(id = "myschedule/reschedulemodal/no")
	public MobileElement _Reschedule_Popup_NoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/reschedulemodal/yes") //same
	@FindBy(id = "myschedule/reschedulemodal/yes")
	public MobileElement _Reschedule_Popup_YesCTA;
	
	
	/*
	 * When User Don't want to Cancel Appointment
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/close") //same
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/close")
	public MobileElement _Reschedule_NoProplem_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/header") //same
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/header")
	public MobileElement _Reschedule_NoProplemText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/desc") //same
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/desc")
	public MobileElement _Reschedule_NoProplem_StaticText;
	
	
	/*
	 * 	When User want to Cancel Appointment - Are you sure popups
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSure/touchable/close") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSure/touchable/close")
	public MobileElement _Cancel_Popup_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSure/body") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSure/body")
	public MobileElement _Cancel_Popup_Static_Text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSure/rightbutton") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSure/rightbutton")
	public MobileElement _Cancel_Popup_NoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSure/leftbutton") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSure/leftbutton")
	public MobileElement _Cancel_Popup_YesCTA;
	
	/*
	 * No Problem Popups
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupNoProblem/title")
	@FindBy(id = "myschedule/cancelappointment/popupNoProblem/title")
	public MobileElement _Cancel_NoProplemText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupNoProblem/body")
	@FindBy(id = "myschedule/cancelappointment/popupNoProblem/body")
	public MobileElement _Cancel_NoProplem_StaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupNoProblem/touchable/close")
	@FindBy(id = "myschedule/cancelappointment/popupNoProblem/touchable/close")
	public MobileElement _Cancel_NoProplem_CloseCTA;
	
	//
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupReschedule/touchable/close")
	@FindBy(id = "myschedule/cancelappointment/popupCancelSure/close-icon")
	public MobileElement _Cancel_Yes_Popup_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupReschedule/body")
	@FindBy(id = "myschedule/cancelappointment/popupReschedule/body")
	public MobileElement _Cancel_Yes_Popup_Static_Text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupReschedule/leftbutton")
	@FindBy(id = "myschedule/cancelappointment/popupReschedule/leftbutton")
	public MobileElement _Cancel_Yes_Popup_YesCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupReschedule/rightbutton")
	@FindBy(id = "myschedule/cancelappointment/popupReschedule/rightbutton")
	public MobileElement _Cancel_Yes_Popup_NoCTA;
	
	
	/*
	 * Once Appo is cancelled successfully
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSuccess/touchable/close") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSuccess/touchable/close")
	public MobileElement _CancelAppointment_CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSuccess/title") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSuccess/title")
	public MobileElement _CancelAppointment_Title;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/cancelappointment/popupCancelSuccess/body") //same
	@FindBy(id = "myschedule/cancelappointment/popupCancelSuccess/body")
	public MobileElement _CancelAppointment_StaticText;
	
	
	
	public void verifiedYesSecrren() {
	    softassert.assertTrue(_Cancel_Yes_Popup_Static_Text.isDisplayed());
		softassert.assertTrue(_Cancel_Yes_Popup_NoCTA.isDisplayed());
		softassert.assertTrue(_Cancel_Yes_Popup_YesCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyCancelPopups() {
	    softassert.assertTrue(_Cancel_Popup_Static_Text.isDisplayed());
		softassert.assertTrue(_Cancel_Popup_NoCTA.isDisplayed());
		softassert.assertTrue(_Cancel_Popup_YesCTA.isDisplayed());
		softassert.assertAll();
	   }
	
   public void verifyReschedulePopups() {
	   softassert.assertTrue(_Reschedule_Popup_Static_Text.isDisplayed());
	   softassert.assertTrue(_Reschedule_Popup_NoCTA.isDisplayed());
	   softassert.assertTrue(_Reschedule_Popup_YesCTA.isDisplayed());
	   softassert.assertAll();
   }
	
	public void verifyUpcomingAppointmentsView() {
		softassert.assertTrue(_UpcomingAppointmentsDate.isDisplayed());
		softassert.assertTrue(_UpcomingAppointmentsPetName.isDisplayed());
		softassert.assertTrue(_UpcomingAppointmentsHospitalName.isDisplayed());
		softassert.assertTrue(_RescheduleCTA.isDisplayed());
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_CallCTA.isDisplayed());
		softassert.assertAll();
	}
	

	public void verifyUpcomingAppointments() {
		softassert.assertTrue(_UpcomingAppointmentsCalendarLogo.isDisplayed());
		softassert.assertTrue(_UpcomingAppointmentsCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void canceelappointment() {
		
	}
	

}
