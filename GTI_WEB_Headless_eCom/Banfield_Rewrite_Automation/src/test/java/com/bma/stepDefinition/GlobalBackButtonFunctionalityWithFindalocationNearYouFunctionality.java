package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GlobalBackButtonFunctionalityWithFindalocationNearYouFunctionality extends Utilities {

	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(GlobalBackButtonFunctionalityWithFindalocationNearYouFunctionality.class);

	@And("^the user can tap on back button from Find a location near you screen to go back to the previous screen$")
	public void the_user_can_tap_on_back_button_from_Find_a_location_near_you_screen_to_go_back_to_the_previous_screen() throws Throwable {
		swipeDown1();
		TapElement(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(400);
		Assert.assertTrue(FindaLocationNearYou._findyourneighbourhoodlocationtext.isDisplayed());
		TapElement(FindaLocationNearYou._backCTA);
		Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		logger.info("the user can tap on back button from Find a location near you screen to go back to the previous screen");
	}

	@And("^the user can tap on the close icon to back to the initial screen where they started the flow$")
	public void the_user_can_tap_on_the_close_icon_to_back_to_the_initial_screen_where_they_started_the_flow() throws Throwable {
		TapElement(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
		TapElement(FindaLocationNearYou._cancelCTA);
		Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		verifytest(Reasonforvisit._NotSureCallaHospitalNearYouCTA);
		logger.info("the user can tap on the close icon to back to the initial screen where they started the flow");
	}
	
	@And("^the user can tap on back button from Find a location near you screen to go back to the previous screen from whats going on screen$")
	public void the_user_can_tap_on_back_button_from_Find_a_location_near_you_screen_to_go_back_to_the_previous_screen_from_whats_going_on_screen() throws Throwable {
		Thread.sleep(600);
	//	ScrolltoElement("Not sure? Call a hospital near you");
		swipeDown();
		TapElement(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(400);
		Assert.assertTrue(FindaLocationNearYou._findyourneighbourhoodlocationtext.isDisplayed());
		TapElement(FindaLocationNearYou._backCTA);
		Assert.assertTrue(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs.isDisplayed());
		logger.info("the user can tap on back button from Find a location near you screen to go back to the previous screen from whats going on screen");
	}

	@And("^the user can tap on the close icon to back to the initial screen where they started the flow from whats going on screen$")
	public void the_user_can_tap_on_the_close_icon_to_back_to_the_initial_screen_where_they_started_the_flow_from_whats_going_on_screen() throws Throwable {
		TapElement(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs);
		TapElement(FindaLocationNearYou._cancelCTA);
		Assert.assertTrue(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs.isDisplayed());
		verifytest(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs);
		logger.info("the user can tap on the close icon to back to the initial screen where they started the flow from whats going on screen");
	}
}
