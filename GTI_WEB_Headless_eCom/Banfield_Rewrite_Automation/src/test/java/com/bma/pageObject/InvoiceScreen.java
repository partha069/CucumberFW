package com.bma.pageObject;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.bma.Utilities.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class InvoiceScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(InvoiceScreen.class);

	public InvoiceScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _invoiceTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/header/left-btn")
	@FindBy(id = "home/petvisit/invoice/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/header/right-btn")
	@FindBy(id = "home/petvisit/invoice/header/right-btn")
	public MobileElement _closeCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/date-txt")
	@FindBy(id = "home/petvisit/invoice/date-txt")
	public MobileElement _dateandtimecta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/petname-txt")
	@FindBy(id = "home/petvisit/invoice/petname-txt")
	public MobileElement _invoic_for_petname_text;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/hospital-address-txt")
	@FindBy(id = "home/petvisit/invoice/hospital-address-txt")
	public MobileElement _hospitaladdresstext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/location-txt")
	@FindBy(id = "home/petvisit/invoice/location-txt")
	public MobileElement _locationtext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/downloadpdf-lbl")
	@FindBy(id = "home/petvisit/invoice/downloadpdf-lbl")
	public MobileElement _sharepdfcta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/invoice/hospital-name-txt")
	@FindBy(id = "home/petvisit/invoice/hospital-name-txt")
	public MobileElement _hospitalnametext;
	

	public void verifyinvoiceUI() {
		softassert.assertTrue(_hospitalnametext.isDisplayed());
		softassert.assertTrue(_sharepdfcta.isDisplayed());
		softassert.assertTrue(_locationtext.isDisplayed());
		softassert.assertTrue(_hospitaladdresstext.isDisplayed());
		softassert.assertTrue(_invoic_for_petname_text.isDisplayed());
		softassert.assertTrue(_dateandtimecta.isDisplayed());
		softassert.assertTrue(_closeCTA.isDisplayed());
		softassert.assertTrue(_backCTA.isDisplayed());
		softassert.assertTrue(_invoiceTitle.isDisplayed());
		softassert.assertAll();
	}

}
