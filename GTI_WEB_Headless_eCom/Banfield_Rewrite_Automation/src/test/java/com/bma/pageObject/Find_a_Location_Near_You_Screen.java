package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Find_a_Location_Near_You_Screen extends Utilities {

	private static Logger logger = LogManager.getLogger(Find_a_Location_Near_You_Screen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Find_a_Location_Near_You_Screen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Find A Location Near You Screen
	 */

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	@FindBy(id = "permission_deny_and_dont_ask_again_button")
	public MobileElement _dontallow;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _Findalocationheadertext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _FindaLocationNearYouTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearby/searchbtn")
	@FindBy(id = "findnearby/searchbtn")
	public MobileElement _SearchBox;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearby/chosehospital/searchlabel")
	@FindBy(id = "findnearby/chosehospital/searchlabel")
	public MobileElement _findyourneighbourhoodlocationtext;
	
//	com.banfield.react.bpht:id/schedule/whenandwhere/choselocations/settingsbtn
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	@FindBy(id = "schedule/whenandwhere/choselocations/settingsbtn")
	public MobileElement _SettingCta;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Ignore']")
	@FindBy(id = "schedule/whenandwhere/choselocations/ignorebtn")
	public MobileElement _IgnoreCta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearbylocation/choselocations/search")
	@FindBy(id = "findnearbylocation/choselocations/search")
	public MobileElement _NewSearchCTA;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/mapicon-btn")
	public MobileElement _MapIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0-btn")
	public MobileElement _LocationCard1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/1-btn")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/1-btn")
	public MobileElement _LocationCard2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationitemlbl/2")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationitemlbl/2")
	public MobileElement _LocationCard3;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationitemlbl/3")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationitemlbl/3")
	public MobileElement _LocationCard4;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationitemlbl/4")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationitemlbl/4")
	public MobileElement _LocationCard5;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationitemlbl/5")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationitemlbl/5")
	public MobileElement _LocationCard6;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearbylocation/header/left-btn")
	@FindBy(id = "findnearbylocation/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearbylocation/header/right-btn")
	@FindBy(id = "findnearbylocation/header/right-btn")
	public MobileElement _cancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearby/chosehospital/closest")
	@FindBy(id = "findnearby/chosehospital/closest")
	public MobileElement _closesttoyourlocation;
	
	
	
	/*
	 * location Popup Element For Handling Location
	 */
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	@FindBy(id = "Allow Once")
	public MobileElement _OnlyThisTime;
	
	@AndroidFindBy(id = "android:id/button2")
	@FindBy(id = "button2")
	public MobileElement _NoThanks;
	
	@AndroidFindBy(id = "android:id/button1")
	@FindBy(id = "button1")
	public MobileElement _Ok;
	
	@AndroidFindBy(id = "com.google.android.gms:id/message")
	@FindBy(id = "message")
	public MobileElement _For_a_better_experienceText;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	@FindBy(id = "permission_message")
	public MobileElement _permission_messageText;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id = "permission_allow_foreground_only_button")
	public MobileElement _While_Using_the_App_Text;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _deny;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	public MobileElement _hospitalname;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitaladdress-txt")
	public MobileElement _hospitaladdress;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalphonenumber-txt")
	@FindBy(id = "schedule/whereandwhere/choselocations/locationlist/locationitem/0/hospitalphonenumber-txt")
	public MobileElement _hospitalphonenumber;

	/*
	 * Logged-in User: Find a location near you Page
	 */
	@AndroidFindBy(id = "location/details/openmap-btn")
	@FindBy(id = "location/details/openmap-btn")
	public MobileElement _MapIcon_LoggedinUser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/hospitalname-txt")
	@FindBy(id = "hospital/details/hospitalname-txt")
	public MobileElement _HospitalName_LoggedinUser;

	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/hospitaladdress-txt")
	@FindBy(id = "hospital/details/hospitaladdress-txt")
	public MobileElement _HospitalAddress_LoggedinUser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/phonenumber-txt")
	@FindBy(id = "hospital/details/phonenumber-txt")
	public MobileElement _PhoneNumber_LoggedinUser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findlocations/details/makeappointment-btn")
	@FindBy(id = "findlocations/details/makeappointment-btn")
	public MobileElement _MakeAppoCTA_LoggedinUser;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findlocations/details//hosp-type-icon")
	@FindBy(id = "findlocations/details//hosp-type-icon")
	public MobileElement _PetSmartLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findlocations/details//hosp-type-icon")
	@FindBy(id = "findlocations/details//hosp-type-icon")
	public MobileElement _ExpressLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/status-txt")
	@FindBy(id = "hospital/status-txt")
	public MobileElement _statusFlag1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/status-txt")
	@FindBy(id = "hospital/status-txt")
	public MobileElement _statusFlag2;
	
	
public void verify6closestlocation() throws Throwable {
	Thread.sleep(4000);
	softassert.assertTrue(_LocationCard1.isDisplayed());
	softassert.assertAll();
}

public void verifyLocationcard() {
//	softassert.assertTrue(_MapIcon.isDisplayed());
//	softassert.assertTrue(_findyourneighbourhoodlocationtext.isDisplayed());
//	softassert.assertTrue(_closesttoyourlocation.isDisplayed());
//	softassert.assertTrue(_hospitalphonenumber.isDisplayed());
//	softassert.assertTrue(_hospitalname.isDisplayed());
//	softassert.assertTrue(_hospitaladdress.isDisplayed());
//	softassert.assertAll();
}

public void verifyUIwhenLocationOFF() {
	softassert.assertTrue(_Findalocationheadertext.isDisplayed());
	softassert.assertTrue(_IgnoreCta.isDisplayed());
	softassert.assertTrue(_NewSearchCTA.isDisplayed());
	softassert.assertAll();
}
	
	
	
	

}
