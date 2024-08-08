package com.bma.stepDefinition;

import static org.testng.Assert.assertFalse;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Highlights_Weight_TrackerSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	public String path1 = "./src/test/resources/TestData/Sprint5/Login_using_credentials15.csv";
	public String path2 = "./src/test/resources/TestData/Sprint5/Login_using_credentials16.csv";
	public String path3 = "./src/test/resources/TestData/Sprint5/Login_using_credentials17.csv";
	public String path4 = "./src/test/resources/TestData/Sprint5/Login_using_credentials18.csv";
	
	private static Logger logger = LogManager.getLogger(Highlights_Weight_TrackerSteps.class);
	
	@When("^User Logged in app as Weight Tracker Ideal status$")
	public void User_Logged_in_app_as_Weight_Tracker_Ideal_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in app as Weight Tracker Ideal status");
	}
	
	@When("^User Logged in app as Weight Tracker Overweight status$") 
	public void User_Logged_in_app_as_Weight_Tracker_Overweight_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in app as Weight Tracker Overweight status");
	}
	
	@When("^User Logged in app as Weight Tracker Underweight status$")
	public void User_Logged_in_app_as_Weight_Tracker_Underweight_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path3,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path3,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in app as Weight Tracker Underweight status");
	}
	
	@When("^User Logged in app as Weight Tracker Obese status$") 
	public void User_Logged_in_app_as_Weight_Tracker_Obese_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path4,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path4,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in app as Weight Tracker Obese status");
	}


	@And("^they tap to view the highlights tab for OWP pet$")
	public void they_tap_to_view_the_highlights_tab_for_OWP_pet() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("they tap to view the highlights tab for OWP pet");
	}
	
	@When("^the user taps on the Weight tracker accordion to expand$")
	public void the_user_taps_on_the_Weight_tracker_accordion_to_expand() throws Throwable {
		ScrolltoElement("Kimberlee");
		TapElement(Home._pet0);
		ScrolltoElement("Weight tracker");
		softassert.assertTrue(PetCard._weightTracter.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterLogoImage.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorImage.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorText.isDisplayed());
		softassert.assertAll();
		TapElement(PetCard._weightTracterAccordion);
	//	ScrolltoElement("Body condition score");
		logger.info("the user taps on the Weight tracker accordion to expand");
	}
	
	@Then("^they will be displayed with the following information Status indicator, Body condition score, Weight chart, Weight history$")
	public void they_will_be_displayed_with_the_following_information_Status() {
		PetCard.verifyweightTracter();
		logger.info("they will be displayed with the following information Status indicator, Body condition score, Weight chart, Weight history");
	}
	
	@And("^the user will be displayed with the status green- ideal$")
	public void the_user_will_be_displayed_with_the_status_green_ideal() {
		ScrolltoElement("Body condition score");
		Assert.assertTrue(PetCard._weightTracterIndicatorImage.isDisplayed());
		Assert.assertTrue(PetCard._weightTracterIndicatorText.isDisplayed());
		logger.info("the user will be displayed with the status green- ideal");
	}
	
	@And("^the user will be displayed with the status yellow- under weight$")
	public void the_user_will_be_displayed_with_the_status_yellow_under_weight() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Florencio");
		TapElement(Home._pet05);
		ScrolltoElement("Weight tracker");
	//	TapElement(PetCard._weightTracterAccordion);
		softassert.assertTrue(PetCard._weightTracterLogoImageUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorImageUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorTextUnderweight.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the status yellow- under weight");
	}
	
	@And("^the user will be displayed with the status yellow- under overweight$")
	public void the_user_will_be_displayed_with_the_status_yellow_under_overweight() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Elgin");
		TapElement(Home._pet16);
		ScrolltoElement("Weight tracker");
	//	TapElement(PetCard._weightTracterAccordion);
		softassert.assertTrue(PetCard._weightTracterLogoImageUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorImageUnderweight.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorTextUnderweight.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the status yellow- under overweight");
	}
	
	@And("^the user will be displayed with the status  red - obese$")
	public void the_user_will_be_displayed_with_the_status_red_obese() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Zarita");
		TapElement(Home._pet0);
		ScrolltoElement("Weight tracker");
	//	TapElement(PetCard._weightTracterAccordion);
		softassert.assertTrue(PetCard._weightTracterLogoImageObese.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterObese.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorImageObese.isDisplayed());
		softassert.assertTrue(PetCard._weightTracterIndicatorTextObese.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the status  red - obese");
	}
	
	@And("^the user taps on the accordion again to collapse it$")
	public void the_user_taps_on_the_accordion_again_to_collapse_it() {
		TapElement(PetCard._weightTracterAccordionObese);
		Assert.assertTrue(PetCard._weightTracterBodyConditionScoreText.isDisplayed());
		TapElement(PetCard._weightTracterAccordionObese);
		try {
			softassert.assertFalse(PetCard._weightTracterBodyConditionScoreText.isDisplayed());
			softassert.assertAll();
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Accordion collapsed");
		}
		logger.info("the user taps on the accordion again to collapse it");
	}
}
