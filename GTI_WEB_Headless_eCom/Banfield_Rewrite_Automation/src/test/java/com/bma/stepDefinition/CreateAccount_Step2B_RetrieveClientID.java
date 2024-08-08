package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.NeedhelpfindingyourMyBanfieldemail;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_RetrieveEmail;
import com.bma.pageObject.Whoops_PopUp_RetrieveEmail_login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Step2B_RetrieveClientID extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_enterEmail_password = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver);
	public NeedhelpfindingyourMyBanfieldemail NeedhelpfindingBanfieldemail = new NeedhelpfindingyourMyBanfieldemail(driver);
	public Whoops_PopUp_RetrieveEmail Whoops_PopUp_Retrieve = new Whoops_PopUp_RetrieveEmail(driver);
	public Whoops_PopUp_RetrieveEmail_login Whoops_PopUp_Retrieve_login = new Whoops_PopUp_RetrieveEmail_login(driver);
	
	public String path1 = "./src/test/resources/TestData/Sprint1/makeappointmentasguest-step2.csv";
	public String path2 = "./src/test/resources/TestData/Sprint2/CreateAccountStep4completeonline.csv";
	
	@Then("^the user enters an Email ID in the field$")
	public void the_user_enters_an_Email_ID_in_the_field() throws Throwable {
		String Email = getcsvdata(path2,3,"Email", "Email","password");
		Assert.assertFalse(SignUpForMyBanfield._SendMyClientIdCTA.isEnabled());
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, Email);
		logger.info("the user enters an Email ID in the field");
	}

	@Then("^the user cannot enter more than 320 Characters in the Email ID field$")
	public void the_user_cannot_enter_more_than_320_Characters_in_the_Email_ID_field() throws Throwable {
		String input= getcsvdata(path1,2,"email", "firstname","lastname","phone","email");
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield,input);
		 Assert.assertNotSame(input,SignUpForMyBanfield._EnterEmailTextfield.getText());
		 logger.info("the user cannot enter more than 320 Characters in the Email ID field");
	}

	@Then("^the user can enter the email only in a valid email ID format$")
	public void the_user_can_enter_the_email_only_in_a_valid_email_ID_format() throws Throwable {
		String Email = getcsvdata(path2,3,"Email", "Email","password");
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, Email);
		Assert.assertEquals("wcid_mjo@selenography.com",SignUpForMyBanfield._EnterEmailTextfield.getText());
	//	Assert.assertEquals("parthadey@photon.com",SignUpForMyBanfield._EnterEmailTextfield.getText());
		logger.info("the user can enter the email only in a valid email ID format");
	}

	@Then("^the Send my Client ID CTA is enabled only after entering the valid Email ID$")
	public void the_Send_my_Client_ID_CTA_is_enabled_only_after_entering_the_valid_Email_ID() throws Throwable {
		Assert.assertTrue(SignUpForMyBanfield._EnterEmailTextfield.isEnabled());
		logger.info("the Send my Client ID CTA is enabled only after entering the valid Email ID");
	}
	
	@Then("^the user taps on Send my Client ID CTA to validate the Email ID entered$")
	public void the_user_taps_on_Send_my_Client_ID_CTA_to_validate_the_Email_ID_entered() throws Throwable {
		TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
		Thread.sleep(8000);
		logger.info("the user taps on Send my Client ID CTA to validate the Email ID entered");
	}

	@Then("^the user is displayed with an inline error message Invalid Email on entering an Invalid Email format$")
	public void the_user_is_displayed_with_an_inline_error_message_Invalid_Email_on_entering_an_Invalid_Email_format() throws Throwable {
		TapElement(SignUpForMyBanfield._EnterEmailTextfield);
		HidingKeyboard();
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, "test@gv");
	//	TapElement(SignUpForMyBanfield._CantfindyourClientIDText);
	//	HidingKeyboard();
		verifytest(SignUpForMyBanfield._InvalidEmailText);
		Assert.assertTrue(SignUpForMyBanfield._InvalidEmailText.isDisplayed());
		logger.info("the user is displayed with an inline error message Invalid Email on entering an Invalid Email format");
	}

	@Then("^the user is displayed with the message on pop up on entering a registered Email ID$")
	public void the_user_is_displayed_with_the_message_on_pop_up_on_entering_a_registered_Email_ID() throws Throwable {
		String Email = getcsvdata(path2,2,"Email", "Email","password");
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, Email);
		HidingKeyboard();
		TapElement(SignUpForMyBanfield._CantfindyourClientIDText);
		TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
	//	TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
	//	TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
		Assert.assertTrue(Whoops_PopUp_Retrieve_login._WhoopsTitle.isDisplayed());
		logger.info("the user is displayed with the message on pop up on entering a registered Email ID");
	}

	@Then("^Looks like you already have an account$")
	public void looks_like_you_already_have_an_account() throws Throwable {
		Assert.assertTrue(Whoops_PopUp_Retrieve_login._LooksLikeAlreadyHaveAccountText.isDisplayed());
		logger.info("Looks like you already have an account");
	}

	@Then("^Log In Now$")
	public void log_In_Now() throws Throwable {
		Assert.assertTrue(Whoops_PopUp_Retrieve_login._LoginNowCTA.isDisplayed());
		logger.info("Log In Now");
	}

	@Then("^the user taps on Log In Now CTA to get redirected to login page$")
	public void the_user_taps_on_Log_In_Now_CTA_to_get_redirected_to_login_page() throws Throwable {
		TapElement(Whoops_PopUp_Retrieve_login._LoginNowCTA);
		Thread.sleep(200);
		verifytest(Login._LoginButton);
		Assert.assertTrue(Login._LoginButton.isDisplayed());
		logger.info("the user taps on Log In Now CTA to get redirected to login page");
	}

	@Then("^the user is displayed with the error message pop up on entering an unregistered Email ID$")
	public void the_user_is_displayed_with_the_error_message_pop_up_on_entering_an_unregistered_Email_ID() throws Throwable {
		TapElement(SignUpForMyBanfield._EnterEmailTextfield);
	//	ScrolltoElement("Need more information?");
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, "wcid_mjo@selography"+random()+".com");
		HidingKeyboardios();
	//	ScrolltoElement("Need more information?");
		swipeDown();
		TapElement(SignUpForMyBanfield._CantfindyourClientIDText);
		TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
		Thread.sleep(7000);
		softassert.assertTrue(Whoops_PopUp_Retrieve._WhoopsTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the error message pop up on entering an unregistered Email ID");
	}

	@Then("^Whoops!$")
	public void whoops() throws Throwable {
		Assert.assertTrue(Whoops_PopUp_Retrieve._WhoopsTitle.isDisplayed());
		logger.info("Whoops");
	}

	@Then("^That email isnt in our system$")
	public void that_email_isnt_in_our_system() throws Throwable {
		Assert.assertTrue(Whoops_PopUp_Retrieve._ThatEmailisNotInOurSystemText.isDisplayed());
		logger.info("That email isnt in our system");
	}

	@Then("^Forgot your MyBanfield email\\?$")
	public void forgot_your_MyBanfield_email() throws Throwable {
		Assert.assertTrue(Whoops_PopUp_Retrieve._ForgotYourMyBanfieldemailCTA.isDisplayed());
		logger.info("Forgot your MyBanfield email");
	}

	@Then("^the user taps on Forgot your MyBanfield email\\? CTA to get displayed a pop up with message$")
	public void the_user_taps_on_Forgot_your_MyBanfield_email_CTA_to_get_displayed_a_pop_up_with_message() throws Throwable {
		TapElement(Whoops_PopUp_Retrieve._ForgotYourMyBanfieldemailCTA);
		logger.info("the user taps on Forgot your MyBanfield email\\\\? CTA to get displayed a pop up with message");
	}

	@Then("^Need help finding your MyBanfield email\\?$")
	public void need_help_finding_your_MyBanfield_email() throws Throwable {
		Thread.sleep(200);
		NeedhelpfindingBanfieldemail.VerifyNeedhelpfindingyourMyBanfieldemailUI();
		logger.info("Need help finding your MyBanfield email");
	}

	@Then("^the user on clicking on support hotline number gets redirected to dialer with the phone number pre-filled$")
	public void the_user_on_clicking_on_support_hotline_number_gets_redirected_to_dialer_with_the_phone_number_pre_filled() throws Throwable {
		verifytest(NeedhelpfindingBanfieldemail._supporttelephonehyperlink);
		TapElement(NeedhelpfindingBanfieldemail._supporttelephonehyperlink);
		logger.info("the user on clicking on support hotline number gets redirected to dialer with the phone number pre-filled");
	}

	@Then("^the user tap on X on pop up to close the pop up and stay on the same screen$")
	public void the_user_tap_on_X_on_pop_up_to_close_the_pop_up_and_stay_on_the_same_screen() throws Throwable {
		Thread.sleep(3000);
		TapElement(NeedhelpfindingBanfieldemail._CancelCTA);
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._HelpwithclientIdHyperlinkText);
		SignUpForMyBanfield.VerifyCreateAccountRetrieveclientIDUI();
		logger.info("the user tap on X on pop up to close the pop up and stay on the same screen");
		
	}

	@Then("^the user tap on Okay CTA to dismiss the pop-up and get redirected to the \"([^\"]*)\" screen\\.$")
	public void the_user_tap_on_Okay_CTA_to_dismiss_the_pop_up_and_get_redirected_to_the_screen(String arg1) throws Throwable {
		TapElement(NeedhelpfindingBanfieldemail._okayCTA);
		Thread.sleep(1000);
		SignUpForMyBanfield.VerifyCreateAccountRetrieveclientIDUI();
		verifytest(SignUpForMyBanfield._SendMyClientIdCTA);
		logger.info("the user tap on Okay CTA to dismiss the pop-up and get redirected to the");
	}
	@Then("^the user taps on X to get redirected to the Welcome Screen on SignUpForMyBanfield$")
	public void the_user_taps_on_X_to_get_redirected_to_the_Welcome_Screen() throws Throwable {
		TapElement(SignUpForMyBanfield._cancelCTA);
		verifytest(ViewWelcome._signInbutton);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on X to get redirected to the Welcome Screen");
	}
	
	@And("^User wants to verify UI for Need help finding your MyBanfield email$")
	public void User_wants_to_verify_UI_for_Need_help_finding_your_MyBanfield_email() throws Throwable {
		Thread.sleep(3000);
		verifytest(NeedhelpfindingBanfieldemail._NeedhelpfindingyourMyBanfieldemailHeader);
		NeedhelpfindingBanfieldemail.VerifyNeedhelpfindingyourMyBanfieldemailUI();
		logger.info("User wants to verify UI for Need help finding your MyBanfield email");
	}
}
