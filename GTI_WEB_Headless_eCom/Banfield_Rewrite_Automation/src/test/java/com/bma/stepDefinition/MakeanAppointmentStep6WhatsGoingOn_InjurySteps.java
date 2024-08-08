package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
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

public class MakeanAppointmentStep6WhatsGoingOn_InjurySteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public String path = "./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	
	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep6WhatsGoingOn_InjurySteps.class);

	@When("^user selected the Injury option in Reason for visit screen$")
	public void user_selected_the_Injury_option_in_Reason_for_visit_screen() throws Throwable {
		/*
		String Name = getcsvdata(path,2,"Name", "Name");
		Welcome.TapOnMakeAppointmentasGuest();
		Havewemetscreen.TapOnNoIMNew();
		LetsGetstarted.Entervaliddatain_letsgetstartedpage();
		TapElement(LetsGetstarted._lastName);
		HidingKeyboard();
		TapElement(LetsGetstarted._email);
		HidingKeyboard();
		TapElement(LetsGetstarted._emailheader);
		TapElement(LetsGetstarted._nextButton);
		TapElement(WhatSpeciesIsYourPet._cat);
		TapElement(WhatSpeciesIsYourPet._nextbutton);
		EnterInput(TellusaboutyourPet._petName, Name);
		TapElement(TellusaboutyourPet._male);
		TellusaboutyourPet.verifyGenderisNotSelected();
		TellusaboutyourPet.tapOnYesCTA();
		TapElement(TellusaboutyourPet._nextCTA);
		*/
		TapElement(Reasonforvisit._injury);
		logger.info("user selected the Injury option in Reason for visit screen");
	}
	
	@And("^the user tapped on Next for injury$")
	public void the_user_tapped_on_Next_for_injury() {
	//	TapElement(Reasonforvisit._injury);
		TapElement(Reasonforvisit._nextCTA);
		logger.info("the user tapped on Next ");
	}
	
	@And("^User tap on Next CTA for injury and navigate to whats going on screen$") //logged in - no loc
	public void user_tap_on_Next_CTA_for_injury_and_navigate_to_whats_going_on_screen() {
		TapElement(Reasonforvisit._injuryCTA);
		TapElement(Reasonforvisit._nextCTA);
		logger.info("user tap on Next CTA for injury and navigate to whats going on screen");
	}
	
	@And("^the user should be displayed with the following tag: Lameness,Other traumatic injury, Wound$")
	public void the_user_should_be_displayed_with_the_tag_Lameness_Other_traumatic_injury_Wound() {
		WhatsGoingOn.verifyTagsOnWhatsGoingOnPageInjury();
		logger.info("the user should be displayed with the following tag: Lameness,Other traumatic injury, Wound");
	}
	
	@And("^the notes for the vet is an optional field$")
	public void the_notes_for_the_vet_is_an_optional_field() {
		Assert.assertTrue(WhatsGoingOn._Lameness.isEnabled());
		TapElement(WhatsGoingOn._nextCTA); 
		if (getUserDeviceInput.contains("IOS")) {
			TapElement(Welcome._deny);
			}
			else
		TapElement(WhatsGoingOn._denyPopups);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		TapElement(WhenAndWhere._backCTAinClosestHospitalPage);
		logger.info("the notes for vet is an optional field");
	}
	
	@And("^User should able to redirect to when and where screen$")
	public void User_should_able_to_redirect_to_When_and_where_screen() {
		Assert.assertTrue(WhatsGoingOn._Lameness.isEnabled());
		TapElement(WhatsGoingOn._nextCTA);
		logger.info("User should able to redirect to When and where screen");
	}
	
	@And("^tags are not selected by default$")
	public void the_tags_are_not_selected_by_default() {
		WhatsGoingOn.verifyTagsOnWhatsGoingOnScreen();
		logger.info("the tags are not selected by default");
	}
	
	@And("^the user should be able to tap on any option to select a tags$")
	public void the_user_should_be_able_to_tap_on_any_option_to_select_a_tags() {
		TapElement(WhatsGoingOn._Wound);
		Assert.assertTrue(WhatsGoingOn._Wound.isEnabled());
		logger.info("the user should be able to tap on any option to select a tag");
	}
	
	@And("^choosing the tags is a Mandatory action.$")
	public void choosing_the_tags_is_a_Mandatory_actions() {
		TapElement(WhatsGoingOn._OtherTraumaticInjury);
		Assert.assertTrue(WhatsGoingOn._OtherTraumaticInjury.isEnabled());
		WhatsGoingOn._nextCTA.isEnabled();
		logger.info("choosing the tags is a Mandatory action");
	}
	
	@And("^the selected tag will be highlighted on each select$")
	public void the_selected_tag_will_be_highlighted_on_select() {
		TapElement(WhatsGoingOn._Wound);
		TapElement(WhatsGoingOn._OtherTraumaticInjury);
		WhatsGoingOn.verifyTagsisSelectedInjury();
		logger.info("the selected tag will be highlighted on select");
	}
	
	@And("^the user should be able to deselect the tags.$")
	public void the_user_should_be_able_to_deselect_the_tags() throws Throwable {
		WhatsGoingOn.verifyTagsisSelectedInjury();
		logger.info("the user should be able to deselect the tag.");
	}
	
	@And("^the Next CTA will be enabled once user will selects the tag$")
	public void the_Next_CTA_will_be_enabled_once_user_selects_the_tag() {
		TapElement(WhatsGoingOn._UrinaryIssues);
		Assert.assertTrue(WhatsGoingOn._nextCTA.isEnabled());
		logger.info("the Next CTA will be enabled once user selects the tag");
	}
	
	@And("^the Next CTA will be enabled once user will selects the respective tag$")
	public void the_Next_CTA_will_be_enabled_once_user_selects_the_respective_tag() {
		TapElement(WhatsGoingOn._Wound);
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, "Test Note");
		HidingKeyboardios();
		HidingKeyboardios();
		TapElement(WhatsGoingOn._Lameness);
	//	Assert.assertTrue(WhatsGoingOn._nextCTA.isSelected());
		logger.info("the Next CTA will be enabled once user selects the respective tag");
	}
}
