package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LetsAddTheirPhotoScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddaPet_Step5B_LetsAddTheirPhotoUpdatePhotoSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public LetsAddTheirPhotoScreen LetsAddTheirPhoto = new LetsAddTheirPhotoScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AddaPet_Step5B_LetsAddTheirPhotoUpdatePhotoSteps.class);
	
	@When("^the user taps on Change photo CTA$")
	public void the_user_taps_on_Change_photo_CTA() {
		TapElement(LetsAddTheirPhoto._addPhotoCTA);
		logger.info("the user taps on Change photo CTA");
	}
	
	@Then("^the user will be displayed with the custom pop-up with following options$")
	public void the_user_will_be_displayed_with_the_custom_popup_with_following_options() {
		try {
			TapElement(LetsAddTheirPhoto._onlyThisTimePopups); 
		} catch (Exception e) {
			System.out.println("Only This Time Popup Selected");
		}
		try {
			TapElement(LetsAddTheirPhoto._allowPopupsfordeviceaccess); 
			LetsAddTheirPhoto.verifyCustomPopupsforSetPhoto();
		} catch (Exception e) {
			System.out.println("Only This Time Popup Selected");
		}
		
		logger.info("the user will be displayed with the custom pop-up with following options");
	}
	
	@And("^the user will tap on Take photo CTA to open device Camera$")
	public void the_user_will_tap_on_Take_photo_CTA_to_open_device_Camera() {
		try {
			TapElement(LetsAddTheirPhoto._TakePhotoCTA);
		} catch (Exception e) {
		}
		logger.info("the user will tap on Take photo CTA to open device Camera");
	}
	
	@And("^the user will tap on Choose photo CTA to open device gallery$")
	public void the_user_will_tap_on_Choose_photo_CTA_to_open_device_gallery() {
		try {
			TapElement(LetsAddTheirPhoto._choosePhotoCTA);
		} catch (Exception e) {
		}
		
		logger.info("the user will tap on Choose photo CTA to open device gallery");
	}
	
	@And("^the user will tap on Cancel CTA to return to the same screen$")
	public void the_user_will_tap_on_Cancel_CTA_to_return_to_the_same_screen() {
		try {
			TapElement(LetsAddTheirPhoto._CancelCTACTA);
		} catch (Exception e) {
		}
		TapElement(LetsAddTheirPhoto._CancelCTACTA);
		logger.info("the user will tap on Cancel CTA to return to the same screen");
	}
}
