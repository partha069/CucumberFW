package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.CreateAccount_LocationServiceEnableStep6;
import com.bma.pageObject.CreateAccount_RecieveNotificationStep5;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreenStep3;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_ClientId_Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_step6_enableLocation extends Utilities {
	SoftAssert softassert = new SoftAssert();
	public HomeScreen Home = new HomeScreen(driver);
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_step4 = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver);
	public SignUpForMyBanfieldScreenStep3 SignUpForMyBanfieldStep3 = new SignUpForMyBanfieldScreenStep3(driver);
	public Whoops_PopUp_ClientId_Login Whoops_PopUp_CId_Login = new Whoops_PopUp_ClientId_Login(driver);
	public CreateAccount_RecieveNotificationStep5 CreateAccount_RecieveNotiStep5 = new CreateAccount_RecieveNotificationStep5(driver);
	public CreateAccount_LocationServiceEnableStep6 CreateAccount_LocationEnableStep6 = new CreateAccount_LocationServiceEnableStep6(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	
	@Given("^user is on the notification pop-up screen$")
	public void user_is_on_the_notification_pop_up_screen() throws Throwable {
		ViewWelcome.TapOnnewCreateAccount();
		havewemet.TapOnYesIHaveCTA();
		SignUpForMyBanfield.EnterClientID();
		SignUpForMyBanfieldStep3.EnterCreateAccountstep3Validdetails();
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(3000);
		TapElement(SignUpForMyBanfield_step4._NextCTA);
		SignUpForMyBanfield_step4.EnterUNRegisteredemailandpwd();
		TapElement(SignUpForMyBanfield_step4._NextCTA);
		logger.info("user is on the notification pop-up screen");
	}

	@When("^the user click on Skip or Yes CTA$")
	public void the_user_click_on_Skip_or_Yes_CTA() throws Throwable {
		TapElement(CreateAccount_RecieveNotiStep5._SkipCTA);
		logger.info("the user click on Skip or Yes CTA");
	}

	@Then("^the user should should redirected to the enable location pop-up screen$")
	public void the_user_should_should_redirected_to_the_enable_location_pop_up_screen() throws Throwable {
		Assert.assertTrue(CreateAccount_LocationEnableStep6._HandyRightText.isDisplayed());
		logger.info("the user should should redirected to the enable location pop-up screen");
	}

	@Then("^the user should be displayed with the following on the pop-up screen$")
	public void the_user_should_be_displayed_with_the_following_on_the_pop_up_screen() throws Throwable {
		CreateAccount_LocationEnableStep6.VerifyCreateAccountstep6UI();
		logger.info("the user should be displayed with the following on the pop-up screen");
	}

	@Then("^the user click on Skip CTA to get redirected to Home screen$")
	public void the_user_click_on_Skip_CTA_to_get_redirected_to_Home_screen() throws Throwable {
		TapElement(CreateAccount_LocationEnableStep6._SkipCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		verifytest(Home._HiUser_header);
		logger.info("the user click on Skip CTA to get redirected to Home screen");
	}

	@Then("^the user click on Yes CTA to get redirected to devices enable location services pop-up$")
	public void the_user_click_on_Yes_CTA_to_get_redirected_to_devices_enable_location_services_pop_up() throws Throwable {
		TapElement(CreateAccount_LocationEnableStep6._YesCTA);
		logger.info("the user click on Yes CTA to get redirected to devices enable location services pop-up");
	}

	@Then("^the user taps on X to get redirected to the Complete online profile Screen$")
	public void the_user_taps_on_X_to_get_redirected_to_the_Complete_online_profile_Screen() throws Throwable {
		//TapElement(CreateAccount_LocationEnableStep6);
		logger.info("the user taps on X to get redirected to the Complete online profile Screen");
	}
	
	@Then("^User Logout from App$")
	public void user_Logout_from_App() throws Throwable {
		//initiateApp();
		Thread.sleep(5000);
		Profile.Logout();
	}

}
