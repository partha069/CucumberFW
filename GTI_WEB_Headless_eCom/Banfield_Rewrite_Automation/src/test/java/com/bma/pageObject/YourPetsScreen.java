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

public class YourPetsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(YourPetsScreen.class);

	public YourPetsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _YourPetstitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/AddPet-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/AddPet-btn")
	public MobileElement _addAnotherPetCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/screen/Addnewpetnext-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/screen/Addnewpetnext-btn")
	public MobileElement _doneCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/screen/default-next-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/screen/default-next-btn")
	public MobileElement _doneCTA2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/breedName-txt")
	public MobileElement _name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/age-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/age-txt")
	public MobileElement _age;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/gender-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/gender-txt")
	public MobileElement _gender;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/bredd-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/bredd-txt")
	public MobileElement _breed;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/breedImageDelete-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/breedImageDelete-btn")
	public MobileElement _trashCTA;

	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/screen/Addnewpetnext-btn")
	public MobileElement _nextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/header/left-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/Deletepet/header/right-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/Deletepet/header/right-btn")
	public MobileElement _ClosedCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/YourPets/LastvisitsEmpty-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/YourPets/LastvisitsEmpty-txt")
	public MobileElement _AddYourPetToGetStarted;
	
	/*
	 * Native Popups
	 */
	@AndroidFindBy(id = "android:id/message")
	@FindBy(id = "Are you sure you want to remove this pet?")
	public MobileElement _removethisPetPopupText;
	
	@AndroidFindBy(id = "android:id/button2")
	@FindBy(id = "Delete")
	public MobileElement _deleteCTA;
	
	@AndroidFindBy(id = "android:id/button1")
	@FindBy(id = "Cancel")
	public MobileElement _cancelCTA;
	
	
	public void verifypetscard() {
		softassert.assertTrue(_name.isDisplayed());
		softassert.assertTrue(_age.isDisplayed());
		softassert.assertTrue(_gender.isDisplayed());
		softassert.assertTrue(_breed.isDisplayed());
		softassert.assertTrue(_trashCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyNativePopups() {
		softassert.assertTrue(_removethisPetPopupText.isDisplayed());
		softassert.assertTrue(_deleteCTA.isDisplayed());
		softassert.assertTrue(_cancelCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
}
