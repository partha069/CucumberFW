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

public class AnotherAppointmentPopups extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(AnotherAppointmentPopups.class);

	public AnotherAppointmentPopups(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/title-txt")
	@FindBy(id = "myschedule/duplicateappointment/modal/title-txt")
	public MobileElement _staticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/cancelbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/cancelbtn")
	public MobileElement _editExistingAppointmentCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/myschedule/duplicateappointment/modal/makeadditionalbtn")
	@FindBy(id = "myschedule/duplicateappointment/modal/makeadditionalbtn")
	public MobileElement _makeAdditionalAppointmentCTA;

	public void verifyAnotherPopups() throws Throwable {
		Thread.sleep(600);
		softassert.assertTrue(_staticText.isDisplayed());
		softassert.assertTrue(_editExistingAppointmentCTA.isDisplayed());
		softassert.assertTrue(_makeAdditionalAppointmentCTA.isDisplayed());
		softassert.assertAll();
	}
	
*/
}
