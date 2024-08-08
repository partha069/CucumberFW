package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LetsAddTheirPhotoScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatBreedAreTheyScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.YourPetsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddaPet_Step4_WhatBreedAreTheySteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public WhatBreedAreTheyScreen WhatBreedAreThey = new WhatBreedAreTheyScreen(driver);
	public LetsAddTheirPhotoScreen LetsAddTheirPhoto = new LetsAddTheirPhotoScreen(driver);
	public YourPetsScreen YourPets = new YourPetsScreen(driver);
	SoftAssert softassert = new SoftAssert();

	private static Logger logger = LogManager.getLogger(AddaPet_Step4_WhatBreedAreTheySteps.class);

	@Then("^the user will be redirected to What breed are they screen$")
	public void the_user_will_be_redirected_to_What_breed_are_they_screen() throws Throwable{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		TapElement(Tellusaboutyourpet._femaleGender);
		TapElement(Tellusaboutyourpet._NoGender);
		TapElement(Tellusaboutyourpet._nextCTAStep3);
		Thread.sleep(3000);
		Assert.assertTrue(WhatBreedAreThey._WhatBreedAreTheyScreenTitle.isDisplayed());
		logger.info("the user will be redirected to What breed are they screen");
	}
	
	@And("^the avatar should have the Name, Age, Gender Spayed or Neutered, Breed$")
	public void the_avatar_should_have_the_Name_Age_Gender_Spayed_or_Neutered_Breed() throws Throwable{
		WhatBreedAreThey.verifyBreedsdetails();
		logger.info("the avatar should have the Name, Age, Gender (Spayed or Neutered), Breed");
	}
	
	@And("^the user is displayed with search to select Breed where Enter breed is displayed as a placeholder text.$")
	public void the_user_is_displayed_with_search_to_select_Breed_where_Enter_breed_is_displayed_as_a_placeholder_text() throws Throwable{
	//	Thread.sleep(1000);
	//  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertTrue(WhatBreedAreThey._BreedPlaceHolder.isDisplayed());
		logger.info("the user is displayed with search to select Breed where Enter breed is displayed as a placeholder text.");
	}
	
	@And("^the user taps on the Search field/icon to expand the search screen What breed are they 2$")
	public void the_user_taps_on_the_Search_fieldicon_to_expand_the_search_screen_What_breed_are_they2() throws InterruptedException{
		TapElement(WhatBreedAreThey._BreedPlaceHolder); 
		//Thread.sleep(3000);
		//Assert.assertTrue(WhatBreedAreThey._dropdownelement1.isDisplayed());
		logger.info("the user taps on the Search field/icon to expand the search screen (What breed are they (2) )");
	}
	
	@And("^the alphanumeric keypad should be displayed when they tap on the search field$")
	public void the_alphanumeric_keypad_should_be_displayed_when_they_tap_on_the_search_field(){
		TapElement(WhatBreedAreThey._searchfield);
		HidingKeyboard();
		logger.info("the alphanumeric keypad should be displayed when they tap on the search field");
	}
	
	@And("^the user can choose a breed from the suggested List by tapping on Next CTA$")
	public void the_user_can_choose_a_breed_from_the_suggested_List_by_tapping_on_Next_CTA() throws Throwable{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String Name = "Abyssinian";
		Thread.sleep(5000);
		WhatBreedAreThey.verifypetname();
		TapElement(WhatBreedAreThey._dropdownelement1);
		TapElement(WhatBreedAreThey._dropdownelement1);
	//	TapElement(WhatBreedAreThey._searchfield); // CR @Sprint 7
	//	EnterInput(WhatBreedAreThey._searchfield, Name); CR @Sprint 7
	//	Assert.assertEquals(Name,WhatBreedAreThey._searchfield.getText()); 
	//	Assert.assertSame(Name,WhatBreedAreThey._BreedPlaceHolder.getText()); 
		softassert.assertTrue(WhatBreedAreThey._nextCTA.isEnabled());
		softassert.assertAll();
	//	WhatBreedAreThey._nextCTASearchScreen.isEnabled(); 
	//	TapElement(WhatBreedAreThey._nextCTA); CR @Sprint 7
		Thread.sleep(2000);
		Assert.assertEquals(Name,WhatBreedAreThey._BreedPlaceHolderText.getText());
		logger.info("the user can choose a breed from the suggested List by tapping on Next CTA");
	}
	
	@And("^the user can tap on Cancel after selecting a breed to restart the search What breed are they 4$")
	public void the_user_can_tap_on_Cancel_after_selecting_a_breed_to_restart_the_search_What_breed_are_they4() throws Throwable{
		TapElement(WhatBreedAreThey._BreedPlaceHolderCancelCTA);
		TapElement(WhatBreedAreThey._BreedPlaceHolder);
		Thread.sleep(3000);
		Assert.assertTrue(WhatBreedAreThey._dropdownelement1.isDisplayed());
		TapElement(WhatBreedAreThey._dropdownelement1);
	//	WaitElementToBeClickable(WhatBreedAreThey._nextCTASearchScreen); 
	//	TapElement(WhatBreedAreThey._nextCTASearchScreen); CR @Sprint 7
		Assert.assertTrue(WhatBreedAreThey._WhatBreedAreTheyScreenTitle.isDisplayed());
		logger.info("the user can tap on Cancel after selecting a breed to restart the search (What breed are they(4) )");
	}
	
	@And("^the user tap Next CTA to display Pet Name is a mixed breed What breed are they 5.0$")
	public void the_user_tap_Next_CTA_to_display_Pet_Name_is_a_mixed_breed_What_breed_are_they_5_0() throws Throwable {
	//	String Name = "Abyssinian";
	//	TapElement(WhatBreedAreThey._BreedPlaceHolder);
	//	TapElement(WhatBreedAreThey._dropdownelement1);
	//	TapElement(WhatBreedAreThey._nextCTASearchScreen); CR @Sprint 7
	//	TapElement(WhatBreedAreThey._nextCTA);
		TapElement(WhatBreedAreThey._mixedbreedCheckBox);
		TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(2000);
		WaitVisibilityOfElement(LetsAddTheirPhoto._mixedbreed);//faild
		Assert.assertTrue(LetsAddTheirPhoto._mixedbreed.isDisplayed());
		logger.info("the user tap Next CTA to display \"<Pet Name> is a mixed breed (What breed are they (5.0))");
	}
	
	@And("^the user can tap on the checkbox to confirm Pet Name is a mixed breed What breed are they 5.1$")
	public void the_user_can_tap_on_the_checkbox_to_confirm_Pet_Name_is_a_mixed_breed_What_breed_are_they_5_1() throws Throwable{
		Assert.assertTrue(WhatBreedAreThey._mixedbreedCheckBox.isDisplayed());
		logger.info("the user can tap on the checkbox to confirm \"<Pet Name> is a mixed breed\" (What breed are they (5.1))");
	}
	
	@And("^the checkbox is not a mandatory field$")
	public void the_checkbox_is_not_a_mandatory_field() throws Throwable{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		TapElement(WhatBreedAreThey._BreedPlaceHolder);
		TapElement(WhatBreedAreThey._dropdownelement1);
		TapElement(WhatBreedAreThey._nextCTA);
	//	TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(2000);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		Thread.sleep(3000);
		TapElement(LetsAddTheirPhoto._backCTA);
		TapElement(WhatBreedAreThey._mixedbreedCheckBox);
		TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(2000);
		Assert.assertTrue(LetsAddTheirPhoto._mixedbreed.isDisplayed());
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the checkbox is not a mandatory field");
	}
	
	@And("^the Next CTA is enabled after selecting the breed$")
	public void the_Next_CTA_is_enabled_after_selecting_the_breed(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		TapElement(WhatBreedAreThey._BreedPlaceHolder);
		TapElement(WhatBreedAreThey._dropdownelement1);
	//	TapElement(WhatBreedAreThey._nextCTASearchScreen);
		Assert.assertTrue(WhatBreedAreThey._nextCTA.isEnabled());
		logger.info("the Next CTA is enabled after selecting the breed");
	}
	
	@And("^the user taps on Next CTA to go to the Lets add their photo screen$")
	public void the_user_taps_on_Next_CTA_to_go_to_the_Lets_add_their_photo_screen() throws Throwable{
		TapElement(WhatBreedAreThey._nextCTA);
		TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(2000);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user taps on Next CTA to go to the \"Let's add their photo\" screen");
	}
	
	@And("^the user taps on < at the top to go back to the previous screen Tell us about your pet$")
	public void the_user_taps_on_back_at_the_top_to_go_back_to_the_previous_screen_Tell_us_about_your_pet() throws Throwable{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		TapElement(WhatBreedAreThey._backCTA);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		Thread.sleep(200);
		logger.info("the user taps on < at the top to go back to the previous screen \"Tell us about your pet\"");
	}
	
	@And("^user is on what breed arethey page and the user taps on X at the top to go back to Home Screen$")
	public void user_is_on_what_breed_are_they_page_and_the_user_taps_on_close_CTA_at_the_top_to_go_back_to_Home_Screen() throws Throwable{
	//	TapElement(Tellusaboutyourpet._nextCTAStep3);
		TapElement(WhatBreedAreThey._cancelCTA);
		Thread.sleep(2000);
	//	WaitVisibilityOfElement(Home._headerText);
		Assert.assertTrue(Home._headerText.isDisplayed());
		logger.info("the user taps on X at the top to go back to Home Screen");
	}

}
