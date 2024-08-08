package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.CreateAccountStep2D;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.NeedhelpfindingyourMyBanfieldemail;
import com.bma.pageObject.Sent_Popup;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_RetrieveEmail;
import com.bma.pageObject.Whoops_PopUp_RetrieveEmail_login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateAccount_Step2D_RegisteredClientId_emailPopup extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public CreateAccountStep2D CreateAccount2D = new CreateAccountStep2D(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public Whoops_PopUp_RetrieveEmail_login LooksLikeYouAlreadyHaveAnAccount = new Whoops_PopUp_RetrieveEmail_login(driver);
	
	public String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep4completeonline.csv";
	
	@Then("^the user enters the registered Banfield Client ID in the field$")
	public void the_user_enters_the_registered_Banfield_Client_ID_in_the_field() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUN01V7");
		logger.info("the user enters the Banfield Client ID in the field");
	}

	@Then("^user taps on Next CTA to get a pop-up message saying:$")
	public void user_taps_on_Next_CTA_to_get_a_pop_up_message_saying() throws Throwable {
		TapElement(SignUpForMyBanfield._NextCTA);
		TapElement(SignUpForMyBanfield._NextCTA);
		TapElement(SignUpForMyBanfield._NextCTA);
		Thread.sleep(6000);
		CreateAccount2D.verifypopupforregisteredclient();
		logger.info("user taps on Next CTA to get a pop-up message with login Cta");
	}

	@Then("^the user taps on Log in now CTA in popup to get redirected to Log in page$")
	public void the_user_taps_on_Log_in_now_CTA_in_popup_to_get_redirected_to_Log_in_page() throws Throwable {
		TapElement(CreateAccount2D._LoginNowCTA);
		Thread.sleep(3000);
		verifytest(Login._EmailTextField);
		Login.VerifyLoginUI();
		logger.info("the user taps on Log in now CTA in popup to get redirected to Log in page");
	}

	@Then("^the user taps on Close X icon to close the pop-up$")
	public void the_user_taps_on_Close_X_icon_to_close_the_pop_up() throws Throwable {
		TapElement(CreateAccount2D._CloseCTA);
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user enters the Banfield Client ID in the field");
	}
	
	@And("^the user taps on Close X icon to close the popup$")
	public void the_user_taps_on_Close_X_icon_to_close_the_popup() throws Throwable {
		TapElement(CreateAccount2D._CloseCTASentScreen);
		verifytest(SignUpForMyBanfield._EnterEmailTextfield);
		Assert.assertTrue(SignUpForMyBanfield._EnterEmailTextfield.isDisplayed());
		logger.info("the user enters the Banfield Client ID in the field");
	}

	@Then("^the user if enters the registered Banfield email in the field$")
	public void the_user_if_enters_the_registered_Banfield_email_in_the_field() throws Throwable {
		String Email = getcsvdata(path,3,"Email", "Email","password");
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, Email);
		TapElement(SignUpForMyBanfield._CantfindyourClientIDText);
		logger.info("the user enters an Email ID in the field");

	}
	
	@Then("^user taps on Send my clientID CTA to get a pop-up message saying:$")
	public void user_taps_on_Send_my_clientID_CTA_to_get_a_pop_up_message_saying() throws Throwable {
		TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
		Thread.sleep(3000);
		verifytest(LooksLikeYouAlreadyHaveAnAccount._WhoopsTitle);
		LooksLikeYouAlreadyHaveAnAccount.verifyLooksLikeAlreadyHaveAccountPopups();
		logger.info("user taps on Send my clientID CTA to get a pop-up message saying");
	}


}
