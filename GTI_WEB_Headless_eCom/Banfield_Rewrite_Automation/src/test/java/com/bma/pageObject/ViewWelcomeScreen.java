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

public class ViewWelcomeScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	public ViewWelcomeScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Welcome Screen Elements
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/signin")
	@FindBy(id  = "welcome/signin")
	public MobileElement _signInbutton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/make-appointment")
	@FindBy(id = "welcome/make-appointment")
	public MobileElement _makeAppointmentAsGuestbutton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/create-account")
	@FindBy(id  = "welcome/create-account")
	public MobileElement _newCreateAccountbutton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/find-nearby-location")
	@FindBy(name  = "welcome/find-nearby-location")
	public MobileElement _findANearbyLocationbutton;
	   
	//com.banfield.react.bpht:id/welcome/build-package-btn
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/owp-txt")
	@FindBy(id = "welcome/owp-txt")
	public MobileElement _buildPackagebutton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/owp-txt")
	@FindBy(id = "welcome/owp-txt")
	public MobileElement _owpText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/privacy-policy")
	@FindBy(xpath  = "//XCUIElementTypeOther[@name='Terms of service']")
	public MobileElement _PrivacyPolicy;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/welcome/terms-service")
	@FindBy(xpath  = "//XCUIElementTypeOther[@name='Privacy policy']")
	public MobileElement _TermsOfService;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "Don’t Allow")
	public MobileElement _deny;
	
	/*
	 * Verifying the UI Element for Welcome Screen 
	 */
	public void verifyWelcomeScreenUIElement() throws InterruptedException {
		Thread.sleep(3000);
		softassert.assertTrue(_signInbutton.isDisplayed());
		softassert.assertTrue(_makeAppointmentAsGuestbutton.isDisplayed());
		softassert.assertTrue(_newCreateAccountbutton.isDisplayed());
		softassert.assertTrue(_findANearbyLocationbutton.isDisplayed());
   //   softassert.assertTrue(_buildPackagebutton.isDisplayed()); CR
		softassert.assertTrue(_PrivacyPolicy.isDisplayed());
		softassert.assertTrue(_TermsOfService.isDisplayed());
		softassert.assertAll();
	}

	/*
	 * Tapping on Sign in CTA
	 * 
	 */
	public void TapOnSigninbutton() {
		try {
			WaitVisibilityOfElement(_signInbutton);
			TapElement(_signInbutton);
			logger.info("Tap on Sign in CTA");
		} catch (Exception e) {
			logger.info("Failed to tap on Sign in CTA");
		}
	}

	/*
	 * Tapping on Create Account CTA
	 */
	public void TapOnnewCreateAccount() {
		try {
			WaitVisibilityOfElement(_newCreateAccountbutton);
			TapElement(_newCreateAccountbutton);
			logger.info("Tap on New Create Account");
		} catch (Exception e) {
			logger.info("Failed to tap on New Create Account");
		}
	}

	/*
	 * Tapping on Make Appointment as Guest CTA
	 */
	public void TapOnMakeAppointmentasGuest() {
		try {
			TapElement(_makeAppointmentAsGuestbutton);
			logger.info("User Tapped on Make Appointment as Guest CTA");
		} catch (Exception e) {
			logger.info("Failed to tap on Make Appointment as Guest CTA");
		}
	}
}
