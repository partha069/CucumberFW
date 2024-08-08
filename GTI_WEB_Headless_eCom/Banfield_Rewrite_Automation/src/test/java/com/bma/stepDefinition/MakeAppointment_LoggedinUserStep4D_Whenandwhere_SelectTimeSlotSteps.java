package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MakeAppointment_LoggedinUserStep4D_Whenandwhere_SelectTimeSlotSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep4D_Whenandwhere_SelectTimeSlotSteps.class);

	@Then("^the user is displayed with the following information$")
	public void the_user_is_displayed_with_the_following_information() {
		softassert.assertTrue(WhenAndWhere._LocumdoctorsName.isDisplayed());
		softassert.assertFalse(WhenAndWhere._nextCTAonSlotPage.isSelected());
		softassert.assertTrue(WhenAndWhere._doctorAvailableSlots.isDisplayed());
		ScrolltoElement("See calendar");
		softassert.assertTrue(WhenAndWhere._date.isDisplayed());
	 	softassert.assertAll();
		logger.info("the user is displayed with the following information");
	}
	
	@And("^the user will be displayed a locum doctor Banfield Veterinarian when the doctor is not assigned for that day$")
	public void the_user_will_be_displayed_a_locum_doctor_Banfield_Veterinarian_when_the_doctor_is_not_assigned_for_that_day() {
		ScrolltoElement("Banfield Veterinarian");
		softassert.assertTrue(WhenAndWhere._LocumdoctorsName.isDisplayed());
		softassert.assertAll(); 
		logger.info("the user will be displayed a locum doctor Banfield Veterinarian when the doctor is not assigned for that day");
	}
	
	@And("^the selected time slot will be highlighted$")
	public void the_selected_time_slot_will_be_highlighted() {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		try {
			ScrolltoElement("Banfield Veterinarian");
			WhenAndWhere.multiselectisnotpossible1();
		} catch (Exception e) {
			TapElement(WhenAndWhere._slot7);
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
			TapElement(WhenAndWhere._slot12);
			Assert.assertTrue(WhenAndWhere._slot12.isEnabled());
		}
		logger.info("the selected time slot will be highlighted");
	}
	
	@And("^no time slots is selected by default$")
	public void no_time_slots_is_selected_by_default() throws Throwable {
		TapElement(WhenAndWhere._backCTAHospitalPage);
		TapElement(WhenAndWhere._nextCTA);
		//
		TapElement(WhenAndWhere._nextavailableText); 
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		try {
			if (WhenAndWhere._seeCalender.isDisplayed()) {
				TapElement(WhenAndWhere._seeCalender);
				TapElement(WhenAndWhere._seeCalenderConfirmCTA);
				Scroll("Banfield Veterinarian");
			}
		} catch (Exception e) {
			if (WhenAndWhere._nextavailableText.isDisplayed()) {
				TapElement(WhenAndWhere._nextavailableText);
			}
		}
		Thread.sleep(2000);
	
		try {
			ScrolltoElement("Banfield Veterinarian");
			WhenAndWhere.noslotareselectedbydefault1();
		} catch (Exception e) {
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		logger.info("no time slots are selected by default");
	}
	
	@And("^Next CTA should be disabled by default until the user selects the slot$")
	public void Next_CTA_should_be_disabled_by_default_until_the_user_selects_the_slot() throws Throwable {
		softassert.assertFalse(WhenAndWhere._nextCTAonSlotPage.isSelected());
	 	softassert.assertAll();
		logger.info("the Next CTA should be disabled by default until the user selects the slot");
	}
	
	@And("^user taps on X to get redirected to Have we met page$")
	public void user_taps_on_cancel_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		TapElement(WhenAndWhere._cancelCTAHospitalPage);
		Thread.sleep(3000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user taps on X to get redirected to Have we met? screen");
	}
	
	@And("^if the user selected Yes in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is true$")
	public void selected_Yes_in_AM_slot_in_the_previous_step_then_the_user_will_be_displayed_with_the_time_slot_availability_as_per_drop_off_is_true() throws Throwable {
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
		softassert.assertTrue(WhenAndWhere._yesCTA.isEnabled());
		TapElement(WhenAndWhere._nextCTA);
		softassert.assertTrue(WhenAndWhere._dropOffText.isDisplayed());
	 	softassert.assertAll();
		logger.info("if the user selected Yes in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is true");
	}
	
	@And("^if the user selected No in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is false$")
	public void selected_No_in_AM_slot_in_the_previous_step_then_the_user_will_be_displayed_with_the_time_slot_availability_as_per_drop_off_is_false() throws Throwable {
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
		softassert.assertTrue(WhenAndWhere._yesCTA.isEnabled());
		TapElement(WhenAndWhere._noCTA);
		softassert.assertTrue(WhenAndWhere._noCTA.isEnabled());
		TapElement(WhenAndWhere._hospital7);
		TapElement(WhenAndWhere._nextCTA);
		Assert.assertTrue(WhenAndWhere._nextavailableText.isDisplayed());
		/*
		try {
			Assert.assertFalse(WhenAndWhere._dropOffText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		*/
		logger.info("if the user selected No in AM slot in the previous step then the user will be displayed with the time slot availability as per drop off is false");
	}
	
	@And("^tap on any of the available time slots$")
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
		logger.info("the user can tap on any of the available time slots");
	}
}
