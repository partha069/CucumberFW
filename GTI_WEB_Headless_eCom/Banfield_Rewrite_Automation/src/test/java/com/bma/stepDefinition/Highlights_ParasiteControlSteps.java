package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PaymentDetailsScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Highlights_ParasiteControlSteps extends Utilities {



	public PetCardScreen PetCard = new PetCardScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_ParasiteControlSteps.class);

	@When("^they tap on the Parasite control accordion to expand$")
	public void they_tap_on_the_Parasite_control_accordion_to_expand() {
		Scroll("Weight tracker");
		TapElement(PetCard._parasiteaccordian);
		logger.info("they tap on the Parasite control accordion to expand");
	}
	
	@Then("^the user will be displayed with the following information$")
	public void the_user_will_be_displayed_with_the_following_information() throws Throwable {
		PetCard.verifyparasitecontrolUI();
		logger.info("the user will be displayed with the following information");
	}

	@Then("^the Due date will have a status indicator$")
	public void the_Due_date_will_have_a_status_indicator() throws Throwable {
		Assert.assertTrue(PetCard._orderparasiteindicatorimage.isDisplayed());
		logger.info("the Due date will have a status indicator");
	}

	@Then("^the parasite control history should display all records on file\\.$")
	public void the_parasite_control_history_should_display_all_records_on_file() throws Throwable {
		Assert.assertTrue(PetCard._parasitepreventionname.isDisplayed());
		logger.info("the parasite control history should display all records on file");
	}

	@Then("^the user should be able to tap on Order parasite control CTA to get redirected to URL on Browser in logged in state$")
	public void the_user_should_be_able_to_tap_on_Order_parasite_control_CTA_to_get_redirected_to_URL_on_Browser_in_logged_in_state() throws Throwable {
		Scroll("Order parasite control");
		TapElement(PetCard._orderparasitecontrolcta);
		Thread.sleep(4000);
		logger.info("the user should be able to tap on Order parasite control CTA to get redirected to URL on Browser in logged in state");
	}

	@Then("^the user has the ability to tap on the accordion again to collapse it$")
	public void the_user_has_the_ability_to_tap_on_the_accordion_again_to_collapse_it() throws Throwable {
//		Scroll("Parasite control");
		TapElement(PetCard._parasiteaccordian);
		logger.info("the user has the ability to tap on the accordion again to collapse it");
	}
}
