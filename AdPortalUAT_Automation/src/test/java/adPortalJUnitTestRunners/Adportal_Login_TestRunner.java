package adPortalJUnitTestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/p2815492/ParallelRunWorkSpace/AdPortalUAT_Automation/src/test/resources/adportalFeatures/Adportal_Login.feature"},
		glue = {"adPortal_StepDefinitions", "appHooks"},
		plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

				
		}
		
		)

public class Adportal_Login_TestRunner {

}
		