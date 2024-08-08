package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccessCTAonWelcomeScreenSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen MakeAnAppointment = new HavewemetScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public Find_a_Location_Near_You_Screen NearYouScreen = new Find_a_Location_Near_You_Screen(driver);
	
	private static Logger logger = LogManager.getLogger(AccessCTAonWelcomeScreenSteps.class);

	@Then("^user is on the welcome screen$")
	public void user_is_on_the_welcome_screen() throws Throwable {
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("All the Elements in Welcome page is displayed");
	}
	
	@When("^user taps on Log in CTA$")
	public void user_taps_on_Sign_in_CTA() {
		ViewWelcome.TapOnSigninbutton();
		logger.info("user taps on Sign in CTA");
	}

	@Then("^the user should be redirected to the Log in screen.$")
	public void the_user_should_be_redirected_to_the_Sign_in_screen() {
		verifytest(Login._EmailTextField);
		Login.verifyLoginScreen();
		logger.info("the user should be redirected to the Sign in screen.");
	}

	@When("^user taps on Make an appointment CTA$")
	public void user_taps_on_Make_an_appointment_CTA() {
		ViewWelcome.TapOnMakeAppointmentasGuest();
		logger.info("user taps on Make an appointment CTA");
	}

	@Then("^the user should be redirected to the Have we met screen$")
	public void the_user_should_be_redirected_to_the_Have_we_met_screen() throws InterruptedException {
		verifytest(MakeAnAppointment._yesIHaveButton);
		MakeAnAppointment.verifyHavewematescreen();
		logger.info("the user should be redirected to the Have we met? screen");
	}

	@When("^user taps on New Create account CTA$")
	public void user_taps_on_New_Create_account_CTA() {
		ViewWelcome.TapOnnewCreateAccount();
		logger.info("user taps on New Create account CTA");
	}

	@When("^user taps on Find a nearby location CTA$")
	public void user_taps_on_Find_a_nearby_location_CTA() {
	//	getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(ViewWelcome._findANearbyLocationbutton);
		logger.info("user taps on \"Find a nearby location\" CTA");
	}

	@Then("^the user should be redirected to the Hospital Locator screen$")
	public void the_user_should_be_redirected_to_the_Hospital_Locator_screen() {
		TapElement(ViewWelcome._deny);
		Assert.assertTrue(NearYouScreen._Findalocationheadertext.isDisplayed());
		verifytest(NearYouScreen._Findalocationheadertext);
		logger.info("the user should be redirected to the Hospital Locator screen");
	}

	@And("^the first time user will see a pop up notification to turn on the device's location$")
	public void the_first_time_user_will_see_a_pop_up_notification_to_turn_on_the_devices_location() {
		System.out.println("NATC");
		logger.info("the first time user will see a pop up notification to turn on the device's location");
	}

	@When("^user taps on Build packages CTA$")
	public void user_taps_on_Build_packages_CTA() {
		verifytest(ViewWelcome._buildPackagebutton);
		TapElement(ViewWelcome._buildPackagebutton);
		logger.info("user taps on Build packages CTA");
	}

	@Then("^the user should be redirected to the URL \"https://shop.banfield.com/banfield-wellness-plans/enroll\"$")
	public void the_user_should_be_redirected_to_the_URL_enroll() {
		System.out.println("NATC");
		logger.info("the user should be redirected to the URL");
	}

	@When("^user taps on Terms of service CTA$")
	public void user_taps_on_Terms_of_service_CTA() {
		verifytest(ViewWelcome._TermsOfService);
		TapElement(ViewWelcome._TermsOfService);
		logger.info("user taps on Terms of service CTA");
	}

	@Then("^the user should be redirected to the URL \"https://www.banfield.com/General/Terms\"$")
	public void the_user_should_be_redirected_to_the_URL_Terms() {
		System.out.println("NATC");
		logger.info("the user should be redirected to the URL");
	}

	@When("^user taps on Privacy policy CTA$")
	public void user_taps_on_Privacy_policy_CTA() {
		verifytest(ViewWelcome._PrivacyPolicy);
		TapElement(ViewWelcome._PrivacyPolicy);
		logger.info("user taps on Privacy policy\" CTA");
	}

	@Then("^the user should be redirected to the URL \"https://www.mars.com/privacy\"$")
	public void the_user_should_be_redirected_to_the_URL_privacy() {
		System.out.println("NATC");
		logger.info("the user should be redirected to the URL");
	}
}
