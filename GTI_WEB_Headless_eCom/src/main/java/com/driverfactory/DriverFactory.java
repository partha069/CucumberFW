package com.driverfactory;

import org.openqa.selenium.WebDriver;

import com.driverfactory.manager.AndroidDriverManager;
import com.driverfactory.manager.ChromeDriverManager;
import com.driverfactory.manager.EdgeDriverManager;
import com.driverfactory.manager.FirefoxDriverManager;
import com.driverfactory.manager.IEDriverManager;
import com.driverfactory.manager.IOSDriverManager;
import com.driverfactory.manager.SafariDriverManager;
import org.openqa.selenium.Dimension;

import exceptions.BrowserNotSupportedException;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DriverFactory {

	public WebDriver getDriver(Target target,String scenario) {
		WebDriver driver;
//		String browser = "Chrome";
		String browser =System.getProperty("browser");
		BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());
		switch (browserType) {

			case CHROME:
				driver = new ChromeDriverManager().createDriver(target, scenario);
				driver.manage().window().maximize();
			//	driver.manage().window().setSize(new Dimension(390, 844));
				break;
			case FIREFOX:
				driver = new FirefoxDriverManager().createDriver(target, scenario);
				driver.manage().window().maximize();
				break;
			case EDGE:
				driver = new EdgeDriverManager().createDriver(target, scenario);
				driver.manage().window().maximize();
				break;
			case SAFARI:
				driver = new SafariDriverManager().createDriver(target, scenario);
				driver.manage().window().maximize();
				break;
			case IE:
				driver = new IEDriverManager().createDriver(target, scenario);
				driver.manage().window().maximize();
				break;
			case ANDROID:
				driver = new AndroidDriverManager().createDriver(target, scenario);
				break;
			case IOS:
				driver = new IOSDriverManager().createDriver(target, scenario);
				break;
			default:
				throw new BrowserNotSupportedException(browser);
		}
		return driver;
	}

	public enum BrowserList {
		CHROME, FIREFOX, EDGE, SAFARI, OPERA, IE, ANDROID, IOS
	}

	public enum Target {
		LOCAL, REMOTE
	}

	public void screenSize_Reduced() throws Exception {
		Robot robot = new Robot();
		try {
			for (int i = 0; i < 3; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
