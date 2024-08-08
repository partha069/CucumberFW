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

public class Highlights_Payment_DetailsSteps extends Utilities {


	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PaymentDetailsScreen PaymentDetails = new PaymentDetailsScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_Payment_DetailsSteps.class);

	@When("^the user taps on Payment details CTA$")
	public void the_user_taps_on_Payment_details_CTA() throws Throwable {
		Thread.sleep(9000);
		ScrolltoElement("Jisela");//updated
		TapElement(Home._pet14);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		Thread.sleep(6000);
		ScrolltoElement("Payment details");
		TapElement(PetCard._paymentDetailsCTAForOWP);
	//  WaitVisibilityOfElement(PaymentDetails._PaymentDetailsTitle);
		Assert.assertTrue(PaymentDetails._PaymentDetailsTitle.isDisplayed());
		logger.info("the user taps on Payment details CTA");
	}

	@Then("^the user should get redirected to Payment details screen$")
	public void the_user_should_get_redirected_to_Payment_details_screen() throws Throwable {
		Assert.assertTrue(PaymentDetails._PaymentDetailsTitle.isDisplayed());
		logger.info("the user should get redirected to Payment details screen");
	}

	@Then("^the screen should display the following info:$")
	public void the_screen_should_display_the_following_info() throws Throwable {
		PaymentDetails.verifyPaymentdetailspage();
		logger.info("the screen should display the following info");
	}

	@Then("^the user taps on Manage plan CTA to get redirected to URL on browser$")
	public void the_user_taps_on_Manage_plan_CTA_to_get_redirected_to_URL_on_browser() throws Throwable {
		ScrolltoElement("Manage plan");
		TapElement(PaymentDetails._managePlanCTA);
		Thread.sleep(3000);
		logger.info("the user taps on Manage plan CTA to get redirected to URL on browser");
	}

	@When("^the user should be to click on < icon to go back to Highlights screen$")
	public void the_user_should_be_to_click_on_icon_to_go_back_to_Highlights_screen() throws Throwable {
		TapElement(PaymentDetails._backCTA);
		Thread.sleep(3000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("the user should be to click on < icon to go back to Highlights screen");
	}
}
