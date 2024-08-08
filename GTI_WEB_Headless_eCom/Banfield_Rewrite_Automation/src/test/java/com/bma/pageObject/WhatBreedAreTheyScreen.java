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

public class WhatBreedAreTheyScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public WhatBreedAreTheyScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * UI Page Element
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _WhatBreedAreTheyScreenTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	public MobileElement _BreedName; 

	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/age-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/age-txt")
	public MobileElement _BreedAge;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/gender-txt")
    @FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/gender-txt")
	public MobileElement _BreedGender;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-txt")
	public MobileElement _BreedTitleText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedName-btn")
	public MobileElement _BreedPlaceHolder;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedNameCancel-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedNameCancel-txt")
	public MobileElement _BreedPlaceHolderText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedNameCancel-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/breedNameCancel-btn")
	public MobileElement _BreedPlaceHolderCancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/isMixedBreed-btn/0")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/isMixedBreed-btn/0")
	public MobileElement _mixedbreedCheckBox;
	
	
	
	/*
	 * Search Page
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn")
	public MobileElement _searchfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/0")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/0")
	public MobileElement _dropdownelement1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/1")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/1")
	public MobileElement _dropdownelement2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/2")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/2")
	public MobileElement _dropdownelement3;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Abyssinian']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/0']")
	//@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/search-btn/0/name")
	public MobileElement _Abyssinian;
	
	/*
	 * Navigation
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/header/left-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/header/right-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/header/right-btn")
	public MobileElement _cancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/screen/next-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/screen/next-btn")
	public MobileElement _nextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/WhatBreed/screen/next-btn1")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/WhatBreed/screen/next-btn1")
	public MobileElement _nextCTASearchScreen;
	
	
	public void verifyBreedsdetails() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_BreedName.isDisplayed());
		softassert.assertTrue(_BreedAge.isDisplayed());
		softassert.assertTrue(_BreedGender.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifypetname() throws Throwable {
	    Thread.sleep(200);
		softassert.assertTrue(_dropdownelement1.isDisplayed());
		softassert.assertTrue(_dropdownelement2.isDisplayed());
		softassert.assertTrue(_dropdownelement3.isDisplayed());
		softassert.assertAll();
	}
	
}
