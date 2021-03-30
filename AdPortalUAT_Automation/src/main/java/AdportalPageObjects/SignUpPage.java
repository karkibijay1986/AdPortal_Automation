package AdportalPageObjects;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverWaits;


public class SignUpPage {
	public WebDriver driver;
	public WebDriverWaits webDriverWaits;
	
	By txtBox_Email = By.xpath("//input[@id='email']");
	By txtBox_confirmEmail = By.xpath("//input[@id='confirm-email']");
	By txtBox_Password = By.xpath("//input[@id='password']");
	By txtBox_ConfirmPassword = By.xpath("//input[@id='confirm-password']");
	By WebElement_checkBox = By.id("terms-condition_span");
	By WebElement_nextStep = By.xpath("//button[contains(text(),'Next Step')]");
	By txtBox_FirstName = By.xpath("//input[@id='firstName']");
	By txtBox_LastName = By.xpath("//input[@id='lastName']");
	By txtBox_BusinessName = By.xpath("//input[@id='businessName']");
	By txtBox_ZipCode = By.xpath("//input[@id='zipCode']");
	By txtBox_PhoneNumber = By.xpath("//input[@id='businessPhone']");
	By click_createAccount = By.xpath("//button[contains(text(),'Create Account')]");
	By signuplogInLink = By.linkText("Login");
	String SignUpURL = "https://adportal.uat.stage.frequence.rocks/202003-sign-up-b";
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(driver);
	}
	
	public void navigateTo_SignUpPage() {
		driver.get(SignUpURL);
		webDriverWaits.WaitForElementToBeVisible(signuplogInLink, 30);
	}

	public void click_SignuplogInLink() {
		driver.findElement(signuplogInLink).click();
	}

	public void enter_FirstName(String firstname) {
		webDriverWaits.WaitForElementToBePresent(txtBox_FirstName, 30);
		driver.findElement(txtBox_FirstName).sendKeys(firstname);
	}

	public void enter_LastName(String lastname) {
		driver.findElement(txtBox_LastName).sendKeys(lastname);
	}

	public void enter_BusinessName(String businessName) {
		driver.findElement(txtBox_BusinessName).sendKeys(businessName);
	}

	public void enter_ZipCode(String zipCode) {
		driver.findElement(txtBox_ZipCode).sendKeys(zipCode);
	}

	public void enter_PhoneNumber(String phoneNumber) {
		driver.findElement(txtBox_PhoneNumber).sendKeys(phoneNumber);
	}

	public void enter_Email(String email) {
		driver.findElement(txtBox_Email).sendKeys(email);
	}

	public void enter_ConfirmEmail(String confirmEmail) {
		driver.findElement(txtBox_confirmEmail).sendKeys(confirmEmail);
	}

	public void enter_Password(String password) {
		driver.findElement(txtBox_Password).sendKeys(password);
	}

	public void eneter_ConfirmPassword(String confirmpassword) {
		driver.findElement(txtBox_ConfirmPassword).sendKeys(confirmpassword);
	}

	public void click_CheckBox() {
		driver.findElement(WebElement_checkBox).click();
	}

	public void click_nextStep() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		WebElement nextStep = driver.findElement(WebElement_nextStep);
		if (nextStep.isDisplayed() || nextStep.isEnabled())
			nextStep.click();
		else
			System.out.println("Element not found");
	}
	public void click_Login() {
		webDriverWaits.WaitForElementToBeVisible(signuplogInLink,30);
		WebElement logIn = driver.findElement(signuplogInLink);
		if (logIn.isDisplayed() || logIn.isEnabled())
			logIn.click();
		else {
			System.out.println("Login button is not enabled");
		}
	}
	 public void click_CreateAccountNewCustomer () {
		 driver.findElement(click_createAccount).click();
	 }
	 public void click_CreateAccountSSULogIn () {
		 driver.findElement(click_createAccount).click();
	 }

}
