package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class HighlightsSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(HighlightsSteps.class);

	@And("^Shareable records are only displayed for Dogs$")
	public void Shareable_records_are_only_displayed_for_Dogs() throws Throwable {
		ScrolltoElement("Kimberlee"); 
		TapElement(Home._pet01);
		Thread.sleep(4000);
		ScrolltoElement("Shareable records");
		Assert.assertTrue(PetCard._ShareableRecords.isDisplayed());
		logger.info("Shareable records are only displayed for Dogs");
	}
	
	@And("^the user taps on Pet profile to go to$")
	public void user_taps_on_Pet_profile_to_go_to() throws Throwable {
		ScrolltoElement("Allergies");
		PetCard.VerifypetprofileUI();
		ScrolltoElement("Rabies tag");
		softassert.assertTrue(PetCard._petprofilemedicalallergies.isDisplayed());
		softassert.assertTrue(PetCard._petprofilemicrochip.isDisplayed());
		softassert.assertTrue(PetCard._petprofilerabies.isDisplayed());
		logger.info("the user taps on Pet profile to go to");
	}


	
}
