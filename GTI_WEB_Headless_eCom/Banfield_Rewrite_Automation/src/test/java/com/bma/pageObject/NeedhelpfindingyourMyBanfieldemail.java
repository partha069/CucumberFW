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

public class NeedhelpfindingyourMyBanfieldemail extends Utilities {

	private static Logger logger = LogManager.getLogger(NeedhelpfindingyourMyBanfieldemail.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public NeedhelpfindingyourMyBanfieldemail(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/header")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/header")
	public MobileElement _NeedhelpfindingyourMyBanfieldemailHeader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/desc1")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/desc1")
	public MobileElement _Quicktipstext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/desc")
	public MobileElement _TrytheemailthatsgetsallofyourBanfieldemailstext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/desc")
	public MobileElement _Tryotheremailsthatmaybeassociatedwithyouraccounttext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/descone")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/descone")
	public MobileElement _Ifyoustillneedhelp,pleasecontactBanfieldcustomersupporttext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/support-hotline")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/support-hotline")
	public MobileElement _supporthotlinetext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/support-tel")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/support-tel")
	public MobileElement _supporttelephonehyperlink;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/okay")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/okay")
	public MobileElement _okayCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needhelpmodal/close")
	@FindBy(id = "createaccount/signupbanfield/needhelpmodal/close")
	public MobileElement _CancelCTA;
	
	public void VerifyNeedhelpfindingyourMyBanfieldemailUI() {
		try {
			softassert.assertTrue(_NeedhelpfindingyourMyBanfieldemailHeader.isDisplayed());
			softassert.assertTrue(_Quicktipstext.isDisplayed());
			softassert.assertTrue(_Tryotheremailsthatmaybeassociatedwithyouraccounttext.isDisplayed());
			softassert.assertTrue(_TrytheemailthatsgetsallofyourBanfieldemailstext.isDisplayed());
			softassert.assertTrue(_Ifyoustillneedhelp.isDisplayed());
			softassert.assertTrue(_supporthotlinetext.isDisplayed());
			softassert.assertTrue(_supporttelephonehyperlink.isDisplayed());
			softassert.assertTrue(_okayCTA.isDisplayed());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Need help finding your MyBanfield email");	
		}
	}

	
}
