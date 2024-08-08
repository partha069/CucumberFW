package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.ChangePasswordScreen;
import com.bma.pageObject.DeleteBanfieldAccoutScreen;
import com.bma.pageObject.DeleteConfirmationPopups;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class YourProfileSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	public ChangePasswordScreen ChangePassword = new ChangePasswordScreen(driver);
	public DeleteBanfieldAccoutScreen DeleteBanfieldAccout = new DeleteBanfieldAccoutScreen(driver);
	public DeleteConfirmationPopups DeleteConfirmation = new DeleteConfirmationPopups(driver);
	

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(YourProfileSteps.class);

	@When("^the user is on Hi Username screen$")
	public void the_user_is_on_Hi_Username_screen() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user is on 'Hi <Username>' screen");
	}
	
	@When("^the user taps on Your profile CTA$")
	public void the_user_taps_on_Your_profile_CTA() throws Throwable {
		Thread.sleep(4000);
		TapElement(Profile._profileCTA);
		TapElement(Profile._YourProfileCTA);
		logger.info("the user taps on Your profile CTA");
	}
	
	@When("^the user should be redirected to Profile screen$")
	public void the_user_should_be_redirected_to_Profile_screen() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(Profile._Profile_NameTextField.isDisplayed());
		logger.info("the user should be redirected to Profile screen");
	}
	
	@And("^the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA$")
	public void the_user_is_displayed_with_the_UI() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Profile.verifyprofilepage();
	//	ScrolltoElement("Update profile");
		swipeDown();
	    softassert.assertTrue(Profile._updateProfileCTA.isDisplayed());
	    softassert.assertTrue(Profile._deleteCTA.isDisplayed());
	    softassert.assertAll();
		logger.info("the user is displayed with the Name,Client ID,Email,Mobile,Work,Address,Change Password CTA,Update profile CTA");
	}
	
	@And("^the user cannot edit the Name,Client ID,Email,Mobile,Work and Address$")
	public void the_user_cannot_edit_the_Name_ClientID_Email_Mobile_Work_and_Address() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	ScrolltoElement("Name");
		Profile.verifytextfieldenabledisable();
		logger.info("the user cannot edit the Name,Client ID,Email,Mobile,Work and Address");
	}
	
	@And("^the user taps on Change password CTA to get redirected to Update your password$")
	public void the_user_taps_on_Change_password_CTA_to_get_redirected_to_Update_your_password() throws Throwable {
	//	ScrolltoElement("Update profile");
		TapElement(Profile._changePasswordCTA);
		Thread.sleep(800);
		Assert.assertTrue(ChangePassword._changePasswordTitle.isDisplayed());
		ChangePassword.verifyUpdatePasswordUI();
		verifytest(ChangePassword._staticText);
		logger.info("the user taps on Change password CTA to get redirected to Update your password");
	}
	
	@And("^the user taps on Delete CTA to get redirected to Delete online account Screen$")
	public void the_user_taps_on_Delete_CTA_to_get_redirected_to_Delete_online_account_Screen() throws Throwable {
		TapElement(Profile._deleteCTA);
		Thread.sleep(800);
		DeleteBanfieldAccout.verifyUpdatePasswordUI();
		verifytest(DeleteBanfieldAccout._noNeverMindCTA);
		logger.info("the user taps on Delete CTA to get redirected to Delete online account Screen");
	}
	
	@And("^the user wants to Delete account and taps on Yes delete my account CTA$")
	public void the_user_wants_to_Delete_Account() throws Throwable {
		TapElement(Profile._deleteCTA);
		Thread.sleep(800);
		DeleteBanfieldAccout.verifyUpdatePasswordUI();
		TapElement(DeleteBanfieldAccout._yesDeleteMyAccountCTA);
		DeleteConfirmation.verifyPopupsScreen();
		verifytest(DeleteConfirmation._okCTA);
		TapElement(DeleteConfirmation._okCTA);
		Thread.sleep(500);
		Assert.assertTrue(LoginUser._EmailTextField.isDisplayed());
		logger.info("the user wants to Delete account and taps on Yes delete my account CTA");
	}
	
	@And("^the user taps on No Never Mind CTA on the Delete online account Screen and dont want to delete account$")
	public void the_user_taps_on_No_Never_Mind_CTA_on_the_Delete_online_account_Screen_and_dont_want_to_delete_account() throws Throwable {
		TapElement(Profile._deleteCTA);
		Thread.sleep(1000);
		DeleteBanfieldAccout.verifyUpdatePasswordUI();
		Thread.sleep(2000);
		TapElement(DeleteBanfieldAccout._noNeverMindCTA);
		Thread.sleep(2000);
		Assert.assertTrue(Profile._deleteCTA.isDisplayed());
		verifytest(Profile._deleteCTA);
		logger.info("the user taps on No Never Mind CTA on the Delete online account Screen and dont want to delete account");
	}
	
	@And("^the user taps on Update profile CTA to get redirected to URL in the browser in logged in state$")
	public void the_user_taps_on_Update_profile_CTA_to_get_redirected_to_URL_in_the_browser_in_logged_in_state() throws Throwable {
	//	ScrolltoElement("Update profile");
		swipeDown();
		verifytest(Profile._updateProfileCTA);
		TapElement(Profile._updateProfileCTA);
		Thread.sleep(8000);
		logger.info("the user taps on Update profile CTA to get redirected to URL in the browser in logged in state");
	}
	
	@And("^the user tap on back button to go back to previous screen.$")
	public void the_user_tap_on_back_button_to_go_back_to_previous_screen() throws Throwable {
		Thread.sleep(1000);
		TapElement(Profile._ProfilebackCTA);
		Thread.sleep(800);
		Assert.assertTrue(Profile._YourProfileCTA.isDisplayed());
		verifytest(Profile._YourProfileCTA);
		logger.info("the user tap on back button to go back to previous screen.");
	}
}
