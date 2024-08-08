package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginCredentials;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.TellusaboutyourpetPage;
import com.bma.pageObject.ViewWelcomeScreen;
import com.bma.pageObject.WhatSpeciesIsYourPetScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddaPet_Step2_TellusAboutYourPetSteps extends Utilities {

	SoftAssert softassert = new SoftAssert();
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public WhatSpeciesIsYourPetScreen WhatSpeciesIsYourPet = new WhatSpeciesIsYourPetScreen(driver);
	public TellusaboutyourpetPage Tellusaboutyourpet = new TellusaboutyourpetPage(driver);
	public LoginCredentials LoginUser = new LoginCredentials(driver);
	
	
	public String path1 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet1.csv";
	public String path2 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet2.csv";
	public String path3 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet3.csv";
	public String path4 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet4.csv";
	public String path5 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet5.csv";
	public String path6 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet6.csv";
	public String path7 = "./src/test/resources/TestData/Sprint3/AddaPet_Step2_TellusAboutYourPet7.csv";

	private static Logger logger = LogManager.getLogger(AddaPet_Step2_TellusAboutYourPetSteps.class);

	@When("^the user is on What species is your pet screen$")
	public void the_user_is_on_What_species_is_your_pet_screen() throws Throwable{
		Thread.sleep(1000);
		TapElement(Home._AddaNewPetCTA);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatSpeciesTitle.isDisplayed());
		logger.info("the user is on What species is your pet screen");
	}
	
	@When("^the user click on Next CTA$")
	public void the_user_clicks_on_Next_CTA() throws Throwable{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		WaitElementToBeClickable(WhatSpeciesIsYourPet._CatSpecies);
		TapElement(WhatSpeciesIsYourPet._CatSpecies);
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		logger.info("the user clicks on �Next� CTA");
	}
	
	@Then("^the user will be redirected to Tell us about your pet screen$")
	public void the_user_will_be_redirected_to_Tell_us_about_your_pet_screen() throws Throwable{
		Thread.sleep(2000);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user will be redirected to �Tell us about your pet� screen");
	}
	
	@And("^the avatar should have the text Name, Age, Gender, Breed$")
	public void the_avatar_should_have_the_text_Name_Age_Gender_Breed() throws Throwable{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Tellusaboutyourpet.verifyPetText();
		logger.info("the avatar should have the text Name, Age, Gender, Breed");
	}
	
	@And("^the user should be able to enter the following in the form Enter your Pets name,Enter pet birthdate,Enter pet weightlbs,Enter pet color$")
	public void the_user_should_be_able_to_enter_the_in_the_form() throws Throwable{
		String Name = getcsvdata(path7,2,"Name", "Name");
		EnterInput(Tellusaboutyourpet._enterYourPetsName, Name);
		Thread.sleep(1000);
		TapElement(Tellusaboutyourpet._ageText);
		TapElement(Tellusaboutyourpet._calendericon);
		TapElement(Tellusaboutyourpet._ConfirmCTA);
		EnterInput(Tellusaboutyourpet._petWeight, "22");
		TapElement(Tellusaboutyourpet._ageText);
		ScrolltoElement("All fields are mandatory*");
		EnterInput(Tellusaboutyourpet._petColor, "Black");
		TapElement(Tellusaboutyourpet._ageText);
		HidingKeyboardios();
		logger.info("the user should be able to enter the following in the form Enter your Pets name,Enter pet birthdate,Enter pet weightlbs,Enter pet color");
	}
	
	@And("^all the fields are Mandatory$")
	public void all_the_fields_are_Mandatory() throws Throwable{
		Thread.sleep(3000);
		Assert.assertTrue(Tellusaboutyourpet._NextCTATellUsAboutYourPet.isEnabled());
		logger.info("all the fields are Mandatory");
	}
	
	@And("^the user cannot type more than 30 characters in the Enter your pets name field$")
	public void the_user_cannot_type_more_than_30_characters_in_the_Enter_your_pets_name_field() throws Throwable{
	    String expected = getcsvdata(path1,2,"petname", "petname");
	    TapElement(Tellusaboutyourpet._enterYourPetsName);
	    EnterInput(Tellusaboutyourpet._enterYourPetsName,getcsvdata(path1,2,"petname", "petname"));
	    Assert.assertNotSame(expected,Tellusaboutyourpet._enterYourPetsName.getText());
		logger.info("the user cannot type more than 30 characters in the Enter your pet�s name field");
	}
	
	@And("^the user can only enter alphabets and numbers in the Enter your pets name field$")
	public void the_user_can_only_enter_alphabets_and_numbers_in_the_Enter_your_pets_name_field() throws Throwable{
	    String expected = getcsvdata(path2,2,"petname", "petname");
	    EnterInput(Tellusaboutyourpet._enterYourPetsName,getcsvdata(path2,2,"petname", "petname"));
	    Assert.assertEquals(expected,Tellusaboutyourpet._enterYourPetsName.getText());
		logger.info("the user can only enter alphabets and numbers in the Enter your pets name field");
	}
	
	@And("^the user cannot type any special characters in the Enter your pets name field$")
	public void the_user_cannot_type_any_special_characters_in_the_Enter_your_pets_name_field() throws Throwable{
		String expected = getcsvdata(path3,2,"petname", "petname");
	    EnterInput(Tellusaboutyourpet._enterYourPetsName,getcsvdata(path3,2,"petname", "petname"));
	    Assert.assertNotSame(expected,Tellusaboutyourpet._enterYourPetsName.getText());
	    HidingKeyboard();
		logger.info("the user cannot type any special characters in the Enter your pet�s name field");
	}
	
	@And("^the user is displayed with error message on leaving the field empty Error Message Please enter your pets name$")
	public void the_user_is_displayed_with_error_message_on_leaving_the_field_empty_Error_Message(){
		String PetErrorMsg ="Please enter your pet's name";
		EnterInput(Tellusaboutyourpet._enterYourPetsName, " ");
		HidingKeyboard();
		TapElement(Tellusaboutyourpet._petWeight);
		HidingKeyboard();
	    Assert.assertEquals(PetErrorMsg,Tellusaboutyourpet._enterYourPetsNameErrorMsg.getText());
		logger.info("the user is displayed with error message on leaving the field empty Error Message Please enter your pet�s name");
	}
	
	@And("^the user is displayed with the date picker while entering Birthdate$")
	public void the_user_is_displayed_with_the_date_picker_while_entering_Birthdate() throws Throwable{
		TapElement(Tellusaboutyourpet._BackCTATellUsAboutYourPetCTA);
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(400);
		TapElement(Tellusaboutyourpet._calendericon);
		logger.info("the user is displayed with the date picker while entering Birthdate");
	}
	
	@And("^the user is displayed with error message on leaving the birthdate field empty Error Message Please enter date of birth$")
	public void the_user_is_displayed_with_error_message_on_leaving_the_birthdate_field_empty_Error_Message() throws Throwable{
		if (getUserDeviceInput.equalsIgnoreCase("IOS")) {
		System.out.println("error msg For birthday");
		}else {
		String CalenderErrormsg = "Please enter date of birth";
		Thread.sleep(850);
//		TapElement(Tellusaboutyourpet._calenderText);
		TapElement(Tellusaboutyourpet._CancelCTA);
		TapElement(Tellusaboutyourpet._CancelCTA);
		Thread.sleep(2000);
		Assert.assertEquals(CalenderErrormsg,Tellusaboutyourpet._enterPetBirthdayError.getText());
		}
		logger.info("the user is displayed with error message on leaving the birthdate field empty Error Message Please enter date of birth");
	}
	
	@And("^the user can type maximum of 4 digits in the weight field$")
	public void the_user_can_type_maximum_of_4_digits_in_the_weight_field() throws Throwable{
		 String expected = getcsvdata(path4,2,"weight", "weight");
		 EnterInput(Tellusaboutyourpet._petWeight,getcsvdata(path4,2,"weight", "weight"));
		 Assert.assertNotSame(expected,Tellusaboutyourpet._petWeight.getText());
		logger.info("the user can type maximum of 4 digits in the weight field");
	}
	
	@And("^the user cannot type any Special Characters except period '.' in the weight field$")
	public void the_user_cannot_type_any_Special_Characters_except_period_in_the_weight_field() throws Throwable{
		String weighterror = getcsvdata(path5,2,"weightError1", "weightError1","weightError2");
		EnterInput(Tellusaboutyourpet._petWeight, getcsvdata(path5,2,"weightError1", "weightError1","weightError2"));
		Assert.assertEquals(weighterror,Tellusaboutyourpet._petWeight.getText());
		logger.info("the user cannot type any Special Characters except period '.' in the weight field");
	}
	
	@And("^the user cannot type more than one '.'$")
	public void the_user_cannot_type_more_than_one() throws Throwable{
		String lasterror = "The field weight must be a number";
	//	String weighterror = getcsvdata(path5,2,"weightError2", "weightError1","weightError2");
		EnterInput(Tellusaboutyourpet._petWeight, getcsvdata(path5,2,"weightError2", "weightError1","weightError2"));
		TapElement(Tellusaboutyourpet._petWeight);
		TapElement(Tellusaboutyourpet._enterYourPetsName);
		HidingKeyboard();
		ScrolltoElement("All fields are mandatory*");
		Assert.assertSame(lasterror,Tellusaboutyourpet._petWeightError.getText());
		logger.info("the user cannot type more than one '.'");
	}
	
	@And("^the decimal can be used as the first entry but not the last.$")
	public void the_decimal_can_be_used_as_the_first_entry_but_not_the_last() throws Throwable{
		String lasterror = "The field weight must be a number";
		String entry = getcsvdata(path6,2,"first", "first","second");
		EnterInput(Tellusaboutyourpet._petWeight, getcsvdata(path6,2,"first", "first","second"));
		HidingKeyboard();
		TapElement(Tellusaboutyourpet._enterYourPetsName);
		HidingKeyboard();
		Assert.assertEquals(entry,Tellusaboutyourpet._petWeight.getText());
		EnterInput(Tellusaboutyourpet._petWeight, getcsvdata(path6,2,"second", "first","second"));
		HidingKeyboard();
		Scroll("All fields are mandatory*");
		TapElement(Tellusaboutyourpet._petColor);
		TapElement(Tellusaboutyourpet._petWeight);
		TapElement(Tellusaboutyourpet._enterYourPetsName);
		HidingKeyboard();
		Assert.assertEquals(lasterror,Tellusaboutyourpet._petWeightError.getText());
		logger.info("the decimal can be used as the first entry but not the last.");
	}
	
	@And("^the user enters only a decimal or tries to add a decimal as the last entry show an inline error message: The field weight must be a number$")
	public void the_user_enters_only_a_decimal_or_tries_to_add_a_decimal_as_the_last_entry_show_an_inline_error_message(){
		String lasterror = "The field weight must be a number";
		Assert.assertEquals(lasterror,Tellusaboutyourpet._petWeightError.getText());
		logger.info("the user enters only a decimal or tries to add a decimal as the last entry show an inline error message: The field weight must be a number");
	}
	
	@And("^the user attempts to add two decimals in succession show an inline error message: The field weight must be a number$")
	public void the_user_attempts_to_add_two_decimals_in_succession_show_an_inline_error_message(){
		String decimalsInput = "The field weight must be a number";
		EnterInput(Tellusaboutyourpet._petWeight, "..");
		Assert.assertEquals(decimalsInput,Tellusaboutyourpet._petWeightError.getText());
		logger.info("the user attempts to add two decimals in succession show an inline error message: The field weight must be a number");
	}
	
	@And("^the user is displayed with error message on leaving the weight field empty Error Message Please enter weight$")
	public void the_user_is_displayed_with_error_message_on_leaving_the_weight_field_empty_Error_Message(){
		String emptyerror = "Please enter weight";
		EnterInput(Tellusaboutyourpet._petWeight, " ");
		Assert.assertEquals(emptyerror,Tellusaboutyourpet._petWeightError.getText());
		logger.info("the user is displayed with error message on leaving the weight field empty Error Message Please enter weight");
	}
	
	@And("^the user cannot type numbers and special characters in the color field$")
	public void the_user_cannot_type_numbers_and_special_characters_in_the_color_field() throws Throwable{
		String expected = getcsvdata(path3,2,"petname", "petname");
		ScrolltoElement("All fields are mandatory*");
	    EnterInput(Tellusaboutyourpet._petColor,getcsvdata(path3,2,"petname", "petname"));
	    Assert.assertNotSame(expected,Tellusaboutyourpet._petColor.getText());
		logger.info("the user cannot type numbers and special characters in the color field");
	}
	
	@And("^the user cannot type more than 20 characters  in the color field$")
	public void the_user_cannot_type_more_than_20_characters_in_the_color_field() throws Throwable{
		 String expected = getcsvdata(path1,2,"petname", "petname");
		 EnterInput(Tellusaboutyourpet._petColor,getcsvdata(path1,2,"petname", "petname"));
		 Assert.assertNotSame(expected,Tellusaboutyourpet._petColor.getText());
		logger.info("the user cannot type more than 20 characters  in the color field");
	}
	
	@And("^the user is displayed with error message on leaving the color field empty Error Message Please enter color of your pet$")
	public void the_user_is_displayed_with_error_message_on_leaving_the_color_field_empty_Error_Message() throws Throwable{
	    TapElement(Tellusaboutyourpet._BackCTATellUsAboutYourPetCTA);
	    TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(800);
		Scroll("All fields are mandatory*");
		TapElement(Tellusaboutyourpet._petColor);
		TapElement(Tellusaboutyourpet._enterYourPetsName);
		HidingKeyboard();
		TapElement(Tellusaboutyourpet._petColor);
		HidingKeyboard();
		String colorErrormsg = "Please enter color of your pet";
		Assert.assertEquals(colorErrormsg,Tellusaboutyourpet._petColorerror.getText());
		
		logger.info("the user is displayed with error message on leaving the color field empty Error Message Please enter color of your pet");
	}
	
	@And("^Next button is enabled after entering all the mandatory fields$")
	public void the_Next_button_is_enabled_after_entering_all_the_mandatory_fields() throws Throwable {
		String Name = getcsvdata(path7,2,"Name", "Name");
		TapElement(Tellusaboutyourpet._BackCTATellUsAboutYourPetCTA);
		TapElement(WhatSpeciesIsYourPet._nextCTA);
		Thread.sleep(1000);
		EnterInput(Tellusaboutyourpet._enterYourPetsName, Name);
		TapElement(Tellusaboutyourpet._ageText);
		TapElement(Tellusaboutyourpet._calendericon);
		TapElement(Tellusaboutyourpet._ConfirmCTA);
		EnterInput(Tellusaboutyourpet._petWeight, "12.2");
		Scroll("All fields are mandatory*");
		TapElement(Tellusaboutyourpet._allmandatoryfields);
		EnterInput(Tellusaboutyourpet._petColor, "Black");
		TapElement(Tellusaboutyourpet._allmandatoryfields);
		HidingKeyboardios();
	  Assert.assertTrue(Tellusaboutyourpet._NextCTATellUsAboutYourPet.isDisplayed());
	}
	
	@And("^the user taps on Next button to go to the Tell us about your pet Screen$")
	public void the_user_taps_on_Next_button_to_go_to_the_Tell_us_about_your_pet_Screen(){
		TapElement(Tellusaboutyourpet._NextCTATellUsAboutYourPet);
		Assert.assertTrue(Tellusaboutyourpet._tellusaboutyourpetTitle.isDisplayed());
		logger.info("the user taps on Next button to go to the Tell us about your pet Screen");
	}
	
	@And("^the user taps on < at the top to go back to What species is your pet screen$")
	public void the_user_taps_on_back_at_the_top_to_go_back_to_What_species_is_your_pet_screen(){
		TapElement(Tellusaboutyourpet._BackCTATellUsAboutYourPetCTA);
		Assert.assertTrue(WhatSpeciesIsYourPet._whatsspeciestitle.isDisplayed());
		logger.info("the user taps on < at the top to go back to �What species is your pet?� screen");
	}
	
	@And("^the user taps on X at the top to go back to Home Screen$")
	public void the_user_taps_on_close_at_the_top_to_go_back_to_Home_Screen() throws Throwable{
	//	TapElement(WhatSpeciesIsYourPet._nextCTA);
		TapElement(Tellusaboutyourpet._CloseTellUsAboutYourPetCTA);
		Thread.sleep(1000);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		logger.info("the user taps on X at the top to go back to Home Screen");
	}
}
