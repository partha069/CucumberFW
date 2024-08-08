package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.WhatsGoingOnScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NewPatientReasonOptions extends Utilities {

	SoftAssert softassert = new SoftAssert();
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	
	private static Logger logger = LogManager.getLogger(HighlightsShareableRecordsSteps.class);

	@And("^the user taps on < to get redirected to the earlier screen$")
	public void the_user_taps_on_backcta__to_get_redirected_to_the_earlier_screen() {
		verifytest(WhatsGoingOn._backCTA);
		TapElement(WhatsGoingOn._backCTA);
		logger.info("the user taps on < to get redirected to the earlier screen");
	}

	@And("^the user taps on X icon to get redirected to where they clicked on Make appointment$")
	public void the_user_taps_on_X_icon_to_get_redirected_to_where_they_clicked_on_Make_appointment () {
		TapElement(WhatsGoingOn._cancelCTA);
		Assert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
		verifytest(PetCard._makeAnAppointmentCTAHighlights);
		logger.info("the user taps on X icon to get redirected to where they clicked on Make appointment ");
	}
	
	@And("^the user can tap on X icon to get redirected to the Have we met screen$")
	public void the_user_taps_on_X_icon_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		TapElement(WhatsGoingOn._cancelCTA);
		Thread.sleep(600);
		verifytest(havewemet._noIHaveButton);
		Assert.assertTrue(havewemet._noIHaveButton.isDisplayed());
		logger.info("the user can tap on X icon to get redirected to the Have we met screen");
	}
}
