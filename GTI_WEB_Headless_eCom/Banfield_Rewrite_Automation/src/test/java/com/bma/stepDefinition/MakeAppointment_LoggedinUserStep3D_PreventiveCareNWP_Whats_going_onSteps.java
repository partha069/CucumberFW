package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.WhatsGoingOnScreen;
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedinUserStep3D_PreventiveCareNWP_Whats_going_onSteps extends Utilities {

	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep3D_PreventiveCareNWP_Whats_going_onSteps.class);
	
	@And("^user should able to see options are not selected by default$")
	public void user_should_able_to_see_options_are_not_selected_by_default() {
		softassert.assertFalse(WhatsGoingOn._RoutineVisitButton.isSelected());
		softassert.assertFalse(WhatsGoingOn._VaccinationButton.isSelected());
		softassert.assertAll();
		logger.info("user should able to see options are not selected by default");
	}
	
	@And("^the user should be displayed with the Tell us more,Options to choose,Notes for the vet fields$")
	public void user_should_be_displayed_with_the_Tell_us_more_Options_to_choose_Notes_for_the_vet_fields() throws Throwable {
		WhatsGoingOn.verifyWhatsGoingonpage();
		softassert.assertTrue(WhatsGoingOn._RoutineVisitText.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the Tell us more,Options to choose,Notes for the vet fields");
	}
	
	@And("^the user can select only one option is mandatory$")
	public void user_can_select_only_one_option_is_mandatory() {
		softassert.assertFalse(WhatsGoingOn._RoutineVisitButton.isSelected());
		softassert.assertAll();
		logger.info("the user can select only one option is mandatory");
	}
	
	@And("^the NWP pet should be displayed with the Routine visit , Vaccination options$")
	public void NWP_pet_should_be_displayed_with_the_Routine_visit_Vaccination_options() throws Throwable {
		softassert.assertTrue(WhatsGoingOn._RoutineVisitText.isDisplayed());
		softassert.assertTrue(WhatsGoingOn._VaccinationText.isDisplayed());
		softassert.assertAll();
		logger.info("the NWP pet should be displayed with the Routine visit , Vaccination options  ");
	}
}
