package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ModelpopupScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.View_Details_of_Banfield_Location;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class View_details_ofthe_Banfield_Location extends Utilities {
	SoftAssert softassert= new SoftAssert();
	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public Find_a_Location_Near_You_Screen Find_a_Location_Near_You = new Find_a_Location_Near_You_Screen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public View_Details_of_Banfield_Location View_Details_of_Banfield = new View_Details_of_Banfield_Location(driver);
	public HavewemetScreen Havewemet = new HavewemetScreen(driver);
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public ModelpopupScreen Modelpopup = new ModelpopupScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	
	@Given("^user is on the Find a location near you screen$")
	public void user_is_on_the_Find_a_location_near_you_screen() throws Throwable {
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(ViewWelcomeScreen._findANearbyLocationbutton);
		if(getUserDeviceInput.contains("IOS")) {
			TapElement(WhenAndWhere._onlyThisTimePopups);	
			Thread.sleep(9000);
		}else {
		try {
		if(Find_a_Location_Near_You._permission_messageText.isDisplayed()) {
		TapElement(Find_a_Location_Near_You._OnlyThisTime);
		TapElement(Find_a_Location_Near_You._Ok);
		}
		else if(Find_a_Location_Near_You._Ok.isDisplayed()) {
				TapElement(Find_a_Location_Near_You._Ok);
				}
		}
		catch(Exception e) {
		 if(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed()) {
			
			}
		}
		}
		logger.info("user is on the Find a location near you screen");
	}
	
	@Then("user click on location popup")
	public void user_click_on_location_popup() {
	//	if(Modelpopup._NoIamNewText.isDisplayed()) {
	//		TapElement(Modelpopup._nearestBanfield);
	//	TapElement(WhenAndWhere._onlyThisTimePopups);}
		try {
			TapElement(Modelpopup._nearestBanfield);
		} catch (Exception e) {
			tapOnNearestBanfieldCTA();
		}
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
	}

	@Given("^they have the list of locations in the screen$")
	public void they_have_the_list_of_locations_in_the_screen() throws Throwable {
		 Thread.sleep(6000);
	//	 Find_a_Location_Near_You.verify6closestlocation();
		 softassert.assertTrue(Find_a_Location_Near_You._LocationCard1.isDisplayed());
		 softassert.assertAll();
		 logger.info("they have the list of locations in the screen");
	}

	@When("^they tap on a location name/address$")
	public void they_tap_on_a_location_name_address() throws Throwable {
		Thread.sleep(6000);
	//	TapElement(Find_a_Location_Near_You._LocationCard1);
		TapElement(Find_a_Location_Near_You._LocationCard2); // its Garfield now
		logger.info("they tap on a location name/address");
	}
	
	@Then("^they should be redirected to the selected locations detail Find a location near you screen$")
	public void they_should_be_redirected_to_the_selected_locations_detail_Find_a_location_near_you_screen() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(View_Details_of_Banfield._HospitalName.isDisplayed());
		logger.info("they should be redirected to the selected locations detail Find a location near you screen");
	}

	@Then("^the screen should display the following information$")
	public void the_screen_should_display_the_following_information() throws Throwable {
		View_Details_of_Banfield.verifyView_Details_of_Banfield_LocationUI();
		logger.info("the screen should display the following information");
	}

	@Then("^the hours of operation should be displayed based on the response from hospital system$")
	public void the_hours_of_operation_should_be_displayed_based_on_the_response_from_hospital_system() throws Throwable {
		View_Details_of_Banfield.verifyHoursofoperation();
		logger.info("the hours of operation should be displayed based on the response from hospital system");
	}

	@Then("^the user taps on the Phone number to launch the Dialer with the phone number pre-filled from location card$")
	public void the_user_taps_on_the_Phone_number_to_launch_the_Dialer_with_the_phone_number_pre_filled_from_location_card() throws Throwable {
		TapElement(View_Details_of_Banfield._phonenumber);
		logger.info("the user taps on the Phone number to launch the Dialer with the phone number pre-filled from location card");
	}

	@Then("^the user taps on the map icon to launch the Map App with the location pre-pinned from location card$")
	public void the_user_taps_on_the_map_icon_to_launch_the_Map_App_with_the_location_pre_pinned_from_location_card() throws Throwable {
		TapElement(View_Details_of_Banfield._mapIcon);
		logger.info("the user taps on the Hospital address to launch the Map App with the location pre-pinned from location card");
	}

	@Then("^the user taps on the Make appointment CTA to get redirected to the Make appointment flow$")
	public void the_user_taps_on_the_Make_appointment_CTA_to_get_redirected_to_the_Make_appointment_flow() throws Throwable {
		TapElement(View_Details_of_Banfield._MakeAppointmentCTA);
		Thread.sleep(4000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		Assert.assertTrue(Havewemet._haveyoubeentoaBanfieldPetHospitalBefore.isDisplayed());
		logger.info("the user taps on the Make appointment CTA to get redirected to the Make appointment flow");
	}
	
	@Then("^the user taps on the Make appointment CTA$")
	public void the_user_taps_on_the_Make_appointment_CTA() throws Throwable {
		Assert.assertTrue(View_Details_of_Banfield._MakeAppointmentCTA.isDisplayed());
		TapElement(View_Details_of_Banfield._MakeAppointmentCTA);
		Thread.sleep(2000);
		logger.info("the user taps on the Make appointment CTA to get redirected to the Make appointment flow");
	}
	
}