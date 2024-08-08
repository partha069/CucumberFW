package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Sorting_of_Pet_SpeciesSteps extends Utilities {

	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYour = new WhatSpeciesIsYourPetScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Sorting_of_Pet_SpeciesSteps.class);

	@When("^the user wants to select a pet species$")
	public void user_wants_to_select_a_pet_species() {
		TapElement(WhatSpeciesIsYour._dogSpecies);
		logger.info("the user wants to select a pet species");
	}

	
}
