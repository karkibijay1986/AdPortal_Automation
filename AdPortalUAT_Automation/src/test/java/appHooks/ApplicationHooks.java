package appHooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	@BeforeMethod
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	
	@BeforeMethod
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);

	}


	@BeforeMethod
	@Before("@AdPortalLogInDefault")
	public void AdPortalLogInDefault(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before AdPortalLogInDefault");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@CreateCampaignDefault")
	public void CreateCampaignDefault(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before CreateCampaignDefault");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@AdPortalLogInUserInPut")
	public void AdPortalLogInUserInPut(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before AdPortalLogInUserInPut");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@NewCustomerSSULogIn")
	public void SSULogIn(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before SSULogIn");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@CreateCampaigUserInPut")
	public void CreateCampaignUserInPut(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before CreateCampaignUserInPut");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@NewCustomerReachPage")
	public void DashBoardView(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before NewCustomerReachPage");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@HelpCenterFAQ")
	public void faq_Link_Functionality(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before HelpCenterFAQ");
		System.out.println("=========================================");
	}


	@BeforeMethod
	@Before("@ReachIntroPage")
	public void reach_Intro_Page(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before Reach_Intro_Page");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@UploadYourCommercial")
	public void upload_Your_Commercial(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before upload_Your_Commercial");
		System.out.println("=========================================");
	}

	
	@BeforeMethod
	@Before("@RaiseAwareness_AlternativePackages")
	public void raiseAwareness_AlternativePackages(Scenario scenario) {

		System.out.println("======================================================");
		System.out.println("Executing before RaiseAwareness_AlternativePackages");
		System.out.println("======================================================");
	}

	
	@BeforeMethod
	@Before("@PromoteYourEvent_AlternativePackages")
	public void promoteYourEvent_AlternativePackages(Scenario scenario) {

		System.out.println("======================================================");
		System.out.println("Executing before PromoteYourEvent_AlternativePackages");
		System.out.println("======================================================");
	}

	
	@AfterMethod
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	
	@AfterMethod
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

}
