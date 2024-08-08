package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeAnAppointmentStep4MoreaboutSteps extends Utilities {

	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public String path1="./src/test/resources/TestData/Sprint1/makeappointmentasguest-step4.csv";
	public String path2="./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	
	private static Logger logger = LogManager.getLogger(MakeAnAppointmentStep4MoreaboutSteps.class);
	
	@When("^the user tapped on Next from the What species is your pet screen$")
	public void the_user_tapped_on_Next_from_the_What_species_is_your_pet_screen() throws Throwable {
		Thread.sleep(2000);
		TapElement(WhatSpeciesIsYourPet._cat);
		TapElement(WhatSpeciesIsYourPet._nextbutton);
		Thread.sleep(4000);
		Assert.assertTrue(TellusaboutyourPet._male.isDisplayed());
		logger.info("the user tapped on Next from the What species is your pet screen");
	}
	
	@Then("^the user is redirected to the Tell us about your pet screen$")
	public void the_user_is_redirected_to_the_Tell_us_about_your_pet_screen() throws Throwable {
		TellusaboutyourPet.verifyTellusaboutYourPet();
		logger.info("the user is redirected to the Tell us about your pet screen");
	}
	
	@Then("^the user should be able to enter the following information in the form Pet name, Gender, Spayed or Neutered?$")
	public void the_user_should_be_able_to_enter_the_Pet_information() throws Throwable {
		String Name = getcsvdata(path2,2,"Name", "Name");
		EnterInput(TellusaboutyourPet._petName, Name);
		Assert.assertEquals(Name,TellusaboutyourPet._petName.getText());
		TapElement(TellusaboutyourPet._male);
		TellusaboutyourPet.tapOnYesCTA();
		logger.info("User should be able to enter the following information in the form Pet name, Gender, Spayed or Neutered");
	}
	
	@And("^the user enters the Pets name in Enter pet name field$")
	public void the_user_enters_the_Pets_name_in_Enter_pet_name_field() throws Throwable {
		String Name = getcsvdata(path2,2,"Name", "Name");
		EnterInput(TellusaboutyourPet._petName, Name);
		Assert.assertEquals(Name,TellusaboutyourPet._petName.getText());
		logger.info("User enters the Pets name in Enter pet name field");
	}
	
	@And("^the user cannot enter more than 30 characters in the field$")
	public void the_user_cannot_enter_more_than_30_characters_in_the_field() throws Throwable {
		String expected = getcsvdata(path1,2,"lastname", "firstname","lastname","phone","email");
		EnterInput(TellusaboutyourPet._petName,getcsvdata(path1,2,"lastname", "firstname","lastname","phone","email"));
	    Assert.assertNotSame(expected,TellusaboutyourPet._petName.getText());
		logger.info("User cannot enter more than 30 characters in the field");
	}
	
	@And("^the user cannot enter any Special Characters or numbers in the Pet Name field$")
	public void the_user_cannot_enter_any_Special_Characters_or_numbers_in_the_Pet_Name_field() {
		EnterInput(TellusaboutyourPet._petName, "@276 37");
		Assert.assertNotSame("@276 37",TellusaboutyourPet._petName.getText());
		logger.info("User cannot enter any Special Characters or numbers in the Pet Name field");
	}
	
	@And("^the user is displayed with the following Gender options as tap to select option Female, Male, Unsure$")
	public void the_user_is_displayed_with_the_following_Gender_options_as_tap_to_select_option_Female_Male_Unsure() {
		TellusaboutyourPet.verifyGenderOptionisTapped();
		logger.info("User is displayed with the following Gender options as tap to select option Female, Male, Unsure");
	}
	
	@And("^the options are not selected by default$")
	public void the_options_are_not_selected_by_default () {
		TapElement(TellusaboutyourPet._backCTA);
		TapElement(WhatSpeciesIsYourPet._nextbutton);
		TellusaboutyourPet.verifyOptionisNotSelected();
		logger.info("the options are not selected by default");
	}
	
	@And("^the user should be able to tap on one option to select$")
	public void the_user_should_be_able_to_tap_on_one_option_to_select() throws Throwable {
		TapElement(TellusaboutyourPet._male);
		TellusaboutyourPet.verifyGenderisNotSelected();
		TellusaboutyourPet.verifySpayedorNeuteredisNotSelected();
		logger.info("the user should be able to tap on one option to select");
	}

	@And("^the user is displayed with the following Spayed or Neutered options as tap to select option Yes, No, Unsure$")
	public void the_user_is_displayed_with_the_Spayed_or_Neutered_options_as_tap_to_select_option_Yes_No_Unsure() { 
		TellusaboutyourPet.verifySpayedorNeuteredOptionisTapped();
		logger.info("the user is displayed with the following Spayed or Neutered options as tap to select option Yes, No, Unsure");
	}
	
	@And("^the Next CTA should be disabled by default until the user selects all options$")
	public void the_Next_CTA_should_be_disabled_by_default_until_the_user_selects_all_options() {
		TellusaboutyourPet._nextCTA.isEnabled();
		logger.info("Next CTA should be disabled by default until the user selects all options");
	}
	
	@And("^the Next CTA will be enabled once user enters and selects all the fields$")
	public void the_Next_CTA_will_be_enabled_once_user_enters_and_selects_all_the_fields() throws Throwable{
		String Name = getcsvdata(path2,2,"Name", "Name");
		EnterInput(TellusaboutyourPet._petName, Name);
		TapElement(TellusaboutyourPet._male);
		Assert.assertTrue(TellusaboutyourPet._nextCTA.isEnabled());
		logger.info("Next CTA will be enabled once user enters and selects all the fields");
	}
	
	@And("^the user taps on the Next CTA to get redirected to Reason for visit Screen$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_Reason_for_visit_Screen() {
		Assert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		verifytest(Reasonforvisit._reasonforvisitTitle);
		logger.info("User taps on the Next CTA to get redirected to Reason for visit Screen");
	}
	
	@And("^the user taps on < to get redirected to the previous Screen$")
	public void the_user_taps_on_backCTA_to_get_redirected_to_the_previous_Screen() throws Throwable {
		TapElement(TellusaboutyourPet._backCTA);
		Thread.sleep(3000);
		WhatSpeciesIsYourPet.Whatspeciesisyourpet();
		verifytest(WhatSpeciesIsYourPet._whatspeciesisyourpetText);
		logger.info("User tapped on < to get redirected to the previous Screen");
	}
	
	@And("^the user taps on X to get redirected to Have we met Screen$")
	public void the_user_taps_on_X_to_get_redirected_to_Have_we_met_Screen() throws Throwable {
		TapElement(TellusaboutyourPet._cancelCTA);
		Havewemetscreen.verifyHavewematescreen();
		verifytest(Havewemetscreen._yesIHaveButton);
		logger.info("the user taps on X to get redirected to Have we met Screen");
	}
}
