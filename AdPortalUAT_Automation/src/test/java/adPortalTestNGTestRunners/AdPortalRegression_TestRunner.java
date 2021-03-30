package adPortalTestNGTestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {
		"/Users/p2815492/NewEclipseWorkspace/AdPortalUAT_Automation/src/test/resources/adportalFeatures" }, 
plugin = {
				"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }, 
monochrome = true, 
glue = { "/adPortal_StepDefinitions",
						"appHooks" }, 
tags = "@LogInTest or @AlternativePackages or @SingleSignUpTest or @CreateCampaign"

)

public class AdPortalRegression_TestRunner extends AbstractTestNGCucumberTests {
	
	

}
