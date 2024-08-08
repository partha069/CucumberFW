package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_UsingUserNameSteps extends Utilities {

	public String path = "./src/test/resources/TestData/Sprint7/LoginUsingUserNmae.csv";
	
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Login_UsingUserNameSteps.class);

	@When("^the user enters the correct username or email address and password$")
	public void the_user_enters_the_correct_username_or_email_address_and_password() throws Throwable {
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"UserName", "UserName","Password","InvalidPassword","InvalidUserName"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"Password", "UserName","Password","InvalidPassword","InvalidUserName"));
		HidingKeyboardios();
		Thread.sleep(2000);
		TapElement(Login._LoginButton);
		logger.info("the user enters the correct username or email address and passwordA");
	}

	@Then("^the user should successfully log in$")
	public void Then_the_user_should_successfully_log_in() throws Throwable {
		Thread.sleep(5000);
		verifytest(Home._HiUser_header);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("Then the user should successfully log in");
	}
	
	@When("^the user enters the incorrect username or email address or password$")
	public void the_user_enters_the_incorrect_username_or_email_address_or_password() throws Throwable {
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"InvalidUserName", "UserName","Password","InvalidPassword","InvalidUserName"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "UserName","Password","InvalidPassword","InvalidUserName"));
		Thread.sleep(1000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Login._whoopsloginheader.isDisplayed());
		logger.info("the user enters the correct username or email address or passwordA");
	}
	
	@Then("^the user should be displayed with a pop-up$")
	public void the_user_should_be_displayed_with_a_popup() {
		Login.VerifyInvalidUserNameWhoopsUI();
		logger.info("the user should be displayed with a pop-up");
	}
	
	@And("^the user will tap on 877-656-7146 to launch devices default dialer with phone number pre-filled$")
	public void the_user_will_tap_on_8776567146_to_launch_devices_default_dialer_with_phone_number_prefilled() {
		
		logger.info("the user will tap on 877-656-7146 to launch devices default dialer with phone number pre-filled");
	}
	
	
	@Then("^the user leaves the username or password field empty$")
	public void the_username_or_password_field_empty() throws Throwable {
		Thread.sleep(1000);
		TapElement(Login._LoginButton);
		Thread.sleep(3000);
		Login.VerifyWhoopsUIwithoutlogin_pass();
		logger.info("the user leaves the username or email address or password field empty");
	}
	
	@Then("^the user leaves the username or email address or password field empty$")
	public void the_username_or_email_address_or_password_field_empty() throws Throwable {
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"UserName", "UserName","Password","InvalidPassword","InvalidUserName"));
		Thread.sleep(1000);
		TapElement(Login._LoginButton);
		Thread.sleep(3000);
		Login.VerifyWhoopsUIwithoutlogin_pass();
		logger.info("the user leaves the username or email address or password field empty");
	}
	
	@Then("^the user taps on Okay CTA to close the pop-up.$")
	public void user_taps_on_Okay_CTA_to_close_the_popup() throws Throwable {
		TapElement(Login._OK);
		Thread.sleep(1000);
		Assert.assertTrue(Login._LoginButton.isDisplayed());
		logger.info("the user taps on Okay CTA to close the pop-up.");
	}

}
