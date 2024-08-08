package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CovidResourcesSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(CovidResourcesSteps.class);

	@And("^they are displayed with the Covid resources CTA$")
	public void they_are_displayed_with_the_Covid_resources_CTA() throws Throwable {
		Assert.assertTrue(LegalStuffSteps._covidResources.isDisplayed());
		logger.info("they are displayed with the Covid resources CTA");
	}

	@When("^they tap on the Covid resources CTA from the list$")
	public void they_tap_on_the_Covid_resources_CTA_from_the_list() throws Throwable {
		verifytest(LegalStuffSteps._covidResources);
		TapElement(LegalStuffSteps._covidResources);
		logger.info("User tapped on the Covid resources CTA from the list");
	}
	
	@Then("^they are redirected to the device default browser for COVID-19$")
	public void they_are_redirected_to_the_device_default_browser_for_Covid() throws Throwable{
		Thread.sleep(6000);
		softassert.assertTrue(LegalStuffSteps._covid19Text.isDisplayed());
		softassert.assertAll();
		logger.info("User redirected to the device default browser for Covid");
	}
	
	@And("^the browser loads the Covid resources page with the following URL \"https://www.banfield.com/General/Covid-resource-center\"$")
	public void the_browser_loads_the_Covid_resources_page_with_the_following_URL() throws Throwable {
		String url ="https://www.banfield.com/General/Covid-resource-center";
		Thread.sleep(9000);
		TapElement(LegalStuffSteps._defaultbrowser); 
		TapElement(LegalStuffSteps._UrlEdit);
		TapElement(LegalStuffSteps._UrlField);
		Assert.assertEquals(url,LegalStuffSteps._UrlField.getText());
		logger.info("Browser loads the Covid resources page with the following URL");
	}
	
	
}
