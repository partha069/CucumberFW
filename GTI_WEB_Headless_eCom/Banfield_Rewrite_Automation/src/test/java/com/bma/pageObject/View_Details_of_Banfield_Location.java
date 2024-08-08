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

public class View_Details_of_Banfield_Location extends Utilities {

	private static Logger logger = LogManager.getLogger(View_Details_of_Banfield_Location.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public View_Details_of_Banfield_Location(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Find A Location Near You Screen
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _Findalocationheadertext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/hospitalname-txt")
	@FindBy(id = "hospital/details/hospitalname-txt")
	public MobileElement _HospitalName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/hospitaladdress-txt")
	@FindBy(id = "hospital/details/hospitaladdress-txt")
	public MobileElement _HospitalAddress;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/phonenumber-txt")
	@FindBy(id = "hospital/details/phonenumber-txt")
	public MobileElement _phonenumber;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findlocations/details/makeappointment-btn")
	@FindBy(id = "findlocations/details/makeappointment-btn")
	public MobileElement _MakeAppointmentCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='location/details/openmap-btn']")
	@FindBy(id = "location/details/openmap-btn")
	public MobileElement _mapIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/distance-txt")
	@FindBy(id = "hospital/details/distance-txt")
	public MobileElement _mapdistance;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/hours-lbl")
	@FindBy(id = "hospital/details/hours-lbl")
	public MobileElement _HoursofOperation;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/tue-txt")
	@FindBy(id = "hospital/details/tue-txt")
	public MobileElement _TuesdayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/mon-txt")
	@FindBy(id = "hospital/details/mon-txt")
	public MobileElement _MondayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/wed-txt")
	@FindBy(id = "hospital/details/wed-txt")
	public MobileElement _WednesdayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/thu-txt")
	@FindBy(id = "hospital/details/thu-txt")
	public MobileElement _ThurusdayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/fri-txt")
	@FindBy(id = "hospital/details/fri-txt")
	public MobileElement _FridayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/sat-txt")
	@FindBy(id = "hospital/details/sat-txt")
	public MobileElement _SaturdayTime;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/hospital/details/sun-txt")
	@FindBy(id = "hospital/details/sun-txt")
	public MobileElement _SundayTime;
	
	public void verifyView_Details_of_Banfield_LocationUI() {
		softassert.assertTrue(_HospitalName.isDisplayed());
		softassert.assertTrue(_HospitalAddress.isDisplayed());
		softassert.assertTrue(_phonenumber.isDisplayed());
		softassert.assertTrue(_MakeAppointmentCTA.isDisplayed());
		softassert.assertTrue(_mapIcon.isDisplayed());
		softassert.assertTrue(_mapdistance.isDisplayed());
		softassert.assertTrue(_HoursofOperation.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyHoursofoperation() {
		softassert.assertTrue(_TuesdayTime.isDisplayed());
		softassert.assertTrue(_MondayTime.isDisplayed());
		softassert.assertTrue(_WednesdayTime.isDisplayed());
		softassert.assertTrue(_ThurusdayTime.isDisplayed());
		softassert.assertTrue(_FridayTime.isDisplayed());
		softassert.assertTrue(_SaturdayTime.isDisplayed());
		softassert.assertTrue(_SundayTime.isDisplayed());
		softassert.assertAll();
	}
	
	
}
