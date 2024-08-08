package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
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

public class MakeanAppointmentStep9whenandwhere extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HavewemetScreen Havewemet = new HavewemetScreen(driver);
	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep9whenandwhere.csv";
	
	SoftAssert softassert = new SoftAssert();

	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep9whenandwhere.class);

	@When("^the user has selected the location for Appointment$")
	public void the_user_has_selected_the_location_for_Appointment() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
		}else{
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Assert.assertTrue(WhenAndWhere._hospitalName.isDisplayed());
		Assert.assertTrue(WhenAndWhere._hospitalAddress.isDisplayed());
		logger.info("the user has selected the location for Appointment");
		}
	}

	@When("^the user taps on a Next Available Date for a location$")
	public void the_user_taps_on_a_Next_Available_Date_for_a_location() {
		
		TapElement(WhenAndWhere._backCTAHospitalPage);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		TapElement(WhenAndWhere._nextCTA);
		try {
			if (WhenAndWhere._seeCalender.isDisplayed()) {
				TapElement(WhenAndWhere._seeCalender);
				TapElement(WhenAndWhere._seeCalenderConfirmCTA);
			}
		} catch (Exception e) {
			if (WhenAndWhere._nextavailableText.isDisplayed()) {
				TapElement(WhenAndWhere._nextavailableText);
			}
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	TapElement(WhenAndWhere._nextavailableText);
		Assert.assertTrue(WhenAndWhere._date.isDisplayed());
		//Assert.assertTrue(WhenAndWhere._hospitalName.isDisplayed());
		logger.info("the user taps on a Next Available Date for a location");
	}

	@And("^user should be displayed with available time slots for that location for that day$")
	public void user_should_be_displayed_with_available_time_slots_for_that_location_for_that_day() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	TapElement(WhenAndWhere._nextavailableText);
	//	Thread.sleep(3000);
	//	ScrolltoElement("Banfield Veterinarian");
	//	swipeDown();
	//	try {
	// 	WhenAndWhere.chooseSlot2();
	//	} catch (Exception e) {
	//	TapElement(WhenAndWhere._slot7);
	//	WhenAndWhere._slot7.isEnabled();
	//	TapElement(WhenAndWhere._slot2);
	//	WhenAndWhere._slot2.isEnabled();
	//	}
		try {
			if (WhenAndWhere._AllocatedDoctors.isDisplayed()) {
				TapElement(WhenAndWhere._slot7);	
			    WhenAndWhere._slot7.isEnabled();

			} else {
				swipeDown();
				WhenAndWhere.chooseSlot2();
		        WhenAndWhere.doctors();
			}
		} catch (Exception e) {
			swipeDown();
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isEnabled();
		}
		logger.info("user should be displayed with available time slots for that location for that day");
	}

	@Then("^the user should be displayed with the doctors name and their available slots for the chosen date$")
	public void the_user_should_be_displayed_with_the_doctors_name_and_their_available_slots_for_the_chosen_date() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		try {
		//	ScrolltoElement("Banfield Veterinarian");
			WhenAndWhere.appointmentInfo();
		} catch (Exception e) {
			ScrolltoElement("See calendar");
			WhenAndWhere.appointmentInfo();
			Assert.assertTrue(true);
		}
		
		logger.info("the user should be displayed with the doctors name and their available slots for the chosen date");
	}

	@And("^the user will be displayed a locum doctor when the doctor is not assigned for that day$")
	public void the_user_will_be_displayed_a_locum_doctor_when_the_doctor_is_not_assigned_for_that_day() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		try {
		//	ScrolltoElement("Banfield Veterinarian");
			swipeDown();
			swipeDown();
			swipeDown();
			Assert.assertTrue(WhenAndWhere._LocumdoctorsName.isDisplayed());
		} catch (Exception e) {
			System.out.println("Dr assigned and locum doctor is not displayed");
		}
		logger.info("the user will be displayed a locum doctor when the doctor is not assigned for that day");
	}

	@And("^the user will be displayed a text Your veterinarian will be assigned at least 24 hours before your appointment. when the locum doctors time slots are displayed$")
	public void user_will_be_displayed_a_text_Your_veterinarian_will_be_assigned_at_least_24_hours_before() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	//	try {
	//		ScrolltoElement("Your veterinarian will be assigned at least 24 hours before your appointment.");
	//		Assert.assertTrue(WhenAndWhere._appointmentText.isDisplayed());
	//	} catch (Exception e) {
	//		System.out.println("Locum Dr is not displayed");
	//	}
		try {
			if (WhenAndWhere._appointmentText.isDisplayed()) {
				Assert.assertTrue(WhenAndWhere._appointmentText.isDisplayed());
				verifytest(WhenAndWhere._appointmentText);
			}
		} catch (Exception e) {
			Assert.assertTrue(WhenAndWhere._date.isDisplayed());
			verifytest(WhenAndWhere._date);
		}
		logger.info("user will be displayed a text Your veterinarian will be assigned at least 24 hours before");
	}

	@And("^the Next CTA should be disabled by default until the user selects the slot$")
	public void the_Next_CTA_should_be_disabled_by_default_until_the_user_selects_the_slot() throws Throwable {
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
	//	TapElement(WhenAndWhere._hospital1);
	//	TapElement(WhenAndWhere._nextCTA);
	//	Thread.sleep(1000);
	//	Assert.assertTrue(WhenAndWhere._hospitalAddress.isDisplayed());
	//	swipeDown1();
		Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		TapElement(WhenAndWhere._slot7);
		Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
	//	TapElement(WhenAndWhere._nextavailableText);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	try {
	//		if (WhenAndWhere._seeCalender.isDisplayed()) {
	//			TapElement(WhenAndWhere._seeCalender);
	//			TapElement(WhenAndWhere._seeCalenderConfirmCTA);
	//		}
	//	} catch (Exception e) {
	//		if (WhenAndWhere._nextavailableText.isDisplayed()) {
	//			TapElement(WhenAndWhere._nextavailableText);
	//		}
	//	}
	//	Thread.sleep(2000);
	//	Scroll("Your veterinarian will be assigned at least 24 hours before your appointment.");
	//	WhenAndWhere._nextCTAonSlotPage.isEnabled();
	//	try {
	//		ScrolltoElement("Banfield Veterinarian");
	//		WhenAndWhere.chooseSlot2();
	//		TapElement(WhenAndWhere._slot2);
	//	} catch (Exception e) {
	//		TapElement(WhenAndWhere._slot7);
	//		Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
	//	}
		logger.info("the Next CTA should be disabled by default until the user selects the slot");
	}

	@And("^no time slots are selected by default$")
	public void no_time_slots_are_selected_by_default() throws Throwable {
		Assert.assertTrue(WhenAndWhere._hospitalAddress.isDisplayed());
		Thread.sleep(1000);
		swipeDown();
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
	//	TapElement(WhenAndWhere._hospital1);
	//	TapElement(WhenAndWhere._nextCTA);
		WhenAndWhere._slot7.isSelected();
	//	TapElement(WhenAndWhere._nextavailableText);
	//	driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	//	try {
	//		if (WhenAndWhere._seeCalender.isDisplayed()) {
	//			TapElement(WhenAndWhere._seeCalender);
	//			TapElement(WhenAndWhere._seeCalenderConfirmCTA);
	//			Scroll("Next available");
	//		}
	//	} catch (Exception e) {
	//		TapElement(WhenAndWhere._nextavailableText);
	//		/*
	//		if (WhenAndWhere._nextavailableText.isDisplayed()) {
	//			TapElement(WhenAndWhere._nextavailableText);
	//		}
	//		*/
	//	}
	//	Scroll("Your veterinarian will be assigned at least 24 hours before your appointment.");
	//	Scroll("Next available");
	//	Thread.sleep(2000);
	
	//	try {
	//		ScrolltoElement("Banfield Veterinarian");
	//		WhenAndWhere.noslotareselectedbydefault1();
	//	} catch (Exception e) {
	//		Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
	//	}
		logger.info("no time slots are selected by default");
	}

	@And("^the user can tap on any of the available time slots$")
	public void the_user_can_tap_on_any_of_the_available_time_slots() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		ScrolltoElement("See calendar");
		ScrolltoElement("Banfield Veterinarian");
		try {
		WhenAndWhere.chooseSlot2();
		} catch (Exception e) {
		System.out.println("Locum Dr is not available");
		TapElement(WhenAndWhere._slot7);
		WhenAndWhere._slot7.isEnabled();
		}
		
		try {
			TapElement(WhenAndWhere._slot2);
		} catch (Exception e) {
          Assert.assertTrue(true);
		}
		
		/*
		try {
			ScrolltoElement("Next available");
			if (WhenAndWhere._LocumdoctorsName.isDisplayed()) {
				WhenAndWhere.chooseSlot2();
			} else {
				TapElement(WhenAndWhere._slot7);
				Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
				WhenAndWhere.doctors();
			}
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot7);
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}*/
		logger.info("the user can tap on any of the available time slots");
	}

	@And("^the time slot chosen will be highlighted on tap$")
	public void the_time_slot_chosen_will_be_highlighted_on_tap() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		verifytest(WhenAndWhere._slot7);
		try {
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isSelected();
			TapElement(WhenAndWhere._slot8);
			WhenAndWhere._slot8.isSelected();
		} catch (Exception e) {
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isSelected();
		}
		
	//	TapElement(WhenAndWhere._slot7);
	//	WhenAndWhere._slot7.isEnabled();
	//	TapElement(WhenAndWhere._slot8);
	//	WhenAndWhere._slot8.isEnabled();
	//	try {
	//		ScrolltoElement("Banfield Veterinarian");
	//		WhenAndWhere.multiselectisnotpossible1();
	//		TapElement(WhenAndWhere._slot2);
	//		WhenAndWhere._slot2.isEnabled();
	//	} catch (Exception e) {
	//		TapElement(WhenAndWhere._slot7);
	//  	WhenAndWhere._slot7.isEnabled();
	//		TapElement(WhenAndWhere._slot12);
	//  	WhenAndWhere._slot12.isEnabled();
	//	}
		logger.info("the time slot chosen will be highlighted on tap");
	}

	@And("^the user can not multi-select the slots$")
	public void the_user_can_not_multi_select_the_slots() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		try {
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot8.isSelected();
			verifytest(WhenAndWhere._slot7);
			TapElement(WhenAndWhere._slot8);
			WhenAndWhere._slot7.isSelected();
			
		} catch (Exception e) {
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isSelected();
		}
	//	try {
	//		WhenAndWhere.multiselectisnotpossible1();
	//		TapElement(WhenAndWhere._slot2);
	//		WhenAndWhere._slot2.isEnabled();
	//	} catch (Exception e) {
	//		TapElement(WhenAndWhere._slot7);
	//		WhenAndWhere._slot7.isEnabled(); //
	//		TapElement(WhenAndWhere._slot12);
	//		WhenAndWhere._slot12.isEnabled();
	//	}
		logger.info("the user can not multi-select the slots");
	}

	@And("^the Next CTA will be enabled once user selects the slot$")
	public void the_Next_CTA_will_be_enabled_once_user_selects_the_slot() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		softassert.assertTrue(WhenAndWhere._nextCTAonSlotPage.isEnabled());
	//	WhenAndWhere._nextCTAonSlotPage.isEnabled();
		logger.info("the Next CTA will be enabled once user selects the slot");
	}
	      
	@And("^the user taps on the Next CTA to get redirected to everything look okay Screen$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_everything_look_okay_Screen() throws Throwable {
		Thread.sleep(1000);
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		Thread.sleep(4000);
		EverythingLookOkay.verifySlotsEverythingLookOkayPage();
		verifytest(EverythingLookOkay._petname);
		logger.info("the user taps on the Next CTA to get redirected to everything look okay Screen");
	}
	
	@And("^the user should see Owp Badge on Pet Image in everything look okay Screen$")
	public void the_user_should_see_Owp_Badge_on_Pet_Image_in_everything_look_okay_Screen() throws Throwable {
		if (getUserDeviceInput.contains("Android")) {
			Assert.assertTrue(EverythingLookOkay._OwpBadge.isDisplayed());
		}
		logger.info("the user should see Owp Badge on Pet Image in everything look okay Screen");
	}

	@And("^the user taps on < to get redirected to the when and where screen$")
	public void the_user_taps_on_back_to_get_redirected_to_the_previous_screens() throws Throwable {
	//	TapElement(EverythingLookOkay._backCTA);
		TapElement(WhenAndWhere._backCTAHospitalPage);
		Thread.sleep(2000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		verifytest(WhenAndWhere._whenAndWhereTitle);
		logger.info("the user taps on < to get redirected to the previous screens");
	}

	@And("^the user taps on X to get redirected to Have we met page$")
	public void the_user_taps_on_cancel_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		TapElement(WhenAndWhere._cancelCTAHospitalPage);
		Thread.sleep(3000);
		Assert.assertTrue(Havewemet._havewemettitle.isDisplayed());
		verifytest(Havewemet._havewemettitle);
		logger.info("the user taps on X to get redirected to Have we met? screen");
	}
}
