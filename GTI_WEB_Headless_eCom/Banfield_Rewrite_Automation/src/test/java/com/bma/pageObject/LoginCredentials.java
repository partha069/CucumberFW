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

public class LoginCredentials extends Utilities {

	private static Logger logger = LogManager.getLogger(LoginCredentials.class);
	public String path1 = "./src/test/resources/TestData/Sprint3/LoginCredentialsowpUser.csv";
	public String path2 = "./src/test/resources/TestData/Sprint5/Login_using_credentials22.csv"; //vcg6@sqa.com,Banfield123!
	public String path3 = "./src/test/resources/TestData/Sprint3/LoginCredentialsowpUser.csv";
	public String path4 = "./src/test/resources/TestData/Sprint12/logintoviewrecords.csv"; // obese@gmail.com,Banfield@123
	
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public LoginCredentials(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/email")
	@FindBy(id = "login/email")
	public MobileElement _EmailTextField;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/password")
	@FindBy(id = "login/password")
	public MobileElement _PasswordTextfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/button")
	@FindBy(id = "login/button")
	public MobileElement _LoginButton;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/login/cancel")
	@FindBy(id = "login/cancel")
	public MobileElement _cancelCTA;
	

	 public void logintoApp() throws Throwable { //Automation@int.com , Banfield!123
		 try {
		    EnterInput(_EmailTextField, getcsvdata(path3,2,"Email", "Email","password"));
			EnterInput(_PasswordTextfield, getcsvdata(path3,2,"password", "Email","password"));
			HidingKeyboardios();
			Thread.sleep(5000);
			TapElement(_LoginButton);
			logger.info("the user enters an Email ID and Password and Login To App");
			}
		 catch(Exception e) {
			 logger.info("the user failed to Login To App");
		 }
	 }
	 public void Login_to_OWP() throws Throwable { 
		    EnterInput(_EmailTextField, "Ginevra@Wilczak.com.in");
		    EnterInput(_PasswordTextfield, "Photon@123");
		    HidingKeyboardios();
			Thread.sleep(1000);
			TapElement(_LoginButton);
		 }
	
	 public void Login_to_addpet() throws Throwable { //vcg6@sqa.com,Banfield123!
	    EnterInput(_EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(_PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(5000);
		HidingKeyboardios();
		TapElement(_LoginButton);
	 }
	 
	 public void Login_to_view_records() throws Throwable { 
		    EnterInput(_EmailTextField, getcsvdata(path4,2,"Email", "Email","password"));
			EnterInput(_PasswordTextfield, getcsvdata(path4,2,"password", "Email","password"));
			Thread.sleep(5000);
			HidingKeyboardios();
			TapElement(_LoginButton);
		 }
	 
	//Working
	 public void Login_to_makeAppointment() throws Throwable {
	    EnterInput(_EmailTextField, "Vcg6@sqa.com");
	    EnterInput(_PasswordTextfield, "Banfield123!");
//	    EnterInput(_EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
//		EnterInput(_PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(1000);
		TapElement(_LoginButton);
	 }
	 
	 public void Login_NoLoc() throws Throwable {
		    EnterInput(_EmailTextField, "test936@gmail.com");
		    EnterInput(_PasswordTextfield, "Photon@123");
			Thread.sleep(1000);
			TapElement(_LoginButton);
		 }
	 
	 
}
