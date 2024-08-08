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

public class PaymentDetailsScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(PaymentDetailsScreen.class);

	public PaymentDetailsScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _PaymentDetailsTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/title-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/title-txt")
	public MobileElement _yourPaymentInfo;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/renewal-date-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/renewal-date-txt")
	public MobileElement _renewaldate;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/renewal-status-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/renewal-status-txt")
	public MobileElement _renewalStatus;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/next-payment-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/next-payment-txt")
	public MobileElement _nextPayment;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/last-payment-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/last-payment-txt")
	public MobileElement _lastPayment;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/amount-of-last-payment-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/amount-of-last-payment-txt")
	public MobileElement _amountofLastPayment;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/preferred-payment-day-txt")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/preferred-payment-day-txt")
	public MobileElement _preferredPaymentDay;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/Highlights/PaymentDetails/action-btn")
	@FindBy(id = "MyPets/Highlights/PaymentDetails/action-btn")
	public MobileElement _managePlanCTA;
	
	/*
	 * Page Navigation
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/MyPets/PaymentDetails/header/left-btn")
	@FindBy(id = "MyPets/PaymentDetails/header/left-btn")
	public MobileElement _backCTA;
	
	/*
	 * Verify UI
	 */
	public void verifyPaymentdetailspage() {
		softassert.assertTrue(_yourPaymentInfo.isDisplayed());
		softassert.assertTrue(_renewalStatus.isDisplayed());
		softassert.assertTrue(_lastPayment.isDisplayed());
		softassert.assertTrue(_amountofLastPayment.isDisplayed());
		softassert.assertTrue(_preferredPaymentDay.isDisplayed());
		softassert.assertTrue(_PaymentDetailsTitle.isDisplayed());
		softassert.assertTrue(_managePlanCTA.isDisplayed());
		softassert.assertAll();
		
	}
	

}
