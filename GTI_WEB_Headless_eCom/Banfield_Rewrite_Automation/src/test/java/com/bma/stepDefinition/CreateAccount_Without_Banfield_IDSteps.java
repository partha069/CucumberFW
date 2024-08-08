package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.ModelpopupScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Without_Banfield_IDSteps extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public ModelpopupScreen Modelpopup = new ModelpopupScreen(driver);

	@Then("^user taps on No I am new option$")
	public void user_taps_on_No_I_am_new_option() throws Throwable {
		TapElement(havewemet._noIHaveButton);
		logger.info("the user tap on NO I am new option");
	}
	
	@Then("^user taps Yes I have option$")
	public void user_taps_on_Yes_I_Have_option() throws Throwable {
		Thread.sleep(4000);
		softassert.assertTrue(havewemet._haveyoubeentoaBanfieldPetHospitalBefore.isDisplayed());
		softassert.assertAll();
		TapElement(havewemet._yesIHaveButton);
		logger.info("user taps Yes I have option");
	}

	@Then("^the user should be displayed with the message on the Modal pop up$")
	public void the_user_should_be_displayed_with_the_message_on_the_Modal_pop_up()  {
		try {
		softassert.assertTrue(Modelpopup._NoIamNewText.isDisplayed());
	//	softassert.assertTrue(Modelpopup._Comeinforappointment.isDisplayed());	
	//	softassert.assertTrue(Modelpopup._nearestBanfield.isDisplayed());
	//	softassert.assertTrue(Modelpopup._okay.isDisplayed());
		softassert.assertAll();
		}catch ( Exception e ) {
		TapElement(havewemet._noIHaveButton);
		verifyNearestBanfieldpopups();
	//	softassert.assertTrue(Modelpopup._NoIamNewText.isDisplayed());
	//	softassert.assertTrue(Modelpopup._Comeinforappointment.isDisplayed());	
	//	softassert.assertTrue(Modelpopup._nearestBanfield.isDisplayed());
	//	softassert.assertTrue(Modelpopup._okay.isDisplayed());
		softassert.assertAll();
		}

	}

	@Then("^the user is displayed with the following options on the modal, Nearest Banfield ,Okay$")
	public void the_user_is_displayed_with_the_following_options_on_the_modal_Nearest_Banfield_Okay() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			System.out.println("User is on model popup");
		} else {
		try {
			softassert.assertTrue(Modelpopup._nearestBanfield.isDisplayed());	
			softassert.assertTrue(Modelpopup._okay.isDisplayed());
			softassert.assertAll();
			}catch ( Exception e ) {
//				havewemet.TapOnNoIMNew();	
				softassert.assertTrue(Modelpopup._nearestBanfield.isDisplayed());	
				softassert.assertTrue(Modelpopup._okay.isDisplayed());
				softassert.assertAll();
			}
		}

	}

	@Then("^the user taps on Nearest Banfield to get redirected to the Hospital Locator screen\\.$")
	public void the_user_taps_on_Nearest_Banfield_to_get_redirected_to_the_Hospital_Locator_screen() throws Throwable {
		try {
			if(Modelpopup._NoIamNewText.isDisplayed()) {
			TapElement(Modelpopup._nearestBanfield);
			TapElement(Modelpopup._denyNativePopups);
			Thread.sleep(1000);
			verifytest(Modelpopup._whenandwhereheader);
			Assert.assertTrue(Modelpopup._whenandwhereheader.isDisplayed());}
		}catch ( Exception e ) {
			TapElement(havewemet._noIHaveButton);
			TapElement(Modelpopup._nearestBanfield);
			TapElement(Modelpopup._denyNativePopups);
			Thread.sleep(1000);
			verifytest(Modelpopup._whenandwhereheader);
			Assert.assertTrue(Modelpopup._whenandwhereheader.isDisplayed());
		}
	}

	@Then("^the user taps on Okay to dismiss the modal to stay on the same screen$")
	public void the_user_taps_on_Okay_to_dismiss_the_modal_to_stay_on_the_same_screen() throws Throwable {
			try {
				TapElement(Modelpopup._okay);
				verifytest(havewemet._havewemettitle);
				Assert.assertTrue(havewemet._havewemettitle.isDisplayed());
			}catch ( Exception e ) {
				TapElement(havewemet._noIHaveButton);
				TapElement(Modelpopup._okay);
				verifytest(havewemet._havewemettitle);
				Assert.assertTrue(havewemet._havewemettitle.isDisplayed());
			}
	}

}
