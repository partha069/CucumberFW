package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.BottomNavigationScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps extends Utilities {

	
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public ProfileScreen profile = new ProfileScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	private static Logger logger = LogManager.getLogger(ContactUsSteps.class);

	@When("^the user is on the My Profile Tab from the bottom Navigation$")
	public void the_user_is_on_the_My_Profile_Tab_from_the_bottom_Navigation() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		LoginUser.logintoApp();
		TapElement(BottomNavigation._profileCTA);
		logger.info("the user is on the My Profile Tab from the bottom Navigation");
	}

	@When("^they are displayed with the Contact Us CTA$")
	public void they_are_displayed_with_the_Contact_Us_CTA() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(profile._ContactUsCTA.isDisplayed());
		logger.info("User should be displayed Contact Us CTA");
	}

	@And("^they tap on the contact us CTA from the list$")
	public void they_tap_on_the_contact_us_CTA_from_the_list() throws Throwable {
		verifytest(profile._ContactUsCTA);
		TapElement(profile._ContactUsCTA);
		logger.info("User should be displayed Contact Us CTA");
	}

	@Then("^they redirected to the device default browser for Contact Us$")
	public void they_redirected_to_the_device_default_browser_for_Contact_Us() throws Throwable {
		Thread.sleep(8000);
		softassert.assertTrue(profile._contactUsText.isDisplayed());
		softassert.assertAll();
		logger.info("Device default browser should be opened for Contact Us");
	}

	@And("^the browser loads Banfield's Contact us page with the following URL \"https://www.banfield.com/about-banfield/Contact-us\"$")
	public void the_browser_loads_Banfields_Contact_us_page_with_the_following_URL() throws Throwable {
		String url ="https://www.banfield.com/about-banfield/Contact-us";
		Thread.sleep(8000);
		TapElement(LegalStuffSteps._defaultbrowser); 
		TapElement(LegalStuffSteps._UrlEdit);
		TapElement(LegalStuffSteps._UrlField);
		Assert.assertEquals(url,LegalStuffSteps._UrlField.getText());
		logger.info("Browser loads Banfield's Contact us page with the following URL");
	}

}
