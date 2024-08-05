package com.driverfactory.manager;

import static io.github.bonigarcia.wdm.config.DriverManagerType.EDGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverManager implements Factory {

    private WebDriver webdriver;

    @Override
    public WebDriver createDriver(Target target, String scenario) {
        switch (target) {
            case LOCAL:
                WebDriverManager.getInstance(EDGE).setup();
                webdriver = new EdgeDriver(getOptions());
                break;
            case REMOTE:
                webdriver = createRemoteDriver(scenario);
                break;
            default:
                throw new TargetNotValidException(target.toString());
        }
        return webdriver;
    }

    private EdgeOptions getOptions() {
        EdgeOptions edgeOptions = new EdgeOptions();
        //	edgeOptions.setCapability("CHROMIUM", false);
        return edgeOptions;
    }

}
