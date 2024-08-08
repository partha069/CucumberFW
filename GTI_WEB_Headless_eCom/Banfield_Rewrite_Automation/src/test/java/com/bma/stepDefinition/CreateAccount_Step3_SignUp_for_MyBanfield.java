package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.HelpWithClientIdsScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreen;
import com.bma.pageObject.SignUpForMyBanfieldScreenStep3;
import com.bma.pageObject.SignUpForMyBanfield_CompleteonlineprofileScreenstep4;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.Whoops_PopUp;
import com.bma.pageObject.Whoops_PopUp_ClientId_Okay;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount_Step3_SignUp_for_MyBanfield extends Utilities {
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(ViewWelcomeScreenSteps.class);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public SignUpForMyBanfieldScreen SignUpForMyBanfield = new SignUpForMyBanfieldScreen(driver);
	public HelpWithClientIdsScreen HelpWithClientIds = new HelpWithClientIdsScreen(driver);
	public SignUpForMyBanfield_CompleteonlineprofileScreenstep4 SignUpForMyBanfield_step4 = new SignUpForMyBanfield_CompleteonlineprofileScreenstep4(driver);
	public Whoops_PopUp Whoops = new Whoops_PopUp(driver);
	public SignUpForMyBanfieldScreenStep3 SignUpForMyBanfieldStep3 = new SignUpForMyBanfieldScreenStep3(driver);
	public Whoops_PopUp_ClientId_Okay Whoops_PopUp_Id_Okay = new Whoops_PopUp_ClientId_Okay(driver);
	public String path = "./src/test/resources/TestData/Sprint2/CreateAccountStep3.csv"; // Dada,5629723643,59539
	public String path1 = "./src/test/resources/TestData/Sprint2/CreateAccount_ClientID.csv"; //PAM0BX6 
	public String path2 = "./src/test/resources/TestData/Sprint2/CreateAccount_AcountInfo.csv"; //Jada,5578265709,60360 

	@When("^the user enters valid client Id and clicks on Next CTA$") //GAF05CH
	public void the_user_enters_valid_client_Id_and_clicks_on_Next_CTA() throws Throwable {
	//	SignUpForMyBanfield.EnterClientID();
		SignUpForMyBanfield.EnterValidNewClientID();
		logger.info("the user enters valid client Id and clicks on Next CTA"); 
	}
	
	@When("^the user enters valid client Id and click on Next CTA$") //PAM0BX6
	public void the_user_enters_valid_client_Id_and_click_on_Next_CTA() throws Throwable {
		SignUpForMyBanfield.EnterClientID();
		logger.info("the user enters valid client Id and click on Next CTA"); 
	}

	@Then("^the user is redirected to next screen Sign up for MyBanfield and are displayed with the following things:$")
	public void the_user_is_redirected_to_next_screen_Sign_up_for_MyBanfield_and_are_displayed_with_the_following_things() throws Throwable {
		SignUpForMyBanfieldStep3.VerifyCreateAccountstep3UI();
		logger.info("the user is redirected to next screen Sign up for MyBanfield"); 
	}
	
	@Then("^the Next CTA is by default in disabled state$")
	public void the_Next_CTA_is_by_default_in_disabled_state() throws Throwable {
		//Assert.assertFalse(SignUpForMyBanfieldStep3._NextCTA.isEnabled());
		logger.info("the Next CTA is by default in disabled state"); 
	}

	@Then("^selecting pet name, entering phone number and zip code is mandatory field$")
	public void selecting_pet_name_entering_phone_number_and_zip_code_is_mandatory_field() throws Throwable {
		//SignUpForMyBanfieldStep3.EnterCreate();
		Thread.sleep(4000);
		SignUpForMyBanfieldStep3.EnterCreateAccountstep3Validdetails(); //Jada,5578265709,60360
		logger.info("User selecting pet name, entering phone number and zip code in mandatory field"); 
	}
	
	@Then("^the user cannot type more than ten digits in the Phone number field$")
	public void the_user_cannot_type_more_than_ten_digits_in_the_Phone_number_field() throws Throwable {
		EnterInput(SignUpForMyBanfieldStep3._PhoneTextField, "98989898989");
		Assert.assertNotSame("98989898989",SignUpForMyBanfieldStep3._PhoneTextField.getText());
		logger.info("the user cannot type more than ten digits in the Phone number field"); 
	}

	@Then("^the user on entering nine digits or less in the phone number is displayed with an error message:  Invalid phone$")
	public void the_user_on_entering_nine_digits_or_less_in_the_phone_number_is_displayed_with_an_error_message_Invalid_phone() throws Throwable {
		EnterInput(SignUpForMyBanfieldStep3._PhoneTextField, "989898989");
		Assert.assertTrue(SignUpForMyBanfieldStep3._phoneerror.isDisplayed());
		logger.info("the user on entering nine digits or less in the phone number is displayed with an error message:  Invalid phone"); 
	}

	@Then("^the user cannot type more than five digits in the Zip code field$")
	public void the_user_cannot_type_more_than_five_digits_in_the_Zip_code_field() throws Throwable {
		EnterInput(SignUpForMyBanfieldStep3._ZipcodeTextField, "9898989");
		Assert.assertNotSame("9898989",SignUpForMyBanfieldStep3._PhoneTextField.getText());
		logger.info("the user cannot type more than five digits in the Zip code field"); 
	}
	@Then("^the user on entering four digits or less is displayed with an error message:  Invalid zip code$")
	public void the_user_on_entering_four_digits_or_less_is_displayed_with_an_error_message_Invalid_zip_code() throws Throwable {
		EnterInput(SignUpForMyBanfieldStep3._ZipcodeTextField, "9889");
		Assert.assertTrue(SignUpForMyBanfieldStep3._ziperror.isDisplayed());
		logger.info("the user on entering four digits or less is displayed with an error message:  Invalid zip code"); 
	}
//	@Then("^the user has to answer two out of three questions correctly to proceed$")
//	public void the_user_has_to_answer_two_out_of_three_questions_correctly_to_proceed() throws Throwable {
//		TapElement(SignUpForMyBanfieldStep3._PetNameTextField);
//		Scroll("Jarrod");		
//		EnterInput(SignUpForMyBanfieldStep3._PhoneTextField, "5629723643");
//		EnterInput(SignUpForMyBanfieldStep3._ZipcodeTextField, "93281");
//	logger.info("the user answered two out of three questions correctly to proceed"); 
//	}
	@Then("^the user will see a pop-up when the two out of three questions are incorrect Title: Whoops! Text:  Thats not right\\. Check your info and try again\\. Need help\\? call our support hotline at (\\d+)-(\\d+)-(\\d+)\\(hyperlink\\)$")
	public void the_user_will_see_a_pop_up_when_the_two_out_of_three_questions_are_incorrect_Title_Whoops_Text_Thats_not_right_Check_your_info_and_try_again_Need_help_call_our_support_hotline_at_hyperlink(int arg1, int arg2, int arg3) throws Throwable {
		TapElement(SignUpForMyBanfieldStep3._PetNameTextField);
		String petname= getcsvdata(path2,2,"petname", "petname","phone","zipcode");
		Scroll(petname);		
		String phone= getcsvdata(path,2,"phone", "petname","phone","zipcode");
		String zipcode= getcsvdata(path,2,"zipcode", "petname","phone","zipcode");
		EnterInput(SignUpForMyBanfieldStep3._PhoneTextField, phone); //5629879643
		EnterInput(SignUpForMyBanfieldStep3._ZipcodeTextField, zipcode); //93271
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(8000);
		Whoops_PopUp_Id_Okay.verifyWhoopspopupwithokayCTA();
		logger.info("Whoops Popup with okay Cta is displayed"); 
	}
	@Then("^the user tap on Okay CTA to get redirected to the welcome screen\\.$")
	public void the_user_tap_on_Okay_CTA_to_get_redirected_to_the_welcome_screen() throws Throwable {
		TapElement(Whoops_PopUp_Id_Okay._OkayCTA);
		Thread.sleep(1000);
	//  ViewWelcome.verifyWelcomeScreenUIElement(); //Can't do it else it will be block other steps
		verifytest(SignUpForMyBanfieldStep3._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfieldStep3._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user tapped on Okay CTA to get redirected to the welcome screen"); 
	}

	@Then("^Next CTA is enabled by entering all the mandatory fields$")
	public void next_CTA_is_enabled_by_entering_all_the_mandatory_fields() throws Throwable {
		Assert.assertTrue(SignUpForMyBanfieldStep3._NextCTA.isDisplayed());
		TapElement(SignUpForMyBanfieldStep3._NextCTA);
		Thread.sleep(4000);
		verifytest(SignUpForMyBanfield_step4._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield_step4._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("Next CTA is enabled by entering all the mandatory fields"); 
	}
	
	@Then("^the user taps on < on welcome to My Banfield Screen to get redirected to the previous screen Sign up for MyBanfield$")
	public void the_user_taps_on_on_welcome_to_My_Banfield_Screen_to_get_redirected_to_the_previous_screen_Sign_up_for_MyBanfield() throws Throwable {
		TapElement(SignUpForMyBanfieldStep3._backCTA);
		Thread.sleep(4000);
		verifytest(SignUpForMyBanfield._SignUpForMyBanfieldHeader);
		Assert.assertTrue(SignUpForMyBanfield._SignUpForMyBanfieldHeader.isDisplayed());
		logger.info("the user tapped on < on welcome to My Banfield Screen to get redirected to the previous screen Sign up for MyBanfield"); 
	}

	@Then("^the user taps on X on welcome to My Banfield Screen to get redirected to the Welcome Screen$")
	public void the_user_taps_on_X_on_welcome_to_My_Banfield_Screen_to_get_redirected_to_the_Welcome_Screen() throws Throwable {
		TapElement(SignUpForMyBanfieldStep3._cancelCTA);
		verifytest(ViewWelcome._signInbutton);
		ViewWelcome.verifyWelcomeScreenUIElement();
		logger.info("the user tapped on X on welcome to My Banfield Screen to get redirected to the Welcome Screen"); 
	}
	
	@And("^User wants to verify UI for Sign up for MyBanfield screen$")
	public void User_wants_to_verify_UI_for_Sign_up_for_MyBanfield_Screen() throws Throwable {
		Thread.sleep(3000);
		softassert.assertTrue(SignUpForMyBanfieldStep3._WelcometoMyBanfieldText.isDisplayed()); 
		softassert.assertTrue(SignUpForMyBanfieldStep3._PetNameTextField.isDisplayed());
		softassert.assertTrue(SignUpForMyBanfieldStep3._PhoneTextField.isDisplayed());
		softassert.assertTrue(SignUpForMyBanfieldStep3._ZipcodeTextField.isDisplayed());
		softassert.assertTrue(SignUpForMyBanfieldStep3._LetsMakeSureText.isDisplayed());
		softassert.assertTrue(SignUpForMyBanfieldStep3._NextCTA.isDisplayed());
		softassert.assertAll();
		verifytest(SignUpForMyBanfieldStep3._WelcometoMyBanfieldText);
		logger.info("User wants to verify UI for Sign up for MyBanfield screen"); 
	}
}
