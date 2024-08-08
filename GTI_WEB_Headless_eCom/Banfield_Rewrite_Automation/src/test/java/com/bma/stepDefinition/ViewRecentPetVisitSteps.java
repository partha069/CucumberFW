package com.bma.stepDefinition;


import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.InvoiceScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.PetDetailsScreen;
import com.bma.pageObject.VetChatScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewRecentPetVisitSteps extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PetDetailsScreen PetDetails = new PetDetailsScreen(driver);
	public VetChatScreen VetChat = new VetChatScreen(driver);
	public InvoiceScreen Invoice = new InvoiceScreen(driver);

	private static Logger logger = LogManager.getLogger(ViewRecentPetVisitSteps.class);
	
	@And("^The user wants to tap on VetChat CTA$")
	public void The_user_wants_to_tap_on_VetChat_CTA() throws Throwable {
		TapElement(PetDetails._vetChat);
		Thread.sleep(3000);
		Assert.assertTrue(VetChat._Conversation.isDisplayed());
		verifytest(VetChat._Conversation);
		logger.info("The user wants to tap on VetChat CTA");
	}

	@When("^the user taps on Visit details CTA Clock icon and tap on the visit card from Timeline$")
	public void the_user_taps_on_Visit_details_CTA_Clock_icon_and_tap_on_the_visit_card_from_Timeline() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		if (getUserDeviceInput.contains("IOS")) {
			
		} else {
			ScrolltoElement("Piety");
		}
		
		TapElement(Home._clockIcon);
		Thread.sleep(2000);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user taps on Visit details CTA (Clock icon) and tap on the visit card from Timeline");
	}
	
	@When("^User wants to navigate to Pet visit$")
	public void User_wants_to_navigate_to_Pet_visit() throws Throwable {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	 // ScrolltoElement("Piety");
		TapElement(Home._clockIcon);
		logger.info("User wants to navigate to Pet visit");
	}
	
	@Then("^the user should be redirected to Pet name visit screen$")
	public void the_user_should_be_redirected_to_Pet_name_visit_screen() throws Throwable {
		TapElement(PetDetails._backCTA);
		TapElement(Home._pet1);
		TapElement(PetCard._timeline);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Thread.sleep(600);
		Assert.assertTrue(PetCard._dateFromatt.isDisplayed());
		TapElement(PetCard._ArrowCTA);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user should be redirected to '<Pet name>ï¿½s visit' screen");
	}
	
	@Then("^the user should be redirected to Pet name visit page$")
	public void the_user_should_be_redirected_to_Pet_name_visit_page() throws Throwable {
		TapElement(PetDetails._backCTA);
		TapElement(Home._pet1);
		TapElement(PetCard._timeline);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(600);
	//	ScrolltoElement("June 6, 2005");
		swipeDown();
		TapElement(PetCard._ArrowCTA2);
		Thread.sleep(2000);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user should be redirected to '<Pet name>ï¿½s visit' page");
	}
	
	@Then("^user should be redirected to Pet name visit page$")
	public void user_should_be_redirected_to_Pet_name_visit_page() throws Throwable {
		Thread.sleep(8000);
	    //ScrolltoElement("Piety");
		TapElement(Home._pet1);
		Thread.sleep(600);
		TapElement(PetCard._timeline);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//ScrolltoElement("June 6, 2005");
		swipeDown();
		TapElement(PetCard._ArrowCTA2);
		Thread.sleep(2000);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("user should be redirected to '<Pet name>ï¿½s visit' page");
	}
	
	@And("^the user will be displayed with the Visit Details Date and Time and Location$")
	public void the_user_will_be_displayed_with_the_Visit_Details_Date_and_Time_and_Location() {
		Assert.assertTrue(PetDetails._dateAndTimeText.isDisplayed());
		Assert.assertTrue(PetDetails._dateAndTime.isDisplayed());
		logger.info("the user will be displayed with the Visit Details Date and Time and Location");
	}
	
	@And("^the user will be displayed with Concerns section with the Vet Chat Available 247 CTA Call Hospital CTA$")
	public void the_user_will_be_displayed_with_Concerns_section_with_the_Vet_Chat_Available_24_7_CTA_Call_Hospital_CTA() {
		ScrolltoElement("Vet Chat�");
		PetDetails.verifyConcern();
		logger.info("the user will be displayed with 'Concerns?' section with the Vet Chatï¿½  Available 24/7 CTA | Call Hospital CTA |");
	}
	
	@And("^the user will tap on Vet Chat Available 247 CTA to launch the vet chat$")
	public void the_user_will_tap_on_Vet_Chat_Available_24_7_CTA_to_launch_the_vet_chat() throws Throwable {
		Assert.assertTrue(PetDetails._vetChatText.isDisplayed());
		TapElement(PetDetails._vetChat);
		Thread.sleep(1000);
		Assert.assertTrue(VetChat._Conversation.isDisplayed());
		logger.info("the user will tap on Vet Chatï¿½ Available 24/7 CTA to launch the vet chat");
	}
	
	@And("^the user wants to verify Vet Chat Available 24_7$")
	public void the_user_wants_to_verify_Vet_Chat_Available_247() throws Throwable {
		ScrolltoElement("Available 24/7");
		Assert.assertTrue(PetDetails._Available24_7Text.isDisplayed());
		Assert.assertTrue(PetDetails._vetChatText.isDisplayed());
		logger.info("the user will tap on Vet Chatï¿½ Available 24/7 CTA to launch the vet chat");
	}
	
	@And("^the user will tap on Call Hospital CTA to open devices default dialer with hospital number prefilled$")
	public void the_user_will_tap_on_Call_Hospital_CTA_to_open_devices_default_dialer_with_hospital_number_pre_filled() {
	//	TapElement(VetChat._backCTA);
		Assert.assertTrue(PetDetails._callHospital.isDisplayed());
		verifytest(PetDetails._callHospital);
		TapElement(PetDetails._callHospital);
		logger.info("the user will tap on Call Hospital CTA to open deviceï¿½s default dialer with hospital number pre-filled");
	}
	
	@And("^the NWP user_exotic pets owner on tapping Vet Chat Available 24_7 CTA will be displayed a native pop-up$")
	public void the_NWP_user_exotic_pets_owner_on_tapping_Vet_Chat_Available_24_7_CTA_will_be_displayed_a_native_pop_up() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Want to help?");
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		ScrolltoElement("Kimberlee");
		TapElement(Home._clockIcon1);
	//	Thread.sleep(800);
	//	Assert.assertTrue(PetCard._Name.isDisplayed()); 
	//	TapElement(PetCard._timeline);
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//	TapElement(PetCard._ArrowCTA);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		ScrolltoElement("Call hospital");
		TapElement(PetDetails._vetChat);
		Assert.assertTrue(PetDetails._nativePopupsForCheckEligibilityText.isDisplayed());
		Assert.assertTrue(PetDetails._okayCTA.isDisplayed());
		logger.info("the NWP user/exotic pets owner on tapping Vet Chatï¿½ Available 24/7 CTA will be displayed a native pop-up");
	}
	
	@And("^the user will tap on Okay CTA to close pop-up$")
	public void the_user_will_tap_on_Okay_CTA_to_close_pop_up() {
		TapElement(PetDetails._okayCTA);
		Assert.assertTrue(PetDetails._petDetailsTitle.isDisplayed());
		logger.info("the user will tap on Okay CTA to close pop-up");
	}
	
	@And("^the user will be displayed with Documents section with the Invoice CTA$")
	public void the_user_will_be_displayed_with_Documents_section_with_the_Invoice_CTA() throws Throwable {
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		Thread.sleep(1000);
		ScrolltoElement("Invoice");
		Assert.assertTrue(PetDetails._invoice.isDisplayed());
		logger.info("the user will be displayed with 'Documents' section with the Invoice CTA ");
	}
	
	//#28087 
	@And("^the user will tap on Invoice CTA to be redirected to Invoice screen$")
	public void the_user_will_tap_on_Invoice_CTA_to_be_redirected_to_Invoice_screen() throws Throwable {
		TapElement(PetDetails._invoice);
		Thread.sleep(800);
		Assert.assertTrue(Invoice._invoiceTitle.isDisplayed());//Fail
		logger.info("the user will tap on Invoice CTA to be redirected to Invoice screen");
	}
	
	@And("^the user will be displayed with Medical Details section with the Medicine, Vaccines, Labs$")
	public void the_user_will_be_displayed_with_Medical_Details_section_with_the_Medicine_Vaccines_Labs() {
		TapElement(Invoice._backCTA);
		ScrolltoElement("Labs");
		PetDetails.verifyMedicalDetails();
		verifytest(PetDetails._Medicine);
		logger.info("the user will be displayed with 'Medical Details' section with the Medicine, Vaccines, Labs");
	}
	
	@And("^the user will be displayed with No medications if they did not have any medicines administered$")
	public void the_user_will_be_displayed_with_No_medications_if_the_did_not_have_any_medicines_administered() throws Throwable {
		Thread.sleep(8000);
	//	ScrolltoElement("Want to help?");
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		ScrolltoElement("Miki");
		TapElement(Home._pet1);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		TapElement(PetCard._timeline);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		TapElement(PetCard._ArrowCTA);
		Thread.sleep(3000);
		Assert.assertTrue(PetDetails._ConcernTitleText.isDisplayed());
	//	ScrolltoElement("Medical details");
		ScrolltoElement("Labs");
		Assert.assertTrue(PetDetails._NoMedications.isDisplayed());
		logger.info("the user will be displayed with \"No medications\" if they did not have any medicines administered");
	}
	
	@And("^the user will be displayed with Medicine name if administered$")
	public void the_user_will_be_displayed_with_Medicine_name_if_administered() throws Throwable {
	//	ScrolltoElement("Medical details");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
			swipeDown();
		} else {
			ScrolltoElement("Medicine");
		}
		Assert.assertTrue(PetDetails._MedicineName.isDisplayed());
		logger.info("the user will be displayed with 'Medicine name' if administered");
	}
	
	@And("^the user will be displayed with No vaccines if they did not have any vaccines administered$")
	public void the_user_will_be_displayed_with_No_vaccines_if_they_did_not_have_any_vaccines_administered() {
	//	ScrolltoElement("Vaccines");
		Assert.assertTrue(PetDetails._NoVaccines.isDisplayed());
		logger.info("the user will be displayed with \"No vaccines\" if they did not have any vaccines administered");
	}
	
	@And("^the user will be displayed with  Name of vaccine if administered$")
	public void the_user_will_be_displayed_with_Name_of_vaccine_if_administered() {
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Vaccines");
		}
	    
	//  ScrolltoElement("Labs");
		PetDetails.verifyVaccines();
		logger.info("the user will be displayed with  'Name of vaccine' if administered");
	}
	
	@And("^the user will be displayed with No labs if they do not have any labs$")
	public void the_user_will_be_displayed_with_No_labs_if_they_do_not_have_any_labs() {
		ScrolltoElement("Labs");
		Assert.assertTrue(PetDetails._NoLabs.isDisplayed());
		logger.info("the user will be displayed with \"No labs\" if they do not have any labs");
	}
	
	@And("^the user will be displayed with Name of the Test Lab Result Details Lab Range Above below comes from api if administered.$")
	public void the_user_will_be_displayed_with_Name_of_the_Test_Lab_Result_Details_Lab_Range_Above_below_comes_from_api_if_administered() throws Throwable {
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		if (getUserDeviceInput.contains("IOS")) {
			swipeDown();
		} else {
			ScrolltoElement("Labs");
		}
		verifytest(PetDetails._petDetailsTitle);
		PetDetails.verifylabsResult();
		logger.info("the user will be displayed with  | Name of the Test | Lab Result Details| Lab Range(Above, below - comes from api) if administered.");
	}
	
	@And("^the user will tap on < button to go back to previous screen$")
	public void the_user_will_tap_on_back_button_to_go_back_to_previous_screen() throws Throwable {
		TapElement(PetDetails._backCTA);
		Thread.sleep(2000);
		Assert.assertTrue(PetCard._Name.isDisplayed());
		logger.info("the user will tap on < button to go back to previous screen");
	}
}
