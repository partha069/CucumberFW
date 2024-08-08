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

public class ChangePasswordScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(ChangePasswordScreen.class);

	public ChangePasswordScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _changePasswordTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/title")
	@FindBy(id = "Profile/ChangePassword/title")
	public MobileElement _staticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/current-password-input")
	@FindBy(id = "Profile/ChangePassword/current-password-input")
	public MobileElement _currentpasswordField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/new-password-input")
	@FindBy(id = "Profile/ChangePassword/new-password-input")
	public MobileElement _newPasswordField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/confirmPassword-input")
	@FindBy(id = "Profile/ChangePassword/confirmPassword-input")
	public MobileElement _confirmPasswordField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/next-btn")
	@FindBy(id = "Profile/ChangePassword/next-btn")
	public MobileElement _uPdateCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/ChangePassword/header/left-btn")
	@FindBy(id = "Profile/ChangePassword/header/left-btn")
	public MobileElement _backCTA;
	
	
	public void verifyUpdatePasswordUI() {
		 softassert.assertTrue(_staticText.isDisplayed());
		 softassert.assertTrue(_currentpasswordField.isDisplayed());
		 softassert.assertTrue(_newPasswordField.isDisplayed());
		 softassert.assertTrue(_confirmPasswordField.isDisplayed());
		 softassert.assertTrue(_uPdateCTA.isDisplayed());
		 softassert.assertAll();
	}
	
	
	
}
