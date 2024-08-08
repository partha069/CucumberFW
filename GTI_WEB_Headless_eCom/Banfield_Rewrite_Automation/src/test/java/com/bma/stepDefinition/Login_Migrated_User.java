package com.bma.stepDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.Login_Migrated_User_Flow;
import com.bma.pageObject.Login_Need_Help_With_Your_Password_Screen;
import com.bma.pageObject.NeedhelpfindingyourMyBanfieldemail;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.Sent_Popup;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Migrated_User extends Utilities {
	SoftAssert softassert= new SoftAssert();
	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public Sent_Popup Sent = new Sent_Popup(driver);
	public NeedhelpfindingyourMyBanfieldemail Needhelp = new NeedhelpfindingyourMyBanfieldemail(driver);
	public Login_Migrated_User_Flow Login_Migrated_User = new Login_Migrated_User_Flow(driver);
	public Login_Need_Help_With_Your_Password_Screen Login_Need_Help_With_Your_Password = new Login_Need_Help_With_Your_Password_Screen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint3/Login_Migrated_User_Flow.csv";
	
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	
	
	@When("^the user has entered the email and password the user taps on Log in CTA for migrated flow$")
	public void the_user_has_entered_the_email_and_password_the_user_taps_on_Log_in_CTA_for_migrated_flow() throws Throwable {
		 EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
			EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
			HidingKeyboardios();
			TapElement(Login._LoginButton);
			Thread.sleep(2000);
			logger.info("the user enters an Email ID and Password and Login To App");
	}

	@Then("^the user will be displayed with a pop-up with the following$")
	public void the_user_will_be_displayed_with_a_pop_up_with_the_following() throws Throwable {
		Login_Migrated_User.verifymigrateduserpopupscreenUI();
	}

//	@Then("^the email should be in a valid format username@mail\\.com$")
//	public void the_email_should_be_in_a_valid_format_username_mail_com() throws Throwable {
//
//	}
//
//	@Then("^the user will see an inline error message when the email is not in valid format Invalid email$")
//	public void the_user_will_see_an_inline_error_message_when_the_email_is_not_in_valid_format_Invalid_email() throws Throwable {
//
//	}
//
//	@Then("^the Send my reset link will be disabled by default$")
//	public void the_Send_my_reset_link_will_be_disabled_by_default() throws Throwable {
//
//	}
//
	@Then("^the Send my reset link CTA will be enabled once the user enters a valid email$")
	public void the_Send_my_reset_link_CTA_will_be_enabled_once_the_user_enters_a_valid_email() throws Throwable {
		Thread.sleep(2000);
		//TapElement(Login_Migrated_User._LoginMigrateduserEmailtestfield);
       EnterInput(Login_Migrated_User._LoginMigrateduserEmailtestfield, getcsvdata(path,2,"Email", "Email","password"));
       TapElement(Login_Migrated_User._MigratedUserStaticText);
       Assert.assertTrue(Login_Migrated_User._sendmyresetlinkCTA.isEnabled());
	}
	@Then("^the user will tap on Send my reset link CTA to view a pop-up with following message:- Title Sent$")
	public void the_user_will_tap_on_Send_my_reset_link_CTA_to_view_a_pop_up_with_following_message_Title_Sent() throws Throwable {
		TapElement(Login_Migrated_User._sendmyresetlinkCTA);
		Thread.sleep(3000);
		Sent.verifysentpopupUI();
	}

	@Then("^the user will tap on Forgot your MyBanfield email to get redirected to open a pop-up  Title: Need help finding your MyBanfield email$")
	public void the_user_will_tap_on_Forgot_your_MyBanfield_email_to_get_redirected_to_open_a_pop_up_Title_Need_help_finding_your_MyBanfield_email() throws Throwable {
		TapElement(Login_Migrated_User._MigratedUserforgotbtnCTA);
		Needhelp.VerifyNeedhelpfindingyourMyBanfieldemailUI();
	}

	@Then("^the user taps on Support hotline CTA to open the device default dialer$")
	public void the_user_taps_on_Support_hotline_CTA_to_open_the_device_default_dialer() throws Throwable {
		TapElement(Needhelp._supporttelephonehyperlink);
	}

	@Then("^the user taps on Okay CTA/ X icon to close pop-up$")
	public void the_user_taps_on_Okay_CTA_X_icon_to_close_pop_up() throws Throwable {
		TapElement(Needhelp._okayCTA);
		Login.VerifyLoginUI();
	}


	@Then("^the user will tap on X to stay on the log in screen$")
	public void the_user_will_tap_on_X_to_stay_on_the_log_in_screen() throws Throwable {
		TapElement(Login_Migrated_User._CancelCTA);
	}
	
	@Then("the user will tap on Open email CTA to open devices default mail for migrated user")
	public void the_user_will_tap_on_open_email_cta_to_open_devices_default_mail_for_migrated_user() {
		Sent.verifysentpopupUIformigrateduser();
		verifytest(Sent._OpenMailCTA);
		TapElement(Sent._OpenMailCTA);
	}

}