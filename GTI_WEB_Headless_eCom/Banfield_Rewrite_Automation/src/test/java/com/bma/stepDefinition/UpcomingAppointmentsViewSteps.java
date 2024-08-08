package com.bma.stepDefinition;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.EverythingLookOkayScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.YouareAllSetScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;
import io.cucumber.java.en.And;

public class UpcomingAppointmentsViewSteps extends Utilities {

	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow whoAreWeScheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public YouareAllSetScreen YouareAllSet = new YouareAllSetScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(UpcomingAppointmentsViewSteps.class);
	
	@And("^the user should be redirected to Upcoming appointments screen$")
	public void the_user_should_be_redirected_to_Upcoming_appointments_screen() throws Throwable {
		try {
			TapElement(BottomNavigation._appointments);
		//	Thread.sleep(52000);			
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeStaticText[@name='viewappointments/0/pet_name-txt']"));
			}
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		//	Thread.sleep(28000);
		//	WaitVisibilityOfElement(UpcomingAppointments._UpcomingAppointmentsPetName);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());
		} catch (Exception e) {
			Thread.sleep(1000);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
			TapElement(UpcomingAppointments._UpcomingAppointmentsCTA);
			TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
			TapElement(whoAreWeScheduling._pet01);
			TapElement(whoAreWeScheduling._nextCTA);
			TapElement(Reasonforvisit._illnessCTA); 
			TapElement(Reasonforvisit._nextCTA);
			TapElement(WhatsGoingOn._UrinaryIssues);
			swipeDown();
			EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, "Test Note");
			HidingKeyboardios();
			TapElement(WhatsGoingOn._VomitingDiarrhea);
			TapElement(WhatsGoingOn._nextCTA);
			TapElement(WhenAndWhere._onlyThisTimePopups);
			Thread.sleep(4000);
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			Thread.sleep(4000);
			try {
				Thread.sleep(1000);
				TapElement(WhenAndWhere._hospital8);
			} catch (Exception e2) {
				Scroll("Garfield");
			}
			TapElement(WhenAndWhere._nextCTA);
			Thread.sleep(8000);
			TapElement(WhenAndWhere._nextavailableText);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			swipeDown();
			TapElement(WhenAndWhere._slot7);
			TapElement(WhenAndWhere._nextCTAonSlotPage);
			TapElement(EverythingLookOkay._makeAppointmentCTA);
			try {
				if (getUserDeviceInput.contains("IOS")) {
					TapElement(YouareAllSet._ratingsPopups);
				}
			} catch (Exception g) {	
				assert(true);
			}
			TapElement(YouareAllSet._doneCTA);
			logger.info("User scheduled an Appointment successfully");
		}
		if (getUserDeviceInput.contains("IOS")) {
			ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeStaticText[@name='viewappointments/0/pet_name-txt']"));
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	//	Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());	
	//	Thread.sleep(7000);
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be redirected to Upcoming appointments screen");
	}
	
	@And("^the user should tap on Upcoming appointments CTA$")
	public void the_user_should_tap_on_Upcoming_appointments_CTA() throws Throwable {
		TapElement(BottomNavigation._appointments);
		Thread.sleep(52000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());
		logger.info("the user tap on Upcoming appointments CTA");
	}
	
	@And("^the user navigate back to home screen$")
	public void the_user_navigate_back_to_home_screen() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		Thread.sleep(600);
		TapElement(PetCard._backCTAHighlights);
		Thread.sleep(600);
		logger.info("the user navigate back to home screen");
	}
	
	@And("^the user navigate back to home screen from timeline screen$")
	public void the_user_navigate_back_to_home_screen_from_timeline() throws Throwable {
		TapElement(PetCard._backCTATimeLine);
		Thread.sleep(600);
		logger.info("the user navigate back to home screen from timeline");
	}
	
	@And("^the user navigate back to home screen from highlights screen$")
	public void the_user_navigate_back_to_home_screen_from_highlights_scren() throws Throwable {
		TapElement(PetCard._backCTAHighlights);
		Thread.sleep(600);
		logger.info("the user navigate back to home screen from highlights screen");
	}
	
	@And("^the user will be displayed miles when the geolocation is turned on$")
	public void the_user_will_be_displayed_miles_when_the_geolocation_is_turned_on() throws Throwable {
		Thread.sleep(600);
		WaitElementToBeClickable(UpcomingAppointments._editAndEditCTA);
        TapElement(UpcomingAppointments._editAndEditCTA);
        Thread.sleep(600);
        softassert.assertTrue(UpcomingAppointments._mapLink.isDisplayed());
        Thread.sleep(600);
        TapElement(UpcomingAppointments._caretCTA);
        Thread.sleep(600);
		softassert.assertTrue(UpcomingAppointments._mapLink.isDisplayed());
		softassert.assertAll();
//		verifytest(UpcomingAppointments._mapLink);
		logger.info("the user will be displayed miles when the geolocation is turned on");
	}
	
	@And("^the user is displayed with the following information on the appointment card when collapsed$")
	public void the_user_is_displayed_with_the_information_on_the_appointment_card_when_collapsed() throws Throwable {
        Thread.sleep(1000);
        softassert.assertTrue(UpcomingAppointments._dateAndTimeText.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._downCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._editAndEditCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._appointmentText.isDisplayed());
  //    softassert.assertTrue(UpcomingAppointments._mapLink.isDisplayed()); //CR
		softassert.assertAll();
		logger.info("the user is displayed with the following information on the appointment card when collapsed");
	}
	
	@And("^the user can tap on the caret icon or View/edit to expand the appointment card$")
	public void the_user_can_tap_on_the_caret_icon_or_View_or_edit_to_expand_the_appointment_card() throws Throwable {
        Thread.sleep(1000);
        WaitElementToBeClickable(UpcomingAppointments._editAndEditCTA);
        TapElement(UpcomingAppointments._editAndEditCTA);
        Thread.sleep(400);
        softassert.assertTrue(UpcomingAppointments._downCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._dateAndTimeText.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._appointmentTypeText.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._hospitalName.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._mapLink.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._CallCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._doctorName.isDisplayed());
        swipeDown();
        softassert.assertTrue(UpcomingAppointments._RescheduleCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._CancelCTA.isDisplayed());
        softassert.assertTrue(UpcomingAppointments._noteFortheVetHeaderText.isDisplayed());
        softassert.assertAll();
		logger.info("the user can tap on the caret icon or View/edit to expand the appointment card");
	}
	
	@And("^the user should scroll down to Reschedule and Cancel CTA$")
	public void the_user_should_scroll_down_to_Reschedule_and_Cancel_CTA() throws Throwable {
		Thread.sleep(600);
        try {
        	TapElement(UpcomingAppointments._editAndEditCTA);
		} catch (Exception e) {
			TapElement(UpcomingAppointments._caretCTA);
		}
        Thread.sleep(400);
        swipeDown();
		logger.info("the user should scroll down to Reschedule and Cancel CTA");
	}
	
	@And("^the user should see New patient and Adopted pet exam$")
	public void the_user_should_see_New_patient_and_Adopted_pet_exam() throws Throwable {
		Thread.sleep(600);
		TapElement(UpcomingAppointments._editAndEditCTA);
        Thread.sleep(400);
        if (UpcomingAppointments._appointmentText.isDisplayed()) {
			Assert.assertTrue("Adopted pet exam", UpcomingAppointments._adoptedPetExamText.isDisplayed());
			verifytest(UpcomingAppointments._adoptedPetExamText);
		}
        TapElement(UpcomingAppointments._caretCTA);
		logger.info("the user should see New patient and Adopted pet exam");
	}
	
	@And("^the user will be displayed None when there are no available Notes for the vet$")
	public void the_user_will_be_displayed_None_when_there_are_no_available_Notes_for_the_vet() {
        softassert.assertTrue(UpcomingAppointments._noteFortheVetNoteText.isDisplayed());
		softassert.assertAll();
		verifytest(UpcomingAppointments._noteFortheVetHeaderText);
		logger.info("the user will be displayed None when there are no available Notes for the vet");
	}
	
	@And("^the user can tap on the caret again to collapse the card$")
	public void the_user_can_tap_on_the_caret_again_to_collapse_the_card() throws Throwable {
		 TapElement(UpcomingAppointments._editAndEditCTA);
	     Thread.sleep(400);
	     softassert.assertTrue(UpcomingAppointments._hospitalName.isDisplayed());
		 softassert.assertAll();
		 Thread.sleep(800);
		 TapElement(UpcomingAppointments._caretCTA);
		 Thread.sleep(400);
		 verifytest(UpcomingAppointments._dateAndTimeText);
		 logger.info("the user can tap on the caret again to collapse the card");
	}
	
	@And("^the user can tap on Hospital contact number to open the default dialer with contact number pre-filled$")
	public void the_user_can_tap_on_Hospital_contact_number_to_open_the_default_dialer_with_contact_number_pre_filled() throws Throwable {
		TapElement(UpcomingAppointments._editAndEditCTA);
		Thread.sleep(400);
		verifytest(UpcomingAppointments._UpcomingAppointmentsPetName);
		TapElement(UpcomingAppointments._CallCTA);
		logger.info("the user can tap on Hospital contact number to open the default dialer with contact number pre-filled");
	}
	
	@And("^the user can tap on the hospital address to open the default map with location pre-pinned$")
	public void the_user_can_tap_on_the_hospital_address_to_open_the_default_map_with_location_pre_pinned() throws Throwable {
		TapElement(UpcomingAppointments._editAndEditCTA);
		Thread.sleep(400);
		verifytest(UpcomingAppointments._mapLink);
		TapElement(UpcomingAppointments._mapLink);
		logger.info("the user can tap on the hospital address to open the default map with location pre-pinned");
	}


	@And("^the user should be displayed with the list of upcoming appointments$")
	public void displayed_with_the_list_of_upcoming_appointments() {
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsLogo.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the list of upcoming appointments");
	}
	
	@And("^the user is displayed with the following information on the screen$")
	public void displayed_with_the_following_information_on_the_screen() {
		UpcomingAppointments.verifyUpcomingAppointmentsView();
		logger.info("the user is displayed with the following information on the screen");
	}
	
	@And("^the user will tap on Call CTA to open devices default dialer with hospital number pre-filled$")
	public void tap_on_Call_CTA_to_open_devices_default_dialer_with_hospital_number_pre_filled() {
		TapElement(UpcomingAppointments._CallCTA);
		logger.info("the user will tap on Call CTA to open devices default dialer with hospital number pre-filled");
	}
}
