package audienceAppPageObjects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import utilities.WebDriverWaits;

public class MarketPage {
	
	public WebDriver driver;
	public WebDriverWaits webDriverWaits;
	JavascriptExecutor executor;

	By dropDown_OrderType = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]/div[1]/div[3]/input[1]");
	By dropDown_Local = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]");
	By dropDown_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]");
	By dropDown_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]");
	By dropDown_DMA = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/div[1]");
	By tagName_DMADropdown = By.tagName("input");
	By tagName_dmaLocation = By.tagName("div");
	By dma_Austin_Local = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]");
	By dma_Austin_Interconnect = By.xpath(
			"/html/body/app-root/app-audience-app/app-proposal/app-market/div/div/div[1]/div[4]/ng-select/ng-dropdown-panel/div/div[2]/div[2]");
	By dropDown_AdZones = By.xpath("//input[@placeholder='Search Syscodes/Ad zones']");
	By adZones_Austin_cental_North = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By adZones_Austin_cental_South = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[2]/div[1]/div[1]/span[1]");
	By ad_Zones_ATnT_Austin = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[8]/div[1]/div[1]/span[2]");
	By ad_Zones_Austin_ATT_RoundRock = By.xpath("//span[contains(text(),'Austin ATT Round Rock')]");
	By ad_Zones_AustinAndRoundRock = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[3]/div[1]/div[1]/span[1])");
	By adZones_Austin_Master_Zone = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[7]/div[1]/div[1]/span[1]");
	By adZones_Austin_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By adZones_ChautauquaNY = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]");
	By dma_BuffaloNY = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[11]/span[1]/div[1]");
	By dma_CharlotteNC = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[14]/span[1]/div[1]");
	By dma_CharlotteNC_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]");
	By adZones_HotGNorthCarolina = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By dma_CharlotteNC_Interconnect = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[11]/span[1]/div[1]");
	By adZones_CharlotteMasterRegion = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[12]/div[1]/div[1]/span[1]");
	By adZones_Charlotte_Interconnect = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[3]/div[1]/div[1]/div[1]/span[2]");
	By dma_BirminghamAL = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[10]/span[1]");
	By adZones_BirminghamMaster = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[9]/div[1]/div[1]/span[1]");
	By dma_LosAngelesCA = By
			.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[49]/span[1]");
	By adzones_LAMasterZoneRegion = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[7]/div[1]/div[1]/span[1]");
	By dma_CincinnatiOH = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[15]");
	By dma_KansasCityMO = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[34]/span[1]/div[1]");
	By dma_NY_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]");
	By adZones_NY_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By adZones_KansasCity_Interconnect = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[3]/div[1]/div[1]/div[1]/span[2]");
	By dma_Columbus_Interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[15]");
	By adZones_Columbus_interconnect = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By dma_BirminghamAL_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]");
	By adZones_HotGAlabama = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By dma_DFWTX_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[6]");
	By dma_NY_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[3]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]");
	By adZones_HotGTexas = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By adZones_HotGMassachusetts = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By dma_LosAngelesCA_HotG = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[9]");
	By adZones_HotGCalifornia = By
			.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[3]/div[1]/div[1]");
	By dma_ColumbiaSC_HotG = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/ul[1]/li[1]/div[6]/span[1]/div[1]");
	By dma_Columbus_HotG = By.xpath(
			"//body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[4]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[5]");
	By adZones_HotGColumbus = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[1]/div[5]/div[3]/app-zone[1]/div[1]/div[1]/span[1]");
	By adZones_HotGSouthCarolina = By.xpath(
			"/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[3]/div[1]/div[1]/div[1]");
	By marketPage_NextButton = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-proposal[1]/app-market[1]/div[1]/div[1]/div[2]/app-next-button[1]/button[1]");

	public MarketPage(WebDriver driver) {
		this.executor = (JavascriptExecutor) this.driver;
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
	}

	public void select_OrderType_Local() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_OrderType, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement orderType = driver.findElement(dropDown_OrderType);
					orderType.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}
		driver.findElement(dropDown_Local).click();
	}

	public void select_OrderType_Interconnect() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_OrderType, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement orderType = driver.findElement(dropDown_OrderType);
					orderType.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}
		driver.findElement(dropDown_Interconnect).click();
	}

	public void select_OrderType_HotG() {
		webDriverWaits.WaitForElementToBeClickable(dropDown_OrderType, 60);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement orderType = driver.findElement(dropDown_OrderType);
					orderType.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}
		driver.findElement(dropDown_HotG).click();
	}

	public void select_Local_DMA_AustinTX() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_Austin_Local).click();
	}

	public void select_Interconnect_DMA_AustinTX() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_Austin_Interconnect).click();
	}

	public void select_AdZones_For_AustinTX() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 60);
		webDriverWaits.WaitForElementToBeVisible(adZones_Austin_cental_North, 60);
		driver.findElement(adZones_Austin_cental_North).click();
		webDriverWaits.WaitForElementToBeVisible(adZones_Austin_cental_South, 60);
		driver.findElement(adZones_Austin_cental_South).click();
		// webDriverWaits.WaitForElementToBeVisible(ad_Zones_AustinAndRoundRock, 60);
		// driver.findElement(ad_Zones_AustinAndRoundRock).click();
		webDriverWaits.WaitForElementToBeVisible(adZones_Austin_Master_Zone, 60);
		driver.findElement(adZones_Austin_Master_Zone).click();
		// driver.findElement(ad_Zones_Austin_ATT_RoundRock).click();
	}

	public void select_InterconnectAdZones_For_AustinTX() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 60);
		webDriverWaits.WaitForElementToBeVisible(adZones_Austin_Interconnect, 60);
		driver.findElement(adZones_Austin_Interconnect).click();
	}

	public void select_DMA_BuffaloNY() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.findElement(dma_BuffaloNY).click();
	}

	public void select_DMA_BuffaloNY_RegressionFLow() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void select_AdZones_For_BuffaloNY() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_ChautauquaNY, 20);
		driver.findElement(adZones_ChautauquaNY).click();
	}

	public void select_DMA_CharlotteNC() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		/*
		 * robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);
		 * robot.setAutoDelay(1000); robot.keyPress(KeyEvent.VK_DOWN);
		 * robot.keyRelease(KeyEvent.VK_DOWN); robot.setAutoDelay(1000);
		 */
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.findElement(dma_CharlotteNC).click();
	}

	public void select_DMA_CharlotteNC_Interconnect() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_CharlotteNC_Interconnect).click();
	}

	public void select_AdZones_For_CharlotteNC() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_CharlotteMasterRegion, 20);
		driver.findElement(adZones_CharlotteMasterRegion).click();
	}

	public void select_InterconnectAdZones_For_CharlotteNC() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_Charlotte_Interconnect, 40);
		driver.findElement(adZones_Charlotte_Interconnect).click();
	}

	public void select_DMA_BirminghamAL() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.findElement(dma_BirminghamAL).click();
	}

	public void select_DMA_BirminghamAL_RegressionFlow() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void select_DMA_BirminghamAL_HotG() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_BirminghamAL_HotG).click();
	}

	public void select_AdZones_For_BirminghamAL() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_BirminghamMaster, 20);
		driver.findElement(adZones_BirminghamMaster).click();

	}

	public void select_AdZones_For_BirminghamAL_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGAlabama, 20);
		driver.findElement(adZones_HotGAlabama).click();
	}

	public void select_DMA_CharlotteNC_HotG() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_CharlotteNC_HotG).click();

	}

	public void select_AdZones_For_CharlotteNC_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGNorthCarolina, 20);
		driver.findElement(adZones_HotGNorthCarolina).click();
	}

	public void select_DMA_DFWTX_HotG() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_DFWTX_HotG).click();
	}

	public void select_DMA_NY_HotG() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_NY_HotG).click();
	}

	public void select_AdZones_HotG_Massachusetts() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGMassachusetts, 30);
		driver.findElement(adZones_HotGMassachusetts).click();
	}

	public void select_DMA() {
		driver.findElement(dropDown_DMA).click();
		WebElement elem = driver.findElement(tagName_dmaLocation);
		List<WebElement> allDMAs = elem.findElements(tagName_dmaLocation);
		for (WebElement element : allDMAs) {
			String dma = element.getText();
			if (dma.contains("Dallas")) {
				element.click();
				break;
			}

		}

	}

	public void select_AdZones_For_DFWTX_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGTexas, 30);
		driver.findElement(adZones_HotGTexas).click();
	}

	public void select_DMA_LosAngelesCA_HotG() {
		driver.findElement(dropDown_DMA).click();
		webDriverWaits.WaitForElementToBeVisible(dma_LosAngelesCA_HotG, 30);
		driver.findElement(dma_LosAngelesCA_HotG).click();
	}

	public void select_AdZones_For_LosAngeles_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGCalifornia, 30);
		driver.findElement(adZones_HotGCalifornia).click();
	}

	public void select_DMA_LosAngelesCA() {
		driver.findElement(dropDown_DMA).click();
		webDriverWaits.WaitForElementToBeVisible(dma_NY_HotG, 30);
		driver.findElement(dma_LosAngelesCA).click();
	}

	public void select_AdZones_For_LosAngelesCA() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adzones_LAMasterZoneRegion, 20);
		driver.findElement(adzones_LAMasterZoneRegion).click();
	}

	public void select_DMA_NY_Interconnect() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_NY_Interconnect).click();
	}

	public void select_AdZones_For_NY_Interconnect() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_NY_Interconnect, 20);
		driver.findElement(adZones_NY_Interconnect).click();
	}

	public void select_DMA_KansasCityMO() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_KansasCityMO).click();
	}

	public void select_InterconnectAdZones_For_KansasCityMO() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_KansasCity_Interconnect, 40);
		driver.findElement(adZones_KansasCity_Interconnect).click();
	}

	public void select_DMA_AustinTX_Interconnect() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// webDriverWaits.WaitForElementIsEnabled(dma_Austin_Interconnect, 60);
		// driver.findElement(dma_Austin_Interconnect).click();
	}

	public void select_DMA_AustinTX_Interconnect_RegressionFlow() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// webDriverWaits.WaitForElementIsEnabled(dma_Austin_Interconnect, 60);
		// driver.findElement(dma_Austin_Interconnect).click();
	}

	public void select_AdZones_For_AustinTX_Interconnect() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_Austin_Interconnect, 40);
		driver.findElement(adZones_Austin_Interconnect).click();
	}

	public void select_DMA_Columbus_HotG() {
		driver.findElement(dropDown_DMA).click();
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement orderType = driver.findElement(dma_Columbus_HotG);
					orderType.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}
		driver.findElement(dropDown_HotG).click();
	}

	public void select_AdZones_For_Columbus_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		// webDriverWaits.WaitForElementToBeVisible(adZones_HotGColumbus, 40);
		driver.findElement(adZones_HotGColumbus).click();
	}

	public void select_DMA_ColumbiaSC_HotG() {
		driver.findElement(dropDown_DMA).click();
		driver.findElement(dma_ColumbiaSC_HotG).click();
	}

	public void select_AdZones_For_ColumbiaSC_HotG() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_HotGSouthCarolina, 40);
		driver.findElement(adZones_HotGSouthCarolina).click();
	}
	

	public void select_DMA_ColumbusOH() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.findElement(dma_Columbus_Interconnect).click();
	}

	public void select_InterconnectAdZones_For_ColumbusOH() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		webDriverWaits.WaitForElementToBeVisible(adZones_Columbus_interconnect, 40);
		driver.findElement(adZones_Columbus_interconnect).click();
	}

	public void select_DMA_CincinnatiOH() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void select_DMA_CincinnatiOH_RegressionFlow() throws AWTException {
		driver.findElement(dropDown_DMA).click();
		Robot robot;
		robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void select_AdZones_For_CincinnatiOH() {
		webDriverWaits.WaitForElementToBeVisible(dropDown_AdZones, 30);
		driver.findElement(dropDown_AdZones).click();
		webDriverWaits.WaitForElementToBeVisible(adzones_LAMasterZoneRegion, 20);
		driver.findElement(adzones_LAMasterZoneRegion).click();
	}

	public void click_MarketPage_NextButton() {
		driver.findElement(marketPage_NextButton).click();
	}
}