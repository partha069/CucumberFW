package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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

public class SignUpForMyBanfieldScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(SignUpForMyBanfieldScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public SignUpForMyBanfieldScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(name = "screen/header/title")
	public MobileElement _SignUpForMyBanfieldHeader;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/clientid")
	@FindBy(id = "createaccount/singupforbanfield/clientid")
	public MobileElement _ClientIdtestfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/clientidtitle")
	@FindBy(id = "createaccount/singupforbanfield/clientidtitle")
	public MobileElement _UseyourBanfieldClientIDtogetstartedText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/clientiddesc")
	@FindBy(id = "createaccount/singupforbanfield/clientiddesc")
	public MobileElement _YourIdisOnTheTopText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/next")
	@FindBy(id = "createaccount/signupbanfield/next")
	public MobileElement _NextCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/emailidtitle")
	@FindBy(id = "createaccount/singupforbanfield/emailidtitle")
	public MobileElement _CantfindyourClientIDText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/emailiddesc")
	@FindBy(id = "createaccount/singupforbanfield/emailiddesc")
	public MobileElement _HelpwithclientIdHyperlinkText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/email")
	@FindBy(id = "createaccount/singupforbanfield/email")
	public MobileElement _EnterEmailTextfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/sendmyclientid/next")
	@FindBy(id = "createaccount/signupbanfield/sendmyclientid/next")
	public MobileElement _SendMyClientIdCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/needmoreinfo")
	@FindBy(id = "createaccount/signupbanfield/needmoreinfo")
	public MobileElement _NeedMoreInfoCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/singupforbanfield/email/error")
	@FindBy(id = "createaccount/singupforbanfield/email/error")
	public MobileElement _InvalidEmailText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/header/left")
	@FindBy(id = "createaccount/signupbanfield/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/createaccount/signupbanfield/header/right")
	@FindBy(id = "createaccount/signupbanfield/header/right")
	public MobileElement _cancelCTA;
	
	public void taponSendMyClientIdCTA() {
		try {
			swipeDown();
			swipeDown();
		//	ScrolltoElement("Need more information?");
		//	TapElement(_SendMyClientIdCTA);
			logger.info("User Tapped on SendMyClientId CTA");
		}
		catch(Exception e) {
			logger.info("User Failed to Tap on SendMyClientId CTA");	
		}
	}
	
	public void EnterClientID() throws Throwable {
		try {
			final String path = "./src/test/resources/TestData/Sprint2/CreateAccount_ClientID.csv"; //PAM0BX6
			String ClientId =  getcsvdata(path,2,"ClientId","ClientId");
			EnterInput(_ClientIdtestfield,ClientId);
		//	TapElement(_NextCTA);
		//	TapElement(_NextCTA);
			TapElement(_NextCTA);
			Thread.sleep(5000);
			logger.info("User Tapped on NextCTA after entering Client ID");
		}
		catch(Exception e) {
			logger.info("User Failed to Tap on NextCTA after entering Client ID");	
		}
	}
	
	public void EnterValidNewClientID() throws Throwable { //GAF05CH - Specific to this story 26908)
		try {
			final String path1 = "./src/test/resources/TestData/Sprint2/NewAndValidClientID.csv"; //GAF05CH
			String ClientId =  getcsvdata(path1,2,"ClientId","ClientId");
			EnterInput(_ClientIdtestfield,ClientId);
			TapElement(_NextCTA);
			TapElement(_NextCTA);
			TapElement(_NextCTA);
			Thread.sleep(8000);
			logger.info("User Tapped on NextCTA after entering Client ID");
		}
		catch(Exception e) {
			logger.info("User Failed to Tap on NextCTA after entering Client ID");	
		}
	}
	
	public void EnterCorrectClientID() throws Throwable {
		try {
			final String path = "./src/test/resources/TestData/Sprint8/CreateAccountStep2EnterClientID.csv";
			String ClientId =  getcsvdata(path,2,"ClientId","ClientId");
			EnterInput(_ClientIdtestfield,ClientId);
			TapElement(_NextCTA);
			Thread.sleep(5000);
			logger.info("User Tapped on NextCTA after entering Client ID");
		}
		catch(Exception e) {
			logger.info("User Failed to Tap on NextCTA after entering Client ID");	
		}
	}
	
	public void VerifyCreateAccountEnterclientIDUI() {
		try {
			softassert.assertTrue(_ClientIdtestfield.isDisplayed());
			softassert.assertTrue(_UseyourBanfieldClientIDtogetstartedText.isDisplayed());
			softassert.assertTrue(_SignUpForMyBanfieldHeader.isDisplayed());
			softassert.assertTrue(_NextCTA.isDisplayed());
			Assert.assertEquals("Client ID Ex: BNF123B",_ClientIdtestfield.getText());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 4");	
		}
	}
	
	public void VerifyCreateAccountRetrieveclientIDUI() {
		try {
			taponSendMyClientIdCTA();
			softassert.assertTrue(_CantfindyourClientIDText.isDisplayed());
			softassert.assertTrue(_EnterEmailTextfield.isDisplayed());
			softassert.assertTrue(_HelpwithclientIdHyperlinkText.isDisplayed());
			softassert.assertTrue(_SendMyClientIdCTA.isDisplayed());
			softassert.assertAll();
		}
	catch(Exception e) {
		logger.info("User Failed to verify the Ui elements of Create Account Step 4");	
		}
	}
}
