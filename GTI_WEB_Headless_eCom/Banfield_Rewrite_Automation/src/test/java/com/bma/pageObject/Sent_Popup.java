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

public class Sent_Popup extends Utilities {

	private static Logger logger = LogManager.getLogger(Sent_Popup.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Sent_Popup(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrateduser/mailsent/header")//27154 updated
	@FindBy(id = "login/migrateduser/mailsent/header")
	public MobileElement _SentTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/header")//28500 updated
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/header")
	public MobileElement _SentTitleText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrateduser/mailsent/desc")//27154 updated
	@FindBy(id = "login/migrateduser/mailsent/desc")
	public MobileElement _LookforanemailwithyourClientIDinyourinboxsoontext;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/desc")//28500 updated
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/desc")
	public MobileElement _StaticText;

	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrateduser/mailsent/openemail")//27154 updated
	@FindBy(id = "login/migrateduser/mailsent/openemail")
	public MobileElement _OpenMailCTA;
	

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/forgot-banfield-email")//28500 updated
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/forgot-banfield-email")
	public MobileElement _OpenMail;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrateduser/close")//27154 updated
	@FindBy(id = "login/migrateduser/close")
	public MobileElement _CloseCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/close")//28500 updated
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/close")
	public MobileElement _CloseCTAPopups;

	
	public void verifysentpopupUI() {
		softassert.assertTrue(_SentTitle.isDisplayed());	
		softassert.assertTrue(_LookforanemailwithyourClientIDinyourinboxsoontext.isDisplayed());
		softassert.assertTrue(_OpenMailCTA.isDisplayed());
		softassert.assertTrue(_CloseCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifysentpopupUIformigrateduser() {
		softassert.assertTrue(_SentTitle.isDisplayed());	
		softassert.assertTrue(_LookforanemailwithyourClientIDinyourinboxsoontext.isDisplayed());
		softassert.assertTrue(_OpenMailCTA.isDisplayed());
		softassert.assertTrue(_CloseCTA.isDisplayed());
		softassert.assertAll();
	}
}
