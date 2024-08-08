package com.bma.pageObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.bridge.AbortException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WhenAndWhereScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);
	public String path = "./src/test/resources/TestData/Sprint2/MakeanAppointmentStep8whenandwhere2.csv";

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public WhenAndWhereScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Popups
	 */
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	@FindBy(id = "permission_message")
	public MobileElement _Popups;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id = "Allow While Using App")
	public MobileElement _whileUsingTheAppPopups;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	@FindBy(id = "Allow Once")
	public MobileElement _onlyThisTimePopups;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "Don’t Allow")
	public MobileElement _denyPopups;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	@FindBy(id = "Don’t Allow")
	public MobileElement _deny;

	/*
	 * UI Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _whenAndWhereTitle;

	//com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/search
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/search']")
	@FindBy(name = "schedule/whenandwhere/choselocations/search")
	public MobileElement _newSearchCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/next")
	@FindBy(id = "schedule/whenandwhere/choselocations/next")
	public MobileElement _nextCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/BNFDatepicker/SeeCalendar/btn")
	@FindBy(id = "SlotAvailability/BNFDatepicker/SeeCalendar/btn")
	public MobileElement _seeCalender;

	@AndroidFindBy(id = "android:id/alertTitle")
	@FindBy(id = "android:id/alertTitle")
	public MobileElement _calender;

//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	@FindBy(id = "button1")
	public MobileElement _seeCalenderConfirmCTA;

	@AndroidFindBy(id = "android:id/button2")
	@FindBy(id = "button2")
	public MobileElement _seeCalenderCancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/2/hosp-type-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/2/hosp-type-icon")
	public MobileElement _PetSmartLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/1/hosp-type-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/1/hosp-type-icon")
	public MobileElement _ExpressLogo; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hosp-type-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hosp-type-icon")
	public MobileElement _PetSmartLogO1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0hospital/status-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0hospital/status-txt")
	public MobileElement _closedFromSatus;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/1hospital/status-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/1hospital/status-txt")
	public MobileElement _newLocationStatus;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/2hospital/status-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/2hospital/status-txt")
	public MobileElement _grandOpeningStatus;

	/*
	 * 6 Hospital
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0-btn")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='schedule/whereandwhere/choselocations/locationlist/locationitem/0-btn']")
	public MobileElement _hospital1;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/1-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/1-btn")
	public MobileElement _hospital2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/2-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/2-btn")
	public MobileElement _hospital3;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/3-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/3-btn")
	public MobileElement _hospital4;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/4-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/4-btn")
	public MobileElement _hospital5;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/5-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/5-btn")
	public MobileElement _hospital6;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0-btn")
	public MobileElement _hospital8;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0-btn")
	public MobileElement _hospital7;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Burlingam')]")
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Burlingam')]")
	public MobileElement _BurlingamHospital;

	/*
	 * Page Navigation Bar
	 */

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/header/left-btn")
	@FindBy(id = "schedule/whenandwhere/choselocations/header/left-btn")
	public MobileElement _backCTAinClosestHospitalPage;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/header/right")
	@FindBy(id = "schedule/choselocations/header/right")
	public MobileElement _cancelCTAinClosestHospitalPage;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/slotavailability/header/left")
	@FindBy(name = "schedule/slotavailability/header/left")
	public MobileElement _backCTAHospitalPage;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/slotavailability/header/right")
	@FindBy(id = "schedule/slotavailability/header/right")
	public MobileElement _cancelCTAHospitalPage;

	/*
	 * Where & Where - No Hospital Location
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/locationoff")
	@FindBy(name = "schedule/whenandwhere/choselocations/locationoff")
	public MobileElement _locationServices;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/locationError")
	@FindBy(name = "schedule/whenandwhere/choselocations/locationError")
	public MobileElement _locationServicestext;
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/ignore/Ignore-txt")
	@FindBy(name = "schedule/whenandwhere/choselocations/ignore")
	public MobileElement _ignore;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/settings/Settings-txt")
	@FindBy(id = "schedule/whenandwhere/choselocations/settings")
	public MobileElement _settings;
	

	/*
	 * Hospital Details
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/hospital_name-txt")
	@FindBy(id = "SlotAvailability/HospitalDetail/hospital_name-txt")
	public MobileElement _hospitalName;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/hospital_address-txt")
	@FindBy(id = "SlotAvailability/HospitalDetail/hospital_address-txt")
	public MobileElement _hospitalAddress;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalphonenumber-txt")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalphonenumber-txt']")
	public MobileElement _hospitalPhoneNumber;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/call-icon")
	@FindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/call-icon")
	public MobileElement _hospitalPhoneNumberIcon;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	public MobileElement _hospitalLocationMAP;

	/*
	 * Slots are not available for 2 Months
	 */

	// android.widget.TextView[@text='No available appointments for 2 months']
	// -Don't delete
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/NotAvailableTwoMonths-txt")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='SlotAvailability/NotAvailableTwoMonths-txt']")
	public MobileElement _slotsNotAvailable2Months;

	// android.widget.TextView[@text='No available appointments for today'] -Don't
	// delete
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/NotAvailableToday-txt")
	@FindBy(id = "SlotAvailability/NotAvailableToday-txt")
	public MobileElement _noAvailableAppointmentsForTodayText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/slotavailability/datepicker")
	@FindBy(id = "schedule/whenandwhere/slotavailability/datepicker")
	public MobileElement _todaysDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Next available')]")
	@FindBy(id = "slot-next-available-btn")
	public MobileElement _nextavailableText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/BNFDatepicker/date-txt")
	@FindBy(id = "SlotAvailability/BNFDatepicker/date-txt")
	public MobileElement _date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/hospitalphonenumber-txt")
	@FindBy(id = "SlotAvailability/HospitalDetail/hospitalphonenumber-txt")
	public MobileElement _phoneNoText;
	
	/*
	 * Login User When and where Screen
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/timeslot-txt")
	@FindBy(id = "schedule/whenandwhere/choselocations/timeslot-txt")
	public MobileElement _timeSlotsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/drop-txt1")
	@FindBy(id = "schedule/whenandwhere/choselocations/drop-txt1")
	public MobileElement _LookingForMorningText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/slottimings-radio-btn/0/name-img")
	@FindBy(id = "schedule/whenandwhere/choselocations/slottimings-radio-btn/0/name-img")
	public MobileElement _yesText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/slottimings-radio-btn/0/radio-img-icn")
	@FindBy(id = "schedule/whenandwhere/choselocations/slottimings-radio-btn/0/radio-img-icn")
	public MobileElement _yesCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/slottimings-radio-btn/1/name-img")
	@FindBy(id = "schedule/whenandwhere/choselocations/slottimings-radio-btn/1/name-img")
	public MobileElement _noText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/slottimings-radio-btn/1/radio-img-icn")
	@FindBy(id = "schedule/whenandwhere/choselocations/slottimings-radio-btn/1/radio-img-icn")
	public MobileElement _noCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/choselocations/lastvisited-txt")
	@FindBy(id = "schedule/choselocations/lastvisited-txt")
	public MobileElement _LastVisitedLocationText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/choselocations/lastvisited-txt")
	@FindBy(id = "schedule/choselocations/lastvisited-txt")
	public MobileElement _YourPreferredLocationText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/choselocations/closet-txt")
	@FindBy(id = "schedule/choselocations/closet-txt")
	public MobileElement _ClosestToYourLocationText;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/mapicon-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/mapicon-btn")
	public MobileElement _MapIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/hospitalphonenumber-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/hospitalphonenumber-txt")
	public MobileElement _phoneNumberCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/distance-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/distance-txt")
	public MobileElement _MilesText; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitalname-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitalname-txt")
	public MobileElement _HospitalText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitaladdress-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitaladdress-txt")
	public MobileElement _HospitalAddressText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitalphonenumber-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/preferred/locationitem/0/hospitalphonenumber-txt")
	public MobileElement _HospitalPhoneNoLink;
	                      
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/fav-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon; //Selected Location
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/1/fav-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/1/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon_deselected; //DeSelected Location1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/2/fav-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/2/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon_deselected1; //DeSelected Location2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/3/fav-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/3/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon_deselected2; //DeSelected Location3
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/4/fav-icon")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/4/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon_deselected3; //DeSelected Location4
	
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/fav-lbl']")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/fav-icon")
	public MobileElement _PreferredHospital_HeartIcon_deselected4; //Selected Location 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/fav-lbl")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/lastvisited/locationitem/0/fav-lbl")
	public MobileElement _PreferredHospital_HeartIcon_deselected5; //Selected Location 2
	

	/*
	 * Doctor Locum & Doctor's Slots
	 */

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-1-0']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='d-slot-1-0']")
	//@FindBy(id = "d-slot-1-1")
	public MobileElement _slot1; //USE.

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-3-0']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='d-slot-3-0']")
	public MobileElement _slot2; //USE

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-1-2']")
	public MobileElement _slot3;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-1-3']")
//	@FindBy(id = "")
	public MobileElement _slot4;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-1-4']")
//	@FindBy(id = "")
	public MobileElement _slot5;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-2-3']")
//	@FindBy(id = "")
	public MobileElement _slot6;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-0-0']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='d-slot-0-0']")
	public MobileElement _slot7; //USE.

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-0-1']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='d-slot-0-1']")
	public MobileElement _slot8;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-2-0']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='d-slot-2-0']")
	public MobileElement _slot9; //USE.

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-1-7']")
//	@FindBy(id = "")
	public MobileElement _slot10; 

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-2-1']")
	@FindBy(id = "d-slot-2-1")
	public MobileElement _slot11;  //USE

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='d-slot-0-1']")
	@FindBy(id = "d-slot-0-1")
	public MobileElement _slot12; //USE
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text-id='11:30 a.m.']")
//	@FindBy(id = "")
	public MobileElement _slot; //USE

	/*
	 * Doctor's Name
	 */

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Dr')]") // Any date it will click
//	@FindBy(id = "")
	public MobileElement _doctorsName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/Doctor/Name/0name-txt") 
	@FindBy(id = "SlotAvailability/Doctor/Name/0name-txt")
	public MobileElement _AllocatedDoctors;

//	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/Doctor/Name/1name-txt") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Banfield Veterinarian']")
	@FindBy(id = "SlotAvailability/Doctor/Name/2name-txt")
	public MobileElement _LocumdoctorsName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Next available']")
	@FindBy(id = "SlotAvailability/Doctor/Name/2name-txt")
	public MobileElement _LocumdoctorsName2;

	/*
	 * Doctor's Slot
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'available slots')]")
//	@FindBy(id = "")
	public MobileElement _doctorAvailableSlots;

//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your veterinarian will be assigned at least 24 hours before your appointment.']")
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/Vetenarian/TobeAssigned-txt")
	@FindBy(id = "SlotAvailability/Vetenarian/TobeAssigned-txt")
	public MobileElement _appointmentText; 

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/slotavailability/next")
	@FindBy(id = "schedule/slotavailability/next")
	public MobileElement _nextCTAonSlotPage;
	
	/*
	 * Make Appointment as guest step 8 and 9 map enhancement
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalname-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalname-txt")
	public MobileElement _firsthospitalname;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	public MobileElement _firsthospitaladdress;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	public MobileElement _firsthospitalmapicon;
	
//	@AndroidFindBy(id = "")
//	@FindBy(id = "")
//	public MobileElement _firstdistanceinmiles;
	
	/*
	 * Loggedin User
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/header/right-btn")
	@FindBy(id = "schedule/whenandwhere/choselocations/header/right-btn")
	public MobileElement _CancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/drop-off-txt")
	@FindBy(id = "com.banfield.react.bpht:id/SlotAvailability/drop-off-txt")
	public MobileElement _dropOffText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/drop-off-txt")
	@FindBy(id = "com.banfield.react.bpht:id/SlotAvailability/drop-off-txt")
	public MobileElement _dropOff_GreenCheckIcon; //Raised issue 32928
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/search-btn")
	@FindBy(id = "schedule/whenandwhere/choselocations/search-btn")
	public MobileElement _newSearchCTA1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/slotavailability/newsearch")
	@FindBy(id = "schedule/whenandwhere/slotavailability/newsearch")
	public MobileElement _newSearchCTA2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/openmap-btn")
	@FindBy(id = "SlotAvailability/HospitalDetail/openmap-btn")
	public MobileElement _hospitalLocationMAPIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/miles-txt")
	@FindBy(id = "SlotAvailability/HospitalDetail/miles-txt")
	public MobileElement _hospitalLocationMAP_Miles;
	
	/*
	 * Refresh Popups 
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='androidalert/popup/text']")
	@FindBy(id = "androidalert/popup/text")
	public MobileElement _refreshAvailableSlotsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/SlotAvailability/HospitalDetail/miles-txt")
	@FindBy(id = "SlotAvailability/HospitalDetail/miles-txt")
	public MobileElement _okayCTa;
	
	/*
	 * Hospital Details
	 */
	public void verifyhospitaldetails() {
		softassert.assertTrue(_hospitalName.isDisplayed());
		softassert.assertTrue(_hospitalAddress.isDisplayed());
		softassert.assertTrue(_firsthospitalmapicon.isDisplayed());
		//softassert.assertTrue(_firstdistanceinmiles.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifymapicononfirstcard() {
		softassert.assertTrue(_firsthospitalname.isDisplayed());
		softassert.assertTrue(_firsthospitaladdress.isDisplayed());
		softassert.assertTrue(_hospitalPhoneNumber.isDisplayed());
		softassert.assertTrue(_hospitalLocationMAP.isDisplayed());
		softassert.assertAll();
	}

	/*
	 * Verify Closest Location
	 */
	public void closestlocationhospital() throws Throwable {
		Thread.sleep(1000);
		ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(_hospital3.isDisplayed());
		softassert.assertTrue(_hospital4.isDisplayed());
		softassert.assertTrue(_hospital5.isDisplayed());
		softassert.assertTrue(_hospital6.isDisplayed());
		ScrolltoElement("Garfield");
		softassert.assertTrue(_hospital1.isDisplayed());
		softassert.assertAll();
	}

	public void closestlocation() throws Throwable {
		Thread.sleep(2000);
	     Scroll("Uptown Manhattan");
		softassert.assertTrue(_hospital3.isDisplayed());
		softassert.assertTrue(_hospital4.isDisplayed());
		softassert.assertTrue(_hospital5.isDisplayed());
		softassert.assertTrue(_hospital6.isDisplayed());
		Scroll("Paramus");
		softassert.assertTrue(_hospital1.isDisplayed());
		softassert.assertTrue(_hospital2.isDisplayed());
		softassert.assertAll();
	}

	public void verifypopups() {
		softassert.assertTrue(_whileUsingTheAppPopups.isDisplayed());
		softassert.assertTrue(_onlyThisTimePopups.isDisplayed());
		softassert.assertAll();
	}

	public void verifyNoHospitalPage() {
		softassert.assertTrue(_locationServices.isDisplayed());
		softassert.assertTrue(_locationServicestext.isDisplayed());
		softassert.assertTrue(_ignore.isDisplayed());
		softassert.assertTrue(_settings.isDisplayed());
		softassert.assertTrue(_newSearchCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNoHospitalScreen() {
		softassert.assertTrue(_locationServices.isDisplayed());
		softassert.assertTrue(_locationServicestext.isDisplayed());
		softassert.assertTrue(_newSearchCTA.isDisplayed());
		softassert.assertTrue(_ignore.isDisplayed());
		softassert.assertTrue(_settings.isDisplayed());
	//	softassert.assertTrue(_timeSlotsText.isDisplayed());
	//	softassert.assertTrue(_LookingForMorningText.isDisplayed());
	//	softassert.assertTrue(_yesText.isDisplayed());
	//	softassert.assertTrue(_noText.isDisplayed());
	//	softassert.assertTrue(_YourPreferredLocationText.isDisplayed());
		softassert.assertAll();
	}

	public void pickdate() {
		List<MobileElement> pick = driver.findElementsById("android:id/numberpicker_input");
		pick.get(0).sendKeys("May");
		pick.get(1).sendKeys("26");
	}

	public void verifyLocumDoctorAndLocumSlots1() { // IN USE
		try {
			if (_slot1.isDisplayed()) { // d-slot-1-0
			}
		} catch (AbortException e) {
			if (_slot9.isDisplayed()) { // d-slot-2-0
			}
		} catch (RuntimeException e) {
			if (_slot7.isDisplayed()) { // d-slot-0-0
			} else {
				softassert.assertTrue(_slot10.isDisplayed()); // d-slot-1-7
				softassert.assertAll();
			}
		}
	}

	public void chooseSlot2() { // IN USE
		try {
			if (_slot1.isDisplayed()) {
				TapElement(_slot1); // 1-0
				Assert.assertTrue(_slot1.isEnabled());
			}
		} catch (Exception e) {
			if (_slot9.isDisplayed()) {
				TapElement(_slot9); // 2-0 _slot9
				Assert.assertTrue(_slot9.isEnabled());
			}
		}
	}

	public void chooseSlot3() { // IN USE
		try {
			if (_slot7.isDisplayed()) { // 0-0
				TapElement(_slot7);
				Assert.assertTrue(_slot7.isEnabled());
			}
		} catch (Exception e) {
			System.out.println("No slot are available");
		}
	}

	public void appointmentInfo() { // IN USE
		try {
			softassert.assertTrue(_doctorsName.isDisplayed());
		} catch (Exception e) {
			softassert.assertTrue(_LocumdoctorsName2.isDisplayed());
		}
	//	ScrolltoElement("Banfield Veterinarian");
	//	softassert.assertTrue(_doctorAvailableSlots.isDisplayed());
	//	softassert.assertAll();
	}
	
	public void doctors() { // IN USE
		try {
			softassert.assertTrue(_doctorsName.isDisplayed());
		} catch (Exception e) {
			softassert.assertTrue(_LocumdoctorsName.isDisplayed());
		}
	}

	

	public void noslotareselectedbydefault1() { // IN USE
		try {
			if (_slot1.isDisplayed()) {// 1-0
				Assert.assertTrue(_slot1.isEnabled());
			}
		} catch (Exception e) { // 2-0 _slot9
			if (_slot9.isDisplayed()) {
				Assert.assertTrue(_slot9.isEnabled());
			}
		}
	}
	
	public void noslotareselectedbydefault2() { // IN USE
		try {
			if (_slot7.isDisplayed()) {// 0-0
				Assert.assertTrue(_slot7.isEnabled());
			}
		} catch (Exception e) {
			System.out.println("Slots are not available");
		}
	}

	public void multiselectisnotpossible1() { // IN USE
		try {
			if (_slot1.isDisplayed()) {// 1-0
				TapElement(_slot2);
				_slot2.isEnabled();
				TapElement(_slot1);
				_slot1.isEnabled();
			}
		} catch (Exception e) { // 2-0 _slot9
			if (_slot9.isDisplayed()) {
				TapElement(_slot9);
				_slot9.isEnabled();
				TapElement(_slot11);
				_slot11.isEnabled();
			}
		}
	}

	public void multiselectisnotpossible2() { // IN USE
		try {
			if (_slot7.isDisplayed()) {// 0-0
				TapElement(_slot7);
				Assert.assertTrue(_slot7.isEnabled());
				TapElement(_slot12);
				Assert.assertTrue(_slot12.isEnabled());
			}
		} catch (Exception e) {
			System.out.println("No slotes are available");
		}
	}

	public void chooseslot() {
		try {
			chooseSlot2();
		} catch (Exception e) {
			TapElement(_slot7);
			Assert.assertTrue(_slot7.isEnabled());
		}
	}
	
	public void verifypreferredlocation() {
		softassert.assertTrue(_MapIcon.isDisplayed());
	//	softassert.assertTrue(_MilesText.isDisplayed());
		softassert.assertTrue(_HospitalText.isDisplayed());
		softassert.assertTrue(_HospitalAddressText.isDisplayed());
		softassert.assertTrue(_HospitalPhoneNoLink.isDisplayed());
		softassert.assertTrue(_PreferredHospital_HeartIcon.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifypreferredlocationGEOLocOn() throws Throwable {
	//	softassert.assertTrue(_timeSlotsText.isDisplayed());
	//	softassert.assertTrue(_LookingForMorningText.isDisplayed());
	//	softassert.assertTrue(_yesText.isDisplayed());
	//	softassert.assertTrue(_noText.isDisplayed());
		softassert.assertTrue(_newSearchCTA.isDisplayed());
	//	softassert.assertTrue(_YourPreferredLocationText.isDisplayed());
	//	softassert.assertTrue(_HospitalText.isDisplayed());
		softassert.assertTrue(_PreferredHospital_HeartIcon.isDisplayed());
   // 	Thread.sleep(4000);
   //   ScrolltoElement("Closest to your location");
	//	softassert.assertTrue(_ClosestToYourLocationText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyHeartIconDeselected() throws Throwable {
		softassert.assertTrue(_hospital7.isDisplayed());
		ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(_PreferredHospital_HeartIcon_deselected2.isDisplayed());
		softassert.assertTrue(_PreferredHospital_HeartIcon_deselected3.isDisplayed());
		softassert.assertTrue(_PreferredHospital_HeartIcon_deselected4.isDisplayed());
		ScrolltoElement("Carlstadt");
		softassert.assertTrue(_PreferredHospital_HeartIcon_deselected.isDisplayed());
		softassert.assertTrue(_PreferredHospital_HeartIcon_deselected1.isDisplayed());
		softassert.assertAll();	
	}
	
	public void closestlocationforLoggedInUser() throws Throwable { //4b
		Thread.sleep(2000);
	    ScrolltoElement("Uptown Manhattan");
		softassert.assertTrue(_hospital3.isDisplayed());
		softassert.assertTrue(_hospital4.isDisplayed());
		softassert.assertTrue(_hospital5.isDisplayed());
		ScrolltoElement("Carlstadt");
		softassert.assertTrue(_hospital1.isDisplayed());
		softassert.assertTrue(_hospital2.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyWhereandWhereStep8() throws Throwable {
		Thread.sleep(1000);
	//	softassert.assertTrue(_dropOffText.isDisplayed());
	//	softassert.assertTrue(_dropOff_GreenCheckIcon.isDisplayed());
		softassert.assertTrue(_newSearchCTA2.isDisplayed());
		softassert.assertTrue(_date.isDisplayed());
		softassert.assertTrue(_seeCalender.isDisplayed());
		softassert.assertTrue(_hospitalLocationMAPIcon.isDisplayed());//changed
		softassert.assertTrue(_hospitalLocationMAP_Miles.isDisplayed()); //changed
		softassert.assertAll();
	}
}
