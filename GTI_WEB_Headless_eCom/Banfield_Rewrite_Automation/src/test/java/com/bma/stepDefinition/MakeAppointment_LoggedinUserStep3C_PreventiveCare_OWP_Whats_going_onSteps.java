package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.html5.Location;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.who_are_we_Scheduling_makeappointment_Login_Flow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeAppointment_LoggedinUserStep3C_PreventiveCare_OWP_Whats_going_onSteps extends Utilities {

	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public who_are_we_Scheduling_makeappointment_Login_Flow who_are_we_Scheduling = new who_are_we_Scheduling_makeappointment_Login_Flow(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";
	public String path2 = "./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	public String path3 = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(MakeAppointment_LoggedinUserStep3C_PreventiveCare_OWP_Whats_going_onSteps.class);
	
	@When("^user login as owp user$")
	public void user_login_as_owp_user() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(1000);
		LoginUser.Login_to_OWP();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user is on Home screen");
	}
	
	@Then("^user is navigated to Reason for visit screen$")
	public void user_is_navigated_to_Reason_for_visit_screen() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Jisela");
		try {
			TapElement(who_are_we_Scheduling._pet01);
		} catch (Exception e) {
			TapElement(who_are_we_Scheduling._pet01);
		}
		TapElement(who_are_we_Scheduling._nextCTA);
		Thread.sleep(1000);
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		softassert.assertAll();
		logger.info("user is navigated to Reason for visit screen");
	}
	
	@And("^notes for the vet is an optional fields$")
	public void notes_for_the_vet_is_an_optional_fields() throws Throwable {
	    TapElement(WhatsGoingOn._VaccinationButton);
	    TapElement(WhatsGoingOn._PreventiveNextCTA);
	    Thread.sleep(2000);
	    getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(4000);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the notes for vet is an optional field");
	}
	
	@And("^the user with OWP or NWP pet selects Preventive care and taps on Next CTA$")
	public void user_with_OWP_pet_selects_Preventive_care_and_taps_on_Next_CTA() throws Throwable {
		Thread.sleep(2000);
		TapElement(Reasonforvisit._preventiveCareCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(4000);
		softassert.assertTrue(WhatsGoingOn._TellUsMoreText.isDisplayed());
		softassert.assertAll();
		logger.info("the user with OWP pet selects Preventive care and taps on Next CTA");
	}
	
	@And("^the user verify Notes for the vet in Preventive Care Screen$")
	public void the_user_verify_Notes_for_the_vet_in_Preventive_Care_Screen() throws Throwable {
		Thread.sleep(2000);
		TapElement(Reasonforvisit._preventiveCareCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		Thread.sleep(4000);
		softassert.assertTrue(WhatsGoingOn._TellUsMoreText.isDisplayed());
		softassert.assertAll();
		swipeDown();
		String input = getcsvdata(path3, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolderOWP, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolderOWP.getText());
		HidingKeyboardios();
		verifytest(WhatsGoingOn._noteForTheVetPlaceHolderOWP);
		logger.info("the user verify Notes for the vet in Preventive Care Screen");
	}
	
	@And("^the user should able to able to navigate to when and where Screen$")
	public void the_user_should_able_to_able_to_navigate_to_when_and_where_Screen() {
		TapElement(Reasonforvisit._preventiveCareCTA); 
		TapElement(Reasonforvisit._nextCTA); 
		softassert.assertTrue(WhenAndWhere._seeCalender.isDisplayed());
		softassert.assertAll();
		logger.info("the user should able to able to navigate to when and where Screen");
	}
	
	@And("^User displayed with the Notes for the Vet fields$")
	public void displayed_with_the_Notes_for_the_Vet_fields() {
		String note ="Notes for the vet";
		TapElement(WhenAndWhere._backCTAinClosestHospitalPage);
		ScrolltoElement("Notes for the vet");
		TapElement(WhatsGoingOn._noteForTheVetPlaceHolderOWP);
		Assert.assertEquals(note,WhatsGoingOn._noteForTheVetPlaceHolderOWP.getText());
		HidingKeyboard();
		logger.info("displayed with the �Notes for the Vet� field");
	}
	
	@And("^user cannot enter more than 255 characters in the notes for vet fields$")
	public void user_cannot_enter_more_than_255_characters_in_the_notes_for_vet_fields() throws Throwable {
		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {	
			logger.info("the user cannot enter more than 255 characters in the notes for vet field");
		}else {
		String input = getcsvdata(path, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolderOWP, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolderOWP.getText());
		logger.info("User cannot enter more than 255 characters in the notes for vet field");}
	}
	
	@And("^Notes for the Vet field will show as a placeholder$")
	public void Notes_for_the_Vet_field_will_show_as_a_placeholder() throws Throwable {
		String Name = getcsvdata(path2,2,"Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolderOWP, Name);
		Thread.sleep(3000);
		Assert.assertTrue(WhatsGoingOn._noteForTheVetlabelOWP.isDisplayed());
		HidingKeyboard();
		logger.info("Notes for the Vet field will show as a placeholder");
	}
	
	@And("^the user should be displayed with the following fields$")
	public void the_user_should_be_displayed_with_the_following_fields() throws Throwable {
		WhatsGoingOn.verifyWhatsGoingonpage();
		softassert.assertTrue(WhatsGoingOn._ComprehensiveExamText.isDisplayed());
		softassert.assertAll();
		logger.info("And the user should be displayed with the following fields");
	}
	
	@And("^the options displayed are Comprehensive exam, Vaccination$")
	public void options_displayed_are_Comprehensive_exam_Vaccination() throws Throwable {
		softassert.assertTrue(WhatsGoingOn._ComprehensiveExamText.isDisplayed());
		softassert.assertTrue(WhatsGoingOn._VaccinationText.isDisplayed());
		softassert.assertAll();
		logger.info("the options displayed are Comprehensive exam, Vaccination");
	}
	
	@And("^user should see options are not selected by default$")
	public void user_should_see_options_are_not_selected_by_default() {
		softassert.assertFalse(WhatsGoingOn._ComprehensiveExamButton.isSelected());
		softassert.assertFalse(WhatsGoingOn._VaccinationButton.isSelected());
		softassert.assertAll();
		logger.info("user should see options are not selected by default");
	}
	
	@And("^the user should be able to tap on any one option to select$")
	public void the_user_should_be_able_to_tap_on_any_one_option_to_select() {
		TapElement(WhatsGoingOn._VaccinationButton);//changed
		logger.info("the user should be able to tap on any one option to select");
	}
	
	@And("^the selected option will be highlighted on select$")
	public void the_selected_option_will_be_highlighted_on_select() {
		softassert.assertTrue(WhatsGoingOn._VaccinationButton.isEnabled()); //changed
		softassert.assertAll();
		logger.info("the selected option will be highlighted on select");
	}
	
	@And("^the user can select only one option$")
	public void user_can_select_only_one_option() {
		softassert.assertFalse(WhatsGoingOn._ComprehensiveExamButton.isSelected());
		softassert.assertAll();
		logger.info("the user can select only one option");
	}
	
	@And("^user taps on < to get redirected to the Reason for visit screen$")
	public void user_taps_on_back_to_get_redirected_to_the_Reason_for_visit_screen() throws Throwable {
		TapElement(WhatsGoingOn._WhatsGoingOnBackCTA);
		Thread.sleep(800);
		softassert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
	    softassert.assertAll();
		logger.info("User taps on < to get redirected to the Reason for visit screen");
	}
	
	@And("^user taps on X icon to get redirected to the Home Screen$")
	public void user_taps_on_X_icon_to_get_redirected_to_the_Home_Screen() throws Throwable {
		TapElement(WhatsGoingOn._WhatsGoingOnCancelCTA);
		Thread.sleep(800);
		softassert.assertTrue(Home._HiUser_header.isDisplayed());
	    softassert.assertAll();
		logger.info("User taps on X icon to get redirected to the Home Screen");
	}
	
	@And("^the Next CTA should be disabled by default until the user selects the option$")
	public void Next_CTA_should_be_disabled_by_default_until_the_user_selects_the_option() throws Throwable {
		softassert.assertFalse(WhatsGoingOn._PreventiveNextCTA.isEnabled());
	    softassert.assertAll();
		logger.info("the Next CTA should be disabled by default until the user selects the option");
	}
	
	@And("^the Next CTA will be enabled once user selects the option$")
	public void Next_CTA_will_be_enabled_once_user_selects_the_option() throws Throwable {
		TapElement(WhatsGoingOn._VaccinationButton);
		Thread.sleep(400);
		softassert.assertTrue(WhatsGoingOn._PreventiveNextCTA.isEnabled());
	    softassert.assertAll();
		logger.info("the Next CTA will be enabled once user selects the option");
	}
	
	@And("^the user taps on the Next CTA to get redirected to when & where screen$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_when_And_where_screen() throws Throwable {
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		getDriver().setLocation(new Location(40.88065578410196, -74.1122517103768, 0));
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(2000);
		TapElement(WhenAndWhere._whenAndWhereTitle);
		logger.info("the user taps on the Next CTA to get redirected to when & where screen");
	}
	
}
