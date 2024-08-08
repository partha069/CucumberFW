
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features",
glue = {"com.bma.stepDefinition"},
monochrome = true,dryRun = false,tags = "@parthaTest",
//plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Banfield_Mobile_Automation_Execution_Report.html"})
plugin = {"pretty","json:target/cucumber-reports/cucumber.json"})

public class runCukesTest extends AbstractTestNGCucumberTests {
	

};