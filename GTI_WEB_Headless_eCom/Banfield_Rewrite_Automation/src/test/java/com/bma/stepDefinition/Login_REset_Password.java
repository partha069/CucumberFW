//package com.bma.stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.testng.asserts.SoftAssert;
//
//import com.bma.Utilities.Utilities;
//import com.bma.pageObject.BottomNavigationScreen;
//import com.bma.pageObject.LegalStuffStepsScreen;
//import com.bma.pageObject.LoginScreen;
//import com.bma.pageObject.Login_Need_Help_With_Your_Password_Screen;
//import com.bma.pageObject.ProfileScreen;
//import com.bma.pageObject.ViewWelcomeScreen;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class Login_REset_Password extends Utilities {
//	SoftAssert softassert= new SoftAssert();
//	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
//	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
//	public LoginScreen Login = new LoginScreen(driver);
//	public Login_Need_Help_With_Your_Password_Screen Login_Need_Help_With_Your_Password = new Login_Need_Help_With_Your_Password_Screen(driver);
//	
//
//@Given("^the user is on Native mail with Reset Password link at Banfield\\.com$")
//public void the_user_is_on_Native_mail_with_Reset_Password_link_at_Banfield_com() throws Throwable {
//
//}
//
//@When("^the user taps on Open CTA in Open this page in ?Banfield?\\?  Pop-up$")
//public void the_user_taps_on_Open_CTA_in_Open_this_page_in_Banfield_Pop_up() throws Throwable {
//
//}
//
//@Then("^the user is redirected to Reset your password screen in App$")
//public void the_user_is_redirected_to_Reset_your_password_screen_in_App() throws Throwable {
//
//}
//
//@Then("^the user is displayed with following on screen |Text in page : Reset your MyBanfield account password | Create password field | Hide/Unhide password | Confirm password field| Hide/Unhide password| Next CTA |$")
//public void the_user_is_displayed_with_following_on_screen_Text_in_page_Reset_your_MyBanfield_account_password_Create_password_field_Hide_Unhide_password_Confirm_password_field_Hide_Unhide_password_Next_CTA() throws Throwable {
//
//}
//
//@Then("^the user should enter password between (\\d+) and (\\d+) characters to see a green tick mark as an indicator else red cross$")
//public void the_user_should_enter_password_between_and_characters_to_see_a_green_tick_mark_as_an_indicator_else_red_cross(int arg1, int arg2) throws Throwable {
//
//}
//
//@Then("^the user should atleast use one numeric value to see a green tick mark as an indicator else red cross$")
//public void the_user_should_atleast_use_one_numeric_value_to_see_a_green_tick_mark_as_an_indicator_else_red_cross() throws Throwable {
//
//}
//
//@Then("^the user should atleast use one lowercase letter to see a green tick mark as an indicator else red cross$")
//public void the_user_should_atleast_use_one_lowercase_letter_to_see_a_green_tick_mark_as_an_indicator_else_red_cross() throws Throwable {
//
//}
//
//@Then("^the user should atleast enter one uppercase letter to see a green tick mark as an indicator else red cross$")
//public void the_user_should_atleast_enter_one_uppercase_letter_to_see_a_green_tick_mark_as_an_indicator_else_red_cross() throws Throwable {
//
//}
//
//@Then("^the user should atleast use one special case letter to see a green tick mark as an indicator else red cross$")
//public void the_user_should_atleast_use_one_special_case_letter_to_see_a_green_tick_mark_as_an_indicator_else_red_cross() throws Throwable {
//
//}
//
//@Then("^the special characters allowed are ! @ # \\$ % \\^$")
//public void the_special_characters_allowed_are_$() throws Throwable {
//
//}
//
//@Then("^the password in Create password field and Confirm password field must match$")
//public void the_password_in_Create_password_field_and_Confirm_password_field_must_match() throws Throwable {
//
//}
//
//@Then("^the user is displayed with an inline error message on Confirm password field when the passwords don?t match Message:- ?Passwords do not match?$")
//public void the_user_is_displayed_with_an_inline_error_message_on_Confirm_password_field_when_the_passwords_don_t_match_Message_Passwords_do_not_match() throws Throwable {
//
//}
//
//@Then("^Next CTA is disabled by default$")
//public void next_CTA_is_disabled_by_default() throws Throwable {
//
//}
//
//@Then("^the Next CTA is enabled once all the criteria is met$")
//public void the_Next_CTA_is_enabled_once_all_the_criteria_is_met() throws Throwable {
//
//}
//
//@Then("^the user taps on ?Next ? CTA they will receive a pop-up$")
//public void the_user_taps_on_Next_CTA_they_will_receive_a_pop_up() throws Throwable {
//
//}
//
//@Then("^Title: Success!  Text: Your password has been reset successfully$")
//public void title_Success_Text_Your_password_has_been_reset_successfully() throws Throwable {
//
//}
//
//@Then("^the user can successfully log in with their new credentials$")
//public void the_user_can_successfully_log_in_with_their_new_credentials() throws Throwable {
//
//}
//
//@Then("^the user taps on X to get redirected to Login Page$")
//public void the_user_taps_on_X_to_get_redirected_to_Login_Page() throws Throwable {
//
//}
//
//@Given("^the taps on Send my reset link CTA from email$")
//public void the_taps_on_Send_my_reset_link_CTA_from_email() throws Throwable {
//
//}
//
//@When("^the user land on the login page after the session is expired$")
//public void the_user_land_on_the_login_page_after_the_session_is_expired() throws Throwable {
//
//}
//
//@Then("^the user will see a pop- up with the message Title:- Whoops! Text:- Your session has expired\\. | Return to Login' CTA |$")
//public void the_user_will_see_a_pop_up_with_the_message_Title_Whoops_Text_Your_session_has_expired_Return_to_Login_CTA() throws Throwable {
//
//}
//
//@Then("^the user taps on Return to Login CTA to return to the log in screen\\.$")
//public void the_user_taps_on_Return_to_Login_CTA_to_return_to_the_log_in_screen() throws Throwable {
//
//}
//	
//}