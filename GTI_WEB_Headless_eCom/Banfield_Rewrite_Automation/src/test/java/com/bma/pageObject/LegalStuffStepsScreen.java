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

public class LegalStuffStepsScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public LegalStuffStepsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/* 
	 * Legal Stuff Page
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/legalstuff/menu/1")
	@FindBy(id = "legalstuff/menu/1")
	public MobileElement _privacy;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/legalstuff/menu/2")
	@FindBy(id = "legalstuff/menu/2")
	public MobileElement _assessibility;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/legalstuff/menu/3")
	@FindBy(id = "legalstuff/menu/3")
	public MobileElement _covidResources;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/legalstuff/menu/4")
	@FindBy(id = "legalstuff/menu/4")
	public MobileElement _aboutMars;

//	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/screen/header/title']")
	@FindBy(id = "screen/header/title")
	public MobileElement _headerTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/steps/youareallset/header/left-btn")
	@FindBy(id = "schedule/steps/youareallset/header/left-btn")
	public MobileElement _backCTA;
	
	/*
	 * Terms and conditions Element
	 */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/legalstuff/menu/0']")
	@FindBy(id = "legalstuff/menu/0")
	public MobileElement _Termsandcondition;
	
	/*
	 * Chrome Browser Elements
	 */
	@AndroidFindBy(id = "com.android.chrome:id/line_1")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _tapOnUrl;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Edit']")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _UrlEdit;
	
	@AndroidFindBy(id = "com.android.chrome:id/url_bar")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _UrlField;
	
	/*
	 * Browser - Terms and conditions
	 */
	@AndroidFindBy(id = "com.android.chrome:id/url_bar")
	@FindBy(id = "com.android.chrome:id/url_bar")
	public MobileElement _defaultbrowser;
	
	/*
	 * Browser - Privacy / Accessibility / About Mars
	 */
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Mars Home page']/android.widget.Image")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _MarsText;
	
	/*
	 * Browser - Privacy 
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pets, people, and COVID-19']")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _covid19Text;
	
	
	
	/*
	 * Verify UI Element for Legal Stuff Page
	 */
	public void verifyLegalstuffCTA() {
		softassert.assertTrue(_Termsandcondition.isDisplayed());
		softassert.assertTrue(_privacy.isDisplayed());
		softassert.assertTrue(_assessibility.isDisplayed());
		softassert.assertTrue(_covidResources.isDisplayed());
		softassert.assertTrue(_aboutMars.isDisplayed());
		softassert.assertAll();
	}

}
