package com.bma.stepDefinition;

import static org.testng.Assert.assertTrue;

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
import com.bma.pageObject.WhatBreedAreTheyScreen;
import com.bma.pageObject.YourPetsScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileElement;

public class AddaPet_Step5A_LetsAddTheirPhoto_AddPhotoSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public LetsAddTheirPhotoScreen LetsAddTheirPhoto = new LetsAddTheirPhotoScreen(driver);
	public WhatBreedAreTheyScreen WhatBreedAreThey = new WhatBreedAreTheyScreen(driver);
	public YourPetsScreen YourPets = new YourPetsScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	
	private static Logger logger = LogManager.getLogger(AddaPet_Step5A_LetsAddTheirPhoto_AddPhotoSteps.class);

	@When("^user has selected a breed on What breed are they screen$")
	public void user_has_selected_a_breed_on_What_breed_are_they_screen() {
		TapElement(WhatBreedAreThey._mixedbreedCheckBox);
		TapElement(WhatBreedAreThey._BreedPlaceHolder);
		TapElement(WhatBreedAreThey._dropdownelement1);
	//	TapElement(WhatBreedAreThey._nextCTASearchScreen); 
	//	TapElement(WhatBreedAreThey._nextCTA);
		Assert.assertTrue(WhatBreedAreThey._WhatBreedAreTheyScreenTitle.isDisplayed());
		logger.info("When user has selected a breed on �What breed are they?� screen");
	}
	
	@When("^the user taps on Next CTA$")
	public void the_user_taps_on_Next_CTA() throws Throwable {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		TapElement(WhatBreedAreThey._nextCTA);
		Thread.sleep(2000);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user taps on 'Next' CTA");
	}
	
	@Then("^the user will be redirected to Lets add their photo screen with Add photo CTA Skip CTA$")
	public void the_user_will_be_redirected_to_Lets_add_their_photo_screen_with_Add_photo_CTA_Skip_CTA() throws Throwable {
		LetsAddTheirPhoto.verifyLetsAddTheirPhotoScreen();
		logger.info("the user will be redirected to �Let�s add their photo� screen with | �+Add photo� CTA  | �Skip� CTA |");
	}
	
	@And("^the fifth navigational dot will be highlighted$")
	public void the_fifth_navigational_dot_will_be_highlighted() {
		//NATC
		logger.info("the fifth navigational dot will be highlighted");
	}
	
	@And("^the user will be displayed of an avatar of the pet based on the pet selected$")
	public void the_user_will_be_displayed_of_an_avatar_of_the_pet_based_on_the_pet_selected() {
		//NATC
		logger.info("the user will be displayed of an avatar of the pet based on the pet selected");
	}
	
	@And("^if the user selected mixed breed in the previous step Mixed will be displayed on the pet card$")
		public void if_the_user_selected_mixed_breed_in_the_previous_step_Mixed_will_be_displayed_on_the_pet_card() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(LetsAddTheirPhoto._mixedbreed.isDisplayed());
		/*
		try {
			TapElement(LetsAddTheirPhoto._backCTA);
			TapElement(WhatBreedAreThey._nextCTA);
			Assert.assertTrue(LetsAddTheirPhoto._mixedbreed.isDisplayed());
			TapElement(LetsAddTheirPhoto._backCTA);
			TapElement(WhatBreedAreThey._mixedbreedCheckBox);
			TapElement(WhatBreedAreThey._nextCTA);
			Assert.assertTrue(LetsAddTheirPhoto._mixedbreed.isDisplayed());
		} catch (Exception e) {
			System.out.println("user selected mixed breed");
		}
		*/
		logger.info("if the user selected mixed breed in the previous step 'Mixed' will be displayed on the pet card");
	}
	
	@And("^the user will tap on Add photo CTA to add a photo$")
	public void the_user_will_tap_on_Add_photo_CTA_to_add_a_photo() {
		verifytest(LetsAddTheirPhoto._addPhotoCTA);
		TapElement(LetsAddTheirPhoto._addPhotoCTA);
		logger.info("the user will tap on �+Add photo� CTA to add a photo");
	}
	
	@And("^the user will be displayed with native alert for the app to access photos on device, if not set already$")
	public void the_user_will_be_displayed_with_native_alert_for_the_app_to_access_photos_on_device_if_not_set_already() {
		try {
			Assert.assertTrue(LetsAddTheirPhoto._nativePopups.isDisplayed());
			TapElement(LetsAddTheirPhoto._onlyThisTimePopups);
		} catch (Exception e) {
			System.out.println("Popups Selected Already");
		}
		TapElement(LetsAddTheirPhoto._denyPopups);
		logger.info("the user will be displayed with native alert for the app to access photos on device, if not set already");
	}
	
	@And("^the user is displayed with the custom pop-up if access is denied$")
	public void the_user_is_displayed_with_the_custom_popup_if_access_is_denied() throws Throwable {
		try {
			LetsAddTheirPhoto.verifyCustomPopup();
		} catch (Exception e) {
		}
		logger.info("the user is displayed with the custom pop-up if access is denied");
	}
	
	@And("^the user tap on Okay CTA to dismiss the pop-up$")
	public void the_user_tap_on_Okay_CTA_to_dismiss_the_pop_up() throws Throwable {
		TapElement(LetsAddTheirPhoto._okCTA);
		Thread.sleep(200);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user tap on \"Okay\" CTA to dismiss the pop-up");
	}
	
	@And("^the user if tap on Add photo CTA again after denying the access$")
	public void the_user_if_tap_on_Add_photo_CTA_again_after_denying_the_access() throws Throwable {
		TapElement(LetsAddTheirPhoto._addPhotoCTA);
		TapElement(LetsAddTheirPhoto._denyPopupspermission);
		try {
			LetsAddTheirPhoto.verifyCustomPopup();
		} catch (Exception e) {
		}
		
		logger.info("the user if tap on �+Add photo� CTA again after denying the access");
	}
	
	@Then("^the user should be displayed with the native alert again to allow the access$")
	public void the_user_should_be_displayed_with_the_native_alert_again_to_allow_the_access() {
		try {
			Assert.assertTrue(LetsAddTheirPhoto._nativePopups.isDisplayed());
			Thread.sleep(200);
			TapElement(LetsAddTheirPhoto._onlyThisTimePopups);
		} catch (Exception e) {
			System.out.println("Popups Selected Already");
		}
		TapElement(LetsAddTheirPhoto._allowPopupsfordeviceaccess);
		logger.info("the user should be displayed with the native alert again to allow the access");
	}
	
	@And("^the user will be displayed with the custom pop-up to add photo with following options if access is given$")
	public void the_user_will_be_displayed_with_the_custom_popup_to_add_photo_with_following_options_if_access_is_given() {
		try {
			if (getUserDeviceInput.contains("IOS")) {
				logger.info("Selected date in date picker");
				}else {
				Thread.sleep(850);
				LetsAddTheirPhoto.verifyCustomPopupsforSetPhoto();
				}
		} catch (Exception e) {
			System.out.println("Popups Selected Already");
		}
	
		logger.info("the user will be displayed with the custom pop-up to add photo with following options if access is given");
	}
	
	@Then("^the user taps on Cancel CTA to cancel the pop up and stay on the same screen$")
	public void user_taps_on_Cancel_CTA_to_cancel_the_pop_up_and_stay_on_the_same_screen() {
		TapElement(LetsAddTheirPhoto._CancelCTACTA);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user taps on Cancel CTA to cancel the pop up and stay on the same screen");
	}
	
	@And("^the user taps on Take Photo CTA to launch the device camera$")
	public void the_user_taps_on_Take_Photo_CTA_to_launch_the_device_camera() {
		try {
			if (getUserDeviceInput.contains("IOS")) {
				logger.info("Selected date in date picker");
				}else {
				Thread.sleep(850);
				TapElement(LetsAddTheirPhoto._TakePhotoCTA);
				}
		} catch (Exception e) {
			System.out.println("Popups Selected Already");
		}
		
		logger.info("the user taps on \"Take Photo\" CTA to launch the device camera");
	}
	
	@And("^the user taps on Choose Photo to launch the device gallery$")
	public void the_user_taps_on_Choose_Photo_to_launch_the_device_gallery() {
		try {
			TapElement(LetsAddTheirPhoto._choosePhotoCTA);
		} catch (Exception e) {
			System.out.println("Popups Selected Already");
		}

		logger.info("the user taps on \"Choose Photo\" to launch the device gallery");
	}
	
	public void the_user_taps_on_Cancel_CTA_to_cancel_the_pop_up_and_stay_on_the_same_screen() {
		TapElement(LetsAddTheirPhoto._CancelCTACTA);
		Assert.assertTrue(LetsAddTheirPhoto._LetsAddTheirPhotoTitletext.isDisplayed());
		logger.info("the user taps on \"Cancel\" CTA to cancel the pop up and stay on the same screen");
	}
	
	@And("^the user will tap on Skip or Next to go to Your pets screen$")
	public void the_user_will_tap_on_Skip_or_Next_to_go_to_Your_pets_screen() throws Throwable {
		TapElement(LetsAddTheirPhoto._skipCTA);
		Thread.sleep(2000);
		Assert.assertTrue(YourPets._YourPetstitle.isDisplayed());
		logger.info("the user will tap on 'Skip' or 'Next' to go to �Your pets� screen");
	}
	
	@And("^the Next CTA is only displayed after user uploaded an image else \"Skip\" CTA will be displayed$")
	public void the_Next_CTA_is_only_displayed_after_user_uploaded_an_image_else_Skip_CTA_will_be_displayed() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertTrue(LetsAddTheirPhoto._skipCTA.isDisplayed());
		logger.info("the Next CTA is only displayed after user uploaded an image else \"Skip\" CTA will be displayed");
	}
	
	@And("^the Next or Skip CTA should be enabled by default$")
	public void the_Next_or_Skip_CTA_should_be_enabled_by_default() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertTrue(LetsAddTheirPhoto._skipCTA.isEnabled());
		logger.info("the \"Next\" or \"Skip\" CTA should be enabled by default");
	}
	
	@And("^the user will tap on < button to go to What breed are they screen$")
	public void the_user_will_tap_on_back_button_to_go_to_What_breed_are_they_screen() throws Throwable {
		TapElement(LetsAddTheirPhoto._backCTA);
		Thread.sleep(2000);
		Assert.assertTrue(WhatBreedAreThey._WhatBreedAreTheyScreenTitle.isDisplayed());
		logger.info("the user will tap on < button to go to �What breed are they? � screen");
	}
	
	@And("^the user will tap on X to go on the Home Screen$")
	public void the_user_will_tap_on_Close_to_go_on_the_Home_Screen() {
	//	TapElement(WhatBreedAreThey._nextCTA);
		TapElement(LetsAddTheirPhoto._closeCTA);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user will tap on X to go on the Home Screen");
	}
	
}
