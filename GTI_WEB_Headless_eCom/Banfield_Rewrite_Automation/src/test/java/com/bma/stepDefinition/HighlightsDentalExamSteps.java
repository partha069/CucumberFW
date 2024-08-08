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

public class HighlightsDentalExamSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public LegalStuffStepsScreen legal = new LegalStuffStepsScreen(driver);
	
	public String path1 = "./src/test/resources/TestData/Sprint5/Login_using_credentials12.csv";
	public String path2 = "./src/test/resources/TestData/Sprint5/Login_using_credentials13.csv";
	public String path3 = "./src/test/resources/TestData/Sprint5/Login_using_credentials14.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(HighlightsDentalExamSteps.class);
	
	
	@When("^User Logged in with OWP User Dental Up to date status$")
	public void User_Logged_in_with_OWP_User_Dental_Up_to_date_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Thread.sleep(3000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in with OWP User Dental Up to date status");
	}
	
	@When("^User Logged in with NWP User Dental Up to date status$")
	public void User_Logged_in_with_NWP_User_Dental_Up_to_date_status() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in with NWP User Dental Up to date status");
	}
	
	@When("^User Logged in with NWP User Dental$")
	public void User_Logged_in_with_NWP_User_Dental() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path3,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path3,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Logged in with NWP User Dental");
	}

	@When("^user is on the Highlights Tab$")
	public void user_is_on_the_Highlights_Tab() throws Throwable {
		Thread.sleep(7000);
		ScrolltoElement("Jisela");//updated
		TapElement(Home._pet14);
	//	ScrolltoElement("Kimberlee");
	//	TapElement(Home._pet01);
		Thread.sleep(1000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("user is on the Highlights Tab");
	}
	
	@When("^user is on the Highlights Tab screen$")
	public void user_is_on_the_Highlights_Tab_screen() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Miki");
		try {
			TapElement(Home._pet001);
		} catch (Exception e) {
			TapElement(Home._pet1);
		}
		Thread.sleep(1000);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("user is on the Highlights Tab");
	}
	
	@When("^they tap on the Dental exam accordion to expand$")
	public void they_tap_on_the_Dental_exam_accordion_to_expand() throws Throwable {
		Thread.sleep(4000);
		ScrolltoElement("Dental exam");
		TapElement(PetCard._dentalAccordionGray);
		logger.info("they tap on the Dental exam accordion to expand");
	}
	
	@When("^User tap on the Dental exam accordion to expand$")
	public void tap_on_the_Dental_exam_accordion_to_expand() throws Throwable {
		Thread.sleep(1000);
		ScrolltoElement("Dental exam");
		TapElement(PetCard._dentalGrayAccordion);
		ScrolltoElement("For the pet you love");
		softassert.assertTrue(PetCard._dentalForPetLoveText.isDisplayed());
	    softassert.assertAll();
		logger.info("User tap on the Dental exam accordion to expand");
	}
	
	@Then("^they will be displayed with the following information For OWP member$")
	public void they_will_be_displayed_with_the_following_information_For_OWP_member() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PetCard.verifyDentalExamGreenGray();
		ScrolltoElement("Manage plan");
		softassert.assertTrue(PetCard._dentalManagePlanCTA.isDisplayed());
	    softassert.assertAll();
		logger.info("they will be displayed with the following information For OWP member");
	}
	
	@And("^the user taps on Manage plan CTA to get redirected to URL in the browser in the logged in state$")
	public void the_user_taps_on_Manage_plan_CTA_to_get_redirected_to_URL_in_the_browser_in_the_logged_in_state() throws Throwable {
		TapElement(PetCard._dentalManagePlanCTA);	
	//	String url ="https://int.banfield.com/my-banfield/my-account";
	//	Thread.sleep(8000);
	//	TapElement(legal._defaultbrowser); 
	//	TapElement(legal._UrlEdit);
	//	TapElement(legal._UrlField);
	//	Assert.assertEquals(url,legal._UrlField.getText());
		logger.info("the user taps on Manage plan CTA to get redirected to URL in the browser in the logged in state");
	}
	
	@And("^the user will be displayed with the following information For NWP member$")
	public void the_user_will_be_displayed_with_the_following_information_For_NWP_member() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Miki");
		TapElement(Home._pet001);
		ScrolltoElement("Dental exam");
		TapElement(PetCard._dentalAccordionGray);
		ScrolltoElement("For the pet you love");
		PetCard.verifyDentalExamGreenGray();
		softassert.assertTrue(PetCard._dentalEnrollNowCTA.isDisplayed());
	    softassert.assertAll();
		logger.info("the user will be displayed with the following information For NWP member");
	}
	
	@And("^the user taps on Enroll now CTA to get redirected to URL in the browser$")
	public void the_user_taps_on_Enroll_now_CTA_to_get_redirected_to_URL_in_the_browser() {
		TapElement(PetCard._dentalEnrollNowCTA);
		logger.info("the user taps on Enroll now CTA to get redirected to URL in the browser");
	}
	
	@And("^the user can expand/collapse the accordion on tap$")
	public void the_user_can_expand_collapse_the_accordion_on_tap() throws Throwable {
		TapElement(PetCard._dentalGrayAccordion);
		try {
			Assert.assertFalse(PetCard._dentalForPetLoveText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		logger.info("the user collapsed the accordion on tap");
	}
	
	@And("^for an OWP user, with status indicator as gray the accordion will expand on tap and the user will be displayed with Manage plan promo with Text: For the pet you love and the Next exam due will not be displayed.$")
	public void for_an_OWP_user_with_status_indicator_as_gray_the_accordion_will_expand_on_tap_and_the_user_will_be_displayed_with_Manage_plan_promo_with_Text() throws Throwable {
	//	TapElement(PetCard._backCTAHighlights);
	//	ScrolltoElement("Jack");
	//	TapElement(Home._pet21);
	//	Thread.sleep(1000);
	//	ScrolltoElement("Dental exam");
		TapElement(PetCard._dentalGrayAccordion);
		ScrolltoElement("For the pet you love");
		try {
			Assert.assertFalse(PetCard._dentalDate.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		logger.info("for an OWP user, with status indicator as gray the "
				+ "accordion will expand on tap and the user will be displayed with "
				+ "Manage plan promo with Text: For the pet you love and the Next exam due will not be displayed.");
	}
	
	@And("^for a NWP user, with status indicator as gray nothing on file the accordion will expand and the "
			+ "user will be displayed with 'Enroll now' promo and 'Next exam due' will not be displayed.$")
	public void for_a_NWP_user_with_status_indicator_as_gray_nothing_on_file_the_accordion_will_expand() throws Throwable {
		Thread.sleep(6000);
	//	ScrolltoElement("Burfi");
	//	TapElement(Home._pet08);
		ScrolltoElement("Dental exam");
		Assert.assertTrue(PetCard._dentalIndicatorTextGray.isDisplayed());
		TapElement(PetCard._dentalAccordionGray);
		ScrolltoElement("Enroll now");
		Assert.assertTrue(PetCard._dentalEnrollNowCTA.isDisplayed());
		/*
		try {
			Assert.assertTrue(PetCard._dentalDate.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		*/
		logger.info("for a NWP user, with status indicator as gray nothing on file the accordion will expand and the user "
				+ "will be displayed with 'Enroll now' promo and 'Next exam due' will not be displayed.");
	}
	
	@And("^for a NWP user new pet, with status indicator as gray nothing on file and no visit history, the accordion will expand and the user is displayed with Enroll now promo and Next exam due will not be displayed.$")
	public void for_a_NWP_user_new_pet_with_status_indicator_as_gray_nothing_on_file_and_no_visit_history() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Theresa A.");
	//	TapElement(Home._pet10);
		ScrolltoElement("Dental exam");
		Assert.assertTrue(PetCard._dentalIndicatorTextGray.isDisplayed());
		TapElement(PetCard._dentalAccordionGray);
		Thread.sleep(1000);
	//	ScrolltoElement("Pet profile");
	//	ScrolltoElement("For the pet you love");
		ScrolltoElement("Enroll now");
		Assert.assertTrue(PetCard._dentalEnrollNowCTA.isDisplayed());
		/*
		try {
			Assert.assertTrue(PetCard._dentalDate.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		*/
		logger.info("for a NWP user new pet, with status indicator as gray nothing on file and no visit history, the accordion will expand and the user is displayed with Enroll now promo and Next exam due will not be displayed.");
	}
}
