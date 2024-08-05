package com.resuableMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.driverfactory.DriverManager;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CommonAction {
	public static Locale loc ;
	public static Properties props;
	public static WebDriver driver = null;

	public void findByClick(WebElement element) {

		if (element.isDisplayed() && element.isEnabled()) {
			WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(25));
			WebElement webelement = exwait.until(ExpectedConditions.visibilityOf(element));
			webelement.click();
		} else {
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(25));
			WebElement webelement = wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", webelement);
		}

	}

	public static void PseudoElement() {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("return window.getComputedStyle(document.querySelector('.wrap'),'::before')");
	}


	public static void ClickOnWebElement(WebElement element) {
		WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = exwait.until(ExpectedConditions.visibilityOf(element));
		webelement.click();

	}

	public static void visibilityListWait(List<WebElement> element) {
		try {
			WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
			exwait.until(ExpectedConditions.visibilityOfAllElements(element));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void inVisibilityWait(WebElement element) {
		try {
			WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
			exwait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void visibilityWait(WebElement element) {
		try {
			WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(25));
			exwait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void WaitForWebElement(WebElement element) {
		WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(25));
		exwait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void WaitForListWebElement(List<WebElement> element) {
		WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		exwait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

//	public static void highLighterMethod(WebElement element) {
//		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//	}

	public static void SendKeysOnWebElement(WebElement element, String Value) {
		WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = exwait.until(ExpectedConditions.visibilityOf(element));
		webelement.clear();
		webelement.sendKeys(Value);
	}

	public static void jsClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
				webelement);
		waitFor(2000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webelement, "");
		js.executeScript("arguments[0].click();", webelement);
	}

	public static void clickOn(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
				webelement);
		waitFor(2000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webelement, "");
		element.click();
	}

	public static void tapOn(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		waitFor(2000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webelement, "");
		element.click();
	}

	public static void waitFor(int sleepTime) {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void javascriptScroll(WebElement element) {
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');",
				element);
		waitFor(2000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void scrollByJavascript() { //At some point - How it works Section -Delete
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 2400);");
	}
	public static void scrollDownToNextSection() { //At some point - Point Matrix - Delete
		waitFor(200);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0, 900);");
	}
	public static void ScrollJavascriptLeft() { //R&D is Needed
		waitFor(2000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(-500, 0);");
	}

	public static void ScrollJavascriptRight() { //R&D is Needed
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(500, 0);");
		//	js.executeScript("window.scrollTo(0, document.body.javascriptScrollRight)");
	}

	public static void scrollingDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(100));
		wt.until(ExpectedConditions.visibilityOf(element));
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}

	public static void SendKeysEnter(WebElement element) {
		WebDriverWait exwait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		WebElement webelement = exwait.until(ExpectedConditions.visibilityOf(element));
		webelement.clear();
		webelement.sendKeys(Keys.ENTER);

	}

	public void pagescrollDown() throws IOException, Exception {
		for (int i = 0; i <= 1; i++) {
			waitFor(3000);
			javaScriptScrollToEnd();
		}
	}

	public static void scrollingup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(100));
		wt.until(ExpectedConditions.visibilityOf(element));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void javaScriptScrollToEnd() {
		waitFor(2000);
		((JavascriptExecutor) DriverManager.getDriver())
				.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void switchToTabs(String currentHandle) {

		Set<String> handles = DriverManager.getDriver().getWindowHandles();
		for (String str: handles){
			System.out.println("Page id -->" +str);
		}
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(currentHandle)) {
				DriverManager.getDriver().switchTo().window(actual);
			}
		}
	}
//	public String generateMobileNumber(){
//		loc = Locale.of("US");
//		Faker fake = new Faker(loc);
//        return fake.phoneNumber().cellPhone();
//	}
	public Long generateRandomNumber() {
		Random rand = new Random();
		Long randNumber = rand.nextLong();
		return randNumber;
	}
	public int generateRandomNumber1() {
		Random rand = new Random();
		int randNumber = rand.nextInt();
		return randNumber;
	}
	public boolean isElementPresent(WebElement e)

	{
		waitFor(2000);
		boolean flag = true;
		try {
			e.isDisplayed();
			flag = true;
		} catch (Exception a) {
			flag = false;
		}
		return flag;
	}

	public static void loadData() throws IOException {
		props = new Properties();
		String env = System.getenv("ENVIRONMENT");
		if (env == null) {
			env = System.getProperty("ENVIRONMENT");
		}
		if (env.equalsIgnoreCase("UAT")) {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/UAT.properties");
			props.load(ip);
		} else if (env.equalsIgnoreCase("QA1")) {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/QA1.properties");
			props.load(ip);
		} else if (env.equalsIgnoreCase("QA2")) {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/QA2.properties");
			props.load(ip);
		}
	}

	public static String getData(String data) throws IOException {
		loadData();
		data = props.getProperty(data);
		return data;
	}

	public String RandomStringGenerate() {
		return RandomStringUtils.randomAlphanumeric(3);
	}

	public static void swipeDown() {

		Dimension dimension = DriverManager.getDriver().manage().window().getSize();

		int scrollStart = (int) (dimension.getHeight() * 0.5);

		int scrollEnd = (int) (dimension.getHeight() * 0.2);

		new TouchAction((PerformsTouchActions) DriverManager.getDriver()).press(PointOption.point(0, scrollStart))

				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))

				.release().perform();

	}

	public static void swipeUp() {

		Dimension dimension = DriverManager.getDriver().manage().window().getSize();

		int scrollStart = (int) (dimension.getHeight() * 0.2);

		int scrollEnd = (int) (dimension.getHeight() * 0.5);

		new TouchAction((PerformsTouchActions) DriverManager.getDriver()).press(PointOption.point(0, scrollStart))

				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))

				.release().perform();

	}

	public static void takeScreenshot(WebDriver driver, String filename) throws IOException {
		waitFor(2000);
		File sc = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File(filename));
	}

	public void mouseOver(WebElement element) {
		visibilityWait(element);
		new Actions(DriverManager.getDriver()).moveToElement(element).build().perform();
	}

	public void mouseOver(java.util.List<WebElement> element, int index) {
		visibilityWait(element.get(index));
		new Actions(DriverManager.getDriver()).moveToElement(element.get(index)).build().perform();
	}
	public static boolean isClickable(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}



}

