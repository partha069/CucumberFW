package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreenStep3;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_ClientId_Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Step4_CompleteOnlineProfile extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_step4 = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver);
	public SignUpForMyBanfieldScreenStep3 SignUpForMyBanfieldStep3 = new SignUpForMyBanfieldScreenStep3(driver);
	public Whoops_PopUp_ClientId_Login Whoops_PopUp_CId_Login = new Whoops_PopUp_ClientId_Login(driver);

	@Then("^User enter valid credentials and click on next CTA on Step three$")
	public void user_enter_valid_credentials_and_click_on_next_CTA_on_Step_three() throws Throwable {
//		SignUpForMyBanfieldStep3.EnterCreateAccountstep3();
		SignUpForMyBanfieldStep3.EnterCreateAccountstep3Validdetails();
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(5000);
		logger.info("User enter valid credentials and click on next CTA on Step three");
	}

	@Then("^the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen$")
	public void the_user_is_redirected_to_next_screen_Sign_up_for_MyBanfield_and_are_displayed_with_the_following_things_in_complete_online_profile_screen() throws Throwable {
		SignUpForMyBanfield_step4.VerifyCreateAccountstep4UI();
		logger.info("the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things in complete online profile screen");
	}
	
	@Then("^the user should enter email, password and confirm password as these are mandatory fields$")
	public void the_user_should_enter_email_password_and_confirm_password_as_these_are_mandatory_fields() throws Throwable {
		SignUpForMyBanfield_step4.EnterRegisteredemailandpwd();
		logger.info("the user should enter email, password and confirm password as these are mandatory fields");
	}
	@Then("^the user is displayed with an error message on entering invalid email id Error Message:  Invalid email$")
	public void the_user_is_displayed_with_an_error_message_on_entering_invalid_email_id_Error_Message_Invalid_email() throws Throwable {
		EnterInput(SignUpForMyBanfield_step4._EnterEmail, "test.comp");
		Assert.assertTrue(SignUpForMyBanfield_step4._InvalidEmailText.isDisplayed());
		logger.info("the user is displayed with an error message on entering invalid email id Error Message:  Invalid email");
	}
	@Then("^the user should be displayed with a pop-up if the account already exist with the registered email id: Title: Whoops$")
	public void the_user_should_be_displayed_with_a_pop_up_if_the_account_already_exist_with_the_registered_email_id_Title_Whoops() throws Throwable {
		SignUpForMyBanfield_step4.EnterRegisteredemailandpwd();
		TapElement(SignUpForMyBanfield_step4._NextCTA);
		Thread.sleep(5000);
		verifytest(Whoops_PopUp_CId_Login._WhoopsTitle);
		Whoops_PopUp_CId_Login.verifyWhoopspopupwithLoginNowCTA();
		logger.info("the user should be displayed with a pop-up if the account already exist with the registered email id: Title: Whoops");
	}
	@Then("^the user taps on Log in now CTA to get redirected to Log in page$")
	public void the_user_taps_on_Log_in_now_CTA_to_get_redirected_to_Log_in_page() throws Throwable {
		TapElement(SignUpForMyBanfield_step4._NextCTA);
		Thread.sleep(5000);
		verifytest(Whoops_PopUp_CId_Login._LoginnowCTA);
		TapElement(Whoops_PopUp_CId_Login._LoginnowCTA);
		Thread.sleep(5000);
		logger.info("the user taps on Log in now CTA to get redirected to Log in page");
	}
	
	@Then("^the user should be displayed with an inline error message if the email field is left blank: Field cannot be blank$")
	public void the_user_should_be_displayed_with_an_inline_error_message_if_the_email_field_is_left_blank_Field_cannot_be_blank() throws Throwable {
		EnterInput(SignUpForMyBanfield_step4._NewPassword, "Banfield@123");
		EnterInput(SignUpForMyBanfield_step4._ConfirmPassword, "Banfield@123");
		Assert.assertEquals("Field cannot be blank",SignUpForMyBanfield_step4._InvalidEmailText.getText());
		verifytest(SignUpForMyBanfield_step4._InvalidEmailText);
		logger.info("the user should be displayed with an inline error message if the email field is left blank: Field cannot be blank");
	}
	
	@Then("^the user should be displayed with an error message Passwords do not match if confirm password doesnt match with password field$")
	public void the_user_should_be_displayed_with_an_error_message_Passwords_do_not_match_if_confirm_password_doesnt_match_with_password_field() throws Throwable {
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep4completeonline.csv";
		String Email= getcsvdata(path,2,"Email", "Email","password");
		String password= getcsvdata(path,2,"password", "Email","password");
		EnterInput(SignUpForMyBanfield_step4._EnterEmail, Email);
		EnterInput(SignUpForMyBanfield_step4._NewPassword, password);
		HidingKeyboard();
		EnterInput(SignUpForMyBanfield_step4._ConfirmPassword, "Banfield123");
		HidingKeyboard();
		Assert.assertTrue(SignUpForMyBanfield_step4._passworddonotmatchtext.isDisplayed());
		verifytest(SignUpForMyBanfield_step4._passworddonotmatchtext);
		logger.info("the user should be displayed with an error message Passwords do not match if confirm password doesnt match with password field");
	}
	
	@Then("^the user taps on < to get redirected to the previous screen Verify your identity screen$")
	public void the_user_taps_on_to_get_redirected_to_the_previous_screen_Verify_your_identity_screen() throws Throwable {
		TapElement(SignUpForMyBanfield_step4._backCTA);
		Thread.sleep(1000);
		Assert.assertTrue(SignUpForMyBanfieldStep3._SignUpForMyBanfieldHeader.isDisplayed());
		verifytest(SignUpForMyBanfieldStep3._SignUpForMyBanfieldHeader);
		logger.info("the user taps on < to get redirected to the previous screen Verify your identity screen");
	}

	@Then("^the user taps on X in complete online profile screen to get redirected to the Welcome Screen$")
	public void the_user_taps_on_X_in_complete_online_profile_screen_to_get_redirected_to_the_Welcome_Screen() throws Throwable {
		TapElement(SignUpForMyBanfield_step4._cancelCTA);
		ViewWelcome.verifyWelcomeScreenUIElement();
		verifytest(ViewWelcome._signInbutton);
		logger.info("the user taps on X in complete online profile screen to get redirected to the Welcome Screen");
	}
	
	@Then("^it is not mandatory for the user to check Sign up for special offers, news and more$")
	public void it_is_not_mandatory_for_the_user_to_check_Sign_up_for_special_offers_news_and_more() throws Throwable {
		Assert.assertTrue(SignUpForMyBanfield_step4._SignUpforspecialcheckbox.isDisplayed());
		logger.info("it is not mandatory for the user to check Sign up for special offers, news and more");
	}
	    
	@Then("^the Next CTA is enabled after entering the mandatory fields$")
	    public void the_Next_CTA_is_enabled_after_entering_the_mandatory_fields() throws Throwable {
		SignUpForMyBanfield_step4.EnterRegisteredemailandpwd();
		Assert.assertTrue(SignUpForMyBanfield_step4._NextCTA.isEnabled());
		logger.info("the Next CTA is enabled after entering the mandatory fields");
	}
	
	@And("^User wants to verify Yes, I would like to receive email offers and reminders$")
	public void User_wants_to_verify_Yes_I_would_like_to_receive_email_offers_and_reminders() throws Throwable {
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield_step4._I_would_like_to_receive_email_offers_and_remindersText);
		Assert.assertTrue(SignUpForMyBanfield_step4._I_would_like_to_receive_email_offers_and_remindersText.isDisplayed());
		logger.info("User wants to verify Yes, I would like to receive email offers and reminders");
	}

}
