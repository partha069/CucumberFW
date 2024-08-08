package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedinUserStep4A2_WhenandWhere_GeoLocationOnSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep4A2_WhenandWhere_GeoLocationOnSteps.class);

	@And("^the user clicks on Allow in native Location Pop up to be displayed with the following$")
	public void the_user_clicks_on_Allow_in_native_Location_Pop_up_to_be_displayed_with_the_following() throws Throwable {
		WhenAndWhere.verifypreferredlocationGEOLocOn();
		Thread.sleep(1000);
		ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(WhenAndWhere._hospital3.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital4.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital5.isDisplayed());
		ScrolltoElement("Carlstadt");
		softassert.assertTrue(WhenAndWhere._hospital1.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital2.isDisplayed());
		softassert.assertAll();
		logger.info("the user clicks on Allow in native Location Pop up to be displayed with the following");
	}
	
	@And("^the user is displayed with the A.M time slot if Vaccination or Routine visit has been selected in the previous steps$")
	public void the_user_is_displayed_with_the_AM_time_slot_if_Vaccination_or_Routine_visit_has_been_selected_in_the_previous_steps() throws Throwable {
		TapElement(WhenAndWhere._backCTAinClosestHospitalPage);
		TapElement(WhatsGoingOn._RoutineVisitButton);
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		Thread.sleep(2000);
		//need if
		softassert.assertTrue(WhenAndWhere._timeSlotsText.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the A.M time slot if Vaccination or Routine visit has been selected in the previous steps");
	}
	
	@And("^the user can tap on New search CTA to get redirected to Filter screen$")
	public void the_user_can_tap_on_New_search_CTA_to_get_redirected_to_Filter_screen() throws Throwable {
		TapElement(WhenAndWhere._newSearchCTA);
		Thread.sleep(2000);
		Filter.verifyFilterPage();
		logger.info("the user can tap on New search CTA to get redirected to Filter screen");
	}
	
	@And("^the user is displayed first with the Your preferred location or Last visited location and then Closest to your location$")
	public void displayed_first_with_the_Your_preferred_location_then_Closest_to_your_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._YourPreferredLocationText.isDisplayed());
		ScrolltoElement("Closest to your location");
		softassert.assertTrue(WhenAndWhere._ClosestToYourLocationText.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed first with the Your preferred location or Last visited location and then Closest to your location");
	}
	
	@And("^the list of six nearest Banfield hospitals is displayed with preferred Heart icon is deselected$")
	public void six_nearest_Banfield_hospitals_is_displayed_with_preferred_Heart_icon_is_deselected() throws Throwable {
		WhenAndWhere.verifyHeartIconDeselected();
		logger.info("the list of six nearest Banfield hospitals is displayed with preferred Heart icon is deselected");
	}
	
	@And("^the map icon will be displayed with miles closest to users location on Your preferred location and Closest to your location$")
	public void map_icon_will_be_displayed_with_miles_closest_to_users_location_on_Your_preferred_location_and_Closest_to_your_location() throws Throwable {
		
		logger.info("the map icon will be displayed with miles closest to users location on Your preferred location and Closest to your location");
	}
	
	@And("^the user tap on X close icon to go back to the screen where they clicked on Make appointment CTA$")
	public void the_user_tap_on_X_close_icon_to_go_back_to_the_screen_where_they_clicked_on_Make_appointment_CTA() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		Thread.sleep(1000);
		softassert.assertFalse(Home._HiUser_header.isSelected());
		softassert.assertAll();
		logger.info("the user tap on X close icon to go back to the screen where they clicked on Make appointment CTA");
	}
	
	@And("^the selecting the preferred Heart icon will change the color to red$")
	public void the_selecting_the_preferred_Heart_icon_will_change_the_color_to_red() throws Throwable {
		ScrolltoElement("Garfield");
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon.isDisplayed());
		softassert.assertAll();
		logger.info("the selecting the preferred Heart icon will change the color to red");
	}
	
	@And("^the user can select only one preferred location$")
	public void the_user_can_select_only_one_preferred_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._YourPreferredLocationText.isDisplayed());
		softassert.assertAll();
		logger.info("the user can select only one preferred location");
	}
	
	@And("^User tap on preferred hospital location$")
	public void User_tap_on_preferred_hospital_location() throws Throwable {
		TapElement(WhenAndWhere._hospital7);
		softassert.assertTrue(WhenAndWhere._YourPreferredLocationText.isEnabled());
		softassert.assertAll();
		logger.info("User tap on preferred hospital location");
	}
	
	@And("^the user is displayed with the Your preferred location with the following informations$")
	public void the_user_is_displayed_with_the_Your_preferred_location_with_the_following_informations() throws Throwable {
		ScrolltoElement("Your preferred location");
		WhenAndWhere.verifypreferredlocation();
		logger.info("the user is displayed with the Your preferred location with the following informations");
	}
}
