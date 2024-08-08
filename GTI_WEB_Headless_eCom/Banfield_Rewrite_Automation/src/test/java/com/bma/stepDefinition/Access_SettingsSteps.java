package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.SettingsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Access_SettingsSteps extends Utilities {

	public SettingsScreen Settings = new SettingsScreen(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Access_SettingsSteps.class);

	@When("^the user clicks on Settings CTA$")
	public void user_clicks_on_Settings_CTA() {
		TapElement(Profile._SettingsCTA);
		logger.info("the user clicks on Settings CTA");
	}
	
	@Then("^the user is redirected to Settings Page$")
	public void user_is_redirected_to_Settings_Page() throws Throwable {
		Thread.sleep(2000);
		softassert.assertTrue(Settings._settingsTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user is redirected to Settings Page");
	}
	
	@And("^the user is displayed with the options to enable or disable the following$")
	public void displayed_with_the_options_to_enable_or_disable() {
		softassert.assertTrue(Settings._pushNotificationsButton.isEnabled());
		//softassert.assertTrue(Settings._pushNotificationsButton.isEnabled());
		try {
			softassert.assertTrue(Settings._allowBiometricsButton.isEnabled());
			TapElement(Settings._allowBiometricsButton);
			softassert.assertTrue(Settings._allowBiometricsButton.isEnabled());	
			softassert.assertTrue(Settings._allowBiometricsText.isDisplayed());
			softassert.assertAll();
		} catch (Exception e) {
			System.out.println("Biometics is not enabled for this device");
		}
		softassert.assertTrue(Settings._pushNotificationsText.isDisplayed());
		softassert.assertTrue(Settings._buildText.isDisplayed());
		softassert.assertAll();
		verifytest(Settings._pushNotificationsButton);
		TapElement(Settings._pushNotificationsButton);
		Settings.verifyopensettingpopup();
		
		logger.info("the user is displayed with the options to enable or disable the following");
	}
	
	@And("^the user will be displayed with the Log out CTA$")
	public void displayed_with_the_Log_out_CTA() {
		softassert.assertTrue(Settings._logOutCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the Log out CTA");
	}
	
	@And("^the user will click on Log out CTA to log out of the app$")
	public void tap_on_Log_out_CTA_to_log_out_of_the_app() throws Throwable {
		TapElement(Settings._logOutCTA);
		logger.info("the user will click on Log out CTA to log out of the app");
	}
	
	@And("^the user will be redirected to login screen on logout$")
	public void user_will_be_redirected_to_login_screen_on_logout() throws Throwable {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Login.VerifyLoginUI();
		verifytest(Login._EmailTextField);
		logger.info("the user will be redirected to login screen on logout");
	}
}
