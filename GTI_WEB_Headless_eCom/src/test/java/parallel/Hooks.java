package parallel;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.driverfactory.DriverFactory;
import com.driverfactory.DriverFactory.Target;
import com.driverfactory.DriverManager;
import com.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	private DriverFactory driverFactory;
	private WebDriver driver;

	@Before
	public void launchBrowser(Scenario scenario) throws Exception {
		Properties prop = new ConfigReader().init_prop();
		String target = prop.getProperty("target");
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver(Target.valueOf(target.toUpperCase()), scenario.getName());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DriverManager.setDriver(driver);

//		 MARK: Eyes setup
//		Eyes eyes = new EyesSetup().getEyes(driver, scenario);
//		EyesManager.setEyes(eyes);


	}

	@After(order = 0)
	public void quitBrowser() {
		DriverManager.quit();

		// MARK: Eyes quit
		//EyesManager.quitEyes();

	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		System.out.println("************* After Hooks Started ****************");
		if(scenario.isFailed()){
			byte[] screenshot =((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "MyscreenShot");
		}
	}
}
