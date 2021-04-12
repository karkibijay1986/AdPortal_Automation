package audienceAppTestNG_TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"/Users/p2815492/NewEclipseWorkspace/AudienceAppUAT_Automation/src/test/resources/audienceAppFeatures/CreateProposal_CPMGoal.feature" }, plugin = {
				"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }, monochrome = true, glue = { "audienceApp_StepDefinitions",
						"appHooks" }

)
public class AudienceApp_CPMGoal_TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
