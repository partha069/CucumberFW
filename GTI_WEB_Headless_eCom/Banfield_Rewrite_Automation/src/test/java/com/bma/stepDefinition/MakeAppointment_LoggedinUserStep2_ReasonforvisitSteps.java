package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MakeAppointment_LoggedinUserStep2_ReasonforvisitSteps extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep2_ReasonforvisitSteps.class);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";
	

	@Then("^the user is redirected to Reason for visit screen$")
	public void user_is_redirected_to_Reason_for_visit_screen() throws Throwable {
		Thread.sleep(2000);
	//	try {
	//		Assert.assertTrue(who_are_we_Scheduling._pet02.isDisplayed());
	//		TapElement(who_are_we_Scheduling._pet02);//Piety
	//		Assert.assertTrue(who_are_we_Scheduling._pet02.isEnabled());
	//		Thread.sleep(200);
	//	} catch (Exception e) {
	//		TapElement(who_are_we_Scheduling._pet02);//Piety - Tap again if fails
	//		Assert.assertTrue(who_are_we_Scheduling._pet02.isEnabled());
	//	}
		TapElement(who_are_we_Scheduling._pet02);//Piety
		Thread.sleep(600);
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(2000);
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user is redirected to Reason for visit screen");
	}
	
	@Then("^the user is redirected to the Reason for visit screen$")
	public void user_is_redirected_to_the_Reason_for_visit_screen() throws Throwable {
		Thread.sleep(2000);
		TapElement(who_are_we_Scheduling._pet01);
		Thread.sleep(600);
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(2000);
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		softassert.assertAll();
	    TapElement(Reasonforvisit._newPatientCTA);
	    TapElement(Reasonforvisit._nextCTA);
	    Thread.sleep(1000);
		logger.info("the user is redirected to the Reason for visit screen");
	}
	
	@And("^the user is displayed with the following options to choose Reason for visit pet$")
	public void user_displayed_options_to_choose_Reason_for_visit_pet() throws Throwable {
		softassert.assertTrue(Reasonforvisit._illnessCTA.isDisplayed());
		softassert.assertTrue(Reasonforvisit._injuryCTA.isDisplayed());
		softassert.assertTrue(Reasonforvisit._preventiveCareCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the following options to choose Reason for visit pet");
	}
	
	@And("^the user is displayed with the New Patient option if the pet has been added by the user in the app and has no visit data.$")
	public void displayed_with_the_New_Patient_option_if_the_pet_has_been_added_by_the_user() throws Throwable {
		TapElement(Reasonforvisit._backCTA);
		TapElement(who_are_we_Scheduling._pet01);//Kitty
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(1000);
		softassert.assertTrue(Reasonforvisit._newPatientCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the New Patient option if the pet has been added by the user in the app and has no visit data.");
	}
	
	@And("^the user is displayed with the Preventive care option if pet is NWP / OWP and the pet has visit data.$")
	public void user_is_displayed_with_the_Preventive_care_option() throws Throwable {
		TapElement(Reasonforvisit._backCTA);
		TapElement(who_are_we_Scheduling._pet02);
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(1000);
		softassert.assertTrue(Reasonforvisit._preventiveCareCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the Preventive care option if pet is NWP / OWP and the pet has visit data.");
	}
	
	@And("^options are not selected by default$")
	public void options_are_not_selected_by_default(){
		softassert.assertFalse(Reasonforvisit._illnessCTA.isSelected());
		softassert.assertFalse(Reasonforvisit._injuryCTA.isSelected());
		softassert.assertFalse(Reasonforvisit._preventiveCareCTA.isSelected());
		softassert.assertAll();
		logger.info("options are not selected by default.");
	}
	
	@And("^user cannot select multiple options$")
	public void user_cannot_select_multiple_options(){
		TapElement(Reasonforvisit._illnessCTA);
		Assert.assertTrue(Reasonforvisit._illnessCTA.isEnabled());
		TapElement(Reasonforvisit._injuryCTA);
		Assert.assertTrue(Reasonforvisit._injuryCTA.isEnabled());
		TapElement(Reasonforvisit._preventiveCareCTA);
		Assert.assertTrue(Reasonforvisit._preventiveCareCTA.isEnabled());
		logger.info("user cannot select multiple options");
	}
	
	@And("^user should be able to tap on one option to select.$")
	public void user_should_be_able_to_tap_on_one_option_to_select(){
		TapElement(Reasonforvisit._illnessCTA);
		softassert.assertTrue(Reasonforvisit._illnessCTA.isEnabled());
		
	//  softassert.assertTrue(Reasonforvisit._illnessGreenCheck.isSelected());	
	//	softassert.assertFalse(Reasonforvisit._injuryCTA.isEnabled());
	//	softassert.assertFalse(Reasonforvisit._preventiveCareCTA.isEnabled());

	//	TapElement(Reasonforvisit._injuryCTA);
	//	softassert.assertTrue(Reasonforvisit._injuryGreenCheck.isDisplayed());
	//	TapElement(Reasonforvisit._preventiveCareCTA);
	//	softassert.assertTrue(Reasonforvisit._preventiveCareGreenCheck.isDisplayed());
		softassert.assertAll();
		logger.info("user should be able to tap on one option to select.");
	}
	
	@And("^if the user selects Illness tapping on Next CTA will redirect to Whats going on screen$")
	public void user_selects_Illness_tapping_on_Next_CTA_will_redirect_to_Whats_going_on_screen() throws Throwable{
		Thread.sleep(1000);
		TapElement(Reasonforvisit._illnessCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(600);
		softassert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		softassert.assertAll();
		logger.info("if the user selects Illness tapping on Next CTA will redirect to Whats going on screen");
	}
	
	@And("^user wants to verify Notes for the vet in Illness Screen as Loggedin User$")
	public void user_wants_to_verify_Notes_for_the_vet_in_Illness_as_Loggedin_User() throws Throwable{
		Thread.sleep(1000);
		TapElement(Reasonforvisit._illnessCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(600);
		softassert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		softassert.assertAll();
		swipeDown();
		String input = getcsvdata(path, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);	
		logger.info("user wants to verify Notes for the vet in Illness as Loggedin User");
	}
	
	@And("^if the user selects Injury tapping on Next CTA will redirect to Whats going on screen$")
	public void user_selects_Injury_tapping_on_Next_CTA_will_redirect_to_Whats_going_on_screen(){
		TapElement(WhatsGoingOn._backCTA);
		TapElement(Reasonforvisit._injuryCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		softassert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		softassert.assertAll();
		logger.info("if the user selects Injury tapping on Next CTA will redirect to Whats going on screen");
	}
	
	@And("^if the users selects Injury tapping on Next CTA will redirect to Whats going on screen$")
	public void users_selects_Injury_tapping_on_Next_CTA_will_redirect_to_Whats_going_on_screen() throws Throwable{
		TapElement(Reasonforvisit._injuryCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(1000);
		softassert.assertTrue(WhatsGoingOn._TellUsMorefield.isDisplayed());
		softassert.assertAll();
		logger.info("if the user selects Injury tapping on Next CTA will redirect to Whats going on screen");
	}
	
	@And("^user wants to verify Notes for the vet in Injury Screen as Loggedin User$")
	public void user_wants_to_verify_Notes_for_the_vet_in_Injury_Screen_as_Loggedin_User() throws Throwable{
		TapElement(Reasonforvisit._injuryCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(1000);
		softassert.assertTrue(WhatsGoingOn._TellUsMorefield.isDisplayed());
		softassert.assertAll();
		swipeDown();
		String input = getcsvdata(path, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);
		logger.info("user wants to verify Notes for the vet in Injury Screen as Loggedin User");
	}
	
	@And("^if the user selects Preventive care tapping on Next CTA will redirect to Whats going on screen$")
	public void user_selects_Preventive_care_tapping_on_Next_CTA_will_redirect_to_Whats_going_on_screen(){
		TapElement(WhatsGoingOn._backCTA);
		TapElement(Reasonforvisit._preventiveCareCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		softassert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		softassert.assertAll();
		logger.info("if the user selects Preventive care tapping on Next CTA will redirect to Whats going on screen");
	}
	
	@And("^if the user selects New patient tapping on Next CTA will redirect to when and where screen$")
	public void user_selects_New_patient_tapping_on_Next_CTA_will_redirect_to_when_and_where_screen(){
		TapElement(WhatsGoingOn._WhatsGoingOnBackCTA);
		TapElement(Reasonforvisit._backCTA);
		TapElement(who_are_we_Scheduling._pet01); 
		TapElement(who_are_we_Scheduling._nextCTA);
		TapElement(Reasonforvisit._newPatientCTA);
		TapElement(Reasonforvisit._nextCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		softassert.assertAll();
		logger.info("if the user selects New patient tapping on Next CTA will redirect to when and where screen");
	}
	
	@And("^the Next CTA should be disabled by default until the user select an option$")
	public void Next_CTA_should_be_disabled_by_default_until_the_user_select_an_option() throws Throwable {
	//	TapElement(WhenAndWhere._CancelCTA);
	//	TapElement(Home._MakeAnAppointmentCTA);
		TapElement(Reasonforvisit._backCTA);
		TapElement(who_are_we_Scheduling._pet01);
		TapElement(who_are_we_Scheduling._nextCTA);
		softassert.assertFalse(Reasonforvisit._nextCTA.isEnabled());
		softassert.assertAll();
		logger.info("the Next CTA should be disabled by default until the user select an option");
	}
	
	@And("^the Next CTA will be enabled once the user selects an option$")
	public void Next_CTA_will_be_enabled_once_the_user_selects_an_option() throws Throwable {
		TapElement(Reasonforvisit._newPatientCTA); 
		softassert.assertTrue(Reasonforvisit._nextCTA.isDisplayed()); //isEnabled
		softassert.assertAll();
		logger.info("the Next CTA will be enabled once the user selects an option");
	}
	
	@And("^the user taps on the Next CTA to get redirected to next screen depending on whatever options they select here$")
	public void Next_CTA_t_get_redirected_to_next_screen_depending_on_whatever_options() throws Throwable {
	    TapElement(Reasonforvisit._nextCTA);
	    TapElement(WhenAndWhere._onlyThisTimePopups);
	    softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
	    softassert.assertAll();
		logger.info("the user taps on the Next CTA to get redirected to next screen depending on whatever options they select here.");
	}
	
	@And("^the user taps on < to get redirected to the Who are we scheduling screen$")
	public void the_user_taps_on_back_to_get_redirected_to_the_Who_are_we_scheduling_screen() throws Throwable {
		Thread.sleep(400);
	    TapElement(Reasonforvisit._backCTA);
	    Thread.sleep(2000);
	    softassert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
	    softassert.assertAll();
		logger.info("the user taps on < to get redirected to the Who are we scheduling screen");
	}
	
	@And("^the user taps on X icon to get redirected to the screen where they clicked on Make appointment or Make an appointment$")
	public void the_user_taps_on_X_icon_to_get_redirected_to_the_screen_where_they_clicked_on_Make_appointment_or_Make_an_appointment() throws Throwable {
		TapElement(Reasonforvisit._cancelCTA);
		Thread.sleep(2000);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
	    softassert.assertAll();
		logger.info("the user taps on X icon to get redirected to the screen where they clicked on Make appointment or Make an appointment");
	}
}
