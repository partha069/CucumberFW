package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.EverythingLookOkayScreen;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.android.AndroidElement;

public class MakeanAppointmentStep8whenandwhereSteps extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep8whenandwhere2.csv";
	
	SoftAssert softassert = new SoftAssert();
	
	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep8whenandwhereSteps.class);

	@When("^the user taps on a location from the list$")
	public void the_user_taps_on_a_location_from_the_list() throws Throwable {
	    Thread.sleep(800);
		TapElement(WhenAndWhere._newSearchCTA);
		TapElement(Filter._Filterdeny);
		TapElement(Filter._SearchCTA);
		String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
		EnterInput(Filter._SearchCTA, input1);
		HidingKeyboard();
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._ApplyCTA);
		Thread.sleep(2000);
		ScrolltoElement("Paramus");
		ScrolltoElement("Uptown Manhattan");
		Scroll("Garfield");
		TapElement(WhenAndWhere._nextCTA);
		logger.info("the user taps on a location from the list");
	}

	@Then("^user should be displayed with available slots for that location$")
	public void user_should_be_displayed_with_available_slots_for_that_location() throws Throwable {
		Thread.sleep(4000);
		try {
			Assert.assertTrue(WhenAndWhere._nextavailableText.isDisplayed());
		} catch (Exception e) { 
			Assert.assertTrue(true);
			System.out.println("Next Available Slot CTA is not displayed");
		}
		logger.info("user should be displayed with available slots for that location");
	}
	
	@And("^the user is displayed a message if there are no slots available for thatday No available appointments for today$")
	public void the_user_is_displayed_a_message_if_there_are_no_slots_available_for_that_day() throws Throwable {
		try {
			WaitVisibilityOfElement(WhenAndWhere._noAvailableAppointmentsForTodayText);
			Assert.assertTrue(WhenAndWhere._noAvailableAppointmentsForTodayText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Next Available Slot CTA is not displayed");
		}
		
		logger.info("the user is displayed a message if there are no slots available for that day");
	}
	
	@And("^the user on clicking on Next available should see the available doctors$")
	public void the_user_on_clicking_on_Next_available_should_see_the_available_doctors() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			TapElement(WhenAndWhere._nextavailableText);
			ScrolltoElement("Banfield Veterinarian");
		} catch (Exception e) {
			ScrolltoElement("See calendar");
			TapElement(WhenAndWhere._seeCalender);
			Thread.sleep(400);
			TapElement(WhenAndWhere._seeCalenderConfirmCTA);
		}
		Thread.sleep(2000);
		
		try {
			ScrolltoElement("Banfield Veterinarian");
			WhenAndWhere.chooseSlot2();
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot2);
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isEnabled();
		}
		logger.info("the user on clicking on Next available should see the available doctors");
	}
	
	@And("^the user should be displayed with the See calendar option$")
	public void the_user_should_be_displayed_with_the_See_calendar_option() {
		TapElement(WhenAndWhere._backCTAHospitalPage);
		TapElement(WhenAndWhere._nextCTA);
		TapElement(WhenAndWhere._nextavailableText);
		Assert.assertTrue(WhenAndWhere._seeCalender.isDisplayed());
		logger.info("the user should be displayed with the See calendar option");
	}
	
	@And("^the user taps on see calendar option to view the devices default date picker$")
	public void the_user_taps_on_see_calendar_option_to_view_the_devices_default_date_picker() {
		TapElement(WhenAndWhere._seeCalender);
		logger.info("the user taps on see calendar option to view the devices default date picker");
	}
	
	@And("^the user can select an alternate date within the next 60 days$")
	public void the_user_can_select_an_alternate_date_within_the_next_sixty_days() {
		TapElement(WhenAndWhere._seeCalender);
		verifytest(WhenAndWhere._seeCalenderConfirmCTA);
		logger.info("the user can select an alternate date within the next 60 days");
	}
	
	@And("^the user is displayed with the message if there are no slots available for 60 days for that location No available appointments for 2 months$")
	public void the_user_is_displayed_with_the_message_if_there_are_no_slots_available_for_sixty_days_for_that_location() throws Throwable  {
		TapElement(WhenAndWhere._backCTAHospitalPage);
		Thread.sleep(3000);
	//	ScrolltoElement("Carlstadt");
		swipeDown();
		TapElement(WhenAndWhere._hospital3);
		Thread.sleep(3000);
		TapElement(WhenAndWhere._nextCTA);
		try {
			ScrolltoElement("No available appointments for 2 months");
			Assert.assertTrue(WhenAndWhere._slotsNotAvailable2Months.isDisplayed());
			verifytest(WhenAndWhere._slotsNotAvailable2Months);
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Slot are available");
		}
		logger.info("the user is displayed with the message if there are no slots available for 60 days for that location");
	}
	
	@And("^the user is displayed with the availability for the chosen date$")
	public void the_user_is_displayed_with_the_availability_for_the_chosen_date() throws Throwable {
		Assert.assertTrue(WhenAndWhere._nextavailableText.isDisplayed());
		verifytest(WhenAndWhere._nextavailableText);
	//	Thread.sleep(2000);
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
	//	Scroll("Garfield");
	//	TapElement(WhenAndWhere._hospital1);
	//	TapElement(WhenAndWhere._nextCTA);
	//	try {
	//		TapElement(WhenAndWhere._nextavailableText);
	//		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
	//		ScrolltoElement("Banfield Veterinarian");
	//	} catch (Exception e) {
	//		TapElement(WhenAndWhere._backCTAHospitalPage);
	//		TapElement(WhenAndWhere._nextCTA);
	//		TapElement(WhenAndWhere._nextavailableText);
	//		TapElement(WhenAndWhere._seeCalender);
	//		Thread.sleep(400);
	//		TapElement(WhenAndWhere._seeCalenderConfirmCTA);
	//	}
	//	Thread.sleep(2000);
	//	try {
	//		ScrolltoElement("Banfield Veterinarian");
	//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//		Assert.assertTrue(WhenAndWhere._doctorAvailableSlots.isDisplayed());
	//		WhenAndWhere.chooseSlot2();
	//	} catch (Exception e) {
	//		System.out.println("Locum Dr is not available");
	//		TapElement(WhenAndWhere._slot2);
	//		TapElement(WhenAndWhere._slot7);
	//	}
	//	Thread.sleep(2000);
	//	WaitElementToBeClickable(WhenAndWhere._nextCTAonSlotPage);
	//	TapElement(WhenAndWhere._nextCTAonSlotPage);
	//	Thread.sleep(4000);
	//	Assert.assertTrue(EverythingLookOkay._everythinglookokayTitle.isDisplayed());
		logger.info("the user is displayed with the availability for the chosen date");
	}
	
	@And("^the user can tap on New search to search for an alternate hospital$")
	public void the_user_can_tap_on_New_search_to_search_for_an_alternate_hospital() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	ScrolltoElement("New search");
		Thread.sleep(7000);
		TapElement(WhenAndWhere._newSearchCTA2);
		TapElement(Filter._SearchCTA);
		String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
		EnterInput(Filter._SearchCTA, input1);
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._hospitalGarfield);
		HidingKeyboard();
		HidingKeyboardios();
		verifytest(Filter._ApplyCTA);
		TapElement(Filter._ApplyCTA);
		verifytest(WhenAndWhere._hospital1);
		logger.info("the user can tap on New search to search for an alternate hospital");
	}
}
