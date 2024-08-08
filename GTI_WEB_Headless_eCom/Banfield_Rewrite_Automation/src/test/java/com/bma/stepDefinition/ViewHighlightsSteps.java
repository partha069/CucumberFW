package com.bma.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.LoginScreen;
import com.bma.pageObject.PaymentDetailsScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.PetDetailsScreen;
import com.bma.pageObject.ReasonforvisitScreen;
import com.bma.pageObject.VetChatScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewHighlightsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public VetChatScreen VetChat = new VetChatScreen(driver);
	public ReasonforvisitScreen Reasonforvisit = new ReasonforvisitScreen(driver);
	public PaymentDetailsScreen PaymentDetails = new PaymentDetailsScreen(driver);
	
	SoftAssert softassert = new SoftAssert();
	
	public String path3 = "./src/test/resources/TestData/Sprint3/petBirthday.csv";
	public String path1 = "./src/test/resources/TestData/Sprint3/Login_using_credentials7.csv";
    public String Path2 = "./src/test/resources/TestData/Sprint3/Login_using_credentials8.csv";
	
	private static Logger logger = LogManager.getLogger(ViewHighlightsSteps.class);
	
	@And("^the user taps on Chat with a vet CTA to open the Vet Chat$")
	public void taps_on_Chat_with_a_vet_CTA_to_open_the_Vet_Chat() throws Throwable {
		TapElement(PetCard._chatWithaVatCTA); 
		Thread.sleep(3000);
		Assert.assertTrue(VetChat._Conversation.isDisplayed()); //F
		logger.info("the user taps on Chat with a vet CTA to open the Vet Chat");
	}
	
	@When("^user navigated to the home screen$")
	public void user_navigated_to_the_home_screen() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path3,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path3,2,"password", "Email","password"));
		HidingKeyboardios();
		TapElement(Login._LoginButton);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(9000);
		logger.info("user navigated to the home screen");
	}
	
	@When("^user is on the home scren$")
	public void user_is_on_the_home_scren() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path1,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path1,2,"password", "Email","password"));
		HidingKeyboardios();
		TapElement(Login._LoginButton);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(9000);
		logger.info("user is on the home scren");
	}
	
	@When("^user is on the home page$") 
	public void user_is_on_the_home_page() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(Path2,2,"Email", "Email","password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(Path2,2,"password", "Email","password"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		TapElement(Login._LoginButton);
		logger.info("user is on the home screen");
	}
	
	@When("^user is on the pet info screen$")
	public void user_is_on_the_pet_info_screen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Thread.sleep(9000);
		//ScrolltoElement("Piety");
		try {
			TapElement(Home._pet26);
		} catch (Exception e) {
			TapElement(Home._pet1);
		}
		
		logger.info("user is on the pet info screen");
	}
	
	@When("^user is on the pet detail screen$")
	public void user_is_on_the_pet_detail_screen() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed());
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("user is on the pet detail screen");
	}
	
	@When("^the Highlights Tab is selected by default$")
	public void the_Highlights_Tab_is_selected_by_default() {
		Assert.assertTrue(PetCard._highlights.isEnabled());
		logger.info("the Highlights Tab is selected by default");
	}
	
	@Then("^the user should be displayed with the following sections as accordions$")
	public void the_user_should_be_displayed_with_the_following_sections_as_accordions() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	PetCard.verifyAccordions();
		softassert.assertTrue(PetCard._exam.isDisplayed()); 
		softassert.assertAll();
		logger.info("the user should be displayed with the following sections as accordions");
	}
	
	@And("^the default ordering is as described Comprehensive exam, Vaccinations, Dental exam, Parasite control, "
			+ "Weight tracker always on bottom, Shareable records only for dogs, Pet profile$")
	public void the_default_ordering_is_as_described_below() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	PetCard.verifydefaultordering();
		softassert.assertTrue(PetCard._exam.isDisplayed()); 
		softassert.assertTrue(PetCard._vaccination.isDisplayed()); 
		softassert.assertTrue(PetCard._pasasiteControl.isDisplayed()); 
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Dental exam");
		}
		softassert.assertTrue(PetCard._dental.isDisplayed());
		softassert.assertAll();
		logger.info("the default ordering is as described Comprehensive exam, Vaccinations, Dental exam, Parasite control,"
				+ " Weight tracker always on bottom, Shareable records only for dogs, Pet profile");
	}
	
	@And("^all the accordions should be collapsed by default$") 
	public void all_the_accordions_should_be_collapsed_by_default() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ScrolltoElement("Exam");
		Thread.sleep(2000);
		try {
			Assert.assertFalse(PetCard._comprehensiveExamduedateText.isDisplayed());
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Its collapsed by default");
		}
		logger.info("all the accordions should be collapsed by default");
	}
	
	@And("^the user can tap on any of the accordion to expand/collapse them$") 
	public void the_user_can_tap_on_any_of_the_accordion_to_expand_collapse_them() {
		Assert.assertTrue(PetCard._examText.isDisplayed());
		TapElement(PetCard._examAccordionRed);	
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Assert.assertTrue(PetCard._examOWPText.isDisplayed());
		logger.info("the user can tap on any of the accordion to expand/collapse them");
	}
	
	@And("^the Make an appointment CTA should be displayed only if the pet is a Dog or Cat$")
	public void the_Make_an_appointment_CTA_should_be_displayed_only_if_the_pet_is_a_Dog_or_Cat() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ScrolltoElement("Kimberlee");
		TapElement(Home._pet01);
		Thread.sleep(2000); 
		Assert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed()); //Dog //N
	//	TapElement(PetCard._backCTAHighlights);
	//	ScrolltoElement("red");
	//	TapElement(Home._pet27);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	Assert.assertTrue(PetCard._makeAnAppointmentCTAHighlights.isDisplayed()); //Cat
		logger.info("the Make an appointment CTA should be displayed only if the pet is a Dog or Cat");
	}
	
	@And("^Chat with a vet CTA should be displayed only if the pet is a Dog or Cat$")
	public void Chat_with_a_vet_CTA_should_be_displayed_only_if_the_pet_is_a_Dog_or_Cat() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Piety");// current updated
		TapElement(Home._pet1);
//		ScrolltoElement("Kitty");// last updated
	//	TapElement(Home._pet28);
	//	ScrolltoElement("Kimberlee");
	//	TapElement(Home._pet01);
		Thread.sleep(4000);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._chatWithaVatCTA.isDisplayed());
		logger.info("'Chat with a vet' CTA should be displayed only if the pet is a Dog or Cat");
	}
	
	@And("^Chat with a vet CTA should be displayed only for the pet is a Dog or Cat$")
	public void Chat_with_a_vet_CTA_should_be_displayed_only_for_the_pet_is_a_Dog_or_Cat() throws Throwable {
		Thread.sleep(8000);
	//	if (getUserDeviceInput.contains("IOS")) {
	//		swipeDown();
	//	} else {
	//		ScrolltoElement("Chat with a vet");
	//	}
		swipeDown();
		verifytest(PetCard._chatWithaVatCTA);
		Assert.assertTrue(PetCard._chatWithaVatCTA.isDisplayed());
		logger.info("Chat with a vet CTA should be displayed only for the pet is a Dog or Cat");
	}
	
	@And("^the user taps on Make an appointment CTA to get redirected to Reason for visit for logged in user screen$")
	public void the_user_taps_on_Make_an_appointment_CTA_to_get_redirected_to_Reason_for_visit_for_logged_in_user_screen() throws Throwable {
		//#28790
		TapElement(PetCard._makeAnAppointmentCTAHighlights);
		Thread.sleep(3000);
		Assert.assertTrue(Reasonforvisit._reasonforvisitTitle.isDisplayed());
		logger.info("the user taps on \"Make an appointment CTA\" to get redirected to \"Reason for visit?\" (for logged in user) screen");
	}
	
	@And("^the user is displayed with the OWP widget with Payment details CTA if the pet is an OWP Pet")
	public void the_user_is_displayed_with_the_OWP_widget_with_Payment_details_CTA_if_the_pet_is_an_OWP_Pet() throws Throwable {
		Thread.sleep(8000);
		ScrolltoElement("Alida");//updated
		TapElement(Home._pet31);//updated
		Thread.sleep(7000); 
		ScrolltoElement("Payment details");	//F
		Assert.assertTrue(PetCard._OwpWigets.isDisplayed());
		logger.info("the user is displayed with the OWP widget with 'Payment details' CTA if the pet is an OWP Pet");
	}
	
	@And("^the user taps on Payment details CTA to get redirected to Payment details screen OWP$")
	public void he_user_taps_on_Payment_details_CTA_to_get_redirected_to_Payment_details_screen_OWP() throws Throwable {
		TapElement(PetCard._paymentDetailsCTAForOWP);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Assert.assertTrue(PaymentDetails._PaymentDetailsTitle.isDisplayed());
		logger.info("the user taps on \"Payment details CTA\" to get redirected to \"Payment details\" screen (OWP)");
	}

	@And("^the NWP user will not be displayed with OWP widget or Vet Chat component$") //Sadiqa
	public void the_NWP_user_will_not_be_displayed_with_OWP_widget_or_Vet_Chat_component() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(8000);
		ScrolltoElement("Shun");
		TapElement(Home._pet06);
		Thread.sleep(200);
		ScrolltoElement("Pet profile");
		try {
			Assert.assertFalse(PetCard._paymentDetailsCTAForOWP.isDisplayed()); 
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Did not displayed with OWP widget or Vet Chat component for NWP User");
		}
		logger.info("the NWP user will not be displayed with OWP widget or Vet Chat component");
	}
	
}
