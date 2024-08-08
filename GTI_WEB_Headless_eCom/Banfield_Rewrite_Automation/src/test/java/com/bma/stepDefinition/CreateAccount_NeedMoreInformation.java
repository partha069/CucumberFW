package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_NeedMoreInformation extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	
	@When("^they are displayed with the Need more information CTA$")
	public void they_are_displayed_with_the_Need_more_information_CTA() throws Throwable {
	//	ScrolltoElement("Need more information?");
		swipeDown();
		logger.info("they are displayed with the Need more information CTA");
	}

	@When("^the user taps on Need more information CTA$")
	public void the_user_taps_on_Need_more_information_CTA() throws Throwable {
		TapElement(SignUpForMyBanfield._NeedMoreInfoCTA);
		logger.info("the user taps on Need more information CTA");
	}

	@Then("^the user is redirected to Help with Client IDs screen$")
	public void the_user_is_redirected_to_Help_with_Client_IDs_screen() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(HelpWithClientIds._HelpWithClientIdHeader.isDisplayed());
		logger.info("the user is redirected to Help with Client IDs screen");
	}

	@Then("^the user is displayed with the following on screen Need help with your Client ID\\? ,$")
	public void the_user_is_displayed_with_the_following_on_screen_Need_help_with_your_Client_ID() throws Throwable {
		HelpWithClientIds.VerifyCreateAccountNeedmoreInformation();
		logger.info("the user is displayed with the following on screen Need help with your Client ID");
	}


	@Then("^the user is displayed with the Make an appointment CTA on Help with Client IDs screen$")
	public void the_user_is_displayed_with_the_Make_an_appointment_CTA_on_Help_with_Client_IDs_screen() throws Throwable {
		Assert.assertTrue(HelpWithClientIds._MakeanAppointmentCTA.isDisplayed());
		logger.info("the user is displayed with the Make an appointment CTA on Help with Client IDs screen");
	}

	@Then("^the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met\\? screen$")
	public void the_user_taps_on_Make_an_appointment_CTA_on_Help_with_Client_IDs_screen_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		Thread.sleep(1000);
		verifytest(HelpWithClientIds._MakeanAppointmentCTA);
		TapElement(HelpWithClientIds._MakeanAppointmentCTA);
		Thread.sleep(2000);
		logger.info("the user taps on Make an appointment CTA on Help with Client IDs screen to get redirected to Have we met\\\\? screen");
	}

	@Then("^the user taps on (\\d+)-(\\d+)-(\\d+) hyperlink to open devices default dialer$")
	public void the_user_taps_on_hyperlink_to_open_devices_default_dialer(int arg1, int arg2, int arg3) throws Throwable {
		verifytest(HelpWithClientIds._SubHeadingStaticText_Look_for_your_Banfield_Client_ID);
		TapElement(HelpWithClientIds._phoneNoHyperlink);
		Thread.sleep(3000);
	}

	@Then("^the user taps on < to get redirected to the previous screen  on Help with Client IDs screen$")
	public void the_user_taps_on_to_get_redirected_to_the_previous_screen_on_Help_with_Client_IDs_screen() throws Throwable {
		TapElement(HelpWithClientIds._backCTA);
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user taps on < to get redirected to the previous screen  on Help with Client IDs screen");
	}

	@Then("^the user taps on X to get redirected to the Welcome screen on Help with Client IDs screen$")
	public void the_user_taps_on_X_to_get_redirected_to_the_Welcome_screen_on_Help_with_Client_IDs_screen() throws Throwable {
		TapElement(HelpWithClientIds._cancelCTA);
		verifytest(ViewWelcome._signInbutton);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on X to get redirected to the Welcome screen on Help with Client IDs screen");
	}
	
	@And("^User wants to verify Help with Client IDs Page$")
	public void User_wants_to_verify_Help_with_Client_IDs_Page() throws Throwable {
		Thread.sleep(3000);
		verifytest(HelpWithClientIds._SubHeadingText_Have_you_been_to_a_Banfield_before);
		HelpWithClientIds.verifyHelpWithClientIdsUI();
		logger.info("User wants to verify Help with Client IDs Page");
	}

}
