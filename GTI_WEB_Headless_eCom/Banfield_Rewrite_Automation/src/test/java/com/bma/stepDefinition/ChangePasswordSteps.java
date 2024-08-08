package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.UpdateYourPasswordScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileElement;
import net.bytebuddy.asm.Advice.Enter;

public class ChangePasswordSteps extends Utilities {

	public ProfileScreen Profile = new ProfileScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public UpdateYourPasswordScreen UpdateYourPassword = new UpdateYourPasswordScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	
	public String path1 = "./src/test/resources/TestData/Sprint6/UpdateYourPassword.csv";
	public String path2 = "./src/test/resources/TestData/Sprint6/SpecialCharacters.csv";
	public String path3 = "./src/test/resources/TestData/Sprint6/CharacterTest.csv";
	public String path4 = "./src/test/resources/TestData/Sprint6/UpdateNewPassword.csv";
	public String path5 = "./src/test/resources/TestData/Sprint6/LastPassword.csv";
	
	
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ChangePasswordSteps.class);
	
	@When("^User navigated to Home Page$")
	public void the_user_is_on_Home_screen() throws Throwable{
		ViewWelcome.TapOnSigninbutton(); 
		EnterInput(Login._EmailTextField, getcsvdata(path4,2,"username","username","currentPassword","NewPassword","confirmYourPassword"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path4,2,"currentPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user is on Home screen");
	}

	@When("^the user taps on the Change Password CTA$")
	public void user_taps_on_the_Change_Password_CTA() throws Throwable {
		Thread.sleep(6000);
		TapElement(BottomNavigation._profileCTA);
		TapElement(Profile._YourProfileCTA);
		ScrolltoElement("Update profile");
		TapElement(Profile._changePasswordCTA);
		logger.info("the user taps on the Change Password CTA");
	}
	
	@Then("^the user should be redirected to Update your password screen$")
	public void user_should_be_redirected_to_Update_your_password_screen() throws Throwable {
		Thread.sleep(4000);
		Assert.assertTrue(UpdateYourPassword._UpdateYourPasswordTitle.isDisplayed());
		logger.info("the user should be redirected to Update your password screen");
	}
	
	@And("^the user is displayed with the following static text for reset your password:$")
	public void user_is_displayed_with_the_following_static_text_for_reset_your_password() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		UpdateYourPassword.verifyInlineMessage();
		logger.info("the user is displayed with the following static text for reset your password:");
	}
	
	@And("^the user should be displayed with the all fields:$")
	public void user_should_be_displayed_with_the_all_fields() throws Throwable {
		UpdateYourPassword.verifyEyeButton();
		UpdateYourPassword.verifyFields();
		logger.info("the user should be displayed with the all fields:");
	}
	
	@And("^all the fields Current password New password and Confirm your password are mandatory$")
	public void all_the_fields_are_mandatory() throws Throwable {
		EnterInput(UpdateYourPassword._CurrentPasswordField, "Test@123");
		HidingKeyboard();
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,"Test@123");
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._UpdateCTA.isEnabled());
	//	softassert.assertAll();
		logger.info("all the fields Current password New password and Confirm your password are mandatory");
	}
	
	@And("^the user taps on Current password field to open alpha-numeric keypad$")
	public void user_taps_on_Current_password_field_to_open_alpha_numeric_keypad() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		HidingKeyboard();
		logger.info("the user taps on Current password field to open alpha-numeric keypad");
	}
	
	@And("^the user on leaving the Current Password field blank should displayed with an inline error message: Field cannot be blank$")
	public void leaving_the_Current_Password_field_blank_should_displayed_with_an_inline_error_message() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField," ");
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._ErrorMsg_CurrentPassword.isEnabled());
		softassert.assertAll();
		logger.info("the user on leaving the Current Password field blank should displayed with an inline error message: Field cannot be blank");
	}
	
	@And("^the user taps on New password field to open alpha numeric keypad$")
	public void user_taps_on_New_password_field_to_open_alpha_numeric_keypad() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		logger.info("the user taps on New password field to open alpha numeric keypad");
	}
	
	@And("^the user tap on Confirm your password field to open alpha-numeric keypad$")
	public void the_user_tap_on_Confirm_your_password_field_to_open_alpha_numeric_keypad() {
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		HidingKeyboard();
		logger.info("the user tap on Confirm your password field to open alpha-numeric keypad");
	}
	
	@And("^if the Confirm your password field doesnt match with the New Password field then it should show an inline error message X Passwords do not match$")
	public void Confirm_your_password_field_doesnt_match_with_the_New_Password_field() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path1,2,"OneSprcialCharacter", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._ErrorMsg_ConfirmPassword.isEnabled());
		softassert.assertAll();
		logger.info("if the Confirm your password field doesnt match with the New Password field then it should show an inline error message X Passwords do not match");
	}
	
	@And("^the user should use at least one numeric value to see a green tick mark as an indicator else red cross$")
	public void use_at_least_one_numeric_value_to_see_a_green_tick_mark_as_an_indicator() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._numberErrorCross.isDisplayed());
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"OneNumber", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		TapElement(UpdateYourPassword._CurrentPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._numberErrorCrossTick.isDisplayed());
		softassert.assertAll();
		logger.info("the user should use at least one numeric value to see a green tick mark as an indicator else red cross");
	}
	
	@And("^the user should use at least one uppercase letter to see a green tick mark as an indicator else red cross$")
	public void user_should_use_at_least_one_uppercase_letter_to_see_a_green_tick_mark_as_an_indicator() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._upperCaseErrorCross.isDisplayed());
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"OneUppercase", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		TapElement(UpdateYourPassword._CurrentPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._upperCaseErrorCrossTick.isDisplayed());
		softassert.assertAll();
		logger.info("the user should use at least one uppercase letter to see a green tick mark as an indicator else red cross");
	}
	
	@And("^the user should use at least one lowercase letter to see a green tick mark as an indicator else red cross$")
	public void user_should_use_at_least_one_lowercase_letter_to_see_a_green_tick_mark_as_an_indicator() throws Throwable {
		TapElement(UpdateYourPassword._backCTA);    
		TapElement(Profile._changePasswordCTA);
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._lowerCaseErrorCross.isDisplayed());
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"OneLowerCase", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		TapElement(UpdateYourPassword._CurrentPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._lowerCaseErrorCrossTick.isDisplayed());
		softassert.assertAll();
		logger.info("the user should use at least one lowercase letter to see a green tick mark as an indicator else red cross");
	}
	
	@And("^the user should use at least one special character to see a green tick mark as an indicator else red cross$")
	public void user_should_use_at_least_one_special_character_to_see_a_green_tick_mark_as_an_indicators() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._specialCharErrorCross.isDisplayed());
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"OneSprcialCharacter", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		TapElement(UpdateYourPassword._CurrentPasswordField);
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._specialCharErrorCrossTick.isDisplayed());
		softassert.assertAll();
		logger.info("the user should use at least one special character to see a green tick mark as an indicator else red cross");
	}
	
	@And("^the special characters allowed$")
	public void the_special_characters_allowed() throws Throwable {
		String input= getcsvdata(path2,2,"specialChar", "specialChar");
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,input);
		HidingKeyboard();
		TapElement(UpdateYourPassword._CurrentPasswordEyeButton);
		TapElement(UpdateYourPassword._CurrentPasswordEyeButton);
		Thread.sleep(12000);
		Assert.assertEquals(input,UpdateYourPassword._CurrentPasswordField.getText());
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,input);
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordEyeButton);
		TapElement(UpdateYourPassword._NewPasswordEyeButton);
		Assert.assertEquals(input,UpdateYourPassword._NewPasswordField.getText());
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,input);
		TapElement(UpdateYourPassword._ConfirmYourPasswordEyeButton);
		TapElement(UpdateYourPassword._ConfirmYourPasswordEyeButton);
		Assert.assertEquals(input,UpdateYourPassword._ConfirmYourPasswordField.getText());
		logger.info("the special characters allowed are #! @ # $ % ^");
	}
	
	@And("^the user should enter a password between 9 - 64 characters to see a green tick mark as an indicator else red cross$")
	public void enter_a_password_between9_64_characters_to_see_a_green_tick_mark_as_an_indicator_else_red_cross() throws Throwable {
		String input= getcsvdata(path3,2,"characters","characters");
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,input);
		Assert.assertNotSame(input,UpdateYourPassword._CurrentPasswordField.getText());
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,input);
		Assert.assertNotSame(input,UpdateYourPassword._NewPasswordField.getText());
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,input);
		Assert.assertNotSame(input,UpdateYourPassword._ConfirmYourPasswordField.getText());
		HidingKeyboard();
		logger.info("the user should enter a password between 9 - 64 characters to see a green tick mark as an indicator else red cross");
	}
	
	@And("^the user on leaving Confirm your password field blank should show an inline error message X Passwords do not match$")
	public void the_user_on_leaving_Confirm_your_password_field_blank_should_show_an_inline_error_message_X_Passwords_do_not_match() throws Throwable {
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField, " ");
		HidingKeyboard();
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._ErrorMsg_ConfirmPassword.isDisplayed());
		softassert.assertAll();
		logger.info("the user on leaving Confirm your password field blank should show an inline error message X Passwords do not match");
	}
	
	@And("^the user if entered incorrect password in the Current password field and tapping on Update CTA is displayed this message$")
	public void user_entered_incorrect_password_in_the_Current_password_field_and_tap_on_Update_CTA() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,getcsvdata(path1,2,"BetweenCharacters", "OneLowerCase","OneNumber","OneUppercase","OneSprcialCharacter","BetweenCharacters"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._UpdateCTA);
		Thread.sleep(5000);
		softassert.assertTrue(UpdateYourPassword._popupsText.isDisplayed());
		softassert.assertTrue(UpdateYourPassword._popupsOkayCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user if entered incorrect password in the Current password field and tapping on Update CTA is displayed this message");
	}
	
	@And("^the user taps on Okay CTA to stay on the same screen$")
	public void user_taps_on_Okay_CTA_to_stay_on_the_same_screen() throws Throwable {
		TapElement(UpdateYourPassword._popupsOkayCTA);
		logger.info("the user taps on Okay CTA to stay on the same screen");
	}
	
	@And("^the user tap on < icon from Update your password screen to go back to the previous Profile screen$")
	public void user_tap_on_back_icon_from_Update_your_password_screen_to_go_back_to_the_previous_Profile_screen() throws Throwable {
		Thread.sleep(2000);
		softassert.assertTrue(UpdateYourPassword._UpdateYourPasswordTitle.isDisplayed());
		TapElement(UpdateYourPassword._backCTA);
		softassert.assertTrue(Profile._HiUser_header.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on < icon from Update your password screen to go back to the previous Profile screen");
	}
	
	@And("^the Update CTA is enabled only after all the fields are filled and New password and Confirm your password requirements are met, with no inline error messages.$")
	public void Update_CTA_is_enabled_only_after_all_the_fields_are_filled_and_New_password_and_Confirm_your_password_requirements_are_met() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path4,2,"currentPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path4,2,"NewPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,getcsvdata(path4,2,"confirmYourPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		HidingKeyboard();
		softassert.assertTrue(UpdateYourPassword._UpdateCTA.isEnabled());
		softassert.assertAll();
		logger.info("the Update CTA is enabled only after all the fields are filled and New password and Confirm your password requirements are met, with no inline error messages.");
	}
	
	@And("^the user taps on Update CTA to update the password$")
	public void user_taps_on_Update_CTA_to_update_the_password() throws Throwable {
		TapElement(UpdateYourPassword._UpdateCTA);
		logger.info("the user taps on Update CTA to update the password");
	}
	
	@And("^the user on successfully updating the password is displayed with a pop-up$")
	public void user_on_successfully_updating_the_password_is_displayed_with_a_popup() throws Throwable {
		softassert.assertTrue(UpdateYourPassword._popupsCloseCTA.isEnabled());
		softassert.assertTrue(UpdateYourPassword._popupsSuccessText.isEnabled());
		softassert.assertTrue(UpdateYourPassword._popupsStaticText.isEnabled());
		softassert.assertAll();
		logger.info("the user on successfully updating the password is displayed with a pop-up");
	}
	
	@And("^the user taps on the close icon on success pop-up$")
	public void user_taps_on_the_close_icon_on_success_popup() throws Throwable {
		Thread.sleep(1000);
	    TapElement(UpdateYourPassword._popupsCloseCTA);
	    Thread.sleep(7000);
	    softassert.assertTrue(Login._Emailaddressheadertext.isDisplayed());
		softassert.assertAll();
		logger.info("the user taps on the close icon on success pop-up");
	}
	
	@And("^the user  if entered last 10 passwords that does not include the current password in New password field$")
	public void entered_last_ten_passwords_that_does_not_include_the_current_password_in_New_password_field() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path5,2,"lastChangedPassword","lastChangedPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path5,2,"lastChangedPassword","lastChangedPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,getcsvdata(path5,2,"lastChangedPassword","lastChangedPassword"));
		HidingKeyboard();
		logger.info("the user  if entered last 10 passwords that does not include the current password in New password field");
	}
	
	@And("^the user cannot use last 10 passwords to update the new password.$")
	public void user_cannot_use_last_ten_passwords_to_update_the_new_password() throws Throwable {
		softassert.assertTrue(UpdateYourPassword._popupsText.isEnabled());
		softassert.assertTrue(UpdateYourPassword._popupsOkayCTA.isEnabled());
		softassert.assertAll();
		Thread.sleep(1000);
	    TapElement(UpdateYourPassword._popupsOkayCTA);
		logger.info("the user cannot use last 10 passwords to update the new password.");
	}
	
	@And("^the last 10 passwords does not include the current password.$")
	public void last_ten_passwords_does_not_include_the_current_password() throws Throwable {
		TapElement(UpdateYourPassword._CurrentPasswordField);
		EnterInput(UpdateYourPassword._CurrentPasswordField,getcsvdata(path5,2,"lastChangedPassword","lastChangedPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._NewPasswordField);
		EnterInput(UpdateYourPassword._NewPasswordField,getcsvdata(path4,2,"NewPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._ConfirmYourPasswordField);
		EnterInput(UpdateYourPassword._ConfirmYourPasswordField,getcsvdata(path4,2,"confirmYourPassword","username","currentPassword","NewPassword","confirmYourPassword"));
		HidingKeyboard();
		TapElement(UpdateYourPassword._UpdateCTA);
		Thread.sleep(3000);
		softassert.assertTrue(UpdateYourPassword._popupsText.isDisplayed());
		softassert.assertTrue(UpdateYourPassword._popupsOkayCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the last 10 passwords does not include the current password.");
	}
	
	
}
