package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_With_Banfield_IDSteps extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);

	@When("^user taps on create an account option$")
	public void user_taps_on_create_an_account_option() throws Exception {
		ViewWelcome.TapOnnewCreateAccount();	
	logger.info("User tapped on create an account option"); 
	}

	@Then("^the user taps on Yes I have option$")
	public void the_user_taps_on_Yes_I_have_option() throws Throwable {
		havewemet.TapOnYesIHaveCTA();
		logger.info("the user tap on Yes I have option"); 
	}

	@Then("^the user should be redirected to Sign up for MyBanfield screen$")
	public void the_user_should_be_redirected_to_Sign_up_for_MyBanfield_screen() throws Throwable {
		Thread.sleep(5000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user is navigated to Sign up for MyBanfield screen"); 
	}

}
