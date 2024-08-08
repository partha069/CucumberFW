package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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

public class Login_Need_Help_With_Your_Password_Screen extends Utilities {

	private static Logger logger = LogManager.getLogger(Login_Need_Help_With_Your_Password_Screen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Login_Need_Help_With_Your_Password_Screen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Login Need Help Screen
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _NeedHelp_with_Password_Header;
	
	@AndroidFindBy(id = "login/needhelp/statictext")
	@FindBy(id = "login/needhelp/statictext")
	public MobileElement _Noproblem_Enter_your_email_and_we_ll_send_a_reset_link_for_that_account;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/email")
	@FindBy(id = "login/needhelp/email")
	public MobileElement _EnterEmailText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/screen/sendresetlink")
	@FindBy(id = "login/needhelp/screen/sendresetlink")
	public MobileElement _SendMyResetLinkCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/header/left")
	@FindBy(id = "login/needhelp/header/left")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/email/error")
	@FindBy(id = "login/needhelp/email/error")
	public MobileElement _Invalid_Email_Error_text;
	
	/*
	 * Login Need Help Whoops Popup
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailfailedmodal/header")
	@FindBy(id = "login/needhelp/emailfailedmodal/header")
	public MobileElement _login_Needhelp_Whoops_header;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailfailedmodal/desc")
	@FindBy(id = "login/needhelp/emailfailedmodal/desc")
	public MobileElement _login_Needhelp_Whoops_ThatEmailnotInSystemText;
	
//	@AndroidFindBy(id = "")
//	@FindBy(id ="")
//	public MobileElement _login_Needhelp_Whoops_Try_differentEmailText;
//	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailfailedmodal/openemail")
	@FindBy(id = "login/needhelp/emailfailedmodal/openemail")
	public MobileElement _login_Needhelp_Whoops_OKayCTA;
		
//	@AndroidFindBy(id = "")
//	@FindBy(id = "")
//	public MobileElement _login_Needhelp_Whoops_ContactSupport;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailfailedmodal/close")
	@FindBy(id = "login/needhelp/emailfailedmodal/close")
	public MobileElement _login_Needhelp_Whoops_CloseCTA;
	
	/*
	 * Login Need Help Email Sent
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailsuccessmodal/close")
	@FindBy(id = "login/needhelp/emailsuccessmodal/close")
	public MobileElement _login_Needhelp_EmailSent_closeCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailsuccessmodal/header")
	@FindBy(id = "login/needhelp/emailsuccessmodal/header")
	public MobileElement _login_Needhelp_EmailSentTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailsuccessmodal/desc")
	@FindBy(id = "login/needhelp/emailsuccessmodal/desc")
	public MobileElement _login_Needhelp_EmailSent_An_email_has_beensentText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/needhelp/emailsuccessmodal/openemail")
	@FindBy(id = "login/needhelp/emailsuccessmodal/openemail")
	public MobileElement _login_Needhelp_EmailSent_OpenEmailCTA;
	
	public void verifyLoginNeedHelpUI() {
		softassert.assertTrue(_NeedHelp_with_Password_Header.isDisplayed());
		//softassert.assertTrue(_Noproblem_Enter_your_email_and_we_ll_send_a_reset_link_for_that_account.isDisplayed());
		softassert.assertTrue(_EnterEmailText.isDisplayed());
		softassert.assertTrue(_SendMyResetLinkCTA.isDisplayed());
		//softassert.assertTrue(_backCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void login_Needhelp_WhoopsUI() {
		softassert.assertTrue(_login_Needhelp_Whoops_header.isDisplayed());
		softassert.assertTrue(_login_Needhelp_Whoops_ThatEmailnotInSystemText.isDisplayed());
	//	softassert.assertTrue(_login_Needhelp_Whoops_Try_differentEmailText.isDisplayed());
		//softassert.assertTrue(_login_Needhelp_Whoops_ContactSupport.isDisplayed());
		softassert.assertTrue(_login_Needhelp_Whoops_CloseCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void login_Needhelp_EmailSentPopup() {
		softassert.assertTrue(_login_Needhelp_EmailSent_closeCTA.isDisplayed());
		softassert.assertTrue(_login_Needhelp_EmailSentTitle.isDisplayed());
		softassert.assertTrue(_login_Needhelp_EmailSent_An_email_has_beensentText.isDisplayed());
		softassert.assertTrue(_login_Needhelp_EmailSent_OpenEmailCTA.isDisplayed());
		softassert.assertAll();
	}
}
