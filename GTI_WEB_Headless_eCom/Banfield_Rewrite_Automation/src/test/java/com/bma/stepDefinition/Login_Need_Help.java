package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.Login_Need_Help_With_Your_Password_Screen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Need_Help extends Utilities {
	SoftAssert softassert= new SoftAssert();
	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public Login_Need_Help_With_Your_Password_Screen Login_Need_Help_With_Your_Password = new Login_Need_Help_With_Your_Password_Screen(driver);
	WebDriverWait wait;
	
	@Given("^the user is on Login screen$")
	public void the_user_is_on_Login_screen() throws Throwable {
		TapElement(ViewWelcomeScreen._signInbutton);
		Login.VerifyLoginUI();
		logger.info("the user is on Login screen");
	}

	@When("^the user clicks on Need Help\\? CTA$")
	public void the_user_clicks_on_Need_Help_CTA() throws Throwable {
		TapElement(Login._NeedHelpCTA);
		logger.info("the user clicks on Need Help\\\\? CTA");
	}

	@Then("^the user should be redirected to Need help with your password\\? screen$")
	public void the_user_should_be_redirected_to_Need_help_with_your_password_screen() throws Throwable {
		Assert.assertTrue(Login_Need_Help_With_Your_Password._NeedHelp_with_Password_Header.isDisplayed());
		logger.info("the user should be redirected to Need help with your password\\\\? screen");
	}

	@Then("^the user is displayed with the following on the screen$")
	public void the_user_is_displayed_with_the_following_on_the_screen() throws Throwable {
		Login_Need_Help_With_Your_Password.verifyLoginNeedHelpUI();
		logger.info("the user is displayed with the following on the screen");
	}

	@Then("^the user on entering invalid email should show an inline error message Invalid Email$")
	public void the_user_on_entering_invalid_email_should_show_an_inline_error_message_Invalid_Email() throws Throwable {
		EnterInput(Login_Need_Help_With_Your_Password._EnterEmailText, "test@test");
		Assert.assertTrue(Login_Need_Help_With_Your_Password._Invalid_Email_Error_text.isDisplayed());
		logger.info("the user on entering invalid email should show an inline error message Invalid Email");
	}

	@Then("^Send my reset link CTA is disabled by default$")
	public void send_my_reset_link_CTA_is_disabled_by_default() throws Throwable {
		Assert.assertFalse(Login_Need_Help_With_Your_Password._SendMyResetLinkCTA.isEnabled());
		logger.info("Send my reset link CTA is disabled by defaul");
	}

	@Then("^the user on entering the email ID in the Email ID should enable the Send my reset link CTA$")
	public void the_user_on_entering_the_email_ID_in_the_Email_ID_should_enable_the_Send_my_reset_link_CTA() throws Throwable {
		EnterInput(Login_Need_Help_With_Your_Password._EnterEmailText, "test@test.com");
		TapElement(Login_Need_Help_With_Your_Password._Noproblem_Enter_your_email_and_we_ll_send_a_reset_link_for_that_account);
		Assert.assertTrue(Login_Need_Help_With_Your_Password._SendMyResetLinkCTA.isEnabled());
		logger.info("the user on entering the email ID in the Email ID should enable the Send my reset link CTA");
	}

	@Then("^the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up$")
	public void the_user_on_clicking_on_Send_my_reset_link_CTA_with_unregistered_email_should_display_with_an_error_message_in_pop_up() throws Throwable {
		EnterInput(Login_Need_Help_With_Your_Password._EnterEmailText, "test@test.com");
		TapElement(Login_Need_Help_With_Your_Password._Noproblem_Enter_your_email_and_we_ll_send_a_reset_link_for_that_account);
		TapElement(Login_Need_Help_With_Your_Password._SendMyResetLinkCTA);
		Login_Need_Help_With_Your_Password.login_Needhelp_WhoopsUI();
		verifytest(Login_Need_Help_With_Your_Password._login_Needhelp_Whoops_ThatEmailnotInSystemText);
		logger.info("the user on clicking on Send my reset link CTA with unregistered email should display with an error message in pop-up");
	}


	@Then("^user tap on contact support hyperlink to get redirected to native dialer phone call screen$")
	public void user_tap_on_contact_support_hyperlink_to_get_redirected_to_native_dialer_phone_call_screen() throws Throwable {
		//TapElement(Login_Need_Help_With_Your_Password._login_Needhelp_Whoops_ContactSupport);
		logger.info("user tap on contact support hyperlink to get redirected to native dialer phone call screen");
	}

	@Then("^user tap on Okay CTA to exit from the pop-up screen$")
	public void user_tap_on_Okay_CTA_to_exit_from_the_pop_up_screen() throws Throwable {
		TapElement(Login_Need_Help_With_Your_Password._login_Needhelp_Whoops_OKayCTA);
		Thread.sleep(3000);
		Assert.assertTrue(Login_Need_Help_With_Your_Password._NeedHelp_with_Password_Header.isDisplayed());
		logger.info("user tap on Okay CTA to exit from the pop-up screen");
	}

	@Then("^the user tap on X icon to exit from the pop-up message and remain on the same screen$")
	public void the_user_tap_on_X_icon_to_exit_from_the_pop_up_message_and_remain_on_the_same_screen() throws Throwable {
		TapElement(Login_Need_Help_With_Your_Password._login_Needhelp_Whoops_CloseCTA);
		Thread.sleep(3000);
		Assert.assertTrue(Login_Need_Help_With_Your_Password._NeedHelp_with_Password_Header.isDisplayed());
		logger.info("the user tap on X icon to exit from the pop-up message and remain on the same screen");
	}

	@Then("^the user on entering the registered email ID in the Email ID field should enable the Send my reset link CTA$")
	public void the_user_on_entering_the_registered_email_ID_in_the_Email_ID_field_should_enable_the_Send_my_reset_link_CTA() throws Throwable {
		EnterInput(Login_Need_Help_With_Your_Password._EnterEmailText, "zngp.eel@meatily.com");
		Assert.assertTrue(Login_Need_Help_With_Your_Password._SendMyResetLinkCTA.isEnabled());
		logger.info("the user on entering the registered email ID in the Email ID field should enable the Send my reset link CTA");
	}

	@Then("^the user tap on Send my reset link CTA to get the below pop-up message$")
	public void the_user_tap_on_Send_my_reset_link_CTA_to_get_the_below_pop_up_message() throws Throwable {
		TapElement(Login_Need_Help_With_Your_Password._SendMyResetLinkCTA);
		logger.info("the user tap on Send my reset link CTA to get the below pop-up message");
	}

	@Then("^the user is displayed with Open email CTA$")
	public void the_user_is_displayed_with_Open_email_CTA() throws Throwable {
		Assert.assertTrue(Login_Need_Help_With_Your_Password._login_Needhelp_EmailSentTitle.isDisplayed());
		logger.info("the user is displayed with Open email CTA");
	}

	@Then("^the user tap on Open email CTA to get redirected to phone native mail screen$")
	public void the_user_tap_on_Open_email_CTA_to_get_redirected_to_phone_native_mail_screen() throws Throwable {
		TapElement(Login_Need_Help_With_Your_Password._login_Needhelp_EmailSent_OpenEmailCTA);
		logger.info("the user tap on Open email CTA to get redirected to phone native mail screen");
	}

	@Then("^the user taps on < to get redirected to the Login screen$")
	public void the_user_taps_on_to_get_redirected_to_the_Login_screen() throws Throwable {
		TapElement(Login_Need_Help_With_Your_Password._backCTA);
		logger.info("the user taps on < to get redirected to the Login screen");
	}

	
	
	
}