package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

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


public class SocialMediaSteps extends Utilities {
	public ProfileScreen ProfileScreen = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcomeScreen= new ViewWelcomeScreen(driver);
	public BottomNavigationScreen BottomNavigation = new BottomNavigationScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	
	private static Logger logger = LogManager.getLogger(SocialMediaSteps.class);
	SoftAssert softassert = new SoftAssert();
	@When("^User is on the My Profile page or Legal Stuff Page$")
	public void User_is_on_the_My_Profile_page_or_Legal_Stuff_Pag() throws Throwable{
		driver.manage().timeouts().implicitlyWait(elementWaitInSeconds,TimeUnit.SECONDS);
		TapElement(ViewWelcomeScreen._signInbutton);
		LoginUser.logintoApp();
		TapElement(BottomNavigation._profileCTA);
		logger.info("User is on the My Profile page or Legal Stuff Page");
	}
	
	@And("^the user is displayed with the social media Links$")
	public void the_user_is_displayed_with_the_social_media_Links() throws Throwable{
		Thread.sleep(4000);
		softassert.assertTrue(ProfileScreen._facebookicon.isDisplayed());	
		softassert.assertTrue(ProfileScreen._instagramicon.isDisplayed());	
		softassert.assertTrue(ProfileScreen._youtubeicon.isDisplayed());	
		softassert.assertTrue(ProfileScreen._twittericon.isDisplayed());
		softassert.assertAll();
		logger.info("User is displayed with the social media Links");
	}
	
	@When("^the user clicks on the Facebook CTA$")
	public void User_clicks_on_the_Facebook_CTA() throws Throwable{
	//	String url ="https://m.facebook.com/BanfieldPetHospital/";
		Assert.assertTrue(ProfileScreen._facebookicon.isEnabled());
		verifytest(ProfileScreen._facebookicon);
		TapElement(ProfileScreen._facebookicon);
	//	Thread.sleep(8000);
	//	TapElement(LegalStuffSteps._defaultbrowser); 
	//	TapElement(LegalStuffSteps._UrlEdit);
	//	TapElement(LegalStuffSteps._UrlField);
	//	Assert.assertEquals(url,LegalStuffSteps._UrlField.getText());
		logger.info("User clicks on the Facebook CTA");
	}

	@When("^the user clicks on the Twitter CTA$")
	public void the_user_clicks_on_the_Twitter_CTA() throws Throwable{
	//	String url ="https://mobile.twitter.com/Banfield";
		Assert.assertTrue(ProfileScreen._twittericon.isEnabled());
		verifytest(ProfileScreen._twittericon);
		TapElement(ProfileScreen._twittericon);
	//	Thread.sleep(6000);
	//	TapElement(LegalStuffSteps._defaultbrowser); 
	//	TapElement(LegalStuffSteps._UrlEdit);
	//	TapElement(LegalStuffSteps._UrlField);
		logger.info("the user clicks on the Twitter CTA");
	}

	@When("^the user clicks on the Instagram CTA$")
	public void the_user_clicks_on_the_Instagram_CTA() throws Throwable{
	//	String url ="https://www.instagram.com/banfieldpethospital/";
		Assert.assertTrue(ProfileScreen._instagramicon.isEnabled());
		verifytest(ProfileScreen._instagramicon);
		TapElement(ProfileScreen._instagramicon);
	//	Thread.sleep(6000);
	//	TapElement(LegalStuffSteps._defaultbrowser); 
	//	TapElement(LegalStuffSteps._UrlEdit);
	//	TapElement(LegalStuffSteps._UrlField);
		logger.info("the user clicks on the Instagram CTA");
	}

	@When("^the user clicks on the Youtube CTA$")
	public void the_user_clicks_on_the_Youtube_CTA() throws Throwable{
		Assert.assertTrue(ProfileScreen._youtubeicon.isEnabled());
		verifytest(ProfileScreen._youtubeicon);
		TapElement(ProfileScreen._youtubeicon);
	//	Thread.sleep(6000);
	//	softassert.assertTrue(ProfileScreen._banfield_Youtube.isDisplayed());
	//	softassert.assertAll();
		logger.info("the user clicks on the Youtube CTA");
		
	}
	

}