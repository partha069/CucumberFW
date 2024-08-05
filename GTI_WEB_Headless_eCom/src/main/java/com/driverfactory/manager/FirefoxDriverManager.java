package com.driverfactory.manager;

import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager implements Factory {

    WebDriver webdriver;

    @Override
    public WebDriver createDriver(Target target, String scenario) {

        switch (target) {
            case LOCAL:
                WebDriverManager.getInstance(FIREFOX).setup();
                webdriver = new FirefoxDriver(getOptions());
                break;
            case REMOTE:
                webdriver = createRemoteDriver(scenario);
                break;
            default:
                throw new TargetNotValidException(target.toString());
        }
        return webdriver;

    }

    private FirefoxOptions getOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-maximized");
        firefoxOptions.addArguments("--disable-infobars");
        firefoxOptions.addArguments("--disable-notifications");
        return firefoxOptions;
    }

}
