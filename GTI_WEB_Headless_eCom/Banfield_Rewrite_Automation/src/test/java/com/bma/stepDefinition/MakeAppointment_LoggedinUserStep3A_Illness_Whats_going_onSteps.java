package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedinUserStep3A_Illness_Whats_going_onSteps extends Utilities {

	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep3A_Illness_Whats_going_onSteps.class);
	
	@And("^the user taps on X icon to get redirected to the Home Screen$")
	public void the_user_taps_on_X_icon_to_get_redirected_to_the_Home_Screen() throws Throwable {
		TapElement(WhatsGoingOn._cancelCTA);
		Thread.sleep(2000);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
	    softassert.assertAll();
		logger.info("the user taps on X icon to get redirected to the Home Screen");
	}
}
