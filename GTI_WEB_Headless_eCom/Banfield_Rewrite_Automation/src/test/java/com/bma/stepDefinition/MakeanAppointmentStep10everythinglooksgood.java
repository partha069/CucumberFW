package com.bma.stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
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
import com.bma.pageObject.YouareAllSetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeanAppointmentStep10everythinglooksgood extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HavewemetScreen Havewemet = new HavewemetScreen(driver);
	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public YouareAllSetScreen YouareAllSet = new YouareAllSetScreen(driver);
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep10everythinglooksgood.csv";
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep10everythinglooksgood.class);
	
	@When("^user tapped on Next CTA in when & where screen$")
	public void user_tapped_on_Next_CTA_in_when_and_where_screen() throws Throwable {
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
	//	if (getUserDeviceInput.contains("IOS")) {
	//		ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@name='slot-next-available-btn']"));
	//	}
	//	if (getUserDeviceInput.contains("IOSReal")) {
	//		ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@name='slot-next-available-btn']"));
	//	}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		try {
			if (WhenAndWhere._nextavailableText.isDisplayed()) {
				TapElement(WhenAndWhere._nextavailableText);
			}
		} catch (Exception e) {
            Assert.assertTrue(true);
		}
		
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
			swipeDown();
			TapElement(WhenAndWhere._slot7);
			WhenAndWhere._slot7.isEnabled();
		}
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		logger.info("they are redirected to the Everything look okay Screen");
	}
	
	@When("^user should lands on when and where screen$")
	public void user_should_lands_on_when_and_where_screen() throws Throwable {
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
			swipeDown();
			WhenAndWhere.chooseSlot2();
			TapElement(WhenAndWhere._slot7);
		//	WhenAndWhere._slot7.isEnabled();
		}
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		logger.info("user should lands on when and where screen");
	}
	
	@When("^user tapped on Next from the when & where screen$")
	public void user_tapped_on_Next_from_the_when_and_where_screen() throws Throwable {
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
		try {
			ScrolltoElement("Your veterinarian will be assigned at least 24 hours before your appointment.");
			if (WhenAndWhere._LocumdoctorsName.isDisplayed()) {
				WhenAndWhere.chooseSlot2();
			}else {
				swipeDown();
				TapElement(WhenAndWhere._slot7);
				Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
			}
		} catch (Exception e) {
			System.out.println("Locum Dr is not available");
			TapElement(WhenAndWhere._slot7);
			Assert.assertTrue(WhenAndWhere._slot7.isEnabled());
		}
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		logger.info("user tapped on Next from the when & where screen");
	}

	@Then("^they are redirected to the Everything look okay Screen$")
	public void they_are_redirected_to_the_Everything_look_okay_Screen() throws Throwable {
		Thread.sleep(1000);
		EverythingLookOkay.verifySlotsEverythingLookOkayPage();
		logger.info("they are redirected to the Everything look okay Screen");
	}
	
	@And("^User tried to created an Appointment as New patient and user tap on Make appointment CTA$")
	public void User_tried_to_created_an_Appointment_as_New_patient_and_user_tap_on_Make_appointment_CTA() throws Throwable {
		Thread.sleep(1000);
		try {
			ScrolltoElement("Please bring all vaccination records to your appointment. Per local laws, we are required to vaccinate your pet against rabies without proof of prior vaccination.");
		} catch (Exception e) {
			swipeDown();
			swipeDown3();			
		}
		Assert.assertTrue(EverythingLookOkay._AppointmentTypeText.isDisplayed());
		Assert.assertTrue(EverythingLookOkay._makeAppointmentCTA.isDisplayed());
		TapElement(EverythingLookOkay._pleaseBringAllVaccinationCTA);
		logger.info("User tried to created an Appointment as New patient and user tap on Make appointment CTA");
	}
	
	@Then("^User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text$")
	public void User_is_displayed_with_Appointment_Type_Appointment_Reason_Notes_for_the_vet_Please_bring_all_text() throws Throwable {
		ScrolltoElement("Notes for the vet: Test Note");
		Thread.sleep(1000);
		softassert.assertTrue(EverythingLookOkay._AppointmentTypeText.isDisplayed());
		softassert.assertTrue(EverythingLookOkay._AppointmentReasonText.isDisplayed());
		softassert.assertTrue(EverythingLookOkay._NotesForTheVetText.isDisplayed());
		softassert.assertAll();
		logger.info("User is displayed with Appointment Type, Appointment Reason, Notes for the vet, Please bring all vaccination records to your appointment text");
	}


	@Then("^the user should be displayed with the following information on screen Pet Names appointment Time hh:mm p.m and Date of Appointment Mmm dd,yyyy, Location of Appointment, Your information with name, number, and email$")
	public void the_user_should_be_displayed_with_the_information_on_screen() throws Throwable {
		EverythingLookOkay.verifySlotsEverythingLookOkayPage();
		logger.info("the user should be displayed with the information on screen");
	}
	
	@Then("^the user should be displayed with the phone number$")
	public void the_user_should_be_displayed_with_the_phone_number() {
		softassert.assertTrue(EverythingLookOkay._phone.isDisplayed());
		softassert.assertAll();
        verifytest(EverythingLookOkay._phone);
		logger.info("the user should be displayed with the information on screen");
	}

	@And("^the user click on Make appointment CTA$")
	public void the_user_click_on_Make_appointment_CTA() throws Throwable {
		Thread.sleep(3000);
		TapElement(EverythingLookOkay._makeAppointmentCTA);
		Thread.sleep(5000);
		logger.info("the user click on Make appointment CTA");
	}

	@And("^the user is redirected to Youre all set screen$")
	public void the_user_is_redirected_to_Youre_all_set_screen() throws Throwable { 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				TapElement(YouareAllSet._ratingsPopups);
			}
			} catch (Exception e) {
				assertTrue(true);
			}
		Thread.sleep(3000);
		Assert.assertTrue(YouareAllSet._petNameText.isDisplayed());
		verifytest(YouareAllSet._petNameText);
	//	TapElement(YouareAllSet._doneCTA);
		logger.info("the user is redirected to Youre all set screen");
	}
	
	@And("^the user can tap on Reschedule CTA to get redirected on when and where screen with available time slots for that day or Next available date$")
	public void the_user_is_redirected_When_and_Where_Screen_for_Reschedule_Appo() throws Throwable {
		TapElement(YouareAllSet._RescheduleCTA);
		Thread.sleep(6000);
		TapElement(WhenAndWhere._nextavailableText);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		swipeDown();
		TapElement(WhenAndWhere._slot7);
		TapElement(WhenAndWhere._nextCTAonSlotPage);
		TapElement(EverythingLookOkay._makeAppointmentCTA);
		Thread.sleep(9000);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				TapElement(YouareAllSet._ratingsPopups);
			}
		} catch (Exception g) {	
			assert(true);
		}
		Thread.sleep(4000);
		verifytest(YouareAllSet._petNameText);
		swipeDown();
		swipeDown();
		logger.info("the user can tap on Reschedule CTA to get redirected on When and where screen with available time slots for that day or Next available date");
	}

	@When("^the user taps on < to get redirected to thethe previous screen$")
	public void the_user_taps_on_back_to_get_redirected_to_thethe_previous_screen() throws Throwable {
		TapElement(EverythingLookOkay._backCTA);
		Thread.sleep(4000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		verifytest(WhenAndWhere._whenAndWhereTitle);
		logger.info("the user taps on < to get redirected to the previous screen");
	}

	@Then("^the user taps on X to get redirected toto Have we met screen$")
	public void the_user_taps_on_close_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		TapElement(EverythingLookOkay._cancelCTA);
		Havewemet.verifyHavewematescreen();
		verifytest(Havewemet._yesIHaveButton);
		logger.info("the user taps on X to get redirected to Have we met screen");
	}
}
