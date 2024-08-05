package com.driverfactory.manager;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager implements Factory {

	private WebDriver webdriver;

	private ChromeOptions getOptions() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--disable-infobars");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("----unlimited-storage");
		chromeOptions.setHeadless(false);
		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
//		chromeOptions.setCapability(ChromeOptions.CAPABILITY, options);
		return chromeOptions;
	}

	@Override
	public WebDriver createDriver(Target target, String scenario) {

		switch (target) {
			case LOCAL:
				WebDriverManager.getInstance(CHROME).setup();
//			WebDriverManager.getInstance(CHROME).setup();
				webdriver = new ChromeDriver(getOptions());
				break;
			case REMOTE:
				webdriver = createRemoteDriver(scenario);
				break;
			default:
				throw new TargetNotValidException(target.toString());
		}
		return webdriver;

	}
//	public String browserVersion() {
//		// Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
//		String browserVersion = null;
//		try {
//			browserVersion = ((RemoteWebDriver) webdriver).getCapabilities().getVersion();
//			System.out.println("JJJJ" + browserVersion);
//
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//			System.out.println("JJJJ" + browserVersion);
//		}
//		return browserVersion;
//	}

}
