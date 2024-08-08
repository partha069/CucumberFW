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

public class HelpWithClientIdsScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(HelpWithClientIdsScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public HelpWithClientIdsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _HelpWithClientIdHeader;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='createaccount/signupformybanfield/helpwithclientid/heading']")
	@FindBy(id = "screen/header/title")
	public MobileElement _headingText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='createaccount/signupformybanfield/helpwithclientid/text']")
	@FindBy(id = "screen/header/title")
	public MobileElement _SubHeadingText_Have_you_been_to_a_Banfield_before;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='createaccount/signupformybanfield/helpwithclientid/desc']")
	@FindBy(id = "screen/header/title")
	public MobileElement _SubHeadingStaticText_Look_for_your_Banfield_Client_ID;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='createaccount/signupformybanfield/helpwithclientid/text']")
	@FindBy(id = "screen/header/title")
	public MobileElement _SubHeadingText_Are_you_new_to_Banfield;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='createaccount/signupformybanfield/helpwithclientid/para']")
	@FindBy(id = "screen/header/title")
	public MobileElement _SubHeadingStaticText_Well_give_you_your_Client_ID;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/helpwithclientid/screen/makeanappointment")
	@FindBy(id = "schedule/addpet/helpwithclientid/screen/makeanappointment")
	public MobileElement _MakeanAppointmentCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/helpwithclientid/header/left")
	@FindBy(id = "schedule/helpwithclientid/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/helpwithclientid/header/right")
	@FindBy(id = "schedule/helpwithclientid/header/right")
	public MobileElement _cancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupformybanfield/helpwithclientid/tel")
	@FindBy(id = "createaccount/signupformybanfield/helpwithclientid/tel")
	public MobileElement _phoneNoHyperlink;
	
	public void VerifyCreateAccountNeedmoreInformation() {
		try {
			softassert.assertTrue(_HelpWithClientIdHeader.isDisplayed());
			softassert.assertTrue(_MakeanAppointmentCTA.isDisplayed());
			softassert.assertTrue(_backCTA.isDisplayed());
			softassert.assertTrue(_cancelCTA.isDisplayed());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Need More Information Page");	
		}
	}
	
	
	public void verifyHelpWithClientIdsUI() {
		softassert.assertTrue(_SubHeadingText_Have_you_been_to_a_Banfield_before.isDisplayed());
		softassert.assertTrue(_SubHeadingStaticText_Look_for_your_Banfield_Client_ID.isDisplayed());
		softassert.assertTrue(_SubHeadingText_Are_you_new_to_Banfield.isDisplayed());
		softassert.assertTrue(_SubHeadingStaticText_Well_give_you_your_Client_ID.isDisplayed());
		softassert.assertTrue(_HelpWithClientIdHeader.isDisplayed());
		softassert.assertTrue(_MakeanAppointmentCTA.isDisplayed());
		softassert.assertTrue(_backCTA.isDisplayed());
		softassert.assertTrue(_cancelCTA.isDisplayed());
		softassert.assertAll();
	}
	
}
