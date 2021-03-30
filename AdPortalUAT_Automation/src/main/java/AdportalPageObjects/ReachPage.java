package AdportalPageObjects;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.AdPortalScreenShots;
import utilities.WebDriverWaits;

public class ReachPage {
	public WebDriver driver;
	public WebDriverWaits webDriverWaits;

	public ReachPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(driver);
	}
	By next_Button = By.partialLinkText("Next");
	By get_Started_Button_For_NewUser = By.partialLinkText("Get Start");
	By link_Help_Center = By.partialLinkText("Help Center");
	By faq_Header = By.className("faq-header");
	By faq_GettingStarted = By.id("gettingstarted");
	By faq_BookingACampaign = By.id("mycampaigns");
	By faq_Commercials = By.id("mycommercials");
	By faq_PaymentsAndRefunds = By.id("payments");
	By faq_Technical = By.id("technical");
	By reach_Intro_Page_Title = By.xpath("//div[contains(text(),'Reach the customers you need.')]");
	By reachPage_NextButton = By.xpath("//a[@class='ap-btn button-right ng-star-inserted']");
	By get_Text_From_ReachPage1_ = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-goals[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-page-header[1]/div[1]/h1[1]");
	By button_BuildBrandRecognition = By.className("flex-sm-column");
	By button_PromoteASaleOrEvent = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-goals[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-goals-card[2]");
	By reachPage1_NextButton = By.partialLinkText("Next");
	By txtBox_AddressField = By.xpath("//input[@name='businessLocation']");
	By headerTitle = By.xpath("//div[@class='header large ng-star-inserted']");
	By distanceArrowdropdown = By.xpath("//span[@class='ng-arrow-wrapper']");
	By miles_2 = By.xpath("//div[@class='ng-option ng-option-selected ng-star-inserted ng-option-marked']//span[@class='ng-option-label ng-star-inserted'][contains(text(),'2 miles')]");
	By defaultDistance_50 = By.xpath("//span[contains(text(),'50 miles')]");
	By miles_20 = By.xpath("//span[contains(text(),'20 miles')]");
	By miles_30 = By.xpath("//span[contains(text(),'30 miles')]");
	By miles_40 = By.xpath("//span[contains(text(),'40 miles')]");
	By reachPage2_NextButton = By.partialLinkText("Next");
	By distance_Recommendation_Alert_Box = By.xpath("//div[contains(text(),'Distance Recommendation')]");
	By distance_Recommendation_Use_My_Selection = By.xpath("//app-modal-button[1]//button[1]");
	By reachPage3_NextButton = By.partialLinkText("Next");
	By age18_14_Label = By.xpath("//label[contains(text(),'18 - 49')]");
	By audience_Male = By.xpath("//span[contains(text(),'Male')]");
	By audice_Female = By.xpath("//span[contains(text(),'Female')]");

	public void verify_Reach_Intro_Page_Title() {
		String expectedTitle = "SPP - Creative Requests";
		String actualTitle = driver.getTitle();
		System.out.println("The Title of the reach intro page is :" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("You have landed on the Reach intro page");
		} else {
			System.out.println("This is not an intro page");
		}
	}
	public void verify_Reach_Intro_Page_Title_For_NewUser() {
		webDriverWaits.WaitForElementToBePresent(get_Started_Button_For_NewUser,60);
		String expectedTitle = "SPP - Creative Requests";
		String actualTitle = driver.getTitle();
		System.out.println("The Title of the reach intro page is :" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("You have landed on the Reach intro page");
		} else {
			System.out.println("This is not an intro page");
		}
	}

	public void explicitly_Wait_For_ReachPageNextButton() {
		webDriverWaits.WaitForElementToBePresent(reachPage_NextButton,30);
	}

	public void click_ReachPageNextButton() {
		driver.findElement(reachPage_NextButton).click();
	}
	public void explicitly_Wait_For_ReachPageGetStartedButton() {
		webDriverWaits.WaitForElementToBePresent(get_Started_Button_For_NewUser,30);
	}

	public void click_ReachPageGetStartedButton() {
		driver.findElement(get_Started_Button_For_NewUser).click();
	}
	
	public void waitForHelpCenterLinkToBeClickable() {
		webDriverWaits.WaitForElementToBeClickable(link_Help_Center,15000);
		
	}
	public void click_ReachPageHelpCenterLink() {
		webDriverWaits.WaitForElementToBeVisible(link_Help_Center,9000);
		driver.findElement(link_Help_Center).click();
	}
	public void explicitly_Wait_For_FAQ_Links() {
		webDriverWaits.WaitForElementToBeVisible(faq_Header,25);
	}
// This function is no longer used after Empty Dashboard removal in Adportal
	public void verify_FAQ_Header() {
		String expectedHeader = "Frequently Asked Questions";
		String actualHeader = driver.findElement(faq_Header).getText();
		System.out.println("The header of this page is :" + actualHeader);
		Assert.assertEquals(expectedHeader, actualHeader);
	}
	// This function is no longer used after Empty Dashboard removal in Adportal
	public void click_LinkText() {
		AdPortalScreenShots adPortalScreenShots;
		String hrefValue = null;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			hrefValue = links.get(i).getAttribute("href");
			if (hrefValue != null) {
				if (hrefValue.contains("center")) {
					System.out.println(hrefValue + " = internal domain");
					links.get(i).click();
					ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs.get(1));
					adPortalScreenShots = new AdPortalScreenShots(driver);
					adPortalScreenShots.takeScreenShotHelpCenter_FAQ("FAQ_Link_");
					driver.close();
					driver.switchTo().window(tabs.get(0));
				} 
				else {
					System.out.println(hrefValue + " = external domain");
				}
			}
			else {
				System.out.println("element doesn't have href attriubte");
			}
		}
	}
	
	public void click_FAQS_And_TakeScreenShots() {
		AdPortalScreenShots adPortalScreenShots;
		adPortalScreenShots = new AdPortalScreenShots(driver);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		webDriverWaits.WaitForElementToBePresent(faq_GettingStarted, 30);
		driver.findElement(faq_GettingStarted).click();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("Getting_started_");
		driver.findElement(faq_BookingACampaign).click();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("Booking_A_Campaign_");
		driver.findElement(faq_Commercials).click();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("Commercials_");
		driver.findElement(faq_PaymentsAndRefunds).click();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("PaymentAndRefunds_");
		driver.findElement(faq_Technical).click();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("Technical_");
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}
	
	
	public void get_Text_From_ReachPage1() {
		String text = driver.findElement(get_Text_From_ReachPage1_).getText();
		System.out.println("The text of title is :" + text);
	}

	public void explicitly_Wait_For_RaiseAwarenessButton() {
		webDriverWaits.WaitForElementToBePresent(button_BuildBrandRecognition,30);
	}

	public void select_RaiseAwareness() {
		webDriverWaits.WaitForElementToBeVisible(button_BuildBrandRecognition,30);
		driver.findElement(button_BuildBrandRecognition).click();
	}

	public void select_PromoteYourEvent() {
		driver.findElement(button_PromoteASaleOrEvent).click();
	}

	public void click_ReachPage1NextButton() {
		driver.findElement(reachPage1_NextButton).click();

	}

	public void explicitly_Wait_For_AddressEntry() {
		webDriverWaits.WaitForElementToBePresent(txtBox_AddressField,50);
	}

	public void enter_Address(String address) {
		webDriverWaits.WaitForElementToBeVisible(txtBox_AddressField,60);
		driver.findElement(txtBox_AddressField).clear();
		driver.findElement(txtBox_AddressField).clear();
		driver.findElement(txtBox_AddressField).sendKeys(address);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ENTER);
	}

	public void UserInPut_Address() {
		driver.findElement(txtBox_AddressField).clear();
		String EnterAddress;
		EnterAddress = JOptionPane.showInputDialog(null, "Enter your Address");
		driver.findElement(txtBox_AddressField).sendKeys(EnterAddress);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(txtBox_AddressField).sendKeys(Keys.ENTER);
	}

	public void click_HeaderTtile() {
		driver.findElement(headerTitle).click();
	}

	public void click_DropDownArrow() {
		driver.findElement(distanceArrowdropdown).click();
	}

	public void enter_Distance() {
		driver.findElement(defaultDistance_50).click();
	}

	public void clickDistance_JSExecutor() {
		WebElement defaultDistance = driver.findElement(defaultDistance_50);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", defaultDistance);
	}
	
	public void click_Use_My_Selection() {
		if (driver.findElement(distance_Recommendation_Alert_Box).isDisplayed()) {
			driver.findElement(distance_Recommendation_Use_My_Selection).click();

		} else {
			System.out.println("Distance Recommendation is not displayed");
		}

	}

	public void UserInPut_Distance() {
		String enterDistance;
		enterDistance = JOptionPane.showInputDialog(null, "Enter your Distance in miles");
		if (enterDistance.equals("2")) {
			driver.findElement(miles_2).click();

		} else if (enterDistance.equals("20")) {
			driver.findElement(miles_20).click();
		}

		else if (enterDistance.equals("30")) {
			driver.findElement(miles_30).click();

		} else if (enterDistance.equals("40")) {
			driver.findElement(miles_40).click();
		}

		if (enterDistance.equals("50")) {
			driver.findElement(defaultDistance_50).click();
		}

		else {
			System.out.println("Please enter valid Distance in miles");
		}
	}

	public void Select_2Miles() {
		driver.findElement(miles_2).click();
	}

	public void Select_50Miles() {
		driver.findElement(defaultDistance_50).click();
	}

	public void Select_20Miles() {
		driver.findElement(miles_20).click();
	}

	public void Select_30Miles() {
		driver.findElement(miles_30).click();
	}

	public void Select_40Miles() {
		driver.findElement(miles_40).click();
	}

	public void click_ReachPage2NextButton() {
		System.out.println("clicking on Next Button");
		{
			int count = 0;
			boolean clicked = false;
			while (count < 8 && !clicked) {
				try {
					WebElement reachPage2NextButton = driver.findElement(reachPage2_NextButton);
					reachPage2NextButton.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + e.getMessage());
					count = count + 1;
				}
			}
		}

	}

	public void uncheck_Check_Age18_49Button() {
		driver.findElement(age18_14_Label).click();
		driver.findElement(age18_14_Label).click();
	}

	public void click_Audience_Male() {
		driver.findElement(audience_Male).click();
		driver.findElement(audience_Male).click();
	}

	public void click_ReachPage3NextButton() {
		System.out.println("clicking on Next Button again");
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement reachPage3NextButton = driver.findElement(reachPage3_NextButton);
					reachPage3NextButton.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a stale element :" + e.getMessage());
					count = count + 1;
				}
			}
		}	
	}

	public void click_ReachPage3NextButton_JSExecutor() {

		WebElement reachPage3NextButton = driver.findElement(reachPage3_NextButton);
		if (reachPage3NextButton.isEnabled()) {
			reachPage3NextButton.click();
		} else {
			System.out.println("Next button is not enabled");
		}

		try {
			reachPage3NextButton.click();
		} 
		catch (StaleElementReferenceException e) {

			WebElement reachPage3NextBtn = driver.findElement(reachPage3_NextButton);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", reachPage3NextBtn);
		}
	}


}
