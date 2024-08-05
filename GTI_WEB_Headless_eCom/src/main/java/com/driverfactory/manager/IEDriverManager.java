package com.driverfactory.manager;

import static io.github.bonigarcia.wdm.config.DriverManagerType.IEXPLORER;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.BrowserNotSupportedException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverManager implements Factory {

    @Override
    public WebDriver createDriver(Target target, String scenario) {
        if (!IS_OS_WINDOWS) throw new
                BrowserNotSupportedException("IE is not supported on " + System.getProperty("os.name"));

        WebDriverManager.getInstance(IEXPLORER).setup();

        return new InternetExplorerDriver();
    }
}
