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

public class Highlights_IndicatorsSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_IndicatorsSteps.class);

	@When("^they tap to view the highlights tab$")
	public void they_tap_to_view_the_highlights_tab() throws Throwable {
		TapElement(PetCard._highlights);
		Thread.sleep(4000);
		softassert.assertTrue(PetCard._highlights.isEnabled());
		softassert.assertAll();
		logger.info("they tap to view the highlights tab");
	}
}
