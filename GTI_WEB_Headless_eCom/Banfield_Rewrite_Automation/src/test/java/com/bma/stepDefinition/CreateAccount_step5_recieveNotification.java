package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.CreateAccount_LocationServiceEnableStep6;
import com.bma.pageObject.CreateAccount_RecieveNotificationStep5;
import com.bma.pageObject.DeleteBanfieldAccoutScreen;
import com.bma.pageObject.DeleteConfirmationPopups;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreenStep3;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhenAndWhereScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_ClientId_Login;
import com.bma.pageObject.Whoops_PopUp_RetrieveEmail_login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_step5_recieveNotification extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_step4 = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver);
	public SignUpForMyBanfieldScreenStep3 SignUpForMyBanfieldStep3 = new SignUpForMyBanfieldScreenStep3(driver);
	public Whoops_PopUp_ClientId_Login Whoops_PopUp_CId_Login = new Whoops_PopUp_ClientId_Login(driver);
	public CreateAccount_RecieveNotificationStep5 CreateAccount_RecieveNotiStep5 = new CreateAccount_RecieveNotificationStep5(driver);
	public CreateAccount_LocationServiceEnableStep6 CreateAccount_LocationEnableStep6 = new CreateAccount_LocationServiceEnableStep6(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhenAndWhereScreen WhenAndWhere = new WhenAndWhereScreen(driver);
	public Whoops_PopUp_RetrieveEmail_login Whoops_PopUp_RetrieveEmail = new Whoops_PopUp_RetrieveEmail_login(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ProfileScreen Profile = new ProfileScreen(driver);
	public DeleteBanfieldAccoutScreen DeleteBanfieldAccout = new DeleteBanfieldAccoutScreen(driver);
	public DeleteConfirmationPopups DeleteConfirmation = new DeleteConfirmationPopups(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/CreateAccountCredential.csv";
	
	
	@Given("^user is on the Complete online profile screen$")
	public void user_is_on_the_Complete_online_profile_screen() throws Throwable {
		ViewWelcome.TapOnnewCreateAccount();
		havewemet.TapOnYesIHaveCTA();
		try {
			SignUpForMyBanfield.EnterValidNewClientID(); //EnterClientID
			Assert.assertTrue(SignUpForMyBanfieldStep3._LetsMakeSureText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(Whoops_PopUp_RetrieveEmail._WhoopsTitle.isDisplayed());
			TapElement(Whoops_PopUp_RetrieveEmail._LoginNowCTA);
			EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
			EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
			TapElement(Login._LoginButton);
			Thread.sleep(7000);
			TapElement(Profile._profileCTA);
			TapElement(Profile._YourProfileCTA);
			Thread.sleep(2000);
			swipeDown();
			TapElement(Profile._deleteCTA);
			DeleteBanfieldAccout.verifyUpdatePasswordUI();
			TapElement(DeleteBanfieldAccout._yesDeleteMyAccountCTA);
			DeleteConfirmation.verifyPopupsScreen();
			TapElement(DeleteConfirmation._okCTA);
			Thread.sleep(500);
			Assert.assertTrue(LoginUser._EmailTextField.isDisplayed());
			Thread.sleep(4000);
			TapElement(LoginUser._cancelCTA);
			Thread.sleep(1000);
			ViewWelcome.TapOnnewCreateAccount();
			havewemet.TapOnYesIHaveCTA();
			SignUpForMyBanfield.EnterClientID();
			Assert.assertTrue(SignUpForMyBanfieldStep3._LetsMakeSureText.isDisplayed());
		} 
		SignUpForMyBanfieldStep3.EnterCreateAccountstep3(); //EnterCreateAccountstep3Validdetails
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(5000);
	}

	@When("^the user clicks on Next CTA on the Complete online profile screen$")
	public void the_user_clicks_on_Next_CTA_on_the_Complete_online_profile_screen() throws Throwable {
	//	SignUpForMyBanfield_step4.EnterUNRegisteredemailandpwd();
		SignUpForMyBanfield_step4.EnterValidInformation();// EnterRegisteredemailandpwd
		TapElement(SignUpForMyBanfield_step4._NextCTA);
		logger.info("the user clicks on Next CTA on the Complete online profile screen");
	}

	@Then("^the user should be redirected to pop-up screen with the following information:$")
	public void the_user_should_be_redirected_to_pop_up_screen_with_the_following_information() throws Throwable {	
		CreateAccount_RecieveNotiStep5.VerifyCreateAccountstep5UI();
		logger.info("the user should be redirected to pop-up screen with the following information");
	}

	@Then("^the user should be able to tap on Skip CTA to get redirected to next pop-up screen$")
	public void the_user_should_be_able_to_tap_on_Skip_CTA_to_get_redirected_to_next_pop_up_screen() throws Throwable {
		TapElement(CreateAccount_RecieveNotiStep5._SkipCTA);
		Assert.assertTrue(CreateAccount_LocationEnableStep6._HandyRightText.isDisplayed());	
		logger.info("the user should be able to tap on Skip CTA to get redirected to next pop-up screen");
	}
	
	@Then("^the user should be able to tap on Skip CTA to get redirected to next to next pop-up screen$")
	public void the_user_should_be_able_to_tap_on_Skip_CTA_to_get_redirected_to_next_to_next_pop_up_screen() throws Throwable {
		TapElement(CreateAccount_LocationEnableStep6._SkipCTA);
		Thread.sleep(1400);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user should be able to tap on Skip CTA to get redirected to next to next pop-up screen");
	}
	
	@Then("^the user should be able to tap on Yes CTA to get the native notification pop-up screen$")
	public void the_user_should_be_able_to_tap_on_Yes_CTA_to_get_the_native_notification_pop_up_screen() throws Throwable {
		TapElement(CreateAccount_RecieveNotiStep5._YesCTA);
		softassert.assertTrue(CreateAccount_LocationEnableStep6._HandyRightText.isDisplayed()); 
		logger.info("the user should be able to tap on Yes CTA to get the native notification pop-up screen");
	}

	@And("^the user should be able to tap on Yes CTA to get the native next notification pop-up screen$")
	public void the_user_should_be_able_to_tap_on_Yes_CTA_to_get_the_native_next_notification_pop_up_screen() throws Throwable {
		TapElement(CreateAccount_LocationEnableStep6._YesCTA);
		if (WhenAndWhere._onlyThisTimePopups.isDisplayed()) {
			TapElement(WhenAndWhere._onlyThisTimePopups);
		}
		Thread.sleep(1400);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user should be able to tap on Yes CTA to get the native next notification pop-up screen");
	}
}
