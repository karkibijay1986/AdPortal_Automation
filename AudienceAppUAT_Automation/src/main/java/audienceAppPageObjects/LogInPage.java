package audienceAppPageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import factory.DriverFactory;
import utilities.WebDriverWaits;

public class LogInPage{
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	String audienceAppUATLogInURL = "https://uat01.omniapp.tv/#/login";
	By txtBox_LogInEmail = By.xpath(
			"//input[@id='login-username']");
	By txtBox_LogInPassword = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-user[1]/div[1]/app-log-in[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
	By button_LogIn = By.xpath(
			"/html[1]/body[1]/app-root[1]/app-user[1]/div[1]/app-log-in[1]/div[1]/div[1]/form[1]/div[3]/button[1]");
	By button_LogIn_HotG = By.xpath("btn-login");
	By button_lets_begin = By
			.xpath("/html[1]/body[1]/app-root[1]/app-audience-app[1]/app-home[1]/div[1]/div[1]/div[1]/button[1]");
	By button_MARKET = By.xpath("//a[@class='btn dataCo-banner-button btn-primary']");
	By dropDown_OrderType = By
			.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/div[1]/span[1]");
	By LogOut = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/dataco-navbar[1]/nav[1]/div[1]/div[3]/ul[1]/li[2]/a[1]/span[1]/label[1]");

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
	}

	public void navigateTo_AudienceAppUATLogInPage() {
		driver.get(audienceAppUATLogInURL);
		driver.navigate().refresh();
	}

	public void enter_LogInEmail(String email) {
		webDriverWaits.WaitForElementToBeClickable(txtBox_LogInEmail,60);
		driver.findElement(txtBox_LogInEmail).clear();
		driver.findElement(txtBox_LogInEmail).sendKeys(email);
	}

	public void enter_LogInPassword(String password) {
		driver.findElement(txtBox_LogInPassword).clear();
		driver.findElement(txtBox_LogInPassword).sendKeys(password);

	}

	public void clickLogIn() {
		webDriverWaits.WaitForElementIsEnabled(button_LogIn, 90);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					WebElement LogIn = driver.findElement(button_LogIn);
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

	public void clickLogIn_HotGBudgetBroadcast() {
		driver.findElement(button_LogIn_HotG);
	}

	public void click_Button_LetsBegin() {
		// System.out.println("clicking on Let's Begin Button");
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement LetsBeginButton = driver.findElement(button_lets_begin);
					LetsBeginButton.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					e.toString();
					System.out.println("Recovering from a  ElementClickTnterceptedException");
					count = count + 1;
				}
			}
		}

		// webDriverWaits.WaitForElementToBeClickable(button_lets_begin,60);
		// driver.findElement(button_lets_begin).click();
	}

	public void letsBegin_Page_verification() {
		webDriverWaits.WaitForElementIsEnabled(button_lets_begin, 90);
		String expectedTitle = "AudienceApp";
		String actualTitle = driver.getTitle();
		System.out.println("The Title of this page is:" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Spectrum Reach");
		} else {
			System.out.println("Please revisit LogIn page and enter valid credentials");
		}
	}

	public void logOut_AudienceApp() {
		driver.findElement(LogOut).click();
	}
}

	