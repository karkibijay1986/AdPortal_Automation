package audienceAppPageObjects;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import factory.DriverFactory;
import utilities.WebDriverWaits;

public class GoalsPage{
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	By selection_Goals_FlightDates = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[1]/button[1]");
	By select_FlightStartDate_Box = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-flight-dates[1]/app-flight-daterange[1]/app-broadcast-partial-daterange-picker[1]/div[1]/div[1]");
	By pick_FlightStartDate_CalenderPicker = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-flight-dates[1]/app-flight-daterange[1]/app-broadcast-partial-daterange-picker[1]/div[2]/div[2]");
	By textBox_FlightWeeks = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-flight-dates[1]/app-flight-daterange[1]/app-weeks-input[1]/input[1]");
	By select_FlightEndDate_Box = By.id("endDate");
	By pick_FlightEndDate_CalenderPicker = By.xpath(
			"//div[@class='ui-datepicker-group ui-datepicker-group-last']//table[@class='ui-datepicker-calendar']");
	By monthSelectorArrowKey = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	By select_PlanSpecifics = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[2]/button[1]");
	By date_Number = By.tagName("div");
	By dropDown_SelectCampaignType = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/div[1]");
	By dropDownArrow_SelectCampaignType = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/div[1]/span[1]");
	By dropDown_CampaignType_Budget = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]");
	By dropDown_campaignType_Impressions = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]");
	By dropDown_campaignType_MonthlyBudgetBroadcast = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]");
	By dropDown_campaignType_MonthlyBudgetCalendar = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/label[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[4]");
	By textBox_EnterBudgetAmount = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/label[1]/app-currency-integer-input[1]/input[1]");
	By textBox_EnterImpressions = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetBroadcast1 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[1]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetBroadcast2 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[2]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetBroadcast3 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[3]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetBroadcast4 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[4]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetCalendar1 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[1]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetCalendar2 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[2]/label[1]/app-currency-integer-input[1]/input[1]");
	By enter_MonthlyBudgetCalendar3 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/ol[1]/li[3]/label[1]/app-currency-integer-input[1]/input[1]");
	By checkBox_CPMGoal = By.xpath("//body/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-plan-specifics[1]/div[1]/app-cpm-goal[1]/div[1]/div[1]/label[1]");
	By txtBox_EnterCPMGoal = By.xpath("//input[@id='cpm-goal-input']");
	By click_NetworkExclusions = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[3]/button[1]");
	By button_NetworkExclusionsCategories_KidsAndFamily = By.xpath("//button[contains(text(),'Kids and family')]");
	By button_NetworkExclusionsCategories_KidsAndFamily_AustinInterconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-network-exclusions[1]/div[1]/button[1]");
	By button_NetworkExclusionsCategories_NationalNews = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-network-exclusions[1]/div[1]/button[2]");
	By button_NetworkExclusionsCategories_Spanish = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-network-exclusions[1]/div[1]/button[1]");
	By button_NetworkExclusionsCategories_Female = By.xpath("//button[contains(text(),'Female')]");
	By button_NetworkExclusionsCategories_Male = By.xpath("//button[contains(text(),'Male')]");
	By button_CategoriesNetworkExclusions_ExcludeNone = By.xpath("//span[@class='exclude-position']");
	By logo_Freeform = By.xpath("//div[@class='ng-scope']//li[2]//img[1]");
	By logo_CartoonNetwork = By.xpath("//div[@class='ng-scope']//li[4]");
	By logo_BloombergTelevision = By.xpath("//div[@class='ng-scope']//li[1]");
	By logo_Cooking_channel = By.xpath("//li[6]//img[1]");
	By logo_Networks_AnimalPlanet = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/network-exclusions[1]/div[1]/div[3]/div[2]/ul[1]/li[5]/img[1]");
	By logo_Networks_FS2 = By.xpath("//li[8]//img[1]");
	By button_RunProposal = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-goals[1]/div[1]/div[2]/app-next-button[1]/button[1]");

	public GoalsPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
	}

	public void select_Goals_FlightDates() {
		webDriverWaits.WaitForElementToBeVisible(selection_Goals_FlightDates, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement selectCampaignType = driver.findElement(selection_Goals_FlightDates);
					selectCampaignType.click();
					clicked = true;
				} catch (ElementNotInteractableException e) {
					e.toString();
					System.out.println("Recovering from ElementNotInteractableException");
					count = count + 1;
				}
			}
		}
		driver.findElement(selection_Goals_FlightDates).click();

	}

	public void click_Box_FlightstartDate() {
		driver.findElement(select_FlightStartDate_Box).click();
	}

	public void click_Box_FlightEndDate() {
		driver.findElement(select_FlightEndDate_Box).click();
	}

	public void select_FlightStartDateFromCalender() {
		driver.findElement(pick_FlightStartDate_CalenderPicker);
		List<WebElement> allStartDates = driver.findElements(date_Number);
		for (WebElement dates : allStartDates) {
			String date = dates.getText();
			if (date.equalsIgnoreCase("15")) {
				dates.click();
				break;
			}
		}
	}

	public void select_FlightLength(String flightLength) {
		driver.findElement(textBox_FlightWeeks).clear();
		driver.findElement(textBox_FlightWeeks).sendKeys(flightLength);
		driver.findElement(selection_Goals_FlightDates).click();

	}

	public void select_FlightEndDateFromCalender() {
		for (int i = 0; i < 2; i++) {
			driver.findElement(monthSelectorArrowKey).click();
		}
		driver.findElement(pick_FlightEndDate_CalenderPicker);
		List<WebElement> allStartDates = driver.findElements(date_Number);
		for (WebElement dates : allStartDates) {
			String date = dates.getText();
			if (date.equalsIgnoreCase("15")) {
				dates.click();
				break;
			}
		}
	}

	public void select_Goal_PlanSpecifics() {
		driver.findElement(select_PlanSpecifics).click();
	}

	public void select_CampaignType_Budget() {
		webDriverWaits.WaitForElementToBeClickable(dropDownArrow_SelectCampaignType, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement selectCampaignType = driver.findElement(dropDownArrow_SelectCampaignType);
					selectCampaignType.click();
					clicked = true;
				} catch (ElementNotInteractableException e) {
					e.toString();
					System.out.println("Recovering from ElementNotInteractableException");
					count = count + 1;
				}
			}
		}
		driver.findElement(dropDown_CampaignType_Budget).click();

	}

	public void enterBudgetAmount(String totalBudgetAmount) {
		driver.findElement(textBox_EnterBudgetAmount).clear();
		driver.findElement(textBox_EnterBudgetAmount).sendKeys(totalBudgetAmount);

	}
 public void enterCPMGoal (String cPMGoal) {
	 driver.findElement(checkBox_CPMGoal).click();
	 webDriverWaits.WaitForElementToBePresent(txtBox_EnterCPMGoal, 60);
	 driver.findElement(txtBox_EnterCPMGoal).clear();
	 driver.findElement(txtBox_EnterCPMGoal).sendKeys(cPMGoal);
 }
 
	public void select_CampaignType_Impressions(String NumberOfImpressions) {
		webDriverWaits.WaitForElementToBeClickable(dropDownArrow_SelectCampaignType, 30);
		driver.findElement(dropDownArrow_SelectCampaignType).click();
		driver.findElement(dropDown_campaignType_Impressions).click();
		driver.findElement(textBox_EnterImpressions).clear();
		driver.findElement(textBox_EnterImpressions).sendKeys(NumberOfImpressions);
	}

	public void select_campaignType_MonthlyBudgetBroadcast(String broadcastMonthlyBudget) {
		webDriverWaits.WaitForElementToBeClickable(dropDownArrow_SelectCampaignType, 30);
		driver.findElement(dropDownArrow_SelectCampaignType).click();
		driver.findElement(dropDown_campaignType_MonthlyBudgetBroadcast).click();
		driver.findElement(enter_MonthlyBudgetBroadcast1).clear();
		driver.findElement(enter_MonthlyBudgetBroadcast1).sendKeys(broadcastMonthlyBudget);
		driver.findElement(enter_MonthlyBudgetBroadcast2).sendKeys(broadcastMonthlyBudget);
		driver.findElement(enter_MonthlyBudgetBroadcast3).sendKeys(broadcastMonthlyBudget);
		driver.findElement(enter_MonthlyBudgetBroadcast4).sendKeys(broadcastMonthlyBudget);
		driver.findElement(select_PlanSpecifics).click();
	}

	public void select_campaignType_MonthlyBudgetCalendar(String calendarMonthlyBudget) {
		webDriverWaits.WaitForElementToBeClickable(dropDownArrow_SelectCampaignType, 30);
		driver.findElement(dropDownArrow_SelectCampaignType).click();
		driver.findElement(dropDown_campaignType_MonthlyBudgetCalendar).click();
		driver.findElement(enter_MonthlyBudgetCalendar1).clear();
		driver.findElement(enter_MonthlyBudgetCalendar1).sendKeys(calendarMonthlyBudget);
		driver.findElement(enter_MonthlyBudgetCalendar2).sendKeys(calendarMonthlyBudget);
		driver.findElement(enter_MonthlyBudgetCalendar3).sendKeys(calendarMonthlyBudget);
		driver.findElement(select_PlanSpecifics).click();
	}

	public void select_networkExclusionsKidsAndFamily() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_NetworkExclusions);
					marketForAnAuto.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_KidsAndFamily).click();
	}

	public void select_networkExclusionsNationalNewsCincinnatiOH() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_NetworkExclusions);
					marketForAnAuto.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_NationalNews).click();
	}

	public void select_networkExclusionsNationalNews() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_NetworkExclusions);
					marketForAnAuto.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_NationalNews).click();
		// driver.findElement(logo_Networks_FS2).click();
	}

	public void select_networkExclusionsSpanish() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_NetworkExclusions);
					marketForAnAuto.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_Spanish).click();
	}

	public void select_networkExclusionsSpanish_HotG() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement netWorkExclusions = driver.findElement(click_NetworkExclusions);
					netWorkExclusions.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_Spanish).click();
	}

	public void select_networkExclusionsKidsAndFamily_AustinInterconnect() {
		webDriverWaits.WaitForElementToBeVisible(click_NetworkExclusions, 30);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_NetworkExclusions);
					marketForAnAuto.click();
					clicked = true;
				} catch (NoSuchElementException e) {
					e.toString();
					System.out.println("Recovering from NoSuchElementException");
					count = count + 1;
				}
			}
		}
		driver.findElement(button_NetworkExclusionsCategories_KidsAndFamily_AustinInterconnect).click();
		// driver.findElement(logo_Networks_AnimalPlanet).click();

	}

	public void click_RunProposal() {
		driver.findElement(button_RunProposal).click();
	}

}