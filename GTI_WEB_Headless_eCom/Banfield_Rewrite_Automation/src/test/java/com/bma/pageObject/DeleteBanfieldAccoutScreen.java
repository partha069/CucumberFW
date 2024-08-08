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

public class DeleteBanfieldAccoutScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(DeleteBanfieldAccoutScreen.class);

	public DeleteBanfieldAccoutScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _deletePasswordTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/label1")
	@FindBy(id = "Profile/deleteAccount/label1")
	public MobileElement _deletepaswordstaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/divider-text-BUT")
	@FindBy(id = "Profile/deleteAccount/divider-text-BUT")
	public MobileElement _butText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/label2")
	@FindBy(id = "Profile/deleteAccount/label2")
	public MobileElement butStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/divider-text-SO")
	@FindBy(id = "Profile/deleteAccount/divider-text-SO")
	public MobileElement _soText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/label3")
	@FindBy(id = "Profile/deleteAccount/label3")
	public MobileElement _soStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/delete-online-label1")
	@FindBy(id = "Profile/deleteAccount/delete-online-label1")
	public MobileElement _deleteYourOnlineAccountText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/delete-online-label2")
	@FindBy(id = "Profile/deleteAccount/delete-online-label2")
	public MobileElement _thisWillLogYouOutOfTheAppText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/delete-myaccount-btn")
	@FindBy(id = "Profile/deleteAccount/delete-myaccount-btn")
	public MobileElement _yesDeleteMyAccountCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/lable-never-mind-btn")
	@FindBy(id = "Profile/deleteAccount/lable-never-mind-btn")
	public MobileElement _noNeverMindCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/icon-paw")
	@FindBy(id = "Profile/deleteAccount/icon-paw")
	public MobileElement _pawIcon;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/deleteAccount/want-to-delete-label2")
	@FindBy(id = "Profile/deleteAccount/want-to-delete-label2")
	public MobileElement _privacyPolicy;
	
	
	public void verifyUpdatePasswordUI() {
		 softassert.assertTrue(_deletepaswordstaticText.isDisplayed());
		 softassert.assertTrue(_butText.isDisplayed());
		 softassert.assertTrue(butStaticText.isDisplayed());
		 softassert.assertTrue(_soText.isDisplayed());
		 softassert.assertTrue(_soStaticText.isDisplayed());
		 softassert.assertTrue(_deleteYourOnlineAccountText.isDisplayed());
		 softassert.assertTrue(_thisWillLogYouOutOfTheAppText.isDisplayed());
		 swipeDown();
		 softassert.assertTrue(_yesDeleteMyAccountCTA.isDisplayed());
		 softassert.assertTrue(_noNeverMindCTA.isDisplayed());
		 softassert.assertTrue(_pawIcon.isDisplayed());
		 softassert.assertTrue(_privacyPolicy.isDisplayed());
		 softassert.assertAll();
	}
	
	
	
}
