package com.bma.pageObject;

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

public class ModelpopupScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ModelpopupScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public ModelpopupScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/androidalert/NearestBanfield")
	@FindBy(id = "Nearest Banfield")
	public MobileElement _nearestBanfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/androidalert/okay")
	@FindBy(id = "Okay")
	public MobileElement _okay;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='androidalert/popup/heading']")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='No, I'm new']")
	public MobileElement _NoIamNewText;
	
	@AndroidFindBy(id = "androidalert/popup/text")
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Come in for an appointment at your nearest Banfield, and you’ll receive a ClientID upon checkout.']")
	public MobileElement _Comeinforappointment;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _whenandwhereheader;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	@FindBy(id = "Don’t Allow")
	public MobileElement _denyNativePopups;
}
