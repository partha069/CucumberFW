package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.Pet_ChangeProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewPetDetailsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public Pet_ChangeProfileScreen Pet_ChangeProfile = new Pet_ChangeProfileScreen(driver);
	public String path = "./src/test/resources/TestData/Sprint3/Login_using_credentials.csv";

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewPetDetailsSteps.class);
	
	@When("^user is on Home screen$")
	public void user_is_on_Home_screen() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("user is on the Home screen");
	}

	@When("^the user tap on any pet card from the available list of pets$")
	public void the_user_tap_on_any_pet_card_from_the_available_list_of_pets() throws Throwable {
	    Thread.sleep(9000);
		try {
			TapElement(Home._pet0);
		} catch (Exception e) {
			TapElement(Home._pet01);
		}
		logger.info("the user tap on any pet card from the available list of pets");
	}
	
	@Then("^the user should be redirected to the pet details screen$")
	public void the_user_should_be_redirected_to_the_pet_details_screen() {
		Assert.assertTrue(PetCard._Age.isDisplayed());
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the user should be redirected to the pet details screen");
	}
	
	@Then("^user wants to change photo$")
	public void user_wants_to_chnage_photo() throws Throwable {
		TapElement(PetCard._CameraIconHighlights);
		Thread.sleep(3000);
		verifytest(Pet_ChangeProfile._changePhotoCTA);
		TapElement(Pet_ChangeProfile._changePhotoCTA);
		TapElement(Pet_ChangeProfile._onlyThisTimePopups);
		if (getUserDeviceInput.contains("IOS")) {
			}else {
			Thread.sleep(850);
			TapElement(Pet_ChangeProfile._AllowPopups);
			TapElement(Pet_ChangeProfile._choosePhotoCTA);
			}
		logger.info("user wants to chnage photo");
	}
	
	@And("^the pet details screen should display with the Pet image/avatar based on "
			+ "pet selected Pet name,Pet age years old, Highlights Tab,Timeline Tab$")
	public void the_pet_details_screen_should_display_the_info() {
		Assert.assertTrue(PetCard._Age.isDisplayed());
		Assert.assertTrue(PetCard._Name.isDisplayed());
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		Assert.assertTrue(PetCard._timeline.isDisplayed());
		logger.info("the pet details screen should display the following info:Pet "
				+ "image/avatar (based on pet selected) Pet name,Pet age years old, Highlights Tab,Timeline Tab");
	}
	
	@And("^the Highlights Tab should be selected by default$")
	public void the_Highlights_Tab_should_be_selected_by_default() {
		Assert.assertTrue(PetCard._highlights.isEnabled());
		logger.info("the Highlights Tab should be selected by default");
	}
	
	@And("^the image section should display a camera icon to add/update image on Highlights and Timeline tab$")
	public void the_image_section_should_display_a_camera_icon_to_addupdate_image_on_Highlights_and_Timeline_tab() throws Throwable {
		Thread.sleep(500);
		Assert.assertTrue(PetCard._CameraIconHighlights.isDisplayed());
		logger.info("the image section should display a camera icon to add/update image on Highlights and Timeline tab");
	}
	
	@And("^the user should tap on back to get redirected to the previous screen Home$")
	public void the_user_should_tap_on_back_to_get_redirected_to_the_previous_screen_Home() throws Throwable {
		Thread.sleep(500);
		TapElement(PetCard._backCTAHighlights);
		Assert.assertTrue(Home._headerText.isDisplayed());
		logger.info("the user should tap on back to get redirected to the previous screen Home");
	}
}
