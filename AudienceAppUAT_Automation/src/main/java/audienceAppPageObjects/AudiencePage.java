package audienceAppPageObjects;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import factory.DriverFactory;
import utilities.WebDriverWaits;

public class AudiencePage{
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	By selection_Demographics = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[1]/button[1]");
	By demographics_Gender_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/button[1]/span[1]");
	By checkBox_Gender_Male = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/div[1]/div[1]/div[1]/div[1]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBOx_Gender_Female = By.xpath("//input[@id='gender_0']");
	By click_Gender_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/div[1]/div[1]/div[1]/div[3]/app-text-button[1]/button[1]");
	By demographics_Age_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[2]/button[1]/span[1]");
	By checkBox_Age_18To49 = By.id("age_0");
	By checkBox_Age_18To34 = By.id("age_1");
	By checkBox_Age_25To54 = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[2]/div[1]/div[1]/div[1]/div[3]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Age_35To49 = By.id("age_3");
	By checkBox_Age_Over50 = By.id("age_4");
	By checkBox_Age_Over65 = By.id("age_5");
	By click_Age_SelectAll = By.xpath("//div[@class='panel-collapse in collapse']//p[contains(text(),'Select All')]");
	By demographics_Income_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/button[1]/span[1]");
	By checkBox_Income_1Kto25K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[1]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_25Kto50K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[2]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_50Kto75K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[3]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_75Kto100K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[3]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_100Kto150K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[5]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_150Kto200K = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[6]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Income_200KPlus = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[6]/app-string-checkbox[1]/label[1]/img[1]");
	By click_Income_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/div[1]/div[1]/div[1]/div[8]/app-text-button[1]/button[1]");
	By demographics_PresenceOfChildren_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[4]/button[1]/span[1]");
	By radioButton_HasChildren = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[4]/div[1]/div[1]/div[1]/div[1]/app-radio[1]/label[1]/img[1]");
	By radioButton_NoChildren = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[4]/div[1]/div[1]/div[1]/div[2]/app-radio[1]/label[1]/img[1]");
	By click_PresenceOfChildren_ClearSelection = By.cssSelector(
			"body.theme-charter.overRideBackground:nth-child(2) div.main-container:nth-child(3) div.content-container.ng-scope div.audience.container-fluid.audience-container.ng-scope div.row.sticky-footer-fix div.col-xs-8.col-sm-8.col-md-9.dataco-map.no-padding div.col-sm-12.no-padding.audience-panel div.sub-categories.col-sm-7.col-md-8.no-padding:nth-child(1) uib-accordion.col-xs-12.col-md-12.no-padding.sub-category-accordian div.panel-group div.panel-default.panel.ng-scope.ng-isolate-scope.panel-open:nth-child(4) div.panel-collapse.in.collapse div.panel-body ul.ng-scope:nth-child(2) li.sub-categorie-level.col-md-12.col-xs-12.no-padding > span.clearSelection.singleSelect.col-md-12.col-xs-12.ng-binding:nth-child(3)");
	By demographics_MaritalStatus_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[5]/button[1]/span[1]");
	By radioButton_Married = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[5]/div[1]/div[1]/div[1]/div[1]/app-radio[1]/label[1]/img[1]");
	By radioButton_Single = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[5]/div[1]/div[1]/div[1]/div[2]/app-radio[1]/label[1]/img[1]");
	By click_Married_ClearSelection = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/uib-accordion[1]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[1]/span[1]");
	By demographics_EducationLevel_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/button[1]/span[1]");
	By checkBox_LessThanHighSchoolDiploma = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[1]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBOx_HighSchoolDiploma = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[1]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBOx_SomeCollege = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[3]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBOx_BachelorDegree = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[4]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBOx_GraduateDegreePlus = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[5]/app-string-checkbox[1]/label[1]/img[1]");
	By click_EducationLevel_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[6]/div[1]/div[1]/div[1]/div[6]/app-text-button[1]/button[1]");
	By demographics_HomeOwner_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[7]/button[1]/span[1]");
	By radioButton_HomeOwner = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[7]/div[1]/div[1]/div[1]/div[1]/app-radio[1]/label[1]/img[1]");
	By radioButton_Renter = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[7]/div[1]/div[1]/div[1]/div[2]/app-radio[1]/label[1]/img[1]");
	By click_HomeOwner_ClearSelection = By
			.xpath("//body/div/div/div/div/div/div/div/div/uib-accordion/div/div[7]/div[2]/div[1]/ul[1]/li[1]/span[1]");
	By demographics_Ethnicity_Link = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/button[1]/span[1]");
	By checkBox_Hispanic = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/div[1]/div[1]/div[1]/div[1]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Black = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/div[1]/div[1]/div[1]/div[2]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_Asian = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/div[1]/div[1]/div[1]/div[3]/app-string-checkbox[1]/label[1]/img[1]");
	By checkBox_CaucassianOther = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/div[1]/div[1]/div[1]/div[4]/app-string-checkbox[1]/label[1]/img[1]");
	By click_Ethinicity_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[8]/div[1]/div[1]/div[1]/div[5]/app-text-button[1]/button[1]");
	By click_Propensity = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[2]/button[1]");
	By click_Auto = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[1]/app-proposal-sidebar[1]/div[1]/div[1]/app-proposal-section-button[3]/button[1]");
	By click_Auto_AutoOwnership = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/button[1]/span[1]");
	By click_AutoOwnershipExpansion = By.xpath(
			"//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/span[1]/p[1]/i[1]");
	By click_InGarageCar = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/div[1]/div[1]/div[1]/div[17]/app-string-checkbox[1]/label[1]/img[1]");
	By Click_AutoOwnerShip_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[1]/div[1]/div[1]/div[1]/div[21]/app-text-button[1]/button[1]");
	By Click_AutoManufacturer = By.cssSelector(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[2]/button[1]/span[1]");
	By checkBox_Automanufacturer_GM = By.id("auto_manufacturer_0");
	By checkBox_Automanufacturer_Ford = By.id("auto_manufacturer_1");
	By checkBox_Automanufacturer_Toyota = By.id("auto_manufacturer_2");
	By checkBox_Automanufacturer_Chrysler = By.id("auto_manufacturer_3");
	By checkBox_Automanufacturer_Honda = By.id("auto_manufacturer_4");
	By checkBox_Automanufacturer_Chevy = By.id("auto_manufacturer_5");
	By checkBox_Automanufacturer_Nissan = By.id("auto_manufacturer_6");
	By click_AutoManufacturer_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[2]/div[1]/div[1]/div[1]/div[22]/app-text-button[1]/button[1]");
	By click_InTheMarketForAnAuto = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/button[1]/span[1]");
	By click_InTheMarketForAnAuto_SelectAll = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-form[1]/form[1]/app-accordion[3]/button[1]/span[1]");
	By audiencePage_NextButton = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-audience[1]/div[1]/div[2]/app-next-button[1]/button[1]");

	public AudiencePage(WebDriver driver) {
		this.executor = (JavascriptExecutor) this.driver;
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
		
	}


	public void page_Scroll_Down() throws AWTException {

		JavascriptExecutor executor = (JavascriptExecutor) (DriverFactory.getDriver());
		executor.executeScript("window.scrollBy(0,250)");
	}

	public void click_Demographics() {
		webDriverWaits.WaitForElementToBeVisible(selection_Demographics, 30);
		WebElement demographics = driver.findElement(selection_Demographics);
		Actions actions = new Actions(driver);
		actions.moveToElement(demographics).click().build().perform();
	}

	public void select_Gender_SelectAll() {
		webDriverWaits.WaitForElementToBeVisible(demographics_Gender_Link, 60);
		driver.findElement(demographics_Gender_Link).click();
		webDriverWaits.WaitForElementToBeVisible(click_Gender_SelectAll, 60);
		driver.findElement(click_Gender_SelectAll).click();
	}

	public void select_Gender_Male() {
		webDriverWaits.WaitForElementToBeVisible(demographics_Gender_Link, 60);
		driver.findElement(demographics_Gender_Link).click();
		webDriverWaits.WaitForElementToBeVisible(checkBox_Gender_Male, 60);
		driver.findElement(checkBox_Gender_Male).click();
	}

	public void select_Age_SelectAll() {
		webDriverWaits.WaitForElementToBeVisible(demographics_Age_Link, 60);
		driver.findElement(demographics_Age_Link).click();
		webDriverWaits.WaitForElementToBeVisible(click_Age_SelectAll, 60);
		driver.findElement(click_Age_SelectAll).click();
	}

	public void select_Age_Select18to49() {
		driver.findElement(demographics_Age_Link).click();
		driver.findElement(checkBox_Age_18To49).click();
	}

	public void select_Age_Select25to54() {
		webDriverWaits.WaitForElementToBeVisible(demographics_Age_Link, 30);
		driver.findElement(demographics_Age_Link).click();
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement Age25to54 = driver.findElement(checkBox_Age_25To54);
					Age25to54.click();
					clicked = true;
				} catch (ElementNotInteractableException e) {
					e.toString();
					System.out.println("Recovering from ElementNotInteractableException");
					count = count + 1;
				}
			}
		}
	}

	public void select_Income_SelectAll() {
		webDriverWaits.WaitForElementToBeVisible(demographics_Income_Link, 30);
		driver.findElement(demographics_Income_Link).click();
		webDriverWaits.WaitForElementToBeVisible(click_Income_SelectAll, 30);
		driver.findElement(click_Income_SelectAll).click();
	}

	public void select_Income_Select50KTo75K() {
		webDriverWaits.WaitForElementToBeClickable(demographics_Income_Link, 30);
		driver.findElement(demographics_Income_Link).click();
		webDriverWaits.WaitForElementToBeClickable(checkBox_Income_50Kto75K, 30);
		driver.findElement(checkBox_Income_50Kto75K).click();
	}

	public void select_PresenceOfChildren() {
		webDriverWaits.WaitForElementToBeVisible(demographics_PresenceOfChildren_Link, 60);
		driver.findElement(demographics_PresenceOfChildren_Link).click();
		webDriverWaits.WaitForElementToBeClickable(radioButton_HasChildren, 60);
		driver.findElement(radioButton_HasChildren).click();
		/*
		 * driver.findElement(radioButton_NoChildren).click();
		 * driver.findElement(click_PresenceOfChildren_ClearSelection).click();
		 */

	}

	public void select_MaritalStatus() {
		driver.findElement(demographics_MaritalStatus_Link).click();
		driver.findElement(radioButton_Married).click();
		/*
		 * driver.findElement(radioButton_Single).click();
		 * driver.findElement(click_Married_ClearSelection).click();
		 */

	}

	public void select_MaritalStatus_Married() {
		webDriverWaits.WaitForElementToBeClickable(demographics_MaritalStatus_Link, 30);
		driver.findElement(demographics_MaritalStatus_Link).click();
		driver.findElement(radioButton_Married).click();
	}

	public void select_EducationLevel() {
		webDriverWaits.WaitForElementToBeVisible(demographics_EducationLevel_Link, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement educationLevel = driver.findElement(demographics_EducationLevel_Link);
					educationLevel.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException ");
					count = count + 1;
				}
			}
		}

		{
			webDriverWaits.WaitForElementToBeClickable(click_EducationLevel_SelectAll, 60);
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement selectAll = driver.findElement(click_EducationLevel_SelectAll);
					selectAll.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void select_HomeOwner() {
		/*
		 * { int count = 0; boolean clicked = false; while (count < 4 && !clicked) { try
		 * { WebElement homeOwner = driver.findElement(demographics_HomeOwner_Link);
		 * homeOwner.click(); clicked = true; } catch (ElementClickInterceptedException
		 * e) { e.toString();
		 * System.out.println("Recovering from ElementClickTnterceptedException"); count
		 * = count + 1; } } }
		 */
		driver.findElement(demographics_HomeOwner_Link).click();
		driver.findElement(radioButton_HomeOwner).click();
		driver.findElement(radioButton_Renter).click();
		driver.findElement(click_HomeOwner_ClearSelection).click();

	}

	public void select_HomeOwner_HomeOwner() {
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement homeOwner = driver.findElement(demographics_HomeOwner_Link);
					homeOwner.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}
		driver.findElement(demographics_HomeOwner_Link).click();
	}

	public void select_Ethinicity() {
		driver.findElement(demographics_Ethnicity_Link).click();
		driver.findElement(click_Ethinicity_SelectAll).click();
	}

	public void Slect_Propensity() {
		webDriverWaits.WaitForElementToBePresent(click_Propensity, 60);
		driver.findElement(click_Propensity).click();
	}

	public void Select_Auto() {
		webDriverWaits.WaitForElementToBeClickable(click_Auto, 60);
		driver.findElement(click_Auto).click();
	}

	public void select_AutoOwnerShip() {
		webDriverWaits.WaitForElementToBeVisible(click_Auto_AutoOwnership, 60);
		driver.findElement(click_Auto_AutoOwnership).click();
	}

	public void select_AutoOwnerShip_InGarageCar() {
		webDriverWaits.WaitForElementToBeVisible(click_InGarageCar, 60);
		driver.findElement(click_InGarageCar).click();
	}

	public void select_AutoOwnerShip_SelectAll() {
		{
			int count = 0;
			boolean clicked = false;
			while (count < 15 && !clicked) {
				try {
					WebElement selectAll = driver.findElement(Click_AutoOwnerShip_SelectAll);
					selectAll.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void select_AutoManufaturer() {
		driver.findElement(Click_AutoManufacturer).click();
	}

	public void click_AutoManufacturer_Selections() {
		driver.findElement(click_AutoManufacturer_SelectAll).click();

	}

	public void click_AutoManufacturer_SelectAll() {

		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement selectAll = driver.findElement(click_AutoManufacturer_SelectAll);
					selectAll.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void select_InTheMarketForAnAuto() {
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement marketForAnAuto = driver.findElement(click_InTheMarketForAnAuto);
					marketForAnAuto.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

	}

	public void select_InTheMarketForAnAuto_SelectAll() {
		driver.findElement(click_InTheMarketForAnAuto_SelectAll).click();
	}

	public void click_AudiencePage_NextButton() {
		webDriverWaits.WaitForElementToBeClickable(audiencePage_NextButton, 60);

		{
			int count = 0;
			boolean clicked = false;
			while (count < 3 && !clicked) {
				try {
					WebElement audiencePageNextButton = driver.findElement(audiencePage_NextButton);
					audiencePageNextButton.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

	}
}
