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

public class Highlights_Exam_NWPSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint5/Login_using_credentials23.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_Exam_NWPSteps.class);
	
	@When("^User Log in with valid Credential and displays Home Screen$")
	public void the_user_is_on_Home_screen() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user is on Home screen");
	}

	@When("^the NWP user is on the Highlights screen$")
	public void NWP_user_is_on_the_Highlights_screen() throws Throwable {
		Thread.sleep(9000);
		ScrolltoElement("Shun");
		TapElement(Home._pet06);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("the NWP user is on the Highlights screen");
	}
	
	@When("^the NWP user is on the Highlights page$")
	public void NWP_user_is_on_the_Highlights_page() throws Throwable {
		Thread.sleep(9000);
		ScrolltoElement("TestDog");
		TapElement(Home._pet22);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("the NWP user is on the Highlights screen");
	}
	
	@When("^NWP user is on the Highlights page$")
	public void NWP_user_is_on_the_Highlights() throws Throwable {
		Thread.sleep(9000);
		ScrolltoElement("Baldemar");
		TapElement(Home._pet23);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("the NWP user is on the Highlights screen");
	}
	
	@Then("^the user is displayed with Exam accordion with Status indicator red in place of Comprehensive exam$")
	public void Exam_accordion_with_Status_indicator_red() throws Throwable {
		Thread.sleep(4000);
		ScrolltoElement("Exam");
		Assert.assertTrue(PetCard._examRedIndicator.isDisplayed());
		Assert.assertTrue(PetCard._examRedIndicatorText.isDisplayed());
		logger.info("the NWP user is on the Highlights screenthe user is displayed with Exam accordion with Status indicator red in place of Comprehensive exam");
	}
	
	@And("^the user can tap on the Exam accordion to expand$")
	public void user_can_tap_on_the_Exam_accordion_to_expand() throws Throwable {
		TapElement(PetCard._examAccordionRed);
		ScrolltoElement("For the pet you love");
		Thread.sleep(3000);
		Assert.assertTrue(PetCard._examNextDueDate.isDisplayed());
		TapElement(PetCard._examAccordionRed);
		try {
			Assert.assertFalse(PetCard._examNextDueDate.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Accordion is Closed");
		}
		logger.info("the user can tap on the Exam accordion to expand");
	}
	
	@Then("^the user will be displayed with the following information for Exam$")
	public void the_user_will_be_displayed_with_the_following_information_for_Exam(){
		TapElement(PetCard._examAccordionRed);
		PetCard.verifyExam();
		logger.info("the user will be displayed with the following information for Exam");
	}
	
	@And("^the user will be displayed with the Enroll now CTA with static text$")
	public void user_will_be_displayed_with_the_Enroll_now_CTA_with_static_text() {
		softassert.assertTrue(PetCard._examEnrollNow.isDisplayed());
		softassert.assertTrue(PetCard._examOWPText.isDisplayed());
		softassert.assertTrue(PetCard._examForPetYouLoveText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user will be displayed with the following information for Exam");
	}
	
	@And("^the user is displayed with the grey color when there is nothing on file$")
	public void user_is_displayed_with_the_grey_color() throws Throwable {
		ScrolltoElement("Exam");
		Thread.sleep(1000);
		softassert.assertTrue(PetCard._examGreyIndicator.isDisplayed());
		softassert.assertTrue(PetCard._examGreyIndicatorText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user is displayed with the grey color when there is nothing on file");
	}
	
	@And("^the user can expand the accordion when there is nothing on file$")
	public void expand_the_accordion_when_there_is_nothing_on_file() throws Throwable {
		TapElement(PetCard._examAccordionGray);
		Thread.sleep(2000);
		softassert.assertTrue(PetCard._examOWPText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user can expand the accordion when there is nothing on file");
	}
	
	@And("^the expanded accordion Nothing on file will be displayed with the following information$")
	public void expanded_accordion_Nothing_on_file_will_be_displayed() throws Throwable {
		softassert.assertTrue(PetCard._examEnrollNow.isDisplayed());
		softassert.assertTrue(PetCard._examOWPText.isDisplayed());
		softassert.assertTrue(PetCard._examForPetYouLoveText.isDisplayed());
	    softassert.assertAll();
		logger.info("the expanded accordion Nothing on file will be displayed with the following information");
	}
	
	@And("^the user taps on the Enroll now CTA to get redirected to the URL on browser$")
	public void user_taps_on_the_Enroll_now_CTA() {
		TapElement(PetCard._examEnrollNow);
		logger.info("the user taps on the Enroll now CTA to get redirected to the URL on browser");
	}
	
	@Then("^the user is displayed with Exam accordion with Status indicator green in place of Comprehensive exam.$")
	public void displayed_with_Exam_accordion_with_Status_indicator_green() throws Throwable {
		ScrolltoElement("Exam");
		softassert.assertTrue(PetCard._examGreenIndicator.isDisplayed());
		softassert.assertTrue(PetCard._examGreenIndicatorText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user is displayed with Exam accordion with Status indicator green in place of Comprehensive exam.");
	}
}
