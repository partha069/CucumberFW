package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedinUserStep4C_Whenandwhere_SelectDateSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep4C_Whenandwhere_SelectDateSteps.class);

	@And("^the user should be displayed with the following information$")
	public void the_user_should_be_displayed_with_the_following_information() throws Throwable {
		WhenAndWhere.verifyWhereandWhereStep8();
		logger.info("the user should be displayed with the following information");
	}
	
	@And("^the Drop off text is displayed on the top if the user has selected Yes option in AM time slots in the previous steps$")
	public void the_Drop_off_text_is_displayed_on_the_top_if_the_user_has_selected_Yes_option_in_AM_time_slots_in_the_previous_steps() throws Throwable {
		TapElement(WhenAndWhere._backCTAHospitalPage);
		softassert.assertTrue(WhenAndWhere._yesCTA.isEnabled());
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._dropOffText.isDisplayed());
		softassert.assertAll();
		logger.info("the Drop off text is displayed on the top if the user has selected Yes option in AM time slots in the previous steps");
	}
	
	@And("^by default it should display the todays date$")
	public void by_default_it_should_display_the_todays_date() throws Throwable {
		softassert.assertTrue(WhenAndWhere._date.isDisplayed());
		softassert.assertAll();
		logger.info("by default it should display the todays date");
	}
	
	@And("^user wants to verify the phoneno$")
	public void user_wants_to_verify_the_phoneno() throws Throwable {
		softassert.assertTrue(WhenAndWhere._phoneNoText.isDisplayed());
		softassert.assertAll();
		logger.info("user wants to verify the phoneno");
	}
	
	@And("^user wants to verify the SeeCalendar CTA$")
	public void user_wants_to_verify_the_SeeCalendar_CTA() throws Throwable {
		softassert.assertTrue(WhenAndWhere._seeCalender.isDisplayed());
		softassert.assertAll();
		verifytest(WhenAndWhere._seeCalender);
		logger.info("user wants to verify the SeeCalendar CTA");
	}
	
	@And("^the user should be displayed with the available doctors name date or time slots for that location$")
	public void the_user_should_be_displayed_with_the_available_doctors_name_date_or_time_slots_for_that_location() throws Throwable {
        TapElement(WhenAndWhere._nextavailableText);
		ScrolltoElement("Banfield Veterinarian");
        softassert.assertTrue(WhenAndWhere._doctorsName.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the available doctors name date or time slots for that location");
	}
	
	@And("^the user can tap on New search CTA to get redirected to FilterScreen$")
	public void the_user_can_tap_on_New_search_CTA_to_get_redirected_to_Filter_screen() throws Throwable {
		TapElement(WhenAndWhere._newSearchCTA2);
		Thread.sleep(2000);
		softassert.assertTrue(Filter._FilterTitletext.isDisplayed());
		softassert.assertAll();
		logger.info("the user can tap on New search CTA to get redirected to Filter screen");
	}
	
	@And("^the Next CTA should be in disabled state if there are no appointments available for 2 months$")
	public void the_Next_CTA_should_be_in_disabled_state_if_there_are_no_appointments_available_for_2_months() {
	    Assert.assertFalse(WhenAndWhere._nextCTAonSlotPage.isEnabled());
	 	TapElement(WhenAndWhere._backCTAHospitalPage);
	 	TapElement(WhenAndWhere._hospital1);
	 	TapElement(WhenAndWhere._nextCTA);
	 	softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
	 	softassert.assertAll();
		logger.info("the Next CTA should be in disabled state if there are no appointments available for 2 months");
	}
	
	@And("^the user taps on < CTA to get redirected to the previous screen$")
	public void the_user_taps_on_BackCTA_to_get_redirected_to_the_previous_screen() {
		TapElement(WhenAndWhere._backCTAHospitalPage);
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
	 	softassert.assertAll();
		logger.info("the user taps on < CTA to get redirected to the previous screen");
	}
	
	@And("^the user taps on X to get redirected to the screen the clicked on Make appointment or Make an appointment$")
	public void user_taps_on_X_CTA_to_get_redirected_to_the_screen_the_clicked_on_Make_appointment() throws Throwable {
		TapElement(WhenAndWhere._cancelCTAHospitalPage); 
		Thread.sleep(4000);
		softassert.assertTrue(Home._MakeAnAppointmentCTA.isDisplayed());
	 	softassert.assertAll();
		logger.info("the user taps on X to get redirected to the screen the clicked on Make appointment or Make an appointment");
	}
	
	@And("^User should be able to choose hospital as per location$")
	public void User_should_be_able_to_choose_hospital_as_per_location() throws Throwable {
		Thread.sleep(3000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		if (getUserDeviceInput.contains("IOS")) {
		} else {
			Scroll("Garfield");
		}
		Thread.sleep(1000);
		TapElement(WhenAndWhere._hospital8);
		TapElement(WhenAndWhere._nextCTA);
		softassert.assertTrue(WhenAndWhere._seeCalender.isDisplayed());
	 	softassert.assertAll();
		logger.info("User should be able to choose hospital as per location");
	}
	
	@And("^User should be able to choose hospital$")
	public void User_should_be_able_to_choose_hospital() throws Throwable {
		Thread.sleep(3000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		} catch (Exception e) {
		}
		Thread.sleep(7000);
		TapElement(WhenAndWhere._hospital1);
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._newSearchCTA2.isDisplayed());
	 	softassert.assertAll();
		logger.info("User should be able to choose hospital");
	}
	
	@And("^user on clicking on Next available should see the available doctors$")
	public void user_on_clicking_on_Next_available_should_see_the_available_doctors() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(7000);
			TapElement(WhenAndWhere._nextavailableText);
		} catch (Exception e) {
			ScrolltoElement("See calendar");
			TapElement(WhenAndWhere._seeCalender);
			Thread.sleep(400);
			TapElement(WhenAndWhere._seeCalenderConfirmCTA);
		}
		Thread.sleep(2000);
		try {
			if (WhenAndWhere._AllocatedDoctors.isDisplayed()) {
				swipeDown();
				TapElement(WhenAndWhere._slot7);
			} else {
				swipeDown();
				WhenAndWhere.chooseSlot2();
				WhenAndWhere.doctors();
			}
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere.doctors();
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		logger.info("the user on clicking on Next available should see the available doctors");
	}
	
	@And("^user should able to select available slots$")
	public void user_should_able_to_select_available_slots() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (getUserDeviceInput.contains("IOS")) {
		try {
			swipeDown();
			if (WhenAndWhere._AllocatedDoctors.isDisplayed()) {
			TapElement(WhenAndWhere._slot7);
			}else {
				TapElement(WhenAndWhere._slot9);
			}
		} catch (Exception e) {
			swipeDown();
			TapElement(WhenAndWhere._slot1);
		}
		} else {
			
		try {
			if (WhenAndWhere._AllocatedDoctors.isDisplayed()) {
				swipeDown();
			//	ScrolltoElement("Your veterinarian will be assigned at least 24 hours before your appointment.");
				TapElement(WhenAndWhere._slot7);
			} else {
			//	ScrolltoElement("Banfield Veterinarian");
				swipeDown();
				WhenAndWhere.chooseSlot2();
				WhenAndWhere.doctors();
			}
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			System.out.println("catch block");
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere.doctors();
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		}
		/*try {
			ScrolltoElement("Banfield Veterinarian");
			WhenAndWhere.chooseSlot2();
			WhenAndWhere.doctors();
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere.doctors();
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		*/
		logger.info("user should able to select available slots");
	}
}
