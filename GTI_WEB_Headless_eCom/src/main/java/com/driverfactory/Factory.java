package com.driverfactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import com.utilities.GetCurrentDateTime;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.driverfactory.DriverFactory.Target;

public interface Factory {

	WebDriver createDriver(Target target, String scenario);

	default WebDriver createRemoteDriver(String scenario) {
		String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
		String ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
		String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub.browserstack.com/wd/hub";
		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<>();

		if (System.getProperty("browser").equalsIgnoreCase("android")) {
			capabilities.setCapability("browserName", "chrome");
			browserstackOptions.put("osVersion", "12.0");
			browserstackOptions.put("deviceName", "Samsung Galaxy Tab S8");
			browserstackOptions.put("local", "false");
			capabilities.setCapability("bstack:options", browserstackOptions);

		} else if (System.getProperty("browser").equalsIgnoreCase("chrome")) {
			capabilities.setCapability("browserName", "Chrome");
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", "11");
			browserstackOptions.put("browserVersion", "116.0");
			//browserstackOptions.put("local", "false");
			browserstackOptions.put("seleniumVersion", "4.11.0");
			capabilities.setCapability("bstack:options", browserstackOptions);
		}
		if (System.getProperty("browser").equalsIgnoreCase("edge")) {
			capabilities.setCapability("browserName", "Edge");
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", "11");
			browserstackOptions.put("browserVersion", "116.0");
			//browserstackOptions.put("local", "false");
			browserstackOptions.put("seleniumVersion", "4.11.0");
			capabilities.setCapability("bstack:options", browserstackOptions);

		} else if (System.getProperty("browser").equalsIgnoreCase("firefox")) {
			capabilities.setCapability("browserName", "Firefox");
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", "11");
			browserstackOptions.put("browserVersion", "116.0");
			//browserstackOptions.put("local", "false");
			browserstackOptions.put("seleniumVersion", "4.11.0");
			capabilities.setCapability("bstack:options", browserstackOptions);

		} else if (System.getProperty("browser").equalsIgnoreCase("safari")) {
			capabilities.setCapability("browserName", "Safari");
			browserstackOptions.put("os", "OS X");
			browserstackOptions.put("osVersion", "Big Sur");
			browserstackOptions.put("browserVersion", "14.0");
			browserstackOptions.put("local", "false");
			browserstackOptions.put("seleniumVersion", "4.11.0");
			capabilities.setCapability("bstack:options", browserstackOptions);

		} else if (System.getProperty("browser").equalsIgnoreCase("iOS")) {
			capabilities.setCapability("browserName", "Safari");
			browserstackOptions.put("osVersion", "17.0");
			browserstackOptions.put("deviceName", "iPhone 12");
			browserstackOptions.put("local", "false");
			capabilities.setCapability("bstack:options", browserstackOptions);

		} else if (System.getProperty("browser").equalsIgnoreCase("firefox")) {
			capabilities.setCapability("browserName", "Firefox");
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", "11");
			browserstackOptions.put("browserVersion", "116.0");
			browserstackOptions.put("local", "false");
			browserstackOptions.put("seleniumVersion", "4.11.0");
			capabilities.setCapability("bstack:options", browserstackOptions);
		}

		browserstackOptions.put("projectName", "GTI_Headless_eCom");
		browserstackOptions.put("buildName",  " GTI_Headless_eCom " + GetCurrentDateTime.getCurrentDate());
		//capabilities.setCapability("buildTag", System.getProperty("BUILD"));


		try {
			return new RemoteWebDriver(new URL(URL), capabilities);
		} catch (MalformedURLException e) {
			System.out.println(String.format("URL not valid for remote browser", URL));
		}
		return null;
	}
}
