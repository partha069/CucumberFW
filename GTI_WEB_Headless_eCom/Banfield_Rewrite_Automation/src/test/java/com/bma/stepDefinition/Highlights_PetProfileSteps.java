package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
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

public class Highlights_PetProfileSteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_PetProfileSteps.class);
	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PaymentDetailsScreen PaymentDetails = new PaymentDetailsScreen(driver);

	@When("^the user tap on Pet profile accordion to expand$")
	public void the_user_tap_on_Pet_profile_accordion_to_expand() throws Throwable {
		Thread.sleep(7000);
		//ScrolltoElement("Kimberlee");
		TapElement(Home._pet0);
		Thread.sleep(3000);
		softassert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
		softassert.assertAll();
		Thread.sleep(7000);
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
			swipeDown();
		} else {
			ScrolltoElement("Pet profile");
		}
	    TapElement(PetCard._PetProfile);
		logger.info("the user tap on Pet profile accordion to expand");
	}
	
	@When("^User wants to tap on PetCart in Home Screen$")
	public void User_wants_to_tap_on_PetCart_in_Home_Screen() throws Throwable {
	//	Thread.sleep(11000);
		if (getUserDeviceInput.contains("IOS")) {
			ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@name='home/petlistview/pet0']"));
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(800);
		TapElement(Home._pet0);
		Thread.sleep(7000);
		logger.info("User wants to tap on PetCart in Home Screen");
	}
	
	@When("^User wants to see Owp Badge on Pet Image in Home Screen$")
	public void User_wants_to_see_Owp_Badge_on_Pet_Image_in_Home_Screen() throws Throwable {
		Thread.sleep(11000);
		if (getUserDeviceInput.contains("Android")) {
			Assert.assertTrue(Home._OWPBadge.isDisplayed());
		}
		TapElement(Home._pet0);
		Thread.sleep(7000);
		logger.info("User wants to see Owp Badge on Pet Image in Home Screen");
	}
	
	@And("^the user should display Pet profile tab$")
	public void the_user_should_display_Pet_profile_tab() throws Throwable {
		swipeDown();
		softassert.assertTrue(PetCard._PetProfile.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on Pet profile accordion to expand");
	}

	@Then("^the user should be able to view the following details:$")
	public void the_user_should_be_able_to_view_the_following_details() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			Assert.assertTrue(PetCard._PetProfile.isDisplayed());
		} else {
			PetCard.VerifypetprofileUI();
		}
		
		logger.info("the user should be able to view the following details");
	}

	@Then("^the user should be able to expand or collapse the details on tap$")
	public void the_user_should_be_able_to_expand_or_collapse_the_details_on_tap() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			Assert.assertTrue(PetCard._PetProfile.isDisplayed());
		} else {
			ScrolltoElement("Pet profile");
		}
		verifytest(PetCard._PetProfile);
		TapElement(PetCard._PetProfileAccordion);
		logger.info("the user should be able to expand or collapse the details on tap");
	}
}
