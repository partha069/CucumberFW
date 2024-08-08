package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
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

public class CreateAccount_Step2C_RetrieveClientIDPopUP extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public Sent_Popup Sent = new Sent_Popup(driver);
	
	public String path = "./src/test/resources/TestData/Sprint3/CreateAccountStep2C-Retrieve-SentPoPup.csv";

	@Then("^the user enters an Email ID in the field to get sent popup$")
	public void the_user_enters_an_Email_ID_in_the_field_to_get_sent_popup() throws Throwable {
		String Email = getcsvdata(path,2,"Email", "Email");
		Assert.assertFalse(SignUpForMyBanfield._SendMyClientIdCTA.isEnabled());
		EnterInput(SignUpForMyBanfield._EnterEmailTextfield, Email);
		logger.info("the user enters an Email ID in the field to get sent popup");
	}

	@Then("^the user taps on Send my Client ID to get the pop-up message on entering unregistered Email ID$")
	public void the_user_taps_on_Send_my_Client_ID_to_get_the_pop_up_message_on_entering_unregistered_Email_ID() throws Throwable {
		TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
		//TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
	//TapElement(SignUpForMyBanfield._SendMyClientIdCTA);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(7000);
		Assert.assertTrue(Sent._SentTitleText.isDisplayed());
		Assert.assertTrue(Sent._StaticText.isDisplayed());
		Assert.assertTrue(Sent._OpenMail.isDisplayed());
		logger.info("the user taps on Send my Client ID to get the pop-up message on entering unregistered Email ID");
	}

	@Then("^the user will tap on Open email CTA to open devices default mail\\.$")
	public void the_user_will_tap_on_Open_email_CTA_to_open_devices_default_mail() throws Throwable {
		verifytest(Sent._OpenMail);
		TapElement(Sent._OpenMail);
	}

	@Then("^the user tap on close X icon to dismiss the pop-up\\.$")
	public void the_user_tap_on_close_X_icon_to_dismiss_the_pop_up() throws Throwable {
		TapElement(Sent._CloseCTAPopups);
		Assert.assertTrue(SignUpForMyBanfield._SendMyClientIdCTA.isDisplayed());
		verifytest(SignUpForMyBanfield._SendMyClientIdCTA);
		
	}


}
