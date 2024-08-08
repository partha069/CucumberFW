package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.YouareAllSetScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MakeAppointment_LoggedinUserStep6_YoureallsetSteps extends Utilities {

	public YouareAllSetScreen YouareAllSet = new YouareAllSetScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep6_YoureallsetSteps.class);

	@When("^the Done CTA by default should show in enabled state$")
	public void the_Done_CTA_by_default_should_show_in_enabled_state() {
		softassert.assertTrue(YouareAllSet._doneCTA.isEnabled());
		softassert.assertAll();	
		logger.info("the Done CTA by default should show in enabled state");
	}
	
	@And("^the user taps on Done to get redirected to the screen where they clicked on Make appointment CTA$")
	public void the_user_taps_on_Done_to_get_redirected_to_the_screen_where_they_clicked_on_Make_appointment_CTA() throws Throwable {
		TapElement(YouareAllSet._doneCTA);
		softassert.assertTrue(Home._MakeAnAppointmentCTA.isDisplayed());
		softassert.assertAll();	
		logger.info("the user taps on Done to get redirected to the screen where they clicked on Make appointment CTA");
	}
	
	@And("^the user should be displayed with the following Static Text$")
	public void the_user_should_be_displayed_with_the_following_Static_Text() throws Throwable {
		softassert.assertTrue(YouareAllSet._SeeYouSoonText.isDisplayed());
		softassert.assertAll();	
		logger.info("the user taps on Done to get redirected to the screen where they clicked on Make appointment CTA");
	}
}
