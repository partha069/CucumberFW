package com.bma.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;

import com.bma.pageObject.WhenAndWhereScreen;
//import com.driverfactory.DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class Utilities implements IAutoConstant {
	
	public static Properties property;
	public static String getAppPackageInput;
	static String getAppActivityInput;
	public static String getDeviceNameInput;
	public static String getAutomationNameInput;
	public static String getPlatformNameInput;
	public static int elementWaitInSeconds = 10;
	public static WebDriverWait wait;
	public static String getUserDeviceInput;
	public static RemoteWebDriver driver;
	public static String getIosHosts;
	static DesiredCapabilities caps;
	static URL url;
	static File app;
	static String apkpath;
	static SimpleDateFormat simpleformat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss");
	public static String getbrowserstackuserid;
	public static String getbrowserstackacesskey;
	public static String getbrowserstackappid_android;
	public static String getbrowserstackappid_ios;
	public static String getbrowserstackandroid_device;
	public static String getbrowserstackandroid_osversion;
	public static String getbrowserstackios_device;
	public static String getbrowserstackios_osversion;
	public static String iosDeviceName;
	public static String buildnameName;
	
	private static Logger logger = LogManager.getLogger(Utilities.class);

	public static void initiateApp(Scenario scenario) throws Exception {
		String parameter = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("device");
		property = loadProperty(IOS_PATH);
		getUserDeviceInput = property.getProperty("USERINPUT");
		String getDeviceNameInput = property.getProperty("DEVICENAME");
		getAutomationNameInput = property.getProperty("AUTOMATIONNAMEINPUT");
		getPlatformNameInput = property.getProperty("PLATFORMNAMEINPUT");
		getAppPackageInput = property.getProperty("APPPACKAGE");
		getAppActivityInput = property.getProperty("APPACTIVTY");
		getIosHosts = property.getProperty("IOSHOST");
		String iosHost = property.getProperty("getIosHosts");
		getbrowserstackuserid = property.getProperty("BROWSERSTACKUSERID");
		getbrowserstackacesskey = property.getProperty("BROWSERSTACKACESSKEY");
		getbrowserstackappid_android = property.getProperty("BROWSWESTACKAPPID-Android");
		getbrowserstackappid_ios = property.getProperty("BROWSWESTACKAPPID-Ios");
		getbrowserstackandroid_device = property.getProperty("BROWSERSTACKANDROIDDEVICE");
		getbrowserstackandroid_osversion = property.getProperty("BROWSERSTACKANDROID_OSVERSION");
		getbrowserstackios_device = property.getProperty("BROWSERSTACKIOSDEVICE");
		getbrowserstackios_osversion = property.getProperty("BROWSERSTACKIOS_OSVERSION");
		iosDeviceName=property.getProperty("IOSDEVICENAME");
		buildnameName=property.getProperty("BROWSERSTACK_BUILD_NAME");
		caps = new DesiredCapabilities();
	
		/*
		 * UnComment It while running through "Pipeline" only.
		 
		getUserDeviceInput = System.getProperty("USERINPUT");
		getbrowserstackuserid = System.getProperty("BROWSERSTACKUSERID");
		getbrowserstackacesskey = System.getProperty("BROWSERSTACKACESSKEY");
		getbrowserstackappid_android = System.getProperty("BROWSWESTACKAPPID-Android");
     	getbrowserstackappid_ios = System.getProperty("BROWSWESTACKAPPID-Ios");
		getbrowserstackandroid_device = System.getProperty("BROWSERSTACKANDROIDDEVICE");
     	getbrowserstackandroid_osversion = System.getProperty("BROWSERSTACKANDROID_OSVERSION");
		getbrowserstackios_device = System.getProperty("BROWSERSTACKIOSDEVICE");
    	getbrowserstackios_osversion = System.getProperty("BROWSERSTACKIOS_OSVERSION");
		buildnameName=System.getProperty("BROWSERSTACK_BUILD_NAME");
		String directory = System.getProperty("user.dir");
		*/
		try {
			if (getUserDeviceInput.equalsIgnoreCase("Android")) {
				//	apkpath = property.getProperty("ANDROIDAPKPATH");
				//	app = new File(directory + "//" + apkpath + "//" + "app-release" + ".apk");
				//  caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\kumar_p\\Downloads\\app-release (3).apk");
				//  caps.setCapability(MobileCapabilityType.APP, "./app-release.apk");
					caps.setCapability("deviceName", getDeviceNameInput);
					caps.setCapability("AUTOMATION_NAME", getAutomationNameInput);
					caps.setCapability("appPackage", getAppPackageInput);
					caps.setCapability("platformName", getPlatformNameInput);
					caps.setCapability("appActivity", getAppActivityInput);
					caps.setCapability("noReset", false);
					url =new URL("http://0.0.0.0:4723/wd/hub");
				    driver = new AppiumDriver<MobileElement>(url, caps);
				}
				else if (getUserDeviceInput.equalsIgnoreCase("Android2")) {
					caps.setCapability("deviceName", getDeviceNameInput);
					caps.setCapability("AUTOMATION_NAME", getAutomationNameInput);
					caps.setCapability("appPackage", getAppPackageInput);
					caps.setCapability("platformName", getPlatformNameInput);
					caps.setCapability("appActivity", getAppActivityInput);
					caps.setCapability("noReset", false);
					url =new URL("http://0.0.0.0:4724/wd/hub");
					driver = new AppiumDriver<MobileElement>(url, caps);
				}
			else if (getUserDeviceInput.equalsIgnoreCase("browserstack-ANDROID")) {
				System.out.println("BrowserStack Android Capabilities Loaded");
				caps.setCapability("browserstack.user", getbrowserstackuserid);
				caps.setCapability("browserstack.key", getbrowserstackacesskey);
				caps.setCapability("app", getbrowserstackappid_android);
				caps.setCapability("browserstack.gpsLocation", "40.88065578410196, -74.1122517103768");
				caps.setCapability("device", getbrowserstackandroid_device);
				caps.setCapability("os_version",getbrowserstackandroid_osversion );
				caps.setCapability("build",buildnameName);
				caps.setCapability("name",scenario.getName() );
				caps.setCapability("project", "Banfield Rewrite Mobile App");
				caps.setCapability("noReset", false);
				caps.setCapability("browserstack.debug", true);
				caps.setCapability("interactiveDebugging", true);
				caps.setCapability("browserstack.debug", "true");
				driver = new AndroidDriver<MobileElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
			}
				 else if (getUserDeviceInput.equalsIgnoreCase("browserstack-IOS")) {
			      System.out.println("BrowserStack iOS Capabilities Loaded");	
			      caps.setCapability("browserstack.user", getbrowserstackuserid);
			      caps.setCapability("browserstack.key", getbrowserstackacesskey);
			      caps.setCapability("app", getbrowserstackappid_ios );		      
			      caps.setCapability("device", getbrowserstackios_device);
			      caps.setCapability("os_version",getbrowserstackios_osversion); 
			      caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.banfield.react.bpht");
			      caps.setCapability("browserstack.gpsLocation", "40.88065578410196, -74.1122517103768");
			      caps.setCapability("project", "Banfield Rewrite Mobile");
			      caps.setCapability("real_mobile", "true");
			      caps.setCapability("build", buildnameName);
			      caps.setCapability("name",scenario.getName());
			      caps.setCapability("browserstack.debug", "true");
			      caps.setCapability("browserstack.local", "false");// to enable visual logs
			      caps.setCapability("browserstack.networkLogs", "true");
			      caps.setCapability("noReset", false);
			      driver = new IOSDriver<IOSElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
			}
				 else if (getUserDeviceInput.equalsIgnoreCase("IOS")) {					
					 caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
					 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
					 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
					 caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.banfield.react.bpht");
					 caps.setCapability("noReset", false);
				  // caps.setCapability("browserstack.gpsLocation", "40.88065578410196, -74.1122517103768, 0");
					 caps.setCapability("locationServicesEnabled", true);
					 caps.setCapability("locationServicesAuthorized", true);
					 caps.setCapability("autoAcceptAlerts", "true");
					 caps.setCapability("autoDissmissAlerts", "true"); 
					 caps.setCapability("simplelsVisibleCheck", true);
	     		     caps.setCapability(MobileCapabilityType.UDID,"89837A76-C7CA-49F0-B640-7CEBB4E5A887"); 
					 caps.setCapability(MobileCapabilityType.APP, "/Users/parthadey/Library/Developer/Xcode/DerivedData/Banfield-hbugquvyrpuvxnbsjzznomawlvja/Build/Products/Debug-iphoneos/Banfield.app");
					 url =new URL("http://0.0.0.0:4723/wd/hub");
						driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				 }
				 else if (getUserDeviceInput.equalsIgnoreCase("browserstack-parallel")) {	
					    JSONParser parser = new JSONParser();
					    JSONObject config = (JSONObject) parser.parse(new FileReader("./parallel.json"));
					    JSONArray envs = (JSONArray) config.get("environments");
					    DesiredCapabilities capabilities = new DesiredCapabilities();
					     String a = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceIndex");
					    Map<String, String> envCapabilities = (Map<String, String>) envs.get(Integer.parseInt(a));
					    Iterator it = envCapabilities.entrySet().iterator();
					    while (it.hasNext()) {
					      Map.Entry pair = (Map.Entry)it.next();
					      capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
					    }
					    
					    Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
					    it = commonCapabilities.entrySet().iterator();
					    while (it.hasNext()) {
					      Map.Entry pair = (Map.Entry)it.next();
					      if(capabilities.getCapability(pair.getKey().toString()) == null){
					    	  capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
					      }
					    }

					    String username = System.getenv("BROWSERSTACK_USERNAME");
					    if(username == null) {
					      username = (String) config.get("user");
					    }

					    String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
					    if(accessKey == null) {
					      accessKey = (String) config.get("access_key");
					    }
					    
					    String app = System.getenv("BROWSERSTACK_APP_ID");
					    if(app != null && !app.isEmpty()) {
					    	capabilities.setCapability("app", app);
					    }
					    capabilities.setCapability("name",scenario.getName() );
					    capabilities.setCapability("build",buildnameName );
					    System.out.println(username + accessKey);
					    System.out.println(app);
					    capabilities.setCapability("browserstack.debug", true);
					    capabilities.setCapability( "project", "Banfield_mobile_rewrite");
					    driver = new AppiumDriver<MobileElement>(new URL("http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub"), capabilities);
					    
				 }else if(getUserDeviceInput.equalsIgnoreCase("IOSReal")){
					 caps.setCapability("platformName","iOS"); 
					 caps.setCapability("platformVersion","14.6"); 
					 caps.setCapability("deviceName","iPhone Xs"); 
					 caps.setCapability("automationName","XCUITest"); 
					 caps.setCapability("udid","00008020-000104D42ED8002E"); 
					 caps.setCapability("xcodeOrgId","DPTF624RK6"); 
					 caps.setCapability("xcodeSigningId","iPhone Developer"); 
					 caps.setCapability("updateWDABundleId","com.banfield.react.bpht"); 
					 caps.setCapability("bootstrapPath","/usr/local/lib/node_modules/appium/node_modules/appium-webdriveragent");  
                     caps.setCapability("noReset", true );
                     caps.setCapability(MobileCapabilityType.APP, "/Users/parthadey/Library/Developer/Xcode/DerivedData/Banfield-hbugquvyrpuvxnbsjzznomawlvja/Build/Products/Debug-iphoneos/Banfield.app");
					 url =new URL("http://0.0.0.0:4723/wd/hub");
					 driver = new IOSDriver<IOSElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
                     
				 }
			 
			 driver.manage().timeouts().implicitlyWait(elementWaitInSeconds,TimeUnit.SECONDS);
			logger.info("Banfield App started");
			try {
				if (getUserDeviceInput.contains("IOS"));
				driver.findElementById("Allow").isDisplayed(); {
				driver.findElementById("Allow").click();				
				}
			} catch (Exception e) {
				

			}
			try {
				if(getUserDeviceInput.contains("IOSReal")) {
				 driver.findElementById("OK").click();
				 driver.findElementById("Allow").click();
				 driver.findElementById("OK").click();
				}
			} catch (Exception e) {
				
			}
		} catch (Exception ex) {
			logger.error("Banfield app not started");
		}
		
	}
	
	public static void tapOnNearestBanfieldCTA() {
		driver.findElementById("Nearest Banfield").click();
	}
	
	public static void verifyNearestBanfieldpopups() {
		driver.findElementById("Nearest Banfield").isDisplayed();
	}
	

	public static void terminateApp() {
		try {
			driver.quit();
			logger.info("Banfield app closed");
		} catch (Exception ex) {
			logger.error("Banfield app not closed");
		}
	}

	public static AppiumDriver<MobileElement> getDriver() {
		return (AppiumDriver<MobileElement>) driver;
	}

	private WebElement element;

	public WebDriverWait webDriverWait() {
		return new WebDriverWait(driver, elementWaitInSeconds);
	}

	public void WaitElementToBeClickable(WebElement element) {
		webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitVisibilityOfElement(WebElement element) {
		webDriverWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	public void TapElement(MobileElement element) {
		try {
			 WaitVisibilityOfElement(element);
			 WaitElementToBeClickable(element);
			 element.click();
			logger.info("Element has been tapped");
		} catch (Exception ex) {
			logger.error("Element tapping gets failed");
		}
	}

	public void EnterInput(MobileElement element, String inputText) {
		try {
			element.clear();
			element.sendKeys(inputText);
			logger.info("Sending input being passed");
		} catch (Exception ex) {
			logger.error("Sending input gets failed");
		}
	}

	public void HidingKeyboard() {
		try {
			((HidesKeyboard) driver).hideKeyboard();
			getDriver().hideKeyboard();
			logger.info("Hiding keyboard is passed");
		} catch (Exception ex) {
			logger.error("Hiding keyboard gets failed");
		}
	}
	public void HidingKeyboardios() {
		TouchAction touchAction = new TouchAction(getDriver());
		touchAction.tap(new PointOption().withCoordinates(345, 343)).perform();
		logger.info(" IOS Hiding keyboard gets passed");
	}
	

	public static Properties loadProperty(String path) {
		try {
			property = new Properties();
			property.load(new FileInputStream(path));
			logger.info("Properties are loaded successfully");
			return property;
		} catch (Exception ex) {
			logger.error("Properties doesn't loaded");
		}
		return null;
	}

	// Scroll and click
	public void Scroll(String element) {

		if (getUserDeviceInput.contentEquals("IOS")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			scrollObject.put("xpath", element);
			js.executeScript("mobile: scroll", scrollObject);
			logger.info("IOS Scroll has been passed");
		} else if (getUserDeviceInput.equalsIgnoreCase("browserstack-IOS")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			scrollObject.put("xpath", element);
			js.executeScript("mobile: scroll", scrollObject);
			logger.info("IOS Scroll has been passed");
		}
		else {
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"" + element + "\").instance(0))";
			driver.findElement(MobileBy.AndroidUIAutomator(scrollElement)).click();

		}
	}

	   // Scroll 
		public void ScrolltoElement(String element) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			if (getUserDeviceInput.equalsIgnoreCase("IOS")) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				scrollObject.put("xpath", element);
				js.executeScript("mobile: scroll", scrollObject);
				logger.info("IOS Scroll has been passed");
			} else if (getUserDeviceInput.equalsIgnoreCase("browserstack-IOS")) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				scrollObject.put("xpath", element);
				js.executeScript("mobile: scroll", scrollObject);
				logger.info("IOS Scroll has been passed");
			}
			else {
				String scrollElement = "new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + element + "\").instance(0))";
				driver.findElement(MobileBy.AndroidUIAutomator(scrollElement));
			}
		}
		
		/*
		 * iOS Wait Statement 1st - Using Currently
		 */
		public void ExplicitWaitToVisibleElement(By by) {
			WebDriverWait wait = new WebDriverWait(getDriver(), 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By) by));
		}
		
		/*
		 * iOS Wait Statement 2nd
		 */
		public IOSElement waitUntilClickable(By by, Integer timeout) {
		    return waitUntilClickable((By) ExpectedConditions.elementToBeClickable((By) by), timeout);
		}
		
		public void ScrolltoElementUp() {
			RemoteWebElement parent = (RemoteWebElement)driver.findElement(By.xpath("//XCUIElementTypeButton[@name='dasboard/makeappointment-btn']"));
			String parentID = parent.getId();
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("element", parentID);
			scrollObject.put("direction", "up");
	//		scrollObject.put("direction", "right");
	//		scrollObject.put("direction", "down");
			driver.executeScript("mobile:scroll", scrollObject);
			}
		
		public void ScrollwithElement() {
			TouchActions action = new TouchActions(driver);
			action.scroll(element , 0, 0);
			action.build().perform();
		}
			
		
		
		public WebElement scrollToAnElementByText(AppiumDriver<WebElement> driver, String element) {
	        return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
	                ".scrollIntoView(new UiSelector().text(\"" + element + "\"));"));
	}
		
	public static String date() {
		simpleformat = new SimpleDateFormat("dd");
		String strDate = simpleformat.format(new Date());
		logger.info("Get current date is passed");
		return strDate;

	}

	public static String getCurrentYear() {
		simpleformat = new SimpleDateFormat("yyyy");
		String strYear = simpleformat.format(new Date());
		logger.info("Get current year passed");
		return strYear;
	}

	public void iOSDatePicker(String strDate, String input, List<MobileElement> dateSelection) {
		try {
			if (getUserDeviceInput.equalsIgnoreCase("IOS")) {
				List<MobileElement> values = (List<MobileElement>) dateSelection;
				if (!strDate.equals(input)) {
					values.get(1).sendKeys(input);
					logger.info("Date has been selected successfully");
				}
			}

			else {
				List<MobileElement> GetList = dateSelection;

			}
		}

		catch (Exception ex) {
			logger.info("Date couldn't be selected");
		}

	}

	public void IOSYearPicker(String strYear, String input, List<MobileElement> dateSelection) {
		List<MobileElement> values = (List<MobileElement>) dateSelection;
		if (!strYear.equals(input)) {
			values.get(2).sendKeys(input);
			logger.info("Year has been selected successfully");
		} else {
			logger.info("Year couldn't be selected");
		}
	}

	public void WeekDayPicker(List<MobileElement> DaySelection, String input) {
		try {
			if (getUserDeviceInput.equalsIgnoreCase("IOS")) {
				List<MobileElement> DayList = DaySelection;
				DayList.get(0).sendKeys(input);

			} else {
				int i = 1;
				List<MobileElement> DayList = DaySelection;
				for (MobileElement actualDay : DayList) {
					String getDay = actualDay.getText();
					if (getDay.equalsIgnoreCase(input)) {
						actualDay.click();
						break;
					}
				}
				i++;
			}
			logger.info("Day has been selected successfully");
		} catch (Exception ex) {
			logger.info("Day couldn't be selected");
		}
	}

	public static String getTodayDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		String desiredDateToSelect = formatter.format(date);
		return desiredDateToSelect;
	}

	/*
	 * Removing leading zero from the date if available
	 */
	public static String replaceLeadingZero(String dateToSelect) {
		String str = dateToSelect;
		String removedLeadingZero = "^0+";
		String afterRemovedZero = str.replaceAll(removedLeadingZero, "");
		Reporter.log("String: " + afterRemovedZero, true);
		return afterRemovedZero;
	}

	public void ActionClick(MobileElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.click();
		action.perform();
	}
	/**
	* This mtd is going to read the data from csv file just pass below parameters
	* this is implemented from Apache Commons CSV, need to add this in pom.xml
	* @param rowNo(Row Number) which starts from 1
	* @param headername in inputdata, header name in Header1 and Header2
	* then Create a object of class and call the method for ex -System.out.println(util.getcsvdata(2, "password" ,"username","password"));
	* @return data
	* @throws EncryptedDocumentException
	* @throws IOException
	*/
	public static String getcsvdata(String path,int rowNo, String inputdata,String Header1,String Header2,String Header3,String Header4) throws Throwable {
	    String data = null;
	    BufferedReader reader =Files.newBufferedReader(Paths.get(path));
	    CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(Header1, Header2, Header3, Header4).withIgnoreHeaderCase().withTrim());
	    for(CSVRecord csvrecord:csvparser) {
	        if(csvrecord.getRecordNumber()==rowNo) {
	         data=csvrecord.get(inputdata);    
	        }
	    }
	    return data;
	    }
	public static String getcsvdata(String path,int rowNo, String inputdata,String Header1,String Header2,String Header3) throws Throwable {
	    String data = null;
	    BufferedReader reader =Files.newBufferedReader(Paths.get(path));
	    CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(Header1, Header2, Header3).withIgnoreHeaderCase().withTrim());
	    for(CSVRecord csvrecord:csvparser) {
	        if(csvrecord.getRecordNumber()==rowNo) {
	         data=csvrecord.get(inputdata);    
	        }
	    }
	    return data;
	    }
	public static String getcsvdata(String path,int rowNo, String inputdata,String Header1,String Header2) throws Throwable {
	    String data = null;
	    BufferedReader reader =Files.newBufferedReader(Paths.get(path));
	    CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(Header1, Header2).withIgnoreHeaderCase().withTrim());
	    for(CSVRecord csvrecord:csvparser) {
	        if(csvrecord.getRecordNumber()==rowNo) {
	         data=csvrecord.get(inputdata);    
	        }
	    }
	    return data;
	    }
	
	public static String getcsvdata(String path,int rowNo, String inputdata,String Header1,String Header2,String Header3,String Header4,String Header5) throws Throwable {
	    String data = null;
	    BufferedReader reader =Files.newBufferedReader(Paths.get(path));
	    CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(Header1, Header2, Header3, Header4, Header5).withIgnoreHeaderCase().withTrim());
	    for(CSVRecord csvrecord:csvparser) {
	        if(csvrecord.getRecordNumber()==rowNo) {
	         data=csvrecord.get(inputdata);    
	        }
	    }
	    return data;
	    }
	public static String getcsvdata(String path,int rowNo, String inputdata,String Header1) throws Throwable {
	    String data = null;
	    BufferedReader reader =Files.newBufferedReader(Paths.get(path));
	    CSVParser csvparser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(Header1).withIgnoreHeaderCase().withTrim());
	    for(CSVRecord csvrecord:csvparser) {
	        if(csvrecord.getRecordNumber()==rowNo) {
	         data=csvrecord.get(inputdata);    
	        }
	    }
	    return data;
	    }
	
	public int random() {
		Random random = new Random();
		int r=random.nextInt(1000000);
		return r;
	}
	
	public static void javascriptScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: lightskyblue; border: 2px solid red;');", element);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	
    public static void swipeDown() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.1); //0.2
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }
    
    public static void swipeDown1() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2); 
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }
    
    public static void swipeDown3() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.0); 
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }
    
    public static void verifytest(MobileElement element) {
    JavascriptExecutor jse = (JavascriptExecutor)driver;
	 if (element.isDisplayed()) {
	      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
	    }
	    else {
	      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
	    }
    }
    
    /*
     * Swipe Left
     */
	public static void swipeleft(MobileElement e) {
		Dimension dimension = driver.manage().window().getSize();
		int scrollStart = (int) (dimension.getWidth() * 0.8);
		int scrollEnd = (int) (dimension.getWidth() * 0.4);
		int y = (int) (dimension.getHeight() / 2);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, y))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(scrollEnd, y))
				.release().perform();
	}
	
	public static void isElementHighlighted(MobileElement e) {
//	String color = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("color");

//	String backcolor = driver.findElement(By.xpath("//a[text()='Shop']")).getCssValue("background-color");
	String color =	e.getCssValue("color");
	String backcolor =	e.getCssValue("background-color");
	System.out.println(color);

	System.out.println(backcolor);

	if(!color.equals(backcolor)){

	System.out.println("Text is highlighted!");

	}

	else{
	System.out.println("Text is not highlighted!");
	}
	}
	
	public static void startServer() {
		CommandLine cmd = new CommandLine("C:\\nodejs\\node.exe");
		cmd.addArgument("C:\\Users\\parthadey\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		cmd.addArgument("--address");
		cmd.addArgument("127.0.0.1");
		cmd.addArgument("--port");
		cmd.addArgument("4723");
		
		DefaultExecuteResultHandler handeler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		
		try {
			executor.execute(cmd, handeler);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	  if (checkIfServerIsRunning(4723)) { 
//		  stopServer(); 
//		  } 
//	  startServer(); 
	
	//  @BeforeMethod(alwaysRun=true)
	  @org.testng.annotations.Parameters(value={"deviceIndex"})
	  public void setUp(String deviceIndex) throws Exception {
	    JSONParser parser = new JSONParser();
	    JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/resources/com/browserstack/run_parallel_test/parallel.conf.json"));
	    JSONArray envs = (JSONArray) config.get("environments");

	    DesiredCapabilities capabilities = new DesiredCapabilities();

	    Map<String, String> envCapabilities = (Map<String, String>) envs.get(Integer.parseInt(deviceIndex));
	    Iterator it = envCapabilities.entrySet().iterator();
	    while (it.hasNext()) {
	      Map.Entry pair = (Map.Entry)it.next();
	      capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
	    }
	    
	    Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
	    it = commonCapabilities.entrySet().iterator();
	    while (it.hasNext()) {
	      Map.Entry pair = (Map.Entry)it.next();
	      if(capabilities.getCapability(pair.getKey().toString()) == null){
	          capabilities.setCapability(pair.getKey().toString(), pair.getValue());
	      }
	    }

	    String username = System.getenv("BROWSERSTACK_USERNAME");
	    if(username == null) {
	      username = (String) config.get("username");
	    }

	    String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
	    if(accessKey == null) {
	      accessKey = (String) config.get("access_key");
	    }
	    
	    String app = System.getenv("BROWSERSTACK_APP_ID");
	    if(app != null && !app.isEmpty()) {
	      capabilities.setCapability("app", app);
	    }

	    driver = new IOSDriver<IOSElement>(new URL("http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub"), capabilities);
	  }


}
