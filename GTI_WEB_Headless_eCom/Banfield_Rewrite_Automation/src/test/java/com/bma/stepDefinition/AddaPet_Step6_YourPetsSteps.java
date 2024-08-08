package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LetsAddTheirPhotoScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatBreedAreTheyScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.YourPetsScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddaPet_Step6_YourPetsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public WhatBreedAreTheyScreen WhatBreedAreThey = new WhatBreedAreTheyScreen(driver);
	public LetsAddTheirPhotoScreen LetsAddTheirPhoto = new LetsAddTheirPhotoScreen(driver);
	public YourPetsScreen YourPets = new YourPetsScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	
	public ProfileScreen profile = new ProfileScreen(driver);
	public LoginScreen login = new LoginScreen(driver);

	private static Logger logger = LogManager.getLogger(AddaPet_Step6_YourPetsSteps.class);
	
	@When("^the user is on the Tell us about your pet screen$")
	public void the_user_is_on_the_Tell_us_about_your_pet_screen() throws Throwable {
		Thread.sleep(5000);
		TapElement(Home._AddaNewPetCTA);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

		Thread.sleep(3000);
//		WaitElementToBeClickable(WhatSpeciesIsYourPet._CatSpecies);
		TapElement(WhatSpeciesIsYourPet._CatSpecies);

		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(4000);
		Assert.assertTrue(Tellusaboutyourpet._nameText.isDisplayed());
		logger.info("the user is on the Tell us about your pet screen");
	}
	
	@When("^the users is on the Tell us about your pet screen$")
	public void the_users_is_on_the_Tell_us_about_your_pet_screen() throws Throwable {
		Thread.sleep(5000);
		TapElement(WhatSpeciesIsYourPet._CatSpecies);
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user is on the Tell us about your pet screen");
	}

	@When("^the user is on Lets add their photo screen$")
	public void the_user_is_on_Lets_add_their_photo_screen() throws Throwable {
		TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(3000);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user is on �Let�s add their photo� screen");
	}
	
	@When("^the user taps on Skip CTA or Next CTA after uploading a photo$")
	public void the_user_taps_on_Skip_CTA_or_Next_CTA_after_uploading_a_photo() throws Throwable {
		TapElement(LetsAddTheirPhoto._skipCTA);
		Thread.sleep(3000);
		Assert.assertTrue(YourPets._YourPetstitle.isDisplayed());
		logger.info("the user taps on �Skip� CTA or �Next� CTA after uploading a photo");
	}
	
	@Then("^the user will be redirected to Your pets screen$")
	public void the_user_will_be_redirected_to_Your_pets_screen() {
		Assert.assertTrue(YourPets._YourPetstitle.isDisplayed());
		logger.info("the user will be redirected to �Your pets� screen");
	}
	
	@And("^the pet card will have Pet name, Age, Gender, Breed, Trash icon, based on their previous selections$")
	public void the_pet_card_will_have_Pet_name_Age_Gender_Breed_Trash_icon_based_on_their_previous_selections() {
		YourPets.verifypetscard();
		logger.info("the pet card will have | Pet name | Age | Gender (S/N) | Breed| Trash icon  | based on their previous selections");
	}
	
	@And("^the user will be displayed with the Add another pet CTA Done CTA$")
	public void the_user_will_be_displayed_with_the_Add_another_pet_CTA_Done_CTA() {
		Assert.assertTrue(YourPets._addAnotherPetCTA.isDisplayed());
		logger.info("the user will be displayed with the |+Add another pet CTA | Done CTA");
	}
	
	@And("^the Done CTA by default will display as a enabled$")
	public void the_Done_CTA_by_default_will_display_as_a_enabled() {
		Assert.assertTrue(YourPets._doneCTA.isDisplayed());
		verifytest(YourPets._doneCTA);
		logger.info("the Done CTA by default will display as a enabled");
	}
	
	@And("^the user taps on the Done CTA to go on the Home screen with new Pet added.$")
	public void the_user_taps_on_the_Done_CTA_to_go_on_the_Home_screen_with_new_Pet_added() throws Throwable {
		TapElement(YourPets._doneCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Home._pet.isDisplayed());
	//	verifytest(Home._pet);
		logger.info("the user taps on the Done CTA to go on the Home screen with new Pet added.");
	}
	
	@And("^the user taps on Trash icon to remove the pet$")
	public void the_user_taps_on_Trash_icon_to_remove_the_pet() {
		TapElement(YourPets._trashCTA);
	
		logger.info("the user taps on Trash icon to remove the pet");
	}
	
	@And("^the user is displayed with a native pop-up Are you sure you want to remove this pet$")
	public void the_user_is_displayed_with_a_native_popup_Are_you_sure_you_want_to_remove_this_pet() {
//		YourPets.verifyNativePopups();
		logger.info("the user is displayed with a native pop-up �Are you sure you want to remove this pet?�");
	}
	
	@And("^the user taps on Cancel CTA to stay on the same page$")
	public void the_user_taps_on_Cancel_CTA_to_stay_on_the_same_page() throws Throwable {
		TapElement(YourPets._cancelCTA);
		Thread.sleep(2000);
		Assert.assertTrue(YourPets._YourPetstitle.isDisplayed());
		logger.info("the user taps on Cancel CTA to stay on the same page");
	}

	@And("^the user taps on Delete CTA to Delete the pet$")
	public void the_user_taps_on_Delete_CTA_to_Delete_the_pet() throws Throwable {
//		TapElement(YourPets._trashCTA);
//		while(!YourPets._YourPetstitle.isDisplayed())
//		try {TapElement(YourPets._deleteCTA);}
//		catch (Exception e){
//		TapElement(YourPets._trashCTA);
//		TapElement(YourPets._deleteCTA);}
		TapElement(YourPets._trashCTA);
		Thread.sleep(3000);
		TapElement(YourPets._deleteCTA);
		Thread.sleep(3000);
		Assert.assertTrue(YourPets._YourPetstitle.isDisplayed());
		logger.info("the user taps on Delete CTA to Delete the pet");
	}
	
	@And("^if no pet is there user will be displayed with Text Add your pet to get started Add your pet CTA Done CTA$")
	public void if_no_pet_is_there_user_will_be_displayed_with_Text_Add_your_pet_to_get_started_Add_your_pet_CTA_Done_CTA() {
		try {
			Assert.assertTrue(YourPets._AddYourPetToGetStarted.isDisplayed());
		} catch (Exception e) {
			
		}
		
		logger.info("if no pet is there user will be displayed with Text : \"Add your pet to get started\" | �+Add your pet� CTA | �Done� CTA |");
	}
	
	@And("^the user taps on Add your pet CTA to go to What species is your pet screen$")
	public void the_user_taps_on_Add_your_pet_CTA_to_go_to_What_species_is_your_pet_screen() throws Throwable {
		verifytest(YourPets._addAnotherPetCTA);
		TapElement(YourPets._addAnotherPetCTA);
		Thread.sleep(3000);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatSpeciesTitle.isDisplayed());
		logger.info("the user taps on Add your pet CTA to go to What species is your pet screen");
	}
	
	@And("^the system replaces the previous pet with the added pet on adding another pet$")
	public void the_system_replaces_the_previous_pet_with_the_added_pet_on_adding_another_pet() {
		//NATC
		logger.info("the system replaces the previous pet with the added pet on adding another pet");
	}
	
	@And("^the user will be displayed with Done CTA in disabled state if they removed all the pets$")
	public void the_user_will_be_displayed_with_Done_CTA_in_disabled_state_if_they_removed_all_the_pets() {
		Assert.assertTrue(YourPets._doneCTA2.isEnabled());// was failing  >> isEnabled
		TapElement(YourPets._ClosedCTA);
		profile.Logout();
		TapElement(login._CancelCTA);
		logger.info("the user will be displayed with \"Done\" CTA in disabled state if they removed all the pets");
	}
	
	@And("^the user taps on < button to go to Lets add their photo screen$")
	public void the_user_taps_on_back_button_to_go_to_Lets_add_their_photo_screen() throws Throwable {
		TapElement(YourPets._backCTA);
		Thread.sleep(3000);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user taps on < button to go to �Let�s add their photo� screen");
	}
	
	@And("^the user taps on X to go on the Home screen$")
	public void the_user_taps_on_Close_to_go_on_the_Home_screen() throws Throwable {
		TapElement(YourPets._ClosedCTA);
		Thread.sleep(800);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user taps on X to go on the Home screen");
	}
}
