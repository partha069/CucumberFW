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

public class MyPetsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(MyPetsScreen.class);

	public MyPetsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/title")
	@FindBy(id = "profile/petsSettings/title")
	public MobileElement _myPetsText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _myPetsTitleText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Profile/YourPetsSettings/header/left-btn")
	@FindBy(id = "Profile/YourPetsSettings/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-0-lbl")
	@FindBy(id = "profile/petsSettings/pet-0-lbl")
	public MobileElement _pet0;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-0-switch")
	@FindBy(id = "profile/petsSettings/pet-0-switch")
	public MobileElement _pet0CTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-1-lbl")
	@FindBy(id = "profile/petsSettings/pet-1-lbl")
	public MobileElement _pet1;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-1-switch")
	@FindBy(id = "profile/petsSettings/pet-1-switch")
	public MobileElement _pet1CTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-2-lbl")
	@FindBy(id = "profile/petsSettings/pet-2-lbl")
	public MobileElement _pet2;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/profile/petsSettings/pet-2-switch")
	@FindBy(id = "profile/petsSettings/pet-2-switch")
	public MobileElement _pet2CTA; 
	
	
	public void verifyPets() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_pet0.isDisplayed());
		softassert.assertTrue(_pet0.isDisplayed());
		softassert.assertAll();
	}
	
	public void verifyToggleButton() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_pet0CTA.isDisplayed());
		softassert.assertTrue(_pet0CTA.isDisplayed());
		softassert.assertAll();
	}
	

}
