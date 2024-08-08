package com.bma.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.ViewWelcomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Highlights_VaccinationsSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(Highlights_VaccinationsSteps.class);

	@And("^they tap on the Vaccinations accordion to expand$")
	public void they_tap_on_the_Vaccinations_accordion_to_expand() {
		TapElement(PetCard._vaccinationAccordions);
		logger.info("they tap on the Vaccinations accordion to expand");
	}
	@Then("^they will be displayed with the following information$")
	public void they_will_be_displayed_with_the_following_information() throws Throwable {
		ScrolltoElement("Last date given");
		PetCard.VerifyVaccinecardUI();
		logger.info("they will be displayed with the following information");
	}

	@Then("^if the vaccine was never administered but added to the plan then the user will be displayed with the following:$")
	public void if_the_vaccine_was_never_administered_but_added_to_the_plan_then_the_user_will_be_displayed_with_the_following() throws Throwable {
		PetCard.Verify_vaccine_was_never_administered_but_addedUI();
		logger.info("if the vaccine was never administered but added to the plan then the user will be displayed with the following");
	}

	@Then("^the user taps on the accordion again to collapse it\\.$")
	public void the_user_taps_on_the_accordion_again_to_collapse_it() throws Throwable {
		Scroll("Vaccinations");
		//TapElement(PetCard._vaccinationAccordions);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._dentalExam.isDisplayed());
		logger.info("the user taps on the accordion again to collapse it");
	}

	@Given("^the vaccine accordion will not expand if there is nothing on file$")
	public void the_vaccine_accordion_will_not_expand_if_there_is_nothing_on_file() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField,"");
		EnterInput(Login._PasswordTextfield, "");
		Thread.sleep(2000);
		TapElement(Login._LoginButton);
		Assert.assertTrue(Home._HiUser_header.isDisplayed());
		Thread.sleep(6000);
		ScrolltoElement("Kojo");
		TapElement(Home._pet25);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the vaccine accordion will not expand if there is nothing on file");
	}
}
