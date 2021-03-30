package adPortalTestNGTestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "/Users/p2815492/NewEclipseWorkSpace/AdPortalUAT_Automation/src/test/resources/adportalFeatures/Adportal_NewCustomer_SSU_LogIn.feature" },
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}, 
		monochrome = true,
		glue = { "/adPortal_StepDefinitions", "appHooks" }
		
)


public class AdPortal_NewCustomer_SSU_LogIn_TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	} 
}
