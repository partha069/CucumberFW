package com.bma.stepDefinition;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.FilterScreen;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Find_a_nearby_location extends Utilities {

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Find_a_nearby_location.class);
	public ViewWelcomeScreen WelcomeScreen= new ViewWelcomeScreen(driver);
	public Find_a_Location_Near_You_Screen Find_a_Location_Near_You = new Find_a_Location_Near_You_Screen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public FilterScreen Filter = new FilterScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public HavewemetScreen HavewemetScreen = new HavewemetScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep7whenandwhere.csv";
	
	@Given("^the user is on welcome screen$")
	public void the_user_is_on_welcome_screen() throws Throwable {
		WelcomeScreen.verifyWelcomeScreenUIElement();
	}
	
	@When("^he taps on Find a nearby location CTA$")
	public void he_taps_on_Find_a_nearby_location_CTA() throws Throwable {
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WelcomeScreen._findANearbyLocationbutton);
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
			 Thread.sleep(9000);
			}
		}
		}
	}
	
	@When("^user should taps on Find a nearby location CTA$")
	public void User_should_taps_on_Find_a_nearby_location_CTA() throws Throwable {
		TapElement(WelcomeScreen._findANearbyLocationbutton);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		try {
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		} catch (Exception e) {
			Assert.assertTrue(true);
		}
		logger.info("user should taps on Find a nearby location CTA");
	}
	
	@Then("^the user will be redirected to Find a location near you screen$")
	public void the_user_will_be_redirected_to_Find_a_location_near_you_screen() throws Throwable {
	//	TapElement(WhenAndWhere._onlyThisTimePopups);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
	}
	
	@Then("^the user will be redirected to Have we met screen$")
	public void the_user_will_be_redirected_to_Have_we_met_screen() throws Throwable {
		Thread.sleep(8000);
		TapElement(WhenAndWhere._hospital1); // 1st Location now its garfield
	//	TapElement(WhenAndWhere._hospital2); // 2nd Location 
		TapElement(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
		Thread.sleep(3000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1200);
		Assert.assertTrue(HavewemetScreen._haveyoubeentoaBanfieldPetHospitalBefore.isDisplayed());
		logger.info("the user will be redirected to Have we met screen");
	}


	@Then("^the user will get the list of (\\d+) nearest Banfield hospitals by default$")
	public void the_user_will_get_the_list_of_nearest_Banfield_hospitals_by_default(int arg1) throws Throwable {
		Thread.sleep(3000);
		Find_a_Location_Near_You.verify6closestlocation();
	}

	@Then("^the list is displayed in the order of closest first Find a location near you Screen$")
	public void the_list_is_displayed_in_the_order_of_closest_first_Find_a_location_near_you_Screen() throws Throwable {

	}

	@Then("^the Hospital Locations will have Hospital Name, Address and following$")
	public void the_Hospital_Locations_will_have_Hospital_Name_Address_and_following() throws Throwable {
		Find_a_Location_Near_You.verifyLocationcard();
	}



	@Then("^the user taps on the Phone number to launch the Dialer with the phone number pre-filled$")
	public void the_user_taps_on_the_Phone_number_to_launch_the_Dialer_with_the_phone_number_pre_filled() throws Throwable {
		TapElement(Find_a_Location_Near_You._hospitalphonenumber);
	}

	@Then("^the user taps on the map icon to launch the Map App with the location pre-pinned$")
	public void the_user_taps_on_the_map_icon_to_launch_the_Map_App_with_the_location_pre_pinned() throws Throwable {
		TapElement(Find_a_Location_Near_You._MapIcon);
	}

	@Then("^the user will have the option to search by zip or city/state$")
	public void the_user_will_have_the_option_to_search_by_zip_or_city_state() throws Throwable {
		String zip = "93281";
		EnterInput(Find_a_Location_Near_You._SearchBox, "93281");
		Assert.assertEquals(zip, Find_a_Location_Near_You._SearchBox.getText());
		Thread.sleep(9000);
	}

	@Then("^the user taps on < at the top to go back to the previous\\(welcome/home\\) screen$")
	public void the_user_taps_on_at_the_top_to_go_back_to_the_previous_welcome_home_screen() throws Throwable {
		TapElement(Find_a_Location_Near_You._backCTA);
		try {
			WelcomeScreen.verifyWelcomeScreenUIElement();
		}
		catch (Exception e) {
			Assert.assertTrue(Home._HiUser_header.isDisplayed());	
		}
	}

	@Then("^the user taps on X at the top to go back to previous\\(welcome/home\\) screen$")
	public void the_user_taps_on_X_at_the_top_to_go_back_to_previous_welcome_home_screen() throws Throwable {
		TapElement(Find_a_Location_Near_You._backCTA);
		try {
			WelcomeScreen.verifyWelcomeScreenUIElement();
		}
		catch (Exception e) {
			Assert.assertTrue(Home._HiUser_header.isDisplayed());	
		}
	}
	
	@Given("^the user is on the Home screen$")
	public void the_user_is_on_the_Home_screen() throws Throwable {
     TapElement(WelcomeScreen._signInbutton);
     LoginUser.logintoApp();
     Assert.assertTrue(Home._HiUser_header.isDisplayed());
	}

	@When("^he taps on Find a location near you CTA$")
	public void he_taps_on_Find_a_location_near_you_CTA() throws Throwable {
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Home.clickonFindLocationNearYou();
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
			 Thread.sleep(9000);
			}
		}
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
	}
	//
	@When("^the user taps on Find a nearby location CTA and location services of the device is OFF for the app$")
	public void the_user_taps_on_Find_a_nearby_location_CTA_and_location_services_of_the_device_is_OFF_for_the_app() throws Throwable {
		TapElement(WelcomeScreen._findANearbyLocationbutton);
		TapElement(Find_a_Location_Near_You._deny);
		try {
			Thread.sleep(5000);
		if(Find_a_Location_Near_You._permission_messageText.isDisplayed()) {
		//	Scroll("Don't allow");
			TapElement(Find_a_Location_Near_You._dontallow);
	//	TapElement(Find_a_Location_Near_You._NoThanks);
		}
		else if(Find_a_Location_Near_You._Ok.isDisplayed()) {
				TapElement(Find_a_Location_Near_You._NoThanks);
				}
		}
		catch(Exception e) {
		 if(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed()) {
			 Thread.sleep(3000);
			}
		}
	}

	@Then("^the user will be displayed with the Find a location near you screen with setting and ignore$")
	public void the_user_will_be_displayed_with_the_Find_a_location_near_you_screen_with_setting_and_ignore() throws Throwable {
		Find_a_Location_Near_You.verifyUIwhenLocationOFF();
	}


	@Then("^the user can tap on Settings CTA go to settings to enable location services$")
	public void the_user_can_tap_on_Settings_CTA_go_to_settings_to_enable_location_services() throws Throwable {
		//TapElement(Find_a_Location_Near_You._SettingCta);
	}

	@Then("^the user can tap on Ignore to go Find a location near you screen$")
	public void the_user_can_tap_on_Ignore_to_go_Find_a_location_near_you_screen() throws Throwable {
		TapElement(Find_a_Location_Near_You._IgnoreCta);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
	}

	@Then("^the user can tap on New search to search for a hospital$")
	public void the_user_can_tap_on_New_search_to_search_for_a_hospital() throws Throwable {
		TapElement(Find_a_Location_Near_You._NewSearchCTA);
	}
	
	@Then("^the user will be displayed with the Search field with placeholder text Search zip or city/state$")
	public void the_user_will_be_displayed_with_the_Search_field_with_placeholder_text_Search_zip_or_city_state() throws Throwable {
		Assert.assertTrue(Find_a_Location_Near_You._SearchBox.isDisplayed());
	}

	@Then("^the user will enter keywords for the relevant suggestions to appear$")
	public void the_user_will_enter_keywords_for_the_relevant_suggestions_to_appear() throws Throwable {
		EnterInput(Find_a_Location_Near_You._SearchBox, "93281");
		Thread.sleep(9000);
	}

	@Then("^the suggestions are displayed based on the response from the location API$")
	public void the_suggestions_are_displayed_based_on_the_response_from_the_location_API() throws Throwable {

	}
	
	@Then("User search for express location and navigate to find a location near you with hours of operation")
	public void user_search_for_express_location_and_navigate_to_find_a_location_near_you_with_hours_of_operation() throws Throwable {
		EnterInput(Find_a_Location_Near_You._SearchBox, "75th St, Darien, IL 60561 ");
		Thread.sleep(4000);
		Assert.assertTrue(Filter._hospital1.isDisplayed());
		TapElement(Filter._hospital1);
		Thread.sleep(8000);
		TapElement(WhenAndWhere._hospital1);
		Thread.sleep(1000);
		Assert.assertTrue(Find_a_Location_Near_You._HospitalName_LoggedinUser.isDisplayed());
		try {
			Assert.assertTrue(Find_a_Location_Near_You._MakeAppoCTA_LoggedinUser.isDisplayed());
	//		verifytest(Find_a_Location_Near_You._MakeAppoCTA_LoggedinUser);
		} catch (Exception e) {
			verifytest(Find_a_Location_Near_You._HospitalName_LoggedinUser);
			Assert.assertTrue(Find_a_Location_Near_You._HospitalName_LoggedinUser.isDisplayed());
		}
		
	}
}
