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

public class LoginScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(LoginScreen.class);
	 public String path1 = "./src/test/resources/TestData/Sprint3/LoginCredentialsowpUser.csv";
	 public String path2 = "./src/test/resources/TestData/Sprint5/Login_using_credentials22.csv";
	
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public LoginScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * LoginScreen
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/email/Email address")
	@FindBy(id = "login/email/Email address")
	public MobileElement _Emailaddressheadertext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/email")
	@FindBy(id = "login/email")
	public MobileElement _EmailTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/password/Password")
	@FindBy(id = "login/password/Password")
	public MobileElement _passwordheadertext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/password")
	@FindBy(id = "login/password")
	public MobileElement _PasswordTextfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/password/1")
	@FindBy(id = "login/password/1")
	public MobileElement _Eyepassword;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/rememberme")
	@FindBy(id = "login/rememberme")
	public MobileElement _RememberMeCTA;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/cancel-txt")
	@FindBy(id = "login/cancel")
	public MobileElement _CancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/checkboxlabelaction")
	@FindBy(id = "login/checkboxlabelaction")
	public MobileElement _RememberMECheckbox;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp")
	@FindBy(id = "login/needhelp")
	public MobileElement _NeedHelpCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/button")
	@FindBy(id = "login/button")
	public MobileElement _LoginButton;
	
	public  void VerifyLoginUI() {
	//softassert.assertTrue(_Emailaddressheadertext.isDisplayed());
	softassert.assertTrue(_EmailTextField.isDisplayed());
	softassert.assertTrue(_passwordheadertext.isDisplayed());
	softassert.assertTrue(_PasswordTextfield.isDisplayed());
	//softassert.assertTrue(_Eyepassword.isDisplayed());
	softassert.assertTrue(_RememberMeCTA.isDisplayed());
	softassert.assertTrue(_RememberMECheckbox.isDisplayed());
	softassert.assertTrue(_NeedHelpCTA.isDisplayed());
	softassert.assertTrue(_LoginButton.isDisplayed());
//	ScrolltoElement("Cancel");
	softassert.assertTrue(_CancelCTA.isDisplayed());
	softassert.assertAll();
	}
	
	/*
	 *click on Log in CTA without entering email/username & password, 
	 */
	//android:id/alertTitle
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/validationerrormodal/desc")
	@FindBy(id = "login/validationerrormodal/desc")
	public MobileElement _OopsTheformcouldnotbeprocessedPleaseentertext;
	
	//android:id/button1
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/validationerrormodal/okaybtn")
	@FindBy(id = "login/validationerrormodal/okaybtn")
	public MobileElement _OK;
	

	/*
	 *Whoops Popup for Incorrect username/email or password 
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/failedresponsemodal/header")
	@FindBy(id = "login/failedresponsemodal/header")
	public MobileElement _whoopsloginheader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/failedresponsemodal/desc")
	@FindBy(id = "login/failedresponsemodal/desc")
	public MobileElement _thatsnotrightText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/failedresponsemodal/okaybtn")
	@FindBy(id = "login/failedresponsemodal/okaybtn")
	public MobileElement _okayinwhoopslogin;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/whoops/close-icn")
	@FindBy(id = "login/failedresponsemodal/closebtn")
	public MobileElement _closeinWhoopsloginCTA;
	
	/*
	 *Whoops Popup for More than 10 Unsucessful Attempt
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/lockedoutmodal/header")
	@FindBy(id = "login/lockedoutmodal/header")
	public MobileElement _whoopsaccountblockedheader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/lockedoutmodal/desc")
	@FindBy(id = "login/lockedoutmodal/desc")
	public MobileElement _whoopsaccountblocked_descText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/lockedoutmodal/okaybtn")
	@FindBy(id = "login/lockedoutmodal/okaybtn")
	public MobileElement _whoopsaccountblock_OkayCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/lockedoutmodal/closebtn")
	@FindBy(id = "login/lockedoutmodal/closebtn")
	public MobileElement _whoopsaccountblocked_closeCTA;
	 
	 public void verifyLoginScreen() {
			softassert.assertTrue(_EmailTextField.isDisplayed());
			softassert.assertTrue(_PasswordTextfield.isDisplayed());
			softassert.assertTrue(_LoginButton.isDisplayed());
			softassert.assertAll();
		}
	 public void VerifyAccountLockedWhoopsUI() {
		    softassert.assertTrue(_whoopsaccountblocked_closeCTA.isDisplayed());
			softassert.assertTrue(_whoopsaccountblock_OkayCTA.isDisplayed());
			softassert.assertTrue(_whoopsaccountblocked_descText.isDisplayed());
			softassert.assertTrue(_whoopsaccountblockedheader.isDisplayed());
			softassert.assertAll();
	 }
	 
	 public void VerifyWhoopsUIwithoutlogin_pass() {
		    softassert.assertTrue(_OopsTheformcouldnotbeprocessedPleaseentertext.isDisplayed());
			softassert.assertTrue(_OK.isDisplayed());
			softassert.assertAll();
	 }
	 
	 public void VerifyInvalidUserNameWhoopsUI() {
		 softassert.assertTrue(_whoopsloginheader.isDisplayed());
			softassert.assertTrue(_thatsnotrightText.isDisplayed());
			softassert.assertTrue(_okayinwhoopslogin.isDisplayed());
			softassert.assertTrue(_closeinWhoopsloginCTA.isDisplayed());
			softassert.assertAll();
	 }
}
