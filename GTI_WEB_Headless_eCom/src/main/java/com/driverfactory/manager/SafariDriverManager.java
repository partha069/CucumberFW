package com.driverfactory.manager;

import static io.github.bonigarcia.wdm.config.DriverManagerType.SAFARI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariDriverManager implements Factory {

	private WebDriver webdriver;

	private SafariOptions getOptions() {
		SafariOptions safariOptions = new SafariOptions();
//		DesiredCapabilities capabilities = DesiredCapabilities.safari();
		safariOptions.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, "accept");
//		safariOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "accept");
//		safariOptions.setCapability(CapabilityType.SUPPORTS_WEB_STORAGE, true);
//		safariOptions.merge(capabilities);
		return safariOptions;
	}

	@Override
	public WebDriver createDriver(Target target, String scenario) {

		//	if (!IS_OS_MAC) throw new
		//   BrowserNotSupportedException("Safari is not supported on" + System.getProperty("os.name"));

		switch (target) {
			case LOCAL:
				WebDriverManager.getInstance(SAFARI).setup();
				webdriver = new SafariDriver(getOptions());

				break;
			case REMOTE:
				webdriver = createRemoteDriver(scenario);
				break;
			default:
				throw new TargetNotValidException(target.toString());
		}
		return webdriver;

	}
}
