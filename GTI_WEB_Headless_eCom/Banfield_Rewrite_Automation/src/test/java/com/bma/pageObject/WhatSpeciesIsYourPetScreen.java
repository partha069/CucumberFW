package com.bma.pageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.*;
import com.bma.stepDefinition.MakeAnAppointmentStep3WhoareweschedulingSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WhatSpeciesIsYourPetScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public WhatSpeciesIsYourPetScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * WhatSpeciesIsYourPet
	 */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Not all locations can handle exotics. You will need to call the hospital to schedule an appointment.']")
	@FindBy(id = "schedule/addpet/breed")
	public MobileElement _whatspeciesisyourpetText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breeds/petitem/pet0")
	@FindBy(id = "schedule/addpet/breeds/petitem/pet0")
	public MobileElement _dog;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breeds/petitem/pet1")
	@FindBy(name = "schedule/addpet/breeds/petitem/pet1")
	public MobileElement _cat;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breed")
	@FindBy(id = "schedule/addpet/breed")
	public MobileElement _staticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breeds/next") 
	@FindBy(id = "schedule/addpet/breeds/next")
	public MobileElement _nextbutton;

	//com.banfield.react.bpht:id/screen/header/title
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.banfield.react.bpht:id/screen/header/title']")  
	@FindBy(id = "screen/header/title")
	public MobileElement _whatsspeciestitle;
	
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breeds/header/left")
	@FindBy(id = "schedule/addpet/breeds/header/left")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/breeds/header/right")
	@FindBy(id = "schedule/addpet/breeds/header/right")
	public MobileElement _cancelCTA;
	
	
	/*
	 * Home > What Species Is Your Pet Screen
	 */
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet2")  
	@FindBy(id = "addpet/breeds/petitem/pet2")
	public MobileElement _birdSpecies; //
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet0")  
	@FindBy(id = "addpet/breeds/petitem/pet0")
	public MobileElement _dogSpecies; //
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet1")  
	@FindBy(id = "addpet/breeds/petitem/pet1")
	public MobileElement _CatSpecies; //
	
//	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet2")  
//	@FindBy(id = "addpet/breeds/petitem/Feline/2")
//	public MobileElement _birdSpecies; //

	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet3")  
	@FindBy(id = "addpet/breeds/petitem/pet3")
	public MobileElement _GuineaPigSpecies;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet4")  
	@FindBy(id = "addpet/breeds/petitem/pet4")
	public MobileElement _rabbitSpecies;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet5")  
	@FindBy(id = "addpet/breeds/petitem/pet5")
	public MobileElement _reptileSpecies;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/petitem/pet6")  
	@FindBy(id = "addpet/breeds/petitem/pet6")
	public MobileElement _pocketPetSpecies;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/screen/header/title")  
	@FindBy(id = "screen/header/title")
	public MobileElement _whatSpeciesTitle;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/header/right")  
	@FindBy(id = "addpet/breeds/header/right")
	public MobileElement _closeCTA;
	
	@AndroidFindBy(id ="com.banfield.react.bpht:id/addpet/breeds/nextbtn")  
	@FindBy(id = "addpet/breeds/nextbtn")
	public MobileElement _nextCTA;
	
	/*
	 * Verify Home > What Species Is Your Pet Screen
	 */
	
	public void verifywhatsSpeciesPage() throws Throwable {
		Thread.sleep(1000);
		ScrolltoElement("Pocket Pets");
		softassert.assertTrue(_rabbitSpecies.isDisplayed());
		softassert.assertTrue(_reptileSpecies.isDisplayed());
		softassert.assertTrue(_pocketPetSpecies.isDisplayed());
		ScrolltoElement("Pocket Pets");
		ScrolltoElement("Dog");
		softassert.assertTrue(_dogSpecies.isDisplayed());
		softassert.assertTrue(_CatSpecies.isDisplayed());
		softassert.assertTrue(_birdSpecies.isDisplayed());
		softassert.assertTrue(_GuineaPigSpecies.isDisplayed());
		Thread.sleep(3000);
		
		softassert.assertAll();
	}
	
	public void noSpeciesSelectedByDefault() {
		softassert.assertTrue(_birdSpecies.isDisplayed());
		softassert.assertTrue(_dogSpecies.isDisplayed());
		softassert.assertTrue(_CatSpecies.isDisplayed());
	//	softassert.assertTrue(_GuineaPigSpecies.isEnabled());
//		TapElement(_catSpecies);
//		Scroll("Reptile");
//		softassert.assertTrue(_rabbitSpecies.isEnabled());
//		softassert.assertTrue(_reptileSpecies.isEnabled());
	//	softassert.assertTrue(_pocketPetSpecies.isEnabled());
		softassert.assertAll();
	}
	
	public void cannotMultiSelectSpecies() {
		TapElement(_birdSpecies);
		softassert.assertTrue(_birdSpecies.isEnabled());
		TapElement(_dogSpecies);
		softassert.assertTrue(_dogSpecies.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify What species is your pet screen 
	 */
	public void Whatspeciesisyourpet() throws InterruptedException {
		softassert.assertTrue(_whatsspeciestitle.isDisplayed());
		softassert.assertTrue(_whatspeciesisyourpetText.isDisplayed());
		softassert.assertAll();
	}
	

	/*
	 * Tapping on Dog
	 */
	public void TapOnDog() {

		try {
			TapElement(_dog);
			logger.info("Tap on Dog");
		} catch (Exception e) {
			logger.info("Failed to tap on Dog");
		}
	}

	
	/*
	 * Tapping on Cat
	 */
	public void TapOnCat() {

		try {
			TapElement(_cat);
			logger.info("Tap on Cat");
		} catch (Exception e) {
			logger.info("Failed to tap on Cat");
		}
	}
}


