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

public class Login_Migrated_User_Flow extends Utilities {

	private static Logger logger = LogManager.getLogger(Login_Migrated_User_Flow.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public Login_Migrated_User_Flow(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Login Migrated User Flow
	 */

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='MigratedUser/Email/TextInPut']")//ok
	@FindBy(id = "MigratedUser/Email/TextInPut")
	public MobileElement _LoginMigrateduserEmailtestfield;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='MigratedUser/reset-link-btn']")//ok
	@FindBy(id = "MigratedUser/reset-link-btn")
	public MobileElement _sendmyresetlinkCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MigratedUser/forgot-btn") //ok
	@FindBy(id = "MigratedUser/forgot-btn")
	public MobileElement _MigratedUserforgotbtnCTA;
	
	
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrated/welcome-lbl") 
	@FindBy(id = "login/migrated/welcome-lbl")
	public MobileElement _MigratedUserStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrated/password-txt") 
	@FindBy(id = "login/migrated/password-txt")
	public MobileElement _MigratedUserGetReadyText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/migrated/link-txt") 
	@FindBy(id = "login/migrated/link-txt")
	public MobileElement _MigratedUserJustuseText;
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/screen/header/title']")
	@FindBy(id = "screen/header/title")
	public MobileElement _LoginMigrateduserpopupheader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Login/MigratedUser/header/right-btn")
	@FindBy(id = "Login/MigratedUser/header/right-btn")
	public MobileElement _CancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Login/MigratedUser/header/left-btn")
	@FindBy(id = "Login/MigratedUser/header/left-btn")
	public MobileElement _backCTA;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Login/MigratedUser/header/left-btn")
//	@FindBy(id = "Login/MigratedUser/header/left-btn")
//	public MobileElement _welcometoyourpawsawtext;
//	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Login/MigratedUser/header/left-btn")
//	@FindBy(id = "Login/MigratedUser/header/left-btn")
//	public MobileElement _getreadyfornewbanfield;
//	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/Login/MigratedUser/header/left-btn")
//	@FindBy(id = "Login/MigratedUser/header/left-btn")
//	public MobileElement _justuseyourmybanfieldemail;
	

	
	public void verifymigrateduserpopupscreenUI() {
		softassert.assertTrue(_LoginMigrateduserpopupheader.isDisplayed());	
		softassert.assertTrue(_LoginMigrateduserEmailtestfield.isDisplayed());	
		softassert.assertTrue(_sendmyresetlinkCTA.isDisplayed());	//i
		softassert.assertTrue(_MigratedUserforgotbtnCTA.isDisplayed());	
		softassert.assertTrue(_CancelCTA.isDisplayed());
		softassert.assertTrue(_backCTA.isDisplayed());	
		softassert.assertAll();
	}

}
