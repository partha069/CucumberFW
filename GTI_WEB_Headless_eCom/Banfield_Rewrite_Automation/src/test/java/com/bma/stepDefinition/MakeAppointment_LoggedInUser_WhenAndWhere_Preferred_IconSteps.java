package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;

public class MakeAppointment_LoggedInUser_WhenAndWhere_Preferred_IconSteps extends Utilities {

	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep7whenandwhere.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedInUser_WhenAndWhere_Preferred_IconSteps.class);

	@Then("^user clicks on Dont Allow in the enable location popup$")
	public void user_clicks_on_Dont_Allow_in_the_enable_location_popup() throws Throwable {
		Thread.sleep(2000);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._denyPopups);
		logger.info("the user clicks on Don�t Allow in the enable location pop-up");
	}
	
	@Then("^the user is displayed with the Closest to your location$")
	public void user_is_displayed_with_the_Closest_to_your_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isEnabled());
		ScrolltoElement("Closest to your location");
		softassert.assertTrue(WhenAndWhere._ClosestToYourLocationText.isDisplayed());
		softassert.assertAll(); 
		logger.info("the user is displayed with the Closest to your location");
	}
	
	@And("^by default the preferred icon will not be selected$")
	public void by_default_the_preferred_icon_will_not_be_selected() throws Throwable {
		ScrolltoElement("Carlstadt");
		softassert.assertFalse(WhenAndWhere._PreferredHospital_HeartIcon_deselected.isSelected());
		softassert.assertAll(); 
		logger.info("by default the preferred icon will not be selected");
	}
	
	@And("^the user can select the preferred icon$")
	public void the_user_can_select_the_preferred_icon() throws Throwable {
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected);
		Thread.sleep(8000);
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon_deselected.isEnabled());
		softassert.assertAll(); 
		logger.info("the user can select the preferred icon");
	}
	
	@And("^once selected user cannot deselect the preferred icon$")
	public void once_selected_user_cannot_deselect_the_preferred_icon() throws Throwable {
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected);
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon_deselected.isEnabled());
		softassert.assertAll(); 
		logger.info("once selected user cannot deselect the preferred icon");
	}
	
	@And("^the user can select any other location as preferred location$")
	public void the_user_can_select_any_other_location_as_preferred_location() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Garfield");
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected4);
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon_deselected4.isEnabled());
		softassert.assertAll();
		Thread.sleep(8000);
		logger.info("the user can select any other location as preferred location");
	}
	
	@And("^user can select only one preferred location$")
	public void user_can_select_only_one_preferred_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isEnabled());
		ScrolltoElement("Carlstadt");
		softassert.assertFalse(WhenAndWhere._PreferredHospital_HeartIcon_deselected.isSelected());
		softassert.assertAll(); 
		Thread.sleep(8000);
		logger.info("user can select only one preferred location");
	}
	
	@And("^the selected preferred location will be added on the home screen instantly but not as a preferred card on top$")
	public void selected_preferred_location_will_be_added_on_the_home_screen_instantly_but_not_as_a_preferred_card_on_top() throws Throwable {
		TapElement(WhenAndWhere._CancelCTA);
		Thread.sleep(3000);
		softassert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
		softassert.assertAll(); 
		logger.info("the selected preferred location will be added on the home screen instantly but not as a preferred card on top");
	}
	
	@And("^the user is displayed with the preferred location and closest to your location$")
	public void the_user_is_displayed_with_the_preferred_location_and_closest_to_your_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isEnabled());
		softassert.assertTrue(WhenAndWhere._hospital8.isDisplayed());
		ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(WhenAndWhere._hospital2.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital3.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital4.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital5.isDisplayed());
		ScrolltoElement("Garfield");
		softassert.assertTrue(WhenAndWhere._hospital1.isDisplayed());
		logger.info("the selected preferred location will be added on the home screen instantly but not as a preferred card on top");
	}
	
	@And("^the user has selected a new location from the suggestion list$")
	public void user_has_selected_a_new_location_from_the_suggestion_list() throws Throwable {
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
	//	ScrolltoElement("Carlstadt");
		logger.info("the user has selected a new location from the suggestion list");
	}
	
	@And("^the user is displayed with the six closest location$")
	public void user_is_displayed_with_the_six_closest_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isEnabled());
		softassert.assertTrue(WhenAndWhere._hospital8.isDisplayed());
		ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(WhenAndWhere._hospital2.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital3.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital4.isDisplayed());
		softassert.assertTrue(WhenAndWhere._hospital5.isDisplayed());
		ScrolltoElement("Garfield");
		softassert.assertTrue(WhenAndWhere._hospital1.isDisplayed());
		logger.info("the selected preferred location will be added on the home screen instantly but not as a preferred card on top");
	}
	
	@And("^the user is displayed with the preferred location$")
	public void the_user_is_displayed_with_the_preferred_location() throws Throwable {
		softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon.isEnabled());//F
		softassert.assertAll(); 
		logger.info("the user is displayed with the preferred location");
	}
	
	@Then("^Verify user is able to view Preferred icon$")
	public void user_is_able_to_view_Preferred_icon() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(WhenAndWhere._whenAndWhereTitle.isEnabled());
		ScrolltoElement("Garfield");
		TapElement(WhenAndWhere._PreferredHospital_HeartIcon_deselected4);
	    softassert.assertTrue(WhenAndWhere._PreferredHospital_HeartIcon_deselected4.isEnabled());
	    softassert.assertAll();
		Thread.sleep(5000);
		logger.info("Verify user is able to view Preferred icon");
	}
	
	@When("^User landed to the who are we scheduling page$")
	public void User_navigating_to_who_are_we_scheduling_page() throws Throwable {
		Thread.sleep(8000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		softassert.assertTrue(who_are_we_Scheduling._who_are_we_SchedulingTitle.isDisplayed());
		softassert.assertAll();
		logger.info("User landed to the who are we scheduling page");
	}
}
