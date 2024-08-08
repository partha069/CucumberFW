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
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.Pet_ChangeProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class ViewTimelineExoticsPetsSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public Pet_ChangeProfileScreen Pet_ChangeProfile = new Pet_ChangeProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);

	SoftAssert softassert = new SoftAssert();
	public String path1 = "./src/test/resources/TestData/Sprint3/Login_using_credentials3.csv";
	private static Logger logger = LogManager.getLogger(ViewTimelineExoticsPetsSteps.class);
	
	@When("^User logged in as Exotic Pet$")
	public void User_logged_in_as_Exotic_Pet() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, "test936@gmail.com");
		EnterInput(Login._PasswordTextfield, "Photon@123");
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("User logged in as Exotic Pet");
	}

	@Then("^the user should be able to view the no previous record as for exotics pets previous visit is not available$")
	public void user_should_be_able_to_view_the_no_previous_record_as_for_exotics_pets_previous_visit_is_not_available() {
		ScrolltoElement("Exotic");
		TapElement(Home._Exotic);
		logger.info("the user should be able to view the no previous record as for exotics pets previous visit is not available");
	}

	@And("^the user should be displayed with the$")
	public void the_user_should_be_displayed_with_the() {
		softassert.assertTrue(PetCard._previousVisit.isDisplayed());
		softassert.assertTrue(PetCard._NothingOnFileText.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the");
	}
	
	@And("^the user can tap on the camera icon$")
	public void the_user_can_tap_on_the_camera_icon() throws Throwable {
		Assert.assertTrue(PetCard._CameraIconTimeLine.isDisplayed());
		TapElement(PetCard._CameraIconTimeLine); 
		Assert.assertTrue(Pet_ChangeProfile._petNameTitle.isDisplayed());
		logger.info("the user can tap on the camera icon");
	}
	
	@And("^the user will tap on < button to go back to previous screen Home screen$")
	public void tap_on_back_button_to_go_back_to_previous_screen_Home_screen() throws Throwable {
		TapElement(PetCard._backCTATimeLine);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user will tap on < button to go back to previous screen Home screen");
	}
}
