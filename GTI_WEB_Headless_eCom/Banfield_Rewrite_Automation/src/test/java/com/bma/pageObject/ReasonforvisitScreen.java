package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ReasonforvisitScreen extends Utilities {
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);


	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();
	
	public ReasonforvisitScreen(RemoteWebDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	/*
	 * Reason For Visit Page Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _reasonforvisitTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/petvisit")
	@FindBy(id = "schedule/visittype/petvisit")
	public MobileElement _PetName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/0")//?
	@FindBy(id = "schedule/visittype/visititem/0")
	public MobileElement _newPatient;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/1")
	@FindBy(id = "schedule/visittype/visititem/1")
	public MobileElement _illness;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/2")
	@FindBy(id = "schedule/visittype/visititem/2")
	public MobileElement _injury;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/next")
	@FindBy(id = "schedule/visittype/next")
	public MobileElement _nextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/callahospitalnearyou-btn")
	@FindBy(id = "schedule/visittype/callahospitalnearyou-btn")
	public MobileElement _NotSureCallaHospitalNearYouCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/whatsgoingon/callahospitalnearyou-btn")
	@FindBy(id = "whatsgoingon/callahospitalnearyou-btn")
	public MobileElement _NotSureCallaHospitalNearYouCTA1;
	
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/header/left")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='schedule/visittype/header/left']")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Schedule/LoggedInUser/VisitType/header/left-btn")
	@FindBy(id = "Schedule/LoggedInUser/VisitType/header/left-btn")
	public MobileElement _backCTA2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/header/right")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='schedule/visittype/header/right']")
	public MobileElement _cancelCTA;
	
	/*
	 * Logged-in User
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/0") //Illness
	@FindBy(id = "schedule/visittype/visititem/0")
	public MobileElement _illnessCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/0/visiticon")
	@FindBy(id = "schedule/visittype/visititem/0/visiticon")
	public MobileElement _illnessGreenCheck;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/1") //injury
	@FindBy(id = "schedule/visittype/visititem/1")
	public MobileElement _injuryCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/1/visiticon")
	@FindBy(id = "schedule/visittype/visititem/1/visiticon")
	public MobileElement _injuryGreenCheck;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/2") //preventiveCare
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preventive care']")
	@FindBy(id = "schedule/visittype/visititem/2")
	public MobileElement _preventiveCareCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/2/visiticon")
	@FindBy(id = "schedule/visittype/visititem/2/visiticon")
	public MobileElement _preventiveCareGreenCheck;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='New patient']")
	@FindBy(id = "schedule/visittype/visititem/2")
	public MobileElement _newPatientCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/visittype/visititem/2/visiticon")
	@FindBy(id = "schedule/visittype/visititem/2/visiticon")
	public MobileElement _newPatientGreenCheck;
	
	
	public void verifyUI() {
		softassert.assertTrue(_newPatient.isDisplayed());
		softassert.assertTrue(_illness.isDisplayed());
		softassert.assertTrue(_injury.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNotSelextedByDefault() {
		softassert.assertTrue(_newPatient.isEnabled());
		softassert.assertTrue(_illness.isEnabled());
		softassert.assertTrue(_injury.isEnabled());
		softassert.assertAll();
	}
	
	public void verifyAnyOneCTA() {
		TapElement(_newPatient);
		Assert.assertTrue(_newPatient.isEnabled());
		TapElement(_illness);
		Assert.assertTrue(_illness.isEnabled());
		TapElement(_injury);
		Assert.assertTrue(_injury.isEnabled());
	}
	
	public void verifygreyedoutonselectinganoption() {
		TapElement(_newPatient);
		softassert.assertTrue(_injury.isEnabled());
		softassert.assertTrue(_injury.isEnabled());
		softassert.assertAll();
	}
	

	
	
	
	
	
}
