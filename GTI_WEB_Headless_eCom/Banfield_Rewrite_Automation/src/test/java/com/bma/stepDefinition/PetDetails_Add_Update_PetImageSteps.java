package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LetsAddTheirPhotoScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.Pet_ChangeProfileScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PetDetails_Add_Update_PetImageSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);
	public Pet_ChangeProfileScreen petChangeProfile = new Pet_ChangeProfileScreen(driver);
	public LetsAddTheirPhotoScreen LetsAddTheirPhoto = new LetsAddTheirPhotoScreen(driver);


	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(PetDetails_Add_Update_PetImageSteps.class);

	@When("^the user taps on the camera icon$")
	public void user_taps_on_the_camera_icon() throws Throwable {
		TapElement(PetCard._CameraIconHighlights);
		logger.info("the user taps on the camera icon");
	}
	
	@Then("^the user should be redirected to the Pet name screen to change the photo$")
	public void redirected_to_the_Pet_name_screen_to_change_the_photo() throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(petChangeProfile._petNameTitle.isDisplayed());
		logger.info("the user should be redirected to the Pet name screen to change the photo");
	}
	
	@And("^the screen should display the following$")
	public void screen_should_display_the_following() throws Throwable {
		Assert.assertTrue(petChangeProfile._changePhotoCTA.isDisplayed());
		Assert.assertTrue(petChangeProfile._doneCTA.isDisplayed());
		logger.info("the screen should display the following");
	}
	
	@And("^the Done CTA should be enabled by default$")
	public void Done_CTA_should_be_enabled_by_default() throws Throwable {
		Assert.assertTrue(petChangeProfile._doneCTA.isEnabled());
		logger.info("the Done CTA should be enabled by default");
	}
	
	@And("^the user should tap on Change photo CTA to add or update Image$")
	public void user_should_tap_on_Change_photo_CTA_to_add_or_update_Image() throws Throwable {
		TapElement(petChangeProfile._changePhotoCTA);
		logger.info("the user should tap on Change photo CTA to add or update Image");
	}
	
	@And("^the user is displayed with the a custom pop-up on denying the access$")
	public void user_is_displayed_with_the_a_custom_popup_on_denying_the_access() throws Throwable {
		TapElement(petChangeProfile._denyPopups);
		TapElement(petChangeProfile._DontAllowPopups);
		LetsAddTheirPhoto.verifyCustomPopup();
		logger.info("the user is displayed with the a custom pop-up on denying the access");
	}
	
	@And("^the user if tap on Change photo CTA again after denying the access$")
	public void tap_on_Change_photo_CTA_again_after_denying_the_access() throws Throwable {
		TapElement(petChangeProfile._changePhotoCTA); //LetsAddTheirPhoto._addPhotoCTA
		TapElement(LetsAddTheirPhoto._denyPopupspermission);
		TapElement(LetsAddTheirPhoto._denyPopupspermission);
		Thread.sleep(3000);
		LetsAddTheirPhoto.verifyCustomPopup();
		logger.info("the user if tap on Change photo CTA again after denying the access");
	}
	
	@Then("^the user is displayed with the a custom pop-up on providing access$")
	public void user_is_displayed_with_the_a_custom_popup_on_providing_access() {
		LetsAddTheirPhoto.verifyCustomPopupsforSetPhoto();
		logger.info("the user is displayed with the a custom pop-up on providing access");
	}
	
	@And("^the user can tap on the < button to go back to the Pet Details screen$")
	public void user_can_tap_on_the_Back_button_to_go_back_to_the_Pet_Details_screen() {
		TapElement(petChangeProfile._backCTA);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the user can tap on the < button to go back to the previous screen");
	}
	
	@And("^the user tap on Done CTA to get redirected to the pet info screen$")
	public void tap_on_Done_CTA_to_get_redirected_to_the_pet_info_screen() {
		TapElement(PetCard._CameraIconHighlights);
		TapElement(petChangeProfile._doneCTA);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the user tap on Done CTA to get redirected to the pet info screen");
	}
}
