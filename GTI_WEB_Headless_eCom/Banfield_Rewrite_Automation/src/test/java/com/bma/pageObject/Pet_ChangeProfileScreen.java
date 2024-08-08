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

public class Pet_ChangeProfileScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(Pet_ChangeProfileScreen.class);

	public Pet_ChangeProfileScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Change Profile UI Elements
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _petNameTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/header/left-btn")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatepetImage/change-photo-btn")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='AddPet/Steps/UpdatepetImage/change-photo-btn']")
	public MobileElement _changePhotoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/choose-photo-txt")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/choose-photo-txt")
	public MobileElement _choosePhotoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/next-btn")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/next-btn")
	public MobileElement _doneCTA;
	
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	@FindBy(id = "permission_allow_one_time_button")
	public MobileElement _onlyThisTimePopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _denyPopups;
	
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@FindBy(id = "permission_allow_button")
	public MobileElement _AllowPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "permission_deny_button")
	public MobileElement _DontAllowPopups;
	

}
