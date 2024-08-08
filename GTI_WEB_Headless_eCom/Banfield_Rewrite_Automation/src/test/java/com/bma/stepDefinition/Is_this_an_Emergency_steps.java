package com.bma.stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.Duplicate_Appointment_Alert;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.UpcomingAppointmentsScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Is_this_an_Emergency_steps extends Utilities {

	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	SoftAssert softassert = new SoftAssert();
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public UpcomingAppointmentsScreen UpcomingAppointments = new UpcomingAppointmentsScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public LetsgetstartedSteps Letsgetstarted = new LetsgetstartedSteps(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocation = new Find_a_Location_Near_You_Screen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	private static Logger logger = LogManager.getLogger(Is_this_an_Emergency_steps.class);
	

	@Then("User should be displayed with Is this an Emergency popup and click on continue cta to proceed")
	public void user_should_be_displayed_with_is_this_an_emergency_popup_and_click_on_continue_cta_to_proceed() {
		try {
			Is_this_an_Emergency_screen.verifyis_this_an_emergency_popup();
			Assert.assertTrue(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta.isDisplayed());
			TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		} catch (Exception e) {
			System.out.println("Emergency popup not displayed for 2nd time");
		}
		
	}
	@Then("User is redirected to have we met screen after clicking on continue")
	public void user_is_redirected_to_have_we_met_screen_after_clicking_on_continue() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(havewemet._noIHaveButton.isDisplayed());
	}

	@Then("the user will click on make appointment cta to get redirected to Is this an Emergency popup")
	public void the_user_will_click_on_make_appointment_cta_to_get_redirected_to_is_this_an_emergency_popup() throws Throwable {
		Thread.sleep(8000);
		TapElement(WhenAndWhere._hospital1);
		TapElement(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
	}
	
	@When("User navigating to Is this an Emergency popup from home screen after clicking on make an appointment cta")
	public void user_navigating_to_is_this_an_emergency_popup_from_home_screen_after_clicking_on_make_an_appointment_cta() throws Throwable {
		Thread.sleep(8000);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				swipeDown();
			} else {
				ScrolltoElement("Make an appointment >");
			}
			TapElement(Home._MakeAnAppointmentCTA);
			
		} catch (Exception e) {
			if (getUserDeviceInput.contains("IOS")) {
				swipeDown();
			} else {
				ScrolltoElement("Find a location near you");
			}
			TapElement(Home._findaLocationNearYouCTA);
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			TapElement(WhenAndWhere._onlyThisTimePopups);
			Thread.sleep(4000);
			TapElement(WhenAndWhere._hospital1);
			Assert.assertTrue(FindaLocation._MakeAppoCTA_LoggedinUser.isDisplayed());
			TapElement(FindaLocation._MakeAppoCTA_LoggedinUser);
			TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
			
		}
	}
	@When("User is redirected to who are we scheduling screen after clicking on continue")
	public void user_is_redirected_to_who_are_we_scheduling_screen_after_clicking_on_continue() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
	}
	
	@Then("the user should be redirected to Upcoming appointments screen and click on make an appointment cta")
	public void the_user_should_be_redirected_to_upcoming_appointments_screen_and_click_on_make_an_appointment_cta() throws Throwable {
		Thread.sleep(1000);
		TapElement(BottomNavigation._appointments);
		try {
			if (getUserDeviceInput.contains("IOS")) {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='schedule/slotavailability/next']"));	
			}else {
				ExplicitWaitToVisibleElement(By.xpath("//XCUIElementTypeButton[@resource-id='MySchedules/screen/makeanappointment-btn']"));
			}
		} catch (Exception e) {
			
		}
		if (getUserDeviceInput.contains("Android")) {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);	
		}
    //  Thread.sleep(50000);
		try {
			if (UpcomingAppointments._UpcomingAppointmentsCTA1.isDisplayed()) {
			  TapElement(UpcomingAppointments._UpcomingAppointmentsCTA1);      
			}
		} catch (Exception e) {
		  TapElement(UpcomingAppointments._UpcomingAppointmentsCTA);
		}
	}
	
	@When("User wants to take on Make an Appointment CTA from highlights screen")
	public void user_wants_to_take_on_make_an_appointment_cta_from_highlights_screen() throws Throwable {
		Thread.sleep(1000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
	}
	@Then("User is redirected to Reason for visit screen after clicking on continue")
	public void user_is_redirected_to_reason_for_visit_screen_after_clicking_on_continue() {
		Assert.assertTrue(Reasonforvisit._illness.isDisplayed());
	}
	
	@When("User wants to take on Make an Appointment CTA from Timeline screen")
	public void user_wants_to_take_on_make_an_appointment_cta_from_timeline_screen() throws Throwable {
		TapElement(PetCard._timeline);
		Thread.sleep(8000);
		TapElement(PetCard._makeAnAppointmentCTATimeLine);
	}
	
	@When("user is able to tap on find a location near you and navigate to click on make appointment cta")
	public void user_is_able_to_tap_on_find_a_location_near_you_and_navigate_to_click_on_make_appointment_cta() throws Throwable {
		Thread.sleep(8000);
		if (getUserDeviceInput.contains("IOS")) {
		swipeDown();
		}else {
		ScrolltoElement("Find a location near you");
		}
		TapElement(Home._findaLocationNearYouCTA);
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		} catch (Exception e) {
			Assert.assertTrue(true);

		}
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(4000);
		TapElement(WhenAndWhere._hospital1);
		TapElement(FindaLocation._MakeAppoCTA_LoggedinUser);
		Thread.sleep(1000);
	}
}
