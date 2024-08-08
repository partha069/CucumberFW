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


public class AccessibilitySteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(AccessibilitySteps.class);


	@And("^they are displayed with the Accessibility CTA$")
	public void they_are_displayed_with_the_Accessibility_CTA() throws Throwable {
		Assert.assertTrue(LegalStuffSteps._assessibility.isDisplayed());
		logger.info("they are displayed with the Accessibility CTA");
	}
	
	@When("^they tap on the Accessibility CTA from the list$")
	public void they_tap_on_the_Accessibility_CTA_from_the_list() throws Throwable {
		verifytest(LegalStuffSteps._assessibility);
		TapElement(LegalStuffSteps._assessibility);
		logger.info("they tap on the Accessibility CTA from the list");
	}
	
	@Then("^they are redirected to the device default browser for Accessibility$")
	public void they_are_redirected_to_the_device_default_browser_for_Accessibility() throws Throwable{
		Thread.sleep(6000);
		softassert.assertTrue(LegalStuffSteps._MarsText.isDisplayed());
		softassert.assertAll();
		logger.info("User redirected to the device default browser for Accessibility");
	}
	
	@And("^the browser loads the Accessibility page with the following URL \"https://www.mars.com/accessibility\"$")
	public void the_browser_loads_the_Accessibility_page_with_URL_accessibility() throws Throwable {
		String url ="https://www.mars.com/accessibility";
		Thread.sleep(6000);
		TapElement(LegalStuffSteps._defaultbrowser); 
		TapElement(LegalStuffSteps._UrlEdit);
		TapElement(LegalStuffSteps._UrlField);
		Assert.assertEquals(url,LegalStuffSteps._UrlField.getText());
		logger.info("they are displayed with the Accessibility CTA");
	}
	
}
