package com.bma.stepDefinition;

import java.util.Set;
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
import com.bma.pageObject.VetChatScreen;
import com.bma.pageObject.ViewWelcomeScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Highlights_OWP_Pets_WidgetsSteps extends Utilities {

	public LegalStuffStepsScreen LegalStuffSteps = new LegalStuffStepsScreen(driver);
	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PaymentDetailsScreen PaymentDetails = new PaymentDetailsScreen(driver);
	public VetChatScreen VetChat = new VetChatScreen(driver);
	public ViewWelcomeScreen ViewWelcome = new ViewWelcomeScreen(driver);
	public LoginScreen Login = new LoginScreen(driver);
	
	public String path = "./src/test/resources/TestData/Sprint5/Login_using_credentials21.csv";

	private static Logger logger = LogManager.getLogger(Highlights_OWP_Pets_WidgetsSteps.class);
	
	@When("^the user is on Home Screen owp$")
	public void user_is_on_Home_Screen_owp() throws Throwable {
		ViewWelcome.TapOnSigninbutton();
		EnterInput(Login._EmailTextField, getcsvdata(path, 2, "Email", "Email", "password"));
		EnterInput(Login._PasswordTextfield, getcsvdata(path, 2, "password", "Email", "password"));
		Thread.sleep(5000);
		TapElement(Login._LoginButton);
		logger.info("When the user is on Home Screen owp");
	}

	@And("^the OWP pet user is on the pet detail screen$")
	public void the_OWP_pet_user_is_on_the_pet_detail_screen() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(6000);
		ScrolltoElement("Jisela");//updated
		TapElement(Home._pet14);
	//	ScrolltoElement("Dionte");
	//	TapElement(Home._pet07);
		Thread.sleep(3000);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the OWP pet user is on the pet detail screen");
	}
	
	@Then("^they should be displayed with the OWP Payments details widget below the Preventive Dashboard$")
	public void they_should_be_displayed_with_the_OWP_Payments_details_widget_below_the_Preventive_Dashboard() throws Throwable {
		Thread.sleep(6000);
		ScrolltoElement("Payment details");
		Assert.assertTrue(PetCard._paymentDetailsCTAForOWP.isDisplayed());
		logger.info("they should be displayed with the OWP Payments details widget below the Preventive Dashboard");
	}
	
	@And("^the user is displayed with Optimum Wellness Plans, Active$")
	public void the_user_is_displayed_with_Optimum_Wellness_Plans_Active() {
		Assert.assertTrue(PetCard._ActiveText.isDisplayed());
		Assert.assertTrue(PetCard._OwpText.isDisplayed());
		logger.info("the user is displayed with Optimum Wellness Plans, Active");
	}
	
	@And("^the OWP plan name will be dynamic Active Care Plus$")
	public void the_OWP_plan_name_will_be_dynamic_Active_Care_Plus() throws Throwable {
		Thread.sleep(7000);
	//	ScrolltoElement("Kimberlee");
	//	TapElement(Home._pet01);
	//	Thread.sleep(2000);
		ScrolltoElement("Payment details");
		Assert.assertTrue(PetCard._specialCareText.isDisplayed());
		logger.info("the OWP plan name will be dynamic Active Care Plus");
	}
	
	@And("^the user will be displayed with Payment details CTA$")
	public void the_user_will_be_displayed_with_Payment_details_CTA() {
		Assert.assertTrue(PetCard._paymentDetailsCTAForOWP.isDisplayed());
		logger.info("the user will be displayed with Payment details CTA");
	}
	
	@And("^the user will tap on Payment details CTA to get redirected to Payment details screen$")
	public void the_user_will_tap_on_Payment_details_CTA_to_get_redirected_to_Payment_details_screen() {
		TapElement(PetCard._paymentDetailsCTAForOWP);
		PaymentDetails.verifyPaymentdetailspage();
		verifytest(PaymentDetails._managePlanCTA);
		logger.info("the user will tap on Payment details CTA to get redirected to Payment details screen");
	}
	
	@And("^the VetChat widget is displayed with Text As an OWP member, "
			+ "you have access to veterinary advice for 24_7 peace of mind. Chat with a vet CTA$")
	public void the_VetChat_widget_is_displayed_with_Text() throws Throwable {
	//	TapElement(PaymentDetails._backCTA);
	//	TapElement(PetCard._backCTAHighlights);
	//	ScrolltoElement("Miki");
	//	TapElement(Home._pet001);
	//	Thread.sleep(4000);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._VetChatStaticText.isDisplayed());
		Assert.assertTrue(PetCard._ChatwithavetCTA.isDisplayed());
		logger.info("the VetChat widget is displayed with Text As an OWP "
				+ "member, you have access to veterinary advice for 24_7 peace of mind. Chat with a vet CTA");
	}
	
	@And("^the user will tap on Chat with a vet CTA to launch the Vet chat window HELPSHIFT SDK$")
	public void the_user_will_tap_on_Chat_with_a_vet_CTA_to_launch_the_Vet_chat_window_HELPSHIFT_SDK() {
		TapElement(PetCard._ChatwithavetCTA);
		Assert.assertTrue(VetChat._Conversation.isDisplayed());
		logger.info("the user will tap on Chat with a vet CTA to launch the Vet chat window HELPSHIFT SDK");
	}
	
	@And("^the pet with an OWP plan will always see an OWP widget and Vet Chat widget$")
	public void the_pet_with_an_OWP_plan_will_always_see_an_OWP_widget_and_Vet_Chat_widget() throws Throwable {
	//	TapElement(VetChat._backCTA);
	//	TapElement(PetCard._backCTAHighlights);
	//	Thread.sleep(1000);
	//	ScrolltoElement("Kimberlee");
	//	TapElement(Home._pet01);
		ScrolltoElement("Active");
		Assert.assertTrue(PetCard._OwpWigets.isDisplayed());
		Thread.sleep(5000);
		ScrolltoElement("Chat with a vet");
		Assert.assertTrue(PetCard._VetChatWigets.isDisplayed());
		logger.info("the pet with an OWP plan will always see an OWP widget and Vet Chat widget");
	}

	
}
