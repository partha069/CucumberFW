package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Make_Appointment_As_Guest extends Utilities{

	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public LetsgetstartedSteps letsgetstarted =  new LetsgetstartedSteps(driver);
	public WhatSpeciesIsYourPetScreen whatspeciesisyourpet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage TellusaboutyourpetPage = new TellusaboutyourpetPage(driver); 
	public ReasonforvisitScreen ReasonforvisitPage = new ReasonforvisitScreen(driver);
	public String path="./src/test/resources/TestData/Sprint1/makeappointmentasguest.csv";
	public ViewWelcomeScreen welcome=new ViewWelcomeScreen(driver);
	
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);
	SoftAssert softassert = new SoftAssert();
	
	@When("^User Click on Make Appointment AS Guest button$")
	public void user_Click_on_Make_Appointment_AS_Guest_button() throws Throwable {	
		welcome.verifyWelcomeScreenUIElement();
		TapElement(welcome._makeAppointmentAsGuestbutton);
		logger.info("User tapped on the Make Appointment AS Guest button"); 
	}

	@Then("^the user should be displayed with the Have we met page$")
	public void the_user_should_be_displayed_with_the_Have_we_met_page() throws Throwable {
		softassert.assertTrue(havewemet._yesIHaveButton.isDisplayed());
		softassert.assertTrue(havewemet._noIHaveButton.isDisplayed());
		softassert.assertAll();
		logger.info("User is on Have We Met? Page");
	}
	
	@Then("^the user click on No i am new button$")
	public void the_user_click_on_No_i_am_new_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TapElement(havewemet._noIHaveButton);
		logger.info("User clicked on I'm new button");
	}
	@Then("^User should be Navigated to with Lets get started Page$")
	public void user_should_be_Navigated_to_with_Lets_get_started_Page() throws Throwable {
		softassert.assertTrue(letsgetstarted._firstName.isDisplayed());
		softassert.assertTrue(letsgetstarted._lastName.isDisplayed());
		softassert.assertTrue(letsgetstarted._phone.isDisplayed());
		softassert.assertTrue(letsgetstarted._email.isDisplayed());
		softassert.assertTrue(letsgetstarted._nextButton.isDisplayed());
		logger.info("User got navigated Lets get started Page");
	}

	@When("^User provide all the valid details, next button should be clickable$")
	public void user_provide_all_the_valid_details_next_button_should_be_clickable() throws Throwable {
        EnterInput(letsgetstarted._firstName,getcsvdata(path,2, "firstname", "firstname", "lastname","phone","email"));
        EnterInput(letsgetstarted._lastName,getcsvdata(path,2, "lastname", "firstname", "lastname","phone","email"));
        EnterInput(letsgetstarted._phone,getcsvdata(path,2, "phone", "firstname", "lastname","phone","email"));
        EnterInput(letsgetstarted._email,getcsvdata(path,2, "email", "firstname", "lastname","phone","email"));
		TapElement(letsgetstarted._phone);
		TapElement(letsgetstarted._phoneheader);
		TapElement(letsgetstarted._nextButton);
		logger.info("User clicked on Next Button on Lets get started page");
	}
	
	@Then("^User should be navigated to What_species_is_your_pet Page$")
	public void user_should_be_navigated_to_What_species_is_your_pet_Page() throws Throwable {
		softassert.assertTrue(whatspeciesisyourpet._dog.isDisplayed());
		softassert.assertTrue(whatspeciesisyourpet._cat.isDisplayed());
		logger.info("User got navigated What_species_is_your_pet Page");
	}

	@When("^User select the species and Click on Next button$")
	public void user_select_the_species_and_Click_on_Next_button() throws Throwable {
		TapElement(whatspeciesisyourpet._dog);
		TapElement(whatspeciesisyourpet._nextbutton);
		logger.info("User clicked on Next Button on What_species_is_your_petPage");
	}
	@Then("^User should be navigated to Tell_us_about_your_pet Page$")
	public void user_should_be_navigated_to_Tell_us_about_your_pet_Page() throws Throwable {
		softassert.assertTrue(TellusaboutyourpetPage._petName.isDisplayed());
		softassert.assertTrue(TellusaboutyourpetPage._male.isDisplayed());
		logger.info("User got navigated Tell_us_about_your_pet Page");
	}

	@When("^User provide pet name and gender, next button should be clickable$")
	public void user_provide_pet_name_and_gender_next_button_should_be_clickable() throws Throwable {
		EnterInput(TellusaboutyourpetPage._petName, "Tommy");
		TapElement(TellusaboutyourpetPage._male);
		TellusaboutyourpetPage.tapOnYesCTA();
		TapElement(TellusaboutyourpetPage._nextCTA);
		logger.info("User clicked on Next Button on Tell_us_about_your_pet_Page");
		Thread.sleep(2000);
	}

	@Then("^User Should be navigated to VisitType Page$")
	public void user_Should_be_navigated_to_VisitType_Page() throws Throwable {
//		ReasonforvisitPage = new Reason_for_visitPage(driver);
//		softassert.assertTrue(ReasonforvisitPage.Reasonforvisitheader.isDisplayed());
//		logger.info("User got navigated VisitType Page");
	}

}
