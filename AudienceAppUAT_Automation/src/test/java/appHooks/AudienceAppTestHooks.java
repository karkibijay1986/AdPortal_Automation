package appHooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class AudienceAppTestHooks {

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
	@Before("@CreateProposal_Local_Budget")
	public void CreateProposal_Local_Budget(Scenario scenario) {

		System.out.println("==============================================");
		System.out.println("Executing before CreateProposal_Local_Budget");
		System.out.println("==============================================");
	}

	@BeforeMethod
	@Before("@CreateProposal_Local_Impressions")
	public void CreateProposal_Local_Impressions(Scenario scenario) {

		System.out.println("===================================================");
		System.out.println("Executing before @CreateProposal_Local_Impressions");
		System.out.println("===================================================");
	}

	@BeforeMethod
	@Before("@CreateProposal_Local_MonthlyBudgetBroadcast")
	public void CreateProposal_Local_MonthlyBudgetBroadcast(Scenario scenario) {

		System.out.println("==============================================================");
		System.out.println("Executing before CreateProposal_Local_MonthlyBudgetBroadcast");
		System.out.println("==============================================================");
	}

	@BeforeMethod
	@Before("@CreateProposal_Local_MonthlyBudgetCalendar")
	public void CreateProposal_Local_MonthlyBudgetCalendar(Scenario scenario) {

		System.out.println("==============================================================");
		System.out.println("Executing before @CreateProposal_Local_MonthlyBudgetCalendar");
		System.out.println("==============================================================");
	}

	@AfterMethod
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

}
