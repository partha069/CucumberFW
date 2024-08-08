package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.ChatScreen;
import com.bma.pageObject.EverythingLookOkayScreen;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.YouareAllSetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeanAppointmentStep11YouareAllSet extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HavewemetScreen Havewemet = new HavewemetScreen(driver);
	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public YouareAllSetScreen YouareAllSet = new YouareAllSetScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public LetsgetstartedSteps letsgetstarted =  new LetsgetstartedSteps(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public ChatScreen Chat = new ChatScreen(driver);
	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep9whenandwhere.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep11YouareAllSet.class);

	@When("^user tapped on Make an Appointment from the Everything look okay screen$")
	public void user_tapped_on_Make_an_Appointment_from_the_Everything_look_okay_screen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			if (WhenAndWhere._seeCalender.isDisplayed()) {
				TapElement(WhenAndWhere._seeCalender);
				Thread.sleep(400);
				TapElement(WhenAndWhere._seeCalenderConfirmCTA);
			}
		} catch (Exception e) {
			if (WhenAndWhere._nextavailableText.isDisplayed()) {
				TapElement(WhenAndWhere._nextavailableText);
			}
		}
		
		/*
		Thread.sleep(2000);
		ScrolltoElement("Your veterinarian will be assigned at least 24 hours before your appointment.");
		ScrolltoElement("Next available");
		try {
			WhenAndWhere.chooseSlot2();
		} catch (Exception e) {
		//	WhenAndWhere.chooseSlot3();
			TapElement(WhenAndWhere._slot7);
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		*/
		
		try {
		//	ScrolltoElement("Next available");
			ScrolltoElement("Your veterinarian will be assigned at least 24 hours before your appointment.");
			if (WhenAndWhere._LocumdoctorsName.isDisplayed()) {
				WhenAndWhere.chooseSlot2();
			}else {
				TapElement(WhenAndWhere._slot7);
				Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
			}
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot7);
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		Thread.sleep(200);
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		Thread.sleep(3500);
		Assert.assertTrue(EverythingLookOkay._everythinglookokayTitle.isDisplayed());
		logger.info("user tapped on Make an Appointment from the Everything look okay screen");
	}

	@When("^they are redirected to the Youre all set screen$")
	public void they_are_redirected_to_the_Youre_all_set_screen() throws Throwable {
		TapElement(EverythingLookOkay._makeAppointmentCTA);
		Thread.sleep(3000);
		WaitVisibilityOfElement(YouareAllSet._titleText);
		Assert.assertTrue(YouareAllSet._titleText.isDisplayed());
		logger.info("they are redirected to the Youre all set screen");
	}

	@Then("^the user should be displayed the following information Static Text,Pet Names Visit, Time, Date, Static Text Location, Doctor Information,"
			+ "Name of the user who booked the appointment, Phone number of the user, Email of the user$")
	public void the_user_should_be_displayed_the_information() throws Throwable {
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {	
		TapElement(YouareAllSet._ratingsPopups);
		}else{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		verifytest(YouareAllSet._petNameText);
		Thread.sleep(5000);
		YouareAllSet.verifyYourallsetPageForLoggedInUser();
		logger.info("the user should be displayed the following information");
		}	
	}
	
	@And("^the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to$") // Owp User - Logged-In User
	public void the_user_wants_to_view_OWP_wigets_and_static_text_all_CTAs() throws Throwable {
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {	
		TapElement(YouareAllSet._ratingsPopups);
		}
		Thread.sleep(3000);
		Assert.assertTrue(YouareAllSet._petNameText.isDisplayed());
		Thread.sleep(1000);
		swipeDown();
		swipeDown();
		swipeDown();
		YouareAllSet.verifyOWPTextAndCTA();
		verifytest(YouareAllSet._callCTA);
		logger.info("the user wants to view OWP wigets and its static text and Other CTAs as Call, Reschedule, cancel, add to");
	}
	
	@And("^the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to$") // Owp User - Guest User 
	public void the_user_wants_to_view_OWP_wigets_and_static_text_all_other_CTAs() throws Throwable {
		swipeDown();
		swipeDown();
		swipeDown();
		YouareAllSet.verifyOWPTextAndCTAforGuestUser();
		logger.info("the user wants to view OWP wigets and its static text and Other CTAs as Call, cancel, add to");
	}
	
	@And("^the user wants to view Other CTAs as Call, cancel, add to CTA$") // Non Owp User - Guest User 
	public void the_user_wants_to_view_other_CTAs() throws Throwable {
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {	
		TapElement(YouareAllSet._ratingsPopups);
		}
		Thread.sleep(3000);
		Assert.assertTrue(YouareAllSet._petNameText.isDisplayed());
		Thread.sleep(1000);
		swipeDown();
		swipeDown();
		swipeDown();
		YouareAllSet.verifyNonOWPTextAndCTAforGuestUser();
		verifytest(YouareAllSet._callCTA);
		logger.info("the user wants to view Other CTAs as Call, cancel, add to CTA");
	}
	
	@And("^the user wants to view Owp Badge on Pet Image in Youre all set screen$")
	public void the_user_wants_to_view_Owp_Badge_on_Pet_Image_in_Youre_all_set_screen() throws Throwable {
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {	
		TapElement(YouareAllSet._ratingsPopups);
		}
		Thread.sleep(3000);
		Assert.assertTrue(YouareAllSet._petNameText.isDisplayed());
		if (getUserDeviceInput.contains("Android")) {
			Assert.assertTrue(YouareAllSet._OwpBadge.isDisplayed());
		}
		Thread.sleep(1000);
		swipeDown();
		swipeDown();
		swipeDown();
		YouareAllSet.verifyNonOWPTextAndCTAforGuestUser();
		verifytest(YouareAllSet._callCTA);
		logger.info("the user wants to view Owp Badge on Pet Image in Youre all set screen");
	}
	
	@And("^the user wants to view Other CTAs as Call, cancel, add to$") // Non Owp User - Logged-In User
	public void the_user_wants_all_other_CTAs() throws Throwable {
		Thread.sleep(1000);
		swipeDown();
		swipeDown();
		swipeDown();
		YouareAllSet.verifyNonOWPTextAndCTAforLoggedinUser();
		verifytest(YouareAllSet._callCTA);
		logger.info("the user wants to view Other CTAs as Call, cancel, add to");
	}
	
	@And("^the user will not be displayed the Notes for the vet if the user has not provided any notes.$")
	public void the_user_will_not_be_displayed_the_Notes_for_the_vet_if_the_user_has_not_provided_any_notes() throws Throwable {
		YouareAllSet.verifyAppointmentsTypeAndNotes();
		logger.info("the user will not be displayed the Notes for the vet if the user has not provided any notes.");
	}
	
	@And("^User should able to see Cancel UI Popups$")
	public void User_should_able_to_see_Cancel_UI_Popups() throws Throwable {
		TapElement(YouareAllSet._CancelCTA);
		YouareAllSet.verifyedCancelAppPopups();
		logger.info("User should able to see Cancel UI Popups");
	}
	
	@And("^the user tap on No CTA to get a pop-up message$")
	public void the_user_tap_on_NoCTA_to_get_a_popup_message() throws Throwable {
		TapElement(YouareAllSet._cancelAppo_NoCTA);
		logger.info("the user tap on No CTA to get a pop-up message");
	}
	
	@And("^the user tap on X icon to remain on the same page Youre all set screen$")
	public void the_user_tap_on_X_icon_to_remain_on_the_same_page_Youre_all_set_screen() throws Throwable {
		TapElement(YouareAllSet._CancelCTA);
		TapElement(YouareAllSet._cancelAppo_CloseCTA);
		Thread.sleep(1000);
		Assert.assertTrue(YouareAllSet._CancelCTA.isDisplayed());
		verifytest(YouareAllSet._CancelCTA);
		logger.info("the user tap on X icon to remain on the same page Youre all set screen");
	}
	
	@And("^the user tap on Yes CTA to get a pop-up message$")
	public void the_user_tap_on_Yes_CTA_to_get_a_popup_message() throws Throwable {
		Thread.sleep(1000);
		TapElement(YouareAllSet._cancelAppo_YesCTA); 
		Thread.sleep(3000);
		YouareAllSet.verifyedConfirmationAppPopups();
		logger.info("the user tap on Yes CTA to get a pop-up message");
	}
	
	@And("^the user taps on Close icon to dismiss the pop-up$")
	public void the_user_taps_on_Close_icon_t0_dismiss_the_popup() throws Throwable {
		Thread.sleep(200);
		TapElement(YouareAllSet._cancelConfirmation_CloseCTA); 
		logger.info("the user taps on Close icon to dismiss the pop-up");
	}
	
	@And("^the user taps on Close icon to dismiss the popup$")
	public void the_user_taps_on_Close_icon_t0_dismiss_the_pop_up() throws Throwable {
		Thread.sleep(200);
		YouareAllSet.verifyedConfirmationAppPopup();
		TapElement(YouareAllSet._confirmation_CloseCTA);
		Thread.sleep(1000);
		Assert.assertTrue(YouareAllSet._CancelCTA.isDisplayed());
		verifytest(YouareAllSet._CancelCTA);
		logger.info("the user taps on Close icon to dismiss the popup");
	}
	
	@And("^after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Upcoming Appointment Screen$")
	public void after_the_appointment_is_cancelled_user_will_be_redirected_to_where_he_initiated_the_make_appointment_flow_from_Upcoming_Appointment_Screen() throws Throwable {
		try {
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='schedule/slotavailability/next']"));	
			}else {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='MySchedules/screen/makeanappointment-btn']"));
			}
		} catch (Exception e) {
			
		}
    //  Thread.sleep(50000);
		if (getUserDeviceInput.contains("Android")) {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);	
		}
		try {
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA1.isDisplayed());
			verifytest(UpcomingAppointments._UpcomingAppointmentsCTA1);
		} catch (Exception e) {
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
			verifytest(UpcomingAppointments._UpcomingAppointmentsCTA);
		}
		logger.info("after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Upcoming Appointment Screen");
	}
	
	@And("^after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from chat and more$")
	public void after_the_appointment_is_cancelled_user_will_be_redirected_to_where_he_initiated_the_make_appointment_flow_chat_and_more() throws Throwable {
		Thread.sleep(3000);
		verifytest(Chat._MakeaAppointmentCTA);
		Assert.assertTrue(Chat._MakeaAppointmentCTA.isDisplayed());
		logger.info("after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from chat and more");
	}
	
	@And("^after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location$")
	public void after_the_appointment_is_cancelled_user_will_be_redirected_to_where_he_initiated_the_make_appointment_flow_from_prefer_location() throws Throwable {
		Thread.sleep(3000);
		verifytest(Home._MakeAnAppointmentCTA);
		Assert.assertTrue(Home._MakeAnAppointmentCTA.isDisplayed());
		logger.info("after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from prefer location");
	}
	
	
	@And("^after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from Highlights pet profile$")
	public void after_the_appointment_is_cancelled_user_will_be_redirected_to_where_he_initiated_the_make_appointment_flow_from_Highlights_pet_profile() throws Throwable {
		Thread.sleep(3000);
		verifytest(PetCard._makeAnAppointmentCTAHighlights);
		Assert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
		logger.info("after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow Highlights from pet profile");
	}
	
	@And("^after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow from TimeLine pet profile$")
	public void after_the_appointment_is_cancelled_user_will_be_redirected_to_where_he_initiated_the_make_appointment_flow_from_TimeLine_pet_profile() throws Throwable {
		Thread.sleep(3000);
		verifytest(PetCard._makeAnAppointmentCTATimeLine);
		Assert.assertTrue(PetCard._makeAnAppointmentCTATimeLine.isDisplayed());
		logger.info("after the appointment is cancelled, user will be redirected to where he initiated the make appointment flow TimeLine from pet profile");
	}
	
	@And("^after the appointment is cancelled, user will be redirected to the where he initiated the make appointment flow from prefer loc not set$")
	public void appointment_is_cancelled_user_will_be_redirected_to_the_where_he_initiated_the_make_appointment_flow_from_prefer_loc_not_set() throws Throwable {
		Thread.sleep(3000);
		verifytest(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
		Assert.assertTrue(FindaLocationNearYou._MakeAppoCTA_LoggedinUser.isDisplayed());
		logger.info("after the appointment is cancelled, user will be redirected to the where he initiated the make appointment flow from prefer loc not set");
	}
	
	@And("^After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled$")
	public void After_the_appointment_is_cancelled_user_will_be_redirected_to_Lets_get_started_screen_with_the_information_prefilled() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(letsgetstarted._firstName.isDisplayed());
		Assert.assertTrue(letsgetstarted._lastName.isDisplayed());
		Assert.assertTrue(letsgetstarted._phone.isDisplayed());
		Assert.assertTrue(letsgetstarted._email.isDisplayed());
		verifytest(letsgetstarted._firstName);
		logger.info("After the appointment is cancelled, user will be redirected to Lets get started screen with the information prefilled");
	}
	
	@And("^After the appointment is cancelled, user will be redirected to Find a location near you screen with the information prefilled$")
	public void After_the_appointment_is_cancelled_user_will_be_redirected_to_Find_a_location_near_you_screen_with_the_information_prefilled() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(FindaLocationNearYou._MakeAppoCTA_LoggedinUser.isDisplayed());
		verifytest(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
		logger.info("After the appointment is cancelled, user will be redirected to Find a location near you screen with the information prefilled");
	}
	
	@And("^the user taps on Add to calendar CTA to add the appointment to the device calendar$")
	public void the_user_taps_on_Add_to_calendar_CTA_to_add_the_appointment_to_the_device_calendar() throws Throwable {
		Thread.sleep(1000);
		TapElement(YouareAllSet._addtoCalendar); 
		TapElement(YouareAllSet._allowPopups);
		Thread.sleep(700);
		TapElement(YouareAllSet._okPopups);
		Thread.sleep(3000);
		verifytest(YouareAllSet._CancelCTA);
		logger.info("the user taps on Add to calendar CTA to add the appointment to the device calendar");
	}
	
	@And("^the user can tap on Call CTA to open the default dialer with Hospital phone number pre-filled$")
	public void the_user_can_tap_on_Call_CTA_to_open_the_default_dialer_with_Hospital_phone_number_pre_filled() throws Throwable {
		Thread.sleep(1000);
		verifytest(YouareAllSet._callCTA);
		TapElement(YouareAllSet._callCTA);
		logger.info("the user can tap on Call CTA to open the default dialer with Hospital phone number pre-filled");
	}
	
	@And("^the user tap on Done CTA")
	public void the_user_tap_on_Done_CTA() throws Throwable {
		TapElement(YouareAllSet._doneCTA);
		logger.info("the user tap on Done CTA");
	}
	
	
	@Then("^the user should be displayed the Phone number of the user$")
	public void the_user_should_be_displayed_the_Phone_number_of_the_user() throws Throwable {
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {	
		}else{
		Thread.sleep(3000);
	//	ScrolltoElement("Your information");
		swipeDown();
		softassert.assertTrue(YouareAllSet._contactPhoneText.isDisplayed());
		softassert.assertAll();
		verifytest(YouareAllSet._contactPhoneText);
		logger.info("the user should be displayed the following information");
	}
	}

	@And("^the user taps on Add to Calendar CTA to add the appointment to the device calendar$")
	public void the_user_taps_on_Add_to_Calendar_CTA_to_add_the_appointment_to_the_device_calendar() throws Throwable {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(9000);
		ScrolltoElement("Add to");
		TapElement(YouareAllSet._addtoCalendar);
		TapElement(YouareAllSet._allowPopups);
		Assert.assertTrue(YouareAllSet._appointmentaddedPopups.isDisplayed());
		TapElement(YouareAllSet._okPopups);
		logger.info("the user taps on Add to Calendar CTA to add the appointment to the device calendar");
	}
	
	@And("^the user taps on the Add to Calendar CTA to add the appointment to the device calendar$")
	public void the_user_taps_on_the_Add_to_Calendar_CTA_to_add_the_appointment_to_the_device_calendar() throws Throwable {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(9000);
		swipeDown();
		TapElement(YouareAllSet._addtoCalendar);
		TapElement(YouareAllSet._allowPopups);
		Assert.assertTrue(YouareAllSet._appointmentaddedPopups.isDisplayed());
		verifytest(YouareAllSet._appointmentaddedPopups);
		TapElement(YouareAllSet._okPopups);
		logger.info("the user taps on the Add to Calendar CTA to add the appointment to the device calendar");
	}

	@And("^the user taps on Done to get redirected to the Welcome Screen$")
	public void the_user_taps_on_Done_to_get_redirected_to_the_Welcome_Screen() throws Throwable { 
		try {
			if (getUserDeviceInput.contains("IOS")) {
				TapElement(YouareAllSet._ratingsPopups);
			}
		} catch (Exception e) {	
			assert(true);
		}
		TapElement(YouareAllSet._doneCTA);
		Thread.sleep(3000);
		ViewWelcome.verifyWelcomeScreenUIElement();
		verifytest(ViewWelcome._makeAppointmentAsGuestbutton);
		logger.info("the user taps on Done to get redirected to the Welcome Screen");

	}
	
	@And("^the user taps on Done to get redirected to the Welcome Screen withoutverifytest$")
	public void the_user_taps_on_Done_to_get_redirected_to_the_Welcome_Screen_withoutverifytest() throws Throwable {
	//	try {
	//		if (getUserDeviceInput.contains("IOS")) {
	//			TapElement(YouareAllSet._ratingsPopups);
	//		}
	//	} catch (Exception e) {	
	//		Assert.assertTrue(true);
	//	}
		TapElement(YouareAllSet._doneCTA);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on Done to get redirected to the Welcome Screen");

	}
	

	@And("^user taps on X to get redirected to the Welcome Screen$")
	public void user_taps_on_close_to_get_redirected_to_the_Welcome_Screen() throws Throwable {
		TapElement(EverythingLookOkay._makeAppointmentCTA);
		Thread.sleep(3000);
		WaitVisibilityOfElement(YouareAllSet._titleText);
		Assert.assertTrue(YouareAllSet._titleText.isDisplayed());
		TapElement(YouareAllSet._cancelCTA);
		Thread.sleep(3000);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on X to get redirected to the Welcome Screen");
	}
	

}
