package adportalPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import utilities.WebDriverWaits;

public class RequestDashBoardPage {
	public WebDriver driver;
	public WebDriverWaits webDriverWaits;

	By button_GetStarted = By.xpath("//button[@id='new-request-btn']");
	By button_Continue = By.xpath(
			"/html[1]/body[1]/app-root[1]/div[1]/app-dashboard-new[1]/div[1]/div[2]/div[1]/app-dashboard-bucket[1]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[6]/div[1]/button[1]");
	By continue_Draft = By.xpath(
			"//datatable-row-wrapper[3]//datatable-body-row[1]//div[2]//datatable-body-cell[6]//div[1]//button[1]");
	By button_Delete = By.xpath(
			"//body[1]/app-root[1]/div[1]/app-dashboard-new[1]/div[1]/div[2]/div[1]/app-dashboard-bucket[1]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[6]/div[1]/img[1]");
	By deleteRequest_AlertBox = By.xpath(
			"//body/app-root[1]/div[1]/app-dashboard-new[1]/div[1]/div[2]/div[1]/app-dashboard-bucket[1]/app-simple-modal[1]/div[2]/div[1]/div[2]/div[2]");
	By button_YesDelete = By.xpath(
			"//body/app-root[1]/div[1]/app-dashboard-new[1]/div[1]/div[2]/div[1]/app-dashboard-bucket[1]/app-simple-modal[1]/div[2]/div[1]/div[2]/div[2]/div[3]/app-modal-footer[1]/div[2]/app-modal-button[2]/button[1]");

	public RequestDashBoardPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(driver);
	}

	public void continue_Draft() {
		driver.findElement(continue_Draft).click();
	}

	public void get_Started_Or_ContinueCamapaign() {
		webDriverWaits.WaitForElementToBeVisible(button_GetStarted, 30);
		try {
			if (driver.findElement(button_Continue).isDisplayed()) {
				System.out.println("Continuing with the Draft Camapaign");
				driver.findElement(button_Continue).click();
			} else {
				System.out.println("This is you first camapaign creation, You are ready to get started");
				driver.findElement(button_GetStarted).click();
			}
		} catch (NoSuchElementException e) {
			driver.findElement(button_Continue).click();
		}
	}

	public void explicitly_Wait_For_GetStartedButton() {
		webDriverWaits.WaitForElementToBeVisible(button_GetStarted, 20);
	}

	public void click_GetStarted() {
		driver.findElement(button_GetStarted).click();
	}

	public void explicitly_Wait_For_ContinueButton() {
		webDriverWaits.WaitForElementToBeVisible(button_Continue, 25);
	}

	public void click_Continue() {
		driver.findElement(button_Continue).click();
	}
	public void get_Started_Campaign() {
		webDriverWaits.WaitForElementToBeVisible(button_GetStarted, 60);
		driver.findElement(button_GetStarted).click();
	}
	// This is to verify Request Dashboard with Drafts
	public void request_DashBoardPage_With_Drafts_verification() {
		String expectedTitle = "SPP - Creative Requests";
		String actualTitle = driver.getTitle();
		System.out.println("The Title of Request DashBoard page is:" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("You have landed on the Request DashBoard page");
		} else {
			System.out.println("Please revisit LogIn page and enter valid credentials");
		}
	}

	public void delete_DraftCampaign() {
		webDriverWaits.WaitForElementToBeClickable(button_Delete, 40);
		if (driver.findElement(button_Delete).isDisplayed()) {
			driver.findElement(button_Delete).click();
			driver.findElement(deleteRequest_AlertBox);
			driver.findElement(button_YesDelete).click();
			driver.findElement(button_GetStarted).click();

			if (!driver.findElement(button_Delete).isDisplayed()) {
				driver.findElement(button_GetStarted).click();
			}
		} else {
			System.out.println(" There is no draft campaign to delete");
		}
	}

	// This is to verify New request DashBoard "Welcome to your campaign and
	// commercial dashboard.
	public void new_Request_DashBoard_Verification() {
		String expectedTitle = "Spectrum Reach Ad Portal";
		String actualTitle = driver.getTitle();
		System.out.println("The Title this page is:" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Welcome to your campaign and commercial dashBoard Page");
		} else {
			System.out.println("Please revisit sign up page to create new log in credentials");
		}
	}

}
