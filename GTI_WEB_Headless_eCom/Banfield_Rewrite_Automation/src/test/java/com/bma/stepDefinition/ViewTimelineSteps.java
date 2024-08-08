package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.bridge.AbortException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Duplicate_Appointment_Alert;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.PetDetailsScreen;
import com.bma.pageObject.Pet_ChangeProfileScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewTimelineSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PetDetailsScreen PetDetails = new PetDetailsScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public Pet_ChangeProfileScreen Pet_ChangeProfile = new Pet_ChangeProfileScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	public Duplicate_Appointment_Alert Duplicate_Appointment = new Duplicate_Appointment_Alert(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	
	public String path1 = "./src/test/resources/TestData/Sprint3/Login_using_credentials6.csv";
	public String path2 = "./src/test/resources/TestData/Sprint3/Login_using_credentials2.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewTimelineSteps.class);
	
	@When("^User Login into app$")
	public void user_login_into_app() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("User Login into app");
	}
	
	@When("^User Login into the app$")
	public void user_login_into_the_app() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Thread.sleep(6000);
		logger.info("User Login into app");
	}
	
	@When("^user is on the pet info page$")
	public void user_is_on_the_pet_info_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(8000);
		//ScrolltoElement("Piety");
	    TapElement(Home._pet1);
		logger.info("user is on the pet info page");	
	}
	
	@When("^user is on the pet info-screen$")
	public void user_is_on_the_pet_info_screen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Thread.sleep(9000);
	    ScrolltoElement("Kimberlee");
		try {
			TapElement(Home._pet01);
		} catch (Exception e) {
			TapElement(Home._pet0);
		}
		logger.info("user is on the pet info screen");	
	}
	
	@When("^user is on the pet info pages$")
	public void user_is_on_the_pet_info_pages() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		ScrolltoElement("Mickie");
		TapElement(Home._pet04);
		logger.info("user is on the pet info pages");
	}
	
	@When("^the user taps on Timeline Tab$")
 	public void the_user_taps_on_Timeline_Tab() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		TapElement(PetCard._timeline);
		Thread.sleep(6000);
		logger.info("the user taps on Timeline Tab");
	}
	
	@When("^the user should tap on Make an appointment CTA and navigate to when and where screen$")
    public void the_user_should_tap_on_Make_an_appointment_CTA() throws Throwable {
       TapElement(PetCard._makeAnAppointmentCTATimeLine);
       Thread.sleep(800);
       try {
			if (getUserDeviceInput.contains("IOS")) {
				waitUntilClickable(By.xpath("//XCUIElementTypeButton[@resource-id='emergency-popup/modal/continuebtn']"), 30);	
			}
		} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
       TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
       Thread.sleep(1000);
       softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
       softassert.assertAll();
       swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
       TapElement(Reasonforvisit._newPatientCTA);
       TapElement(Reasonforvisit._nextCTA);
       TapElement(WhenAndWhere._onlyThisTimePopups);
       Thread.sleep(1000);
       logger.info("the user should tap on Make an appointment CTA");

   }
	
	@And("^the user should tap on Duplicate Appointment CTA and navigate to when and where screen$")
    public void tapon_duplicate_appointment_cta() throws Throwable {
		if (Duplicate_Appointment._make_additional_appointment_cta_loggedinuser.isDisplayed()) {
			TapElement(Duplicate_Appointment._make_additional_appointment_cta_loggedinuser);
		}else {
			System.out.println("Duplicate Appointment Alert is not displayed");
		}
       logger.info("the user should tap on Duplicate Appointment CTA and navigate to when and where screen");
   }
	
	@Then("^user wants to change pet photo$")
	public void user_wants_to_chnage_pet_photo() throws Throwable {
		TapElement(PetCard._CameraIconTimeLine);
		Thread.sleep(3000);
		verifytest(Pet_ChangeProfile._changePhotoCTA);
		TapElement(Pet_ChangeProfile._changePhotoCTA);
		if (getUserDeviceInput.contains("IOS")) {
		}else {
		Thread.sleep(850);
		TapElement(Pet_ChangeProfile._onlyThisTimePopups);
		TapElement(Pet_ChangeProfile._AllowPopups);
		TapElement(Pet_ChangeProfile._choosePhotoCTA);
		}
		logger.info("user wants to chnage photo");
	}
	
	@Then("^the user should be able to view the list of Previous visits detail$")
	public void the_user_should_be_able_to_view_the_list_of_Previous_visits_detail() {
		PetCard.verifyListOfPreviousvisits();
		logger.info("the user should be able to view the list of Previous visits detail");
	}
	
	@Then("^the user should be able to view the time format$")
	public void the_user_should_be_able_to_view_time_format() {
		Assert.assertTrue(PetCard._timeText.isDisplayed());
		logger.info("the user should be able to view the time format");
	}
	
	@And("^the visits will be sorted by Recent First$")
	public void the_visits_will_be_sorted_by_Recent_First() {
		logger.info("the visits will be sorted by Recent First");
	}
	
	@And("^the screen should display with the Time HH: MM am/pm, Date Month Date, "
			+ "Year Ex: January 25th, 2022, Reason for visit, Hospital location, Med/Vaccine/Labs$")
	public void the_screen_should_display_the_following_information() throws Throwable {
		ScrolltoElement("September 27th, 2004");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		PetCard.verifyPreviousVisit();
		logger.info("the screen should display with the Time HH: MM am/pm, Date "
				+ "Month Date, Year Ex: January 25th, 2022, Reason for visit, Hospital location, Med/Vaccine/Labs");
	}
	
	@And("^the Med/Vaccine/Labs will be displayed based on the visit$")
	public void the_Med_Vaccine_Labs_will_be_displayed_based_on_the_visit() throws Throwable {
	//	ScrolltoElement("September 9th, 2019");
		softassert.assertTrue(PetCard._metText1.isDisplayed());
		softassert.assertTrue(PetCard._vaccineText1.isDisplayed());
		softassert.assertTrue(PetCard._labsText1.isDisplayed());
		softassert.assertAll();
		logger.info("the Med/Vaccine/Labs will be displayed based on the visit");
	}
	
	@And("^if Med Vaccine Labs was not administered the icon will not be shown$")
	public void if_Med_Vaccine_Labs_was_not_administered_the_icon_will_not_be_shown() {
		Assert.assertTrue(PetCard._NothingOnFileText.isDisplayed()); 
		logger.info("if Med Vaccine Labs was not administered the icon will not be shown");
	}
	
	@And("^the icons are left aligned.$")
	public void the_icons_are_left_aligned() {
		Assert.assertTrue(PetCard._ArrowCTA2.isDisplayed());
		logger.info("the icons are left aligned");
	}
	
	//27721
	@And("^the user should be able to tap on > icon to get redirected to Pet name visit screen as detailed in$")
	public void the_user_should_be_able_to_tap_on_back_icon_to_get_redirected_to_Pet_name_visit_screen_as_detailed_in() throws Throwable {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		TapElement(PetCard._ArrowCTA);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user should be able to tap on > icon to get redirected to '<Pet name>�s visit' screen as detailed in");
	}
	
	@And("^the user should be able to view the no previous record if the previous visit is not available$")
	public void the_user_should_be_able_to_view_the_no_previous_record_if_the_previous_visit_is_not_available() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		ScrolltoElement("Kitty");
		TapElement(Home._pet0);
		TapElement(PetCard._timeline);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._previousVisit.isDisplayed());
		Assert.assertTrue(PetCard._NothingOnFileText.isDisplayed());
		Assert.assertTrue(PetCard._makeAnAppointmentCTATimeLine.isDisplayed());
		logger.info("the user should be able to view the no previous record if the previous visit is not available");
	}

	@And("^the user should be displayed with the Static text Nothing on file. Please schedule an appointment to see your pets details. Make an appointment CTA$")
	public void the_user_should_be_displayed_with_the_Static_text_Nothing_on_file_Please_schedule_an_appointment_to_see_your_pets_details_Make_an_appointment_CTA() throws Throwable {
		Thread.sleep(1000);
	//	TapElement(PetDetails._backCTA);
		TapElement(PetCard._backCTATimeLine);
		ScrolltoElement("Kitty");
		try {
			TapElement(Home._pet0);
		} catch (Exception e) {
			TapElement(Home._pet03);
		}
		Thread.sleep(600);
		TapElement(PetCard._timeline);
		Thread.sleep(600);
		Assert.assertTrue(PetCard._NothingOnFileText.isDisplayed()); 
		logger.info("the user should be displayed with the Static text Nothing on file. Please schedule an appointment to see your pets details. Make an appointment CTA");
	}
	
	@And("^the user will click on Make an appointment CTA to go to Reason for visit screen for logged in user flow.$")
	public void the_user_will_click_on_Make_an_appointment_CTA_to_go_to_Reason_for_visit_screen_for_logged_in_user_flow() throws Throwable {
		TapElement(PetCard._makeAnAppointmentCTATimeLine);
		Thread.sleep(1000);
		Assert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		logger.info("the user will click on Make an appointment CTA to go to 'Reason for visit?' screen for logged in user flow.");
	}
	
	//28139
	@And("^the user can tap on the camera icon to Change/update photo$")
	public void the_user_can_tap_on_the_camera_icon_to_Change_update_photo() throws Throwable {
		TapElement(Reasonforvisit._backCTA);
		Thread.sleep(800);
		Assert.assertTrue(PetCard._CameraIconTimeLine.isDisplayed());
		TapElement(PetCard._CameraIconTimeLine); 
		Assert.assertTrue(Pet_ChangeProfile._petNameTitle.isDisplayed());
		logger.info("the user can tap on the camera icon to Change/update photo");
	}
	
	@And("^the user will tap on < button to go back to previous screen Home$")
	public void the_user_will_tap_on_back_button_to_go_back_to_previous_screen_Home() throws Throwable {
		TapElement(PetCard._backCTATimeLine);
		Assert.assertTrue(Home._headerText.isDisplayed());
		logger.info("the user will tap on < button to go back to previous screen \"Home\"");
	}
}
