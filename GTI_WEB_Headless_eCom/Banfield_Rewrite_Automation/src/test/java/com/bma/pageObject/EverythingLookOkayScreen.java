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

public class EverythingLookOkayScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public EverythingLookOkayScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Everything look okay? Page element
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _everythinglookokayTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/petname")
	@FindBy(id = "schedule/aeverythinglookok/screen/petname")
	public MobileElement _petname;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/slot")
	@FindBy(id = "schedule/aeverythinglookok/screen/slot")
	public MobileElement _slot;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/date")
	@FindBy(id = "schedule/aeverythinglookok/screen/date")
	public MobileElement _date;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/hospitalname")
	@FindBy(id = "schedule/aeverythinglookok/screen/hospitalname")
	public MobileElement _hospitalName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/docname")
	@FindBy(id = "schedule/aeverythinglookok/screen/docname")
	public MobileElement _docName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/hospitaladdress")
	@FindBy(id = "schedule/aeverythinglookok/screen/hospitaladdress")
	public MobileElement _hospitalAddress;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/yourinfo")
	@FindBy(id = "schedule/aeverythinglookok/screen/yourinfo")
	public MobileElement _yourinfo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/lastname")
	@FindBy(id = "schedule/aeverythinglookok/screen/lastname")
	public MobileElement _name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/phone")
	@FindBy(id = "schedule/aeverythinglookok/screen/phone")
	public MobileElement _phone;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/email")
	@FindBy(id = "schedule/aeverythinglookok/screen/email")
	public MobileElement _email;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/everythinglookok/screen/makeappointment")
	@FindBy(id = "schedule/addpet/everythinglookok/screen/makeappointment")
	public MobileElement _makeAppointmentCTA;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/visit-type")
	@FindBy(id = "schedule/aeverythinglookok/screen/visit-type")
	public MobileElement _AppointmentTypeText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/reasonforvisit")
	@FindBy(id = "schedule/aeverythinglookok/screen/reasonforvisit")
	public MobileElement _AppointmentReasonText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/aeverythinglookok/screen/notesforvet")
	@FindBy(id = "schedule/aeverythinglookok/screen/notesforvet")
	public MobileElement _NotesForTheVetText;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/checkbox-txt")
	@FindBy(id = "login/checkbox-txt")
	public MobileElement _pleaseBringAllVaccinationStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/checkboxlabelaction")
	@FindBy(id = "login/checkboxlabelaction")
	public MobileElement _pleaseBringAllVaccinationCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Canine-owp-img-icn")
	@FindBy(id = "Canine-owp-img-icn")
	public MobileElement _OwpBadge;
	
	
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/everythinglookok/header/leftbtn")
	@FindBy(id = "login/everythinglookok/header/leftbtn")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/everythinglookok/header/closebtn")
	@FindBy(id = "login/everythinglookok/header/closebtn")
	public MobileElement _cancelCTA;
	
	public void verifySlotsEverythingLookOkayPage() throws Throwable {
		Thread.sleep(6000);
		softassert.assertTrue(_petname.isDisplayed());
		softassert.assertTrue(_slot.isDisplayed());
    	softassert.assertTrue(_date.isDisplayed());
		softassert.assertTrue(_hospitalName.isDisplayed());
		softassert.assertTrue(_hospitalAddress.isDisplayed());
		softassert.assertTrue(_yourinfo.isDisplayed());
		softassert.assertTrue(_name.isDisplayed());
		softassert.assertTrue(_phone.isDisplayed());
		softassert.assertTrue(_email.isDisplayed());
		softassert.assertAll();
		
	}
	
}
