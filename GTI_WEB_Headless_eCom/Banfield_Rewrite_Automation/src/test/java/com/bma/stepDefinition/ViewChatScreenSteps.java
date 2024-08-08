package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.ChatScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class ViewChatScreenSteps extends Utilities {

	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ChatScreen Chat = new ChatScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow whoareweScheduling = new com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewChatScreenSteps.class);

	@Then("^the user should be redirected to Chat and more screen$")
	public void the_user_should_be_redirected_to_Chat_and_more_screen() {
		TapElement(BottomNavigation._chatCTA);
		Assert.assertTrue(Chat._ChatTitle.isDisplayed());
		logger.info("the user should be redirected to Chat and more screen");
	}
	
	@And("^the user should be displayed with the Vet Chat$")
	public void user_should_be_displayed_with_the_Vet_Chat() {
		Chat.verifyVetChat();
		Chat.verifyLiveChat();
		ScrolltoElement("Make an appointment");
		Chat.verifyNeedtoVisit();
		logger.info("the user should be displayed with the Vet Chat");
	}
	
	@And("^the user should be displayed with the  Optimum Wellness Plans$")
	public void user_should_be_displayed_with_the_Optimum_Wellness_Plans() {
		verifytest(Chat._OwpText);
		Chat.verifyOWP();
		Chat.verifyLiveChat();
	//	ScrolltoElement("Make an appointment");
		Chat.verifyNeedtoVisit();
		logger.info("user should be displayed with the Optimum Wellness Plans");
	}
	
	@And("^the user should be displayed with the following VetChatGo$")
	public void user_should_be_displayed_with_the_following_VetChatGo() {
		Chat.verifyVetChatGo();
		Chat.verifyLiveChat();
		ScrolltoElement("Make an appointment");
		Chat.verifyNeedtoVisit();
		logger.info("the user should be displayed with the following VetChatGo");
	}
	
	@And("^the user taps on Start enrollment now to get redirected to wellnessplans rnroll website$")
	public void Start_enrollment_now_to_get_redirected_to_wellnessplans_rnroll_website() {
		TapElement(Chat._StartEnrollmentNowCTA);
		logger.info("the user taps on Start enrollment now to get redirected to wellnessplans rnroll website");
	}
	
	@And("^if any of the one pet has valid OWP then Vet Chat widget is displayed to the user Dogs and Cat$")
	public void one_pet_has_valid_OWP_then_Vet_Chat_widget_is_displayed_to_the_user_Dogs_and_Cat() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(Chat._VetChatLogo.isDisplayed());//F
		logger.info("if any of the one pet has valid OWP then Vet Chat widget is displayed to the user Dogs and Cat");
	}
	
	@And("^the user taps on Make an appointment CTA to get redirected to Who are we scheduling$")
	public void user_taps_on_Make_an_appointment_CTA_to_get_redirected_to_Who_are_we_scheduling() throws Throwable {
		softassert.assertTrue(Chat._MakeaAppointmentCTA.isDisplayed());
		TapElement(Chat._MakeaAppointmentCTA);
		Thread.sleep(1000);
		softassert.assertTrue(whoareweScheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user taps on Make an appointment CTA to get redirected to Who are we scheduling");
	}
	
	@And("^the user is displayed with OWP widget if they only have exotics pets$")
	public void user_is_displayed_with_OWP_widget_if_they_only_have_exotics_pets() {
		softassert.assertTrue(Chat._OwpText.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with OWP widget if they only have exotics pets");
	}
	
	
	@Then("the user should be displayed with the following VetChatGo screen")
	public void the_user_should_be_displayed_with_the_following_vet_chat_go_screen() {
		Chat.verifyVetChatGo();
	}
	
	@Then("if any of the one pet has valid OWP then Vet Chat widget in chat and more screen is displayed to the user Dogs and Cat")
	public void if_any_of_the_one_pet_has_valid_owp_then_vet_chat_widget_in_chat_and_more_screen_is_displayed_to_the_user_dogs_and_cat() {
		Chat.verifyVetChat();
	}
	@Then("the user click on chat with a vet to get redirected to vetchat screen for owp user")
	public void the_user_click_on_chat_with_a_vet_to_get_redirected_to_vetchat_screen_for_owp_user() {
		verifytest(Chat._VetChatCTA);
		Chat.chatwithvetforvetchat();
	}
	
	@Then("the user click on chat with a vet to get redirected to vetchatgo screen")
	public void the_user_click_on_chat_with_a_vet_to_get_redirected_to_vetchatgo_screen() throws Throwable {
		verifytest(Chat._ChatwithavetCta);
		Thread.sleep(1000);
		Chat.chatwithvetforvetchatgo();
	}
}
