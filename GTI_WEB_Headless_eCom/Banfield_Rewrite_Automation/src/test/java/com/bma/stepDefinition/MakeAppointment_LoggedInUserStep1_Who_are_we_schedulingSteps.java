package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MakeAppointment_LoggedInUserStep1_Who_are_we_schedulingSteps extends Utilities {

	public Find_a_Location_Near_You_Screen FindaLocation = new Find_a_Location_Near_You_Screen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYour = new WhatSpeciesIsYourPetScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep7whenandwhere.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedInUserStep1_Who_are_we_schedulingSteps.class);

	@When("^User navigating to who are we scheduling screen$")
	public void User_navigating_to_who_are_we_scheduling_screen() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Find a location near you");
		TapElement(Home._findaLocationNearYouCTA);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(4000);
		TapElement(WhenAndWhere._hospital1);
		softassert.assertTrue(FindaLocation._FindaLocationNearYouTitle.isDisplayed());
		TapElement(FindaLocation._MakeAppoCTA_LoggedinUser);
		softassert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("User navigating to who are we scheduling screen");
	}
	
	
	@When("^User navigating to who are we scheduling page$")
	public void User_navigating_to_who_are_we_scheduling_page() throws Throwable {
		Thread.sleep(9000);
		try {
			try {
				if (Home._pet0.isDisplayed()) { //_yourPetsTitle
					swipeDown1();
				}
			} catch (Exception e) {
				if (Home._pet0.isDisplayed()) { //_yourPetsTitle
					swipeDown1();
				}
				Assert.assertTrue(true);
			}
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@name='dasboard/makeappointment-btn']"));
			}else if (getUserDeviceInput.contains("Android")) {
				Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			TapElement(Home._MakeAnAppointmentCTA);
//			try {
//				if (getUserDeviceInput.contains("IOS")) {
//					ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='emergency-popup/modal/continuebtn']"));	
//				}
//			} catch (Exception e) {
//				if (getUserDeviceInput.contains("Android")) {
//					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//				}
//			}
			Thread.sleep(50000);
			TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
			Thread.sleep(2000);
			Assert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
			Thread.sleep(2000);
		} catch (Exception e) {
			if (getUserDeviceInput.contains("IOS")) {
				swipeDown();
			} else {
				ScrolltoElement("Find a location near you");
			}
			TapElement(Home._findaLocationNearYouCTA);
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			TapElement(WhenAndWhere._onlyThisTimePopups);
			Thread.sleep(4000);
			TapElement(WhenAndWhere._hospital1);
			Assert.assertTrue(FindaLocation._MakeAppoCTA_LoggedinUser.isDisplayed());
			TapElement(FindaLocation._MakeAppoCTA_LoggedinUser);
			TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
			Thread.sleep(800);
			Assert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
		}
		logger.info("User navigating to who are we scheduling page");
	}
	
	@When("^User navigating to the who are we scheduling page$")
	public void User_navigating_to_the_who_are_we_scheduling_page() throws Throwable {
		Thread.sleep(9000);
		try {
			if (Home._yourPetsTitle.isDisplayed()) {
				swipeDown();
				Thread.sleep(12000);
			}
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		Thread.sleep(2000);
		TapElement(Home._MakeAnAppointmentCTA);
		Thread.sleep(30000);
		Assert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
		Thread.sleep(2000);
		logger.info("User navigating to the who are we scheduling page");
	}
	
	@When("^User wants to navigating to who are we scheduling page$")
	public void User_wants_to_navigating_to_who_are_we_scheduling_page() throws Throwable {
		Thread.sleep(8000);
	//	if (getUserDeviceInput.contains("IOS")) {
	//	swipeDown();
	//	}else {
	//	ScrolltoElement("Find a location near you");
	//	}
		swipeDown();
		Thread.sleep(800);
		TapElement(Home._findaLocationNearYouCTA);
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		} catch (Exception e) {
			Assert.assertTrue(true);
			/*
			TapElement(WhenAndWhere._onlyThisTimePopups);
			TapElement(Filter._findneearbySearchCTA);
			String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
			EnterInput(Filter._findneearbySearchCTA, input1);
			TapElement(Filter._findnearbyhospitalGarfield);
			HidingKeyboardios();
			HidingKeyboardios();
			Thread.sleep(7000);
			TapElement(WhenAndWhere._hospital1);
			TapElement(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
			*/
		}
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(4000);
		TapElement(WhenAndWhere._hospital1);
	//	TapElement(WhenAndWhere._hospital2);
	//	softassert.assertTrue(FindaLocation._FindaLocationNearYouTitle.isDisplayed());
		TapElement(FindaLocation._MakeAppoCTA_LoggedinUser);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(3000);
		Assert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		
		logger.info("User wants to navigating to who are we scheduling page");
	}

	@Then("^the user is redirected to Who are we scheduling\\? screen$")
	public void the_user_is_redirected_to_Who_are_we_scheduling_screen() throws Throwable {
		Assert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		Thread.sleep(3000);
		logger.info("the user is redirected to Who are we scheduling\\\\? screen");
	}

	@And("^the screen should display the user with the following$")
	public void screen_should_displayed() {
		who_are_we_Scheduling.whoareweschedulingUI();
		logger.info("the screen should display the user with the following");
	}

	@And("^the user with a preferred hospital will be displayed with the text$")
	public void the_user_with_a_preferred_hospital_will_be_displayed_with_the_text() throws Throwable {
		softassert.assertTrue(who_are_we_Scheduling._haveanurgentreqText.isDisplayed());
		softassert.assertTrue(who_are_we_Scheduling._callyourprefferedlocation.isDisplayed());
		softassert.assertAll();
		logger.info("the user with a preferred hospital will be displayed with the text");
	}

	@And("^the Next CTA will be in a disabled state by default$")
	public void the_Next_CTA_will_be_in_a_disabled_state_by_default() throws Throwable {
		Assert.assertFalse(who_are_we_Scheduling._nextCTA.isEnabled());
		logger.info("the Next CTA will be in a disabled state by default");
	}

	@And("^the pet will not be selected by default$")
	public void the_pet_will_not_be_selected_by_default() throws Throwable {
		Thread.sleep(4000);
		Assert.assertFalse(who_are_we_Scheduling._pet01.isSelected());
		logger.info("the pet will not be selected by default");
	}

	@And("^the pet card is displayed with$")
	public void the_pet_card_is_displayed_with() throws Throwable {
		softassert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
		softassert.assertTrue(who_are_we_Scheduling._PetLastSeen.isDisplayed());
		softassert.assertAll();
		logger.info("the pet card is displayed with");
	}

	@And("^the user will tap on the Pet card to select a pet$")
	public void the_user_will_tap_on_the_Pet_card_to_select_a_pet() throws Throwable {
		TapElement(who_are_we_Scheduling._petcard);
		logger.info("the user will tap on the Pet card to select a pet");
	}

	@And("^the selected pet will have a green check mark indicator on the pet card$")
	public void the_selected_pet_will_have_a_green_check_mark_indicator_on_the_pet_card() throws Throwable {
		softassert.assertTrue(who_are_we_Scheduling._greenCheckMark.isDisplayed());
		softassert.assertAll();
		logger.info("selected pet will have a green check mark indicator on the pet card");
	}

	@And("^the Next CTA will be enabled once the user selects a pet$")
	public void the_Next_CTA_will_be_enabled_once_the_user_selects_a_pet() throws Throwable {
		Assert.assertTrue(who_are_we_Scheduling._nextCTA.isEnabled());
		logger.info("Next CTA will be enabled once the user selects a pet");
	}

	@And("^the user taps on Call your preferred hospital\\. to open a native pop-up with the message$")
	public void the_user_taps_on_Call_your_preferred_hospital_to_open_a_native_pop_up_with_the_message()throws Throwable {
		TapElement(who_are_we_Scheduling._callyourprefferedlocation);
		Thread.sleep(2000);
		who_are_we_Scheduling.verifyNativePopups();
		logger.info("taps on Call your preferred hospital\\\\. to open a native pop-up with the message");
	}

	@And("^the user taps on Cancel CTA to dismiss the pop-up and return to the screen$")
	public void the_user_taps_on_Cancel_CTA_to_dismiss_the_pop_up_and_return_to_the_screen() throws Throwable {
		TapElement(who_are_we_Scheduling._popupsCancelCTA);
		softassert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("user taps on Cancel CTA to dismiss the pop-up and return to the screen");
	}

	@And("^the user taps on the Next CTA to go to Reason for visit\\? screen$")
	public void the_user_taps_on_the_Next_CTA_to_go_to_Reason_for_visit_screen() throws Throwable {
		TapElement(who_are_we_Scheduling._nextCTA);
		logger.info("user taps on the Next CTA to go to Reason for visit screen");
	}

	@And("^the user taps on Call CTA to open the device dialer with preferred hospitals contact number pre-filled$")
	public void the_user_taps_on_Call_CTA_to_open_the_device_dialer_with_preferred_hospitals_contact_number_pre_filled() throws Throwable {
	//	String phoneNo = "2018043919";
		TapElement(who_are_we_Scheduling._callCTA);
	//	Thread.sleep(3000);
	//	Assert.assertEquals(phoneNo, who_are_we_Scheduling._phoneNumber.getText());
		logger.info("user taps on Call CTA to open the device dialer with preferred hospitals contact number pre-filled");
	}

	@And("^the user taps on Directions to open Map App with preferred hospitals location pre-pinned$")
	public void the_user_taps_on_Directions_to_open_Map_App_with_preferred_hospitals_location_pre_pinned()
			throws Throwable {
		TapElement(who_are_we_Scheduling._directionCTA);
		logger.info("user taps on Directions to open Map App with preferred hospitals location pre-pinned");
	}

	@And("^the user will tap on Add a new pet CTA to go to What species is your pet screen$")
	public void the_user_will_tap_on_Add_a_new_pet_CTA_to_go_to_What_species_is_your_pet_screen() throws Throwable {
		TapElement(who_are_we_Scheduling._addapetCTA);
		Thread.sleep(1000);
		softassert.assertTrue(WhatSpeciesIsYour._whatSpeciesTitle.isDisplayed());
		softassert.assertAll();
		logger.info("user will tap on + Add a new pet CTA to go to What species is your pet screen");
	}

	@And("^the user taps on X icon to go to previous screen$")
	public void the_user_taps_on_X_icon_to_go_to_previous_screen() throws Throwable {
		TapElement(who_are_we_Scheduling._closeCTA);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
		softassert.assertAll();
		logger.info("user taps on X icon to go to previous screen");
	}

	@And("^the pet card is displayed with the text No visit data on record when the pet has no previous visits on record$")
	public void pet_card_is_displayed_with_the_text_No_visit_data_on_record() throws Throwable {
		ScrolltoElement("Miki");
		softassert.assertTrue(Home._lastSeenAndDate.isEnabled());
		softassert.assertAll();
		logger.info("the pet card is displayed with the text No visit data on record when the pet has no previous visits on record");
	}
	
	@And("^the user cannot multi-select pet from the list$")
	public void user_cannot_multi_select_pet_from_the_list() throws Throwable {
		TapElement(who_are_we_Scheduling._pet01);
		softassert.assertTrue(who_are_we_Scheduling._pet02.isEnabled());
		TapElement(who_are_we_Scheduling._pet02);
		softassert.assertTrue(who_are_we_Scheduling._pet01.isEnabled());
		softassert.assertAll();
		logger.info("the user cannot multi-select pet from the list");
	}
	
	@And("^the Hospital name, Hospital address, Contact Number and Location will be of set Preferred hospital$")
	public void user_should_displayed_Preferred_location() throws Throwable {
		Home.verifyYourPreferredLocation();
		logger.info("the Hospital name, Hospital address, Contact Number and Location will be of set Preferred hospital ");
	}
	
	@And("^if the user does not have set a preferred hospital, the user will be displayed with the text$")
	public void user_does_not_have_set_a_preferred_hospital() throws Throwable {
		ScrolltoElement("Have an urgent request? Need to schedule for an exotic or pocket pet?");
		softassert.assertTrue(who_are_we_Scheduling._haveanurgentreqTextFor_No_preferred_hospital.isDisplayed());
		softassert.assertAll();
		logger.info("if the user does not have set a preferred hospital, the user will be displayed with the text");
	}

}
