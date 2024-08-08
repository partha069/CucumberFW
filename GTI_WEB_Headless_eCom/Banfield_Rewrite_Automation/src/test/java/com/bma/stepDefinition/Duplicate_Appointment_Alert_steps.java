package com.bma.stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.Duplicate_Appointment_Alert;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.YouareAllSetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Duplicate_Appointment_Alert_steps extends Utilities {

	public Duplicate_Appointment_Alert Duplicate_Appointment = new Duplicate_Appointment_Alert(driver);
	SoftAssert softassert = new SoftAssert();
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public LetsgetstartedSteps Letsgetstarted = new LetsgetstartedSteps(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public YouareAllSetScreen YouareAllSet = new YouareAllSetScreen(driver);
	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	private static Logger logger = LogManager.getLogger(Duplicate_Appointment_Alert_steps.class);

	
	/*
	 * methods for guest user duplicate appointment
	 * 
	 */
	@Then("User is on reason for visit screen, user select new patient and click on next to navigate to duplicate popup")
	public void user_is_on_reason_for_visit_screen_user_select_new_patient_and_click_on_next_to_navigate_to_duplicate_popup() throws Throwable {
		Thread.sleep(3000);
		TapElement(Reasonforvisit._newPatient);
		TapElement(Reasonforvisit._nextCTA);
		TapElement(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
//		Thread.sleep(800);
//		TapElement(WhenAndWhere._onlyThisTimePopups);
//		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
	}
	@Then("Verify the Duplicate Popup and click on make additional appointment to get redirected to when and where screen")
	public void verify_the_duplicate_popup_and_click_on_make_additional_appointment_to_get_redirected_to_when_and_where_screen() throws Throwable {
		try {
			if (Duplicate_Appointment._duplicate_popup_titletext.isDisplayed()) {
				Duplicate_Appointment.verifyduplicatepopup();
				TapElement(Duplicate_Appointment._make_additional_appointment_cta);
				Thread.sleep(800);
				TapElement(WhenAndWhere._onlyThisTimePopups);
				Duplicate_Appointment.verifyduplicatepopup();
				TapElement(Duplicate_Appointment._make_additional_appointment_cta);
				Thread.sleep(800);
				TapElement(WhenAndWhere._onlyThisTimePopups);
			}
		} catch (Exception e) {
			System.out.println("Duplicate Alert Not Displayed");
		}
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		
	}
	
	@When("User should able to redirect to duplicate popup before getting when and where screen")
	public void user_should_able_to_redirect_to_duplicate_popup_before_getting_when_and_where_screen() {
		Assert.assertTrue(WhatsGoingOn._Lameness.isEnabled());
		TapElement(WhatsGoingOn._nextCTA);
	}
	@Then("Verify the Duplicate Popup and click on cancel cta to get redirected to Lets get started screen in prefilled information")
	public void verify_the_duplicate_popup_and_click_on_cancel_cta_to_get_redirected_to_lets_get_started_screen_in_prefilled_information() throws Throwable {
		Duplicate_Appointment.verifyduplicatepopup();
		verifytest(Duplicate_Appointment._cancelcta);
		TapElement(Duplicate_Appointment._cancelcta);
		Thread.sleep(800);
		Assert.assertTrue(Letsgetstarted._phone.isDisplayed());
	}
	
	@When("the user taps on the Next CTA to get the duplicate popup after selecting visit type")
	public void the_user_taps_on_the_next_cta_to_get_the_duplicate_popup_after_selecting_visit_type() {
		TapElement(WhatsGoingOn._UrinaryIssues);
		TapElement(WhatsGoingOn._nextCTA);
	}
	
	
	/*
	 * methods for loggedin user duplicate appointment
	 * 
	 */
	@Then("User is displayed with duplicate popup and click on make additional appointment to navigate to when and where screen")
	public void user_is_displayed_with_duplicate_popup_and_click_on_make_additional_appointment_to_navigate_to_when_and_where_screen() {
		Duplicate_Appointment.verifyduplicatepopupforloogedinuser();
		TapElement(Duplicate_Appointment._make_additional_appointment_cta_loggedinuser);
	}
	
	@Then("the user is redirected to Youre all set screen for duplicate popup")
	public void the_user_is_redirected_to_youre_all_set_screen_for_duplicate_popup() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				TapElement(YouareAllSet._ratingsPopups);
			}
		} catch (Exception e) {	
			Assert.assertTrue(true);
		}
		Thread.sleep(4000);
		Assert.assertTrue(YouareAllSet._petNameText.isDisplayed());
		TapElement(YouareAllSet._doneCTA);
		Thread.sleep(7000);
		logger.info("the user is redirected to Youre all set screen");
	}
		@Then("User is displayed with duplicate popup and click on edit existing appointment to navigate to upcoming appointment screen")
	public void user_is_displayed_with_duplicate_popup_and_click_on_edit_existing_appointment_to_navigate_to_upcoming_appointment_screen() throws Throwable {
		Duplicate_Appointment.verifyduplicatepopupforloogedinuser();
		verifytest(Duplicate_Appointment._duplicate_popup_titletext_loggedinuser);
		TapElement(Duplicate_Appointment._edit_existing_appointment_cta_loggedinuser);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='schedule/slotavailability/next']"));	
			}else {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='MySchedules/screen/makeanappointment-btn']"));
			}
		} catch (Exception e) {
			assertTrue(true);
		}
    //  Thread.sleep(50000);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		try {
			if (UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed()) {
				Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA.isDisplayed());
			}
		} catch (Exception e) {
			Assert.assertTrue(UpcomingAppointments._UpcomingAppointmentsCTA1.isDisplayed());
		}
	}
	
	@Then("user avoid duplicate popup if displayed")
	public void user_avoid_duplicate_popup_if_displayed() throws Throwable   {
		try {
			if (Duplicate_Appointment._duplicate_popup_titletext_loggedinuser.isDisplayed()) {
				TapElement(Duplicate_Appointment._make_additional_appointment_cta_loggedinuser);
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("Duplicate Appointment did not displayed");
		}
	}

}
