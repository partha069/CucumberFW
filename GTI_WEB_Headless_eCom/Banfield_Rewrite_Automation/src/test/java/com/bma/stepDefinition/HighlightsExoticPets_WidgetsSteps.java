package com.bma.stepDefinition;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

public class HighlightsExoticPets_WidgetsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	
	private static Logger logger = LogManager.getLogger(HighlightsExoticPets_WidgetsSteps.class);
	
	@When("^a user has opted for multiple VetChatGo plans$")
	public void a_user_has_opted_for_multiple_VetChatGo_plans() throws Throwable {
		ScrolltoElement("Active");
		Assert.assertTrue(Home._vetchatgoWiget1.isDisplayed());
		logger.info("a user has opted for multiple VetChatGo plans");
	}
	
	@And("^the pet will not be displayed with an OWP Payments details widget  if the user is on the Exotic Pet Highlights$")
	public void the_pet_will_not_be_displayed_with_an_OWP_Payments_details_widget_if_the_user_is_on_the_Exotic_Pet_Highlights() throws Throwable {
		ScrolltoElement("Basim");
		TapElement(Home._pet0);
		Thread.sleep(3000);
		try {
			Assert.assertFalse(PetCard._OwpText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Exotic pet will not be displayed with an OWP Payments details widget");
		}
		logger.info("the pet will not be displayed with an OWP Payments details widget  if the user is on the Exotic Pet Highlights");
	}
	
	@And("^the pet will not be displayed with Vet Chat component when the user is on Exotic pet Highlights$")
	public void the_pet_will_not_be_displayed_with_Vet_Chat_component_when_the_user_is_on_Exotic_pet_Highlights() {
		ScrolltoElement("Christie");
		TapElement(Home._pet0);
		try {
			Assert.assertFalse(PetCard._VetChatText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Exotic pet will not be displayed with Vet Chat component");
		}
		logger.info("the pet will not be displayed with Vet Chat component when the user is on Exotic pet Highlights");
	}
	
	@And("^the user will not be displayed with VetChatGo component when the user is on Exotic pet Highlights$")
	public void the_user_will_not_be_displayed_with_VetChatGo_component_when_the_user_is_on_Exotic_pet_Highlights() {
		try {
			Assert.assertFalse(PetCard._VetChatGoText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Exotic pet will not be displayed with VetChatGo component");
		}
		logger.info("the user will not be displayed with VetChatGo component when the user is on Exotic pet Highlights");
	}
}
