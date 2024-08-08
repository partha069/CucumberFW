package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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

public class PetCardScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public PetCardScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Home UI Elements
	 */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='petDetailstopnav/0']")
	@FindBy(id = "petDetailstopnav/0")
	public MobileElement _highlights;
	
	@AndroidFindBy(id = "petDetailstopnavText/0")
	@FindBy(id = "petDetailstopnavText/0")
	public MobileElement _highlightsText;
	
	//petDetailstopnav/1
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='petDetailstopnav/1']")
	@FindBy(id = "petDetailstopnav/1")
	public MobileElement _timeline;
	
	@AndroidFindBy(id = "petDetailstopnavText/1")
	@FindBy(id = "petDetailstopnavText/1")
	public MobileElement _timelineText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petDetailstopnavText/Name")
	@FindBy(id = "petDetailstopnavText/Name")
	public MobileElement _Name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petDetailstopnavText/age")
	@FindBy(id = "petDetailstopnavText/age")
	public MobileElement _Age;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/header/left-btn")
	@FindBy(id = "MyPets/Highlights/header/left-btn")
	public MobileElement _backCTAHighlights;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/header/right-btn")
	@FindBy(id = "MyPets/Highlights/header/right-btn")
	public MobileElement _CameraIconHighlights;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petprofile/navigation/left/icn")
	@FindBy(id = "petprofile/navigation/left/icn")
	public MobileElement _backCTATimeLine;
    
	@AndroidFindBy(id = "com.banfield.react.bpht:id/petprofile/navigation/right/icn")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='ViewTimeLine/header/right-btn']")
	public MobileElement _CameraIconTimeLine;
	
	/*
	 * Timeline
	 */
	//0
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/title-txt")
	@FindBy(id = "viewTimeLine/title-txt")
	public MobileElement _previousVisit;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/time-txt/0")
	@FindBy(id = "ViewTimeLine/screen/time-txt/3")
	public MobileElement _timeText;//00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/date-txt/0")
	@FindBy(id = "ViewTimeLine/screen/date-txt/0")
	public MobileElement _dateText;//00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/testType-txt/0")
	@FindBy(id = "ViewTimeLine/screen/testType-txt/0")
	public MobileElement _ComprehensiveExamText;//00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/hospitalName-txt/0")
	@FindBy(id = "ViewTimeLine/screen/hospitalName-txt/0")
	public MobileElement _hospitalNameText;//00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/time-txt/0")
	@FindBy(id = "ViewTimeLine/screen/time-txt/0")
	public MobileElement _dateFromatt; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/0")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/0")
	public MobileElement _ArrowCTA; //00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/3")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/3")
	public MobileElement _ArrowCTA3; //00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/2")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/2")
	public MobileElement _ArrowCTA4; //00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/med-txt/0")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/med-txt/0")
	public MobileElement _metText;//00
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/date-txt/1")
	@FindBy(id = "ViewTimeLine/screen/date-txt/1")
	public MobileElement _dateText2;//0

	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/date-txt/2")
	@FindBy(id = "ViewTimeLine/screen/date-txt/2")
	public MobileElement _dateText3;//0
	
	
	//1
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/time-txt/2")
	@FindBy(id = "ViewTimeLine/screen/time-txt/2")
	public MobileElement _timeText1; //1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/date-txt/2")
	@FindBy(id = "ViewTimeLine/screen/date-txt/2")
	public MobileElement _dateText1;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/testType-txt/2")
	@FindBy(id = "ViewTimeLine/screen/testType-txt/2")
	public MobileElement _ComprehensiveExamText1; //1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/hospitalName-txt/2")
	@FindBy(id = "ViewTimeLine/screen/hospitalName-txt/2")
	public MobileElement _hospitalNameText1;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/med-txt/2")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/med-txt/2")
	public MobileElement _metText1;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/med-txt/4")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/med-txt/4")
	public MobileElement _metText2;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/vacine-txt/2")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/vacine-txt/2")
	public MobileElement _vaccineText1;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/labs-txt/2")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/labs-txt/2")
	public MobileElement _labsText1;//1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/petTimeLineCard/rightArrow-img/2")
	@FindBy(id = "ViewTimeLine/screen/petTimeLineCard/petTimeLineCard-btn/2")
	public MobileElement _ArrowCTA2; //1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/LastvisitsEmpty-txt")
	@FindBy(id = "ViewTimeLine/screen/LastvisitsEmpty-txt")
	public MobileElement _NothingOnFileText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/ViewTimeLine/screen/makeanappointment-btn")//
	@FindBy(id = "ViewTimeLine/screen/makeanappointment-btn")
	public MobileElement _makeAnAppointmentCTATimeLine;
	
	/*
	 * Highlights
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/makeanappointment-btn")
	@FindBy(id = "MyPets/Highlights/makeanappointment-btn")
	public MobileElement _makeAnAppointmentCTAHighlights;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/title-txt")
	@FindBy(id = "MyPets/Highlights/title-txt")
	public MobileElement _dashboardText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive")
	public MobileElement _comprehensiveExam;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/Comprehensive-txt")
	@FindBy(id = "Highlights/AccordianScreens/Comprehensive-txt")
	public MobileElement _comprehensiveExam_WeightTrackerDetails;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/vaccinations")
	@FindBy(id = "mypets/viewhighlights/accordian/vaccinations")
	public MobileElement _vaccinations;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental")
	@FindBy(id = "mypets/viewhighlights/accordian/dental")
	public MobileElement _dentalExam;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/parasite")
	@FindBy(id = "mypets/viewhighlights/accordian/parasite")
	public MobileElement _parasiteControl;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight")
	@FindBy(id = "mypets/viewhighlights/accordian/weight")
	public MobileElement _weightTracker;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/records")
	@FindBy(id = "mypets/viewhighlights/accordian/records")
	public MobileElement _ShareableRecords;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/records-arrowicon-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/records")
	public MobileElement _ShareableRecordsAccordion;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/shareable/image-icon")
	@FindBy(id = "mypets/highlights/shareable/image-icon")
	public MobileElement _ShareableRecordsBoarding_Logo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/shareable/txt")
	@FindBy(id = "mypets/highlights/shareable/txt")
	public MobileElement _ShareableRecords_BoardingAndGroomingText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/shareable/txt-records")
	@FindBy(id = "mypets/highlights/shareable/txt-records")
	public MobileElement _ShareableRecords_RecordsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/shareable/viewrecords-btn")
	@FindBy(id = "mypets/highlights/shareable/viewrecords-btn")
	public MobileElement _ShareableRecords_viewRecordsCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/profile-arrowicon-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/profile-arrowicon-image-gray")
	public MobileElement _PetProfileAccordion;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/profile")
	@FindBy(id = "mypets/viewhighlights/accordian/profile")
	public MobileElement _PetProfile;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highliuts/exoticpets-txt")
	@FindBy(id = "mypets/highliuts/exoticpets-txt")
	public MobileElement _exoticPetStaticText;
	
	/*
	 * Dental exam
	 */	
	
	//Red >> OK
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-heading-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-heading-txt-orange")
	public MobileElement _dentalExamTextRed; //updated Red
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-image-orange")
	public MobileElement _dentalIndicatorImageRed; //updated Red
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-txt-orange")
	public MobileElement _dentalIndicatorTextRed; //updated Red
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-arrowicon-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-arrowicon-image-orange")
	public MobileElement _dentalAccordionRed; //update Red
	
	// Yellow
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-heading-txt-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-heading-txt")
	public MobileElement _dentalExamText; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-icon-image-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-icon-image-yellow")
	public MobileElement _dentalIndicatorImageYellow; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-txt-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-txt-yellow")
	public MobileElement _dentalIndicatorTextYellow; //updated Yellow
	
	//Green >> OK
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-heading-txt-green")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-heading-txt-green")
	public MobileElement _dentalExamTextGreen; //updated Green

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-image-green")
	public MobileElement _dentalIndicatorImageGreen; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-txt-green")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-txt-green")
	public MobileElement _dentalIndicatorTextGreen; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-arrowicon-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-arrowicon-image-green")
	public MobileElement _dentalAccordionGreen; //updated Green
	
	//Gray >> OK
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-heading-txt-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-heading-txt-gray")
	public MobileElement _dentalTextGray; //updated Gray
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-image-gray")
	public MobileElement _dentalIndicatorImageGray; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-indicator-txt-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-indicator-txt-gray")
	public MobileElement _dentalIndicatorTextGray; //updated Gray
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-arrowicon-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-arrowicon-image-gray")
	public MobileElement _dentalAccordionGray; //updated Gray 
	
	
	//Yellow
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-icon-image")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-icon-image")
	public MobileElement _dentalExamLogoImage;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-arrowicon-image-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-arrowicon-image-yellow")
	public MobileElement _dentalAccordion; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental-arrowicon-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/dental-arrowicon-image-gray")
	public MobileElement _dentalGrayAccordion; //updated Gray same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/next-due-txt")
	@FindBy(id = "mypets/highlights/dental/next-due-txt")
	public MobileElement _dentalDate; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/owp-img")
	@FindBy(id = "mypets/highlights/dental/owp-img")
	public MobileElement _dentalOWPLOGO; 
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/owp-txt")
	@FindBy(id = "mypets/highlights/dental/owp-txt")
	public MobileElement _dentalOWPText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/for-pet-love-txt")
	@FindBy(id = "mypets/highlights/dental/for-pet-love-txt")
	public MobileElement _dentalForPetLoveText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/manage-btn")
	@FindBy(id = "mypets/highlights/dental/manage-btn")
	public MobileElement _dentalManagePlanCTA; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/dental/enrollnow-btn")
	@FindBy(id = "mypets/highlights/dental/enrollnow-btn")
	public MobileElement _dentalEnrollNowCTA;
	

    /*
     * Comprehensive Exam
     */
	
	//Red - Overdue
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-arrowicon-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-arrowicon-image-orange")
	public MobileElement _comprehensiveExamAccordionsRed;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-heading-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-heading-txt-orange")
	public MobileElement _comprehensiveExamIndicatorRed;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-indicator-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-indicator-image-orange")
	public MobileElement _comprehensiveExamIndicatorImageRed;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-indicator-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-indicator-txt-orange")
	public MobileElement _comprehensiveExamIndicatorTextRed;
	
	
	//Due - 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-arrowicon-image")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-arrowicon-image")
	public MobileElement _comprehensiveExamAccordions; //
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-indicator-image")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-indicator-image")
	public MobileElement _comprehensiveExamIndicatorImage; //
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/comprehensive-indicator-txt")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-indicator-txt")
	public MobileElement _comprehensiveExamIndicatorText; //
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/comprehensive/nextdue-txt")
	@FindBy(id = "comprehensive/nextdue-txt")
	public MobileElement _comprehensiveExamduedateText; //same
	 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/comprehensive/plan-txt1")
	@FindBy(id = "comprehensive/plan-txt1")
	public MobileElement _comprehensiveExamOWPText; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/comprehensive/plan-txt2")
	@FindBy(id = "comprehensive/plan-txt2")
	public MobileElement _comprehensiveExamplanText; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/comprehensive/manage-btn")
	@FindBy(id = "mypets/highlights/comprehensive/manage-btn")
	public MobileElement _comprehensivemanageplancta; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/comprehensive/manage-btn")
	@FindBy(id = "mypets/highlights/comprehensive/manage-btn")
	public MobileElement _comprehensiveManageplanCTARed;//same
	
	
	/*
	 * vaccacination
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/vaccinations-arrowicon-image")
	@FindBy(id = "mypets/viewhighlights/accordian/vaccinations-arrowicon-image")
	public MobileElement _vaccinationAccordions; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/vaccinations-indicator-image")
	@FindBy(id = "mypets/viewhighlights/accordian/vaccinations-indicator-image")
	public MobileElement _vaccinationIndicatorImage; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/vaccinations-indicator-txt")
	@FindBy(id = "mypets/viewhighlights/accordian/comprehensive-indicator-txt")
	public MobileElement _vaccinationIndicatorText;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/vaccination-name-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/vaccination-name-txt")
	public MobileElement _vaccinenameText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/lastDateGiven-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/lastDateGiven-txt")
	public MobileElement _vaccinelastdategivenText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/dueDate-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/dueDate-txt")
	public MobileElement _VaccineduedateText;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/dontgiven-vaccination-name-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/dontgiven-vaccination-name-txt")
	public MobileElement _VaccineName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/dontgiven-name-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/dontgiven-name-txt")
	public MobileElement _Donotgive_dateText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/dontgiven-na-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/dontgiven-na-txt")
	public MobileElement _Bordetella_VaccineNAText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/dontgiven-na-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/dontgiven-na-txt")
	public MobileElement _Lyme_VaccineNAText;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/lastDate-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/lastDate-txt")
	public MobileElement _vaccinationDate1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/viewTimeLine/screen/Vaccinations/duDateVlue-txt")
	@FindBy(id = "viewTimeLine/screen/Vaccinations/duDateVlue-txt")
	public MobileElement _vaccinationDate2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/1-indicator-image")
	@FindBy(id = "1-indicator-image")
	public MobileElement _vaccinationStatus;
	
	
    /*
     * Weight Tracter
     */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-icon-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-icon-image-green")
	public MobileElement _weightTracterLogoImage; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-heading-txt-green")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-heading-txt-green")
	public MobileElement _weightTracter; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-arrowicon-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-arrowicon-image-green")
	public MobileElement _weightTracterAccordion; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-image-green")
	public MobileElement _weightTracterIndicatorImage; //updated Green
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-txt-green")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-txt-green")
	public MobileElement _weightTracterIndicatorText; //updated Green
	
	//Underweight status
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-icon-image-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-icon-image-yellow")
	public MobileElement _weightTracterLogoImageUnderweight; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-heading-txt-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-heading-txt-yellow")
	public MobileElement _weightTracterUnderweight; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-image-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-image-yellow")
	public MobileElement _weightTracterIndicatorImageUnderweight; //updated Yellow
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-txt-yellow")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-txt-yellow")
	public MobileElement _weightTracterIndicatorTextUnderweight; //updated Yellow
	
	//Red Obese
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-arrowicon-image-red")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-arrowicon-image-red")
	public MobileElement _weightTracterAccordionObese; //updated Obese
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-icon-image-red")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-icon-image-red")
	public MobileElement _weightTracterLogoImageObese; //updated Obese
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-heading-txt-red")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-heading-txt-red")
	public MobileElement _weightTracterObese; //updated Obese
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-image-red")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-image-red")
	public MobileElement _weightTracterIndicatorImageObese; //updated Obese
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/weight-indicator-txt-red")
	@FindBy(id = "mypets/viewhighlights/accordian/weight-indicator-txt-red")
	public MobileElement _weightTracterIndicatorTextObese; //updated Obese
	
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/WeightTracker-txt")
	@FindBy(id = "Highlights/AccordianScreens/WeightTracker-txt")
	public MobileElement _weightTracterBodyConditionScoreText; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/WeightTracker-txt")
	@FindBy(id = "Highlights/AccordianScreens/WeightTracker-txt")
	public MobileElement _weightTracterBodyConditionScoreNumberText; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/weighttracker/weight-graph-image")
	@FindBy(id = "Highlights/AccordianScreens/weighttracker/weight-graph-image")
	public MobileElement _weightTracterChart; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/weighttracker/date-txt/0")
	@FindBy(id = "Highlights/AccordianScreens/weighttracker/date-txt/0")
	public MobileElement _weightTracterDate; //same
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/AccordianScreens/weighttracker/lbs-txt/0")
	@FindBy(id = "Highlights/AccordianScreens/weighttracker/lbs-txt/0")
	public MobileElement _weightTracterWeight; //same
	
	//@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/comprehensive/manage-btn")
	//@FindBy(id = "mypets/highlights/comprehensive/manage-btn")
	//public MobileElement _manageplancta;
	
    /*
     * pet profile
     */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/species-txt")
	@FindBy(id = "mypets/profile-screen/species-txt")
	public MobileElement _petprofilespecies; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/breed-txt")
	@FindBy(id = "mypets/profile-screen/breed-txt")
	public MobileElement _petprofilebreed;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/color-txt")
	@FindBy(id = "mypets/profile-screen/color-txt")
	public MobileElement _petprofilecolor;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/pet-birthday-txt")
	@FindBy(id = "mypets/profile-screen/pet-birthday-txt")
	public MobileElement _petprofilebirthday;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/allergies-txt")
	@FindBy(id = "mypets/profile-screen/allergies-txt")
	public MobileElement _petprofileallergies;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/medical-allergies-txt")
	@FindBy(id = "mypets/profile-screen/medical-allergies-txt")
	public MobileElement _petprofilemedicalallergies;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/microchip-tag-1-txt")
	@FindBy(id = "mypets/profile-screen/microchip-tag-1-txt")
	public MobileElement _petprofilemicrochip;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/profile-screen/rabies-tag-txt")
	@FindBy(id = "mypets/profile-screen/rabies-tag-txt")
	public MobileElement _petprofilerabies;
	
	/*
	 * Parasite
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/parasite-arrowicon-image")
	@FindBy(id = "mypets/viewhighlights/accordian/parasite-arrowicon-image")
	public MobileElement _parasiteaccordian;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/prevention-last-date-given-lbl")
	@FindBy(id = "Highlights/Screen/ParasiteControl/prevention-last-date-given-lbl")
	public MobileElement _parasitelastdategiven; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/parasite-indicator-image")
	@FindBy(id = "mypets/viewhighlights/accordian/parasite-indicator-image")
	public MobileElement _parasiteIndicatorText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/prevention-due-date-lbl")
	@FindBy(id = "Highlights/Screen/ParasiteControl/prevention-due-date-lbl")
	public MobileElement _parasiteduedate; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/prevention-category-txt")
	@FindBy(id = "Highlights/Screen/ParasiteControl/prevention-category-txt")
	public MobileElement _parasitepreventionname; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/parasite/order-parasite-btn")
	@FindBy(id = "parasite/order-parasite-btn")
	public MobileElement _orderparasitecontrolcta; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/1-indicator-image")
	@FindBy(id = "1-indicator-image")
	public MobileElement _orderparasiteindicatorimage; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/dontgiven-vaccination-name-txt")
	@FindBy(id = "Highlights/Screen/ParasiteControl/dontgiven-vaccination-name-txt")
	public MobileElement _parasiteVaccinationName; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/dontgiven-name-txt")
	@FindBy(id = "Highlights/Screen/ParasiteControl/dontgiven-name-txt")
	public MobileElement _parasiteDontGiveName; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Highlights/Screen/ParasiteControl/dontgiven-na-txt")
	@FindBy(id = "Highlights/Screen/ParasiteControl/dontgiven-na-txt")
	public MobileElement _parasiteDontGiveNA;

	
	/*
	 * Pets - Widgets
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchatgo/title-txt")
	@FindBy(id = "MyPets/Highlights/vetchatgo/title-txt")
	public MobileElement _VetChatGoWigetsPets; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/owp/icon-img")
	@FindBy(id = "MyPets/Highlights/owp/icon-img")
	public MobileElement _OwpWigets; 
	                 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchat/icon-img")
	@FindBy(id = "MyPets/Highlights/vetchat/icon-img")
	public MobileElement _VetChatWigets;
	
	/*
	 * VetChatGo Plan
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchatgo/title-txt")
	@FindBy(id = "MyPets/Highlights/vetchatgo/title-txt")
	public MobileElement _VetChatGoWigets; 
	        
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchatgo/title-txt")
	@FindBy(id = "MyPets/Highlights/vetchatgo/title-txt")
	public MobileElement _VetChatGoText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchatgo/active-txt")
	@FindBy(id = "MyPets/Highlights/vetchatgo/active-txt")
	public MobileElement _ActiveCarePlusText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchatgo/action-btn")
	@FindBy(id = "MyPets/Highlights/vetchatgo/action-btn")
	public MobileElement _chatWithaVatCTA; 
	
	/*
	 * OWP Plan
	 */      
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/owp/title-txt")
	@FindBy(id = "MyPets/Highlights/owp/title-txt")
	public MobileElement _OwpText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/owp/active-txt")
	@FindBy(id = "MyPets/Highlights/owp/active-txt")
	public MobileElement _ActiveText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/owp/activecare-txt")
	@FindBy(id = "MyPets/Highlights/owp/activecare-txt")
	public MobileElement _specialCareText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/owp/action-btn")
	@FindBy(id = "MyPets/Highlights/owp/action-btn")
	public MobileElement _paymentDetailsCTAForOWP;
	
	/*
	 * Vet Chat Plan
	 */ 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchat/title-txt")
	@FindBy(id = "MyPets/Highlights/vetchat/title-txt")
	public MobileElement _VetChatText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchat/activecare-txt")
	@FindBy(id = "MyPets/Highlights/vetchat/activecare-txt")
	public MobileElement _VetChatStaticText; 
	             
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/vetchat/action-btn")
	@FindBy(id = "MyPets/Highlights/vetchat/action-btn")
	public MobileElement _ChatwithavetCTA; 
	
	/*
	 * Exam
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-icon-image")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-icon-image")
	public MobileElement _examLogo; 
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-heading-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-heading-txt-orange")
	public MobileElement _examText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-arrowicon-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-arrowicon-image-orange")
	public MobileElement _examAccordionRed; //
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-arrowicon-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-arrowicon-image-gray")
	public MobileElement _examAccordionGray; //

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/exam/next-due-txt")
	@FindBy(id = "MyPets/Highlights/vetchat/action-btn")
	public MobileElement _examNextDueDate;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/exam/owp-img")
	@FindBy(id = "mypets/highlights/exam/owp-img")
	public MobileElement _examOWPLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/exam/owp-txt")
	@FindBy(id = "mypets/highlights/exam/owp-txt")
	public MobileElement _examOWPText;//
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/exam/for-pet-love-txt")
	@FindBy(id = "mypets/highlights/exam/for-pet-love-txt")
	public MobileElement _examForPetYouLoveText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/exam/enrollnow-btn")
	@FindBy(id = "mypets/highlights/exam/enrollnow-btn")
	public MobileElement _examEnrollNow; 
	//Red
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-orange")
	public MobileElement _examRedIndicator; 
	//Red
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-orange")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-orange")
	public MobileElement _examRedIndicatorText; 
	//grey
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-gray")
	public MobileElement _examGreyIndicator; 
	//grey 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-gray")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-gray")
	public MobileElement _examGreyIndicatorText; 
	//Green
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-green")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-image-green")
	public MobileElement _examGreenIndicator; 
	//Green 
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-green")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup-indicator-txt-green")
	public MobileElement _examGreenIndicatorText; 
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/preventivecareCheckup")
	@FindBy(id = "mypets/viewhighlights/accordian/preventivecareCheckup")
	public MobileElement _exam; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/vaccinations")
	@FindBy(id = "mypets/viewhighlights/accordian/vaccinations")
	public MobileElement _vaccination; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/parasite")
	@FindBy(id = "mypets/viewhighlights/accordian/parasite")
	public MobileElement _pasasiteControl; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/viewhighlights/accordian/dental")
	@FindBy(id = "mypets/viewhighlights/accordian/dental")
	public MobileElement _dental;

	public void verifyShareableRecords() throws Throwable {
		Thread.sleep(2000);
		softassert.assertTrue(_ShareableRecordsBoarding_Logo.isDisplayed());
		softassert.assertTrue(_ShareableRecords_BoardingAndGroomingText.isDisplayed());
	//	softassert.assertTrue(_ShareableRecords_RecordsText.isDisplayed());
		softassert.assertTrue(_ShareableRecords_viewRecordsCTA.isDisplayed());
	    softassert.assertAll();
	}
	

	public void verifyAccordions() {
		softassert.assertTrue(_comprehensiveExamAccordions.isDisplayed());
		softassert.assertTrue(_vaccinationAccordions.isDisplayed());
		softassert.assertTrue(_dentalAccordion.isDisplayed());
		ScrolltoElement("Weight tracker");
		softassert.assertTrue(_parasiteaccordian.isDisplayed());
		softassert.assertTrue(_weightTracterAccordion.isDisplayed());
	    softassert.assertAll();
	}
	
	public void verifyweightTracter() {
		softassert.assertTrue(_weightTracterBodyConditionScoreText.isDisplayed());
		softassert.assertTrue(_weightTracterBodyConditionScoreNumberText.isDisplayed());
		softassert.assertTrue(_weightTracterChart.isDisplayed());
		ScrolltoElement("Nov 7, 2021");
		softassert.assertTrue(_weightTracterDate.isDisplayed());
		softassert.assertTrue(_weightTracterWeight.isDisplayed());
        softassert.assertAll();
	}
	//OK Red
	public void verifyDentalExamRed() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_dentalExamTextRed.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorImageRed.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorTextRed.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorTextRed.isDisplayed());
	    softassert.assertAll();
	}
	// Yellow
	public void verifyDentalExamYellow() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_dentalExamText.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorImageYellow.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorTextYellow.isDisplayed()); 
		softassert.assertTrue(_dentalForPetLoveText.isDisplayed());
	    softassert.assertAll();
	}
	
	//OK Green
	public void verifyDentalExamGreen() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_dentalExamTextGreen.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorImageGreen.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorTextGreen.isDisplayed()); 
		softassert.assertTrue(_dentalForPetLoveText.isDisplayed());
	    softassert.assertAll();
	}
	
	//OK Gray
	public void verifyDentalExamGreenGray() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_dentalTextGray.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorImageGray.isDisplayed()); 
		softassert.assertTrue(_dentalIndicatorTextGray.isDisplayed()); 
		softassert.assertTrue(_dentalForPetLoveText.isDisplayed());
	    softassert.assertAll();
	}

	public void verifyparasitecontrolUI() {
		softassert.assertTrue(_parasitelastdategiven.isDisplayed()); 
		softassert.assertTrue(_parasiteIndicatorText.isDisplayed());
		softassert.assertTrue(_parasiteduedate.isDisplayed());
		softassert.assertTrue(_parasitepreventionname.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyListOfPreviousvisits() {
		softassert.assertTrue(_dateText.isDisplayed());
		softassert.assertTrue(_dateText2.isDisplayed());
		softassert.assertTrue(_dateText3.isDisplayed());
	    softassert.assertAll();
	}
	
	public void VetChatsections() {
	//	softassert.assertTrue(_OWPText.isDisplayed()); //Wrong Need to check test data
	//	softassert.assertTrue(_ActiveCarePlusText.isDisplayed());
		softassert.assertTrue(_paymentDetailsCTAForOWP.isDisplayed());
		softassert.assertAll();
	}
	public void verifydefaultordering() {
		ScrolltoElement("Comprehensive exam");
		softassert.assertTrue(_comprehensiveExam.isDisplayed());
		softassert.assertTrue(_vaccinations.isDisplayed());
		softassert.assertTrue(_dentalExam.isDisplayed());
		ScrolltoElement("Weight tracker");
		softassert.assertTrue(_parasiteControl.isDisplayed());
		softassert.assertTrue(_weightTracker.isDisplayed());
		ScrolltoElement("Pet profile");
		softassert.assertTrue(_ShareableRecords.isDisplayed());
		softassert.assertTrue(_PetProfile.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNothingonfileText() {
		softassert.assertTrue(_NothingOnFileText.isDisplayed());
		softassert.assertTrue(_makeAnAppointmentCTATimeLine.isDisplayed());
		softassert.assertAll();
		
	}
	public void verifyPreviousVisit() {
		softassert.assertTrue(_timeText1.isDisplayed());
		softassert.assertTrue(_dateText1.isDisplayed());
		softassert.assertTrue(_ComprehensiveExamText1.isDisplayed());
		softassert.assertTrue(_hospitalNameText1.isDisplayed());
		softassert.assertTrue(_metText1.isDisplayed());
		softassert.assertTrue(_vaccineText1.isDisplayed());
		softassert.assertTrue(_labsText1.isDisplayed());
		softassert.assertAll();	
	}
	
	public void VerifyMedVaccineLabs() {
		Scroll("September 10th, 2021");
		softassert.assertTrue(_metText1.isDisplayed());
		softassert.assertTrue(_vaccineText1.isDisplayed());
		softassert.assertTrue(_labsText1.isDisplayed());
	}
	
	public void VerifyPetCardScreen() {
		softassert.assertTrue(_Age.isDisplayed());
		softassert.assertTrue(_Name.isDisplayed());
		softassert.assertTrue(_highlights.isDisplayed());
		softassert.assertTrue(_timeline.isDisplayed());
		softassert.assertAll();
	}
	
	public void VerifyComprehensiveexamUI() {
		softassert.assertTrue(_comprehensivemanageplancta.isDisplayed());
	//	softassert.assertTrue(_comprehensiveExamIndicatorImage.isDisplayed());
		softassert.assertTrue(_comprehensiveExamIndicatorText.isDisplayed());
		softassert.assertTrue(_comprehensiveExamduedateText.isDisplayed());
		softassert.assertTrue(_comprehensiveExamOWPText.isDisplayed());
		softassert.assertTrue(_comprehensiveExamplanText.isDisplayed());
		softassert.assertAll();
	}
	
	public void VerifyComprehensiveexamRed() {
		softassert.assertTrue(_comprehensiveExamIndicatorRed.isDisplayed());
		softassert.assertTrue(_comprehensiveExamIndicatorImageRed.isDisplayed());
		softassert.assertTrue(_comprehensiveExamIndicatorTextRed.isDisplayed());
		softassert.assertTrue(_comprehensiveExamduedateText.isDisplayed());
		softassert.assertTrue(_comprehensiveExamOWPText.isDisplayed());
		softassert.assertTrue(_comprehensiveExamplanText.isDisplayed());
		softassert.assertTrue(_comprehensivemanageplancta.isDisplayed());
		softassert.assertTrue(_comprehensiveManageplanCTARed.isDisplayed());
		softassert.assertAll();
	}
	
	public void VerifyVaccinecardUI() {
//		softassert.assertTrue(_vaccinationAccordions.isDisplayed());
//		softassert.assertTrue(_vaccinationIndicatorImage.isDisplayed());
//		softassert.assertTrue(_vaccinationIndicatorText.isDisplayed());
		softassert.assertTrue(_vaccinenameText.isDisplayed());
		softassert.assertTrue(_vaccinelastdategivenText.isDisplayed());
		softassert.assertTrue(_VaccineduedateText.isDisplayed());
		softassert.assertAll();
	}
	
	public void Verify_vaccine_was_never_administered_but_addedUI() {
		softassert.assertTrue(_Donotgive_dateText.isDisplayed());
		softassert.assertTrue(_Lyme_VaccineNAText.isDisplayed());
		softassert.assertAll();
	}

	
	public void VerifypetprofileUI() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(_petprofilespecies.isDisplayed());
		softassert.assertTrue(_petprofilebreed.isDisplayed());
	//	softassert.assertTrue(_petprofilecolor.isDisplayed());
	//	ScrolltoElement("Rabies tag");
	//	softassert.assertTrue(_petprofilebirthday.isDisplayed());
	//	softassert.assertTrue(_petprofileallergies.isDisplayed());
	//	softassert.assertTrue(_petprofilemedicalallergies.isDisplayed());
	//	softassert.assertTrue(_petprofilemicrochip.isDisplayed());
	//	softassert.assertTrue(_petprofilerabies.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyExam() {
		softassert.assertTrue(_examOWPText.isDisplayed());
		softassert.assertTrue(_examRedIndicatorText.isDisplayed());
		softassert.assertTrue(_examForPetYouLoveText.isDisplayed());
	    softassert.assertAll();
	}
	
	
}
