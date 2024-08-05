package com.driverfactory.manager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSDriverManager implements Factory {
	private WebDriver webdriver;

	private DesiredCapabilities getOptions() throws IOException {
		DesiredCapabilities desiredCapabilities;
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("realMobile", "true");
		desiredCapabilities.setCapability("nativeWebTap","true");

		return desiredCapabilities;
	}

	@SuppressWarnings("unchecked")
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
					return new IOSDriver<IOSElement>(url, getOptions());
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
