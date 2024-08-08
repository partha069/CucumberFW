package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.Record_center;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Record_center_steps extends Utilities {

	public Record_center Record = new Record_center(driver);
	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public HomeScreen Home = new HomeScreen(driver);
	private static Logger logger = LogManager.getLogger(Record_center_steps.class);

	@When("the user is on the Record center Screen")
	public void the_user_is_on_the_record_center_screen() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(1000);
		LoginUser.Login_to_addpet();
		Thread.sleep(7000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(20000);
		TapElement(Home._pet0);
		Thread.sleep(6000);
		Assert.assertTrue(Record._recordscta.isDisplayed());
		TapElement(Record._recordscta);
		Thread.sleep(2000);
		Assert.assertTrue(Record._Visit_corosel.isDisplayed());
	}
	@Then("they are displayed with the Record center sub module")
	public void they_are_displayed_with_the_record_center_sub_module() throws Throwable {
		Record.verifyRecords();
		verifytest(Record._Medication_corosel);
	}
	
	@When("the user taps on Exam & outpatient therapy reports")
	public void the_user_taps_on_exam_outpatient_therapy_reports() {
		TapElement(Record._Exam_Outpatient_corosel);
		Assert.assertTrue(Record._Exam_Outpatient_text.isDisplayed());
	}
	@When("if no records are available for that pet, the user is displayed")
	public void if_no_records_are_available_for_that_pet_the_user_is_displayed() throws Throwable {
		Record.verify_nothing_on_file_Page();
	}
	@When("the user can tap given number to open the device default dialer with phone number pre-filled")
	public void the_user_can_tap_given_number_to_open_the_device_default_dialer_with_phone_number_pre_filled() {
		verifytest(Record._dialer_cta);
		TapElement(Record._dialer_cta);
		
	}
	@When("the user can tap on Chat live now CTA to get redirected to")
	public void the_user_can_tap_on_chat_live_now_cta_to_get_redirected_to() {
		verifytest(Record._Chat_live_now_cta);
		TapElement(Record._Chat_live_now_cta);
	
	}
	
	@When("the user taps on Invoice records")
	public void the_user_taps_on_invoice_records() {
	//	swipeleft(Record._Visit_corosel);
		TapElement(Record._Invoice_corosel);
		Assert.assertTrue(Record._Invoice_text.isDisplayed());
	}
	
	@When("the user taps on Medication history")
	public void the_user_taps_on_medication_history() {
		swipeleft(Record._Exam_Outpatient_corosel);
		swipeleft(Record._Lab_Records_corosel);
		TapElement(Record._Medication_corosel);
		Assert.assertTrue(Record._Medication_text.isDisplayed());
	}
	
	@When("the user taps on Vaccine history")
	public void the_user_taps_on_vaccine_history() {
		swipeleft(Record._Invoice_corosel);
		swipeleft(Record._Medication_corosel);
		TapElement(Record._Vaccine_corosel);
		Assert.assertTrue(Record._vaccine_text.isDisplayed());
	}
	
	@When("the user taps on the Lab records tab")
	public void the_user_taps_on_the_lab_records_tab() {
		swipeleft(Record._Invoice_corosel);
		TapElement(Record._Lab_Records_corosel);
		Assert.assertTrue(Record._Lab_text.isDisplayed());
	}
	
	/*
	 * exam and outpatient
	 * */
	@Then("the user will be displayed with the following on Exam outpatient therapy report")
	public void the_user_will_be_displayed_with_the_following_on_Exam_outpatient_therapy_report() throws Throwable {
		Record.verify_Exam_and_Outpatient();
	}

	@Then("the user can tap on Download CTA to download the Exam outpatient therapy report")
	public void the_user_can_tap_on_download_cta_to_download_the_Exam_outpatient_therapy_report() {
		TapElement(Record._Exam_Download);
		verifytest(Record._Exam_Download);
	}
	@Then("the user will receive a native success message once the download is completed")
	public void the_user_will_receive_a_native_success_message_once_the_download_is_completed() {

	}
	
	/*
	 * Invoice
	 * */
	@Then("the user will be displayed with the following on Invoice records")
	public void the_user_will_be_displayed_with_the_following_on_invoice_records() throws Throwable {
		Record.verify_Invoice();
	}
	@Then("the user can tap on Download CTA to download the Invoice records report")
	public void the_user_can_tap_on_download_cta_to_download_the_invoice_records_report() {
		TapElement(Record._Invoice_Download);
		verifytest(Record._Invoice_Download);
	}
	
	/*
	 * Lab Records
	 * */
	
	@Then("the user displayed will be displayed with the following on Lab records")
	public void the_user_displayed_will_be_displayed_with_the_following_on_lab_records() throws Throwable {
		Record.verify_Labs_records();
	}
	@Then("the user can tap on download all CTA to download Lab records")
	public void the_user_can_tap_on_download_all_cta_to_download_lab_records() {
		TapElement(Record._Labs_Downloadall);
		TapElement(Record._allow_popups);
		verifytest(Record._Labs_Downloadall);
	}

	@When("the user taps on no_of_test tests CTA")
	public void the_user_taps_on_no_of_test_tests_cta() {
		TapElement(Record._Labs_NO_of_test);
	}
	
	@Then("the user is displayed with the following on expanding lab records")
	public void the_user_is_displayed_with_the_following_on_expanding_lab_records() throws Throwable {
		Record.verify_Labs_records_expendedview();
	}
	
	@Then("the user can tap on All tests CTA to go back to the list of tests displayed")
	public void the_user_can_tap_on_all_tests_cta_to_go_back_to_the_list_of_tests_displayed() {
		TapElement(Record._Labs_alltests_cta);
		Assert.assertTrue(Record._Labs_NO_of_test.isDisplayed());
		
	}
	
	/*
	 * Medication
	 * */
	
	@Then("the user will be displayed with the following on Medication history")
	public void the_user_will_be_displayed_with_the_following_on_medication_history() throws Throwable {
		Record.verify_Medication_records();
	}
	
	@Then("the user can tap on download all CTA to download Medication History record")
	public void the_user_can_tap_on_download_all_cta_to_download_medication_history_record() {
		TapElement(Record._Medication_Downloadall);
		TapElement(Record._allow_popups);
	}
	
	@Then("the user will be displayed the following on expanding a date")
	public void the_user_will_be_displayed_the_following_on_expanding_a_date() throws Throwable {
		TapElement(Record._Medication_accordian_btn);
		Record.verify_Medication_records_expanded();
		verifytest(Record._Medication_Location);
	}
	
	/*
	 * Vaccine
	 * 
	 * */
	@Then("the user will be displayed with the following on Vaccine history")
	public void the_user_will_be_displayed_with_the_following_on_vaccine_history() throws Throwable {
		Record.verify_vaccine_records();
	}
	
	@Then("the user can tap on Download CTA to download the Vaccine history report")
	public void the_user_can_tap_on_download_cta_to_download_the_vaccine_history_report() {
		TapElement(Record._vaccine_Downloadall);
		TapElement(Record._allow_popups);
	}
	
	@Then("the user will be displayed the following on expanding")
	public void the_user_will_be_displayed_the_following_on_expanding() throws Throwable {
		TapElement(Record._vaccine_accordian_btn);
		Record.verify_vaccine_records_expanded();
		verifytest(Record._vaccine_Location);

	}
	

	
	@When("the user is on the Record center Screen for verifying Records")
	public void the_user_is_on_the_record_center_screen_for_verifying_Records() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(1000);
		LoginUser.Login_to_view_records();
		Thread.sleep(7000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(15000);
		TapElement(Home._ExoticPet);
		Thread.sleep(6000);
		Assert.assertTrue(Record._recordscta.isDisplayed());
		TapElement(Record._recordscta);
		Thread.sleep(2000);
		Assert.assertTrue(Record._Visit_corosel.isDisplayed());
	}
	
	@And("the user navigate into the Record center Screen")
	public void the_user_is_navigated_to_the_record_center_screen() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		Thread.sleep(1000);
		LoginUser.Login_to_view_records();
		Thread.sleep(7000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(15000);
		TapElement(Home._ExoticPet);
		Thread.sleep(6000);
		Assert.assertTrue(Record._recordscta.isDisplayed());
		TapElement(Record._recordscta);
	}
	
	@Then("User is on the Filter screen user is displayed with the UI elements")
	public void User_is_on_the_Filter_screen_user_is_displayed_with_the_UI_elements() throws Throwable {
		TapElement(Record._visitSummaries_FilterCTA);
		Assert.assertTrue(Record._applyFiltersCTA.isDisplayed());
		Record.verify_Filter();
		softassert.assertTrue(Record._applyFiltersCTA.isEnabled());
		softassert.assertTrue(Record._cancelCTA.isEnabled()); 
		softassert.assertTrue(Record._dataRangeOption.isEnabled());
		TapElement(Record._dataRangeOption);
		TapElement(Record._applyFiltersCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Record._viewAllCTA.isDisplayed());
		Assert.assertTrue(Record._record_date.isDisplayed());
		logger.info("User is on the Filter screen user is displayed with the UI elements");
	}
	
	@And("the user is displayed with the Date range accordion")
	public void the_user_is_displayed_with_the_Date_range_accordion() throws Throwable {
		TapElement(Record._visitSummaries_FilterCTA);
		Assert.assertTrue(Record._applyFiltersCTA.isDisplayed());
		TapElement(Record._dateRangeAccordionCTA);
		
		
		logger.info("the user is displayed with the 'Date range' accordion ");
	}
	
	@And("the user is displayed with the Boarder & groomer records UI")
	public void the_user_is_displayed_with_the_Boarder_And_groomer_records_UI() throws Throwable {
		Record.verifyRecords();
	//	swipeleft(Record._Vaccine_corosel);
		TapElement(Record._boarderAndGroomerCorose);
		softassert.assertTrue(Record._BoarderAndGroomerRecordsText.isDisplayed());
		softassert.assertTrue(Record._vaccinesStatictext.isDisplayed());
		softassert.assertTrue(Record._lastDateGiveStatictext.isDisplayed());
		softassert.assertTrue(Record._dueDateStatictext.isDisplayed());   
		softassert.assertTrue(Record._lastDateGiveDate.isDisplayed());
		softassert.assertTrue(Record._dueDateDate.isDisplayed());   
		softassert.assertAll();
		logger.info("the user is displayed with the 'Boarder & groomer records UI");
	}
	
	@And("the user can tap on the Download CTA to download the record")
	public void the_user_can_tap_on_the_Download_CTA_to_download_the_record() throws Throwable {
		verifytest(Record._downloadCTA);
		TapElement(Record._downloadCTA);
		TapElement(Record._AllowPopups);
		logger.info("the user can tap on the Download CTA to download the record");
	}
	
	@And("the accordions will be in an expanded state by default and vaccine history")
	public void the_accordions_will_be_in_an_expanded_state_by_default_and_vaccine_history() throws Throwable {
		Record.verifyRecords();
		TapElement(Record._boarderAndGroomerCorose);
		softassert.assertTrue(Record._vaccinesStatictext.isDisplayed());
	    TapElement(Record._vaccinationHistoryAccordions);
	    softassert.assertTrue(Record._parasiteControlAccordions.isDisplayed());
	    TapElement(Record._vaccinationHistoryAccordions);
	    softassert.assertTrue(Record._vaccinesStatictext.isDisplayed());
	    softassert.assertAll();
	    verifytest(Record._vaccinesStatictext);
		logger.info("the accordions will be in an expanded state by default and vaccine history");
	}
	
	@And("the user verifies accordions expand and collapse for parasite control and history")
	public void the_accordions_will_be_in_an_expanded_state_by_default_and_parasite_control() throws Throwable {
		Record.verifyRecords();
		TapElement(Record._boarderAndGroomerCorose);
	    TapElement(Record._vaccinationHistoryAccordions);
	    swipeDown();
	    verifytest(Record._parasiteDescription);
	    softassert.assertTrue(Record._parasiteDescription.isDisplayed());
	    softassert.assertTrue(Record._parasiteMedication.isDisplayed());
	    softassert.assertTrue(Record._parasitelastdateGive.isDisplayed());
	    softassert.assertTrue(Record._parasitelastdateGiveDate.isDisplayed());
	    softassert.assertTrue(Record._parasiteDueDate.isDisplayed());
	    softassert.assertTrue(Record._parasiteDueDateText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user verifies accordions expand and collapse for parasite control and history");
	}
	
	@And("the user verifies accordions expand and collapse for parasite tests and history")
	public void the_user_verifies_accordions_expand_and_collapse_for_parasite_tests_and_history() throws Throwable {
		Record.verifyRecords();
		TapElement(Record._boarderAndGroomerCorose);
	    TapElement(Record._vaccinationHistoryAccordions);
	    TapElement(Record._parasiteControlAccordions);
	    swipeDown();
	    verifytest(Record._parasitetestsLabTest);
	    softassert.assertTrue(Record._parasitetestsLabTest.isDisplayed());
	    softassert.assertTrue(Record._parasiteResult.isDisplayed());
	    softassert.assertTrue(Record._parasiteResultEvaluation.isDisplayed());
	    softassert.assertTrue(Record._parasiteDate.isDisplayed());
	    softassert.assertTrue(Record._parasiteDueDateDateText.isDisplayed());
	    softassert.assertAll();
		logger.info("the user verifies accordions expand and collapse for parasite tests and history");
	}
	
	@And("the user can tap on Apply filters to get redirected to the Visit summaries list view with the selected filters applied with View all CTA")
	public void the_user_can_tap_on_Apply_filters_to_get_redirected_to_the_Visit_summaries_list_view_with_the_selected_filters_applied_with_View_all_CTA() throws Throwable {
		Assert.assertTrue(Record._viewAllCTA.isDisplayed());
		TapElement(Record._viewAllCTA);
		Thread.sleep(1000);
		TapElement(Record._visitSummaries_FilterCTA);
		logger.info("the user can tap on Apply filters to get redirected to the Visit summaries list view with the selected filters applied with View all CTA");
	}
	
	@And("the user can tap on 'Cancel' CTA to to get redirected to the Visit summaries list view screen without the applied filters")
	public void the_user_can_tap_on_Cancel_CTA_to_get_redirected_to_the_Visit_summaries_list_view_screen_without_the_applied_filters() throws Throwable {	
		TapElement(Record._cancelCTA);
		Assert.assertTrue(Record._visitSummaries_FilterCTA.isDisplayed());
		Thread.sleep(1000);
		TapElement(Record._visitSummaries_FilterCTA);
		softassert.assertTrue(Record._dataRangeOption.isSelected());
		TapElement(Record._dataRangeOption);
		softassert.assertTrue(Record._dataRangeOption.isSelected());
		logger.info("the user can tap on 'Cancel' CTA to to get redirected to the 'Visit summaries' list view screen without the applied filters");
	}
	
	@And("the user tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTAs")
	public void the_user_tapping_on_Clear_all_CTA_the_list_view_will_be_reset_automatically_without_tapping_on_Apply_Filters_CTAs() throws Throwable {	
		TapElement(Record._clearallCTA);
		softassert.assertTrue(Record._dataRangeOption.isSelected());
		verifytest(Record._applyFiltersCTA);
		logger.info("the user tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTAs");
	}
	
	
	
	/*
	 * Record Screen for visit summary
	 * */
	
	@When("the user taps on the Visit Summary tab")
	public void the_user_taps_on_the_visit_summary_tab() {
		Assert.assertTrue(Record._Visit_text.isDisplayed());
		logger.info("the user taps on the Visit Summary tab");
	}
	
	@And("the user taps on the Exam and Outpatient tab")
	public void the_user_taps_on_the_Exam_And_Outpatient_tab() {
		TapElement(Record._Exam_Outpatient_corosel);
		Assert.assertTrue(Record._Exam_Outpatient_text.isDisplayed());
		logger.info("the user taps on the Exam And Outpatient tabb");
	}
	
	@And("the user taps on the Invoice tab")
	public void the_user_taps_on_the_Invoice_tab() {
		TapElement(Record._Invoice_corosel);
		Assert.assertTrue(Record._Invoice_text.isDisplayed());
		logger.info("the user taps on the Invoice tab");
	}
	
	@And("the user taps on the download CTA Exam & outpatient therapy reports and able to able to download the OTR record")
	public void the_user_taps_on_the_download_CTA_Exam_And_outpatient_therapy_reports_and_able_to_able_to_download_the_OTR_record() {
		Assert.assertTrue(Record._Exam_Download.isDisplayed());
		verifytest(Record._Exam_Download);
		TapElement(Record._Exam_Download);
		logger.info("the user taps on the download CTA Exam & outpatient therapy reports and able to able to download the OTR record");
	}
	
	@Then("the user taps on the download CTA from Invoice records and able to download the invoice")
	public void the_user_taps_on_the_download_CTA_from_Invoice_records_and_able_to_download_the_invoice() {
		verifytest(Record._Invoice_Download);
		TapElement(Record._Invoice_Download);
		logger.info("the user taps on the download CTA from Invoice records and able to download the invoice");
	}
	
	@Then("the user will be displayed with the Visit Summary Screen")
	public void the_user_will_be_displayed_with_the_Visit_Summary_Screen() {
		softassert.assertTrue(Record._visitSummaries_FilterCTA.isDisplayed());
		softassert.assertTrue(Record._visitSummaries_downloadCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user will be displayed with the Visit Summary Screen");
	}
	
	@And("the user can tap on Download CTA to download the record and user will receive a native tossed success message")
	public void the_user_can_tap_on_Download_CTA_to_download_the_record_and_user_will_receive_a_native_tossed_success_message() {
		verifytest(Record._visitSummaries_downloadCTA);
		TapElement(Record._visitSummaries_downloadCTA);
		logger.info("the user can tap on Download CTA to download the record and user will receive a native tossed success message");
	}
	
	@Then("the user displayed will be displayed with the following on Visit Summary")
	public void the_user_displayed_will_be_displayed_with_the_following_on_visit_summary() {

	}
	@Then("the user can tap on the View icon to open a modal display the following about Visit summary")
	public void the_user_can_tap_on_the_view_icon_to_open_a_modal_display_the_following_about_visit_summary() {

	}
	@Then("the user will be displayed with Medical Details section with following")
	public void the_user_will_be_displayed_with_medical_details_section_with_following() {

	}
	@Then("the user will be displayed with No medications if they did not have any medicines administered and the user will be displayed with Medicine name if administered")
	public void the_user_will_be_displayed_with_no_medications_if_they_did_not_have_any_medicines_administered_and_the_user_will_be_displayed_with_medicine_name_if_administered() {

	}
	@Then("the user will be displayed with No vaccines if they did not have any vaccines administered and the user will be displayed with Name of vaccine if administered")
	public void the_user_will_be_displayed_with_no_vaccines_if_they_did_not_have_any_vaccines_administered_and_the_user_will_be_displayed_with_name_of_vaccine_if_administered() {

	}
	@Then("the user will be displayed with No labs if they do not have any labs and the user will be displayed with following if lab records are present")
	public void the_user_will_be_displayed_with_no_labs_if_they_do_not_have_any_labs_and_the_user_will_be_displayed_with_following_if_lab_records_are_present() {

	}
	
	/*
	 * Filter Screen for medication
	 * */
	
	@Given("the user is on Medication history screen")
	public void the_user_is_on_medication_history_screen() {
		Assert.assertTrue(Record._Medication_text.isDisplayed());
	}
	@Then("the user is displayed with the Filter screen")
	public void the_user_is_displayed_with_the_filter_screen() {
		Assert.assertTrue(Record._filter_clearall.isDisplayed());
	}
	@When("the user taps on Filter CTA on Medication history screen")
	public void the_user_taps_on_filter_cta_on_medication_history_screen() throws Throwable {
		TapElement(Record._Medication_filter);
	
	}
	@Then("on the Filter screen user is displayed with the following for Medication history")
	public void on_the_filter_screen_user_is_displayed_with_the_following_for_medication_history() throws Throwable {
		Record.verify_filterScreen();
	}
	@Then("the user can tap on Apply filters to get redirected to the Medication history list view with the selected filters applied")
	public void the_user_can_tap_on_apply_filters_to_get_redirected_to_the_medication_history_list_view_with_the_selected_filters_applied() {
		TapElement(Record._filter_date1);
		TapElement(Record._filter_Location1);
		TapElement(Record._filter_applyfilter);
	}
	@Then("the user can tap on Cancel CTA to to get redirected to the Medication history list view screen without the applied filters")
	public void the_user_can_tap_on_cancel_cta_to_to_get_redirected_to_the_medication_history_list_view_screen_without_the_applied_filters() {
		TapElement(Record._filter_date1);
		TapElement(Record._filter_Location1);
		TapElement(Record._filter_cancel);
	
	}
	@Then("the user can tap on Clear all CTA to clear all the selected choices on the filter screen")
	public void the_user_can_tap_on_clear_all_cta_to_clear_all_the_selected_choices_on_the_filter_screen() {
		TapElement(Record._filter_date1);
		TapElement(Record._filter_Location1);
		TapElement(Record._filter_clearall);
	}
	@Then("on tapping on Clear all CTA the list view will be reset automatically without tapping on Apply Filters CTA")
	public void on_tapping_on_clear_all_cta_the_list_view_will_be_reset_automatically_without_tapping_on_apply_filters_cta() {

	}
	@Then("the user is displayed with Location accordion")
	public void the_user_is_displayed_with_location_accordion() {

	}
	@Then("the user will be displayed with location checkboxes of the visit for that particular pet only [Ex: Hospital name, state [Burlingame, OR]")
	public void the_user_will_be_displayed_with_location_checkboxes_of_the_visit_for_that_particular_pet_only_ex_hospital_name_state_burlingame_or() {

	}
	@Then("by default none of the checkbox will be selected")
	public void by_default_none_of_the_checkbox_will_be_selected() {

	}
	@Then("checkbox & location \\(Ex: Hospital name, state) will be highlighted in orange color on the selection")
	public void checkbox_location_ex_hospital_name_state_will_be_highlighted_in_orange_color_on_the_selection() {

	}
	@Then("the user in displayed with the Date range accordion")
	public void the_user_in_displayed_with_the_date_range_accordion() {

	}
	@Then("the dates are grouped by year")
	public void the_dates_are_grouped_by_year() {

	}
	@Then("the user will be displayed the number of visits \\(highlighted in orange) in parenthesis Ex. {int} \\({int})")
	public void the_user_will_be_displayed_the_number_of_visits_highlighted_in_orange_in_parenthesis_ex(Integer int1, Integer int2) {

	}
	@Then("the user can select\\/deselect a checkbox on tap")
	public void the_user_can_select_deselect_a_checkbox_on_tap() {

	}
	@Then("checkbox and year will be highlighted in orange color on the selection")
	public void checkbox_and_year_will_be_highlighted_in_orange_color_on_the_selection() {

	}
	@Then("the user can select multiple checkboxes")
	public void the_user_can_select_multiple_checkboxes() {

	}
	@Then("the user is displayed with the Medication name accordion with search bar")
	public void the_user_is_displayed_with_the_medication_name_accordion_with_search_bar() {

	}
	@Then("by default the search bar will have placeholder text Search and the search icon")
	public void by_default_the_search_bar_will_have_placeholder_text_search_and_the_search_icon() {

	}
	@Then("by default user will see the Medication name and dosage in the search list below the search bar")
	public void by_default_user_will_see_the_medication_name_and_dosage_in_the_search_list_below_the_search_bar() {

	}
	@Then("the user can tap on the Medication name and dosage from the list to select it")
	public void the_user_can_tap_on_the_medication_name_and_dosage_from_the_list_to_select_it() {

	}
	@Then("the Medication name and dosage will be highlighted on tap")
	public void the_medication_name_and_dosage_will_be_highlighted_on_tap() {

	}
	@Then("the user can deselect the Medication name and dosage by tapping again")
	public void the_user_can_deselect_the_medication_name_and_dosage_by_tapping_again() {

	}
	@Then("the user can select more than one Medication name and dosage")
	public void the_user_can_select_more_than_one_medication_name_and_dosage() {

	}
	@Then("the user can tap on the Search bar to type the keywords")
	public void the_user_can_tap_on_the_search_bar_to_type_the_keywords() {

	}
	@Then("the close icon will appear in the search bar as the user type the keywords")
	public void the_close_icon_will_appear_in_the_search_bar_as_the_user_type_the_keywords() {

	}
	@Then("based on the keywords typed in the search bar, the search result from the list will be filtered")
	public void based_on_the_keywords_typed_in_the_search_bar_the_search_result_from_the_list_will_be_filtered() {

	}
	@Then("the user can tap on the close icon to clear the text in the search bar")
	public void the_user_can_tap_on_the_close_icon_to_clear_the_text_in_the_search_bar() {

	}
	@Then("the search result and search bar will be reset again on tap of close icon")
	public void the_search_result_and_search_bar_will_be_reset_again_on_tap_of_close_icon() {

	}
	
	/*
	 * Filter Screen for Vaccine
	 * */

	@Given("the user is on Vaccine history screen")
	public void the_user_is_on_vaccine_history_screen() {

	}
	@When("the user taps on Filter CTA on Vaccine history screen")
	public void the_user_taps_on_filter_cta_on_vaccine_history_screen() {

	}
	@Then("on the Filter screen user is displayed with the following for Vaccine history")
	public void on_the_filter_screen_user_is_displayed_with_the_following_for_vaccine_history() {

	}
	@Then("the user can tap on Apply filters to get redirected to the Vaccine history list view with the selected filters applied")
	public void the_user_can_tap_on_apply_filters_to_get_redirected_to_the_vaccine_history_list_view_with_the_selected_filters_applied() {

	}
	@Then("the user can tap on Cancel CTA to to get redirected to the Vaccine history list view screen without the applied filters")
	public void the_user_can_tap_on_cancel_cta_to_to_get_redirected_to_the_vaccine_history_list_view_screen_without_the_applied_filters() {

	}
	@Then("the user is displayed with the Vaccine name accordion")
	public void the_user_is_displayed_with_the_vaccine_name_accordion() {

	}
	@Then("user will be displayed with the vaccine names in the search list below the search bar")
	public void user_will_be_displayed_with_the_vaccine_names_in_the_search_list_below_the_search_bar() {

	}
	@Then("the user can tap on the vaccine name from the list to select it")
	public void the_user_can_tap_on_the_vaccine_name_from_the_list_to_select_it() {

	}
	@Then("the vaccine name will be highlighted on selection")
	public void the_vaccine_name_will_be_highlighted_on_selection() {

	}
	@Then("the user can deselect the vaccine name by tapping again")
	public void the_user_can_deselect_the_vaccine_name_by_tapping_again() {

	}
	@Then("the user can select more than one vaccines from the list")
	public void the_user_can_select_more_than_one_vaccines_from_the_list() {

	}
	@Then("the user can tap in the Search bar to enter keywords")
	public void the_user_can_tap_in_the_search_bar_to_enter_keywords() {

	}
	@Then("the search results will be filtered based on the keywords entered in the search bar")
	public void the_search_results_will_be_filtered_based_on_the_keywords_entered_in_the_search_bar() {

	}
	@Then("the user can tap on the close icon to reset the search result and keywords in the search bar will be reset again on tap of close icon")
	public void the_user_can_tap_on_the_close_icon_to_reset_the_search_result_and_keywords_in_the_search_bar_will_be_reset_again_on_tap_of_close_icon() {

	}
	/*
	 * Filter Screen for Exam & OTR screen
	 * */
	@Given("the user is on Exam & OTR screen")
	public void the_user_is_on_exam_otr_screen() {

	}
	@When("the user taps on Filter CTA on Exam & OTR screen")
	public void the_user_taps_on_filter_cta_on_exam_otr_screen() {

	}
	@Then("on the Filter screen user is displayed with the following for on Exam & OTR screen")
	public void on_the_filter_screen_user_is_displayed_with_the_following_for_on_exam_otr_screen() {

	}
	@Then("the user can tap on Apply filters to get redirected to the on Exam & OTR screen list view with the selected filters applied")
	public void the_user_can_tap_on_apply_filters_to_get_redirected_to_the_on_exam_otr_screen_list_view_with_the_selected_filters_applied() {

	}
	@Then("the user can tap on Cancel CTA to to get redirected to the on Exam & OTR screen list view screen without the applied filters")
	public void the_user_can_tap_on_cancel_cta_to_to_get_redirected_to_the_on_exam_otr_screen_list_view_screen_without_the_applied_filters() {

	}
	@Then("the user is displayed with the Visit type accordion")
	public void the_user_is_displayed_with_the_visit_type_accordion() {

	}
	@Then("the checkboxes are displayed based on the appointment type in existing Exam and outpatient therapy reports list")
	public void the_checkboxes_are_displayed_based_on_the_appointment_type_in_existing_exam_and_outpatient_therapy_reports_list() {

	}
	@Then("none of the checkbox will be selected by default")
	public void none_of_the_checkbox_will_be_selected_by_default() {

	}
	@Then("checkbox and appointment type will be highlighted in orange color on the selection")
	public void checkbox_and_appointment_type_will_be_highlighted_in_orange_color_on_the_selection() {

	}
	
	/*
	 * Filter Screen for Invoice screen
	 * */
	
	
	@Given("the user is on Invoice records screen")
	public void the_user_is_on_invoice_records_screen() {

	}
	@When("the user taps on Filter CTA on Invoice records screen")
	public void the_user_taps_on_filter_cta_on_invoice_records_screen() {

	}
	@Then("the checkboxes are displayed based on the appointment type in existing Invoices")
	public void the_checkboxes_are_displayed_based_on_the_appointment_type_in_existing_invoices() {

	}
	@Then("the user can tap on Cancel CTA to to get redirected to the Invoice records list view screen without the applied filters")
	public void the_user_can_tap_on_cancel_cta_to_to_get_redirected_to_the_invoice_records_list_view_screen_without_the_applied_filters() {

	}
	@Then("on the Filter screen user is displayed with the following for Invoice records")
	public void on_the_filter_screen_user_is_displayed_with_the_following_for_invoice_records() {

	}
	@Then("the user can tap on Apply filters to get redirected to the Invoice records list view with the selected filters applied")
	public void the_user_can_tap_on_apply_filters_to_get_redirected_to_the_invoice_records_list_view_with_the_selected_filters_applied() {

	}
	
	/*
	 * Filter Screen for Lab Records screen
	 * */
	
	@Given("the user is on Lab records screen")
	public void the_user_is_on_lab_records_screen() {

	}

	@Then("the user can tap on Cancel CTA to to get redirected to the Lab records list view screen without the applied filters")
	public void the_user_can_tap_on_cancel_cta_to_to_get_redirected_to_the_lab_records_list_view_screen_without_the_applied_filters() {

	}
	
	@Then("the user is displayed with Result accordion")
	public void the_user_is_displayed_with_result_accordion() {

	}
	@Then("the user will be displayed with result checkboxes \\(Ex: Normal, Unknown, Positive, Negative)")
	public void the_user_will_be_displayed_with_result_checkboxes_ex_normal_unknown_positive_negative() {

	}
	@Then("the user will be displayed the number of labs \\(highlighted in orange) in that category in parenthesis next to the result categories ; Ex.  Normal \\({int})")
	public void the_user_will_be_displayed_the_number_of_labs_highlighted_in_orange_in_that_category_in_parenthesis_next_to_the_result_categories_ex_normal(Integer int1) {

	}
	@Then("on the Filter screen user is displayed with the following for Lab records")
	public void on_the_filter_screen_user_is_displayed_with_the_following_for_lab_records() {

	}
	@Then("the user can tap on Apply filters to get redirected to the Lab records list view with the selected filters applied")
	public void the_user_can_tap_on_apply_filters_to_get_redirected_to_the_lab_records_list_view_with_the_selected_filters_applied() {

	}
	@Then("the user is displayed with the Test name accordion with search bar")
	public void the_user_is_displayed_with_the_test_name_accordion_with_search_bar() {

	}
	@Then("by default, the user will see the labs in the search list below the search bar")
	public void by_default_the_user_will_see_the_labs_in_the_search_list_below_the_search_bar() {

	}
	@Then("the user can tap on any lab from the list to select it")
	public void the_user_can_tap_on_any_lab_from_the_list_to_select_it() {

	}
	@Then("the lab will be highlighted on selection")
	public void the_lab_will_be_highlighted_on_selection() {

	}
	@Then("the user can deselect the lab by tapping again")
	public void the_user_can_deselect_the_lab_by_tapping_again() {

	}
	@Then("the user can select more than one lab")
	public void the_user_can_select_more_than_one_lab() {

	}
	@Then("based on the keywords typed in the search bar, the search result will be filtered")
	public void based_on_the_keywords_typed_in_the_search_bar_the_search_result_will_be_filtered() {

	}
	@Then("the search result and search bar will be reset on tap of close icon")
	public void the_search_result_and_search_bar_will_be_reset_on_tap_of_close_icon() {

	}
	@When("the user taps on Filter CTA on Lab records screen")
	public void the_user_taps_on_filter_cta_on_lab_records_screen() {

	}


	
}
