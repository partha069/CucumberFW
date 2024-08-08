package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.bma.Utilities.*;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import com.bma.stepDefinition.AboutMarsSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ChatScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public ChatScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/*
	 * Live Chat
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _ChatTitle;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/livechat/icon-img")
	@FindBy(id = "Chat/livechat/icon-img")
	public MobileElement _LiveChatLogo;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/livechat/title-txt")
	@FindBy(id = "Chat/livechat/title-txt")
	public MobileElement _LiveChatText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/livechat-txt")
	@FindBy(id = "Chat/livechat-txt")
	public MobileElement _LiveChatStaticText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/livechat/action-btn")
	@FindBy(id = "Chat/livechat/action-btn")
	public MobileElement _LiveChatCTA;
	
	/*
	 * Vet Chat
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/OWP/vetchat/icon-img")
	@FindBy(id = "Chat/OWP/vetchat/icon-img")
	public MobileElement _VetChatLogo;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/OWP/vetchat/title-txt")
	@FindBy(id = "Chat/OWP/vetchat/title-txt")
	public MobileElement _VetChatText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/OWP/vetchatmessage-txt")
	@FindBy(id = "Chat/OWP/vetchatmessage-txt")
	public MobileElement _VetChatStaticText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/OWP/vetchat/action-btn")
	@FindBy(id = "Chat/OWP/vetchat/action-btn")
	public MobileElement _VetChatCTA;
	

	
	
	/*
	 * Vet Chat Go
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/vetchatgo/icon-img")
	@FindBy(id = "Chat/vetchatgo/icon-img")
	public MobileElement _VetChatGoLogo;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/vetchatgo/title-txt")
	@FindBy(id = "Chat/vetchatgo/title-txt")
	public MobileElement _VetChatGoText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/vetchat/vetchatgo-txt")
	@FindBy(id = "Chat/vetchat/vetchatgo-txt")
	public MobileElement _VetChatGoStaticText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/vetchatgo/action-btn")
	@FindBy(id = "Chat/vetchatgo/action-btn")
	public MobileElement _VetChatGoCTA; 
	
	/*
	 * Need to Visit
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/needhelp/icon-img")
	@FindBy(id = "Chat/needhelp/icon-img")
	public MobileElement _NeedtoVisitLogo;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/needhelp/title-txt")
	@FindBy(id = "Chat/needhelp/title-txt")
	public MobileElement _NeedtoVisitText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/needtovisit/message-txt")
	@FindBy(id = "Chat/needtovisit/message-txt")
	public MobileElement _NeedtoVisitStaticText;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/needhelp/action-btn")
	@FindBy(id = "Chat/needhelp/action-btn")
	public MobileElement _MakeaAppointmentCTA;
	
	/*
	 * OWP
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/NWP/nochat/icon-img")
	@FindBy(id = "Chat/NWP/nochat/icon-img")
	public MobileElement _OWPLogo;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/NWP/nochat/title-txt")
	@FindBy(id = "Chat/NWP/nochat/title-txt")
	public MobileElement _OwpText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/NWP/message-txt")
	@FindBy(id = "Chat/NWP/message-txt")
	public MobileElement _OwpStaticText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/vetchatgo/action-btn")
	@FindBy(id = "Chat/vetchatgo/action-btn")
	public MobileElement _ChatwithavetCta;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/VetChat/title-txt")
	@FindBy(id = "Chat/VetChat/title-txt")
	public MobileElement _whichpettochatstatictext;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/NWP/nochat/action-btn")
	@FindBy(id = "Chat/NWP/nochat/action-btn")
	public MobileElement _StartEnrollmentNowCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Chat/VetChat/petlistview/pet0")
	@FindBy(id = "Chat/VetChat/petlistview/pet0")
	public MobileElement _vetchatpet1;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Conversation']")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Conversation']")
	public MobileElement _Conversation;
	
	/*
	 * Verify Owp
	 */
	public void verifyOWP() {
		softassert.assertTrue(_OwpText.isDisplayed());
		softassert.assertTrue(_OwpStaticText.isDisplayed());
		softassert.assertTrue(_StartEnrollmentNowCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
	/*
	 * Need to Visit
	 */
	public void verifyNeedtoVisit() {
		ScrolltoElement("Make an appointment");
		softassert.assertTrue(_NeedtoVisitText.isDisplayed());
		softassert.assertTrue(_NeedtoVisitStaticText.isDisplayed());
		softassert.assertTrue(_MakeaAppointmentCTA.isDisplayed());
		softassert.assertAll();
	}
	
	/* 
	 * Verify Vet Chat UI
	 */
	public void verifyVetChat() {
		softassert.assertTrue(_VetChatText.isDisplayed());
		softassert.assertTrue(_VetChatStaticText.isDisplayed());
		softassert.assertTrue(_VetChatCTA.isDisplayed());
		softassert.assertAll();
	}
	
	/* 
	 * Verify VetChatGo UI
	 */
	public void verifyVetChatGo() {
		softassert.assertTrue(_VetChatGoText.isDisplayed());  
		softassert.assertTrue(_VetChatGoStaticText.isDisplayed());
		softassert.assertTrue(_VetChatGoCTA.isDisplayed());
		softassert.assertAll();
	}
	
	
	/* 
	 * Verify UI
	 */
	public void verifyLiveChat() {
		softassert.assertTrue(_LiveChatText.isDisplayed());
		softassert.assertTrue(_LiveChatStaticText.isDisplayed());
		softassert.assertTrue(_LiveChatCTA.isDisplayed());
		softassert.assertAll();
	}
	
	public void chatwithvetforvetchat() {
		TapElement(_VetChatCTA);
		Assert.assertTrue(_whichpettochatstatictext.isDisplayed());
		TapElement(_vetchatpet1);
		Assert.assertTrue(_Conversation.isDisplayed());
	}
	
	public void chatwithvetforvetchatgo() {
		TapElement(_ChatwithavetCta);
		Assert.assertTrue(_whichpettochatstatictext.isDisplayed());
		TapElement(_vetchatpet1);
		Assert.assertTrue(_Conversation.isDisplayed());
	}
	
	

	}
