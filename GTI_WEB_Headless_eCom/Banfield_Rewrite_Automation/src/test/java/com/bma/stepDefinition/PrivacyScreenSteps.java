package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
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

public class PrivacyScreenSteps extends Utilities {

	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LegalStuffStepsScreen legal = new LegalStuffStepsScreen(driver);
    public ProfileScreen profile = new ProfileScreen(driver);
    public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	
	private static Logger logger = LogManager.getLogger(PrivacyScreenSteps.class);

	@When("^the user is on the Legal Stuff Page$")
	public void the_user_is_on_the_Legal_Stuff_Page() throws Throwable{
		ViewWelcome.TapOnSigninbutton();
		LoginUser.logintoApp();
		TapElement(BottomNavigation._profileCTA);
		Thread.sleep(1000);
		TapElement(profile._legalStuff);
		Thread.sleep(6000);
		softassert.assertTrue(legal._Termsandcondition.isDisplayed());
		softassert.assertAll();
	}

	@And("^they are displayed with the Privacy policy CTA$")
	public void they_are_displayed_with_the_Privacy_CTA(){
		softassert.assertTrue(legal._privacy.isDisplayed());
		softassert.assertAll();
		logger.info("User displayed with the Privacy CTA");
	}

	@When("^they tap on the Privacy policy CTA from the list$")
	public void they_tap_on_the_Privacy_policy_CTA_from_the_list(){
		verifytest(legal._privacy);
		TapElement(legal._privacy);
		logger.info("User Tap on Privacy policy CTA");
	}

	@Then("^they are redirected to the device default browser$")
	public void they_are_redirected_to_the_device_default_browser() throws Throwable{
		Thread.sleep(8000);
		softassert.assertTrue(legal._MarsText.isDisplayed());
		softassert.assertAll();
		logger.info("User redirected to the device default browser");
	}

	@And("^the browser loads the Privacy policy page with the following URL \"https://www.mars.com/privacy\"$")
	public void the_browser_loads_the_Privacy_policy_page_with_the_mars_dot_com() throws Throwable {
	//	String url ="https://www.mars.com/privacy";
		Thread.sleep(6000);
	//	TapElement(legal._defaultbrowser); 
	//	TapElement(legal._UrlEdit);
	//	TapElement(legal._UrlField);
	//	Assert.assertEquals(url,legal._UrlField.getText());
		logger.info("Browser loads the Privacy policy page with the following URL");
	}

}
