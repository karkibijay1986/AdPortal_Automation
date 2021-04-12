package adportalPageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.WebDriverWaits;

public class SchedulePage {
	
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	By startAiring_CalenderArrow = By.xpath("//body/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-date-budget[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-select-input[1]/div[1]/ng-select[1]/div[1]/span[2]");
	By scheduleStartDate = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-date-budget[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-select-input[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/span[1]");
	By calender_TagName = By.tagName("dp-day-calendar");
	By date_Button = By.tagName("button");
	By scheduleStartDate_campaignPage = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-date-budget-without-budget-recommendation[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/app-select-input[2]/div[1]/ng-select[1]/div[1]");
	By capaignLength_DropDownBox = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-date-budget-without-budget-recommendation[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/app-select-input[2]/div[1]/ng-select[1]/div[1]/span[2]");
	By campaignLength_2weeks = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-date-budget-without-budget-recommendation[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/app-select-input[2]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]");
	By budgetAmount = By.xpath("//input[@id='budget']");
	By nextButton_schedulePage1of3 = By.partialLinkText("Next");
	By recommended_Package_SelectedButton = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-schedule-packages[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-package-overviews[1]/div[1]/div[2]/div[2]/button[1]");
	By schedulePage2of3_NextButton = By.partialLinkText("Next");
	By enter_MyOwnBudget = By.xpath("//button[contains(text(),'Enter My Own Budget')]");
	By review_CamapaignTitle = By.className("header large ng-star-inserted");
	By yourBudget_Amount = By.cssSelector("body.white-background:nth-child(2) div.main app-order.ng-star-inserted:nth-child(2) div.order-comp:nth-child(1) div.main-section div.row-materialize.header-row-all:nth-child(2) div.row-materialize.s9.card-section section.section-container app-schedule-display.ng-star-inserted:nth-child(2) div.ng-animate-disabled div.card-item-position div.tv-commerical-question-card div.card.card-client.ng-star-inserted div.card-content.ng-star-inserted div.review-schedule.container-fluid.p-0.text-left.ng-star-inserted div.row.m-0.mb-4.pb-2 div.col.p-0.pr-3 app-commercial-schedule-overview:nth-child(2) div.ng-star-inserted div.d-flex.your-schedule-section > div.schedule-cost.d-flex.align-items-center");
	By nextButton_CustomCampaignBOx = By.xpath("//button[contains(text(),'Next')]");
	By map_Pointer = By.xpath("commercial_Upload");
	By schedulePage3_NextButton = By.xpath("//a[@class='ap-btn button-right ng-star-inserted']");
	By schedulePage3_NextButton_RaiseAwareness = By.xpath("//button[contains(text(),'Next')]");
	By txtBox_campaignName_AlertBox = By.xpath("/html[1]/body[1]/app-simple-modal[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/input[1]");
	By click_Next_Alert = By.id("submit");
	
	public SchedulePage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(driver);
		
	}
	public void select_CampaignStartDate() {
		driver.findElement(startAiring_CalenderArrow).click();
		driver.findElement(scheduleStartDate).click();
			
	}
	public void click_Schedule1of3NextButton() {
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement nextButton = driver.findElement(nextButton_schedulePage1of3);
					nextButton.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a  StaleElementReferenceException");
					count = count + 1;
				}

			}
		}		
	}
	public void waitForRecommendedPackages () {
		webDriverWaits.WaitForElementToBePresent(recommended_Package_SelectedButton, 120);
	}
	public void click_EnterMyOwnBudget_And_EnterBudget(String budget) {
		driver.findElement(enter_MyOwnBudget).click();
		driver.findElement(budgetAmount).clear();
		driver.findElement(budgetAmount).sendKeys(budget);
		
	}
	public void select_CampaignLength() {
		driver.findElement(capaignLength_DropDownBox).click();
		driver.findElement(campaignLength_2weeks).click();
	}
	public void enter_Budget_UserInput() {
		driver.findElement(budgetAmount).clear();
		int Amount;
		String enterBudgetAmount;
		enterBudgetAmount = JOptionPane.showInputDialog(null, "Enter your budget amount");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Amount = Integer.parseInt(enterBudgetAmount);
		driver.findElement(budgetAmount).sendKeys(String.valueOf(Amount));
		if (Amount > 10000) {
			JOptionPane.showMessageDialog(null, "Invalid Budget Amount, Budget Should be Between $250 and $10000");
		}
	}

	public void click_SchedulePage2of3NextButton() {
		webDriverWaits.WaitForElementIsEnabled(schedulePage2of3_NextButton, 90);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement LogIn = driver.findElement(schedulePage2of3_NextButton);
					LogIn.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a  StaleElementReferenceException");
					count = count + 1;
				}

			}
		}
	}

	public void verify_BudgetAmount() {
		String budgetValue = driver.findElement(yourBudget_Amount).getText();
		System.out.println("your Budget amount is :" + budgetValue);
	}

	public void wait_For_CustomCampaignBoxNextButton() {
		webDriverWaits.WaitForElementToBeClickable(nextButton_CustomCampaignBOx, 60);
	}
	public void wait_For_MapToLoad() {
		webDriverWaits.WaitForElementToBePresent(map_Pointer, 60);
	}
	public void explicitly_Wait_For_campaignName_AlertBox() {
		webDriverWaits.WaitForElementToBeVisible(txtBox_campaignName_AlertBox, 25);
		driver.findElement(txtBox_campaignName_AlertBox).click();
	}

	public void enter_CampaignName_Or_Continue_With_Commercial(String campaignName) {
		try {
			if (driver.findElement(txtBox_campaignName_AlertBox).isDisplayed()) {
				driver.findElement(txtBox_campaignName_AlertBox).sendKeys(campaignName);
				//driver.findElement(txtBox_campaignName_AlertBox).clear();
				//driver.findElement(txtBox_campaignName_AlertBox).sendKeys(campaignName);
				driver.findElement(click_Next_Alert).click();
				driver.findElement(schedulePage3_NextButton).click();
			} else {
				System.out.println("You have already Named your campaign continuing with uploading the commercial");
			}
		} catch (NoSuchElementException e) {
			driver.findElement(schedulePage3_NextButton).click();
		}
	}

	public void enter_CampaignName_Or_Continue_With_Uploading_YourOwn_Commercial(String campaignName) {
		try {
			if (driver.findElement(txtBox_campaignName_AlertBox).isDisplayed()) {
				driver.findElement(txtBox_campaignName_AlertBox).sendKeys(campaignName);
				driver.findElement(txtBox_campaignName_AlertBox).clear();
				driver.findElement(txtBox_campaignName_AlertBox).sendKeys(campaignName);
				driver.findElement(click_Next_Alert).click();
				driver.findElement(schedulePage3_NextButton).click();
			} else {
				System.out.println("You have already Named your campaign continuing with uploading the commercial");
			}
		} catch (NoSuchElementException e) {
		}
	}

	public void click_SchedulePage3_NextButton() {
		webDriverWaits.WaitForElementToBeVisible(schedulePage3_NextButton, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement LogIn = driver.findElement(schedulePage3_NextButton);
					LogIn.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a  StaleElementReferenceException");
					count = count + 1;
				}

			}
		}

	}
	public void click_SchedulePage3_NextButton_RaiseAwareness() {
		webDriverWaits.WaitForElementToBeVisible(schedulePage3_NextButton_RaiseAwareness, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement LogIn = driver.findElement(schedulePage3_NextButton_RaiseAwareness);
					LogIn.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a  StaleElementReferenceException");
					count = count + 1;
				}

			}
		}

	}
}
