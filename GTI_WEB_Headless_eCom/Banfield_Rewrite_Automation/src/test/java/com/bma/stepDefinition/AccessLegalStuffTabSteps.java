package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ProfileScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccessLegalStuffTabSteps extends Utilities {

	public ProfileScreen Profile = new ProfileScreen(driver);
	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AccessLegalStuffTabSteps.class);

	@Then("^the user will be redirected to Hi username screen$")
	public void user_will_be_redirected_to_Hi_username_screenA() {
		softassert.assertTrue(Profile._HiUser_header.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be redirected to Hi username screen");
	}

	@And("^the user will be displayed with the following in Legal stuff Page$")
	public void user_will_be_displayed_with_the_following_in_Legal_stuff_Page() {
		LegalStuffSteps.verifyLegalstuffCTA();
		softassert.assertTrue(Profile._facebookicon.isDisplayed());
		softassert.assertTrue(Profile._instagramicon.isDisplayed());
		softassert.assertTrue(Profile._twittericon.isDisplayed());
		softassert.assertTrue(Profile._youtubeicon.isDisplayed()); 
	//	softassert.assertTrue(Profile._trademark.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the following in Legal stuff Page");
	}
	
	@And("^the user can tap  < icon to go back to Hiusername screen$")
	public void user_can_tap_back_icon_to_go_back_to_Hi_username_screen() throws Throwable {
		TapElement(LegalStuffSteps._backCTA);
		Thread.sleep(2000);
		verifytest(Profile._HiUser_header);
		softassert.assertTrue(Profile._HiUser_header.isDisplayed());
		softassert.assertAll();
		logger.info("the user can tap  < icon to go back to Hi username screen");
	}
}
