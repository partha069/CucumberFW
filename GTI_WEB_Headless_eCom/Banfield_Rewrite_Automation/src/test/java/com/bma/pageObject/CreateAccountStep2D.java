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

public class CreateAccountStep2D extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(CreateAccountStep2D.class);

	public CreateAccountStep2D(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Bottom Navigation Elements Home, Appointments, Chat, Profile
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/header")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/header")
	public MobileElement _WhoopsHeader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/desc")
	public MobileElement _LooksLike_you_already_have_an_accountText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/login")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/login")
	public MobileElement _LoginNowCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/close")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/close")
	public MobileElement _CloseCTA;
	
	/*
	 * Sent
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/openemailmodal/header")
	@FindBy(id = "createaccount/signupbanfield/openemailmodal/header")
	public MobileElement _WhoopsHeaderSent;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/openemailmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/openemailmodal/desc")
	public MobileElement _staticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/openemailmodal/login")
	@FindBy(id = "createaccount/signupbanfield/openemailmodal/login")
	public MobileElement _openMailCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/openemailmodal/close")
	@FindBy(id = "createaccount/signupbanfield/openemailmodal/close")
	public MobileElement _CloseCTASentScreen;
	
	/*
	 * Verify Bottom Navigation Elements
	 */
	public void verifypopupforregisteredclient() {
		softassert.assertTrue(_WhoopsHeader.isDisplayed());
		softassert.assertTrue(_LooksLike_you_already_have_an_accountText.isDisplayed());
		softassert.assertTrue(_LoginNowCTA.isDisplayed());
		softassert.assertTrue(_CloseCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifypopupSentMail() {
		softassert.assertTrue(_WhoopsHeaderSent.isDisplayed());
		softassert.assertTrue(_staticText.isDisplayed());
		softassert.assertTrue(_openMailCTA.isDisplayed());
		softassert.assertTrue(_CloseCTASentScreen.isDisplayed());
		softassert.assertAll();
	}
	

}
