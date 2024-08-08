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

public class Whoops_PopUp_RetrieveEmail_login extends Utilities {

	private static Logger logger = LogManager.getLogger(Whoops_PopUp_RetrieveEmail_login.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Whoops_PopUp_RetrieveEmail_login(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/header")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/header")
	public MobileElement _WhoopsTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/desc")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/desc")
	public MobileElement _LooksLikeAlreadyHaveAccountText;
	                                     
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/login")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/login")
	public MobileElement _LoginNowCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/loginmodal/close")
	@FindBy(id = "createaccount/signupbanfield/loginmodal/close")
	public MobileElement _CloseCTA;
	
	
	public void verifyLooksLikeAlreadyHaveAccountPopups() {
		softassert.assertTrue(_WhoopsTitle.isDisplayed());
		softassert.assertTrue(_LooksLikeAlreadyHaveAccountText.isDisplayed());
		softassert.assertTrue(_LoginNowCTA.isDisplayed());
		softassert.assertTrue(_CloseCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
}
