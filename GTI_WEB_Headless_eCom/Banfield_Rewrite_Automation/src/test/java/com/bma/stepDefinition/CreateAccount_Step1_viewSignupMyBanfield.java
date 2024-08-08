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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Step1_viewSignupMyBanfield extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);

	@Given("^user is on the Sign up for MyBanfield screen$")
	public void the_user_is_on_the_Sign_up_for_MyBanfield_screen() throws Throwable {
		ViewWelcome.TapOnnewCreateAccount();
		havewemet.TapOnYesIHaveCTA();
		Thread.sleep(3000);
	//	Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("user is on the Sign up for MyBanfield screen"); 
	}

	@Then("^the user should be displayed with the section to enter Client ID to sign up$")
	public void the_user_should_be_displayed_with_the_section_to_enter_Client_ID_to_sign_up() throws Throwable {
		SignUpForMyBanfield.VerifyCreateAccountEnterclientIDUI();
		logger.info("the user should be displayed with the section to enter Client ID to sign up"); 
	}

	@Then("^the user is displayed with the section to retrieve Client ID$")
	public void the_user_is_displayed_with_the_section_to_retrieve_Client_ID() throws Throwable {
		SignUpForMyBanfield.VerifyCreateAccountRetrieveclientIDUI();
		logger.info("the user is displayed with the section to retrieve Client ID"); 
	}
	@Then("^the greyed out text in Enter email field : Enter email$")
	public void the_greyed_out_text_in_Enter_email_field_Enter_email() throws Throwable {
		Assert.assertEquals("Enter email",SignUpForMyBanfield._EnterEmailTextfield.getText());
		logger.info("the greyed out text in Enter email field : Enter email"); 
	}

	@Then("^the user is displayed with the Need more information\\? CTA$")
	public void the_user_is_displayed_with_the_Need_more_information_CTA() throws Throwable {
		Assert.assertTrue(SignUpForMyBanfield._NeedMoreInfoCTA.isDisplayed());
		logger.info("the user is displayed with the Need more information"); 
	}

	@Then("^the user taps on Help with Client IDs hyperlink to get redirected to Help with Client IDs screen$")
	public void the_user_taps_on_Help_with_Client_IDs_hyperlink_to_get_redirected_to_Help_with_Client_IDs_screen() throws Throwable {
	  TapElement(SignUpForMyBanfield._HelpwithclientIdHyperlinkText);
	  verifytest(HelpWithClientIds._HelpWithClientIdHeader);
	  Assert.assertTrue(HelpWithClientIds._HelpWithClientIdHeader.isDisplayed());
	  logger.info("the user taps on Help with Client IDs hyperlink to get redirected to Help with Client IDs screen"); 
	}

	@Then("^the user taps on the Need more information CTA to invoke the Help with Client ID's screen$")
	public void the_user_taps_on_the_Need_more_information_CTA_to_invoke_the_Help_with_Client_ID_s_screen() throws Throwable {
		 TapElement(SignUpForMyBanfield._NeedMoreInfoCTA); 
		 Thread.sleep(1000);
		 verifytest(HelpWithClientIds._HelpWithClientIdHeader);
		 Assert.assertTrue(HelpWithClientIds._HelpWithClientIdHeader.isDisplayed());
		 logger.info("the user taps on the Need more information CTA to invoke the Help with Client ID's screen"); 
	}

}
