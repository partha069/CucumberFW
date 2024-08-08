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

public class VetChatScreen extends Utilities {

	SoftAssert softassert = new SoftAssert();
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	private static Logger logger = LogManager.getLogger(VetChatScreen.class);

	public VetChatScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "MyPets/Highlights/title")
	public MobileElement _vetChatTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/home/petvisit/vetchat/header/left-btn")
	@FindBy(id = "home/petvisit/vetchat/header/left-btn")
	public MobileElement _backCTA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Conversation']")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Conversation']")
	public MobileElement _Conversation;


}
