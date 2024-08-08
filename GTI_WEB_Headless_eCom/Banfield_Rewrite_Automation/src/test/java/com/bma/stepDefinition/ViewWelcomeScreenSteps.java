package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewWelcomeScreenSteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
    public ProfileScreen profile = new ProfileScreen(driver);
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public LoginScreen login = new LoginScreen(driver);
	
	public ViewWelcomeScreen WelcomeScreen = new ViewWelcomeScreen(driver);

	@Given("^user launched the Banfield application$")
	public void user_launched_the_Banfield_application() throws Exception{

		System.out.println(" User Launched Banfield Application");
		try{
		    Thread.sleep(2000);
			if(profile._profileCTA.isDisplayed()) {
			Assert.assertTrue(profile._profileCTA.isDisplayed());
			profile.Logout();
			TapElement(login._CancelCTA);
			}
		}catch(Exception e) {
			System.out.println("user is on welcome screen");
	}
		logger.info("User landed on Banfield application");
	}

	@Then("^the user should be displayed with the Welcome Screen$")
	public void the_user_should_be_displayed_with_the_Welcome_Screen() throws InterruptedException {
		Thread.sleep(4000);
		WelcomeScreen.verifyWelcomeScreenUIElement();
	//	isElementHighlighted(WelcomeScreen._makeAppointmentAsGuestbutton);
		logger.info("User should be displayed with the Welcome Screen");
	}

	@Then("^the screen should display the Sign in CTAs$")
	public void the_screen_should_display_the_Sign_in_CTAs() {
		Assert.assertTrue(WelcomeScreen._signInbutton.isDisplayed());
		logger.info("User should display the Sign in CTAs");
	}

	@Then("^the screen should display the Make appointment as guest CTAs$")
	public void the_screen_should_display_the_Make_appointment_as_guest_CTAs() {
		Assert.assertTrue(WelcomeScreen._makeAppointmentAsGuestbutton.isDisplayed());
		logger.info("User display the Make appointment as guest CTAs");
	}

	@When("^the screen should display the New Create account CTAs$")
	public void the_screen_should_display_the_New_Create_account_CTAs() {
		Assert.assertTrue(WelcomeScreen._newCreateAccountbutton.isDisplayed());
		logger.info("User should display the New? Create account CTAs");
	}

	@Then("^the screen should display the Find a nearby location CTAs$")
	public void the_screen_should_display_the_Find_a_nearby_location_CTAs() {
		Assert.assertTrue(WelcomeScreen._findANearbyLocationbutton.isDisplayed());
		logger.info("User should display the New? Create account CTAs");
	}

	@Then("^the screen should display the Enroll now CTAs$")
	public void the_screen_should_display_the_Build_Package_CTAs() {
	//	Assert.assertTrue(WelcomeScreen._buildPackagebutton.isDisplayed());
		Assert.assertTrue(WelcomeScreen._owpText.isDisplayed());
		logger.info("User should display the Build Package CTAs");
	}

	@Then("^the screen should display the Terms of service CTAs$")
	public void the_screen_should_display_the_Terms_of_service_CTAs() {
		Assert.assertTrue(WelcomeScreen._TermsOfService.isDisplayed());
		logger.info("User should display the Terms of service CTAs");
	}

	@Then("^the screen should display the Privacy policy CTAs$")
	public void the_screen_should_display_the_Privacy_policy_CTAs() {
		Assert.assertTrue(WelcomeScreen._PrivacyPolicy.isDisplayed());
		verifytest(WelcomeScreen._PrivacyPolicy);
		logger.info("User should display the Privacy policy CTAs");
	}
	
	@When("^they tap on Cancel from the Login Screen$")
	public void they_tap_on_Cancel_from_the_Login_Screen() {
	    System.out.println("Not Yet Implemented");
		logger.info("they tap on Cancel from the Login Screen");
	}
	
	@Then("^the user should be displayed with Welcome Screen$")
	public void the_user_should_be_displayed_with_Welcome_Screen() {
	    System.out.println("Not Yet Implemented");
		logger.info("the user should be displayed with the Welcome Screen");
	}
	
	@And("^the screen should display the CTAs as below$")
	public void the_screen_should_display_the_CTAs_as_below() {
	    System.out.println("Not Yet Implemented");
		logger.info("the screen should display the CTAs as below");
	}
}
