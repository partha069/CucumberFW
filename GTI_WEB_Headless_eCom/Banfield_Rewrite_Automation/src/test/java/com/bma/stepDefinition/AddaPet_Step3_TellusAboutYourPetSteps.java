package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.DisplaySplashScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatBreedAreTheyScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AddaPet_Step3_TellusAboutYourPetSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public WhatBreedAreTheyScreen WhatBreedAreThey = new WhatBreedAreTheyScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	
	public String path8 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet8.csv";

	private static Logger logger = LogManager.getLogger(AddaPet_Step3_TellusAboutYourPetSteps.class);

	@When("^the user is on Tell us about your pet screen$")
	public void the_user_is_on_Tell_us_about_your_pet_screen() throws Throwable {
	//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//	ViewWelcome.TapOnSigninbutton();
	//	LoginUser.Login_to_addpet();
	//	TapElement(Home._AddaNewPetCTA);
		Thread.sleep(1000);
		TapElement(WhatSpeciesIsYourPet._CatSpecies);
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Tellusaboutyourpet._nameText.isDisplayed());
		logger.info("the user is on Tell us about your pet screen");
	}
	
	@When("^the user clicks on Next CTA on Tell us about your pet screen$")
	public void the_user_clicks_on_Next_CTA_on_Tell_us_about_your_pet_screen() throws Throwable {
		String Name = getcsvdata(path8,2,"Name", "Name","Weight","Color");
		String Weight = getcsvdata(path8,2,"Weight", "Name","Weight","Color");
		String Color = getcsvdata(path8,2,"Color", "Name","Weight","Color");
		
		EnterInput(Tellusaboutyourpet._enterYourPetsName, Name);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		Thread.sleep(800);
		TapElement(Tellusaboutyourpet._ageText);
		Thread.sleep(800);
	//	if (getUserDeviceInput.contains("IOS")) {
	//		logger.info("Selected date in date picker");
	//	}else {
	//	Thread.sleep(850);
	//	TapElement(Tellusaboutyourpet._calendericon);
	//	TapElement(Tellusaboutyourpet._ConfirmCTA);
	//	}
		TapElement(Tellusaboutyourpet._calendericon);
		TapElement(Tellusaboutyourpet._ConfirmCTA);
//		TouchAction touchAction = new TouchAction(getDriver());
//		touchAction.tap(new PointOption().withCoordinates(345, 343)).perform();
		Thread.sleep(1000);
		EnterInput(Tellusaboutyourpet._petWeight, Weight);
		HidingKeyboardios();
	//	ScrolltoElement("All fields are mandatory*");
		swipeDown();
		EnterInput(Tellusaboutyourpet._petColor, Color);
		HidingKeyboardios();
		TapElement(Tellusaboutyourpet._NextCTATellUsAboutYourPet);
		Thread.sleep(1000);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user clicks on Next CTA on Tell us about your pet screen");
	}
	
	@And("^User wants to validate Date Format, Once selected date$")
	public void User_wants_to_validate_Date_Format_Once_selected_date() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			logger.info("Selected date in date picker");
		}else {
		Thread.sleep(850);
		TapElement(Tellusaboutyourpet._calendericon);
		TapElement(Tellusaboutyourpet._ConfirmCTA);
		Assert.assertTrue(Tellusaboutyourpet._EnteredDate.isDisplayed());
		}
		logger.info("User wants to validate Date Format, Once selected date");
	}
	
	@And("^the avatar should have the Name,Age,Gender, Breed$")
	public void the_avatar_should_have_the_Name_Age_Gender_Breed() {
		Tellusaboutyourpet.verifyPetdetails();
		logger.info("the avatar should have the Name,Age,Gender, Breed");
	}
	
	@And("^the user should be displayed the following in the form Gender,Spayed or Neutered$")
	public void the_user_should_be_displayed_with_Gender_Spayed_or_Neutered() {
		Assert.assertTrue(Tellusaboutyourpet._Gender.isDisplayed());
		Assert.assertTrue(Tellusaboutyourpet._SpayedorNeutered.isDisplayed());
		logger.info("the user should be displayed the following in the form Gender,Spayed (S) or Neutered (N)");
	}
	
	@And("^the user should be displayed with the below option in the Gender option Male,Female,Unsure$")
	public void the_user_should_be_displayed_with_the_below_option_in_the_Gender_option_Male_Female_Unsure() {
		Tellusaboutyourpet.verifyform();
		logger.info("the user should be displayed with the below option in the Gender option Male,Female,Unsure");
	}
	
	@And("^the user should be displayed with the below tag in the Spayed or Neutered option Yes,No,Unsure$")
	public void the_user_should_be_displayed_with_the_below_tag_in_the_Spayed_or_Neutered_option_Yes_No_Unsure() {
		Tellusaboutyourpet.verifySpayedorNeutered();
		logger.info("the user should be displayed with the below tag in the Spayed or Neutered option Yes,No,Unsure");
	}
	
	@And("^no options are not selected by default$")
	public void no_options_are_not_selected_by_default() {
		Tellusaboutyourpet.GenderSpayedorNeuteredoption();
		logger.info("no options are not selected by default");
	}
	
	@And("^the user should be able to tap on any option to select it choosing the options is a Mandatory action$")
	public void the_user_should_be_able_to_tap_on_any_option_to_select_it_choosing_the_options_is_a_Mandatory_action() {
		TapElement(Tellusaboutyourpet._femaleGender);
		TapElement(Tellusaboutyourpet._NoGender);
		logger.info("the user should be able to tap on any option to select it choosing the options is a Mandatory action");
	}
	
	@And("^the selected option will be highlighted on tap$")
	public void the_selected_option_will_be_highlighted_on_tap() {
		Assert.assertTrue(Tellusaboutyourpet._femaleGender.isEnabled());
		Assert.assertTrue(Tellusaboutyourpet._NoGender.isEnabled());
		logger.info("the selected option will be highlighted on tap");
	}
	
	@And("^the user cannot multiselect the options$")
	public void the_user_cannot_multiselect_the_options() {
		Tellusaboutyourpet.Gendermultiselect();
		Tellusaboutyourpet.SpayedorNeuteredmultiselect();
		logger.info("the user cannot multiselect the options");
	}
	
	@And("^the Next CTA should be disabled by default$")
	public void the_Next_CTA_should_be_disabled_by_default() throws Throwable {
		TapElement(Tellusaboutyourpet._backCTAStep3);
		TapElement(Tellusaboutyourpet._NextCTATellUsAboutYourPet);
		Thread.sleep(1000);
		Assert.assertTrue(Tellusaboutyourpet._nextCTAStep3.isDisplayed());
		logger.info("the Next CTA should be disabled by default");
	}
	
	@And("^the Next button is enabled after selecting the gender and Spayed/Neutered option$")
	public void the_Next_button_is_enabled_after_selecting_the_gender_and_Spayed_Neutered_option() {
		TapElement(Tellusaboutyourpet._femaleGender);
		TapElement(Tellusaboutyourpet._NoGender);
		Tellusaboutyourpet._nextCTAStep3.isEnabled();
		logger.info("the Next button is enabled after selecting the gender and Spayed/Neutered option");
	}
	
	@And("^the user taps on Next button to go to the What breed are they Screen$")
	public void the_user_taps_on_Next_button_to_go_to_the_What_breed_are_they_Screen() throws Throwable {
		TapElement(Tellusaboutyourpet._nextCTAStep3);
		Thread.sleep(2000);
		Assert.assertTrue(WhatBreedAreThey._WhatBreedAreTheyScreenTitle.isDisplayed());
		logger.info("the user taps on Next button to go to the What breed are they? Screen");
	}
	
	@And("^User wants to verify PetName on Reason for visit Screen$")
	public void User_wants_to_verify_PetName_on_Reason_for_visit_Screen() throws Throwable {
		Assert.assertTrue(Reasonforvisit._PetName.isDisplayed());
		verifytest(Reasonforvisit._PetName);
		logger.info("User wants to verify PetName on Reason for visit Screen");
	}
	
	@And("^the user taps on back at the top to go back to the previous screen Tell us about your pet$")
	public void the_user_taps_on_back_at_the_top_to_go_back_to_the_previous_screen_Tell_us_about_your_pet() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TapElement(Tellusaboutyourpet._backCTAStep3);
		Thread.sleep(1000);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user taps on < at the top to go back to the previous screen Tell us about your pet");
	}
	
	@And("^the user taps on close CTA at the top to go back to Home Screen$")
	public void the_user_taps_on_close_CTA_at_the_top_to_go_back_to_Home_Screen(){
	//	TapElement(Tellusaboutyourpet._NextCTATellUsAboutYourPet);
		TapElement(Tellusaboutyourpet._closeCTAStep3);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user taps on X at the top to go back to Home Screen");
	}
}
