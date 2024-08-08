package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.ChatScreen;
import com.bma.pageObject.EverythingLookOkayScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.YouareAllSetScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class NoUpcomingAppointmentsSteps extends Utilities {

	
	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	
	public who_are_we_Scheduling_makeappointment_Login_Flow whoAreWeScheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(NoUpcomingAppointmentsSteps.class);

	@And("^user should be redirected to Upcoming appointments screen$")
	public void the_user_should_be_redirected_to_Upcoming_appointments_screen() throws Throwable {
		TapElement(BottomNavigation._appointments);
		Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		logger.info("the user should be redirected to Upcoming appointments screen");
	}

	@And("^the user should be displayed with the static text No upcoming appointments$")
	public void the_user_should_be_displayed_with_the_static_text_No_upcoming_appointments() {
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsStaticTask.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the static text No upcoming appointments");
	}
	
	@Then("^the user should be displayed with the Make an appointment CTA$")
	public void the_user_should_be_displayed_with_the_Make_an_appointment_CTA() throws Throwable {
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user should be displayed with the Make an appointment CTA");
	}
    
	@And("^the user taps on Make an appointment CTA to get redirected to Who are we scheduling for logged in scheduler$")
	public void the_user_taps_on_Make_an_appointment_CTA_to_get_redirected_to_Who_are_we_scheduling_for_logged_in_scheduler() throws Throwable {	
		TapElement(UpcomingAppointments._UpcomingAppointmentsCTA);
		softassert.assertTrue(whoAreWeScheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the browser loads the Mars website with the following URL Mars");
	}
}
