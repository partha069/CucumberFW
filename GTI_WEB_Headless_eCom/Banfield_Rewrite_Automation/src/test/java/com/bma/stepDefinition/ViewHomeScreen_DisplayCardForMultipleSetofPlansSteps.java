package com.bma.stepDefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ViewHomeScreen_DisplayCardForMultipleSetofPlansSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	public String path1 = "./src/test/resources/TestData/Sprint5/Login_using_credentials19.csv";
	public String path2 = "./src/test/resources/TestData/Sprint5/Login_using_credentials20.csv";
	
	private static Logger logger = LogManager.getLogger(ViewHomeScreen_DisplayCardForMultipleSetofPlansSteps.class);
	
	@When("^User Login into the Home Screen with SINGLE Multi VCGO$")
	public void User_Login_into_the_Home_Screen_with_SINGLE_Multi_VCGO() throws Throwable { 
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(6000);
		logger.info("User Login into the Home Screen with SINGLE Multi VCGO");
	}
	
	@When("^User Login into the Home Screen with SINGLE SINGLE VCGO$")
	public void User_Login_into_the_Home_Screen_with_SINGLE_SINGLE_VCGO() throws Throwable { 
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path2,2,"password", "Email","password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("User Login into the Home Screen with SINGLE SINGLE VCGO");
	}
	
	@Then("^the user is displayed with 2 VetChatGo modules on the Home screen$")
	public void the_user_is_displayed_with_two_VetChatGo_modules_on_the_Home_screen() throws Throwable {
		ScrolltoElement("ABC2, ABC3");
		Assert.assertTrue(Home._vetchatgoWiget1.isDisplayed());
		ScrolltoElement("A, ABC1");
		Assert.assertTrue(Home._vetchatgoWiget2.isDisplayed());
		logger.info("the user is displayed with 2 VetChatGo modules on the Home screen");
	}
	
	@And("^if user has purchased more than one multi-pet plan, then 2 Multi status modules will display$")
	public void user_has_purchased_more_than_one_multi_pet_plan_then_two_Multi_status_modules_will_display() throws Throwable {
		ScrolltoElement("ABC2, ABC3");
		softassert.assertTrue(Home._vetchatgoWiget1.isDisplayed());
	//	Home.verifyVetChatGoOne();
		ScrolltoElement("A, ABC1");
	//	Home.verifyVetChatGotwo();
		softassert.assertTrue(Home._vetchatgoWiget2.isDisplayed());
		softassert.assertAll();
		logger.info("user has purchased more than one multi-pet plan, then 2 Multi status modules will display");
	}
	
	@And("^the VetChatGo module will display if user has purchased the Single Pet VetChatGo Plan$")
	public void the_VetChatGo_module_will_display_if_user_has_purchased_the_Single_Pet_VetChatGo_Plan() throws Throwable {
		ScrolltoElement("Active");
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("the VetChatGo module will display if user has purchased the Single Pet VetChatGo Plan");
	}
	
	@And("^the VetChatGo module will display if user has purchased the Multi-Pet VetChatGo Plan$")
	public void the_VetChatGo_module_will_display_if_user_has_purchased_the_Multi_Pet_VetChatGo_Plan() throws Throwable {
		ScrolltoElement("Active");
		Assert.assertTrue(Home._vetchatgoWiget1.isDisplayed());
		logger.info("the VetChatGo module will display if user has purchased the Multi-Pet VetChatGo Plan");
	}
	
	@And("^if user has purchased a Single pet VetChatGo plan and a Multi pet VetChatGo plan, then both status modules will be displayed$")
	public void if_user_has_purchased_a_Single_pet_VetChatGo_plan_and_a_Multi_pet_VetChatGo_plan_then_both_status_modules_will_be_displayed() throws Throwable {
		ScrolltoElement("Puff");
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		ScrolltoElement("Armando, Bernardetta");
		Assert.assertTrue(Home._vetchatgoWiget2.isDisplayed());
		logger.info("if user has purchased a Single pet VetChatGo plan and a Multi pet VetChatGo plan, then both status modules will be displayed");
	}
	
	@And("^if user has purchased more than one single pet plan, then 2 Single status modules will display$")
	public void if_user_has_purchased_more_than_one_single_pet_plan_then_two_Single_status_modules_will_display() throws Throwable {
		ScrolltoElement("VetChatGo™"); 
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("if user has purchased more than one single pet plan, then 2 Single status modules will display");
	}
	
	@And("^the most recently purchased plan should be displayed first$")
	public void the_most_recently_purchased_plan_should_be_displayed_first() throws Throwable {
		ScrolltoElement("Puff"); 
		Assert.assertTrue(Home._vetchatgoSingleWiget1.isDisplayed());
		logger.info("the most recently purchased plan should be displayed first");
	}
	
	@And("^the Start date format will be Mon, DD, YYYY$")
	public void the_Start_date_format_will_be_Mon_DD_YYYY() throws Throwable {
		Assert.assertTrue(Home._vetchatgoStartDate.isDisplayed());
		Assert.assertTrue(Home._vetchatgoDate.isDisplayed());
		logger.info("the Start date format will be Mon, DD, YYYY");
	}
	
	@And("^the Expiration date format will be Mon DD, YYYY$")
	public void the_Expiration_date_format_will_be_Mon_DD_YYYY() throws Throwable {
		Assert.assertTrue(Home._vetchatgoExpiration.isDisplayed());
		Assert.assertTrue(Home._vetchatgoExpiryDate.isDisplayed());
		logger.info("the Expiration date format will be Mon, DD, YYYY");
	}
	
	@And("^the user should be displayed with Total amount$")
	public void the_user_should_be_displayed_with_Total_amount() throws Throwable {
		Assert.assertTrue(Home._vetchatgoTotalAmount.isDisplayed());
		Assert.assertTrue(Home._vetchatgoAmount.isDisplayed());
		logger.info("the user should be displayed with Total amount: $XXX");
	}

}
