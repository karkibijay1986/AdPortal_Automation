package audienceAppPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import utilities.WebDriverWaits;

public class ProposalPage {
	
	public WebDriver driver;
	public WebDriverWaits webDriverWaits;
	JavascriptExecutor executor;
	
	By linkText_ViewNetworkDetails = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	By button_Modify_Spectrum_News = By
			.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[3]");
	By bar_Add_Ons = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[1]/app-proposal-summary-sidebar[1]/app-proposal-sidebar[1]/div[1]/div[1]/div[2]/h2[1]");
	By linkText_proposalSummary = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/app-network-details[1]/div[1]/div[1]/button[1]/span[2]");
	By logo_NetworkDetailsPage_FirstNetworkLogo = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/app-network-details[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/th[1]/div[1]");
	By button_AddHPOs = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
	By button_AddHPOs_SaveAndFinish = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/app-hpo[1]/div[1]/div[3]/button[2]");
	By button_AddSpectrumNews = By
			.xpath("/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]");
	By button_AddSpectrumNews_Austin_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]");
	By button_AddSpectrumNews_Charlotte_Interconnect = By
			.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[2]");
	By button_AddSpectrumNews_Columbus_Interconnect = By
			.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[2]");
	By button_AddSpectrumNews_Buffalo_Local = By
			.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[2]");
	By button_AddSpectrumNews_NY_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-proposal-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
	By PopUpBox_AddSpcetrumNewsBudgetBody = By
			.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-spectrum-news-modal[1]/div[2]");
	By textBox_TotalBudgetAmount = By.xpath(
			"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-spectrum-news-modal[1]/div[2]/app-currency-integer-input[1]/input[1]");
	By button_AddSpectrumNewsBudget_Run = By.xpath(
			"/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-spectrum-news-modal[1]/div[2]/div[1]/button[2]");
	By logOut = By.xpath("/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-navbar[1]/nav[1]/div[2]/button[1]");
	By PopUp_ExitWarning = By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-question-modal[1]");
	By exit_Without_Saving = By
			.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-question-modal[1]/div[1]/button[2]");

	public ProposalPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
	}

	public void click_ViewNetworkDetails() {
		webDriverWaits.WaitForElementToBeVisible(linkText_ViewNetworkDetails, 300);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement viewNetworkDetailsButton = driver.findElement(linkText_ViewNetworkDetails);
					viewNetworkDetailsButton.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickInterceptedException");
					count = count + 1;
				}
			}
		}
		webDriverWaits.WaitForElementToBeVisible(logo_NetworkDetailsPage_FirstNetworkLogo, 300);
	}

	public void click_ViewNetworkDetailsMonthlyBudgetCalendar() {
		webDriverWaits.WaitForElementToBeVisible(linkText_ViewNetworkDetails, 3000);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement viewNetworkDetails = driver.findElement(linkText_ViewNetworkDetails);
					viewNetworkDetails.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickInterceptedException");
					count = count + 1;
				}
			}
		}
		// driver.findElement(linkText_ViewNetworkDetails).click();
		webDriverWaits.WaitForElementToBeVisible(logo_NetworkDetailsPage_FirstNetworkLogo, 30);
	}

	public void returnTo_ProposalSummaryPage() {
		webDriverWaits.WaitForElementToBeVisible(linkText_proposalSummary, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement backToProposalSummary = driver.findElement(linkText_proposalSummary);
					backToProposalSummary.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickInterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void AddHPOs() {
		driver.findElement(button_AddHPOs).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement SaveAndFinish = driver.findElement(button_AddHPOs_SaveAndFinish);
					SaveAndFinish.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickInterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void addSpectrumNews_Budget(String SpectrumNewsBudget) {
		webDriverWaits.WaitForElementToBeVisible(button_AddSpectrumNews, 60);
		driver.findElement(button_AddSpectrumNews).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void addSpectrumNewsBudget_Charlotte_Interconnect(String SpectrumNewsBudget) {
		driver.findElement(button_AddSpectrumNews_Charlotte_Interconnect).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void addSpectrumNewsBudget_NY_Interconnect(String SpectrumNewsBudget) throws InterruptedException {
		driver.findElement(button_AddSpectrumNews_NY_Interconnect).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void addSpectrumNewsBudget_Austin_Interconnect(String SpectrumNewsBudget) {
		driver.findElement(button_AddSpectrumNews_Austin_Interconnect).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void addSpectrumNewsBudget_Columbus_Interconnect(String SpectrumNewsBudget) {
		driver.findElement(button_AddSpectrumNews_Columbus_Interconnect).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void addSpectrumNewsBudget_Buffalo_Local(String SpectrumNewsBudget) {
		driver.findElement(button_AddSpectrumNews_Buffalo_Local).click();
		driver.findElement(PopUpBox_AddSpcetrumNewsBudgetBody);
		driver.findElement(textBox_TotalBudgetAmount).click();
		driver.findElement(textBox_TotalBudgetAmount).sendKeys(SpectrumNewsBudget);
		driver.findElement(button_AddSpectrumNewsBudget_Run).click();
	}

	public void waitForAddOnsBarToAppear() {
		webDriverWaits.WaitForElementToBeVisible(bar_Add_Ons, 240);
	}

	public void logOut_AudienceApp_With_ExitWarning() {
		//webDriverWaits.WaitForElementToBeVisible(bar_Add_Ons, 300);
		webDriverWaits.WaitForElementToBeVisible(logOut, 60);
		driver.findElement(logOut).click();
		webDriverWaits.WaitForElementToBeVisible(PopUp_ExitWarning, 90);
		driver.findElement(exit_Without_Saving).click();
	}
}
