package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.bma.Utilities.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStep4ConfirmYourAccountSteps extends Utilities {

//	public ConfirmYourAccountScreen ConfirmYourAccount = new ConfirmYourAccountScreen(driver);
	private static Logger logger = LogManager.getLogger(CreateAccountStep4ConfirmYourAccountSteps.class);


	@When("^user is on the \"Let's find your record\" screen$")
	public void user_is_on_the_Lets_find_your_record_screen() {
		logger.info("user is on the Lets find your record screen");
	}
	
	@When("^the user clicks on Next CTA$")
	public void the_user_clicks_on_Next_CTA(){
		logger.info("the user clicks on Next CTA");
	}
	
	@Then("^the user is redirected to next screen Confirm your account$")
	public void the_user_is_redirected_to_next_screen_Confirm_your_account(){
		logger.info("the user is redirected to next screen Confirm your account");
	}

	@And("^I should see \"To keep your account secure, please verify the information below.\"$")
	public void I_should_see_To_keep_your_account_secure_please_verify_the_information_below(){
		logger.info("I should see To keep your account secure, please verify the information below");
	}
	
	@And("^I should see \"Select your pet's name dropdown field\"$")
	public void I_should_see_Select_your_pets_name_dropdown_field(){
		logger.info("I should see Select your pets name dropdown field");
	}
	
	@And("^I should see \"Enter your phone number\"$")
	public void I_should_see_Enter_your_phone_number(){
		logger.info("I should see Enter your phone number");
	}
	
	@And("I should see \"Enter your zip code?\"$")
	public void I_should_see_Enter_your_zip_code(){
		logger.info("I should see Enter your zip code?");
	}
	
	
	
}
