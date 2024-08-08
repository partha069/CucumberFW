package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.PetDetailsScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AccessCTAsonHomeScreenSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public PetDetailsScreen PetDetails = new PetDetailsScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	

	public String path1 = "./src/test/resources/TestData/Sprint3/Login_using_credentials3.csv";
	public String path2 = "./src/test/resources/TestData/Sprint3/Login_using_credentials9.csv";
	public String path3 = "./src/test/resources/TestData/Sprint3/Login_using_credentials4.csv";
	public String path4 = "./src/test/resources/TestData/Sprint3/Login_using_credentials.csv"; //automation@int.com,Banfield!123   OWP PET


	private static Logger logger = LogManager.getLogger(AccessCTAsonHomeScreenSteps.class);
	
	@When("^User navigated to Home Screen$")
	public void the_user_is_on_Home_screen() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path4,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path4,2,"password", "Email","password"));
		HidingKeyboardios();
		Thread.sleep(7000);
		TapElement(Login._LoginButton);
		Thread.sleep(5000);
		logger.info("the user is on Home screen");
	}
	@When("^User navigated to Home Screen for timeline makeappointment$")
	public void the_user_is_on_Home_screen_for_timeline_makeappointment() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, "manual@int.com");
		EnterInput(Login._PasswordTextfield, "Banfield!123");
		HidingKeyboardios();
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Thread.sleep(1000);
		logger.info("the user is on Home screen");
	}
	
	@When("^User wants to navigated to Home Screen$")
	public void the_user_wants_to_navigate_to_Home_screen() throws Throwable{
		EnterInput(Login._EmailTextField, getcsvdata(path4,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path4,2,"password", "Email","password"));
		Thread.sleep(5000);
		HidingKeyboardios();
		TapElement(Login._LoginButton);
		logger.info("User wants to navigated to Home Screen");
	}
	
	@When("^User is on Home Page$")
	public void user_is_on_the_Home_Pagee() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path3,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path3,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Thread.sleep(5000);
		logger.info("user is on the Home page");
	}
	
	@When("^the user is on Home page$")
	public void user_is_on_the_Home_page() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(2000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("user is on the Home page");
	}
	
	@When("^the user is on Home Screen$")
	public void user_is_on_the_Home_Screen2() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(2000);
		TapElement(Login._LoginButton);
		Thread.sleep(1000);
		logger.info("user is on the Home screen");
	}
	
	@And("^the user is displayed with the COVID19 Banner$")
	public void the_user_is_displayed_with_the_COVID19_Banner() {
		Assert.assertTrue(Home._seeFaqsAboutCovid19CTA.isDisplayed());
		logger.info("the user is displayed with the COVID-19 Banner");
	}
	
	@When("^user taps on See FAQs about COVID19 CTA$")
	public void user_taps_on_See_FAQs_about_COVID19_CTA() {
		verifytest(Home._seeFaqsAboutCovid19CTA);
		TapElement(Home._seeFaqsAboutCovid19CTA);
		logger.info("user taps on \"See FAQ's about COVID-19\" CTA");
	}
	
	@When("^the user taps on Pet Card$") 
	public void the_user_taps_on_Pet_Card() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Thread.sleep(8000);
	//	ScrolltoElement("Piety");
		try {
			TapElement(Home._pet1);
		} catch (Exception e) {
			TapElement(Home._pet26);
		}
		logger.info("the user taps on Pet Card");
	}
	
	@Then("^the user will be redirected to Pet details screen with Highlights and Timeline$")
	public void the_user_will_be_redirected_to_Pet_details_screen_with_Highlights_and_Timeline() {
		PetCard.VerifyPetCardScreen();
		logger.info("the user will be redirected to Pet details screen with Highlights and Timeline");
	}
	
	@And("^the user taps on Visit Details CTA Clock icon to get redirected to visit details screen for recent visit details$")
	public void the_user_taps_on_Visit_Details_CTA_Clock_icon_to_get_redirected_to_visit_details_screen_for_recent_visit_details() throws Throwable {
		TapElement(PetCard._timeline);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		TapElement(PetCard._ArrowCTA);
	    Thread.sleep(2000);
	    verifytest(PetDetails._petDetailsTitle);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user taps on Visit Details CTA Clock icon to get redirected to visit details screen for recent visit details");
	}
	
	@When("^the user taps on Add a new pet CTA$")
	public void the_user_taps_on_Add_a_new_pet_CTA() throws Throwable {
		Thread.sleep(1000);
	//	ScrolltoElement("Add a new pet");
		TapElement(Home._AddaNewPetCTA);
		logger.info("the user taps on +Add a new pet CTA");
	}
	
	@Then("^the user should be redirected to What species is your pet screen$")
	public void the_user_should_be_redirected_to_What_species_is_your_pet_screen() throws Throwable {
		Thread.sleep(1000);
		verifytest(WhatSpeciesIsYourPet._whatsspeciestitle);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatsspeciestitle.isDisplayed());
		logger.info("the user should be redirected to \"What species is your pet\" screen");
	}
	
	@Then("^the user should be able to view the Find a location near you CTA$")
	public void the_user_should_be_able_to_view_the_Find_a_location_near_you_CTA() throws Throwable {
	//	ScrolltoElement("Shop Banfield");
//       try {
//			swipeDown();
//		} catch (Exception e) {
//			ScrolltoElement("Find a location near you");
//		}
		swipeDown();
		Thread.sleep(3000);
		try {
			Assert.assertTrue(Home._findaLocationNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Home._find_a_nearby_location.isDisplayed()); 
		}
		logger.info("the user should be able to view the \"Find a location near you\" CTA");
	}

	@When("^the user has no preferred hospital location$")
	public void the_user_has_no_preferred_hospital_location() throws Throwable {
		Thread.sleep(1000);
		try {
			TapElement(Home._findaLocationNearYouCTA);
		} catch (Exception e) {
			TapElement(Home._find_a_nearby_location);
		}
		TapElement(WhenAndWhere._denyPopups);
		logger.info("the user has no preferred hospital location");
	}
	
	@And("^the user is redirected to the Find a location near you on tap$")
	public void the_user_is_redirected_to_the_Find_a_location_near_you_on_tap() throws Throwable {
		Thread.sleep(4000);
    	verifytest(FindaLocationNearYou._FindaLocationNearYouTitle);
		Assert.assertTrue(FindaLocationNearYou._FindaLocationNearYouTitle.isDisplayed());
		logger.info("the user is redirected to the \"Find a location near you\" on tap");
	}
	
	@When("^the user has a preferred hospital location$") 
	public void the_user_has_a_preferred_hospital_location() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Want to help?"); //API Late response
	//	try {
	//		swipeDown();
	//	} catch (Exception e) {
	//		ScrolltoElement("Make an appointment >");
	//	}
		swipeDown();
		Thread.sleep(4000);
		Assert.assertTrue(Home._yourPreferredLocationHospitalName.isDisplayed());
		logger.info("the user has a preferred hospital location");
	}
	
	@Then("^the user should be displayed with Hospital Name, Hospital Address, Map icon CTA, Call CTA$")
	public void the_user_should_be_displayed_with_Hospital_Name_Hospital_Address_Map_icon_CTA_Call_CTA() throws Throwable  {
		Thread.sleep(1000);
		verifytest(Home._yourPreferredLocationHospitalName);
		Home.verifyYourPreferredLocation();
		logger.info("the user should be displayed with Hospital Name, Hospital Address, Map icon CTA, Call CTA");
	}
	
	@And("^the user should tap on the call icon to launch the dialer with number pre-filled$")
	public void the_user_should_tap_on_the_call_icon_to_launch_the_dialer_with_number_pre_filled() throws Throwable {
	//	ScrolltoElement("Want to help?"); //steps due to api load time
		Thread.sleep(6000);
	//	try {
	//		swipeDown();
	//	} catch (Exception e) {
	//		ScrolltoElement("Make an appointment >");
	//	}
		swipeDown();
		Thread.sleep(400);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Assert.assertTrue(Home._yourPreferredLocationHospitaldialerCTA.isDisplayed());
		verifytest(Home._yourPreferredLocationHospitaldialerCTA);
		TapElement(Home._yourPreferredLocationHospitaldialerCTA);
		logger.info("the user should tap on the call icon to launch the dialer with number pre-filled");
	}
	
	@And("^the user should be able to see preferred location is set$")
	public void the_user_should_be_able_to_see_preferred_location_is_set() throws Throwable {
		Thread.sleep(6000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Make an appointment >");
		}
		Thread.sleep(400);
		Assert.assertTrue(Home._yourPreferredLocationHospitaldialerCTA.isDisplayed());
		logger.info("the user should be able to see preferred location is set");
	}
	
	@And("^the user should tap on the map icon to launch the maps app with location pre-pinned$")
	public void the_user_should_tap_on_the_map_icon_to_launch_the_maps_app_with_location_pre_pinned() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(Home._yourPreferredLocationHospitalMapCTA.isDisplayed());
		verifytest(Home._yourPreferredLocationHospitalMapCTA);
		TapElement(Home._yourPreferredLocationHospitalMapCTA);
		logger.info("the user should tap on the map icon to launch the maps app with location pre-pinned");
	}
	
	@When("^the user wants to make an appointment$")
	public void the_user_wants_to_make_an_appointment() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(Home._MakeAnAppointmentCTA.isDisplayed());
		logger.info("the user wants to make an appointment");
	}
	
	@When("^the user taps on Make an appointment CTA$")
	public void the_user_taps_on_Make_an_appointment_CTA() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		try {
//			swipeDown();
//		} catch (Exception e) {
//			ScrolltoElement("Make an appointment >");
//		}
		swipeDown();
		TapElement(Home._MakeAnAppointmentCTA);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		logger.info("the user taps on Make an appointment CTA");
	}
	
	@Then("^the user will be redirected to Tell us about your pet screen for logged in user flow$")
	public void the_user_will_be_redirected_to_Tell_us_about_your_pet_screen_for_logged_in_user_flow() throws Throwable {
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		verifytest(Tellusaboutyourpet._tellusaboutyourpetTitle);
		logger.info("the user will be redirected to \"Tell us about your pet\" screen for logged in user flow");
	}
	
	@When("^user taps on Shop Now CTA$")
	public void user_taps_on_Shop_Now_CTA() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Shop now");
		swipeDown();
		swipeDown();
		swipeDown();
		Thread.sleep(1000);
		verifytest(Home._shopBanfieldCTA);
		TapElement(Home._shopBanfieldCTA);
		logger.info("user taps on \"Shop Now\" CTA");
	}
	
	@When("^user taps on Donate CTA$")
	public void user_taps_on_Donate_CTA() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Want to help?");
	//	ScrolltoElement("Donate");
		swipeDown();
		swipeDown();
		swipeDown();
		swipeDown();
		Thread.sleep(1000);
		verifytest(Home._donateCTA);
		TapElement(Home._donateCTA);
		logger.info("user taps on \"Donate\" CTA");
	}
}
