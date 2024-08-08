package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LetsAddTheirPhotoScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public LetsAddTheirPhotoScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * UI Element
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _LetsAddTheirPhotoTitletext;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/header/left-btn")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/header/left-btn']")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/header/right-btn")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/header/right-btn")
	public MobileElement _closeCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	public MobileElement _name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/age-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/age-txt")
	public MobileElement _age;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/gender-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/gender-txt")
	public MobileElement _gender;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/bredd-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/bredd-txt")
	public MobileElement _breed;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/AddPet-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/AddPet-btn")
	public MobileElement _addPhotoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/next-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/next-btn")
	public MobileElement _skipCTA;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	@FindBy(xpath = "//XCUIElementTypeAlert[@name='â€œBanfieldâ€� Would Like to Access the Camera']")
	public MobileElement _nativePopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id = "OK")
	public MobileElement _whileUsingAppPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	@FindBy(id = "OK")
	public MobileElement _onlyThisTimePopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "Donâ€™t Allow")
	public MobileElement _denyPopups;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	@FindBy(id = "Donâ€™t Allow")
	public MobileElement _denyPopupspermission;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='Allow Access to All Photos']")
	public MobileElement _allowPopupsfordeviceaccess;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "Donâ€™t Allow")
	public MobileElement _denyPopupsfordeviceaccess;
	                     
	//com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/isMixedBreed-btn/0
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/breedMixed-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/breedMixed-txt")
	public MobileElement _mixedbreed;
	
	/*
	 * Custom Popups
	 */
	//android:id/alertTitle
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']") 
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Permissions Required\"]")
	public MobileElement _permissionRequired;
	
	//android:id/message
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='To use Image Cropper plugin features you need to allow the device Camera and Storage access.']")
	public MobileElement _permissionRequiredText;
	
	//android:id/button1
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	@FindBy(id = "Okay")
	public MobileElement _okCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/set-photo-txt")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/set-photo-txt")
	public MobileElement _setPhoto;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/take-photo-txt")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/take-photo-txt")
	public MobileElement _TakePhotoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/choose-photo-txt")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/choose-photo-txt")
	public MobileElement _choosePhotoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/UpdatePetImage/cancel-btn")
	@FindBy(id = "AddPet/Steps/UpdatePetImage/cancel-btn")
	public MobileElement _CancelCTACTA;
	
	/*
	 * Verify UI
	 */
	public void verifyLetsAddTheirPhotoScreen() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_name.isDisplayed());
		softassert.assertTrue(_age.isDisplayed());
		softassert.assertTrue(_gender.isDisplayed());
		softassert.assertTrue(_breed.isDisplayed());
		softassert.assertTrue(_addPhotoCTA.isDisplayed());
		softassert.assertTrue(_skipCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyPetCard() {
		softassert.assertTrue(_name.isDisplayed());
		softassert.assertTrue(_age.isDisplayed());
		softassert.assertTrue(_gender.isDisplayed());
		softassert.assertTrue(_breed.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyCustomPopup() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_permissionRequired.isDisplayed());
		softassert.assertTrue(_permissionRequiredText.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyCustomPopupsforSetPhoto() {
		softassert.assertTrue(_setPhoto.isDisplayed());
		softassert.assertTrue(_TakePhotoCTA.isDisplayed());
		softassert.assertTrue(_choosePhotoCTA.isDisplayed());
		softassert.assertAll();
		
	}
	
	
	}
