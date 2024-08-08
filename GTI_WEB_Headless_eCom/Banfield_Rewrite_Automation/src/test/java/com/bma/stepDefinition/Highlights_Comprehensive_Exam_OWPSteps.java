package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

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

public class Highlights_Comprehensive_Exam_OWPSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_Comprehensive_Exam_OWPSteps.class);
	public String path = "./src/test/resources/TestData/Sprint5/Highlights_Comprehensive_examOWP.csv";
	
	@When("^the OWP user is on the Highlights Tab$")
	public void the_OWP_user_is_on_the_Highlights_Tab() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
		Thread.sleep(1000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(15000);
		TapElement(Home._pet0);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		Thread.sleep(6000);
		logger.info("the OWP user is on the Highlights Tab");
	}
	
	@And("^User tap on Pet Card$")
	public void User_tap_on_Pet_Card() throws Throwable {
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Scroll("Kojo");
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("User tap on Pet Card");
	}
	
	@When("^they tap on the Comprehensive exam accordion to expand$")
	public void they_tap_on_the_Comprehensive_exam_accordion_to_expand() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Alida");
		TapElement(Home._pet31);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		Thread.sleep(6000);
		if (getUserDeviceInput.contains("IOS")) {
			Scroll("Comprehensive exam");
			TapElement(PetCard._comprehensiveExam);
		}else {
		ScrolltoElement("Comprehensive exam");
		TapElement(PetCard._comprehensiveExamAccordionsRed);
		}
		logger.info("they tap on the Comprehensive exam accordion to expand");
	}

	@Then("^they will be displayed with the following information Comprehensive exam, Status indicator, Next exam due date$")
	public void they_will_be_displayed_with_the_following_information_Comprehensive_exam_Status_indicator_Next_exam_due_date() throws Throwable {
	//	ScrolltoElement("Comprehensive exam");
	//	TapElement(PetCard._comprehensiveExamAccordionsRed);
		PetCard.VerifyComprehensiveexamRed();
		logger.info("they will be displayed with the following information Comprehensive exam, Status indicator, Next exam due date");
	}

	@Then("^the user is displayed with the status of the Comprehensive exam in \\(red, yellow, green\\)$")
	public void the_user_is_displayed_with_the_status_of_the_Comprehensive_exam_in_red_yellow_green() throws Throwable {
	    softassert.assertTrue(PetCard._comprehensiveExamIndicatorImageRed.isDisplayed());
		softassert.assertTrue(PetCard._comprehensiveExamIndicatorTextRed.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the status of the Comprehensive exam");
	}

	@Then("^the user will be displayed with the Manage plan CTA in OWP widget with the static text: Included in your plan$")
	public void the_user_will_be_displayed_with_the_Manage_plan_CTA_in_OWP_widget_with_the_static_text_Included_in_your_plan() throws Throwable {
	Assert.assertTrue(PetCard._comprehensiveManageplanCTARed.isDisplayed());
	logger.info("the user will be displayed with the Manage plan CTA in OWP widget with the static text: Included in your plan");
	}

	@Then("^the user taps on the Manage plan CTA to get redirected to the URL on browser in logged in state$")
	public void the_user_taps_on_the_Manage_plan_CTA_to_get_redirected_to_the_URL_on_browser_in_logged_in_state() throws Throwable {
		TapElement(PetCard._comprehensiveManageplanCTARed);
		Thread.sleep(3000);
		logger.info("the user taps on the Manage plan CTA to get redirected to the URL on browser in logged in state");
	}

	@Then("^the user taps on the accordion again to collapse the Comprehensive exam accordion$")
	public void the_user_taps_on_the_accordion_again_to_collapse_the_Comprehensive_exam_accordion() throws Throwable {
		Thread.sleep(1000);
		if (getUserDeviceInput.contains("IOS")) {
			TapElement(PetCard._comprehensiveExam);
		}else {
		TapElement(PetCard._comprehensiveExamAccordionsRed);}
		Thread.sleep(1000);
		logger.info("the user taps on the accordion again to collapse the Comprehensive exam accordion");
	}
}
