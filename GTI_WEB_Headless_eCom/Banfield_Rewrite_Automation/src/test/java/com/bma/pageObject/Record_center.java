package com.bma.pageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Record_center extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Record_center(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * record center module element
	 */
	//@AndroidFindBy(id = "petDetailstopnav/2")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='petDetailstopnavText/2']")
	@FindBy(id = "petDetailstopnav/2")
	public MobileElement _recordscta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-0")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-0")
	public MobileElement _Visit_corosel;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-1")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-1")
	public MobileElement _Exam_Outpatient_corosel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-2")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/VisitDetails-2")
	public MobileElement _Invoice_corosel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/ModifiedListLabResults-3")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/ModifiedListLabResults-3")
	public MobileElement _Lab_Records_corosel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/ModifiedMedications-4")
	@FindBy(id = "/home/petProfile/recordtab/recordCarouselItem/img/ModifiedMedications-4")
	public MobileElement _Medication_corosel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/ModifiedVaccines-5")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/ModifiedVaccines-5")
	public MobileElement _Vaccine_corosel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-visit-summary")
	@FindBy(id = "records-header-visit-summary")
	public MobileElement _Visit_text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-exam-and-outpatient")
	@FindBy(id = "records-header-exam-and-outpatient")
	public MobileElement _Exam_Outpatient_text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-invoice")
	@FindBy(id = "records-header-invoice")
	public MobileElement _Invoice_text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-lab-records")
	@FindBy(id = "records-header-lab-records")
	public MobileElement _Lab_text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-medication")
	@FindBy(id = "records-header-medication")
	public MobileElement _Medication_text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-vaccine")
	@FindBy(id = "records-header-vaccine")
	public MobileElement _vaccine_text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-nothing-on-file-txt")
	@FindBy(id = "records-nothing-on-file-txt")
	public MobileElement _nothing_on_file_text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-no-content-message-txt")
	@FindBy(id = "records-no-content-message-txt")
	public MobileElement _is_this_error_text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-no-content-dialer-cta")
	@FindBy(id = "records-no-content-dialer-cta")
	public MobileElement _dialer_cta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-no-content-chat-live-cta")
	@FindBy(id = "records-no-content-chat-live-cta")
	public MobileElement _Chat_live_now_cta;
	
	
	/*
	 * Boarder & Groomer
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petProfile/recordtab/recordCarouselItem/img/ModifiedBoarderGrommers-6")
	@FindBy(id = "home/petProfile/recordtab/recordCarouselItem/img/ModifiedBoarderGrommers-6")
	public MobileElement _boarderAndGroomerCorose;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-header-boarder-and-groomer")
	@FindBy(id = "records-header-boarder-and-groomer")
	public MobileElement _BoarderAndGroomerRecordsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/boarder-and-groomer/download-all-btn")
	@FindBy(id = "records/boarder-and-groomer/download-all-btn")
	public MobileElement _downloadCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine-history-heading/records/boarder-and-groomer/record-item0")
	@FindBy(id = "records/vaccine-history-heading/records/boarder-and-groomer/record-item0")
	public MobileElement _vaccinationHistoryAccordions;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/parasite-control-heading/records/boarder-and-groomer/record-item0")
	@FindBy(id = "records/parasite-control-heading/records/boarder-and-groomer/record-item0")
	public MobileElement _parasiteControlAccordions;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/parasite-test-heading/records/boarder-and-groomer/record-item0")
	@FindBy(id = "records/parasite-test-heading/records/boarder-and-groomer/record-item0")
	public MobileElement _ParasiteTestsAccordions;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/vaccines/vaccines-description")
	@FindBy(id = "mypets/records/boarder-groomer/vaccines/vaccines-description")
	public MobileElement _vaccinesStatictext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/vaccines/lastDateGiven-txt")
	@FindBy(id = "mypets/records/boarder-groomer/vaccines/lastDateGiven-txt")
	public MobileElement _lastDateGiveStatictext; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/vaccines/lastDate-txt")
	@FindBy(id = "mypets/records/boarder-groomer/vaccines/lastDate-txt")
	public MobileElement _lastDateGiveDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/vaccines/dueDate-txt")
	@FindBy(id = "mypets/records/boarder-groomer/vaccines/dueDate-txt")
	public MobileElement _dueDateStatictext; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/vaccines/dueDate-date")
	@FindBy(id = "mypets/records/boarder-groomer/vaccines/dueDate-date")
	public MobileElement _dueDateDate;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@FindBy(id = "permission_allow_button")
	public MobileElement _AllowPopups;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-Description")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-Description")
	public MobileElement _parasiteDescription;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-Medication")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-Medication")
	public MobileElement _parasiteMedication;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-lastdateGive-txt")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-lastdateGive-txt")
	public MobileElement _parasitelastdateGive;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-lastdateGive-data")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-lastdateGive-data")
	public MobileElement _parasitelastdateGiveDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-dueDate-txt")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-dueDate-txt")
	public MobileElement _parasiteDueDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasiteControl/parasite-dueDate-data")
	@FindBy(id = "mypets/records/boarder-groomer/parasiteControl/parasite-dueDate-data")
	public MobileElement _parasiteDueDateText;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasitetests-LabTest")
	@FindBy(id = "mypets/records/boarder-groomer/parasitetests-LabTest")
	public MobileElement _parasitetestsLabTest;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasitetests/result-txt")
	@FindBy(id = "mypets/records/boarder-groomer/parasitetests/result-txt")
	public MobileElement _parasiteResult;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasitetests/result-Evaluation")
	@FindBy(id = "mypets/records/boarder-groomer/parasitetests/result-Evaluation")
	public MobileElement _parasiteResultEvaluation;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasitetests/date-txt")
	@FindBy(id = "mypets/records/boarder-groomer/parasitetests/date-txt")
	public MobileElement _parasiteDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/records/boarder-groomer/parasitetests/date-data")
	@FindBy(id = "mypets/records/boarder-groomer/parasitetests/date-data")
	public MobileElement _parasiteDueDateDateText;
	
	
	
	
	
	
	/*
	 * Filter 
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/visit-summary/filter-btn")
	@FindBy(id = "records/visit-summary/filter-btn")
	public MobileElement _visitSummaries_FilterCTA;
		
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/visit-summary/record-item0/download-icon-touchable")
	@FindBy(id = "records/visit-summary/record-item0/download-icon-touchable")
	public MobileElement _visitSummaries_downloadCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/record/filter-by-txt")
	@FindBy(id = "record/filter-by-txt")
	public MobileElement _filterByText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/record/clear-filter")
	@FindBy(id = "record/clear-filter")
	public MobileElement _clearallCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/filter-1-heading-txt-gray")
	@FindBy(id = "filter-1-heading-txt-gray")
	public MobileElement _dateRangeText;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/filter/Date range")
//	@FindBy(id = "filter/Date range")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/filter/Date")
	@FindBy(id = "filter/Date")
	public MobileElement _dateRangeAccordionCTA;
	
    @AndroidFindBy(id = "com.banfield.react.bpht:id/filter/Location")
	@FindBy(id = "filter/Location")
	public MobileElement _locationAccordionCTA;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/filter/Visit type")
//	@FindBy(id = "filter/Visit type")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/filter/Visit")
	@FindBy(id = "filter/Visit")
	public MobileElement _visitTypeAccordionCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/filter/applyfilters")
	@FindBy(id = "records/filter/applyfilters")
	public MobileElement _applyFiltersCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/filter/cancel")
	@FindBy(id = "records/filter/cancel")
	public MobileElement _cancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-filter/date-range-checkbox-image/0")
	@FindBy(id = "records-filter/date-range-checkbox-image/0")
	public MobileElement _dataRangeOption;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/visit-summary/all-test-btn")
	@FindBy(id = "records/visit-summary/all-test-btn")
	public MobileElement _viewAllCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/visit-summary/record-item0/item-title-txt")
	@FindBy(id = "records/visit-summary/record-item0/item-title-txt")
	public MobileElement _record_date;
	
	public void verify_Filter() throws Throwable {
		softassert.assertTrue(_filterByText.isDisplayed());
		softassert.assertTrue(_clearallCTA.isDisplayed());
		softassert.assertTrue(_dateRangeText.isDisplayed());
		softassert.assertTrue(_dateRangeAccordionCTA.isDisplayed());
		softassert.assertTrue(_locationAccordionCTA.isDisplayed());
		softassert.assertTrue(_visitTypeAccordionCTA.isDisplayed());
		softassert.assertTrue(_applyFiltersCTA.isDisplayed());
		softassert.assertTrue(_cancelCTA.isDisplayed());
		softassert.assertAll();		
	}
	
	
	
	/**
	 * Exam and Out patient
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/exam-and-outpatient/record-item0/item-title-txt")
	@FindBy(id = "records/exam-and-outpatient/record-item0/item-title-txt")
	public MobileElement _Exam_Date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/exam-and-outpatient/record-item0/item-hotpitalname-txt")
	@FindBy(id = "records/exam-and-outpatient/record-item0/item-hotpitalname-txt")
	public MobileElement _Exam_hospitalname_state;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/exam-and-outpatient/record-item0/item-reason-txt")
	@FindBy(id = "records/exam-and-outpatient/record-item0/item-reason-txt")
	public MobileElement _Exam_Appointment_type;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/exam-and-outpatient/record-item0/download-icon-touchable")
	@FindBy(id = "records/exam-and-outpatient/record-item0/download-icon-touchable")
	public MobileElement _Exam_Download;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/exam-and-outpatient/filter-btn")
	@FindBy(id = "records/exam-and-outpatient/filter-btn")
	public MobileElement _Exam_filter;

	
	public void verify_Exam_and_Outpatient() throws Throwable {
		softassert.assertTrue(_Exam_Date.isDisplayed());
		softassert.assertTrue(_Exam_hospitalname_state.isDisplayed());
		softassert.assertTrue(_Exam_Appointment_type.isDisplayed());
		softassert.assertTrue(_Exam_Download.isDisplayed());
		softassert.assertTrue(_Exam_filter.isDisplayed());
		softassert.assertAll();		
	}
	

	/**
	 * Invoice
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/invoice/record-item0/item-title-txt")
	@FindBy(id = "records/invoice/record-item0/item-title-txt")
	public MobileElement _Invoice_Date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/invoice/record-item0/item-hospitalname-txt")
	@FindBy(id = "records/invoice/record-item0/item-hospitalname-txt")
	public MobileElement _Invoice_hospitalname_state;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/invoice/record-item0/item-appointment-reason-txt")
	@FindBy(id = "records/invoice/record-item0/item-appointment-reason-txt")
	public MobileElement _Invoice_Appointment_type;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/invoice/record-item0/download-icon-touchable")
	@FindBy(id = "records/invoice/record-item0/download-icon-touchable")
	public MobileElement _Invoice_Download;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/invoice/filter-btn")
	@FindBy(id = "records/invoice/filter-btn")
	public MobileElement _Invoice_filter;
	
	
	public void verify_Invoice() throws Throwable {
		softassert.assertTrue(_Invoice_Date.isDisplayed());
		softassert.assertTrue(_Invoice_hospitalname_state.isDisplayed());
		softassert.assertTrue(_Invoice_Appointment_type.isDisplayed());
		softassert.assertTrue(_Invoice_Download.isDisplayed());
		softassert.assertTrue(_Invoice_filter.isDisplayed());
		softassert.assertAll();		
	}
	
	
	/**
	 * Labs
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/record-item0/date-txt")
	@FindBy(id = "records/lab-records/record-item0/date-txt")
	public MobileElement _Labs_Date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/record-item0/location-txt")
	@FindBy(id = "records/lab-records/record-item0/location-txt")
	public MobileElement _Labs_hospitalname_state;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/record-item0/test-count")
	@FindBy(id = "records/lab-records/record-item0/test-count")
	public MobileElement _Labs_NO_of_test;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/download-all-btn")
	@FindBy(id = "records/lab-records/download-all-btn")
	public MobileElement _Labs_Downloadall;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/all-test-btn")
	@FindBy(id = "records/lab-records/all-test-btn")
	public MobileElement _Labs_alltests_cta;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/test-date-lbl")
	@FindBy(id = "lab-records/test-date-lbl")
	public MobileElement _Labs_date_expanded;


	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/lab-test/name-lbl/0")
	@FindBy(id = "lab-records/lab-test/name-lbl/0")
	public MobileElement _Labs_Name_cta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/results-lbl/0")
	@FindBy(id = "lab-records/results-lbl/0")
	public MobileElement _Labs_result;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/range-lbl/0")
	@FindBy(id = "lab-records/range-lbl/0")
	public MobileElement _Labs_range;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/value-lbl/0")
	@FindBy(id = "lab-records/value-lbl/0")
	public MobileElement _Labs_value;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/results-txt/0")
	@FindBy(id = "lab-records/results-txt/0")
	public MobileElement _Labs_result_answer;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/range-txt/0")
	@FindBy(id = "lab-records/range-txt/0")
	public MobileElement _Labs_range_answer;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/lab-records/value-txt/0")
	@FindBy(id = "lab-records/value-txt/0")
	public MobileElement _Labs_value_answer;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/lab-records/filter-btn")
	@FindBy(id = "records/lab-records/filter-btn")
	public MobileElement _Lab_filter;
	
	public void verify_Labs_records() throws Throwable {
		softassert.assertTrue(_Labs_Date.isDisplayed());
		softassert.assertTrue(_Labs_hospitalname_state.isDisplayed());
		softassert.assertTrue(_Labs_NO_of_test.isDisplayed());
		softassert.assertTrue(_Labs_Downloadall.isDisplayed());
		softassert.assertTrue(_Lab_filter.isDisplayed());
		softassert.assertAll();		
	}
	
	public void verify_Labs_records_expendedview() throws Throwable {
		softassert.assertTrue(_Labs_alltests_cta.isDisplayed());
		//softassert.assertTrue(_Labs_date_expanded.isDisplayed());
		swipeDown();
		softassert.assertTrue(_Labs_Name_cta.isDisplayed());
		softassert.assertTrue(_Labs_Downloadall.isDisplayed());
		swipeDown();
		softassert.assertTrue(_Labs_result.isDisplayed());
		softassert.assertTrue(_Labs_range.isDisplayed());
		softassert.assertTrue(_Labs_value.isDisplayed());
		softassert.assertTrue(_Labs_result_answer.isDisplayed());
		softassert.assertTrue(_Labs_range_answer.isDisplayed());
		softassert.assertTrue(_Labs_value_answer.isDisplayed());
		softassert.assertAll();		
	}
	
	/**
	 * Medication
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/medication-history/records/medication/record-item0")
	@FindBy(id = "records/medication-history/records/medication/record-item0")
	public MobileElement _Medication_accordian_btn;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/medication-history/records/medication/record-item0-heading-txt-gray")
	@FindBy(id = "records/medication-history/records/medication/record-item0-heading-txt-gray")
	public MobileElement _Medication_date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/medication-history/records/medication/record-item0-arrowicon-image-gray")
	@FindBy(id = "records/medication-history/records/medication/record-item0-arrowicon-image-gray")
	public MobileElement _Medication_accordian_arrow;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/medication/download-all-btn")
	@FindBy(id = "records/medication/download-all-btn")
	public MobileElement _Medication_Downloadall;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/item-Description/records/medication/record-item0")
	@FindBy(id = "records/item-Description/records/medication/record-item0")
	public MobileElement _Medication_Name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/item-Doctor/records/medication/record-item0")
	@FindBy(id = "records/item-Doctor/records/medication/record-item0")
	public MobileElement _Medication_DoctorName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/item-Location/records/medication/record-item0")
	@FindBy(id = "records/item-Location/records/medication/record-item0")
	public MobileElement _Medication_Location;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/medication/filter-btn")
	@FindBy(id = "records/medication/filter-btn")
	public MobileElement _Medication_filter;
	
	/*
	 * Popups - Native
	 */
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='permission_allow_button']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
	@FindBy(id = "permission_allow_button")
	public MobileElement _allow_popups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _dont_allow_popups;
	
	public void verify_Medication_records() throws Throwable {
		softassert.assertTrue(_Medication_accordian_btn.isDisplayed());
	//	softassert.assertTrue(_Medication_date.isDisplayed());
	//	softassert.assertTrue(_Medication_accordian_arrow.isDisplayed());
		softassert.assertTrue(_Medication_Downloadall.isDisplayed());
		softassert.assertTrue(_Medication_filter.isDisplayed());
		softassert.assertAll();		
	}
	
	public void verify_Medication_records_expanded() throws Throwable {
		softassert.assertTrue(_Medication_Name.isDisplayed());
		softassert.assertTrue(_Medication_DoctorName.isDisplayed());
		softassert.assertTrue(_Medication_Location.isDisplayed());
		softassert.assertAll();		
	}
	
	/**
	 * vaccine
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine-history/records/vaccine/record-item0")
	@FindBy(id = "records/vaccine-history/records/vaccine/record-item0")
	public MobileElement _vaccine_accordian_btn;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine-history/records/vaccine/record-item0-heading-txt-gray")
	@FindBy(id = "records/vaccine-history/records/vaccine/record-item0-heading-txt-gray")
	public MobileElement _vaccine_date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine-history/records/vaccine/record-item0-arrowicon-image-gray")
	@FindBy(id = "records/vaccine-history/records/vaccine/record-item0-arrowicon-image-gray")
	public MobileElement _vaccine_accordian_arrow;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine/download-all-btn")
	@FindBy(id = "records/vaccine/download-all-btn")
	public MobileElement _vaccine_Downloadall;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/vaccine/item-Description/records/vaccine/record-item0")
	@FindBy(id = "vaccine/item-Description/records/vaccine/record-item0")
	public MobileElement _vaccine_Name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/vaccine/item-Doctor/records/vaccine/record-item0")
	@FindBy(id = "vaccine/item-Doctor/records/vaccine/record-item0")
	public MobileElement _vaccine_DoctorName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/vaccine/item-Hospital/records/vaccine/record-item0")
	@FindBy(id = "vaccine/item-Hospital/records/vaccine/record-item0")
	public MobileElement _vaccine_Location;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/vaccine/filter-btn")
	@FindBy(id = "records/vaccine/filter-btn")
	public MobileElement _vaccine_filter;
	
	public void verify_vaccine_records() throws Throwable {
		softassert.assertTrue(_vaccine_accordian_btn.isDisplayed());
	//	softassert.assertTrue(_vaccine_date.isDisplayed());
	//	softassert.assertTrue(_vaccine_accordian_arrow.isDisplayed());
		softassert.assertTrue(_vaccine_Downloadall.isDisplayed());
		softassert.assertTrue(_vaccine_filter.isDisplayed());
		softassert.assertAll();		
	}
	
	public void verify_vaccine_records_expanded() throws Throwable {
		softassert.assertTrue(_vaccine_Name.isDisplayed());
		softassert.assertTrue(_vaccine_DoctorName.isDisplayed());
		softassert.assertTrue(_vaccine_Location.isDisplayed());
		softassert.assertAll();		
	}
	
	public void verifyRecords() throws Throwable {
		softassert.assertTrue(_recordscta.isDisplayed());
		softassert.assertTrue(_Visit_corosel.isDisplayed());
		softassert.assertTrue(_Exam_Outpatient_corosel.isDisplayed());
		softassert.assertTrue(_Invoice_corosel.isDisplayed());
		swipeleft(_Invoice_corosel);
		Thread.sleep(2000);
		softassert.assertTrue(_Lab_Records_corosel.isDisplayed());
		swipeleft(_Lab_Records_corosel);
		Thread.sleep(2000);
	//	softassert.assertTrue(_Medication_corosel.isDisplayed());
		swipeleft(_Medication_corosel);
		Thread.sleep(2000);
		softassert.assertTrue(_Vaccine_corosel.isDisplayed());
		softassert.assertAll();		
	}
	
	public void verify_nothing_on_file_Page() throws Throwable {
		softassert.assertTrue(_nothing_on_file_text.isDisplayed());
		softassert.assertTrue(_is_this_error_text.isDisplayed());
		softassert.assertTrue(_dialer_cta.isDisplayed());
		softassert.assertTrue(_Chat_live_now_cta.isDisplayed());
		softassert.assertAll();		
	}
	
	
	/**
	 * Filter Screen===============================================================================
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/record/clear-filter")
	@FindBy(id = "record/clear-filter")
	public MobileElement _filter_clearall;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/date-range-heading-txt-gray")
	@FindBy(id = "records/date-range-heading-txt-gray")
	public MobileElement _filter_daterange;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-filter/date-range-checkbox-text/0")
	@FindBy(id = "records-filter/date-range-checkbox-text/0")
	public MobileElement _filter_date1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/date-range-heading-txt-gray")
	@FindBy(id = "records/date-range-heading-txt-gray")
	public MobileElement _filter_Location;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-filter/date-range-checkbox-text/0")
	@FindBy(id = "records-filter/date-range-checkbox-text/0")
	public MobileElement _filter_Location1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/date-range-heading-txt-gray")
	@FindBy(id = "records/date-range-heading-txt-gray")
	public MobileElement _filter_visittype;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records-filter/date-range-checkbox-text/0")
	@FindBy(id = "records-filter/date-range-checkbox-text/0")
	public MobileElement _filter_visittype1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/filter/applyfilters")
	@FindBy(id = "records/filter/applyfilters")
	public MobileElement _filter_applyfilter;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/records/filter/cancel")
	@FindBy(id = "records/filter/cancel")
	public MobileElement _filter_cancel;
	
	
	public void verify_filterScreen() throws Throwable {
		softassert.assertTrue(_filter_clearall.isDisplayed());
		softassert.assertTrue(_filter_daterange.isDisplayed());
		softassert.assertTrue(_filter_Location.isDisplayed());
		softassert.assertTrue(_filter_visittype.isDisplayed());
		softassert.assertTrue(_filter_applyfilter.isDisplayed());
		softassert.assertTrue(_filter_cancel.isDisplayed());
		softassert.assertAll();		
	}
	
	


	
	
	
}
