package com.utilities;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.driverfactory.DriverFactory;
import com.driverfactory.DriverManager;
import com.driverfactory.Factory;
import com.driverfactory.manager.ChromeDriverManager;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;

public class ReportWeb {

	public static String ConfigurationFile = System.getProperty("user.dir")
			+ "/src/test/resources/config/config.properties";
	public static Properties prop = ConfigReader.init_prop();

	public static void generateReport(String JsonFile, String Runnertype) throws IOException {
		if (Runnertype.equalsIgnoreCase("Rerun")) {
			Configuration config = new Configuration(
					new File(System.getProperty("user.dir") + "/target/RerunFailedTestcases"),
					"GTI_Headless_eCom_Report");
			String browserName = System.getProperty("browser");

			if (browserName.equalsIgnoreCase("Chrome")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "119");
				config.addClassifications("System Info", "macOS");
				config.addClassifications("OS Version", "13.5.1");
			} else if (browserName.equalsIgnoreCase("Safari")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "15");
				config.addClassifications("System Info", "macOS");
				config.addClassifications("OS Version", "16.6");
			} else if (browserName.equalsIgnoreCase("Edge")) {
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "110");
				config.addClassifications("System Info", "Windows OS");
				config.addClassifications("OS Version", "10.0");
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "111");
				config.addClassifications("System Info", "Windows OS");
				config.addClassifications("OS Version", "10.0");
			} else if (browserName.equalsIgnoreCase("Android")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform Name", System.getProperty("browser"));
				config.addClassifications("DeviceName", "Samsung Galaxy Tab S8");
				config.addClassifications("OSVersion", "12.0");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
			} else if (browserName.equalsIgnoreCase("iOS")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform Name", System.getProperty("browser"));
				config.addClassifications("DeviceName", "iPad Air 4");
				config.addClassifications("OSVersion", "14");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
			}

			List<String> JsonFiles = new ArrayList<String>();
			JsonFiles.add(JsonFile);
			ReportBuilder report = new ReportBuilder(JsonFiles, config);
			report.generateReports();
		} else if (Runnertype.equalsIgnoreCase("Runcucumber")) {

			Configuration config = new Configuration(new File(System.getProperty("user.dir") + "/target/Results"),
					"GTI_Headless_eCom_Report");
			String browserName = System.getProperty("browser");

			if (browserName.equalsIgnoreCase("Chrome")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "111");
				config.addClassifications("System Info", "Windows OS");
				config.addClassifications("OS Version", "10.0");
			} else if (browserName.equalsIgnoreCase("Safari")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "15");
				config.addClassifications("System Info", "Mac OS ");
			} else if (browserName.equalsIgnoreCase("Edge")) {
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "107");
				config.addClassifications("System Info", "Windows OS");
				config.addClassifications("OS Version", "10.0");
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				config.addClassifications("Platform", "Web");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
				config.addClassifications("Browser Name", System.getProperty("browser"));
				config.addClassifications("BrowserVersion", "107");
				config.addClassifications("System Info", "Windows OS");
				config.addClassifications("OS Version", "10.0");
			} else if (browserName.equalsIgnoreCase("Android")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform Name", System.getProperty("browser"));
				config.addClassifications("DeviceName", "Samsung Galaxy S23");
				config.addClassifications("OSVersion", "13.0");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
			} else if (browserName.equalsIgnoreCase("iOS")) {
				config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
				config.addClassifications("Platform Name", System.getProperty("browser"));
				config.addClassifications("DeviceName", "iPhone 12");
				config.addClassifications("OSVersion", "17.0");
				config.addClassifications("Before Suite", System.getProperty("Start_Time"));
				config.addClassifications("After Suite", System.getProperty("End_Time"));
			}

			List<String> JsonFiles = new ArrayList<String>();
			JsonFiles.add(JsonFile);
			ReportBuilder report = new ReportBuilder(JsonFiles, config);
			report.generateReports();
		}

	}

}
