package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class UpcomingAppointmentsRescheduleSteps extends Utilities {

	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(UpcomingAppointmentsRescheduleSteps.class);

	@Then("^the user taps on Reschedule CTA to get a pop-up message saying$")
	public void user_taps_on_Reschedule_CTA_to_get_a_pop_up_message_saying() throws Throwable {
		Thread.sleep(400);
		TapElement(UpcomingAppointments._RescheduleCTA);
		Thread.sleep(400);
		UpcomingAppointments.verifyReschedulePopups();
		logger.info("the user taps on Reschedule CTA to get a pop-up message saying");
	}
	
	@And("^the user tap on Close X icon from the pop-up to remain on the same screen Upcoming appointments$")
	public void tap_on_Close_X_icon_from_the_popup_to_remain_on_the_same_screen_Upcoming_appointments() throws Throwable {
		TapElement(UpcomingAppointments._Reschedule_Popup_CloseCTA);
		Thread.sleep(600);
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on Close X icon from the pop-up to remain on the same screen Upcoming appointments");
	}
	
	@And("^the user taps on Yes CTA to get redirected to Reason for visit$")
	public void user_taps_on_Yes_CTA_to_get_redirected_to_Reason_for_visit() throws Throwable {
		TapElement(UpcomingAppointments._Reschedule_Popup_YesCTA);
		Thread.sleep(2000);
	//	softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
	//	softassert.assertAll();
		logger.info("the user taps on Yes CTA to get redirected to Reason for visit");
	}
	
	@And("^the user tap on No CTA to get a popup message$")
	public void user_tap_on_No_CTA_to_get_a_popup_message_saying() throws Throwable {
		Thread.sleep(400);
		TapElement(UpcomingAppointments._Reschedule_Popup_NoCTA);
		Thread.sleep(400);
		softassert.assertTrue(UpcomingAppointments._Reschedule_NoProplem_CloseCTA.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._Reschedule_NoProplemText.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._Reschedule_NoProplem_StaticText.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on No CTA to get a popup message");
	}
	
	@And("^the user tap on No CTA to get a popup message when dont want to cancel appointments$")
	public void the_user_tap_on_No_CTA_to_get_a_popup_message_when_dont_want_to_cancel_appointments() throws Throwable {
		Thread.sleep(600);
		TapElement(UpcomingAppointments._Cancel_Popup_NoCTA);
		Thread.sleep(600);
		softassert.assertTrue(UpcomingAppointments._Cancel_NoProplem_CloseCTA.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._Cancel_NoProplemText.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._Cancel_NoProplem_StaticText.isDisplayed());
		softassert.assertAll();
		verifytest(UpcomingAppointments._Cancel_NoProplem_CloseCTA);
		logger.info("the user tap on No CTA to get a popup message when dont want to cancel appointments");
	}
	
	@And("^the user tap on Close X icon from the pop-up to remain on the same page Upcoming appointments$")
	public void Close_X_icon_from_the_pop_up_to_remain_on_the_same_page_Upcoming_appointments() throws Throwable {
		TapElement(UpcomingAppointments._Reschedule_NoProplem_CloseCTA);
		Thread.sleep(600);
		softassert.assertTrue(UpcomingAppointments._RescheduleCTA.isDisplayed());
		softassert.assertAll();
		verifytest(UpcomingAppointments._RescheduleCTA);
		logger.info("the user tap on Close X icon from the pop-up to remain on the same page Upcoming appointments");
	}
}
