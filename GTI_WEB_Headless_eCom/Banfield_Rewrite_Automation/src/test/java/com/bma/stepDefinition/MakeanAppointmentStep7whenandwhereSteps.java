package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
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

public class MakeanAppointmentStep7whenandwhereSteps extends Utilities {

	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep7whenandwhere.csv";
	public String path2 = "./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	public String path3 = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";
	
	SoftAssert softassert = new SoftAssert();
	
	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep7whenandwhereSteps.class);

	@Then("^the Location services is enabled for the Device for only one time$")
	public void the_Location_services_is_enabled_for_the_Device_for_only_one_time() throws Throwable {
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			TapElement(WhenAndWhere._onlyThisTimePopups);
		} catch (Exception e) {
			TapElement(WhenAndWhere._onlyThisTimePopups);
			TapElement(WhenAndWhere._newSearchCTA);
			Thread.sleep(2000);
		//	TapElement(Filter._Filterdeny);
			TapElement(Filter._SearchCTA);
			String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
			EnterInput(Filter._SearchCTA, input1);
			HidingKeyboard();
			TapElement(Filter._hospitalGarfield);
			TapElement(Filter._hospitalGarfield);
			HidingKeyboard();
			TapElement(Filter._ApplyCTA);
			Thread.sleep(5000);
			TapElement(WhenAndWhere._hospital1);
			Thread.sleep(5000);
			Assert.assertTrue(WhenAndWhere._hospitalPhoneNumber.isDisplayed());
		}
		Thread.sleep(5000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user is on the when & where screen");	
	}

	@Then("^they tap on New Search CTA$")
	public void they_tap_on_New_Search_CTA() {
		TapElement(WhenAndWhere._newSearchCTA);
		logger.info("they tap on New Search CTA");
	}
	
	@Then("^the user should be redirected to filter screen$")
	public void the_user_should_be_redirected_to_filter_screen() throws Throwable {
		Thread.sleep(2000);
	//	TapElement(Filter._Filterdeny);
		Filter.verifyFilterPage();
		logger.info("the user should be redirected to filter screen");
	}
	
	@And("^the user taps on the Search field to enable the search$")
	public void the_user_taps_on_the_Search_field_to_enable_the_search() {
		TapElement(Filter._SearchCTA);
		Assert.assertTrue(Filter._SearchCTA.isEnabled());
		logger.info("the user taps on the Search field to enable the search");
	}
	
	@And("^the user starts typing in the search field$")
	public void the_user_starts_typing_in_the_search_field() throws Throwable{
		String input = getcsvdata(path, 2, "Zip", "Zip");
		EnterInput(Filter._SearchCTA, input);
		HidingKeyboard();
		Assert.assertNotSame(input, Filter._SearchCTA.getText());
		logger.info("the user starts typing in the search field");
	}
	
	@And("^the user is suggested with city state based on the keywordZip code they enter$")
	public void the_user_is_suggested_with_city_state_based_on_the_keyword_Zip_code_they_enter() throws Throwable {
		String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
		EnterInput(Filter._SearchCTA, input1);
		Assert.assertNotSame(input1, Filter._SearchCTA.getText());
		logger.info("the user is suggested with city, state based on the keyword/Zip code they enter");
	}
	
	@And("^the user can choose a CityState from the suggested List$")
	public void the_user_can_choose_a_City_State_from_the_suggested_List() {
		HidingKeyboard();
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._hospitalGarfield);
		logger.info("the user can choose a City/State from the suggested List");
	}
	
	@And("^the user taps on Apply after selecting the location$")
	public void the_user_taps_on_Apply_after_selecting_the_location() {
		TapElement(Filter._ApplyCTA);
		logger.info("the user taps on Apply after selecting the location");
	}
	
	@And("^the list of Banfield locations for the nearest 6 locations of the chosen city, State/Zip is displayed$")
	public void the_list_of_Banfield_locations_for_the_nearest_six_locations_of_the_chosen_city_State_Zip_is_displayed() throws Throwable {
	//	TapElement(WhenAndWhere._backCTAHospitalPage);
		Thread.sleep(7000);
	//	WhenAndWhere.closestlocationhospital();
		softassert.assertTrue(WhenAndWhere._hospital1.isDisplayed());
		softassert.assertAll();
		verifytest(WhenAndWhere._hospital1);
		logger.info("the list of Banfield locations for the nearest 6 locations of the chosen city, State/Zip is displayed");
	}
	
	@And("^the user taps on a location to select from the list$")
	public void the_user_taps_on_a_location_to_select_from_the_list() throws Throwable {
		TapElement(WhenAndWhere._onlyThisTimePopups);	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(4000);
			TapElement(WhenAndWhere._hospital1);
			TapElement(WhenAndWhere._nextCTA);
		} catch (Exception e) {
			
			  TapElement(WhenAndWhere._newSearchCTA); 
			  Thread.sleep(2000);
			  TapElement(Filter._Filterdeny); 
			  TapElement(Filter._SearchCTA); 
			  String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
			  EnterInput(Filter._SearchCTA, input1); 
			  HidingKeyboard(); 
			  HidingKeyboardios();
			  TapElement(Filter._hospitalGarfield); 
			  TapElement(Filter._hospitalGarfield);
			  TapElement(Filter._ApplyCTA); 
			  Thread.sleep(5000);
			  TapElement(WhenAndWhere._hospital1);
			 
		}
		/*
		 * try { if (WhenAndWhere._hospital1.isDisplayed()) {
		 * TapElement(WhenAndWhere._hospital1); TapElement(WhenAndWhere._nextCTA); try {
		 * if (WhenAndWhere._slotsNotAvailable2Months.isDisplayed()) {
		 * TapElement(WhenAndWhere._backCTAHospitalPage);
		 * TapElement(WhenAndWhere._hospital2); TapElement(WhenAndWhere._nextCTA); } }
		 * catch (Exception e) { System.out.println("Garlield Hospital"); } }else {
		 * TapElement(WhenAndWhere._hospital1); } } catch (Exception e) {
		 * TapElement(WhenAndWhere._newSearchCTA); Thread.sleep(2000);
		 * TapElement(Filter._Filterdeny); TapElement(Filter._SearchCTA); String input1
		 * = getcsvdata(path, 2, "keyword","Zip", "keyword");
		 * EnterInput(Filter._SearchCTA, input1); HidingKeyboard(); HidingKeyboardios();
		 * TapElement(Filter._hospitalGarfield); TapElement(Filter._hospitalGarfield);
		 * TapElement(Filter._ApplyCTA); Thread.sleep(5000);
		 * TapElement(WhenAndWhere._hospital1); }
		 */
		logger.info("the user taps on a location to select from the list");
	}
	
	@And("^the user taps on a location to select from the lists$")
	public void the_user_taps_on_a_location_to_select_from_the_lists() throws Throwable {
	    Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			TapElement(WhenAndWhere._hospital1);
		} catch (Exception e) {
            Scroll("Garfield");
		}
		logger.info("the user taps on a location to select from the lists");
	}
	
	@And("^the user is redirected to the next screen when & where$")
	public void the_user_is_redirected_to_the_next_screen_when_and_where() throws InterruptedException {
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(5000);
		logger.info("the user is redirected to the next screen when & where");
	}
	
	@And("^the user is redirected to the next screen when & where screen$")
	public void the_user_is_redirected_to_the_next_screen_when_and_where_screen() throws InterruptedException {
		try {
			Assert.assertTrue(WhenAndWhere._nextavailableText.isDisplayed());
			verifytest(WhenAndWhere._nextavailableText);
		} catch (Exception e) {
			swipeDown();
			Assert.assertTrue(WhenAndWhere._slot7.isDisplayed());
			verifytest(WhenAndWhere._slot7);
		}
		logger.info("the user is redirected to the next screen when & where screen");
	}
	
	@Then("the user click on next available if slot is not available for that day")
	public void the_user_click_on_next_available_if_slot_is_not_available_for_that_day() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@name='slot-next-available-btn']"));
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		try {
			Thread.sleep(1000);
			TapElement(WhenAndWhere._nextavailableText);
			Thread.sleep(2000);
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		logger.info("the user click on next available if slot is not available for that day");
	}
	
	@And("^the users is redirected to the next screen when & where$")
	public void the_users_is_redirected_to_the_next_screen_when_and_where() throws InterruptedException {
		Thread.sleep(5000);
	//	TapElement(WhenAndWhere._onlyThisTimePopups); 
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the user is redirected to the next screen when & where");
	}
	
	@And("^user is redirected to the next screen when & where and verify phono number$")
	public void user_is_redirected_to_the_next_screen_when_and_where() throws InterruptedException {
	//	TapElement(WhenAndWhere._nextCTA);
	//	ScrolltoElement("Garfield");
		Thread.sleep(8000);
		Assert.assertTrue(WhenAndWhere._hospitalPhoneNumber.isDisplayed());
		verifytest(WhenAndWhere._hospitalPhoneNumber);
		Assert.assertTrue(WhenAndWhere._hospitalPhoneNumberIcon.isDisplayed());
		verifytest(WhenAndWhere._hospitalPhoneNumberIcon);
		logger.info("user is redirected to the next screen when & where");
	}
	
	@Then("^the Location services is enabled for the Device$")
	public void the_Location_services_is_enabled_for_the_Device() throws Throwable {
		try {
			Thread.sleep(3000);
			if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
				TapElement(WhenAndWhere._onlyThisTimePopups);	
			}
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		} catch (Exception e) {
			TapElement(WhenAndWhere._newSearchCTA);
			Thread.sleep(2000);
			TapElement(Filter._SearchCTA);
			String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
			EnterInput(Filter._SearchCTA, input1);
			HidingKeyboardios();
			HidingKeyboard();
			TapElement(Filter._dropdownText);
			TapElement(Filter._dropdownText);
			HidingKeyboardios();
			HidingKeyboardios();
			TapElement(Filter._ApplyCTA);
			Thread.sleep(5000);
			TapElement(WhenAndWhere._hospital1);
		}
		logger.info("the Location services is enabled for the Device");
	}
	
	@Then("^the Location services is enabled for the Devices$")
	public void the_Location_services_is_enabled_for_the_Devices() throws Throwable {
		Thread.sleep(3000);
		TapElement(WhenAndWhere._onlyThisTimePopups);	
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the Location services is enabled for the Devices");
	}
	
	@Then("^the user wants to enable Location services for the Device$")
	public void the_user_wants_to_enable_Location_services_for_the_Device() throws Throwable {
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		} catch (Exception e) {
			TapElement(WhenAndWhere._newSearchCTA);
			Thread.sleep(2000);
		//	TapElement(Filter._Filterdeny);
			TapElement(Filter._SearchCTA);
			String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
			EnterInput(Filter._SearchCTA, input1);
			HidingKeyboardios();
			TapElement(Filter._hospitalGarfield);
		//	TapElement(Filter._hospitalGarfield);
			HidingKeyboardios();
			TapElement(Filter._ApplyCTA);
			Thread.sleep(5000);
			TapElement(WhenAndWhere._hospital1);
		}
		logger.info("the user wants to enable Location services for the Device");
	}
	
	@Then("^the list of Banfield locations for the nearest 6 hospitals of users location is displayed$")
	public void the_list_of_Banfield_locations_for_the_nearest_six_hospitals_of_users_location_is_displayed() throws Throwable {
		Thread.sleep(8000);
		Assert.assertTrue(WhenAndWhere._hospital1.isDisplayed());
		logger.info("the list of Banfield locations for the nearest 6 hospitals of users location is displayed");
	}
	
	@When("^user is on the when & where page$")
	public void user_is_on_the_when_and_where_page() throws Throwable {
	//	String Name = getcsvdata(path2,2,"Name", "Name");
	//	Welcome.TapOnMakeAppointmentasGuest();
	//	Havewemetscreen.TapOnNoIMNew();
	//	LetsGetstarted.Entervaliddatain_letsgetstartedpage();
	//	TapElement(LetsGetstarted._lastName);
	//	HidingKeyboard();
	//	TapElement(LetsGetstarted._email);
	//	HidingKeyboard();
	//	TapElement(LetsGetstarted._emailheader);
	//	TapElement(LetsGetstarted._nextButton);
	//	TapElement(WhatSpeciesIsYourPet._cat);
	//	TapElement(WhatSpeciesIsYourPet._nextbutton);
	//	EnterInput(TellusaboutyourPet._petName, Name);
	//	TapElement(TellusaboutyourPet._male);
	//	Thread.sleep(1000);
	//	TellusaboutyourPet.verifyGenderisNotSelected(); 
	//	TellusaboutyourPet.tapOnYesCTA();
	//	TapElement(TellusaboutyourPet._nextCTA);
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._nextCTA);
		TapElement(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
		Thread.sleep(4000);
		logger.info("user is on the when & where page");
	}
	
	@And("^User taps on new patients$")
	public void User_taps_on_new_patients() throws Throwable {
		TapElement(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
		Thread.sleep(4000);
		logger.info("User taps on new patients");
	}
	
	@And("^user wants to navigate to whats going on Screen as new patient$")
	public void user_wants_to_navigate_to_whats_going_on_Screen_as_new_patient() throws Throwable {
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._nextCTA);
		logger.info("user wants to navigate to whats going on Screen as new patient");
	}
	
	@And("^user wants to verify Notes for the vet in New Patient$")
	public void user_wants_to_verify_Notes_for_the_vet_in_New_Patient() throws Throwable {
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._nextCTA);
		WhatsGoingOn.verifyNewPatientUI();
		TapElement(WhatsGoingOn._newPet);
		softassert.assertTrue(WhatsGoingOn._newPatientNextCTA.isSelected());
		TapElement(WhatsGoingOn._newPet);
		softassert.assertTrue(WhatsGoingOn._newPatientNextCTA.isEnabled());
		String input = getcsvdata(path3, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		TapElement(WhatsGoingOn._newPet);
		verifytest(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);	
		}
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user wants to verify Notes for the vet in New Patient");
	}
	
	@And("^the Notes for the vet field will show a placeholder text Any specific concerns or questions$")
	public void the_Notes_for_the_vet_field_will_show_a_placeholder_text_Any_specific_concerns_or_questions() throws Throwable {
		WhatsGoingOn.verifyNewPatientUI();
		logger.info("user wants to verify Notes for the vet in New Patient");
	}
	
	@And("^user wants to see the tags in New Patient Screen$")
	public void user_wants_to_see_the_tags_in_New_Patient_Screen() throws Throwable {
		WhatsGoingOn.verifyNewPatientUI();
		logger.info("user wants to see the tags in New Patient Screen");
	}
	
	@And("^user wants to verify tags select operations and all the tags are not mandatory$")
	public void user_wants_to_verify_tags_select_operations() throws Throwable {
		TapElement(WhatsGoingOn._newPet);
		softassert.assertTrue(WhatsGoingOn._newPatientNextCTA.isEnabled());
		String input = getcsvdata(path3, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		WhatsGoingOn.verifySelectTagsOperation();
		TapElement(WhatsGoingOn._newPet);
		verifytest(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);	
		}
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user wants to verify tags select operations and all the tags are not mandatory");
	}
	
	@And("^user wants to verify Notes for the vet in Illness$")
	public void user_wants_to_verify_Notes_for_the_vet_in_Illness() throws Throwable {
		TapElement(Reasonforvisit._illnessCTA);
		TapElement(Reasonforvisit._nextCTA);
		WhatsGoingOn.verifyTagsOnWhatsGoingOnPageIllness();
		swipeDown();
		WhatsGoingOn.verifyIlnessUI();
		TapElement(WhatsGoingOn._EarEyeNose);
		softassert.assertTrue(WhatsGoingOn._nextCTA.isSelected());
		TapElement(WhatsGoingOn._EarEyeNose);
		softassert.assertTrue(WhatsGoingOn._nextCTA.isEnabled());
		String input = getcsvdata(path3, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		TapElement(WhatsGoingOn._UrinaryIssues);
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);
		TapElement(WhatsGoingOn._nextCTA);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);	
		}
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user wants to verify Notes for the vet in Illness");
	}
	
	@And("^user wants to verify Notes for the vet in injury$")
	public void user_wants_to_verify_Notes_for_the_vet_in_injury() throws Throwable {
		TapElement(Reasonforvisit._injuryCTA);
		TapElement(Reasonforvisit._nextCTA);
		WhatsGoingOn.verifyTagsOnWhatsGoingOnPageInjury();
		swipeDown();
		WhatsGoingOn.verifyIlnessUI();
		TapElement(WhatsGoingOn._Lameness);
		softassert.assertTrue(WhatsGoingOn._nextCTA.isSelected());
		TapElement(WhatsGoingOn._Lameness);
		softassert.assertTrue(WhatsGoingOn._nextCTA.isEnabled());
		String input = getcsvdata(path3, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		TapElement(WhatsGoingOn._Lameness);
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);
		TapElement(WhatsGoingOn._nextCTA);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);	
		}
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user wants to verify Notes for the vet in injury");
	}
	
	@Then("^they are displayed with the Location Pop up to enable geo-location$")
	public void they_are_displayed_with_the_Location_Pop_up_to_enable_geo_location() throws Throwable {
		WhenAndWhere.verifypopups();
		logger.info("the user should be redirected to filter screen");
	}
	
	@Then("^the user clicks on Dont Allow in the enable location popup$")
	public void the_user_clicks_on_Dont_Allow_in_the_enable_location_popup() throws Throwable {
		Thread.sleep(2000);
		TapElement(WhenAndWhere._denyPopups);
		logger.info("the user clicks on Don�t Allow in the enable location pop-up");
	}
	
	@And("^the user is displayed with the when and where screen without any hospitals listed$")
	public void the_user_is_displayed_with_the_when_and_where_screen_without_any_hospitals_listed() {
		WhenAndWhere.verifyNoHospitalPage();
		logger.info("the user is displayed with the when and where screen without any hospitals listed");
	}
	
	@And("^the user is displayed with Ignore and Settings CTA$")
	public void the_user_is_displayed_with_Ignore_and_Settings_CTA() {
		Assert.assertTrue(WhenAndWhere._settings.isDisplayed());
		Assert.assertTrue(WhenAndWhere._ignore.isDisplayed());
		logger.info("the user is displayed with Ignore and Settings CTA");
	}
	
	@And("^the user is displayed with message Turn on location services to find the nearest Banfield hospital$")
	public void the_user_is_displayed_with_message_Turn_on_location_services_to_find_the_nearest_Banfield_hospital() {
		Assert.assertTrue(WhenAndWhere._locationServicestext.isDisplayed());
		logger.info("the user is displayed with message Turn on location services to find the nearest Banfield hospital");
	}
	
	@And("^the user taps on Ignore CTA to be redirected to Filter page$")
	public void the_user_taps_on_Ignore_CTA_to_be_redirected_to_Filter_page() {
		TapElement(WhenAndWhere._ignore);
		TapElement(Filter._Filterdeny);
		Filter.verifyFilterPage();
		verifytest(Filter._ApplyCTA);
		logger.info("the user taps on Ignore CTA to be redirected to Filter page");
	}
	
	@And("^the user taps on Settings CTA to get redirected to the native flow to enable geo-location$")
	public void the_user_taps_on_Settings_CTA_to_get_redirected_to_the_native_flow_to_enable_geo_location() {
		verifytest(WhenAndWhere._settings);
		TapElement(WhenAndWhere._settings);
		logger.info("the user taps on Settings CTA to get redirected to the native flow to enable geo-location");
	}
	
}
