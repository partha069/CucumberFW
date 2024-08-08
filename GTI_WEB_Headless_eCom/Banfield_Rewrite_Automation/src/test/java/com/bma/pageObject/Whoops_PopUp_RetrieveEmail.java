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

public class Whoops_PopUp_RetrieveEmail extends Utilities {

	private static Logger logger = LogManager.getLogger(Whoops_PopUp_RetrieveEmail.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Whoops_PopUp_RetrieveEmail(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/header")
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/header")
	public MobileElement _WhoopsTitle;
     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/desc")
	public MobileElement _ThatEmailisNotInOurSystemText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/forgot-banfield-email")
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/forgot-banfield-email")
	public MobileElement _ForgotYourMyBanfieldemailCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/forgotmodal/close")
	@FindBy(id = "createaccount/signupbanfield/forgotmodal/close")
	public MobileElement _CloseCTA;
}
