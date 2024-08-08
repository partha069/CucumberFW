package com.bma.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class FilterScreen extends Utilities {

	private static Logger logger = LogManager.getLogger(ViewWelcomeScreen.class);

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	public FilterScreen(RemoteWebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * Filter Page Element
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/filter/findtext")
	@FindBy(id = "schedule/filter/findtext")
	public MobileElement _FilterTitletext;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/screen/header/title")
	@FindBy(id = "screen/header/title")
	public MobileElement _FilterTitle;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/filter/apply")
	@FindBy(id = "schedule/whenandwhere/filter/apply")
	public MobileElement _ApplyCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/filter/search")
	@FindBy(id = "schedule/filter/search")
	public MobileElement _SearchCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/filter/search")
	@FindBy(id = "findnearby/searchbtn")
	public MobileElement _findneearbySearchCTA;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/Filter/clear")
	@FindBy(id = "Filter/clear")
	public MobileElement _FiltercancelCTA;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id = "permission_allow_foreground_only_button")
	public MobileElement _FilterOne;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	@FindBy(id = "schedule/whenandwhere/filter/header/lefteee")
	public MobileElement _Filterdeny;
	
	/*
	 * Page Navigation Bar
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/filter/header/left")
	@FindBy(id = "schedule/whenandwhere/filter/header/left")
	public MobileElement _backCTA;

	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/whenandwhere/filter/header/right")
	@FindBy(id = "schedule/whenandwhere/filter/header/right")
	public MobileElement _cancelCTA;
	
	/*
	 * Hospital Garfield
	 */
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/filter/search/0")
	@FindBy(id = "schedule/filter/search/0")
	public MobileElement _hospitalGarfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearby/searchbtn/0")
	@FindBy(name = "findnearby/searchbtn/0")
	public MobileElement _findnearbyhospitalGarfield;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/schedule/filter/search/0/name")
	@FindBy(id = "schedule/filter/search/0/name")
	public MobileElement _dropdownText;
	
	@AndroidFindBy(id = "com.banfield.react.bpht:id/findnearby/searchbtn/0")
	@FindBy(id = "findnearby/searchbtn/0")
	public MobileElement _hospital1;
	/* 
	 * Verify UI
	 */
	public void verifyFilterPage() {
		softassert.assertTrue(_backCTA.isDisplayed());
		softassert.assertTrue(_backCTA.isDisplayed()); 
		softassert.assertTrue(_FilterTitletext.isDisplayed());
		softassert.assertTrue(_FilterTitle.isDisplayed());
		softassert.assertTrue(_SearchCTA.isDisplayed());
		softassert.assertTrue(_ApplyCTA.isDisplayed());
		softassert.assertAll();
	}
	

	
	
	
	}
