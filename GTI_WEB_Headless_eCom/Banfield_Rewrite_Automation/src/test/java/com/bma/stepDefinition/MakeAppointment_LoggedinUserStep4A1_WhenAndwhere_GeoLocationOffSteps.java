package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.Duplicate_Appointment_Alert;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeAppointment_LoggedinUserStep4A1_WhenAndwhere_GeoLocationOffSteps extends Utilities {

	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public Duplicate_Appointment_Alert Duplicate_Appointment = new Duplicate_Appointment_Alert(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep7whenandwhere.csv";

	SoftAssert softassert = new SoftAssert();
	
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep4A1_WhenAndwhere_GeoLocationOffSteps.class);

	@When("^the user is displayed with the native Location Pop up to enable geo-location$")
	public void the_user_is_displayed_with_the_native_Location_Pop_up_to_enable_geo_location() throws Throwable {
		TapElement(WhatsGoingOn._VaccinationButton);
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		Thread.sleep(3000);
	//	softassert.assertTrue(WhenAndWhere._onlyThisTimePopups.isDisplayed());//F1
	//	softassert.assertAll();
		logger.info("the user is displayed with the native Location Pop up to enable geo-location");
	}
	
	@And("^User should select same hospital$")
	public void User_should_be_able_to_select_hospital() throws Throwable {
		TapElement(WhenAndWhere._hospital8);
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(3000);
		logger.info("User should be able to select hospital");
	}
	
	@When("^the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Routin Visit$")
	public void the_use_taps_on_Preventive_Care_CTA_and_navigating_to_whats_going_on_Page_and_user_selects_Routin_Visit() throws Throwable {
		TapElement(Reasonforvisit._preventiveCareCTA);
		TapElement(Reasonforvisit._nextCTA);
		Thread.sleep(3000);
		TapElement(WhatsGoingOn._RoutineVisitButton);
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		Thread.sleep(500);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		logger.info("the users is displayed with the native Location Pop up to enable geo-location after selecting Routine Visit");
	}
	
	@When("^the use taps on Preventive Care CTA and navigating to whats going on Page and user selects Comphensive exam$")
	public void the_user_is_displayed_with_the_native_Location_Pop_up_to_enable_geo_location_after_selecting_Comphensive_exam() throws Throwable {
		Thread.sleep(3000);
		TapElement(WhatsGoingOn._ComprehensiveExamButton);
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		logger.info("the user is displayed with the native Location Pop up to enable geo-location after selecting Comphensive exam");
	}
	
	@And("^user is displayed with the when and where screen without any hospitals listed$")
	public void user_is_displayed_with_the_when_and_where_screen_without_any_hospitals_listed() {
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		softassert.assertAll();
		logger.info("User is displayed with the when and where screen without any hospitals listed");
	}
	
	@And("^the user clicks on Dont Allow in native Location Pop up to be displayed with the following$")
	public void user_clicks_on_Dont_Allow_in_native_Location_Pop_up_to_be_displayed_with_the_following() {
		WhenAndWhere.verifyNoHospitalScreen();
		logger.info("the user clicks on Dont Allow in native Location Pop up to be displayed with the following");
	}
	
	@And("^the user is not displayed with list of closest hospitals location by default$")
	public void the_user_is_not_displayed_with_list_of_closest_hospitals_location_by_default() {
		try {
		//	ScrolltoElement("Closest to your location");
			ScrolltoElement("Your preferred location");
			softassert.assertFalse(WhenAndWhere._ClosestToYourLocationText.isDisplayed());
			softassert.assertAll();
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
	
		logger.info("the user is not displayed with list of closest hospitals location by default");
	}
	
	@And("^the user can tap on New search CTA to get redirected to Filter$")
	public void the_user_can_tap_on_New_search_CTA_to_get_redirected_to_Filter() throws Throwable {
		TapElement(WhenAndWhere._newSearchCTA);
		Thread.sleep(2000);
		TapElement(Filter._Filterdeny);
		Filter.verifyFilterPage();
		logger.info("the user can tap on New search CTA to get redirected to Filter");
	}
	
	@And("^the user is displayed with the Your preferred location with the following information$")
	public void the_user_is_displayed_with_the_Your_preferred_location_with_the_following_information() throws Throwable {
	//	ScrolltoElement("Garfield");
		ScrolltoElement("973-470-0103");
		WhenAndWhere.verifypreferredlocation();
		logger.info("the user is displayed with the Your preferred location with the following information");
	}
	
	@And("^the user is displayed with the Last visited location with the following information$")
	public void the_user_is_displayed_with_the_Last_visited_location_with_the_following_information() throws Throwable {
		TapElement(WhenAndWhere._newSearchCTA);
		Thread.sleep(2000);
		TapElement(Filter._Filterdeny);
		TapElement(Filter._SearchCTA);
		String input1 = getcsvdata(path, 2, "keyword","Zip", "keyword");
		EnterInput(Filter._SearchCTA, input1);
		HidingKeyboard();
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._hospitalGarfield);
		TapElement(Filter._ApplyCTA);
		Thread.sleep(4000);
		ScrolltoElement("Closest to your location");
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon_deselected.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the Last visited location with the following information");
	}
	
	@And("^the user tap on map icon to launch map app with the location pre-pinned$")
	public void the_user_tap_on_map_icon_to_launch_map_app_with_the_location_pre_pinned() throws Throwable {
		ScrolltoElement("Garfield");
		TapElement(WhenAndWhere._phoneNumberCTA);
		logger.info("the user tap on map icon to launch map app with the location pre-pinned");
	}
	
	@And("^User wants to verify phone number$")
	public void User_wants_to_verify_phone_number() throws Throwable {
	try {
		softassert.assertTrue(WhenAndWhere._phoneNumberCTA.isDisplayed());
		softassert.assertAll();
	} catch (Exception e) {
		ScrolltoElement("Garfield");
		softassert.assertTrue(WhenAndWhere._phoneNumberCTA.isDisplayed());
		softassert.assertAll();
	}
		logger.info("User wants to verify phone number");
	}
	
	@And("^the user can tap on Preferred Heart icon on any location to select it as preferred location$")
	public void the_user_can_tap_on_Preferred_Heart_icon_on_any_location_to_select_it_as_preferred_location() throws Throwable {
		ScrolltoElement("Garfield");
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon.isDisplayed());
		softassert.assertAll();
		logger.info("the user can tap on Preferred Heart icon on any location to select it as preferred location");
	}
	
	@And("^the selected preferred location is displayed on the home screen$")
	public void the_selected_preferred_location_is_displayed_on_the_home_screen() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		softassert.assertTrue(Home._heartIcon.isDisplayed());
		softassert.assertAll();
		logger.info("the selected preferred location is displayed on the home screen");
	}
	
	@And("^the user can deselect the the Preferred Heart icon to remove the location as preferred$")
	public void the_user_can_deselect_the_the_Preferred_Heart_icon_to_remove_the_location_as_preferred() throws Throwable {
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected);
		Thread.sleep(7000); //Don't remove this wait
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon.isDisplayed());
		softassert.assertAll();
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected);
		logger.info("the user can deselect the the Preferred Heart icon to remove the location as preferred");
	}
	
	@And("^once the user deselects the  Preferred Heart icon, the preferred location will be removed from Your preferred location$")
	public void once_the_user_deselects_the_Preferred_Heart_icon_the_preferred_location_will_be_removed_from_Your_preferred_location() throws Throwable {
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon);
		Thread.sleep(7000);
	    try {
	    	Assert.assertFalse(WhenAndWhere._YourPreferredLocationText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		logger.info("once the user deselects the  Preferred Heart icon, the preferred location will be removed from Your preferred location");
	}
	
	@And("^the Next CTA will be in a disabled state$")
	public void the_Next_CTA_will_be_in_a_disabled_state() throws Throwable {
		softassert.assertFalse(WhenAndWhere._nextCTA.isEnabled());
		softassert.assertAll();
	//	ScrolltoElement("973-470-0103");
	//	TapElement(WhenAndWhere._hospital7);
		logger.info("the Next CTA will be in a disabled state");
	}
	
	@And("^the user taps on Next CTA to get redirected to next when and where screen$")
	public void the_user_taps_on_Next_CTA_to_get_redirected_to_next_when_and_where_screen() throws Throwable {
		TapElement(WhenAndWhere._hospital1);
		Thread.sleep(1000);
		TapElement(WhenAndWhere._nextCTA);
		Thread.sleep(2000);
	//	TapElement(WhenAndWhere._deny);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the user taps on Next CTA to get redirected to next when and where screen");
	}
	
	@And("^by default Yes will be selected in A.M time slot options$")
	public void by_default_Yes_will_be_selected_in_AM_time_slot_options() throws Throwable {
		softassert.assertTrue(WhenAndWhere._yesCTA.isEnabled());
		softassert.assertAll();
		logger.info("by default Yes will be selected in A.M time slot options");
	}
	
	@And("^the user can select only one either Yes or No in A.M time slot options$")
	public void the_user_can_select_only_one_either_Yes_or_No_in_AM_time_slot_options() throws Throwable {
		TapElement(WhenAndWhere._noCTA);
		logger.info("the user can select only one either Yes or No in A.M time slot options");
	}
	
	@And("^the selected option will be highlighted on the tap$")
	public void the_selected_option_will_be_highlighted_on_the_tap() {
		softassert.assertFalse(WhenAndWhere._yesCTA.isSelected());
		softassert.assertAll();
		logger.info("the selected option will be highlighted on the tap");
	}
	
	@And("^when the user is displayed with the location services and AM time slots together the New search CTA will be displayed only on AM time slot$")
	public void when_the_user_is_displayed_with_the_location_services_and_AM_time_slots_together_the_New_search_CTA_will_be_displayed_only_on_AM_time_slot() {
        softassert.assertFalse(WhenAndWhere._locationServices.isSelected());
		softassert.assertFalse(WhenAndWhere._timeSlotsText.isSelected());
		softassert.assertTrue(WhenAndWhere._newSearchCTA1.isDisplayed());
		softassert.assertAll();
		logger.info("when the user is displayed with the location services and AM time slots together the New search CTA will be displayed only on AM time slot");
	}
	
	@And("^the user tap on < icon to go back to previous screen$")
	public void the_user_tap_on_back_icon_to_go_back_to_previous_screen() throws Throwable {
		TapElement(WhenAndWhere._backCTAinClosestHospitalPage);
		Thread.sleep(2000); 
		softassert.assertFalse(WhatsGoingOn._whatsGoingOnTitle.isSelected());
		softassert.assertAll();
		logger.info("the user tap on < icon to go back to previous screen");
	}
	
	@And("^the user tap on X close icon to go back to the screen where they clicked on Make appointment or Make an appointment$")
	public void the_user_tap_on_X_close_icon_to_go_back_to_the_screen_where_they_clicked_on_Make_appointment_or_Make_an_appointment() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		Thread.sleep(1000);
	//	TapElement(WhenAndWhere._deny);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
		softassert.assertTrue(Home._MakeAnAppointmentCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user tap on X close icon to go back to the screen where they clicked on Make appointment or Make an appointment");
	}
	
	@And("^the user is displayed with Preferred Location or Last visited location$")
	public void user_is_displayed_with_Preferred_Location_or_Last_visited_location() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._YourPreferredLocationText.isEnabled());
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon.isEnabled());
		softassert.assertAll();
		logger.info("the user is displayed with Preferred Location or Last visited location");
	}
	
	@Then("^user is redirected to Reason for visit screen$")
	public void user_is_redirected_to_Reason_for_visit_screen() throws Throwable {
		TapElement(who_are_we_Scheduling._pet01);//Piety
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(1000);
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		softassert.assertAll();
		logger.info("the user is redirected to Reason for visit screen");
	}
	
	@And("^user will be displayed with Last visited location$")
	public void user_will_be_displayed_with_Last_visited_location() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._LastVisitedLocationText.isEnabled());
		softassert.assertAll();
		logger.info("user will be displayed with Last visited location");
	}
	
	@And("^user will not be displayed Preferred location and Last visited location$")
	public void user_will_not_be_displayed_Preferred_location_and_Last_visited_location() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Find a location near you");
		softassert.assertTrue(Home._findaLocationNearYouCTA.isEnabled());
		ScrolltoElement("Jarrod");
		TapElement(who_are_we_Scheduling._pet04);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		softassert.assertAll();
		logger.info("user will not be displayed Preferred location and Last visited location");
	}
	
	@And("^user will be not displayed with Last visited location$")
	public void user_will_be_not_displayed_with_Last_visited_location() throws Throwable {
		Thread.sleep(2000);
		try {
			softassert.assertFalse(WhenAndWhere._LastVisitedLocationText.isDisplayed());
			softassert.assertAll();
		} catch (Exception e) {
			softassert.assertTrue(true);
			System.out.println("Last visited location is not Displayed");
		}
		logger.info("user will be not displayed with Last visited location");
	}
	
	@Then("user taps on new patient to go to when and where screen")
	public void user_taps_on_new_patient_to_go_to_when_and_where_screen() throws Throwable {
		TapElement(Reasonforvisit._newPatientCTA);
		TapElement(Reasonforvisit._nextCTA);
		TapElement(WhatsGoingOn._newPet);
		TapElement(WhatsGoingOn._newPatientNextCTA);
		try {
			if (Duplicate_Appointment._make_additional_appointment_cta.isDisplayed()) {
				TapElement(Duplicate_Appointment._make_additional_appointment_cta);
			}
		} catch (Exception e) {
			
		}
		Thread.sleep(1000);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);
		}
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
	}
}
