package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreenStep3;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp_Account_Locked_Login;
import com.bma.pageObject.Whoops_PopUp_ClientId_Okay;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class CreateAccount_Lock_Specific_Account_OnlySteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public SignUpForMyBanfieldScreenStep3 SignUpForMyBanfieldStep3 = new SignUpForMyBanfieldScreenStep3(driver);
	public Whoops_PopUp_ClientId_Okay whoopsPopups = new Whoops_PopUp_ClientId_Okay(driver);
	public Whoops_PopUp_Account_Locked_Login whoopsPopupsforAccountLocked = new Whoops_PopUp_Account_Locked_Login(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(CreateAccount_Lock_Specific_Account_OnlySteps.class);

	@Given("^user is on Complete online profile screen$")
	public void user_is_on_the_Complete_online_profile_screen() throws Throwable {
		ViewWelcome.TapOnnewCreateAccount();
		havewemet.TapOnYesIHaveCTA();
		SignUpForMyBanfield.EnterCorrectClientID();
		SignUpForMyBanfieldStep3.EnterWrongInformation();
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(5000);
		logger.info("user is on Complete online profile screen");
	}
	
	@When("^the user has 3 incorrect attempts$")
	public void the_user_has_three_incorrect_attempts() throws Throwable {
		whoopsPopups.verifyWhoopspopupwithokayCTA();
		
		TapElement(whoopsPopups._OkayCTA);
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(3000);
		whoopsPopups.verifyWhoopspopupwithokayCTA();
		
		TapElement(whoopsPopups._OkayCTA);
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(3000);
		whoopsPopups.verifyWhoopspopupwithokayCTA();
		logger.info("the user has 3 incorrect attempts");
	}
	
	@When("^the user will be displayed with a pop-up for account has been locked for suspicious activity$")
	public void displayed_with_a_popup_for_account_has_been_locked() throws Throwable {
		TapElement(whoopsPopups._OkayCTA);
		Thread.sleep(3000);
		whoopsPopupsforAccountLocked.verifyUserAccountLocked();
		logger.info("the user will be displayed with a pop-up for account has been locked for suspicious activity");
	}
	
	@And("^the user tap on Okay CTA to get redirected to the welcome screen$")
	public void user_tap_on_Okay_CTA_to_get_redirected_to_the_welcome_screen() throws Throwable {
		TapElement(whoopsPopupsforAccountLocked._OkayCTA);
		Thread.sleep(3000);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user tap on Okay CTA to get redirected to the welcome screeny");
	}
	
	@And("^the account should be locked for that specific client ID only$")
	public void account_should_be_locked_for_that_specific_client_ID_only() throws Throwable {
		ViewWelcome.TapOnnewCreateAccount();
		havewemet.TapOnYesIHaveCTA();
		SignUpForMyBanfield.EnterCorrectClientID();
	//	SignUpForMyBanfieldStep3.EnterWrongInformation();
	//	TapElement(SignUpForMyBanfieldStep3._NextCTA);
	//	Thread.sleep(5000);
		verifytest(whoopsPopupsforAccountLocked._WhoopsTitle);
		whoopsPopupsforAccountLocked.verifyUserAccountLocked();
		logger.info("the account should be locked for that specific client ID only");
	}
	
	@And("^the user can use the other Client ID to go through the create account process$")
	public void user_can_use_the_other_Client_ID_to_go_through_the_create_account_process() throws Throwable {
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user can use the other Client ID to go through the create account process");
	}

	
}
