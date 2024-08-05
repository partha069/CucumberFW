package com.driverfactory.manager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverManager implements Factory  {
	private WebDriver webdriver;

	private DesiredCapabilities getOptions() throws IOException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CT21FH9QV");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0.0");
		caps.setCapability(CapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
//		caps.setCapability("noReset", "true");
		// String androidAppUrl =
		// getClass().getResource(props.getProperty("androidAppLocation")).getFile();
		return caps;

	}

//	@SuppressWarnings("unchecked")
//	public AndroidDriver<AndroidElement> createAndroidDriver(Target target)  {
//		switch (target) {
//		case LOCAL:
//			URL url = null;
//			try {
//				url = new URL("http://127.0.0.1:4723/wd/hub");
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//			try {
//				return new AndroidDriver<AndroidElement>(url, getOptions());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		case REMOTE:
//			return (AndroidDriver<AndroidElement>) createRemoteDriver();
//		default:
//			throw new TargetNotValidException(target.toString());
//		}
//	}


//	@SuppressWarnings("unchecked")
//	@Override
//	public WebDriver createDriver(Target target) {
//		switch (target) {
//		case LOCAL:
//			URL url = null;
//			try {
//				url = new URL("http://127.0.0.1:4723/wd/hub");
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
//			try {
//				return new AndroidDriver<AndroidElement>(url, getOptions());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		case REMOTE:
//			return (AndroidDriver<AndroidElement>) createRemoteDriver();
//		default:
//			throw new TargetNotValidException(target.toString());
//		}
//	}

	@Override
	public WebDriver createDriver(Target target, String scenario) {

		switch (target) {
			case LOCAL:
				URL url = null;
				try {
					url = new URL("http://127.0.0.1:4723/wd/hub");
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				try {
					return new AndroidDriver<AndroidElement>(url, getOptions());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			case REMOTE:
				webdriver = createRemoteDriver(scenario);
				break;
			default:
				throw new TargetNotValidException(target.toString());
		}
		return webdriver;

	}



}
