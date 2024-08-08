package com.bma.pageObject;

import java.util.Random;

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

public class SignUpForMyBanfield_CompleteonlineprofileScreenstep4 extends Utilities {

	private static Logger logger = LogManager.getLogger(SignUpForMyBanfield_CompleteonlineprofileScreenstep4.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _SignUpForMyBanfieldHeader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile/title")
	@FindBy(id = "createaccount/steps/completeonlineprofile/title")
	public MobileElement _SetUpYourMyBanfieldText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile//email")
	@FindBy(id = "createaccount/steps/completeonlineprofile//email")
	public MobileElement _EnterEmail;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile//password")
	@FindBy(id = "createaccount/steps/completeonlineprofile//password")
	public MobileElement _NewPassword;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile/confirmPassword")
	@FindBy(id = "createaccount/steps/completeonlineprofile/confirmPassword")
	public MobileElement _ConfirmPassword;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile/emailOptIn/0")
	@FindBy(id = "createaccount/steps/completeonlineprofile/emailOptIn/0")
	public MobileElement _SignUpforspecialcheckbox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes, I would like to receive email offers and reminders.']")
	@FindBy(id = "createaccount/steps/completeonlineprofile/emailOptIn/0")
	public MobileElement _I_would_like_to_receive_email_offers_and_remindersText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile/next")
	@FindBy(id = "createaccount/steps/completeonlineprofile/next")
	public MobileElement _NextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile//email/error")
	@FindBy(id = "createaccount/steps/completeonlineprofile//email/error")
	public MobileElement _InvalidEmailText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/completeonlineprofile/confirmPassword/error")
	@FindBy(id = "createaccount/steps/completeonlineprofile/confirmPassword/error")
	public MobileElement _passworddonotmatchtext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/CompleteOnlineProfile/header/left")
	@FindBy(id = "createaccount/steps/CompleteOnlineProfile/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/steps/CompleteOnlineProfile/header/right")
	@FindBy(id = "createaccount/steps/CompleteOnlineProfile/header/right")
	public MobileElement _cancelCTA;
	
	public void VerifyCreateAccountstep4UI() {
		try {
			softassert.assertTrue(_EnterEmail.isDisplayed());
			softassert.assertTrue(_SignUpForMyBanfieldHeader.isDisplayed());
			softassert.assertTrue(_ConfirmPassword.isDisplayed());
			softassert.assertTrue(_NewPassword.isDisplayed());
			softassert.assertTrue(_SignUpforspecialcheckbox.isDisplayed());
			softassert.assertFalse(_NextCTA.isEnabled());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 4");	
		}
	}
	public void EnterRegisteredemailandpwd() throws Throwable { //Step 4
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep4completeonline.csv";
		String Email= getcsvdata(path,3,"Email", "Email","password");
		String password= getcsvdata(path,3,"password", "Email","password");
		EnterInput(_EnterEmail, Email);
		EnterInput(_NewPassword, password);
		EnterInput(_ConfirmPassword, password);
		TapElement(_SignUpforspecialcheckbox);
		TapElement(_SignUpforspecialcheckbox);
		}
	
	public void EnterValidInformation() throws Throwable {
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccountCredential.csv";
		String Email= getcsvdata(path,2,"Email", "Email","password");
		String password= getcsvdata(path,2,"password", "Email","password");
		EnterInput(_EnterEmail, Email);
		EnterInput(_NewPassword, password);
		EnterInput(_ConfirmPassword, password);
		TapElement(_SignUpforspecialcheckbox);
		TapElement(_SignUpforspecialcheckbox);
		}
	
	public void EnterUNRegisteredemailandpwd() throws Throwable {
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep4completeonline.csv";
		String password= getcsvdata(path,2,"password", "Email","password");
		EnterInput(_EnterEmail, "test@test"+random()+".com");
		EnterInput(_NewPassword, password);
		HidingKeyboard();
		EnterInput(_ConfirmPassword, password);
		HidingKeyboard();
		TapElement(_SignUpforspecialcheckbox);
		TapElement(_SignUpforspecialcheckbox);
		}
	
	
	
}
