package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
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

public class MakeanAppointmentStep5Reasonforvisit extends Utilities {

	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep5Reasonforvisit.class);
	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Find_a_Location_Near_You_Screen Find_a_Location_Near_You = new Find_a_Location_Near_You_Screen(driver);
	
	public String path="./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	
	
	@When("^user tapped on Next from the Tell us about your pet screen$")
	public void user_tapped_on_Next_from_the_Tell_us_about_your_pet_screen() throws Throwable{
		String Name = getcsvdata(path,2,"Name", "Name");
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
		EnterInput(TellusaboutyourPet._petName, Name);
		Thread.sleep(1000);
		HidingKeyboardios();
		TapElement(TellusaboutyourPet._male);
		TellusaboutyourPet.verifyGenderisNotSelected();
		TellusaboutyourPet.tapOnYesCTA();
		TapElement(TellusaboutyourPet._nextCTA);
		Thread.sleep(4000);
		Assert.assertTrue(Reasonforvisit._PetName.isDisplayed());
		logger.info("user tapped on Next from the Tell us about your pet screen");
	}
	
	@And("^the user will be displayed Not sure Call a hospital near you at the bottom of the page$")
	public void the_user_will_be_displayed_Not_sure_Call_a_hospital_near_you_at_the_bottom_of_the_page() throws Throwable{
		Thread.sleep(1000);
		swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
		logger.info("User will be displayed Not sure? Call a hospital near you at the bottom of the page");
	}
	
	@And("^the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you screen$")
	public void the_user_can_tap_on_Not_sure_Call_a_hospital_near_you_to_get_redirected_to_Find_a_location_near_you_screen() throws Throwable{
		TapElement(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
		Thread.sleep(3000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
		verifytest(Find_a_Location_Near_You._Findalocationheadertext);
		logger.info("User can tap on Not sure Call a hospital near you to get redirected to Find a location near you screen");
	}
	
	@And("^the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled$")
	public void the_user_can_tap_on_Not_sure_Call_a_hospital_near_you_shouldopen_phone_number_in_dialpad() throws Throwable{
	try {
		verifytest(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
		TapElement(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
	} catch (Exception e) {
		verifytest(Reasonforvisit._NotSureCallaHospitalNearYouCTA1);
		TapElement(Reasonforvisit._NotSureCallaHospitalNearYouCTA1);
	}
		logger.info("the user can tap on Not sure Call a hospital near you should open default dialer with preferred hospital number pre-filled$");
	}
	
	@Then("^the user will be redirected to Reason for visit screen$") //logged in user
	public void the_user_will_be_redirected_to_Reason_for_visit_screen() throws Throwable{
		Thread.sleep(3000);
		Assert.assertTrue(Reasonforvisit._illnessCTA.isDisplayed());
		logger.info("the user will be redirected to Reason for visit screen");
	}
	
	@And("^they are redirected to the Reason for Visit screen$")
	public void they_are_redirected_to_the_Reason_for_Visit_screen() throws Throwable{
		Thread.sleep(3000);
		Assert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		Assert.assertTrue(Reasonforvisit._PetName.isDisplayed());
		logger.info("they are redirected to the Reason for Visit screen");
	}
	
	@Then("^the user should be displayed with the following options New Patient, Illness, Injury$")
	public void the_user_should_be_displayed_with_the_following_options(){
		Reasonforvisit.verifyUI();
		logger.info("the user should be displayed with the following options New Patient, Illness, Injury");
	}
	
	@And("^the options are not selected by default.$")
	public void the_options_are_not_selected_by_default(){
		Reasonforvisit.verifyNotSelextedByDefault();
		logger.info("the options are not selected by default.");
	}
	
	@And("^the user should be able to tap on one option to select.$")
	public void the_user_should_be_able_to_tap_on_one_option_to_select(){
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._illness);
		TapElement(Reasonforvisit._injury);
		logger.info("the user should be able to tap on one option to select.");
	}
	
	@And("^the user cannot select multiple options$")
	public void the_user_cannot_select_multiple_options(){
		Reasonforvisit.verifyAnyOneCTA();
		logger.info("the user cannot select multiple options");
	}
	
	@And("^the remaining options should be greyed out on selecting an option$")
	public void the_remaining_options_should_be_greyed_out_on_selecting_an_option(){
		Reasonforvisit.verifygreyedoutonselectinganoption();
		logger.info("the remaining options should be greyed out on selecting an option");
	}
	
	@And("^the Next CTA should be disabled by default until the user select any options$")
	public void the_Next_CTA_should_be_disabled_by_default_until_the_user_select_any_options(){
		Assert.assertTrue(Reasonforvisit._nextCTA.isEnabled());
		logger.info("the Next CTA should be disabled by default until the user select any options");
	}
	
	@And("^the Next CTA will be enabled once user selects an option$")
	public void the_Next_CTA_will_be_enabled_once_user_selects_an_option(){
		Reasonforvisit.verifygreyedoutonselectinganoption();
		logger.info("the Next CTA will be enabled once user selects an option");
	}
	
	@Then("^the user taps on the Next CTA After selecting Illness to get redirected to next screen$")
	public void the_user_taps_on_the_Next_CTA_After_selecting_Illness_to_get_redirected_to_next_screen() throws Throwable {
		TapElement(Reasonforvisit._illness);
	    TapElement(Reasonforvisit._nextCTA);
	    Thread.sleep(3000);
	    Assert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
	    verifytest(WhatsGoingOn._whatsGoingOnTitle);
		logger.info("the user taps on the Next CTA to get redirected to whats going on screen screen");
	}

	@Then("^If they choose Injury  option then the user taps on the Next to get redirected to Whats going on Screen$")
	public void if_they_choose_Injury_option_then_the_user_taps_on_the_Next_to_get_redirected_to_Whats_going_on_Screen() throws Throwable {
		TapElement(Reasonforvisit._injury);
		TapElement(Reasonforvisit._nextCTA);
		Thread.sleep(3000);
		Assert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		verifytest(WhatsGoingOn._whatsGoingOnTitle);
		logger.info("If they choose Illness or Injury option");
	}
	
	@When("^Else they will be redirected to when and Where Screen on selecting New Patient option$")
	public void Else_they_will_be_redirected_to_when_and_Where_Screen_on_selecting_New_Patient_option() throws Throwable{
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._nextCTA);
		Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {
		TapElement(Welcome._deny);
		}
		else
			TapElement(WhatsGoingOn._whileUsingTheAppPopups);
		Thread.sleep(5000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		verifytest(WhenAndWhere._whenAndWhereTitle);
		logger.info("Else they will be redirected to when and Where? Screen on selecting New Patient option");
	}
	
	@And("^the user taps on < to get redirected to the Tell us about your pet Screen page$")
	public void the_user_taps_on_backk_to_get_redirected_to_the_Tell_us_about_your_pet_screen() throws Throwable{
		TapElement(Reasonforvisit._backCTA);
		Thread.sleep(3000);		
		Assert.assertTrue(TellusaboutyourPet._tellusaboutyourpetTitle.isDisplayed());
		verifytest(TellusaboutyourPet._tellusaboutyourpetTitle);
		logger.info("the user taps on < to get redirected to the Reason for visit screen");
	}

	@And("^the user taps on X on Reason for Visit page to get redirected to Have we met screen$")
	public void the_user_taps_on_X_Reason_for_Visit_page_to_get_redirected_to_Have_we_met_screen() throws Throwable{
		TapElement(Reasonforvisit._cancelCTA);
		Thread.sleep(3000);
		Assert.assertTrue(Havewemetscreen._havewemettitle.isDisplayed());
		verifytest(Havewemetscreen._havewemettitle);
		logger.info("the user taps on X to get redirected to Have we met? screen");
	}
	
}
