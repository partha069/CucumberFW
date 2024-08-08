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
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewHighlightsExoticPetsSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint5/Login_using_credentials10.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewHighlightsExoticPetsSteps.class);
	
	@When("^user is logged into the app as Exotic Pet$")
	public void user_is_logged_into_the_app_as_Exotic_Pet() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("user is logged into the app as Exotic Pet");
	}

	@And("^the pet user is on the pet detail screen$")
	public void the_OWP_pet_user_is_on_the_pet_detail_screen() throws Throwable {
		Thread.sleep(4000);
		ScrolltoElement("Darci");
		TapElement(Home._pet1);
		Thread.sleep(3000);
		Assert.assertTrue(PetCard._Name.isDisplayed()); 
		logger.info("the OWP pet user is on the pet detail screen");
	}
	
	@Then("^the user should be displayed with the following sections as accordions Pet Profile$")
	public void the_user_should_be_displayed_with_the_following_sections_as_accordions_Pet_Profile() {
		Assert.assertTrue(PetCard._PetProfile.isDisplayed());
		Assert.assertTrue(PetCard._PetProfileAccordion.isDisplayed());
		logger.info("the user should be displayed with the following sections as accordions Pet Profile");
	}
	
	@And("^user is displayed with a static text Not all locations can handle exotics. You will need to call the hospital to schedule an appointment$")
	public void user_is_displayed_with_a_static_text() {
		Assert.assertTrue(PetCard._exoticPetStaticText.isDisplayed());
		logger.info("user is displayed with a static text");
	}

}
