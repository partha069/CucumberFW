package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class UpcomingAppointmentsCancelSteps extends Utilities {

	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(UpcomingAppointmentsCancelSteps.class);

	@Then("^the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying$")
	public void tap_on_Cancel_CTA_on_Upcoming_appointments_screen_to_get_a_popup_message_saying() throws Throwable {
		Thread.sleep(1000);
		TapElement(UpcomingAppointments._CancelCTA);
		Thread.sleep(600);
		UpcomingAppointments.verifyCancelPopups();
		logger.info("the user tap on Cancel CTA on Upcoming appointments screen to get a pop-up message saying");
	}

	@And("^the user tap on X icon to remain on the same page Upcoming appointments$")
	public void user_tap_on_X_icon_to_remain_on_the_same_page_Upcoming_appointments() {
		TapElement(UpcomingAppointments._Cancel_Popup_CloseCTA);
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on X icon to remain on the same page Upcoming appointments");
	}
	
	@And("^the user tap on No CTA to get a pop-up message saying$")
	public void user_tap_on_No_CTA_to_get_a_popup_message_saying() throws Throwable {
		TapElement(UpcomingAppointments._Cancel_Popup_NoCTA);
		Thread.sleep(2000);
		softassert.assertTrue(UpcomingAppointments._Cancel_NoProplemText.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._Cancel_NoProplem_StaticText.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on No CTA to get a pop-up message saying");
	}

	@And("^the user taps on Close X icon to dismiss the pop-up$")
	public void user_taps_on_Close_X_icon_to_dismiss_the_popup() throws Throwable {	
		Thread.sleep(3000);
		TapElement(UpcomingAppointments._Cancel_NoProplem_CloseCTA);
		logger.info("the user taps on Close X icon to dismiss the pop-up");
	}
	
	@And("^the user tap on Yes CTA to get a pop-up message saying$")
	public void user_tap_on_Yes_CTA_to_get_a_popup_message_saying() throws Throwable {	
		TapElement(UpcomingAppointments._Cancel_Popup_YesCTA);
		UpcomingAppointments.verifiedYesSecrren();
		logger.info("the user tap on Yes CTA to get a pop-up message saying");
	}
	
	@And("^the user tap on Close X icon to dismiss the pop-up without canceling the appointment$")
	public void tap_on_Close_X_icon_to_dismiss_the_popup_without_canceling_the_appointment() throws Throwable {	
		TapElement(UpcomingAppointments._Cancel_Yes_Popup_CloseCTA);
		Thread.sleep(2000);
		softassert.assertTrue(UpcomingAppointments._UpcomingAppointmentsTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on Close X icon to dismiss the pop-up without canceling the appointment");
	}
	
	@And("^the user tap on Yes CTA to get redirected to Reason for visit screen$")
	public void user_tap_on_Yes_CTA_to_get_redirected_to_Reason_for_visit_screen() throws Throwable {	
		TapElement(UpcomingAppointments._Cancel_Yes_Popup_NoCTA);
		Thread.sleep(2000); 
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on Yes CTA to get redirected to Reason for visit screen");
	}
	
	@And("^the user tap on No CTA to get a pop message saying$")
	public void user_tap_on_No_CTA_to_get_a_pop_message_saying() throws Throwable {	
		TapElement(UpcomingAppointments._Cancel_Yes_Popup_NoCTA);
		Thread.sleep(7000);
		softassert.assertTrue(UpcomingAppointments._CancelAppointment_Title.isDisplayed());
		softassert.assertTrue(UpcomingAppointments._CancelAppointment_StaticText.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on No CTA to get a pop message saying");
	}
	
	@And("^the user can tap on Cancel to get redirected to the Cancel appointment flow$")
	public void the_user_can_tap_on_Cancel_to_get_redirected_to_the_Cancel_appointment_flow() throws Throwable {	
		TapElement(UpcomingAppointments._Cancel_Popup_YesCTA);
		logger.info("the user can tap on Cancel to get redirected to the Cancel appointment flow");
	}
	
	@And("^the user taps on the Close X icon to close pop-up and stay on the same screen$")
	public void user_taps_on_the_Close_X_icon_to_close_popup_and_stay_on_the_same_screen() throws Throwable {	
		Thread.sleep(600);
		TapElement(UpcomingAppointments._CancelAppointment_CloseCTA);
	//	Thread.sleep(50000);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='schedule/slotavailability/next']"));	// If there is app
			}else {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='MySchedules/screen/makeanappointment-btn']")); // If no app
			}
		} catch (Exception e) {
			
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		try {
			verifytest(UpcomingAppointments._UpcomingAppointmentsPetName);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsPetName.isDisplayed());
		} catch (Exception e) {
			verifytest(UpcomingAppointments._UpcomingAppointmentsStaticTask);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsStaticTask.isDisplayed());	
		}
	//	Thread.sleep(14000);
	//	try {
	//		verifytest(UpcomingAppointments._UpcomingAppointmentsDate);
	//		Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA1.isDisplayed());
	//	} catch (Exception e) {
	//		verifytest(UpcomingAppointments._UpcomingAppointmentsStaticTask);
	//		Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
		logger.info("the user taps on the Close X icon to close pop-up and stay on the same screen");
	}
	
	@And("^Cancel users all appointments as a logged in user$")
	public void cancele_all_users_appointments_as_a_logged_in_user() throws Throwable {
		try {
			if (UpcomingAppointments._dateAndTimeText.isDisplayed()) {
				int i = 1;
				while(i<=30) {
					Assert.assertTrue(UpcomingAppointments._dateAndTimeText.isDisplayed());
					Assert.assertTrue(UpcomingAppointments._caretCTA.isDisplayed());
					TapElement(UpcomingAppointments._caretCTA);
			        Thread.sleep(4000);
			        swipeDown();
			        Thread.sleep(1000);
					TapElement(UpcomingAppointments._CancelCTA);
					Thread.sleep(600);
					UpcomingAppointments.verifyCancelPopups();
					TapElement(UpcomingAppointments._Cancel_Popup_YesCTA);
					Thread.sleep(600);
					TapElement(UpcomingAppointments._CancelAppointment_CloseCTA);
					System.out.println("Cancelled " + i + " Appointment");
					if (getUserDeviceInput.contains("IOS")) {
						ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeStaticText[@name='viewappointments/0/clock-img-appointmentdate-text']"));
					}
					driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			//	    Thread.sleep(50000);
				    Assert.assertTrue(UpcomingAppointments._dateAndTimeText.isDisplayed());
					i++;
				}
			} else {
				System.out.println("No Appointment are Available for Now");
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			Thread.sleep(1000);
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsStaticTask.isDisplayed());
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
			System.out.println("All Appointment Are Cancelled Successfully");
		}
		logger.info("Cancele all users appointments as a logged in user");
	}
}
