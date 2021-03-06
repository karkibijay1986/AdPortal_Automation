package adportalPageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import utilities.WebDriverWaits;

public class LogInPage {
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	By txtBox_LogInEmail = By.id("email");
	By txtBox_LogInPassword = By.id("password");
	By clickLogIn = By.xpath("//button[@class='ap-btn-large']");
	String LogInURL = "https://adportal.uat.stage.frequence.rocks/login";
	By SignUpLink = By.linkText("Sign Up");
	
	public LogInPage(WebDriver driver) {
		this.executor = (JavascriptExecutor) this.driver;
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(DriverFactory.getDriver());
		
	}

	
	public void navigateTo_LogInPage() {
		driver.get(LogInURL);
	}
	public void enter_LogInEmail(String email) {
		 webDriverWaits.WaitForElementToBeVisible(txtBox_LogInEmail, 45);
		  driver.findElement(txtBox_LogInEmail).clear();
		  driver.findElement(txtBox_LogInEmail).sendKeys(email);
	}

	public void userInPut_LogInEmail() {
		driver.findElement(txtBox_LogInEmail).clear();
		String enterEmail;
		enterEmail = JOptionPane.showInputDialog(null, "Enter your Email Address");
		driver.findElement(txtBox_LogInEmail).sendKeys(enterEmail);
		
	}

	public void enter_LogInPassword(String password) {
		driver.findElement(txtBox_LogInPassword).clear();
		driver.findElement(txtBox_LogInPassword).sendKeys(password);
	}

	public void userInPut_LogInPassword() {
		driver.findElement(txtBox_LogInPassword).clear();
		String enterPassword;
		enterPassword = JOptionPane.showInputDialog(null, "Enter your Password");
		driver.findElement(txtBox_LogInPassword).sendKeys(enterPassword);
	}
	public void click_SignUpLink_LogInPage () {
		webDriverWaits.WaitForElementToBeVisible(SignUpLink, 60);
		driver.findElement(SignUpLink).click();
	}
	public void click_SignUpLink_LogInPage_SSULogIn () throws InterruptedException {
		driver.findElement(SignUpLink).click();
	}
	public void clickLogIn() {
		driver.findElement(clickLogIn).click();
	}

	public void page_Scroll_Down() {
		executor.executeScript("window.scrollBy(0,100)");
	}
}
