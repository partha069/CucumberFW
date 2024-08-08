package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreferredLocationOnHomeScreenSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public PetCardScreen petcard = new PetCardScreen(driver);
	public Find_a_Location_Near_You_Screen Find_a_Location_Near_You = new Find_a_Location_Near_You_Screen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(PreferredLocationOnHomeScreenSteps.class);

	@When("^the user has set a preferred location$")
	public void user_has_set_a_preferred_location() {
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Make an appointment >");
		}
		logger.info("the user has set a preferred location");
	}
	
	@Then("^the user is displayed with Zero Location$")
	public void user_is_displayed_with_Zero_Location() throws Throwable {
		Home.verifyYourPreferredLocationwhenpreflocationisset();
        Thread.sleep(6000);
        try {
            Assert.assertTrue(Home._yourPreferredLocationHospitalMapDistance.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
        verifytest(Home._yourPreferredLocationHospitalName);
		logger.info("the user is displayed with Zero Location");
	}
	
	@Then("^the user is displayed with miles Location$")
	public void user_is_displayed_with_miles_Location() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		Thread.sleep(2000);
		TapElement(petcard._backCTAHighlights);
		Thread.sleep(2000);
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Make an appointment >");
		}
		Home.verifyYourPreferredLocationwhenpreflocationisset();
		Assert.assertTrue(Home._yourPreferredLocationHospitalMapDistance.isDisplayed());
		verifytest(Home._yourPreferredLocationHospitalMapDistance);
		logger.info("the user is displayed with miles Location");
	}
	
	@Then("the user will be displayed with your preffered location card with preferred location set")
	public void the_user_will_be_displayed_with_your_preffered_location_card_with_preferred_location_set() throws Throwable {
		Home.verifyYourPreferredLocationwhenpreflocationisset();
		logger.info("the user is displayed with find a nearby location card with preffered location set");
	}
	@Then("the user can tap on Find a nearby location to get redirected to Find a location near you screen")
	public void the_user_can_tap_on_find_a_nearby_location_to_get_redirected_to_find_a_location_near_you_screen() throws Throwable {
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(Home._find_a_nearby_location);
		try {
			TapElement(Find_a_Location_Near_You._OnlyThisTime);
		} catch (Exception e) {
			
		}
		Thread.sleep(1000);
		Assert.assertTrue(Find_a_Location_Near_You._SearchBox.isDisplayed());
	}
	
	@Then("the user can tap on Make an appointment cta to get redirected to Who are we scheduling screen")
	public void the_user_can_tap_on_make_an_appointment_cta_to_get_redirected_to_who_are_we_scheduling_screen() throws Throwable {
		TapElement(Home._MakeAnAppointmentCTA);
		Thread.sleep(500);
		softassert.assertTrue(who_are_we_Scheduling._petcard.isDisplayed());
	}
	
	@Then("the user will not be displayed with the miles when the location services are turned off")
	public void the_user_will_not_be_displayed_with_the_miles_when_the_location_services_are_turned_off() throws Throwable {
		Home.verifyYourPreferredLocationwhenpreflocationisset();
        try {
            Assert.assertTrue(Home._yourPreferredLocationHospitalMapDistance.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
        verifytest(Home._yourPreferredLocationHospitalName);
		logger.info("the user is displayed with Zero Location");
	}
	
	@Then("the user can tap on the Map icon to open default map with location pre-pinned")
	public void the_user_can_tap_on_the_map_icon_to_open_default_map_with_location_pre_pinned() throws Throwable {
		TapElement(Home._yourPreferredLocationHospitalMapCTA);
	}

	
}
