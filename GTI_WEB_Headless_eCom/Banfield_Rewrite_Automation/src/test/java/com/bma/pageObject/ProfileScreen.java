package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProfileScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();
	public AboutMarsSteps AboutMars;

	public ProfileScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * UI Elements
	 */	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/myprofile/menu/0']")
	@FindBy(id = "myprofile/menu/0")
	public MobileElement _YourProfileCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/1")
	@FindBy(id = "myprofile/menu/1")
	public MobileElement _YourPetsCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/2")
	@FindBy(id = "myprofile/menu/2")
	public MobileElement _plans;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/3")
	@FindBy(id = "myprofile/menu/3")
	public MobileElement _ContactUsCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/4")
	@FindBy(id = "myprofile/menu/4")
	public MobileElement _legalStuff;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myprofile/menu/5")
	@FindBy(id = "myprofile/menu/5")
	public MobileElement _SettingsCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/socialnetwork/facebook}")
	@FindBy(id = "socialnetwork/facebook}")
	public MobileElement _facebookicon;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/socialnetwork/twitter}")
	@FindBy(name = "socialnetwork/twitter}")
	public MobileElement _twittericon;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/socialnetwork/instagram}")
	@FindBy(id = "socialnetwork/instagram}")
	public MobileElement _instagramicon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/socialnetwork/youtube}")
	@FindBy(id = "socialnetwork/youtube}")
	public MobileElement _youtubeicon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _HiUser_header;
	
	@AndroidFindBy(id = "socialnetwork/copywrite")
	@FindBy(id = "©2021 Banfield Pet Hospital")
	public MobileElement _trademark;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/log-out-btn")
	@FindBy(id = "settings/log-out-btn")
	public MobileElement _LogoutCTA;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='bottomnav/3']")
//	@FindBy(id = "bottomnav/3")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='bottomnav/3']")   
	public MobileElement _profileCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Name-lbl")
	@FindBy(id = "settings/profile/Name-lbl")
	public MobileElement _Profile_NameLabel;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/settings/profile/Client ID-lbl']")
	@FindBy(id = "settings/profile/Client ID-lbl")
	public MobileElement _Profile_ClientIDLabel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Email-lbl")
	@FindBy(id = "settings/profile/Email-lbl")
	public MobileElement _Profile_EmailLabel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Mobile-lbl")
	@FindBy(id = "settings/profile/Mobile-lbl")
	public MobileElement _Profile_MobileLabel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Work-lbl")
	@FindBy(id = "settings/profile/Work-lbl")
	public MobileElement _Profile_WorkLabel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Address-lbl")
	@FindBy(id = "settings/profile/Address-lbl")
	public MobileElement _Profile_AddressLabel;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Name-val")
	@FindBy(id = "settings/profile/Name-val")
	public MobileElement _Profile_NameTextField;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/settings/profile/Client ID-val']")
	@FindBy(id = "settings/profile/Client ID-val")
	public MobileElement _Profile_ClientIDTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Email-val")
	@FindBy(id = "settings/profile/Email-val")
	public MobileElement _Profile_EmailTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Mobile-val")
	@FindBy(id = "settings/profile/Mobile-val")
	public MobileElement _Profile_MobileTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Work-val")
	@FindBy(id = "settings/profile/Work-val")
	public MobileElement _Profile_WorkTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/settings/profile/Address-val")
	@FindBy(id = "settings/profile/Address-val")
	public MobileElement _Profile_AddressTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/change-password-btn")
	@FindBy(id = "profile/change-password-btn")
	public MobileElement _changePasswordCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/update-profile-btn")
	@FindBy(id = "profile/update-profile-btn")
	public MobileElement _updateProfileCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/lable-delete-account-btn")
	@FindBy(id = "profile/lable-delete-account-btn")
	public MobileElement _deleteCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/YourProfile/header/left-btn")
	@FindBy(id = "Profile/YourProfile/header/left-btn")
	public MobileElement _ProfilebackCTA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Banfield Pet Hospital']")
	@FindBy(id = "profile/update-profile-btn")
	public MobileElement _banfield_Youtube;
	
	/*
	 * Browser - Contact Us 
	 */
	@AndroidFindBy(xpath = "//android.view.View[@text='Get in touch with Banfield�']")
	@FindBy(id = "com.android.chrome:id/line_1")
	public MobileElement _contactUsText;

	
	/*
	 * Verify Text Field
	 */
	public void verifytextfieldenabledisable() throws Throwable {
		Thread.sleep(1000);
		softassert.assertTrue(_Profile_NameTextField.isEnabled());
		softassert.assertTrue(_Profile_ClientIDTextField.isEnabled());
		softassert.assertTrue(_Profile_EmailTextField.isEnabled());
		softassert.assertTrue(_Profile_MobileTextField.isEnabled());
		softassert.assertTrue(_Profile_WorkTextField.isEnabled());
		softassert.assertTrue(_Profile_AddressTextField.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify Profile
	 */
	public void verifyprofilescreen() {
		softassert.assertTrue(_YourProfileCTA.isDisplayed());
		softassert.assertTrue(_plans.isDisplayed());
		softassert.assertTrue(_ContactUsCTA.isDisplayed());
		softassert.assertTrue(_legalStuff.isDisplayed());
		softassert.assertTrue(_SettingsCTA.isDisplayed());
		softassert.assertTrue(_youtubeicon.isDisplayed());
		softassert.assertTrue(_twittericon.isDisplayed());
		softassert.assertTrue(_instagramicon.isDisplayed());
		softassert.assertTrue(_youtubeicon.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify Profile page
	 */
	public void verifyprofilepage() {
		softassert.assertTrue(_Profile_NameLabel.isDisplayed());
		softassert.assertTrue(_Profile_ClientIDLabel.isDisplayed());
		softassert.assertTrue(_Profile_EmailLabel.isDisplayed());
		softassert.assertTrue(_Profile_MobileLabel.isDisplayed());
		softassert.assertTrue(_Profile_WorkLabel.isDisplayed());
		softassert.assertTrue(_Profile_AddressLabel.isDisplayed());
	//	softassert.assertTrue(_changePasswordCTA.isDisplayed());
	//	softassert.assertTrue(_updateProfileCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void Logout() {
	    TapElement(_profileCTA);
	    TapElement(_SettingsCTA);
	    TapElement(_LogoutCTA);
	}
	}
