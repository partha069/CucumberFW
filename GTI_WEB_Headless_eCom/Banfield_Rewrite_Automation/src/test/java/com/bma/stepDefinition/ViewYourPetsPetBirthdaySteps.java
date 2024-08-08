package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.DisplaySplashScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewYourPetsPetBirthdaySteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);


	private static Logger logger = LogManager.getLogger(ViewYourPetsPetBirthdaySteps.class);
	
	@When("^there is a birthday for a pet$")
	public void there_is_a_birthday_for_a_pet() throws Throwable{
		Thread.sleep(9000);
	//	WaitVisibilityOfElement(Home._petBirthdayBanner);
		Assert.assertTrue(Home._petBirthdayBanner.isDisplayed());
		logger.info("there is a birthday for a pet");
	}
	
	@Then("^the user should be displayed with the Birthday hat on the pet photo$")
	public void the_user_should_be_displayed_with_the_Birthday_hat_on_the_pet_photo() throws Throwable{
		Thread.sleep(9000);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	WaitVisibilityOfElement(Home._petHat);
		Assert.assertTrue(Home._petHat.isDisplayed());
		logger.info("the user should be displayed with the Birthday hat on the pet photo");
	}
	
	@And("^the Birthday Banner should be displayed on the Home screen if there is a Pet birthday$")
	public void the_Birthday_Banner_should_be_displayed_on_the_Home_screen_if_there_is_a_Pet_birthday(){
		Assert.assertTrue(Home._petBirthdayBanner.isDisplayed());
		verifytest(Home._petBirthdayBanner);
		logger.info("the Birthday Banner should be displayed on the Home screen if there is a Pet birthday");
	}
}
