package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.VetChatScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Highlights_NWPPets_WidgetsSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);
	public VetChatScreen VetChat = new VetChatScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_NWPPets_WidgetsSteps.class);

	@When("^the NWP user is on the pet detail screen$")
	public void the_NWP_user_is_on_the_pet_detail_screen() throws Throwable {
		ScrolltoElement("Shun");
		TapElement(Home._pet1);
		logger.info("the NWP user is on the pet detail screen");
	}
	
	@Then("^they should not be displayed with the OWP Payments details widget below the Preventive Dashboard$")
	public void they_should_not_be_displayed_with_the_OWP_Payments_details_widget_below_the_Preventive_Dashboard() {
		ScrolltoElement("Pet profile");
		try {
			Assert.assertFalse(PetCard._OwpText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("should not be displayed with the OWP Payments details widget below the Preventive Dashboard");
		}
		logger.info("they should not be displayed with the OWP Payments details widget below the Preventive Dashboard");
	}
	
	@And("^the VetChat widget wont be displayed if the user has no OWP Plan for any of their pets in the clients account Dog or Cat$")
	public void the_VetChat_widget_wont_be_displayed() {
		try {
			Assert.assertFalse(PetCard._VetChatText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("VetChat widget wont be displayed if the user has no OWP Plan for any of their pets in the clients account Dog or Cat");
		}
		logger.info("the VetChat widget wont be displayed if the user has no OWP Plan for any of their pets in the clients account Dog or Cat");
	}
	
	@And("^the VetChatGo widget will be displayed for any dog or cat who have an Active VetChatGo plan$")
	public void the_VetChatGo_widget_will_be_displayed_for_any_dog_or_cat_who_have_an_Active_VetChatGo_plan() throws Throwable {
		ScrolltoElement("Your pets");
		Thread.sleep(1000);
		ScrolltoElement("Cat");  
		TapElement(Home._pet1);//Cat
		Thread.sleep(200);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._VetChatGoText.isDisplayed()); 
		TapElement(PetCard._backCTAHighlights);
		Thread.sleep(3000);
		ScrolltoElement("Bernardetta"); //Dog
		TapElement(Home._pet0);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._VetChatGoText.isDisplayed()); 
		TapElement(PetCard._backCTAHighlights);
		ScrolltoElement("Rabbit"); //Exotic Pet
		TapElement(Home._pet03);
		try {
			Assert.assertFalse(PetCard._VetChatGoText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("VetChatGo widget will be displayed for any dog or cat");
		}
		
		logger.info("the VetChatGo widget will be displayed for any dog or cat who have an Active VetChatGo plan");
	}
	
	@And("^for an NWP pet, If the user has a pet on the account enrolled in OWP, the NWP pet will be displayed with Vet Chat widget.$")
	public void for_an_NWP_pet_If_the_user_has_a_pet_on_the_account_enrolled_in_OWP_the_NWP_pet_will_be_displayed_with_Vet_Chat_widget() throws Throwable {
		ScrolltoElement("Dionte");
		TapElement(Home._pet07);
		Thread.sleep(3000);
		ScrolltoElement("Active");
		Thread.sleep(600);
		Assert.assertTrue(PetCard._OwpWigets.isDisplayed());
		Thread.sleep(200);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._ChatwithavetCTA.isDisplayed());
		logger.info("for an NWP pet, If the user has a pet on the account enrolled in OWP, the NWP pet will be displayed with Vet Chat widget.");
	}
	
	@When("^If the user has no active VetChatGo plans or no pet is enrolled in OWP the pet will not be displayed with any widgets below the preventive dashboard.$")
	public void If_the_user_has_no_active_VetChatGo_plans_or_no_pet_is_enrolled_in_OWP_the_pet_will_not_be_displayed_with_any_widgets_below_the_preventive_dashboard() {
		try {
			Assert.assertFalse(PetCard._VetChatGoWigets.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("VetChat widget wont be displayed if the user has no OWP Plan for any of their pets in the clients account Dog or Cat");
		}
		logger.info("If the user has no active VetChatGo plans or no pet is enrolled in OWP the pet will not be displayed with any widgets below the preventive dashboard.");
	}
	
	@And("^the user taps on Chat with a vet CTA on  Vet Chat widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK$")
	public void the_user_taps_on_Chat_with_a_vet_CTA_on_Vet_Chat_widget_to_launch_the_VetChat_and_land_on_Conversation_screen_directly_HELPSHIFT_SDK() throws Throwable {
		TapElement(PetCard._ChatwithavetCTA);
		Thread.sleep(1000);
		Assert.assertTrue(VetChat._Conversation.isDisplayed());
		logger.info("the user taps on Chat with a vet CTA on  Vet Chat widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK");
	}
	
	@And("^the user taps on Chat with a vet CTA on VetChatGo widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK$")
	public void the_user_taps_on_Chat_with_a_vet_CTA_on_VetChatGo_widget_to_launch_the_VetChat_and_land_on_Conversation_screen_directly_HELPSHIFT_SDK() throws Throwable {
		TapElement(PetCard._backCTAHighlights);
		Thread.sleep(6000);
	//	ScrolltoElement("Your pets");
	//	Thread.sleep(200);
		ScrolltoElement("Bernardetta");
		TapElement(Home._pet0);
		Thread.sleep(6000);
		ScrolltoElement("Chat with a vet");
		TapElement(PetCard._chatWithaVatCTA);
		Thread.sleep(1000);
		Assert.assertTrue(VetChat._Conversation.isDisplayed());
		logger.info("the user taps on Chat with a vet CTA on VetChatGo widget to launch the VetChat and land on Conversation screen directly HELPSHIFT SDK");
	}
}
