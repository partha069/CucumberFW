package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MakeAnAppointment_GuestUser_Step_8_And_Step_9_HospitalCardCTASteps extends Utilities {


	public WhenAndWhereScreen whenandwhere = new WhenAndWhereScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAnAppointment_GuestUser_Step_8_And_Step_9_HospitalCardCTASteps.class);

	@When("^the user is displayed with the Hospital locations$")
	public void the_user_is_displayed_with_the_Hospital_locations() throws Throwable {
		Thread.sleep(7000);
		whenandwhere.verifymapicononfirstcard();
		logger.info("the user is displayed with the Hospital locations");
	}

	@Then("^the user is displayed with the following$")
	public void the_user_is_displayed_with_the_following() throws Throwable {
		whenandwhere.verifymapicononfirstcard();
		logger.info("the user is displayed with the following");
	}

	@Then("^the user can tap on the Map icon to go to the default map app with location pre-pinned\\.$")
	public void the_user_can_tap_on_the_Map_icon_to_go_to_the_default_map_app_with_location_pre_pinned() throws Throwable {
		TapElement(whenandwhere._firsthospitalmapicon);
		logger.info("the user can tap on the Map icon to go to the default map app with location pre-pinned");
	}
}
