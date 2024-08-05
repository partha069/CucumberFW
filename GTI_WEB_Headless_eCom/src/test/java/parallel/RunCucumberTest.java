package parallel;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.utilities.*;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/resources" }, glue = { "parallel" }, dryRun = false, plugin = {
		"timeline:reports", "json:target/Results/cucumber.json", "rerun:FailedTestCases/failed.txt",
		"pretty" }, tags = "@apiTesting", monochrome = true)

public class RunCucumberTest {
	public static Properties prop = ConfigReader.init_prop();

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		Logger.createLogFile();
		Logger.createHTMLFile();
		Logger.initHTML();
		Date d = new Date();
		String date = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(d);
		System.out.println(date);
		System.setProperty("Start_Time", date);
	}

	@AfterClass
	public static void afterClass() throws IOException {

		Date endTime = new Date();
		String enddate = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(endTime);
		System.setProperty("End_Time", enddate);
		System.out.println(enddate);
		ReportWeb.generateReport(System.getProperty("user.dir") + "/target/Results/cucumber.json", "Runcucumber");
		Logger.closeLog();
	}
}



