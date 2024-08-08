package com.bma.stepDefinition;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.ProfileScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Remember_Me extends Utilities {
	SoftAssert softassert= new SoftAssert();
	public ProfileScreen Profile = new ProfileScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	 public String path = "./src/test/resources/TestData/Sprint3/Login_using_credentials.csv";


	@When("^the user click on Remember me check box$")
	public void the_user_click_on_Remember_me_check_box() throws Throwable {
		Assert.assertTrue(Login._RememberMECheckbox.isDisplayed());
		 EnterInput(Login._EmailTextField, getcsvdata(path,2,"Email", "Email","password"));
			EnterInput(Login._PasswordTextfield, getcsvdata(path,2,"password", "Email","password"));
			Thread.sleep(5000);
		TapElement(Login._RememberMECheckbox);
	}

	@Then("^the Remember me check box should he highlighted$")
	public void the_Remember_me_check_box_should_he_highlighted() throws Throwable {
		System.out.println(Login._RememberMeCTA.isEnabled());
	}

	@When("^the user successfully logs in$")
	public void the_user_successfully_logs_in() throws Throwable {
		TapElement(Login._LoginButton);
	}

	@Then("^the next time the come to the login page$")
	public void the_next_time_the_come_to_the_login_page() throws Throwable {
		Profile.Logout();
		Login.VerifyLoginUI();
		TapElement(Login._Eyepassword);
	}

	@Then("^the checkbox must be pre-selected with email/username and password will be pre-filled\\.$")
	public void the_checkbox_must_be_pre_selected_with_email_username_and_password_will_be_pre_filled() throws Throwable {
		Assert.assertTrue(Login._RememberMECheckbox.isEnabled());
		Assert.assertEquals(Login._EmailTextField.getText(),getcsvdata(path,2,"Email", "Email","password"));
		//Assert.assertEquals(Login._PasswordTextfield.getText(),getcsvdata(path,2,"password", "Email","password"));
	}

	
}