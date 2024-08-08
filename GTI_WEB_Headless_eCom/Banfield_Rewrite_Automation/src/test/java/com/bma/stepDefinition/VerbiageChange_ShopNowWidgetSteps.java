package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VerbiageChange_ShopNowWidgetSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(VerbiageChange_ShopNowWidgetSteps.class);

	@When("^the user is displayed with the Shop Banfield Widget$")
	public void user_is_displayed_with_the_Shop_Banfield_Widget() {
		ScrolltoElement("Shop now");
		Assert.assertTrue(Home._shopBanfieldWidget.isDisplayed());
		logger.info("the user is displayed with the Shop Banfield Widget");
	}
	
	@When("^the user is displayed with the ShopBanfield$")
	public void user_is_displayed_with_the_ShopBanfield() {
		softassert.assertTrue(Home._shopBanfieldTitle.isDisplayed());
		softassert.assertTrue(Home._shopBanfieldText.isDisplayed());
		ScrolltoElement("Shop now");
		softassert.assertTrue(Home._shopBanfieldCTA.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the ShopBanfield");
	}
}
