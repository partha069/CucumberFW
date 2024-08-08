package com.bma.stepDefinition;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.DisplaySplashScreen;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewHomeScreenSteps extends Utilities {

	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Find_a_Location_Near_You_Screen FindaLocationNearYou = new Find_a_Location_Near_You_Screen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow WhoAreWeScheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	public String path1 = "./src/test/resources/TestData/Sprint3/Login_using_credentials3.csv"; //parthadey@photon.in,Banfield@123
	public String path3 = "./src/test/resources/TestData/Sprint5/Login_using_credentials11.csv";

	private static Logger logger = LogManager.getLogger(ViewHomeScreenSteps.class);

	@When("^user tapped on the Login CTA from the login screen and the user credentials are valid$")
	public void user_tapped_on_the_Login_CTA_from_the_login_screen() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1, 2, "Email", "Email", "password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1, 2, "password", "Email", "password"));
		HidingKeyboardios();
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Thread.sleep(5000);
		logger.info("user tapped on the Login CTA from the login screen");
	}
	
	@When("^User login as Multi VetChatGo Plan$")
	public void User_login_as_Multi_VetChatGo_Plan() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path3, 2, "Email", "Email", "password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path3, 2, "password", "Email", "password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("User login as Multi VetChatGo Plan");
	}
	
	@And("^user wants to navigate to Reason for visit and tap on New Patient$")
	public void user_wants_to_navigate_to_Reason_for_visit_and_tap_on_New_Patient() throws Throwable {
		Thread.sleep(4000);
		TapElement(Home._pet0);
		logger.info("user wants to navigate to Reason for visit and tap on New Patient");
	}

	@Then("^the user should be redirected to home screen$")
	public void the_user_should_be_redirected_to_home_screen() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
		softassert.assertAll();
		Thread.sleep(8000);
		logger.info("the user should be redirected to home screen");
	}
	
	@And("^User wants to verify Changes - See FAQs about COVID-19 , Add TradeMark in Shop now after Banfield, Add TradeMark in Donate after Banfield Foundation$")
    public void User_wants_to_verify_changes() throws Throwable {
	Thread.sleep(8000);
//	Assert.assertTrue(Home._seeFaqsAboutCovid19Text.isDisplayed()); CR
	swipeDown1();
	swipeDown1();
	if (getUserDeviceInput.contains("IOS")) {
		swipeDown1();
	}
	Thread.sleep(1000);
	Assert.assertTrue(Home._shopBanfieldCTA.isDisplayed());
	if (getUserDeviceInput.contains("IOS")) {
		swipeDown1();
	}
	swipeDown1();
	Thread.sleep(1000);
	Assert.assertTrue(Home._wanttoHelpText.isDisplayed()); 
	Assert.assertTrue(Home._donateCTA.isDisplayed());
	verifytest(Home._donateCTA);
	
	
	
	
	//ScrolltoElement("Donate");
	//Home._shopBanfieldCTA.isDisplayed();
	//XCUIElementTypeButton[@text='Shop now']
	//public void iOSScrollToElement() {
    //RemoteWebElement parent = (RemoteWebElement)getDriver().findElement(By.name("home/shopnow/title"));
    //String parentID = parent.getId();
//		System.out.println(parentID);
//	    	HashMap<String, String> scrollObject = new HashMap<String, String>();
//	    	scrollObject.put("element", parentID);
//	    	//scrollObject.put("predicateString", "Shop now");
//	    	scrollObject.put("toVisible", "sdfnjksdnfkld");
//	    	getDriver().executeScript("mobile:scroll", scrollObject);
//	//    	}
//		Thread.sleep(15000);
	
//	for (;;) {
		
//		try {
//		swipeDown();
//		swipeDown();
//		swipeDown();
////			Home._shopBanfieldCTA.isDisplayed();
////			if (Home._shopBanfieldCTA.isDisplayed()) {
//			//	break;
////			}
//
//		} catch (Exception e) {
//			System.out.println("scrolling");
//			swipeDown();
////		}
//		break;
//	}
//	Assert.assertTrue(Home._wanttoHelpText.isDisplayed());               
	//ScrolltoElement("Shop now");
	//javascriptScroll(Home._wanttoHelpText);
//	Assert.assertTrue(Home._shopBanfieldCTA.isDisplayed());
	logger.info("User wants to verify Changes - See FAQs about COVID-19 , Add ® in Shop now after Banfield, Add ® in Donate after Banfield Foundation");
	}

	@And("^the home screen is displayed with the Hi Users name bhere for pets. Were here to help.See FAQs about "
	+ "COVID19 CTA, Your pets, Add a new pet CTA, Your preferred location,Map icon CTA,Phone CTA,Make an appointment CTA,Shop now,Donate,VetChatGo$")
	public void the_home_screen_is_displayed_with_the_Hi_Users_name_bhere_for_pets() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	//	softassert.assertTrue(Home._seeFaqsAboutCovid19Text.isDisplayed()); CR
		Home.verifyHomePage();
		Thread.sleep(1000);
		ScrolltoElement("Active");
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("the home screen is displayed with the below Hi Users name bhere for pets. "
				+ "Were here to help.See FAQs about COVID19 CTA, Your pets, Add a new pet CTA, "
				+ "Your preferred location,Map icon CTA,Phone CTA,Make an appointment CTA,Shop now,Donate,VetChatGo");
	}

	@And("^the user should be displayed with the preferred location module if they have set the preferred location."
			+ "Text Your preferred location,Hospital Name and address,Map icon CTA,Phone CTA,Make an appointment CTA$")
	public void the_user_should_be_displayed_with_the_below() throws Throwable {
		Thread.sleep(2000);
	//	ScrolltoElement("Your preferred location");
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Make an appointment >");
		}
		Thread.sleep(400);
	//	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Home.verifyYourPreferredLocation();
		verifytest(Home._yourPreferredLocationHospitalName);
		logger.info("the user should be displayed with the preferred location "
				+ "module if they have set the preferred location.Text Your preferred location,"
				+ "Hospital Name and address,Map icon CTA,Phone CTA,Make an appointment CTA");
	}
	
	@When("^the user is on Reason for visit screen$")
	public void the_user_is_on_Reason_for_visit_screen() throws Throwable {
		swipeDown();
		Thread.sleep(600);
		TapElement(Home._MakeAnAppointmentCTA);
		Thread.sleep(22000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		softassert.assertTrue(WhoAreWeScheduling._petcard.isDisplayed());
		TapElement(WhoAreWeScheduling._pet01);
		TapElement(WhoAreWeScheduling._nextCTA);
		Thread.sleep(2000);
		softassert.assertTrue(Reasonforvisit._illnessCTA.isDisplayed());
	//	softassert.assertAll();
		logger.info("the user is on Reason for visit screen");
	}
	


	@And("^the user should tap on the map icon to launch the maps app with location pinned$")
	public void the_user_should_tap_on_the_map_icon_to_launch_the_maps_app_with_location_pinned() throws Throwable {
		Thread.sleep(6000);
	//	ScrolltoElement("Your preferred location");
		ScrolltoElement("Make an appointment >");
		Thread.sleep(400);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Assert.assertTrue(Home._yourPreferredLocationHospitalMapCTA.isDisplayed());
		TapElement(Home._yourPreferredLocationHospitalMapCTA);
		logger.info("the user should tap on the map icon to launch the maps app with location pinned");
	}

	@And("^if the user has no preferred location the user will be displayed with Find a location near you module."
			+ "Text Your preferred location, Adding a location to your favorites can help "
			+ "make scheduling appointments faster and easier,Find a location near you CTA$")
	public void if_the_user_has_no_preferred_location_the_user_will_be_displayed_with_Find_a_location_near_you_module() throws Throwable {
		Thread.sleep(2000);
	//	try {
	//		swipeDown();
	//	} catch (Exception e) {
	//		ScrolltoElement("Find a location near you");
	//	}
		swipeDown1();
		Assert.assertTrue(Home._yourPreferredLocationTitle.isDisplayed());
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		Assert.assertTrue(Home._findaLocationNearYouCTA.isDisplayed());
		verifytest(Home._findaLocationNearYouCTA);
		logger.info("if the user has no preferred location the user will be displayed with Text Your preferred location,"
						+ " Adding a location to your favorites can help make scheduling appointments faster and easier, "
						+ "Find a location near you CTA");
	}
	
	@And("^user is able to tap on find a location near you$") 
	public void user_is_able_to_tap_on_find_a_location_near_you() throws Throwable {
		Thread.sleep(7000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Find a location near you");
		}
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		TapElement(Home._findaLocationNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._hospital1); // 1st Garfield Now
	//	TapElement(WhenAndWhere._hospital2); // 2nd 
		TapElement(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		TapElement(WhoAreWeScheduling._pet01); 
		TapElement(WhoAreWeScheduling._nextCTA); 
		logger.info("user is able to tap on find a location near you");
	}
	
	@And("^user is able to tap on find a location near you CTA$") 
	public void user_is_able_to_tap_on_find_a_location_near_you_CTA() throws Throwable {
		Thread.sleep(7000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Find a location near you");
		}
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		TapElement(Home._findaLocationNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._hospital1); // Garfield
		TapElement(FindaLocationNearYou._MakeAppoCTA_LoggedinUser);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		TapElement(WhoAreWeScheduling._pet01); 
		TapElement(WhoAreWeScheduling._nextCTA); 
		logger.info("user is able to tap on find a location near you CTA");
	}
	
	@And("^user wants to see Express, Mobile and Pet smart Logoo$") 
	public void user_wants_to_see_Express_Mobile_and_Pet_smart_Logoo() throws Throwable {
		Thread.sleep(7000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Find a location near you");
		}
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		TapElement(Home._findaLocationNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._PetSmartLogo.isDisplayed());
		Assert.assertTrue(WhenAndWhere._ExpressLogo.isDisplayed());
		logger.info("user wants to see Express, Mobile and Pet smart Logo");
	}
	
	@And("^user wants to see Express, Mobile and Pet smart Logo$") 
	public void user_wants_to_see_Express_Mobile_and_Pet_smart_Logo() throws Throwable {
		Thread.sleep(7000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Find a location near you");
		}
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		TapElement(Home._findaLocationNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Thread.sleep(1000);
		Assert.assertTrue(WhenAndWhere._PetSmartLogO1.isDisplayed());
		Assert.assertTrue(WhenAndWhere._ExpressLogo.isDisplayed());
		TapElement(WhenAndWhere._hospital1); // Garfield
		Assert.assertTrue(FindaLocationNearYou._PetSmartLogo.isDisplayed());
		TapElement(FindaLocationNearYou._backCTA);
		TapElement(WhenAndWhere._hospital2); // Houston 
		Assert.assertTrue(FindaLocationNearYou._ExpressLogo.isDisplayed());
		verifytest(FindaLocationNearYou._ExpressLogo);
		logger.info("user wants to see Express, Mobile and Pet smart Logo");
	}
	
	@And("^user wants to see Status Update Flags & Treatments - Hospital LocationSearch$") 
	public void user_wants_to_see_Status_Update_Flags_And_Treatments_Hospital_LocationSearch() throws Throwable {
		Thread.sleep(7000);
		try {
			swipeDown();
		} catch (Exception e) {
			ScrolltoElement("Find a location near you");
		}
		Assert.assertTrue(Home._yourPreferredLocationText.isDisplayed());
		TapElement(Home._findaLocationNearYouCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		Assert.assertTrue(WhenAndWhere._closedFromSatus.isDisplayed()); //Closed from
		Assert.assertTrue(WhenAndWhere._newLocationStatus.isDisplayed()); //New Location
		Assert.assertTrue(WhenAndWhere._grandOpeningStatus.isDisplayed()); //Grand opening
		TapElement(WhenAndWhere._hospital1); // Houston
		Assert.assertTrue(FindaLocationNearYou._statusFlag1.isDisplayed());
		TapElement(FindaLocationNearYou._backCTA);
		TapElement(WhenAndWhere._hospital3); // Garfield
		Assert.assertTrue(FindaLocationNearYou._statusFlag2.isDisplayed());
		verifytest(FindaLocationNearYou._statusFlag2);
		logger.info("user wants to see Status Update Flags & Treatments - Hospital LocationSearch");
	}
	
	@And("^user wants to see Express, Mobile and Pet smart Logo from when & where$") 
	public void user_wants_to_see_Express_Mobile_and_Pet_smart_Logo_when_and_where() throws Throwable {
		try {
			Thread.sleep(3000);
			if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
				TapElement(WhenAndWhere._onlyThisTimePopups);	
			}
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
	//	swipeDown();
		Assert.assertTrue(WhenAndWhere._PetSmartLogO1.isDisplayed());
		verifytest(WhenAndWhere._PetSmartLogO1);
		logger.info("user wants to see Express, Mobile and Pet smart Logo when & where");
	}
	
	@And("^user wants to see Status Update Flags & Treatments - Hospital LocationSearch in when & where$") 
	public void user_wants_to_see_Status_Update_Flags_And_Treatments_Hospital_LocationSearch_in_when_and_where() throws Throwable {
		try {
			Thread.sleep(3000);
			if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
				TapElement(WhenAndWhere._onlyThisTimePopups);	
			}
			getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
			Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		} catch (Exception e) {
			
		}
		Thread.sleep(2000);
		swipeDown();
		Assert.assertTrue(WhenAndWhere._closedFromSatus.isDisplayed());
		Assert.assertTrue(WhenAndWhere._newLocationStatus.isDisplayed());
		swipeDown();
		Assert.assertTrue(WhenAndWhere._grandOpeningStatus.isDisplayed());
		verifytest(WhenAndWhere._grandOpeningStatus);
		logger.info("user wants to see Status Update Flags & Treatments - Hospital LocationSearch in when & where");
	}
	

	@And("^the user will be displayed Shop Banfield module "
			+ "Text: Shop Banfield,Youre one stop shop for pet products, medications and treats, Shop now CTA$")
	public void the_user_will_be_displayed_Shop_Banfield_module() throws Throwable {
		ScrolltoElement("Shop now");
		Home.verifyShopBanfield();
		logger.info(
				"the user will be displayed Shop Banfield module "
				+ "Text: Shop Banfield,Youre one stop shop for pet products, medications and treats, Shop now CTA");
	}

	@And("^the user will be displayed with Donate module Text : Want to help, "
			+ "Every donation helps Banfield Foundation support pets and people who need it most, Donate CTA$")
	public void the_user_will_be_displayed_with_Donate_module() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Want to help?");
		ScrolltoElement("Donate");
		Thread.sleep(1000);
		Home.verifyWanttohelp();
		logger.info("the user will be displayed with Donate module Text : Want to help?, "
				+ "Every donation helps Banfield Foundation support pets and people who need it most, Donate CTA");
	}

	@And("^the user will not be displayed VetChatGo if they have not opted for it.$")
	public void the_user_will_not_be_displayed_VetChatGo_if_they_have_not_opted_forit() throws Throwable {
		try {
			ScrolltoElement("Donate");
			Assert.assertFalse(Home._vetchatgoMultiText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("VetChatGo is not activated");
		}
		logger.info("the user will not be displayed VetChatGoï¿½ if they have not opted for it.");
	}

	@And("^the user will be displayed VetChatGo if the user purchased the vet chat go plan$")
	public void the_user_will_be_displayed_VetChatGo_if_the_user_purchased_the_vet_chat_go_plan() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(6000);
		ScrolltoElement("Active");
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("the user will be displayed VetChatGo if the user purchased the vet chat go plan");
	}

	@And("^the user for a single pet will be displayed with  Text: Single Logo,VetChatGo,"
			+ "Pets: Pet name,Start Date,Expiration,Total amount,Status$")
	public void the_user_for_a_single_pet_will_be_displayed_with_text() throws Throwable {
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("the user for a single pet will be displayed with  "
				+ "Text: Single Logo,VetChatGo,Pets: Pet name,Start Date,Expiration,Total amount,Status");
	}
	
	@And("^the user for a multiple pet will be displayed with  Text MULTI Logo, VetChatGo, Pet name, Start Date, Expiration, Total amount, Status$")
	public void the_user_for_a_multi_pet_will_be_displayed_with_text() throws Throwable {
		Thread.sleep(8000);
		Home.verifyVetChatGoOne();
		logger.info("the user for a multiple pet will be displayed with  Text MULTI Logo, VetChatGo, "
				+ "Pet name, Start Date, Expiration, Total amount, Status");
	}

}
