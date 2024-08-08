package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BoardingAndGroomingScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.Is_this_an_Emergency;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HighlightsShareableRecordsSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public BoardingAndGroomingScreen BoardingAndGrooming= new BoardingAndGroomingScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Is_this_an_Emergency Is_this_an_Emergency_screen = new Is_this_an_Emergency(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	
	public String path1 = "./src/test/resources/TestData/Sprint5/Highlights_Comprehensive_examOWP.csv";
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(HighlightsShareableRecordsSteps.class);
	
	
	@When("^User Logged in into app Multi Pets$")
	public void User_Logged_in_into_app_Multi_Pets() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("User Logged in into app Multi Pets");
	}

	@And("^the user taps on Shareable records module$")
	public void the_user_taps_on_Shareable_records_module() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ScrolltoElement("Kimberlee");
		try {
			TapElement(Home._pet0);
		} catch (Exception e) {
			TapElement(Home._pet01);
		}
	//	ScrolltoElement("Xavior");
	//	TapElement(Home._pet12);
		Thread.sleep(4000);
		ScrolltoElement("Shareable records");
		TapElement(PetCard._ShareableRecordsAccordion);
		ScrolltoElement("View records");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PetCard.verifyShareableRecords();
		logger.info("the user taps on 'Shareable records' module'");
	}
	
	@And("^the user scroll to Shareable records module$")
	public void the_user_scroll_to_Shareable_records_module() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
			swipeDown();
		} else {
			ScrolltoElement("Shareable records");
		}
		
		TapElement(PetCard._ShareableRecordsAccordion);
		if (getUserDeviceInput.contains("IOS")) {
		//	swipeDown();
		} else {
			ScrolltoElement("View records");
		}
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PetCard.verifyShareableRecords();
		logger.info("the user scroll to Shareable records module");
	}
	
	@When("^the user taps on View records CTA$")
	public void the_user_taps_on_View_records_CTA() {
		TapElement(PetCard._ShareableRecords_viewRecordsCTA);
		Assert.assertTrue(BoardingAndGrooming._boardingAndGroomingTitle.isDisplayed());
		logger.info("the user taps on View records CTA");
	}
	
	@When("^User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen$")
	public void User_wants_to_tak_on_Make_an_Appointment_CTA_and_navigate_to_Reason_for_visit_Screen() throws Throwable {
		Thread.sleep(1000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		try {
			if (Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta.isDisplayed()) {
				TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
			}
		} catch (Exception e) {
			System.out.println("Emergency Alert Not Displayed");
		}
		Thread.sleep(2000);
		Assert.assertTrue(Reasonforvisit._illnessCTA.isDisplayed());
		Thread.sleep(2000);
		logger.info("User wants to tak on Make an Appointment CTA and navigate to Reason for visit Screen");
	}
	
	@When("^User wants to tak on Make an Appointment CTA and navigate to where and where Screen$")
	public void User_wants_to_tak_on_Make_an_Appointment_CTA_and_navigate_to_when_and_where_Screen() throws Throwable {
		Thread.sleep(8000);
		TapElement(Home._pet0);
		Thread.sleep(2000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		Thread.sleep(1000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
		Assert.assertTrue(Reasonforvisit._newPatientCTA.isDisplayed());
		Thread.sleep(3000);
		TapElement(Reasonforvisit._newPatientCTA); 
		TapElement(Reasonforvisit._nextCTA);
	//	TapElement(WhenAndWhere._onlyThisTimePopups);
	//	getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		logger.info("User wants to tak on Make an Appointment CTA and navigate to where and where Screen");
	}
	
	@And("^user wants to verify Notes for the vet in New Patient Screen as Loggedin User$")
	public void user_wants_to_verify_Notes_for_the_vet_in_NewPatient_Screen_as_Loggedin_User() throws Throwable {
		Thread.sleep(8000);
		TapElement(Home._pet0);
		Thread.sleep(2000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		Thread.sleep(1000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
		Assert.assertTrue(Reasonforvisit._newPatientCTA.isDisplayed());
		Thread.sleep(3000);
		TapElement(Reasonforvisit._newPatientCTA); 
		TapElement(Reasonforvisit._nextCTA);
		swipeDown();
		String input = getcsvdata(path, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		HidingKeyboardios();
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);
		logger.info("user wants to verify Notes for the vet in New Patient Screen as Loggedin User");
	}
	
	@And("^user wants to navigate to Whats going on Screen as new patient as Loggedin User$")
	public void user_wants_to_navigate_to_Whats_going_on_Screen_as_new_patient_as_Loggedin_User() throws Throwable {
		Thread.sleep(8000);
		TapElement(Home._pet0);
		Thread.sleep(2000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		Thread.sleep(1000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
		Assert.assertTrue(Reasonforvisit._newPatientCTA.isDisplayed());
		Thread.sleep(3000);
		TapElement(Reasonforvisit._newPatientCTA); 
		TapElement(Reasonforvisit._nextCTA);
		ScrolltoElement("Need to talk? Call your preferred hospital");
		logger.info("user wants to navigate to Whats going on Screen as new patient as Loggedin User");
	}
	
	@And("^the Logged in user with preferred location will be displayed with Need to talk Call your preferred hospital and Call icon$")
	public void user_wants_to_navigate_to_Whats_going_on_Screen_as_new_patient_as_Loggedin_User_geoLoc_On() throws Throwable {
		Thread.sleep(8000);
		TapElement(Home._pet0);
		Thread.sleep(2000);
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		Thread.sleep(1000);
		TapElement(Is_this_an_Emergency_screen._is_this_an_emergency_continue_cta);
		Thread.sleep(1000);
		swipeDown();
		Thread.sleep(1000);
	    try {
	    	Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Reasonforvisit._NotSureCallaHospitalNearYouCTA1.isDisplayed());
		}
		Assert.assertTrue(Reasonforvisit._newPatientCTA.isDisplayed());
		Thread.sleep(3000);
		TapElement(Reasonforvisit._newPatientCTA); 
		TapElement(Reasonforvisit._nextCTA);
		ScrolltoElement("Need to talk? Call your preferred hospital");
		Assert.assertTrue(WhatsGoingOn._needToTalkCallABanfieldLocationCTA.isDisplayed());
		logger.info("the Logged in user with preferred location will be displayed with Need to talk Call your preferred hospital and Call icon");
	}
	
	@And("^if the user selects Travel health cert tag$")
	public void if_the_user_selects_Travel_health_cert_tag() throws Throwable {
		TapElement(WhatsGoingOn._travelHealthCert);
		logger.info("if the user selects Travel health cert tag");
	}
	
	@And("^the user should be displayed with the static text and CTA$")
	public void the_user_should_be_displayed_with_the_static_text_and_CTA() throws Throwable {
		Assert.assertTrue(WhatsGoingOn._healthCertificatesStaticText.isDisplayed());
		Assert.assertTrue(WhatsGoingOn._seeOfficialPetTravelInfoCTA.isDisplayed());
		logger.info("the user should be displayed with the static text and CTA");
	}
	
	@And("^the user can tap on See official pet travel info CTA to get redirected aphis website$")
	public void the_user_can_tap_on_See_official_pet_travel_info_CTA_to_get_redirected_aphis_website() throws Throwable {
		verifytest(WhatsGoingOn._seeOfficialPetTravelInfoCTA);
		TapElement(WhatsGoingOn._seeOfficialPetTravelInfoCTA);
		logger.info("the user can tap on See official pet travel info CTA to get redirected aphis website");
	}
	
	@And("^the user can tap on Need to talk Call your preferred hospital and Call icon to open the devices default dialer with the phone number pre-filled$")
	public void the_user_can_tap_on_Need_to_talk_Call_your_preferred_hospital() throws Throwable {
		verifytest(WhatsGoingOn._needToTalkCallABanfieldLocationCTA);
		TapElement(WhatsGoingOn._needToTalkCallABanfieldLocationCTA);
		logger.info("the user can tap on Need to talk? Call your preferred hospital and Call icon to open the devices default dialer with the phone number pre-filled");
	}
	
	@And("^the user should display Shareable Records tab$")
	public void the_user_should_display_Shareable_Records_tab() {
		Assert.assertTrue(PetCard._ShareableRecords.isDisplayed()); //updated on 08/22
		logger.info("the user should display Shareable Records tab");
	}
	
	@Then("^the user should be displayed with Shareable records screen$")
	public void the_user_should_be_displayed_with_Shareable_records_screen() throws Throwable {
		Thread.sleep(1000);
		BoardingAndGrooming.verifyBoardingAndGroomingPage();
		logger.info("the user should be displayed with Shareable records screen");
	}
	
	@And("^the Shareable records screen should display the Petnames boarding and grooming records,Date, Share record CTA$")
	public void the_Shareable_records_screen_should_display() {
		Assert.assertTrue(BoardingAndGrooming._PetNameBoardingText.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._groomingRecordsText.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._groomingRecordsText.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._dateText.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._shareRecordCTA.isDisplayed());
		logger.info("the Shareable records screen should display the Petnames boarding and grooming records,Date, Share record CTA");
	}
	
	@And("^the user should be able to tap on Share record CTA to share or download the pdf$")
	public void the_user_should_be_able_to_tap_on_Share_record_CTA_to_share_or_download_the_pdf() throws Throwable {
		verifytest(BoardingAndGrooming._shareRecordCTA);
		TapElement(BoardingAndGrooming._shareRecordCTA);
		Thread.sleep(8000);
		logger.info("the user should be able to tap on Share record CTA to share or download the pdf");
	}
	
	@And("^the user is displayed with the following Vaccines, Vaccine name, Last date given, Due date$")
	public void the_user_is_displayed_with_the_following_Vaccines_Vaccine_name_Last_date_given_Due_date() {
		Assert.assertTrue(BoardingAndGrooming._VaccinesText.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._VaccinesName.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._lastDateGiven.isDisplayed());
		Assert.assertTrue(BoardingAndGrooming._dueDate.isDisplayed());
		logger.info("the user is displayed with the following Vaccines, Vaccine name, Last date given, Due date");
	}
		
	@And("^the Last date given and Due date format is Mon DD, YYYY Parasite control Category,Medication name with dosage,Last date given,Due date$")
	public void the_Last_date_given_and_Due_date_format() {
		BoardingAndGrooming.verifyParasiteControlVaccines();
		logger.info("the Last date given and Due date format is Mon DD, YYYY Parasite control Category,Medication name with dosage,Last date given,Due date");
	}
	
	@And("^if the response of the Range/Result for parasite control is null it will be displayed empty$")
	public void if_the_response_of_the_Range_Result_for_parasite_control_is_null_it_will_be_displayed_empty() throws Throwable {
		TapElement(PetCard._ShareableRecords_viewRecordsCTA);
		ScrolltoElement("Flea Prevention");
		Thread.sleep(1000);
		Assert.assertTrue(BoardingAndGrooming._parasite_DueDateDate.isDisplayed());
		logger.info("if the response of the Range/Result for parasite control is null it will be displayed empty");
	}
	
	@And("^if the Last date given for Vaccinations and Parasite control is null the user is displayed with Never$")
	public void if_the_Last_date_given_for_Vaccinations_and_Parasite_control_is_null_the_user_is_displayed_with_Never() {
		Assert.assertTrue(BoardingAndGrooming._parasite_LastDateGivenDate.isDisplayed());
		logger.info("if the Last date given for Vaccinations and Parasite control is null the user is displayed with Never");
	}
	
	@And("^if the due date for Vaccinations and Parasite control is null the user is displayed with NA$")
	public void if_the_due_date_for_Vaccinations_and_Parasite_control_is_null_the_user_is_displayed_with_NA() {
		Assert.assertTrue(BoardingAndGrooming._parasite_DueDateDate.isDisplayed());
		logger.info("if the due date for Vaccinations and Parasite control is null the user is displayed with NA");
	}
	
	@And("^the user taps < icon on Shareable records screen to go back to the Highlights screen$")
	public void the_user_taps_back_icon_on_Shareable_records_screen_to_go_back_to_the_Highlights_screen() {
		TapElement(BoardingAndGrooming._backCTA);
		logger.info("the user taps on 'Shareable records' module'the user taps < icon on Shareable records screen to go back to the Highlights screen");
	}
	
	@And("^the shareable records module is only applicable for Dogs$")
	public void the_shareable_records_module_is_only_applicable_for_Dogs() throws Throwable {
		TapElement(PetCard._backCTAHighlights);
		ScrolltoElement("Kimberlee"); 
		TapElement(Home._pet01);
		Thread.sleep(4000);
		ScrolltoElement("Shareable records");
		Assert.assertTrue(PetCard._ShareableRecords.isDisplayed());
		logger.info("the shareable records module is only applicable for Dogs");
	}
	
	@And("^If the response is no records/null, the user will not see Shareable records module on Highlights screen$")
	public void If_the_response_is_no_records_null_the_user_will_not_see_Shareable_records_module_on_Highlights_screen() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Miki");
		TapElement(Home._pet001);
		Thread.sleep(4000);
		ScrolltoElement("Pet profile");
		try {
			Assert.assertFalse(PetCard._ShareableRecords.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Shareable is not displayed");
		}
		logger.info("If the response is no records/null, the user will not see Shareable records module on Highlights screen");
	}
	
	@When("^the user is on Shareable records screen$")
	public void the_user_is_on_Shareable_records_screen() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Heriberto");
		TapElement(Home._pet11);
		Thread.sleep(1000);
		ScrolltoElement("Shareable records");
		Thread.sleep(800);
		TapElement(PetCard._ShareableRecordsAccordion);
		ScrolltoElement("View records");
		PetCard.verifyShareableRecords();
		logger.info("the user is on Shareable records screen");
	}
	
	@Then("^the user is displayed with the following Vaccine name - Do not give, Parasite control medication - Do not give$")
	public void the_user_is_displayed() {
		TapElement(PetCard._ShareableRecords_viewRecordsCTA);
		Assert.assertTrue(BoardingAndGrooming._VaccinesName_Donotgive.isDisplayed());
		ScrolltoElement("Flea Prevention");
		Assert.assertTrue(BoardingAndGrooming._fleaPrevention_Donotgive.isDisplayed());
		logger.info("the user is displayed with the following Vaccine name - Do not give, Parasite control medication - Do not give");
	}
}
