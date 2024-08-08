package com.bma.pageObject;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.bridge.AbortException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(HomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public HomeScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * LoginScreen
	 */

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/header/username-txt")
	@FindBy(id = "home/header/username-txt")
	public MobileElement _HiUser_header;

	public void clickonFindLocationNearYou() {
		try {
			ScrolltoElement("Find a location near you");
			TapElement(_findaLocationNearYouCTA);
		} catch (Exception e) {
			System.out.println("Selected Preferred Location");
		}
	}

	/*
	 * Home UI Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/header/b-txt")
	@FindBy(id = "home/header/b-txt")
	public MobileElement _headerText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/header/seefaqscovid-btn")
	@FindBy(id = "home/header/seefaqscovid-btn")
	public MobileElement _seeFaqsAboutCovid19CTA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='See FAQs about COVID-19']")
	@FindBy(id = "home/header/seefaqscovid-btn")
	public MobileElement _seeFaqsAboutCovid19Text;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/yourpets-txt")
	@FindBy(id = "home/yourpets-txt")
	public MobileElement _yourPetsTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0home/petlistview/pet0")
	@FindBy(id = "home/petlistview/pet0")
	public MobileElement _pet;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/nopetmessage-txt")
	@FindBy(id = "home/nopetmessage-txt")
	public MobileElement _addPettoYourDashboardText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/addapet-btn")
	@FindBy(id = "home/addapet-btn")
	public MobileElement _AddaNewPetCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/preferredlocation-txt")
	@FindBy(id = "home/preferredlocation-txt")
	public MobileElement _yourPreferredLocationTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/hospital/fav-icon")
	@FindBy(id = "home/hospital/fav-icon")
	public MobileElement _heartIcon;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/nolocmessage-txt")
	@FindBy(id = "home/nolocmessage-txt")
	public MobileElement _yourPreferredLocationText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/hospitalname-txt")
	@FindBy(id = "home/hospitalname-txt")
	public MobileElement _yourPreferredLocationHospitalName;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/find-a-banfield-location-txt")
	@FindBy(id = "home/find-a-banfield-location-txt")
	public MobileElement _findabanfieldhospitalnearyoutext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/findabanfieldlocation-btn")
	@FindBy(id = "home/findabanfieldlocation-btn")
	public MobileElement _find_a_nearby_location;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/hospitaladdress-txt")
	@FindBy(id = "home/hospitaladdress-txt")
	public MobileElement _yourPreferredLocationHospitalAddress;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/dasboard/map-btn")
	@FindBy(id = "dasboard/map-btn")
	public MobileElement _yourPreferredLocationHospitalMapCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/map-txt")
	@FindBy(id = "home/map-txt")
	public MobileElement _yourPreferredLocationHospitalMapDistance;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/nolocmessage-txt")
	@FindBy(id = "home/nolocmessage-txt")
	public MobileElement _YourPreferredLocationText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/dasboard/makeappointment-btn")
	@FindBy(id = "dasboard/makeappointment-btn")
	public MobileElement _MakeAnAppointmentCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/dasboard/dialer-btn")
	@FindBy(id = "dasboard/dialer-btn")
	public MobileElement _yourPreferredLocationHospitaldialerCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/home/findlocation-btn']")
	@FindBy(id = "home/findlocation-btn")
	public MobileElement _findaLocationNearYouCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/shopnow/icon-img")
	@FindBy(id = "home/shopnow/icon-img")
	public MobileElement _shopBanfieldWidget;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/shopnow/title-txt")
	@FindBy(id = "home/shopnow/title")
	public MobileElement _shopBanfieldTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/shopnow/trade-mark-txt")
	@FindBy(id = "home/shopnow/trade-mark-txt")
	public MobileElement _shopBanfieldTradeMark;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/shopbnowmessage-txt")
	@FindBy(id = "home/shopbnowmessage-txt")
	public MobileElement _shopBanfieldText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/shopnow/action-btn")
	@FindBy(id = "home/shopnow/action-btn")
	public MobileElement _shopBanfieldCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/wanttohelp/title-txt")
	@FindBy(id = "home/wanttohelp/title")
	public MobileElement _wanttoHelpTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/wanttohelpmsg-txt")
	@FindBy(id = "home/wanttohelpmsg-txt")
	public MobileElement _wanttoHelpText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/wanttohelp/action-btn")
	@FindBy(id = "home/wanttohelp/action-btn")
	public MobileElement _donateCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0/owp-img-icn")
	@FindBy(xpath = "//XCUIElementTypeOther[@id='home/petlistview/pet0/owp-img-icn']")
	public MobileElement _OWPBadge;

	/*
	 * Wigets - Single & Single
	 */          
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/singal/title-txt")
	@FindBy(id = "home/vetchat2/singal/title-txt")
	public MobileElement _vetchatgoSingleText;   // Sinle 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/singal/title-txt")
	@FindBy(id = "home/vetchat/singal/title-txt")
	public MobileElement _vetchatgoSingleText1;   //Single 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/singal/icon-img")
	@FindBy(id = "home/vetchat2/singal/icon-img")
	public MobileElement _vetchatgoSingleWiget1; // Single 1st  // SIngle-Multi
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/singal/icon-img")
	@FindBy(id = "home/vetchat2/title-txt")
	public MobileElement _vetchatgoSingleWiget2; // Single 2nd
	
	/*
	 * Wigets - Multi & Multi
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/multi/title-txt")
	@FindBy(id = "home/vetchat2/singal/title-txt")
	public MobileElement _vetchatgoMultiText;   //Multi - M1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/multi/title-txt")
	@FindBy(id = "home/vetchat/multi/title-txt")
	public MobileElement _vetchatgoMultiText1;   //Multi - M2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/multi/icon-img")
	@FindBy(id = "home/vetchat2/multi/icon-img")
	public MobileElement _vetchatgoWiget1; // Multi 1 // Multi Single

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/multi/icon-img")
	@FindBy(id = "home/vetchat/multi/icon-img")
	public MobileElement _vetchatgoWiget2; // Multi 2  // Single-Multi

	
	/*
	 * VCGO SINGLE -Single (S1-S) & Multi (M1-M)
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/pets-lbl")
	@FindBy(id = "home/vetchat2/pets-lbl")
	public MobileElement _vetchatgoPetsText; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/petnames-txt")
	@FindBy(id = "home/vetchat2/petnames-txt")
	public MobileElement _vetchatgoPetsNameText; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/startdate-lbl")
	@FindBy(id = "home/vetchat2/startdate-lbl")
	public MobileElement _vetchatgoStartDate; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/startdate-txt")
	@FindBy(id = "home/vetchat2/startdate-txt")
	public MobileElement _vetchatgoDate; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/expiration-lbl")
	@FindBy(id = "home/vetchat2/expiration-lbl")
	public MobileElement _vetchatgoExpiration; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/expiration-txt")
	@FindBy(id = "home/vetchat2/expiration-txt")
	public MobileElement _vetchatgoExpiryDate; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/totalamount-lbl")
	@FindBy(id = "home/vetchat2/totalamount-lbl")
	public MobileElement _vetchatgoTotalAmount; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/totalamount-txt")
	@FindBy(id = "home/vetchat2/totalamount-txt")
	public MobileElement _vetchatgoAmount; // same as Multi 1
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat2/status-txt")
	@FindBy(id = "home/vetchat2/status-txt")
	public MobileElement _vetchatgoActive; // same as Multi 1
	
	/*
	 * VCGO SINGLE -Single 1 (S-S2) & Multi (M-M2)
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/pets-lbl")
	@FindBy(id = "home/vetchat/pets-lbl")
	public MobileElement _vetchatgoPetsText1;  //same as Multi 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/petnames-txt")
	@FindBy(id = "home/vetchat/petnames-txt")
	public MobileElement _vetchatgoPetsNameText1; //same as Multi 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/startdate-lbl")
	@FindBy(id = "home/vetchat/startdate-lbl")
	public MobileElement _vetchatgoStartDate1; //same as Multi 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/startdate-txt")
	@FindBy(id = "home/vetchat/startdate-txt")
	public MobileElement _vetchatgoDate1; //same as Multi 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/expiration-lbl")
	@FindBy(id = "home/vetchat/expiration-lbl")
	public MobileElement _vetchatgoExpiration1; //same as Multi 2

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/expiration-txt")
	@FindBy(id = "home/vetchat/expiration-txt")
	public MobileElement _vetchatgoExpiryDate1; //same as Multi 2

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/totalamount-lbl")
	@FindBy(id = "home/vetchat/totalamount-lbl")
	public MobileElement _vetchatgoTotalAmount1; //same as Multi 2
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/totalamount-txt")
	@FindBy(id = "home/vetchat/totalamount-txt")
	public MobileElement _vetchatgoAmount1; //same as Multi 2

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/vetchat/status-txt")
	@FindBy(id = "home/vetchat/status-txt")
	public MobileElement _vetchatgoActive1;  //same as Multi 2

	/*
	 * Pet Birthday
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0-icn")
	@FindBy(id = "home/petlistview/pet0-icn")
	public MobileElement _petHat;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/happy-birthday-txt")
	@iOSXCUITFindBy(accessibility  = "home/happy-birthday-txt")
	public MobileElement _petBirthdayBanner;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Scooby']")
	@iOSXCUITFindBy(accessibility = "home/petlistview/Scooby/1")
	public MobileElement _petname;

	/*
	 * Native Popups
	 */
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _denyPopups;

	/*
	 * UI Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/1")
	@FindBy(id = "myprofile/menu/1")
	public MobileElement _legalStuff;

	/*
	 * Your Pet
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1")
	@FindBy(id = "home/petlistview/pet1")
	public MobileElement _pet1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kimberlee']")
	@FindBy(id = "home/petlistview/Sauda/2")
	public MobileElement _pet01; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Miki']")
	@FindBy(id = "home/petlistview/Sauda/2")
	public MobileElement _pet001;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cujo']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet02;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0") 
	@FindBy(id = "home/petlistview/pet0")
	public MobileElement _pet0;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1")
	@FindBy(id = "home/petlistview/pet1")
	public MobileElement _ExoticPet;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Exotic']")
	@FindBy(id = "home/petlistview/pet1")
	public MobileElement _Exotic;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet2")
	@FindBy(id = "home/petlistview/pet2")
	public MobileElement _pet03;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet6")
	@FindBy(id = "home/petlistview/pet6")
	public MobileElement _pet003;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mickie']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet04;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Florencio']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet05;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shun']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet06;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dionte']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet07;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Burfi']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet08; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jurgita']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet09;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Theresa A.']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet10; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Heriberto']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet11;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Xavior']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet12;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NewPetTD']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet13;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jisela']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet14;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rafe']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet15;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Elgin']")
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet16;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Debi']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet17; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Selina']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet18; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Eunice']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet19;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gina']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet20;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jack']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet21; //use
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TestDog']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet22;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Baldemar']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet23;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jarrod']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet24;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kojo']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet25; 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Piety']") 
	@FindBy(id = "home/petlistview/pet1")
	public MobileElement _pet26;  
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='red']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet27;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kitty']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet28;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Aroldo']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet29;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Ferne']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet30; 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Alida']") 
	@FindBy(id = "home/petlistview/Test")
	public MobileElement _pet31;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0/name-txt")
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='abcdefghijklmnopqrst']")
	@FindBy(id = "home/petlistview/pet0/name-txt")
	public MobileElement _petNameellipses;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/Cujo/1/name-txt")
	@iOSXCUITFindBy(accessibility = "home/petlistview/Test")
	public MobileElement _petName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sauda']")
	@iOSXCUITFindBy(accessibility = "home/petlistview/Test")
	public MobileElement _petName2;
	
	@AndroidFindBy(xpath = "com.banfield.react.bpht:id/home/petlistview/pet1/name-txt")
	@iOSXCUITFindBy(accessibility = "home/petlistview/pet1/name-txt")
	public MobileElement _petName4;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Last seen')]")
	@FindBy(id = "home/petlistview/Sauda/18/visit-txt")
	public MobileElement _lastSeenAndDate;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0/visit-txt")
	@FindBy(id = "home/petlistview/pet0/visit-txt")
	public MobileElement _lastSeenAndDate1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1/visit-txt")
	@FindBy(id = "home/petlistview/pet1/visit-txt")
	public MobileElement _lastSeenAndDate2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1/rightIcon")
	@FindBy(id = "home/petlistview/pet1/rightIcon")
	public MobileElement _clockIcon;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet0/rightIcon")
	@FindBy(id = "home/petlistview/pet0/rightIcon")
	public MobileElement _clockIcon1;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet3/rightIcon")
	@FindBy(id = "home/petlistview/pet3/rightIcon")
	public MobileElement _clockIcon2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1/rightIcon-icn-icn")
	@FindBy(id = "home/petlistview/pet1/rightIcon-icn-icn")
	public MobileElement _clockIconDisable;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petlistview/pet1/rightIcon-icn-icn")
	@FindBy(id = "home/petlistview/pet1/rightIcon-icn-icn")
	public MobileElement _clockIconEnable;

	/*
	 * Verify pet card
	 */
	public void verifyPetCard() throws Throwable {
		softassert.assertTrue(_pet0.isDisplayed());
		Thread.sleep(500);
		softassert.assertTrue(_lastSeenAndDate1.isDisplayed());
		softassert.assertTrue(_clockIcon1.isDisplayed());
		softassert.assertAll();
	}

	/*
	 * Home > Your Preferred Location
	 */
	public void verifyYourPreferredLocation() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_yourPreferredLocationHospitalName.isDisplayed());
		softassert.assertTrue(_yourPreferredLocationHospitalAddress.isDisplayed());
		softassert.assertTrue(_yourPreferredLocationHospitalMapCTA.isDisplayed());
	//	softassert.assertTrue(_yourPreferredLocationHospitaldialerCTA.isDisplayed());
		softassert.assertTrue(_MakeAnAppointmentCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyYourPreferredLocationwhenpreflocationisset() throws Throwable {
	//	softassert.assertTrue(_yourPreferredLocationTitle.isDisplayed());
		softassert.assertTrue(_yourPreferredLocationHospitalName.isDisplayed());
		softassert.assertTrue(_yourPreferredLocationHospitalAddress.isDisplayed());
		softassert.assertTrue(_yourPreferredLocationHospitalMapCTA.isDisplayed());
		softassert.assertTrue(_findabanfieldhospitalnearyoutext.isDisplayed());
		softassert.assertTrue(_find_a_nearby_location.isDisplayed());
		softassert.assertTrue(_MakeAnAppointmentCTA.isDisplayed());
		softassert.assertAll();
	}


	public void verifyVetChatGoOne() throws Throwable {
		ScrolltoElement("Active");
		Thread.sleep(200);
		softassert.assertTrue(_vetchatgoPetsText.isDisplayed());
		softassert.assertTrue(_vetchatgoPetsNameText.isDisplayed());
		softassert.assertTrue(_vetchatgoStartDate.isDisplayed());
		softassert.assertTrue(_vetchatgoDate.isDisplayed());
		softassert.assertTrue(_vetchatgoExpiration.isDisplayed());
		softassert.assertTrue(_vetchatgoExpiryDate.isDisplayed());
		softassert.assertTrue(_vetchatgoTotalAmount.isDisplayed());
		softassert.assertTrue(_vetchatgoAmount.isDisplayed());
		softassert.assertTrue(_vetchatgoActive.isDisplayed());
		softassert.assertAll();
	}
	

	public void verifyVetChatGotwo() throws Throwable {
		ScrolltoElement("Active");
		Thread.sleep(200);
		softassert.assertTrue(_vetchatgoPetsText1.isDisplayed());
		softassert.assertTrue(_vetchatgoPetsNameText1.isDisplayed());
		softassert.assertTrue(_vetchatgoStartDate1.isDisplayed());
		softassert.assertTrue(_vetchatgoDate1.isDisplayed());
		softassert.assertTrue(_vetchatgoExpiration1.isDisplayed());
		softassert.assertTrue(_vetchatgoExpiryDate1.isDisplayed());
		softassert.assertTrue(_vetchatgoTotalAmount1.isDisplayed());
		softassert.assertTrue(_vetchatgoAmount1.isDisplayed());
		softassert.assertTrue(_vetchatgoActive1.isDisplayed());
		softassert.assertAll();
	}

	/*
	 * Verify Home Screen
	 */
	public void verifyHomePage() throws Throwable {
		Thread.sleep(6000);
		softassert.assertTrue(_HiUser_header.isDisplayed());
		softassert.assertTrue(_headerText.isDisplayed());
		softassert.assertTrue(_seeFaqsAboutCovid19CTA.isDisplayed());
		softassert.assertTrue(_yourPetsTitle.isDisplayed());
		ScrolltoElement("Add a new pet");
		softassert.assertTrue(_AddaNewPetCTA.isDisplayed());
		ScrolltoElement("Donate");
		softassert.assertTrue(_wanttoHelpText.isDisplayed());
		softassert.assertTrue(_wanttoHelpTitle.isDisplayed());
		Thread.sleep(6000);
		ScrolltoElement("Your preferred location");
		softassert.assertTrue(_yourPreferredLocationTitle.isDisplayed());
		Thread.sleep(1000);                
		ScrolltoElement("Shop now");
		softassert.assertTrue(_shopBanfieldTradeMark.isDisplayed());
		softassert.assertTrue(_shopBanfieldTitle.isDisplayed());
		softassert.assertAll();
	}

	public void verifyWanttohelp() throws Throwable {
		softassert.assertTrue(_wanttoHelpTitle.isDisplayed());
		softassert.assertTrue(_wanttoHelpText.isDisplayed());
		Thread.sleep(200);
	//	ScrolltoElement("Donate");
		softassert.assertTrue(_donateCTA.isDisplayed());
		softassert.assertAll();
	}

	public void verifyShopBanfield() throws Throwable {
		Thread.sleep(600);
		ScrolltoElement("Shop now");
		//softassert.assertTrue(_shopBanfieldTitle.isDisplayed());
	//	softassert.assertTrue(_shopBanfieldText.isDisplayed());
	//	ScrolltoElement("Shop now");
		softassert.assertTrue(_shopBanfieldCTA.isDisplayed());
		softassert.assertAll();
	}

	public void verifyPerts() throws Throwable {
		Thread.sleep(600);
		Scroll("Sauda");
		softassert.assertTrue(_pet01.isDisplayed());
		Scroll("Cujo");
		softassert.assertTrue(_pet02.isDisplayed());
		softassert.assertAll();
	}

	public void userisonpetDetailscreen() {
		try {
			Scroll("Mickie");
		} catch (AbortException e) {
			TapElement(_pet01);
		}
	}
}
