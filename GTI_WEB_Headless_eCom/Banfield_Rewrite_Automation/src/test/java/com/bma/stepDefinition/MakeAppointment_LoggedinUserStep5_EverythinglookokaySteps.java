package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.EverythingLookOkayScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MakeAppointment_LoggedinUserStep5_EverythinglookokaySteps extends Utilities {

	public EverythingLookOkayScreen EverythingLookOkay = new EverythingLookOkayScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep5_EverythinglookokaySteps.class);

	@And("^the user taps on X to get redirected to the screen the clicked on Make appointment CTA$")
	public void the_user_taps_on_X_to_get_redirected_to_the_screen_the_clicked_on_Make_appointment_CTA () throws Throwable {
		Thread.sleep(1000);
		TapElement(EverythingLookOkay._cancelCTA);
		Thread.sleep(3000);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
		softassert.assertAll();
		logger.info("the user taps on X to get redirected to the screen the clicked on Make appointment CTA ");
	}
}
