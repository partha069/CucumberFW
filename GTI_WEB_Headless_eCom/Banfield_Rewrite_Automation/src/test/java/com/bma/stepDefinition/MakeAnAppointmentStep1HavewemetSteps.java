package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeAnAppointmentStep1HavewemetSteps extends Utilities {

	public HavewemetScreen HavewemetScreen = new HavewemetScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LetsgetstartedSteps Letsgetstarted = new LetsgetstartedSteps(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAnAppointmentStep1HavewemetSteps.class);

	@When("^User is on the welcome screen$")
	public void User_is_on_the_welcome_screen() throws InterruptedException {
		Thread.sleep(5000);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("User is on the welcome screen");
	}

	@When("^user taps on the make an appointment CTA$")
	public void user_taps_on_make_an_appointment_CTA() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ViewWelcome.TapOnMakeAppointmentasGuest();
		logger.info("user taps on make an appointment CTA");
	}

	@Then("^the user will be redirected to Have we met? page$")
	public void the_user_will_be_redirected_to_Have_we_met_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HavewemetScreen.verifyHavewematescreen();
		logger.info("the user will be redirected to Have we met? page");
	}

	@And("^the user will be displayed with Have you been to a Banfield Pet Hospital before?$")
	public void the_user_will_be_displayed_with_Have_you_been_to_a_Banfield_Pet_Hospital_before() throws InterruptedException {
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		Assert.assertTrue(HavewemetScreen._haveyoubeentoaBanfieldPetHospitalBefore.isDisplayed());
		logger.info("the user will be displayed with Have you been to a Banfield Pet Hospital before?");
	}

	@And("^If the user choose Yes I have CTA$")
	public void the_browser_loads_the_Privacy() {
		HavewemetScreen.TapOnYesIHaveCTA();
		logger.info("If the user choose Yes I have CTA");
	}

	@And("^the user will be redirected to the login page.$")
	public void the_user_will_be_redirected_to_the_login_page() throws InterruptedException {
		verifytest(Login._EmailTextField);
		Login.verifyLoginScreen();
		logger.info("the user will be redirected to the login page.");
	}

	@When("^If the user choose No Im new CTA$")
	public void If_the_user_choose_No_Im_new_CTA() {
		HavewemetScreen.TapOnNoIMNew();
		logger.info("If the user choose No Im new CTA");
	}

	@When("^the user will be redirected to the Contact information Page$")
	public void the_user_will_be_redirected_to_the_Contact_information_Page() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(Letsgetstarted._letsgetstartedTitle.isDisplayed());
		logger.info("User will be redirected to the Contact information Page");
	}

	@Then("^the user taps on < to go back to the Lets get started Screen$")
	public void the_user_taps_on_to_go_back_to_the_Welcome_Screen() throws InterruptedException {
		TapElement(Letsgetstarted._backCTA);
		verifytest(HavewemetScreen._yesIHaveButton);
		HavewemetScreen.verifyHavewematescreen();
		logger.info("User tapped on < to go back to the Let's get started Screen");
	}
	
	@And("^the user taps on X to go back to Welcome screen$")
	public void the_user_taps_on_to_go_backk_to_the_Welcome_Screen() throws InterruptedException {
		TapElement(Letsgetstarted._cancelCTA);
		verifytest(HavewemetScreen._yesIHaveButton);
		HavewemetScreen.verifyHavewematescreen();
		logger.info("User taps on X to go back to Welcome screen");
	}
}
