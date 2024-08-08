package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TermsAndConditionsSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LegalStuffStepsScreen legal = new LegalStuffStepsScreen(driver);
	public ProfileScreen profile = new ProfileScreen(driver);
	private static Logger logger = LogManager.getLogger(TermsAndConditionsSteps.class);

	@Then("^they are displayed with the Terms and Conditions CTA$")
	public void they_are_displayed_with_the_Terms_and_Conditions_CTA() {
		legal.verifyLegalstuffCTA();
		verifytest(legal._Termsandcondition);
		logger.info("User displayed with the Privacy policy CTA");
	}

	@And("^they tap on the Terms and Conditions CTA from the list$")
	public void they_tap_on_the_Terms_and_Conditions_CTA_from_the_list() {
		TapElement(legal._Termsandcondition);
		logger.info("User Tap on Privacy policy CTA");
	}
	
	@And("^the browser loads the Terms and Conditions page with the URL \"https://www.banfield.com/General/Terms\"$")
	public void the_browser_loads_the_Terms_and_Conditions_page_with_the_URL() throws Throwable {
		String url ="https://www.banfield.com/General/Terms";
		Thread.sleep(8000);
		TapElement(legal._defaultbrowser); 
		TapElement(legal._UrlEdit);
		TapElement(legal._UrlField);
		Assert.assertEquals(url,legal._UrlField.getText());
		logger.info("Browser loads the Terms and Conditions page with the URL");
	}
	

}
