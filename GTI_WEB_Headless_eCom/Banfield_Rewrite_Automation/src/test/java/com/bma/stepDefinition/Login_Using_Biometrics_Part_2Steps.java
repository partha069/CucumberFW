package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Login_Using_Biometrics_Part_2Steps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Login_Using_Biometrics_Part_2Steps.class);

	@Then("^the user is displayed with the native pop-up automatically with$")
	public void user_is_displayed_with_the_native_popup_automatically() {
		logger.info("the user is displayed with the native pop-up automatically with");
	}

	
}
