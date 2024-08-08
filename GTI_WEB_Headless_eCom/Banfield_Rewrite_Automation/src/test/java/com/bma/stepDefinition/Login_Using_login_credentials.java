package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Using_login_credentials extends Utilities {
	
	SoftAssert softassert= new SoftAssert();
	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	
	
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	
	
	@When("^the user click on Log in CTA$")
	public void the_user_click_on_Log_in_CTA() throws Throwable {
		Thread.sleep(3000);
		TapElement(ViewWelcomeScreen._signInbutton);
		logger.info("the user click on Log in CTA");
	}

	@Then("^the user should be redirected to login screen$")
	public void the_user_should_be_redirected_to_login_screen() throws Throwable {
		Assert.assertTrue(Login._LoginButton.isDisplayed());
		logger.info("the user should be redirected to login screen");
	}

	@Then("^the screen is displayed with the following fields$")
	public void the_screen_is_displayed_with_the_following_fields_Email() throws Throwable {
		Login.VerifyLoginUI();
		logger.info("the screen is displayed with the following fields");
	}

	@Then("^the user if click on Log in CTA without entering email/username & password, it is displayed with tossed error message: Oops! The form could not be processed\\. Please enter your email and password and try again$")
	public void the_user_if_click_on_Log_in_CTA_without_entering_email_username_password_it_is_displayed_with_tossed_error_message_Oops_The_form_could_not_be_processed_Please_enter_your_email_and_password_and_try_again() throws Throwable {
		TapElement(Login._LoginButton);
		Login.VerifyWhoopsUIwithoutlogin_pass();
		logger.info("the user if click on Log in CTA without entering email/username & password, it is displayed with tossed error message: Oops! The form could not be processed\\\\. Please enter your email and password and try again");
	}

	@Then("^if the user enter incorrect username or password and click on Login CTA$")
	public void if_the_user_enter_incorrect_username_or_password_and_click_on_Login_CTA() throws Throwable {
		EnterInput(Login._EmailTextField, "test@test"+random()+".com");
		EnterInput(Login._PasswordTextfield, "test123");
		HidingKeyboardios();
		TapElement(Login._LoginButton);
		Thread.sleep(4000);
		Assert.assertTrue(Login._whoopsloginheader.isDisplayed());
		Login.VerifyInvalidUserNameWhoopsUI();
		logger.info("if the user enter incorrect username or password and click on Login CTA");
	}

	@Then("^the user will tap on (\\d+)-(\\d+)-(\\d+)\\. to launch devices default dialer with phone number pre-filled\\.$")
	public void the_user_will_tap_on_to_launch_devices_default_dialer_with_phone_number_pre_filled(int arg1, int arg2, int arg3) throws Throwable {

	}

	@Then("^the user taps on Okay CTA/ X icon to close the pop-up\\.$")
	public void the_user_taps_on_Okay_CTA_X_icon_to_close_the_pop_up() throws Throwable {
		//TapElement(Login._closeinWhoopsloginCTA);
		TapElement(Login._okayinwhoopslogin);
		logger.info("the user taps on Okay CTA/ X icon to close the pop-up");
	}

	@Then("^if the user has more than ten unsuccessful login attempts the user user will be displayed with a pop- up Title Whoops$")
	public void if_the_user_has_more_than_ten_unsuccessful_login_attempts_the_user_user_will_be_displayed_with_a_pop_up_Title_Whoops() throws Throwable {
		int r = random();
		int i = 1;
		EnterInput(Login._EmailTextField, "test@test1.com");
		while(i<=11) {
		//	EnterInput(Login._EmailTextField, "test@test1"+r+".com");
			EnterInput(Login._PasswordTextfield, "test123"+r+"");
			HidingKeyboardios();
			TapElement(Login._LoginButton);
			TapElement(Login._closeinWhoopsloginCTA);
			i++;
		}
		Login.VerifyAccountLockedWhoopsUI();
		logger.info("if the user has more than ten unsuccessful login attempts the user user will be displayed with a pop- up Title Whoops");
	}

	@Then("^the user taps on Okay CTA/ X button to dismiss the pop-up$")
	public void the_user_taps_on_Okay_CTA_X_button_to_dismiss_the_pop_up() throws Throwable {
		verifytest(Login._whoopsaccountblock_OkayCTA);
		TapElement(Login._whoopsaccountblock_OkayCTA);
		logger.info("the user taps on Okay CTA/ X button to dismiss the pop-up");
	}

	@Then("^the user taps on Cancel CTA to go back to Welcome screen$")
	public void the_user_taps_on_Cancel_CTA_to_go_back_to_Welcome_screen() throws Throwable {
		ScrolltoElement("Cancel");
		TapElement(Login._CancelCTA);
		ViewWelcomeScreen.verifyWelcomeScreenUIElement();
		verifytest(ViewWelcomeScreen._makeAppointmentAsGuestbutton);
		logger.info("the user taps on Cancel CTA to go back to Welcome screen");
	}

	@Then("^if the user enter correct username and password and click on Log in, user should be successfully log in with the chosen credentials\\.$")
	public void if_the_user_enter_correct_username_and_password_and_click_on_Log_in_user_should_be_successfully_log_in_with_the_chosen_credentials() throws Throwable {
		LoginUser.logintoApp();
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		verifytest(Home._HiUser_header);
		logger.info("if the user enter correct username and password and click on Log in, user should be successfully log in with the chosen credentials");
	}

	
	
	
}