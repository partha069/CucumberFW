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
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedInUser_Step4A3_WhenAndwhere_NavigationFromRescheduleCancelSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedInUser_Step4A3_WhenAndwhere_NavigationFromRescheduleCancelSteps.class);

	@And("^on the when & where screen the New search CTA will not be displayed$")
	public void on_the_when_and_where_screen_the_New_search_CTA_will_not_be_displayed() {
		try {
			Assert.assertFalse(WhenAndWhere._newSearchCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("New Search CTA is not Displayed");
		}
		logger.info("on the when & where screen the New search CTA will not be displayed");
	}

	@And("^by default the Next CTA will be in a disabled state$")
	public void by_default_the_Next_CTA_will_be_in_a_disabled_state() {
		softassert.assertFalse(WhenAndWhere._nextCTA.isSelected());
		softassert.assertAll();
		logger.info("by default the Next CTA will be in a disabled state");
	}
	
	@Then("^Next CTA is enabled only after selecting the location$")
	public void Next_CTA_is_enabled_only_after_selecting_the_location() throws Throwable {
		TapElement(WhenAndWhere._hospital8);
		logger.info("Next CTA is enabled only after selecting the location");
	}
}
