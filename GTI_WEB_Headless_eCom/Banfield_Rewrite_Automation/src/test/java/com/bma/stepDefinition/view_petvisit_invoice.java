package com.bma.stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.Utilities;
import com.bma.pageObject.HomeScreen;
import com.bma.pageObject.InvoiceScreen;
import com.bma.pageObject.LegalStuffStepsScreen;
import com.bma.pageObject.PetCardScreen;
import com.bma.pageObject.PetDetailsScreen;
import com.bma.pageObject.VetChatScreen;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class view_petvisit_invoice extends Utilities {

	public HomeScreen Home = new HomeScreen(driver);
	public PetCardScreen PetCard = new PetCardScreen(driver);
	public PetDetailsScreen PetDetails = new PetDetailsScreen(driver);
	public VetChatScreen VetChat = new VetChatScreen(driver);
	public InvoiceScreen Invoice = new InvoiceScreen(driver);

	SoftAssert softassert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(view_petvisit_invoice.class);

	@When("^they tap on the invoice CTA from the documents section$")
	public void they_tap_on_the_invoice_CTA_from_the_documents_section() throws Throwable {
		TapElement(PetDetails._invoice);
		logger.info("they tap on the invoice CTA from the documents section");
	}

	@Then("^they are redirected to the Invoice screen$")
	public void they_are_redirected_to_the_Invoice_screen() throws Throwable {
		Thread.sleep(1000);
		Assert.assertTrue(Invoice._invoiceTitle.isDisplayed());
		Assert.assertTrue(Invoice._hospitaladdresstext.isDisplayed());
		logger.info("they are redirected to the Invoice screen");
	}

	@Then("^they are displayed with the invoice details for the pet with following$")
	public void they_are_displayed_with_the_invoice_details_for_the_pet_with_following() throws Throwable {
		Assert.assertTrue(Invoice._hospitaladdresstext.isDisplayed());
		Invoice.verifyinvoiceUI();
		logger.info("they are displayed with the invoice details for the pet with following");
	}

	@Then("^the user taps on the Share PDF CTA to download/share the invoice \\(as native to the device\\)\\.$")
	public void the_user_taps_on_the_Share_PDF_CTA_to_download_share_the_invoice_as_native_to_the_device() throws Throwable {
		TapElement(Invoice._sharepdfcta);
		Thread.sleep(9000);
		logger.info("the user taps on the Share PDF CTA to download/share the invoice ");
	}

	
}
