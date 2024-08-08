package com.bma.pageObject;

import java.util.List;

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

public class BoardingAndGroomingScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(BoardingAndGroomingScreen.class);

	public BoardingAndGroomingScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/banfield-logo")
	@FindBy(id = "mypets/shareablerecordsscreen/banfield-logo")
	public MobileElement _BanfieldLogo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/pet-name")
	@FindBy(id = "mypets/shareablerecordsscreen/pet-name")
	public MobileElement _PetNameBoardingText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/grooming-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/grooming-txt")
	public MobileElement _groomingRecordsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/date")
	@FindBy(id = "mypets/shareablerecordsscreen/date")
	public MobileElement _dateText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/highlights/shareablerecordscreen/sharerecord-btn")
	@FindBy(id = "mypets/highlights/shareablerecordscreen/sharerecord-btn")
	public MobileElement _shareRecordCTA;
	
	
	/*
	 * Vaccines
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines-txt")
	public MobileElement _VaccinesText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/vaccines-description")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/vaccines-description")
	public MobileElement _VaccinesName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/vaccines-medication")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/vaccines-medication")
	public MobileElement _VaccinesName_Donotgive;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/vaccines/txt-na")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/vaccines/txt-na")
	public MobileElement _VaccinesName_NA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/lastDateGiven-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/lastDateGiven-txt")
	public MobileElement _lastDateGiven;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/lastDate-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/lastDate-txt")
	public MobileElement _lastDateText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/dueDate-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/dueDate-txt")
	public MobileElement _dueDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/vaccines/dueDate-date")
	@FindBy(id = "mypets/shareablerecordsscreen/vaccines/dueDate-date")
	public MobileElement _dueDateText;
	
	
	/*
	 * Parasite Control
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasite-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/parasite-txt")
	public MobileElement _parasiteControl;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-Description")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-Description")
	public MobileElement _fleaPrevention;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-Medication")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-Medication")
	public MobileElement _fleaPrevention_Donotgive;
	
	//com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-na
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-na']")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-na")
	public MobileElement _fleaPrevention_NA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasite-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/parasite-txt")
	public MobileElement _parasite_Las;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-lastdateGive-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-lastdateGive-txt")
	public MobileElement _parasite_LastDateGiven;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-lastdateGive-data")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-lastdateGive-data")
	public MobileElement _parasite_LastDateGivenDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-dueDate-txt")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-dueDate-txt")
	public MobileElement _parasite_DueDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/mypets/shareablerecordsscreen/parasiteControl/parasite-dueDate-data")
	@FindBy(id = "mypets/shareablerecordsscreen/parasiteControl/parasite-dueDate-data")
	public MobileElement _parasite_DueDateDate;
	
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _boardingAndGroomingTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/ShareableRecords/header/left-btn")
	@FindBy(id = "MyPets/ShareableRecords/header/left-btn")
	public MobileElement _backCTA;
	
	
	
	/*
	 * Verify Boarding and grooming Page
	 */
	public void verifyBoardingAndGroomingPage() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_BanfieldLogo.isDisplayed());
		softassert.assertTrue(_PetNameBoardingText.isDisplayed());
		softassert.assertTrue(_groomingRecordsText.isDisplayed());
		softassert.assertTrue(_dateText.isDisplayed());
		softassert.assertTrue(_shareRecordCTA.isDisplayed());
		softassert.assertTrue(_VaccinesText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyParasiteControlVaccines() {
		softassert.assertTrue(_lastDateText.isDisplayed());
		softassert.assertTrue(_dueDateText.isDisplayed());
		ScrolltoElement("Heartworm Prevention");
		softassert.assertTrue(_parasite_LastDateGiven.isDisplayed());
		softassert.assertTrue(_parasite_LastDateGivenDate.isDisplayed());
		softassert.assertTrue(_parasite_DueDate.isDisplayed());
		softassert.assertTrue(_parasite_DueDateDate.isDisplayed());
	}
	

}
