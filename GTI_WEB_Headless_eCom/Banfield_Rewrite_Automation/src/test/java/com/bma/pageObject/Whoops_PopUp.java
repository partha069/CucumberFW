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

public class Whoops_PopUp extends Utilities {

	private static Logger logger = LogManager.getLogger(Whoops_PopUp.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Whoops_PopUp(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/dialog/title")
	@FindBy(id = "createaccount/singupforbanfield/dialog/title")
	public MobileElement _WhoopsTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/dialog/helpwithclientid")
	@FindBy(id = "createaccount/signupbanfield/dialog/helpwithclientid")
	public MobileElement _HelpWithClientIdCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/dialog/message")
	@FindBy(id = "createaccount/singupforbanfield/dialog/message")
	public MobileElement _ThatClientIDisntinoursystemText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/dialog/close")
	@FindBy(id = "createaccount/singupforbanfield/dialog/close")
	public MobileElement _CloseCTA;
}
