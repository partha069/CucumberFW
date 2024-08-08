package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddAPet_Step1_WhatSpeciesIsYourPetSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	
	private static Logger logger = LogManager.getLogger(AddAPet_Step1_WhatSpeciesIsYourPetSteps.class);

	@When("^the user is on Home screen$") //vcg6@sqa.com,Banfield123!
	public void the_user_is_on_Home_screen() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(1000);
		LoginUser.Login_to_addpet();
		Thread.sleep(12000);
		logger.info("the user is on Home screen");
	}
	
	@When("^the User should login and landed to home screen$")
	public void the_User_should_login_and_landed_to_home_screen() throws Throwable{
		Thread.sleep(1000);
		LoginUser.Login_to_addpet(); //vcg6@sqa.com,Banfield123!
		Thread.sleep(10000);
		logger.info("the User should login and landed to home screen");
	}
	
	@When("^the user clicks on Add a new pet CTA$")
	public void the_user_clicks_on_Add_a_new_pet_CTA() throws Throwable{
		if (getUserDeviceInput.contains("IOS")) {
//			Thread.sleep(8000);
			//Scroll("+ Add a new pet");
			TapElement(Home._AddaNewPetCTA);
		}else {
		ScrolltoElement("Add a new pet");
		TapElement(Home._AddaNewPetCTA);}
		logger.info("the user clicks on �+Add a new pet� CTA");
	}
	
	@Then("^the user will be redirected to What species is your pet page$")
	public void the_user_will_be_redirected_to_What_species_is_your_pet_page(){
		Assert.assertTrue(WhatSpeciesIsYourPet._whatSpeciesTitle.isDisplayed());
		Assert.assertTrue(WhatSpeciesIsYourPet._closeCTA.isDisplayed());
		logger.info("the user will be redirected to �What species is your pet?� page");
	}
	
	@Then("^the Next CTA will be disabled state by default$")
	public void the_Next_CTA_will_be_disabled_state_by_default() throws Throwable{
		WhatSpeciesIsYourPet._nextCTA.isEnabled();
		logger.info("the Next CTA will be disabled state by default");
	}
	
	@Then("^there will be no options selected by default$")
	public void there_will_be_no_options_selected_by_default() throws Throwable{
		Thread.sleep(6000);
		WhatSpeciesIsYourPet.noSpeciesSelectedByDefault();
		logger.info("there will be no options selected by default");
	}
	
	@And("^the user will be displayed with the following species to choose from Dog,Cat,Bird,Guinea Pig,Rabbit,Reptile,Pocket Pets_Mice, gerbils, hamsters...$")
	public void the_user_will_be_displayed_with_the_species() throws Throwable{
      Thread.sleep(5000);
		if (getUserDeviceInput.contains("IOS")) {
		}else {
		WhatSpeciesIsYourPet.verifywhatsSpeciesPage();
		}
		logger.info("the user will be displayed with the following species to choose from Dog,Cat,Bird,Guinea Pig,Rabbit,Reptile,Pocket Pets_Mice, gerbils, hamsters...");
	}
	
	@And("^the user taps on a pet species to select$")

	public void the_user_taps_on_a_pet_species_to_select() throws Throwable{
		Thread.sleep(4000);
		ScrolltoElement("Cat");
		TapElement(WhatSpeciesIsYourPet._CatSpecies);
		logger.info("the user taps on a pet species to select");
	}
	
	@And("^the selected options will be highlighted$")
	public void the_selected_options_will_be_highlighted(){
		Assert.assertTrue(WhatSpeciesIsYourPet._CatSpecies.isEnabled());
		logger.info("the selected options will be highlighted");
	}
	
	@And("^the user cannot multi select the pet species$")
	public void the_user_cannot_multi_select_the_pet_species(){
		WhatSpeciesIsYourPet.cannotMultiSelectSpecies();
		logger.info("the user cannot multi select the pet species");
	}
	
	@And("^the Next CTA will be enabled only after selecting an option$")//
	public void the_Next_CTA_will_be_enabled_only_after_selecting_an_option() throws Throwable{
		WaitElementToBeClickable(WhatSpeciesIsYourPet._CatSpecies);
		Thread.sleep(600);
		TapElement(WhatSpeciesIsYourPet._CatSpecies);
		Assert.assertTrue(WhatSpeciesIsYourPet._nextCTA.isEnabled());
		logger.info("the Next CTA will be enabled only after selecting an option");
	}
	
	@And("^the user taps on Next CTA to get redirected to Tell us about your pet screen$")
	public void the_user_taps_on_Next_CTA_to_get_redirected_to_Tell_us_about_your_pet_screen() throws Throwable{
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(3000);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user taps on Next CTA to get redirected to �Tell us about your pet� screen");
	}
	
	@And("^the user taps on X to get redirected to Home screen$")
	public void the_user_taps_on_Close_to_get_redirected_to_Home_screen() throws Throwable{
		TapElement(WhatSpeciesIsYourPet._closeCTA);
		Thread.sleep(3000);
		Assert.assertTrue(Home._seeFaqsAboutCovid19CTA.isDisplayed());
		logger.info("the user taps on X to get redirected to Home screen");
	}
	
}
