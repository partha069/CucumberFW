package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.MyPetsScreen;
import com.bma.pageObject.ProfileScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class YourPetsSteps extends Utilities {

	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ProfileScreen profile = new ProfileScreen(driver);
	public MyPetsScreen myPets = new MyPetsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(YourPetsSteps.class);

	@When("^the user tapped on the profile bottom navigation$")
	public void the_user_tapped_on_the_profile_bottom_navigation() {
		TapElement(BottomNavigation._profileCTA);
		Assert.assertTrue(profile._HiUser_header.isDisplayed());
		logger.info("the user tapped on the profile bottom navigation");
	}
	
	@When("^the user taps on the Your pets CTA$")
	public void the_user_taps_on_the_Your_pets_CTA() {
		TapElement(profile._YourPetsCTA);
		logger.info("the user taps on the Your pets CTA");
	}
	
	@Then("^the user should be redirected to My pets screen$")
	public void the_user_should_be_redirected_to_My_pets_screen() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(myPets._myPetsTitleText.isDisplayed());
		logger.info("the user should be redirected to My pets screen");
	}
	
	@And("^the user should be displayed with the following text$")
	public void the_user_should_be_displayed_with_the_text() {
		Assert.assertTrue(myPets._myPetsText.isDisplayed());
		logger.info("the user should be displayed with the following text");
	}
	 
	@And("^the user is displayed with the list of pets added by them or hospital system$")
	public void displayed_with_the_list_of_pets_added_by_them_or_hospital_system() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		myPets.verifyPets();
		logger.info("the user is displayed with the list of pets added by them or hospital system");
	}
	
	@And("^the user should be able to turn the toggle button on or off$")
	public void the_user_should_be_able_to_turn_the_toggle_button_on_or_off() throws Throwable {
		myPets.verifyToggleButton();
		logger.info("the user should be able to turn the toggle button on or off");
	}
	
	@And("^the user if turn off the toggle button$")
	public void user_if_turn_off_the_toggle_button() {
		TapElement(myPets._pet1CTA);
		softassert.assertTrue(myPets._pet1CTA.isEnabled());
		softassert.assertAll();
		TapElement(myPets._pet1CTA);
		logger.info("the user if turn off the toggle button");
	}

	
	@And("^the user if turn on the toggle button$")
	public void user_if_turn_on_the_toggle_button() {
		TapElement(myPets._pet1CTA);
		softassert.assertTrue(myPets._pet1CTA.isEnabled());
		softassert.assertAll();
		TapElement(myPets._pet1CTA);
		logger.info("the user if turn on the toggle button");
	}
	
	@And("^by default the toggle button should be enabled$")
	public void default_the_toggle_button_should_be_enabled() {
		softassert.assertTrue(myPets._pet1CTA.isEnabled());
		softassert.assertAll();
		logger.info("by default the toggle button should be enabled");
	}
	
	@And("^the user tap on back button to go back to profile screen.$")
	public void user_tap_on_back_button_to_go_back_to_profile_screen() throws Throwable {
		TapElement(myPets._backCTA);
		Thread.sleep(2000);
		verifytest(profile._HiUser_header);
		Assert.assertTrue(profile._HiUser_header.isDisplayed());
		logger.info("the user tap on back button to go back to profile screen.");
	}
}
