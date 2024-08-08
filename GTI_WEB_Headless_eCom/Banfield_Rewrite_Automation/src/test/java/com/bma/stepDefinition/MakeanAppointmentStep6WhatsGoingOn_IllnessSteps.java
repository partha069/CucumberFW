package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.Duplicate_Appointment_Alert;
import com.bma.pageObject.AnotherAppointmentPopups;
import com.bma.pageObject.Find_a_Location_Near_You_Screen;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import com.bma.pageObject.WhatsGoingOnScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeanAppointmentStep6WhatsGoingOn_IllnessSteps extends Utilities {

	public ViewWelcomeScreen Welcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen Havewemetscreen = new HavewemetScreen(driver);
	public LetsgetstartedSteps LetsGetstarted = new LetsgetstartedSteps(driver);
	public TellusaboutyourpetPage TellusaboutyourPet = new TellusaboutyourpetPage(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public WhatsGoingOnScreen WhatsGoingOn = new WhatsGoingOnScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Duplicate_Appointment_Alert Duplicate_Appointment = new Duplicate_Appointment_Alert(driver);
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness.csv";
	public String path2 = "./src/test/resources/TestData/Sprint1/makeappointmentasguestName-step4.csv";
	public String path3 = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep6WhatsGoingOn_Illness2Note.csv";
	public Find_a_Location_Near_You_Screen Find_a_Location_Near_You = new Find_a_Location_Near_You_Screen(driver);
	
	SoftAssert softassert = new SoftAssert();

	private static Logger logger = LogManager.getLogger(MakeanAppointmentStep6WhatsGoingOn_IllnessSteps.class);

	@When("^user selected the Illness option in Reason for visit screen$")
	public void user_tapped_on_Next_from_the_Tell_us_about_your_pet_screen() throws Throwable {
	//	String Name = getcsvdata(path2,2,"Name", "Name");
	//	Welcome.TapOnMakeAppointmentasGuest();
	//	Havewemetscreen.TapOnNoIMNew();
	//	LetsGetstarted.Entervaliddatain_letsgetstartedpage();
	//	TapElement(LetsGetstarted._lastName);
	//	HidingKeyboard();
	//	TapElement(LetsGetstarted._email);
	//	HidingKeyboard();
	//	TapElement(LetsGetstarted._nextButton);
	//	TapElement(WhatSpeciesIsYourPet._cat);
	//	TapElement(WhatSpeciesIsYourPet._nextbutton);
	//	EnterInput(TellusaboutyourPet._petName, Name);
	//	TapElement(TellusaboutyourPet._male);
	//	TellusaboutyourPet.verifyGenderisNotSelected();
	//	TellusaboutyourPet.tapOnYesCTA();
	//	TapElement(TellusaboutyourPet._nextCTA);
		Thread.sleep(2000);
		Assert.assertTrue(Reasonforvisit._illness.isDisplayed());
		TapElement(Reasonforvisit._injury);
		Thread.sleep(2000);
		logger.info("user tapped on Next from the Tell us about your pet screen");
	}

	@And("^the user tapped on Next for illness$")
	public void the_user_tapped_on_Next_for_illness() {
		TapElement(Reasonforvisit._illness);
		TapElement(Reasonforvisit._nextCTA);
		logger.info("the user tapped on Next ");
	}

	@When("^they are redirected to Whats going on screen$")
	public void they_are_redirected_to_Whats_going_on_screen() throws Throwable {
		Thread.sleep(600);
		Assert.assertTrue(WhatsGoingOn._whatsGoingOnTitle.isDisplayed());
		logger.info("they are redirected to Whats going on screen");
	}

	@Then("^the user should be displayed with the following fields to choose and enter Tell us more,Tags to choose, Notes for the vet$")
	public void the_user_should_be_displayed_with_the_following_fields() throws Throwable {
		WhatsGoingOn.verifyfieldsonWhatsGoingOnPage();
		logger.info("the user should be displayed with the following fields");
	}

	@And("^the user should be displayed with the following tag:Coat/skin Coughing/sneezing/breathing issues, Ear/eye/nose, Seizures, Other/sluggishness, Teeth/mouth, Urinary issues, Vomiting/diarrhea$")
	public void the_user_should_be_displayed_with_the_tag() throws Throwable {
		Thread.sleep(800);
		WhatsGoingOn.verifyTagsOnWhatsGoingOnPageIllness();
		logger.info("the user should be displayed with the tag");
	}

//	@And("^the user is displayed with the Notes for the Vet field$")
//	public void the_user_is_displayed_with_the_Notes_for_the_Vet_field() {
	//	String note ="Notes for the vet";
	//	TapElement(WhatsGoingOn._noteForTheVetlabel);
		//Assert.assertEquals(note,WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		//logger.info("the user is displayed with the �Notes for the Vet� field");
	//}
	
	@And("^the user is displayed with the Notes for the Vet fields$")
	public void the_user_is_displayed_with_the_Notes_for_the_Vet_fields() {
		String note ="Notes for the vet";
	//	ScrolltoElement("Notes for the vet");
	//	HidingKeyboard();
		Assert.assertEquals(note,WhatsGoingOn._NoteForTheVet.getText());
		logger.info("the user is displayed with the �Notes for the Vet� field");
	}

	@And("^the Notes for the Vet field will show as a placeholder text.$")
	public void the_Notes_for_the_Vet_field_will_show_as_a_placeholder_text() throws Throwable {
		String Name = getcsvdata(path2,2,"Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, Name);
		Thread.sleep(3000);
		Assert.assertTrue(WhatsGoingOn._noteForTheVetPlaceHolder.isDisplayed());
		HidingKeyboard();
		logger.info("the �Notes for the Vet� field will show as a placeholder text.");
	}

	@And("^the user when taps on it, the placeholder text will show as a label name.$")
	public void the_user_when_taps_on_it_the_placeholder_text_will_show_as_a_label_name() throws Throwable {
		WhatsGoingOn.scrollAndEnterNotesForVet();
	//	Thread.sleep(5000);	
		try {
			Assert.assertTrue(WhatsGoingOn._NoteForTheVet.isDisplayed());
			HidingKeyboard();
		} catch (Exception e) {
			HidingKeyboardios();
			ScrolltoElement("Notes for the vet");
			Assert.assertTrue(WhatsGoingOn._NoteForTheVet.isDisplayed());
		}
		
		logger.info("the user when taps on it, the placeholder text will show as a label name.");
	}

	@And("^the notes for vet is an optional field$")
	public void the_notes_for_vet_is_an_optional_field() {
		TapElement(WhatsGoingOn._TeethMouth);
		Assert.assertTrue(WhatsGoingOn._TeethMouth.isEnabled());
		TapElement(WhatsGoingOn._nextCTA);
		if (getUserDeviceInput.contains("IOS")) {
			TapElement(Welcome._deny);
			}
			else
		TapElement(WhenAndWhere._denyPopups);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the notes for vet is an optional field");
	}

	@And("^the user cannot enter more than 255 characters in the notes for vet field$")
	public void the_user_cannot_enter_more_than_255_characters_in_the_notes_for_vet_field() throws Throwable {
		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {	
			logger.info("the user cannot enter more than 255 characters in the notes for vet field");
		}else {
		String input = getcsvdata(path, 2, "Note", "Note");
	//	Scroll("Notes for the vet");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
	//	verifytest(WhatsGoingOn._noteForTheVetPlaceHolder);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		}
		logger.info("the user cannot enter more than 255 characters in the notes for vet field");
	}
	
	@And("^the user cannot enter more than 255 characters in the notes for vet fields$")
	public void the_user_cannot_enter_more_than_255_characters_in_the_notes_for_vet_fields() throws Throwable {
		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {	
			logger.info("the user cannot enter more than 255 characters in the notes for vet field");
		}else {
		String input = getcsvdata(path, 2, "Note", "Note");
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, input);
		Assert.assertNotSame(input, WhatsGoingOn._noteForTheVetPlaceHolder.getText());
		logger.info("the user cannot enter more than 255 characters in the notes for vet field");}
	}

	@And("^the tags are not selected by default$")
	public void the_tags_are_not_selected_by_default() throws InterruptedException {
		Thread.sleep(800);
		TapElement(WhenAndWhere._backCTAinClosestHospitalPage);
		Thread.sleep(800);
		TapElement(WhatsGoingOn._TeethMouth);
		WhatsGoingOn.verifyTags();
		logger.info("the tags are not selected by default");
	}

	@And("^the user should be able to tap on any option to select a tag$")
	public void the_user_should_be_able_to_tap_on_any_option_to_select_a_tag() {
		TapElement(WhatsGoingOn._EarEyeNose);
		Assert.assertTrue(WhatsGoingOn._EarEyeNose.isEnabled());
		TapElement(WhatsGoingOn._EarEyeNose);
		logger.info("the user should be able to tap on any option to select a tag");
	}

	@And("^choosing the tags is a Mandatory action$")
	public void choosing_the_tags_is_a_Mandatory_action() throws Throwable {
		TapElement(WhatsGoingOn._UrinaryIssues);
		Assert.assertTrue(WhatsGoingOn._UrinaryIssues.isEnabled());
		Thread.sleep(200);
		Assert.assertTrue(WhatsGoingOn._nextCTA.isEnabled());
		TapElement(WhatsGoingOn._UrinaryIssues);
		logger.info("choosing the tags is a Mandatory action");
	}

	@And("^the selected tag will be highlighted on select$")
	public void the_selected_tag_will_be_highlighted_on_select() {
		WhatsGoingOn.verifyTagishighlightedonSelected();
		logger.info("the selected tag will be highlighted on select");
	}

	@And("^the user can multiselect the tag$")
	public void the_user_can_multiselect_the_tag() throws Throwable {
		WhatsGoingOn.verifyTagsisSelectedIllness();
		Thread.sleep(12000);
		logger.info("the user can multiselect the tag");
	}

	@And("^the user should be able to deselect the tag.$")
	public void the_user_should_be_able_to_deselect_the_tag() {
		WhatsGoingOn.verifyTagsisSelectedIllness();
	//	TapElement(WhatsGoingOn._EarEyeNose);
	//	TapElement(WhatsGoingOn._UrinaryIssues);
		logger.info("the user should be able to deselect the tag.");
	}

	@And("^the Next CTA should be disabled by default until the user selects the tags$")
	public void the_Next_CTA_should_be_disabled_by_default_until_the_user_selects_the_tags() {
	    Assert.assertTrue(WhatsGoingOn._nextCTA.isDisplayed()); 
	//  TapElement(WhatsGoingOn._UrinaryIssues); NA
		logger.info("the Next CTA should be disabled by default until the user selects the tags");
	}

	@And("^the Next CTA will be enabled once user selects the tag$")
	public void the_Next_CTA_will_be_enabled_once_user_selects_the_tag() throws Throwable {
		String Name = getcsvdata(path2,2,"Note", "Note");
		TapElement(WhatsGoingOn._UrinaryIssues);
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, Name);
		Assert.assertTrue(WhatsGoingOn._nextCTA.isEnabled());
		logger.info("the Next CTA will be enabled once user selects the tag");
	}

	@And("^the user taps on the Next CTA to get redirected to when & where Screen$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_when_and_where_Screen() throws Throwable {
		TapElement(WhatsGoingOn._nextCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(800);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed()); 
		verifytest(WhenAndWhere._whenAndWhereTitle);
		logger.info("the user taps on the Next CTA to get redirected to when & where? Screen");
	}
	
	@And("^the users taps on the Next CTA to get redirected to when & where Screen$")
	public void the_users_taps_on_the_Next_CTA_to_get_redirected_to_when_and_where_Screen() throws Throwable {
		TapElement(WhatsGoingOn._nextCTA);
		try {
			if (Duplicate_Appointment._duplicate_popup_titletext_loggedinuser.isDisplayed()) {
				TapElement(Duplicate_Appointment._make_additional_appointment_cta_loggedinuser);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("duplicate appointment not found");
		}
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(800);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed()); 
		logger.info("the users taps on the Next CTA to get redirected to when & where? Screen");
	}
	
	@And("^the user taps on the Next CTA to get redirected to the when & where Screen$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_the_when_and_where_Screen() throws Throwable {
		TapElement(WhatsGoingOn._UrinaryIssues);
		swipeDown();
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, "Test Note");
		HidingKeyboardios();
		TapElement(WhatsGoingOn._VomitingDiarrhea);
		TapElement(WhatsGoingOn._nextCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(800);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		verifytest(WhenAndWhere._whenAndWhereTitle);
		logger.info("the user taps on the Next CTA to get redirected to the when & where Screen");
	}
	
	@And("^the user taps on the Next CTA to get redirected to when & where Page$")
	public void the_user_taps_on_the_Next_CTA_to_get_redirected_to_when_and_where_Page() throws Throwable {
		TapElement(WhatsGoingOn._UrinaryIssues);
		swipeDown();
		EnterInput(WhatsGoingOn._noteForTheVetPlaceHolder, "Test Note");
		HidingKeyboardios();
		TapElement(WhatsGoingOn._VomitingDiarrhea);

		TapElement(WhatsGoingOn._nextCTA);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Thread.sleep(800);
	//	Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("the user taps on the Next CTA to get redirected to when & where? Page");
	}
	
	@Then("^the user will be redirected to Whats going on screen$")
	public void the_user_will_be_redirected_to_Whats_going_on_screen() throws Throwable {
		Thread.sleep(7000);
		Assert.assertTrue(WhatsGoingOn._TellUsMorefield.isDisplayed());
		logger.info("the user will be redirected to Whats going on screen");
	}
	
	@And("^the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen$")
	public void the_user_will_be_displayed_Not_sure_Call_a_hospital_near_you_at_the_bottom_of_the_page_in_illness_screen() throws Throwable{
		Thread.sleep(2000);
		swipeDown();
		Assert.assertTrue(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs.isDisplayed());
		logger.info("the user will be displayed Not sure Call a hospital near you at the bottom of the page in illness Screen");
	}
	
	@And("^the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page$")
	public void the_user_can_tap_on_Not_sure_Call_a_hospital_near_you_to_get_redirected_to_Find_a_location_near_you_page() throws Throwable{
		TapElement(WhatsGoingOn._NotSureCallaHospitalNearYouCTAs);
		Thread.sleep(3000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
		verifytest(Find_a_Location_Near_You._Findalocationheadertext);
		logger.info("User can tap on Not sure Call a hospital near you to get redirected to Find a location near you page");
	}
	
	@And("^the user can tap on Not sure Call a hospital near you to get redirected to Find a location near you page for Preventive care$")
	public void the_user_can_tap_on_Not_sure_Call_a_hospital_near_you_to_get_redirected_to_Find_a_location_near_you_page_for_Preventive_care() throws Throwable{
		swipeDown();
		TapElement(WhatsGoingOn._NotSureCallaHospitalNearYou_preventivecareCTA);
		Thread.sleep(1000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
		verifytest(Find_a_Location_Near_You._Findalocationheadertext);
		logger.info("User can tap on Not sure Call a hospital near you to get redirected to Find a location near you page for Preventive care");
	}
	
	@And("^And the user will be displayed with message for Dental messaging promo$")
	public void And_the_user_will_be_displayed_with_message_for_Dental_messaging_promo() throws Throwable{
		swipeDown();
		Thread.sleep(1000);
		softassert.assertTrue(WhatsGoingOn._AnySpecifcText.isDisplayed());
		softassert.assertTrue(WhatsGoingOn._OWPDentalMessagingpromoText.isDisplayed());
		softassert.assertTrue(WhatsGoingOn._NotSureCallaHospitalNearYou_preventivecareCTA.isDisplayed());
		softassert.assertTrue(WhatsGoingOn._dropOffAppointmentsText.isDisplayed());
		softassert.assertAll();
		logger.info("And the user will be displayed with message for Dental messaging promo");
	}
	
	@And("^the user can tap on Call a hospital near you CTA to get redirected to Find a location near you screen$")
	public void the_user_can_tap_on_Call_a_hospital_near_you_CTA_to_get_redirected_to_Find_a_location_near_you_screen() throws Throwable{
		Thread.sleep(1000);
		TapElement(WhatsGoingOn._NotSureCallaHospitalNearYou_preventivecareCTA);
		Thread.sleep(1000);
		TapElement(WhenAndWhere._onlyThisTimePopups);
		Assert.assertTrue(Find_a_Location_Near_You._Findalocationheadertext.isDisplayed());
		verifytest(Find_a_Location_Near_You._Findalocationheadertext);
		logger.info("the user can tap on Call a hospital near you CTA to get redirected to Find a location near you screen");
	}
	
	@And("^user wants to see Express, Mobile and Pet smart Logo in when and where screen$")
	public void user_wants_to_see_Express_Mobile_and_Pet_smart_Logo_in_when_and_where_screen() throws Throwable{
		Thread.sleep(1000);
		Thread.sleep(1000);
		TapElement(WhatsGoingOn._vaccinationCTA);
		TapElement(WhatsGoingOn._PreventiveNextCTA);
		
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("user wants to see Express, Mobile and Pet smart Logo in when and where screen");
	}
	
	@And("^user wants to redirected to when & where Page$")
	public void user_wants_to_get_redirected_to_when_and_where_Page() throws Throwable {
		TapElement(WhatsGoingOn._UrinaryIssues);
		TapElement(WhatsGoingOn._nextCTA);
		Thread.sleep(200);
		
		try {
			if (Duplicate_Appointment._duplicate_popup_titletext.isDisplayed()) {
				Duplicate_Appointment.verifyduplicatepopup();
				TapElement(Duplicate_Appointment._make_additional_appointment_cta);
			}
		} catch (Exception e) {
			System.out.println("Duplicate Alert Not Displayed");
		}
		
		Thread.sleep(800);
		try {
			if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
				TapElement(WhenAndWhere._onlyThisTimePopups);
			}
		} catch (Exception e) {
			System.out.println("No Location Popups Displayed");
		}
		Thread.sleep(800);
		Assert.assertTrue(WhenAndWhere._whenAndWhereTitle.isDisplayed());
		logger.info("User wants to redirected to when & where Page");
	}
	
	@And("^user wants to redirected to when & where Page after selecting tag for illness$")
	public void user_wants_to_get_redirected_to_when_and_where_Page_after_selecting_tag_for_illness() throws Throwable {
		TapElement(WhatsGoingOn._UrinaryIssues);
		TapElement(WhatsGoingOn._nextCTA);
		logger.info("User wants to redirected to duplicate popup Page");
	}

	@And("^the user taps on < to get redirected to the Reason for visit screen$")
	public void the_user_taps_on_back_to_get_redirected_to_the_Reason_for_visit_screen() throws Throwable {
		TapElement(WhatsGoingOn._backCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		verifytest(Reasonforvisit._reasonforvisitTitle);
		logger.info("the user taps on < to get redirected to the Reason for visit screen");
	}

	@And("^the user taps on X to get redirected to Have we met screen when user is in Reason for visit screen$")
	public void the_user_taps_on_close_to_get_redirected_to_Have_we_met_screen_when_user_is_in_Reason_for_visit_screen() throws Throwable {
		TapElement(WhatsGoingOn._cancelCTA);
		Thread.sleep(2000);
		Havewemetscreen.verifyHavewematescreen();
		verifytest(Havewemetscreen._yesIHaveButton);
		logger.info("the user taps on X to get redirected to Have we met screen when user is in Reason for visit screen");
	}

}
