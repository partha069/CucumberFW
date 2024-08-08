package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.springframework.context.annotation.DependsOn;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.HidesKeyboard;

public class MakeAnAppointmentStep3WhoareweschedulingSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen HavewemetScreen = new HavewemetScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public LetsgetstartedSteps Letsgetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAnAppointmentStep3WhoareweschedulingSteps.class);

	@When("^the user tapped on Next in the Contact Information Screen$")
	public void the_user_tapped_on_Next_in_the_Contact_Information_Screen() throws Throwable {
		Letsgetstarted.Entervaliddatain_letsgetstartedpage();
	//	HidingKeyboardios();
	//	TapElement(Letsgetstarted._phoneheader);
		TapElement(Letsgetstarted._nextButton);
		Thread.sleep(4000);
		Assert.assertTrue(WhatSpeciesIsYourPet._staticText.isDisplayed());
		logger.info("the user is redirected to the Who are we Scheduling Screen");	
	}
	
	@When("^the user is redirected to the What species is your pet? Screen$")
	public void the_user_is_redirected_to_the_What_species_is_your_pet_Screen() throws InterruptedException {
		Thread.sleep(4000);
		WhatSpeciesIsYourPet.Whatspeciesisyourpet();
		logger.info("the user is redirected to the What species is your pet? Screen");
	}

	@Then("^the user will be displayed with two options to choose Dog or Cat$")
	public void the_user_will_be_displayed_with_two_options_to_choose_Dog_or_Cat() {
		Assert.assertTrue(WhatSpeciesIsYourPet._dog.isDisplayed());
		Assert.assertTrue(WhatSpeciesIsYourPet._cat.isDisplayed());
		logger.info("the user will be displayed with two options to choose Dog or Cat");
	}
	
	@Then("^a static text is displayed on the screen for the user Not all locations can handle exotics. You will need to call the hospital to schedule an appointment$")
	public void a_static_text_is_displayed_on_the_screen_for_the_user() {
		Assert.assertTrue(WhatSpeciesIsYourPet._whatspeciesisyourpetText.isDisplayed());
		logger.info("Static text is displayed on the screen for the user");
	}
	
	@And("^the Next CTA will be in disabled state by default$")
	public void the_Next_CTA_will_be_in_disabled_state_by_default() {
		WhatSpeciesIsYourPet._nextbutton.isEnabled();
		logger.info("Next CTA will be in disabled state by default");
	}
	
	@And("^there will be no option selected by default$")
	public void there_will_be_no_option_selected_by_default() {
		Assert.assertTrue(WhatSpeciesIsYourPet._cat.isEnabled());
		Assert.assertTrue(WhatSpeciesIsYourPet._dog.isEnabled());
		logger.info("there will be no option selected by default");	
	}

	@And("^the user taps on an option to select it$")
	public void the_user_taps_on_an_option_to_select_it()  {
		TapElement(WhatSpeciesIsYourPet._cat);
		logger.info("User taps on an option to select it");	
	}
	
	@And("^the selected option will be highlighted$")
	public void the_selected_option_will_be_highlighted() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(WhatSpeciesIsYourPet._dog.isEnabled());
		Assert.assertFalse(WhatSpeciesIsYourPet._dog.isSelected());
		logger.info("Selected option will be highlighted");	
	}
	
	@And("^the Next CTA will be enabled$")
	public void the_Next_CTA_will_be_enabled() throws Throwable  {
		Thread.sleep(1000);
		Assert.assertTrue(WhatSpeciesIsYourPet._nextbutton.isEnabled());
		logger.info("Next CTA will be enabled");
	}
	
	@And("^the user taps on Next CTA to get redirected to the next screen$")
	public void the_user_taps_on_Next_CTA_to_get_redirected_to_the_next_screen() throws InterruptedException {
		TapElement(WhatSpeciesIsYourPet._nextbutton);
	    Thread.sleep(3000);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		verifytest(Tellusaboutyourpet._tellusaboutyourpetTitle);
		logger.info("User taps on Next CTA to get redirected to the next screen");
	}
	
	@And("^the user taps on < to get redirected to the previous screen$")
	public void the_user_taps_on_arrow_to_get_redirected_to_the_previous_screen() {
		TapElement(WhatSpeciesIsYourPet._backCTA);
		Letsgetstarted.verifyUIElementsofContInfo();
		verifytest(Letsgetstarted._firstName);
		logger.info("the user taps on < to get redirected to the previous screen");
	}
	
	@And("^the user taps on X to get redirected to Have we met screen$")
	public void the_user_taps_on_X_to_get_redirected_to_Have_we_met_screen() throws InterruptedException{
	//	TapElement(Letsgetstarted._nextButton);
		TapElement(WhatSpeciesIsYourPet._cancelCTA);
		HavewemetScreen.verifyHavewematescreen();
		verifytest(HavewemetScreen._yesIHaveButton);
		logger.info("the user taps on X to get redirected to Have we met screen");
	}
}
