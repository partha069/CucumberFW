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

public class UpdateYourPasswordScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(UpdateYourPasswordScreen.class);

	public UpdateYourPasswordScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _UpdateYourPasswordTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/header/left-btn")
	@FindBy(id = "Profile/ChangePassword/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/title")
	@FindBy(id = "Profile/ChangePassword/title")
	public MobileElement _UpdateYourPasswordStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/current-password-input")
	@FindBy(id = "Profile/ChangePassword/current-password-input")
	public MobileElement _CurrentPasswordField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/new-password-input")
	@FindBy(id = "Profile/ChangePassword/new-password-input")
	public MobileElement _NewPasswordField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/confirmPassword-input")
	@FindBy(id = "Profile/ChangePassword/confirmPassword-input")
	public MobileElement _ConfirmYourPasswordField;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/next-btn")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/Profile/ChangePassword/next-btn']")
	@FindBy(id = "Profile/ChangePassword/next-btn")
	public MobileElement _UpdateCTA;
	
	/*
	 * Error Message
	 */
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/current-password-input/error")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/Profile/ChangePassword/current-password-input/error']")
	@FindBy(id = "Profile/ChangePassword/confirmPassword-input/error")
	public MobileElement _ErrorMsg_CurrentPassword;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/confirmPassword-input/error")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/Profile/ChangePassword/confirmPassword-input/error']")
	@FindBy(id = "Profile/ChangePassword/confirmPassword-input/error")
	public MobileElement _ErrorMsg_ConfirmPassword;
	
	/*
	 * Eye Button
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/current-password-input/1")
	@FindBy(id = "Profile/ChangePassword/current-password-input/1")
	public MobileElement _CurrentPasswordEyeButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/new-password-input/1")
	@FindBy(id = "Profile/ChangePassword/new-password-input/1")
	public MobileElement _NewPasswordEyeButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/confirmPassword-input/1")
	@FindBy(id = "Profile/ChangePassword/confirmPassword-input/1")
	public MobileElement _ConfirmYourPasswordEyeButton;
	
	/*
	 * Inline Message
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='passwordrules-text-key-value-minLength']")
	@FindBy(id = "passwordrules-text-key-value-minLength")
	public MobileElement _minLengthText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='passwordrules-text-key-number']")
	@FindBy(id = "passwordrules-text-key-number")
	public MobileElement _OneNumberText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='passwordrules-text-key-value-capital']")
	@FindBy(id = "passwordrules-text-key-value-capital")
	public MobileElement _OneUpperCaseText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='passwordrules-text-key-value-lowercase']")
	@FindBy(id = "passwordrules-text-key-value-lowercase")
	public MobileElement _OneLowerCaseText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='passwordrules-text-key-specialChar']")
	@FindBy(id = "passwordrules-text-key-specialChar")
	public MobileElement _OneSpecialCharText;
	
	/*
	 * Update Your Password - Inline Error Message
	 */
	@AndroidFindBy(id = "passwordrules-icons-minLength-redcross-icn")
	@FindBy(id = "passwordrules-icons-minLength-redcross-icn")
	public MobileElement _minLengthCharErrorCross;
	//
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-number-redcross-icn']")
	@FindBy(id = "passwordrules-icons-number-redcross-icn")
	public MobileElement _numberErrorCross;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-capital-redcross-icn']")
	@FindBy(id = "passwordrules-icons-capital-redcross-icn")
	public MobileElement _upperCaseErrorCross;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-lowercase-redcross-icn']")
	@FindBy(id = "passwordrules-icons-lowercase-redcross-icn")
	public MobileElement _lowerCaseErrorCross;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-specialChar-redcross-icn']")
	@FindBy(id = "passwordrules-icons-specialChar-redcross-icn")
	public MobileElement _specialCharErrorCross;
	
	@AndroidFindBy(id = "passwordrules-icons-minLength-greentick-icn")
	@FindBy(id = "passwordrules-icons-minLength-greentick-icn")
	public MobileElement _minLengthCharErrorTick;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-number-greentick-icn']")
	@FindBy(id = "passwordrules-icons-number-greentick-icn")
	public MobileElement _numberErrorCrossTick;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-capital-greentick-icn']")
	@FindBy(id = "passwordrules-icons-capital-greentick-icn")
	public MobileElement _upperCaseErrorCrossTick;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-lowercase-greentick-icn']")
	@FindBy(id = "passwordrules-icons-lowercase-greentick-icn")
	public MobileElement _lowerCaseErrorCrossTick;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='passwordrules-icons-specialChar-greentick-icn']")
	@FindBy(id = "passwordrules-icons-specialChar-greentick-icn")
	public MobileElement _specialCharErrorCrossTick;
	
	/*
	 * Popups Msg
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	@FindBy(id = "passwordrules-icons-lowercase-greentick-icn")
	public MobileElement _popupsText;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	@FindBy(id = "passwordrules-icons-specialChar-greentick-icn")
	public MobileElement _popupsOkayCTA;
	
	
	/*
	 * Password Update Success! Page
	 */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Profile/ChangePassword/close-btn']")
	@FindBy(id = "passwordrules-icons-lowercase-greentick-icn")
	public MobileElement _popupsCloseCTA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/Profile/ChangePassword/popup-title']")
	@FindBy(id = "passwordrules-icons-specialChar-greentick-icn")
	public MobileElement _popupsSuccessText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/Profile/ChangePassword/popup-message']")
	@FindBy(id = "passwordrules-icons-specialChar-greentick-icn")
	public MobileElement _popupsStaticText;
	

	public void verifyUpdateYourPasswordScreen() {
		softassert.assertTrue(_UpdateYourPasswordStaticText.isDisplayed());
		softassert.assertTrue(_CurrentPasswordField.isDisplayed());
		softassert.assertTrue(_NewPasswordField.isDisplayed());
		softassert.assertTrue(_ConfirmYourPasswordField.isDisplayed());
		softassert.assertTrue(_UpdateCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyEyeButton() {
		softassert.assertTrue(_CurrentPasswordEyeButton.isDisplayed());
		softassert.assertTrue(_NewPasswordEyeButton.isDisplayed());
		softassert.assertTrue(_ConfirmYourPasswordEyeButton.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyFields() {
		softassert.assertTrue(_CurrentPasswordField.isDisplayed());
		softassert.assertTrue(_NewPasswordField.isDisplayed());
		softassert.assertTrue(_ConfirmYourPasswordField.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyInlineMessage() {
		softassert.assertTrue(_minLengthText.isDisplayed());
		softassert.assertTrue(_OneNumberText.isDisplayed());
		softassert.assertTrue(_OneUpperCaseText.isDisplayed());
		softassert.assertTrue(_OneLowerCaseText.isDisplayed());
		softassert.assertTrue(_OneSpecialCharText.isDisplayed());
		softassert.assertAll();
	}
}
