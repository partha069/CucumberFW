package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.DisplaySplashScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplaySplashScreenSteps extends Utilities {

	public DisplaySplashScreen SplashScreen = new DisplaySplashScreen(driver);
	public ViewWelcomeScreen WelcomeScreen = new ViewWelcomeScreen(driver);
	SoftAssert softassert = new SoftAssert();

	private static Logger logger = LogManager.getLogger(DisplaySplashScreenSteps.class);

	@When("^the user should view the splash screen on launch$")
	public void the_user_should_view_the_splash_screen_on_launch() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		softassert.assertTrue(SplashScreen._SplashScreen.isDisplayed());
		logger.info("the user should view the splash screen on launch");
	}
	
	@When("^the user taps on the App icon to Launch$")
	public void the_user_taps_on_the_App_icon_to_Launch() {
		// Non-Auto TCS
	}

	@When("^the splash screen should be displayed for 2 seconds$")
	public void the_splash_screen_should_be_displayed_for_2_seconds() throws Throwable {
		// Non-Auto TCS
	}

	@And("^the user should be redirected to the Welcome screen$")
	public void the_user_should_be_redirected_to_the_Welcome_screen() throws Throwable {
		WelcomeScreen.verifyWelcomeScreenUIElement();
		logger.info("the user should be redirected to the Welcome screen");
	}
}
