package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Step2A_EnterBanfieldClientIdSteps extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_enterEmail_password = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver); 
	
	@When("^they are displayed with the Client ID field with a placeholder text : Client ID Ex: BNF(\\d+)B$")
	public void they_are_displayed_with_the_Client_ID_field_with_a_placeholder_text_Client_ID_Ex_BNF_B(int arg1) throws Throwable {
		softassert.assertTrue(SignUpForMyBanfield._ClientIdtestfield.isDisplayed());
		softassert.assertEquals("Client ID Ex: BNF123B",SignUpForMyBanfield._ClientIdtestfield.getText());
		softassert.assertAll();
		Assert.assertFalse(SignUpForMyBanfield._NextCTA.isEnabled());
		logger.info("they are displayed with the Client ID field with a placeholder text : Client ID Ex: BNF");
	}

	@Then("^the user enters the Banfield Client ID in the field$")
	public void the_user_enters_the_Banfield_Client_ID_in_the_field() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUN01V7");
		logger.info("the user enters the Banfield Client ID in the field");

	}
	@Then("^the user cannot enter more than ten characters in the Client ID field$")
	public void the_user_cannot_enter_more_than_ten_characters_in_the_Client_ID_field() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUN01V7morethen10");
		Assert.assertNotSame("HUN01V7morethen10",SignUpForMyBanfield._ClientIdtestfield.getText());
		logger.info("the user cannot enter more than ten characters in the Client ID field");
	}
	
	@Then("^the user cannot enter any special characters in the client ID field$")
	public void the_user_cannot_enter_any_special_characters_in_the_client_ID_field() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "@#HU_N7$%");
		Assert.assertNotSame("@#HU_N7$%",SignUpForMyBanfield._ClientIdtestfield.getText());
		logger.info("the user cannot enter any special characters in the client ID field");
	}

	@Then("^the Next CTA is enabled only after entering the Banfield ID$")
	public void the_Next_CTA_is_enabled_only_after_entering_the_Banfield_ID() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUN01V7");
		Assert.assertTrue(SignUpForMyBanfield._NextCTA.isEnabled());
		logger.info("the Next CTA is enabled only after entering the Banfield ID");
	}

	@Then("^the user taps on Next CTA to validate the Banfield ID entered$")
	public void the_user_taps_on_Next_CTA_to_validate_the_Banfield_ID_entered() throws Throwable {
	//	EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUN01V7");
		final String path = "./src/test/resources/TestData/Sprint2/CreateAccount_ClientID.csv";
		String ClientId =  getcsvdata(path,2,"ClientId","ClientId");
		EnterInput(SignUpForMyBanfield._ClientIdtestfield,ClientId);
		TapElement(SignUpForMyBanfield._NextCTA);
		logger.info("the user taps on Next CTA to validate the Banfield ID entered");
	}

	@Then("^the user is redirected to the next screen Sign up for MyBanfield on entering a valid Banfield ID$")
	public void the_user_is_redirected_to_the_next_screen_Sign_up_for_MyBanfield_on_entering_a_valid_Banfield_ID() throws Throwable {
		Thread.sleep(4000);
		verifytest(SignUpForMyBanfield_enterEmail_password._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield_enterEmail_password._SignUpForMyBanfieldHeader.isDisplayed()); //
		logger.info("the user is redirected to the next screen Sign up for MyBanfield on entering a valid Banfield ID");
	}

	@Then("^the user is displayed with the error message pop up on entering an Invalid Banfield ID$")
	public void the_user_is_displayed_with_the_error_message_pop_up_on_entering_an_Invalid_Banfield_ID() throws Throwable {
		EnterInput(SignUpForMyBanfield._ClientIdtestfield, "HUjhN0gsd");
		TapElement(SignUpForMyBanfield._NextCTA);
	//	TapElement(SignUpForMyBanfield._NextCTA);
	//	TapElement(SignUpForMyBanfield._NextCTA);
		Thread.sleep(6000);
		Assert.assertTrue(Whoops._WhoopsTitle.isDisplayed());
		softassert.assertTrue(Whoops._HelpWithClientIdCTA.isDisplayed());
		softassert.assertTrue(Whoops._ThatClientIDisntinoursystemText.isDisplayed());
		softassert.assertAll();
		logger.info("the user is displayed with the error message pop up on entering an Invalid Banfield ID");
	}

	@Then("^the user taps on X on pop up to close the pop up and stay on the same screen$")
	public void the_user_taps_on_X_on_pop_up_to_close_the_pop_up_and_stay_on_the_same_screen() throws Throwable {
		TapElement(Whoops._CloseCTA);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user taps on X on pop up to close the pop up and stay on the same screen");
	}

	@Then("^the user taps on Help with Client IDs to get redirected to the Help with Client IDs screen on Pop up Message$")
	public void the_user_taps_on_Help_with_Client_IDs_to_get_redirected_to_the_Help_with_Client_IDs_screen_on_Pop_up_Message() throws Throwable {
		TapElement(Whoops._HelpWithClientIdCTA);
		Thread.sleep(3000);
		Assert.assertTrue(HelpWithClientIds._HelpWithClientIdHeader.isDisplayed());
		logger.info("the user taps on Help with Client IDs to get redirected to the Help with Client IDs screen on Pop up Message");
	}

	@Then("^the user taps on X on pop up to go back to welcome screen$")
	public void the_user_taps_on_X_on_pop_up_to_go_back_to_welcome_screen() throws Throwable {
		TapElement(HelpWithClientIds._cancelCTA);
		verifytest(ViewWelcome._signInbutton);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on X on pop up to go back to welcome screen");
	}

	@Then("^the user taps on < to get redirected to the previous screen Sign up for MyBanfield$")
	public void the_user_taps_on_to_get_redirected_to_the_previous_screen_Sign_up_for_MyBanfield() throws Throwable {
		TapElement(HelpWithClientIds._backCTA);
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user taps on < to get redirected to the previous screen Sign up for MyBanfield");
	}

	@Then("^the user is displayed with the Make an appointment CTA$")
	public void the_user_is_displayed_with_the_Make_an_appointment_CTA() throws Throwable {
		Assert.assertTrue(HelpWithClientIds._MakeanAppointmentCTA.isDisplayed());
		logger.info("the user is displayed with the Make an appointment CTA");
	}

	@Then("^the user taps on Make an appointment CTA to get redirected to Have we met\\? screen$")
	public void the_user_taps_on_Make_an_appointment_CTA_to_get_redirected_to_Have_we_met_screen() throws Throwable {
		Thread.sleep(3000);
		TapElement(HelpWithClientIds._MakeanAppointmentCTA);
		Thread.sleep(3000);
		verifytest(havewemet._havewemettitle);
		Assert.assertTrue(havewemet._havewemettitle.isDisplayed());
		logger.info("the user taps on Make an appointment CTA to get redirected to Have we met");
	}

	@Then("^the user taps on X to get redirected to the Welcome Screen$")
	public void the_user_taps_on_X_to_get_redirected_to_the_Welcome_Screen() throws Throwable {
		TapElement(SignUpForMyBanfield._cancelCTA);
		Thread.sleep(3000);
		verifytest(ViewWelcome._signInbutton);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user taps on X to get redirected to the Welcome Screen");
	}

	@Then("^the user taps on < to get redirected to the Have we met screen$")
	public void the_user_taps_on_to_get_redirected_to_the_Have_we_met_screen() throws Throwable {
		TapElement(SignUpForMyBanfield._backCTA);
		Thread.sleep(3000);
		verifytest(havewemet._havewemettitle);
		Assert.assertTrue(havewemet._havewemettitle.isDisplayed());
		logger.info("the user taps on < to get redirected to the Have we met screen");
	}
	
	@And("^User should able to verify trademark icon for Banfield text$")
	public void User_should_able_to_verify_trademark_icon_for_Banfield_text() throws Throwable {
		Thread.sleep(3000);
		verifytest(SignUpForMyBanfield._UseyourBanfieldClientIDtogetstartedText);
		softassert.assertTrue(SignUpForMyBanfield._UseyourBanfieldClientIDtogetstartedText.isDisplayed());
		softassert.assertAll();
		logger.info("User should able to verify trademark icon for Banfield textF");
	}
}
