package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewPetAge_0to12_months_oldSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewPetAge_0to12_months_oldSteps.class);

	@Then("^the pets age is displayed on Pet Dashboard screen$")
	public void pets_age_is_displayed_on_Pet_Dashboard_screen() {
		softassert.assertTrue(PetCard._highlights.isDisplayed());
		softassert.assertTrue(PetCard._timeline.isDisplayed());
		softassert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
	    softassert.assertAll();
		logger.info("the pets age is displayed on Pet Dashboard screen");
	}
	
	@Then("^if the pets age is under 1 month Pets age is displayed as 0 months old$")
	public void pets_age_is_under_One_month_Pets_age() {
		softassert.assertTrue(PetCard._Age.isDisplayed());
	    softassert.assertAll();
		logger.info("if the pets age is under 1 month Pets age is displayed as 0 months old");
	}
}
