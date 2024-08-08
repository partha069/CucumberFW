package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AboutMarsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AboutMarsSteps.class);

	@And("^they are displayed with the About Mars CTA$")
	public void they_are_displayed_with_the_About_Mars_CTA() {
		Assert.assertTrue(LegalStuffSteps._aboutMars.isDisplayed());
		logger.info("they are displayed with the About Mars CTA");
	}

	@And("^they tap on the About Mars CTA from the list$")
	public void they_tap_on_the_About_Mars_CTA_from_the_list() {
		Assert.assertTrue(LegalStuffSteps._aboutMars.isEnabled());
		verifytest(LegalStuffSteps._aboutMars);
		TapElement(LegalStuffSteps._aboutMars);
		logger.info("they tap on the About Mars CTA from the list");
	}
	
	@Then("^they redirected to the device default browser for About Mars$")
	public void they_redirected_to_the_device_default_browser_for_About_Mars() throws Throwable {
		Thread.sleep(6000);
		softassert.assertTrue(LegalStuffSteps._MarsText.isDisplayed());
		softassert.assertAll();
		logger.info("Device default browser should be opened for About Mars");
	}

	@And("^the browser loads Mars website with the following URL \"https://www.mars.com/\"$")
	public void the_browser_loads_the_Mars_website_with_the_following_URL() throws Throwable {	
		String url ="https://www.mars.com/";
		Thread.sleep(6000);
		TapElement(LegalStuffSteps._defaultbrowser); 
		TapElement(LegalStuffSteps._UrlEdit);
		TapElement(LegalStuffSteps._UrlField);
		Assert.assertEquals(url,LegalStuffSteps._UrlField.getText());
		logger.info("the browser loads the Mars website with the following URL Mars");
	}
}
