package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TellusaboutyourpetPage extends Utilities {
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	SoftAssert softassert = new SoftAssert();

	public TellusaboutyourpetPage(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Tell_us_about_your_pet
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/petname")
	@FindBy(id = "schedule/addpet/moreabout/petname")
	public MobileElement _petName;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/gender/0")
	@FindBy(id = "schedule/addpet/moreabout/gender/0")
	public MobileElement _male;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/gender/1")
	@FindBy(id =  "schedule/addpet/moreabout/gender/1")
	public MobileElement _female;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/gender/2")
	@FindBy(id =  "schedule/addpet/moreabout/gender/2")
	public MobileElement _unsureGender;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/spayed/0")
	@FindBy(id = "schedule/addpet/moreabout/spayed/0")
	public MobileElement _no;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/spayed/1")
	@FindBy(id = "schedule/addpet/moreabout/spayed/1")
	public MobileElement _yes;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/spayed/2")
	@FindBy(id = "schedule/addpet/moreabout/spayed/2")
	public MobileElement _unsuresprayed;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gender']")
	@FindBy(id = "schedule/addpet/moreabout/genderlabel")
	public MobileElement _genderLabel;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _tellusaboutyourpetTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Spayed (S) or neutered (N)']")
	@FindBy(id = "schedule/addpet/moreabout/spayedlabel")
	public MobileElement _spayedNeuteredLabel;

	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/header/left")
	@FindBy(id = "schedule/addpet/moreabout/header/left")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/loggedinuser/tellusabout/header/left-btn")
	@FindBy(id = "schedule/loggedinuser/tellusabout/header/left-btn")
	public MobileElement _backCTA2;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/header/right")
	@FindBy(id = "schedule/addpet/moreabout/header/right")
	public MobileElement _cancelCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/addpet/moreabout/screen/next")
	@FindBy(id = "schedule/addpet/moreabout/screen/next")
	public MobileElement _nextCTA;
	
	/*
	 * Home >> Tell us about your pet
	 */
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/header/right")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/header/right")
	public MobileElement _CloseTellUsAboutYourPetCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/header/left")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/header/left")
	public MobileElement _BackCTATellUsAboutYourPetCTA;//..
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/breedName-txt")
	public MobileElement _nameText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/age-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/age-txt")
	public MobileElement _ageText; 

	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/gender-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/gender-txt")
	public MobileElement _genderText;
	                          
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/breed-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/breed-txt")
	public MobileElement _breedText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petName")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petName")
	public MobileElement _enterYourPetsName;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petName/error")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petName/error")
	public MobileElement _enterYourPetsNameErrorMsg;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Calendar/TextInput/DobInput/error")
	@iOSXCUITFindBy(accessibility = "Enter pet birthdate Please enter date of birth")
	public MobileElement _enterPetBirthdayError;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/calendar-input']")
	@FindBy(xpath = "//XCUIElementTypeOther[@name='AddPet/Steps/TellUsAboutYourPet/PetDetails/petbirthday']")
	public MobileElement _calendericon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select date']")
	@FindBy(id = "alertTitle")
	public MobileElement _calenderText;
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.banfield.react.bpht:id/calendar-cancel-btn']")
	@FindBy(id = "Cancel")
	public MobileElement _CancelCTA;
	
//	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='android:id/button1'])[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	@FindBy(xpath = "//XCUIElementTypeButton[@name='calendar-confirm-btn']")
	public MobileElement _ConfirmCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Calendar/TextInput/DobInput")
	@FindBy(id = "Calendar/TextInput/DobInput")
	public MobileElement _EnteredDate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petWeight")
//	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petWeight")
	@FindBy(xpath = "//XCUIElementTypeTextField[@name='AddPet/Steps/TellUsAboutYourPet/PetDetails/petWeight']")
	public MobileElement _petWeight;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petWeight/error")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petWeight/error")
	public MobileElement _petWeightError;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor")
	//@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor")
	@FindBy(xpath = "//XCUIElementTypeTextField[@name='AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor']")
	public MobileElement _petColor;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor/error")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor/error")
	public MobileElement _petColorerror;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All fields are mandatory*']")
	@FindBy(id = "All fields are mandatory*")
	//@FindBy(xpath = "//XCUIElementTypeOther[@name='All fields are mandatory*']")
	public MobileElement _allmandatoryfields;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetDetails/nextbtn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/nextbtn")
	public MobileElement _NextCTATellUsAboutYourPet;//d
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/breedName-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/breedName-txt")
	public MobileElement _name;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/age-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/age-txt")
	public MobileElement _age;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All fields are mandatory*']")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetDetails/petColor")
	public MobileElement _gender;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/breed-txt")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/breed-txt")
	public MobileElement _breed;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gender']")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/gender-txt")
	public MobileElement _Gender;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Spayed (S) or Neutered (N)']")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-txt")
	public MobileElement _SpayedorNeutered;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/0")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/0")
	public MobileElement _maleGender;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/1")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/1")
	public MobileElement _femaleGender; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/2")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/gender-btn/2")
	public MobileElement _unsureGen;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/0")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/0")
	public MobileElement _yesGender;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/1")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/1")
	public MobileElement _NoGender; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/2")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/spayed-btn/2")
	public MobileElement _unsureSpayed;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/header/left-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/header/left-btn")
	public MobileElement _backCTAStep3; 
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/header/right-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/header/right-btn")
	public MobileElement _closeCTAStep3;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/AddPet/Steps/TellUsAboutYourPet/PetGender/screen/next-btn")
	@FindBy(id = "AddPet/Steps/TellUsAboutYourPet/PetGender/screen/next-btn")
	public MobileElement _nextCTAStep3;
	
	/*
	 * Verify Tell us about your pet Step 2
	 */
	public void verifyPetText() throws Throwable {
		Thread.sleep(4000);
		softassert.assertTrue(_nameText.isDisplayed());
		softassert.assertTrue(_ageText.isDisplayed());
		softassert.assertTrue(_genderText.isDisplayed());
		softassert.assertTrue(_breedText.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify Tell us about your pet Step 3
	 */
	public void verifyPetdetails() {
		softassert.assertTrue(_name.isDisplayed());
		softassert.assertTrue(_age.isDisplayed());
		softassert.assertTrue(_breed.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Gender,Spayed or Neutered Step 3
	 */
	public void verifyform() {
		softassert.assertTrue(_maleGender.isDisplayed());
		softassert.assertTrue(_femaleGender.isDisplayed());
		softassert.assertTrue(_unsureGen.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Spayed or Neutered option Yes,No,Unsure Step 3
	 */
	public void verifySpayedorNeutered() {
		softassert.assertTrue(_yesGender.isDisplayed());
		softassert.assertTrue(_NoGender.isDisplayed());
		softassert.assertTrue(_unsureSpayed.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Gender & Spayed or Neutered option is not selected default Step 3
	 */
	public void GenderSpayedorNeuteredoption(){
		softassert.assertTrue(_maleGender.isEnabled());
		softassert.assertTrue(_femaleGender.isEnabled());
		softassert.assertTrue(_unsureGen.isEnabled());
		softassert.assertTrue(_yesGender.isEnabled());
		softassert.assertTrue(_NoGender.isEnabled());
		softassert.assertTrue(_unsureSpayed.isEnabled());
		softassert.assertAll();
	}
	
	public void Gendermultiselect(){
		TapElement(_maleGender);
		softassert.assertTrue(_maleGender.isEnabled());
		TapElement(_femaleGender);
		softassert.assertTrue(_femaleGender.isEnabled());
		TapElement(_unsureGen);
		softassert.assertTrue(_unsureGen.isEnabled());
		softassert.assertAll();
	}
	
	public void SpayedorNeuteredmultiselect(){
		TapElement(_yesGender);
		softassert.assertTrue(_yesGender.isEnabled());
		TapElement(_NoGender);
		softassert.assertTrue(_NoGender.isEnabled());
		TapElement(_unsureSpayed);
		softassert.assertTrue(_unsureSpayed.isEnabled());
		softassert.assertAll();
	}

	

	/*
	 * Verify Tell Us About Your Pet UI
	 */
	public void verifyTellusaboutYourPet() throws Throwable {
		Thread.sleep(2000);
		softassert.assertTrue(_tellusaboutyourpetTitle.isDisplayed());
		softassert.assertTrue(_petName.isDisplayed());
		softassert.assertTrue(_genderLabel.isDisplayed());
		softassert.assertTrue(_male.isDisplayed());
		softassert.assertTrue(_female.isDisplayed());
		softassert.assertTrue(_unsureGender.isDisplayed());
	//	ScrolltoElement("Yes");
		swipeDown();
		softassert.assertTrue(_spayedNeuteredLabel.isDisplayed());
		softassert.assertTrue(_no.isDisplayed());
		softassert.assertTrue(_yes.isDisplayed());
		softassert.assertTrue(_unsuresprayed.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Tapping on Yes CTA
	 */
	public void tapOnYesCTA() {
		try {
		//	ScrolltoElement("Yes");
			swipeDown();
			TapElement(_yes);
			logger.info("User Tapped on YES CTA");
		} catch (Exception e) {
			logger.info("User Failed to Tap on YES CTA");
		}
	}

	/*
	 * Enter Pet Name
	 */
	public void petName(String PetName) {
		try {
			TapElement(_petName);
			EnterInput(_petName, PetName);
			logger.info("User updated Pet Name successfully");
		} catch (Exception ex) {
			logger.info("User updation on Pet Name gets failed");
		}
	}
	
	/*
	 * Verify Option is not Selected
	 */
	public void verifyOptionisNotSelected() {
		softassert.assertTrue(_male.isDisplayed());
		softassert.assertTrue(_female.isDisplayed());
		softassert.assertTrue(_unsureGender.isDisplayed());
		Scroll("Yes");
		softassert.assertTrue(_no.isDisplayed());
		softassert.assertTrue(_yes.isDisplayed());
		softassert.assertTrue(_unsuresprayed.isDisplayed());
		softassert.assertAll();
	}
	
	/*
	 * Verify Gender Option is not Selected
	 */
	public void verifyGenderisNotSelected() throws Throwable {
		TapElement(_male);
		Thread.sleep(3000);
		softassert.assertTrue(_female.isEnabled());
		softassert.assertTrue(_unsureGender.isEnabled());
		softassert.assertAll();
	}
	
	/*
	 * Verify Spayed or Neutered Option is not Selected
	 */
	public void verifySpayedorNeuteredisNotSelected() {
		Scroll("Yes");
		TapElement(_yes);
		softassert.assertTrue(_no.isEnabled());
		softassert.assertAll();
	}

	/*
	 * Verify once tapping on Gender Options
	 */
	public void verifyGenderOptionisTapped() {
		TapElement(_female);
		softassert.assertTrue(_female.isEnabled());
		TapElement(_male);
		softassert.assertTrue(_male.isEnabled());
		TapElement(_unsureGender);
		softassert.assertTrue(_unsureGender.isEnabled());
		softassert.assertAll();
	}

	/*
	 * Verify once tapping on Spayed or Neutered Options
	 */
	public void verifySpayedorNeuteredOptionisTapped() {
		Scroll("Yes");
		TapElement(_yes);
		softassert.assertTrue(_yes.isEnabled());
		TapElement(_no);
		softassert.assertTrue(_no.isEnabled());
		TapElement(_unsuresprayed);
		softassert.assertTrue(_unsuresprayed.isEnabled());
		softassert.assertAll();
	}
}
