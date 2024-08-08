package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.SettingsScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessProfileTabSteps extends Utilities {

	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	public SettingsScreen Settings = new SettingsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AccessProfileTabSteps.class);

	@When("^the user taps on the profile from bottom navigation$")
	public void user_taps_on_the_profile_from_bottom_navigation() {
		TapElement(BottomNavigation._profileCTA);
		logger.info("the user taps on the profile from bottom navigation");
	}
	
	@Then("^the user should be redirected to Hi User name screen$")
	public void user_should_be_redirected_to_Hi_User_name_screenn() throws Throwable {
		Thread.sleep(4000);
		Assert.assertTrue(Profile._HiUser_header.isDisplayed());
		logger.info("the user should be redirected to Hi User name screen");
	}
	
	@And("^the screen should display the following :$")
	public void screen_should_display_the_following() throws Throwable {
		Thread.sleep(4000);
		Profile.verifyprofilescreen();
		logger.info("the screen should display the following");
	}
	
	@And("^the user taps on Manage Optimum Wellness Plans CTA to get redirected to device default browser$")
	public void user_taps_on_Manage_Optimum_Wellness_Plans_CTA() throws Throwable {
		TapElement(Settings._backCTA);
		Thread.sleep(1000);
		TapElement(Profile._plans);
		logger.info("the user taps on Manage Optimum Wellness Plans CTA to get redirected to device default browser");
	}
	
	@And("^the screen should display Explore Optimum Wellness Plans$")
	public void display_Explore_Optimum_Wellness_Plans() throws Throwable {
		Thread.sleep(4000);
		Assert.assertTrue(Profile._plans.isDisplayed());
		logger.info("the screen should display Explore Optimum Wellness Plans");
	}
	
	@And("^the user taps on Explore Optimum Wellness Plans CTA to get redirected to device default browser$")
	public void taps_on_Explore_Optimum_Wellness_Plans_CTA() {
		TapElement(Profile._plans);
		logger.info("the user taps on Explore Optimum Wellness Plans CTA to get redirected to device default browser");
	}
	
	@And("^the user taps on Settings CTA$")
	public void user_taps_on_Settings_CTA() throws Throwable {
	    TapElement(Profile._SettingsCTA);
	    Thread.sleep(1000);
	    Assert.assertTrue(Settings._settingsTitle.isDisplayed());
		logger.info("the user taps on Settings CTA");
	}

}
