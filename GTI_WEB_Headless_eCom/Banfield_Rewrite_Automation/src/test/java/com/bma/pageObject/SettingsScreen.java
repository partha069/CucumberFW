package com.bma.pageObject;

import java.util.List;

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

public class SettingsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(SettingsScreen.class);

	public SettingsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _settingsTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/Settings/header/left-btn")
	@FindBy(id = "Profile/Settings/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/push-notification-txt")
	@FindBy(id = "settings/push-notification-txt")
	public MobileElement _pushNotificationsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/push-notification-switch")
	@FindBy(id = "settings/push-notification-switch")
	public MobileElement _pushNotificationsButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/settings/notification-modal-disable/opensettings")
	@FindBy(id = "profile/settings/notification-modal-disable/opensettings")
	public MobileElement _open_setting_popup_disable_cta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/settings/notification-modal-disable/desc")
	@FindBy(id = "profile/settings/notification-modal-disable/desc")
	public MobileElement _open_setting_popup_disable_disc;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/settings/notification-modal-enable/opensettings")
	@FindBy(id = "profile/settings/notification-modal-enable/opensettings")
	public MobileElement _open_setting_popup_enable_cta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/settings/notification-modal-enable/desc")
	@FindBy(id = "profile/settings/notification-modal-enable/desc")
	public MobileElement _open_setting_popup_enable_disc;
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/allow-biometric-txt")
	@FindBy(id = "settings/allow-biometric-txt")
	public MobileElement _allowBiometricsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/allow-biometric-switch")
	@FindBy(id = "settings/allow-biometric-switch")
	public MobileElement _allowBiometricsButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/build-number-txt")
	@FindBy(id = "settings/build-number-txt")
	public MobileElement _buildText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/log-out-btn")
	@FindBy(id = "settings/log-out-btn")
	public MobileElement _logOutCTA;
	
	
	public void verifyParasiteControlVaccines() {
		softassert.assertTrue(_pushNotificationsText.isDisplayed());
		softassert.assertTrue(_pushNotificationsButton.isDisplayed());
		softassert.assertTrue(_allowBiometricsText.isDisplayed());
		softassert.assertTrue(_allowBiometricsButton.isDisplayed());
		softassert.assertTrue(_buildText.isDisplayed());
		softassert.assertTrue(_logOutCTA.isDisplayed());
		softassert.assertAll();
	}
	

	public void verifyopensettingpopup() {
		try {
			Assert.assertTrue(_open_setting_popup_disable_cta.isDisplayed());
			Assert.assertTrue(_open_setting_popup_disable_disc.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(_open_setting_popup_enable_cta.isDisplayed());
			Assert.assertTrue(_open_setting_popup_enable_disc.isDisplayed());
		}

	}
	
}
