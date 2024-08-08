package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HavewemetScreen;
import com.bma.pageObject.LetsgetstartedSteps;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.remote.HideKeyboardStrategy;


public class MakeAnAppointmentStep2EntercontactInformationSteps extends Utilities {

	public HavewemetScreen havewemet = new HavewemetScreen(driver);
	public LetsgetstartedSteps letsgetstarted =  new LetsgetstartedSteps(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	SoftAssert softassert = new SoftAssert();
	public String path = "./src/test/resources/TestData/Sprint1/makeappointmentasguest-step2.csv";
	private static Logger logger = LogManager.getLogger(MakeAnAppointmentStep2EntercontactInformationSteps.class);


	@When("^the user tapped on No, I am New option from the Have we met Screen$")
	public void the_user_tapped_on_No_I_am_New_option_from_the_Have_we_met_Screen() throws Throwable {
		TapElement(havewemet._noIHaveButton);
		Thread.sleep(2000);
	//	Assert.assertTrue(letsgetstarted._staticText.isDisplayed());
	//	Assert.assertTrue(WhatSpeciesIsYourPet._staticText.isDisplayed());
		logger.info("the user tapped on No, I am New option from the Have we met Screen");
	}

	@Then("^they are displayed with the Contact Information screen$")
	public void they_are_displayed_with_the_Contact_Information_screen() {
		letsgetstarted.verifyUIElementsofContInfo();
		logger.info("they are displayed with the Contact Information screen");
	}

	@And("^the user should be displayed with the Contact information form$")
	public void the_user_should_be_displayed_with_the_Contact_information_form() throws Throwable {
		Assert.assertTrue(letsgetstarted._letsgetstartedTitle.isDisplayed());
	}
	
	@And("^the user should enter all the fields as they are Mandatory$")
	public void the_user_should_enter_all_the_fields_as_they_are_Mandatory() throws Throwable {
		letsgetstarted.Entervaliddatain_letsgetstartedpage();
		TapElement(letsgetstarted._nextButton);
		Thread.sleep(3000);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatsspeciestitle.isDisplayed());
		verifytest(WhatSpeciesIsYourPet._whatsspeciestitle);
	}
	
	@And("^the user cannot type more than 20 characters in the First name field$")
	public void the_user_cannot_type_more_than_20_characters_in_the_First_name_field() throws Throwable {
		String input = getcsvdata(path,2,"firstname", "firstname","lastname","phone","email");
		 EnterInput(letsgetstarted._firstName,getcsvdata(path,2,"firstname", "firstname" , "lastname","phone","email"));
		 Thread.sleep(3000);
		 Assert.assertNotSame(input,letsgetstarted._firstName.getText());
	}
	
	@And("^the user cannot type any special characters, numbers or spaces in the First name field$")
	public void the_user_cannot_type_any_special_characters_numbers_or_spaces_in_the_First_name_field() throws Throwable {
		EnterInput(letsgetstarted._firstName, "@276 37");
		Assert.assertNotSame("@276 37",letsgetstarted._firstName.getText());
	}

	@And("^the user cannot type more than 30 characters in the Last name field$")
	public void the_user_cannot_type_more_than_30_characters_in_the_Last_name_field() throws Throwable {
		String expected = getcsvdata(path,2,"lastname", "firstname","lastname","phone","email");
		EnterInput(letsgetstarted._lastName,getcsvdata(path,2,"lastname", "firstname","lastname","phone","email"));
		Assert.assertNotSame(expected,letsgetstarted._lastName.getText());
	}
	
	@And("^the user cannot type special characters, numbers or spaces in the Last name field$")
	public void the_user_cannot_type_special_characters_numbers_or_spaces_in_the_Last_name_field() throws Throwable {
		EnterInput(letsgetstarted._lastName, "@276 37");
		Assert.assertNotSame("@276 37",letsgetstarted._lastName.getText());
	}
	
	@And("^the user cannot type more than 10 digits in the Phone number field$")
	public void the_user_cannot_type_more_than_10_digits_in_the_Phone_number_field() throws Throwable {
		EnterInput(letsgetstarted._phone, "98989898989");
		Assert.assertNotSame("98989898989",letsgetstarted._phone.getText());
	}
	
	@And("^the user is displayed with the numeric keypad while entering Phone number$")
	public void the_user_is_displayed_with_the_numeric_keypad_while_entering_Phone_number() throws Throwable {
		EnterInput(letsgetstarted._phone, "989898989");	
	}
	
	@And("^I should see Invalid Phone Number$")
	public void I_should_see_Invalid_Phone_Number() throws Throwable {
		Thread.sleep(4000);
		HidingKeyboardios();
		Assert.assertTrue(letsgetstarted._invalidphonenumber.isDisplayed());	
		Assert.assertEquals("Invalid Phone Number",letsgetstarted._invalidphonenumber.getText());
	}

	@And("^the user cannot type more than 320 characters in the email field$")
	public void the_user_cannot_type_more_than_320_characters_in_the_email_field() throws Throwable {
		String input= getcsvdata(path,2,"email", "firstname","lastname","phone","email");
		EnterInput(letsgetstarted._email,input);
		Assert.assertNotSame(input,letsgetstarted._email.getText());
	}
	
	@And("^the user can type an email only in a valid email format$")
	public void the_user_can_type_an_email_only_in_a_valid_email_format() throws Throwable {
	//	letsgetstarted._email.click();
	//	Thread.sleep(3000);
		EnterInput(letsgetstarted._email, "test@test.co");
		Thread.sleep(4000);
		Assert.assertEquals("test@test.co",letsgetstarted._email.getText());
	}
	
	@And("^the user is displayed with error message on entering a wrong email format$")
	public void the_user_is_displayed_with_error_message_on_entering_a_wrong_email_format() throws Throwable {
		EnterInput(letsgetstarted._email, "testtest.co");
		HidingKeyboard();
		letsgetstarted.taponinvalidemail();
		Assert.assertTrue(letsgetstarted._invalidemail.isDisplayed());	
	}
	
	@And("^I should see Please enter a valid email address$")
	public void I_should_see_Please_ente_a_valid_email_address() throws Throwable {
		System.out.println(letsgetstarted._invalidemail.getText()+"===");
		Assert.assertEquals("Please enter a valid email address",letsgetstarted._invalidemail.getText() );
	}
	
	@And("^the Next button is enabled after entering all the mandatory fields$")
	public void the_Next_button_is_enabled_after_entering_all_the_mandatory_fields() throws Throwable {
		letsgetstarted.Entervaliddatain_letsgetstartedpage();
		TapElement(letsgetstarted._lastName);
		HidingKeyboard();
		Assert.assertTrue(letsgetstarted._nextButton.isEnabled());
	}
	
	@And("^the user taps on Next button to go to the What species is your pet Screen$")
	public void the_user_taps_on_Next_button_to_go_to_the_Tell_us_about_your_pet_Screen() throws Throwable {
		TapElement(letsgetstarted._nextButton);
		Thread.sleep(3000);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatSpeciesTitle.isDisplayed());
		verifytest(WhatSpeciesIsYourPet._whatSpeciesTitle);
	}
	
	@And("^the user taps on X at the top to go back to Have we met Screen$")
	public void the_user_taps_on_X_at_the_top_to_go_back_to_Have_we_met_Screen() throws Throwable {
		TapElement(letsgetstarted._cancelCTA);
		Thread.sleep(3000);
		Assert.assertTrue(havewemet._havewemettitle.isDisplayed());
		verifytest(havewemet._havewemettitle);
	}

}
