package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WhatSpeciesIsYourPet_MakeAppointmentFlowSteps extends Utilities {

	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);

	SoftAssert softassert = new SoftAssert();
	
	private static Logger logger = LogManager.getLogger(WhatSpeciesIsYourPet_MakeAppointmentFlowSteps.class);

	@Then("^the user is redirected to What species is your pet screen$")
	public void user_is_redirected_to_What_species_is_your_pet_screen() {
		Assert.assertTrue(WhatSpeciesIsYourPet._whatsspeciestitle.isDisplayed());
		logger.info("the user is redirected to What species is your pet screen");
	}
	
	@And("^the user will click on < to get redirected to Who are we scheduling screen$")
	public void the_user_will_click_on_back_to_get_redirected_to_Who_are_we_scheduling_screen() {
		TapElement(WhatSpeciesIsYourPet._backCTA);
		softassert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user will click on < to get redirected to Who are we scheduling screen");
	}
	
	@And("^the added pet will be displayed on the Who are we scheduling screen and on Dashboard once the pet is added$")
	public void the_added_pet_will_be_displayed_on_the_Who_are_we_scheduling_screen_and_on_Dashboard_once_the_pet_is_added() {
		softassert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
		softassert.assertAll();
		verifytest(who_are_we_Scheduling._petcard);
		logger.info("the added pet will be displayed on the Who are we scheduling screen and on Dashboard once the pet is added");
	}
}
