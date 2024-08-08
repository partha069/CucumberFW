package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Highlights_DoNotGiveTreatmentforVaccinationsAndParasiteControlSteps extends Utilities {

	public PetCardScreen PetCard = new PetCardScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_DoNotGiveTreatmentforVaccinationsAndParasiteControlSteps.class);

	@And("^the user is on Pet Highlights screen$")
	public void the_user_is_on_Pet_Highlights_screen() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScrolltoElement("Heriberto");
		TapElement(Home._pet11);
		Assert.assertTrue(PetCard._highlights.isDisplayed());
		logger.info("the user is on Pet Highlights screen");
	}
	
	@When("^the user taps to expand the Vaccinations accordion$")
	public void the_user_taps_to_expand_the_Vaccinations_accordion() {
		ScrolltoElement("Vaccinations");
		TapElement(PetCard._vaccinationAccordions);
		ScrolltoElement("Rabies");
		Assert.assertTrue(PetCard._VaccineName.isDisplayed());
		logger.info("the user taps to expand the Vaccinations accordion");
	}
	
    @Then("^the user will be displayed with following information Vaccine name$")
	public void the_user_will_be_displayed_with_following_information_Vaccine_name() {
    	Assert.assertTrue(PetCard._VaccineName.isDisplayed());
    	Assert.assertTrue(PetCard._Donotgive_dateText.isDisplayed());
    	Assert.assertTrue(PetCard._Bordetella_VaccineNAText.isDisplayed());
		logger.info("the user will be displayed with following information Vaccine name");
	}
    
	@And("^if the all the vaccines are Do not give the status accordion will be current as green$")
	public void the_vaccines_are_Do_not_give_the_status_accordion_will_be_current_as_green() {
		Assert.assertTrue(PetCard._vaccinationIndicatorImage.isDisplayed());
		logger.info("if the all the vaccines are Do not give the status accordion will be current as green");
	}
	
	@And("^if we have a vaccine with overdue as red then the status of the vaccine accordion will be overdue$")
	public void vaccine_with_overdue_as_red_then_the_status_of_the_vaccine_accordion_will_be_overdue() {
		TapElement(PetCard._backCTAHighlights);
		ScrolltoElement("Gina");
		TapElement(Home._pet20);
		ScrolltoElement("Vaccinations");
		Assert.assertTrue(PetCard._vaccinationIndicatorImage.isDisplayed());
		logger.info("if we have a vaccine with overdue as red then the status of the vaccine accordion will be overdue");
	}
	
	@When("^the user taps to expand the Parasite control accordion$")
	public void user_taps_to_expand_the_Parasite_control_accordion() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		ScrolltoElement("Heriberto");
		TapElement(Home._pet11);
		ScrolltoElement("Parasite control");
		TapElement(PetCard._parasiteaccordian);
		Assert.assertTrue(PetCard._parasiteDontGiveName.isDisplayed());
		logger.info("the user taps to expand the Parasite control accordion");
	}
	
	@Then("^the user will be displayed with following information Medication name$")
	public void the_user_will_be_displayed_Medication_name_Do_not_give() {
		Assert.assertTrue(PetCard._parasiteVaccinationName.isDisplayed());
    	Assert.assertTrue(PetCard._parasiteDontGiveName.isDisplayed());
    	Assert.assertTrue(PetCard._parasiteDontGiveNA.isDisplayed());
		logger.info("the user will be displayed with Medication name - Do not give - NA");
	}
	
	@And("^if the all the medications are Do not give the status accordion will be current as green$")
	public void medications_are_Do_not_give_the_status_accordion_will_be_current_as_green() throws Throwable {
		TapElement(PetCard._backCTAHighlights);
		ScrolltoElement("Gina");
		TapElement(Home._pet20);
		Thread.sleep(4000);
		ScrolltoElement("Parasite control");
		TapElement(PetCard._parasiteaccordian);
		ScrolltoElement("Flea prevention");
		WaitVisibilityOfElement(PetCard._parasiteIndicatorText);
		Assert.assertTrue(PetCard._parasiteIndicatorText.isDisplayed());
		logger.info("if the all the medications are Do not give the status accordion will be current as green");
	}
}
