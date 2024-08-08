package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.DisplaySplashScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewYourPetsSteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	
	public String path2 = "./src/test/resources/TestData/Sprint3/Login_using_credentials5.csv";

	private static Logger logger = LogManager.getLogger(ViewYourPetsSteps.class);
	
	@When("^user tapped on the Login CTA from the login page and user credentials are valid$")
	public void user_tapped_on_the_Login_CTA_from_the_login_page() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2, 2, "Email", "Email", "password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2, 2, "password", "Email", "password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("user tapped on the Login CTA from the login page and user credentials are valid");
	}
	
	@Then("^the user is displayed with their pets under Your pets section$")
	public void the_user_is_displayed_with_their_pets_under_Your_pets_section() throws Throwable{
		Thread.sleep(8000);
	//	ScrolltoElement("Make an appointment >");
	//	ScrolltoElement("Piety");
		softassert.assertTrue(Home._pet1.isDisplayed()); 
		softassert.assertTrue(Home._lastSeenAndDate2.isDisplayed()); 
		softassert.assertTrue(Home._clockIconEnable.isDisplayed());
		softassert.assertAll();
		verifytest(Home._pet1);
		logger.info("the user is displayed with their pets under Your pets section");
	}
	
	@And("^longer pet names should be displayed with ellipses$")
	public void longer_pet_names_should_be_displayed_with_ellipses() throws Throwable{
		String name = "abcdefghijklmno";
		Thread.sleep(8000);
	//  Scroll("Your pets");
	    Thread.sleep(600);
	    verifytest(Home._petNameellipses);
	    WaitVisibilityOfElement(Home._petNameellipses);
	    Assert.assertNotSame(name, Home._petNameellipses.getText().contains("..."));
		logger.info("longer pet names should be displayed with ellipses");
	}
	
	@And("^the user will not be displayed with deceased pets$")
	public void the_user_will_not_be_displayed_with_deceased_pets(){
		Assert.assertTrue(Home._addPettoYourDashboardText.isDisplayed());
		verifytest(Home._addPettoYourDashboardText);
		logger.info("the user will not be displayed with deceased pets");
	}
	
	@And("^the screen will display with the text: Please add a pet to your dashboard.$")
	public void the_screen_will_display_with_the_text_Please_add_a_pet_to_your_dashboard(){
		Assert.assertTrue(Home._addPettoYourDashboardText.isDisplayed());
		verifytest(Home._addPettoYourDashboardText);
		logger.info("the screen will display with the text: Please add a pet to your dashboard.");
	}
	
	@And("^each pet card should have the following Pet name,Photo/Icon,Last Visit,Visit Details CTA Clock icon$")
	public void each_pet_card_should_have_the_following_Pet_name_PhotoIcon_LastVisit_Visit_Details_CTA_Clockicon() throws Throwable{
		Thread.sleep(4000);
		ScrolltoElement("Want to help?");
		ScrolltoElement("Mickie"); 
		Home.verifyPetCard();
		logger.info("each pet card should have the following Pet name,Photo/Icon,Last Visit,Visit Details CTA (Clock icon)");
	}
	
	@And("^the Visit detail should display the last visited date$")
	public void the_Visit_detail_should_display_the_last_visited_date(){
		Assert.assertTrue(Home._lastSeenAndDate1.isDisplayed());
		logger.info("the Visit detail  should display the last visited date");
	}
	
	@And("^the visit detail icon Clock icon will be disabled if there are no visit history for the pet$")
	public void the_visit_detail_icon_Clock_icon_will_be_disabled_if_there_are_no_visit_history_for_the_pet(){
		ScrolltoElement("Scooby");
		Assert.assertTrue(Home._clockIconDisable.isEnabled());
		logger.info("the visit detail icon (Clock icon) will be disabled if there are no visit history for the pet");
	}
}
