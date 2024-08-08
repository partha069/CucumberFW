package com.bma.pageObject;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
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
import junit.framework.Assert;

public class SignUpForMyBanfieldScreenStep3 extends Utilities {

	private static Logger logger = LogManager.getLogger(SignUpForMyBanfieldScreenStep3.class);
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public SignUpForMyBanfieldScreenStep3(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _SignUpForMyBanfieldHeader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/phonenumber")
	@FindBy(id = "createaccount/verifyid/phonenumber")
	public MobileElement _PhoneTextField;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/zipcode")
	@FindBy(id = "createaccount/verifyid/zipcode")
	public MobileElement _ZipcodeTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/petname")
	@FindBy(id = "createaccount/verifyid/petname")
	public MobileElement _PetNameTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/next")
	@FindBy(id = "createaccount/verifyid/next")
	public MobileElement _NextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/phonenumber/error")
	@FindBy(id = "createaccount/verifyid/phonenumber/error")
	public MobileElement _phoneerror;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/zipcode/error")
	@FindBy(id = "createaccount/verifyid/zipcode/error")
	public MobileElement _ziperror;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/header/left")
	@FindBy(id = "createaccount/verifyid/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/header/right")
	@FindBy(id = "createaccount/verifyid/header/right")
	public MobileElement _cancelCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/title")
	@FindBy(id = "createaccount/verifyid/title")
	public MobileElement _WelcometoMyBanfieldText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/description")
	@FindBy(id = "createaccount/verifyid/title")
	public MobileElement _LetsMakeSureText;
	
//	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/verifyid/description")
	@iOSXCUITFindBy(accessibility = "Jarrod")
	public MobileElement _JarrodText;
	
	public void VerifyCreateAccountstep3UI() {
		try {
	softassert.assertTrue(_SignUpForMyBanfieldHeader.isDisplayed());
	softassert.assertTrue(_ZipcodeTextField.isDisplayed());
	softassert.assertTrue(_PhoneTextField.isDisplayed());
	softassert.assertTrue(_PetNameTextField.isDisplayed());
	softassert.assertAll();}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 3");	
		}
	}
	
	public void EnterCreate() throws Throwable {
	TapElement(_PetNameTextField);
	List<MobileElement> pets = getDriver().findElementsByXPath("//XCUIElementTypeOther[@class='_highlighter-box_86d92 _inspected-element-box_86d92']");
	for(int i=0 ; i<pets.size(); i++) {
	System.out.println(pets.get(i).getText());
	}
	}
	
	public void EnterCreateAccountstep3Validdetails() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			final String path = "./src/test/resources/TestData/Sprint2/CreateAccount_AcountInfo.csv"; //Jada,5578265709,60360
			String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
			String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
			String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
			Thread.sleep(3000);
			softassert.assertTrue(_PetNameTextField.isDisplayed());
			softassert.assertAll();
			TapElement(_PetNameTextField);
			getDriver().findElementByAccessibilityId(petname).click();
			Thread.sleep(3000);
			EnterInput(_PhoneTextField, phone);
			System.out.println(phone);
			HidingKeyboard();
			EnterInput(_ZipcodeTextField, zipcode);
			TapElement(_WelcometoMyBanfieldText);
			Thread.sleep(9000);
			logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}else {
	//	final String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep3.csv";
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccount_AcountInfo.csv";
		String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
		String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
		String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
		Thread.sleep(3000);
		TapElement(_PetNameTextField);
		Thread.sleep(3000);
		Scroll(petname);
	//	ScrolltoElement(petname);
	//	TapElement(Home._pet20);
		Thread.sleep(3000);
		EnterInput(_PhoneTextField, phone);
		System.out.println(phone);
		HidingKeyboard();
		Thread.sleep(3000);
		EnterInput(_ZipcodeTextField, zipcode);
	
		logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}
	}
	
	public void EnterCreateAccountstep3() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			final String path = "./src/test/resources/TestData/Sprint2/NewAndValidInformation.csv"; //GAF05CH - Specific to this story 26908)
			String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
			String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
			String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
			Thread.sleep(3000);
			TapElement(_PetNameTextField);
			getDriver().findElementByAccessibilityId(petname).click();
			Thread.sleep(3000);
			EnterInput(_PhoneTextField, phone);
			System.out.println(phone);
			HidingKeyboard();
			EnterInput(_ZipcodeTextField, zipcode);
			TapElement(_WelcometoMyBanfieldText);
			Thread.sleep(9000);
			logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}else {
		final String path = "./src/test/resources/TestData/Sprint2/NewAndValidInformation.csv";
		String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
		String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
		String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
		Thread.sleep(3000);
		TapElement(_PetNameTextField);
		Thread.sleep(3000);
		Scroll(petname);
		Thread.sleep(3000);
		EnterInput(_PhoneTextField, phone);
		System.out.println(phone);
		HidingKeyboard();
		Thread.sleep(3000);
		EnterInput(_ZipcodeTextField, zipcode);
	
		logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}
	}
	
	public void EnterWrongInformation() throws Throwable {
		if (getUserDeviceInput.contains("IOS")) {
			final String path = "./src/test/resources/TestData/Sprint8/CreateAccountStep3.csv"; 
			String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
			String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
			String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
			Thread.sleep(3000);
			TapElement(_PetNameTextField);
			getDriver().findElementByAccessibilityId(petname).click();
			Thread.sleep(3000);
			EnterInput(_PhoneTextField, phone);
			System.out.println(phone);
			HidingKeyboard();
			EnterInput(_ZipcodeTextField, zipcode);
			TapElement(_WelcometoMyBanfieldText);
			Thread.sleep(9000);
			logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}else {
		final String path = "./src/test/resources/TestData/Sprint8/CreateAccountStep3.csv";
		String petname= getcsvdata(path,2,"petname", "petname","phone","zipcode");
		String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
		String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
		Thread.sleep(3000);
		TapElement(_PetNameTextField);
		Thread.sleep(3000);
		Scroll(petname);
		Thread.sleep(3000);
		EnterInput(_PhoneTextField, phone);
		System.out.println(phone);
		HidingKeyboard();
		Thread.sleep(3000);
		EnterInput(_ZipcodeTextField, zipcode);
	
		logger.info("User Entered valid petname,petname nd zipcode Create Account Step 3");	
		}
	}
}
