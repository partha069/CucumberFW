package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.ChatScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccessLiveChatSteps extends Utilities {

	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ChatScreen Chat = new ChatScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AccessLiveChatSteps.class);

	@And("^they tap on  Chat from the bottom navigation$")
	public void they_tap_on_Chat_from_the_bottom_navigation() {
		TapElement(BottomNavigation._chatCTA);
		ScrolltoElement("Chat live now");
		Assert.assertTrue(Chat._ChatTitle.isDisplayed());
		logger.info("they tap on  Chat from the bottom navigation");
	}
	
	@And("^Used should able to tap on Make Appointment CTA from Chat$")
	public void Used_should_able_to_tap_on_Make_Appointment_CTA_from_Chat() {
		TapElement(BottomNavigation._chatCTA);
		ScrolltoElement("Make an appointment");
		Assert.assertTrue(Chat._MakeaAppointmentCTA.isDisplayed());
		TapElement(Chat._MakeaAppointmentCTA);
		logger.info("Used should able to tap on Make Appointment CTA from Chat");
	}

	@When("^they are displayed with the chat options$")
	public void they_are_displayed_with_the_chat_options() {
		ScrolltoElement("Chat live now");
		
		logger.info("they are displayed with the chat options");
	}
	
	@Then("^they are displayed with Live chat option on screen$")
	public void they_are_displayed_with_Live_chat_option_on_screen() throws Throwable {
		Chat.verifyLiveChat();
		logger.info("they are displayed with Live chat option on screen");
	}

	@And("^they tap on Chat live now CTA to initiate the live chat to get redirected to load URL on browser$")
	public void they_tap_on_Chat_live_now_CTA_to_initiate_the_live_chat_to_get_redirected_to_load_URL_on_browser() throws Throwable {	
		verifytest(Chat._LiveChatCTA);
		TapElement(Chat._LiveChatCTA);
		logger.info("they tap on Chat live now CTA to initiate the live chat to get redirected to load URL on browser");
	}
}
