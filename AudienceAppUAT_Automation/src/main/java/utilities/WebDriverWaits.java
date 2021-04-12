package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {

	
	private WebDriver driver;
	
	public WebDriverWaits(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElementToBeVisible(By by, long timeOutInSeconds){
		//logger.info("waiting for element visibilityOf..");	
	WebDriverWait waitToBevisible = new WebDriverWait(driver, timeOutInSeconds);
	waitToBevisible.until(ExpectedConditions.visibilityOfElementLocated((by)));	
	//logger.info("Element is now visible");
}
	public void WaitForElementToBeClickable(By by, long timeOutInSeconds){
		WebDriverWait waitToClickable = new WebDriverWait(driver, timeOutInSeconds);
		waitToClickable.until(ExpectedConditions.elementToBeClickable((by)));	
	}
	
	public void WaitForElementIsEnabled(By by, long timeOutInSeconds){
		WebDriverWait waitToBeEnabled = new WebDriverWait(driver, timeOutInSeconds);
		waitToBeEnabled.until(ExpectedConditions.elementToBeClickable((by)));	
	}
	public void WaitForElementToBePresent(By by, long timeOutInSeconds){
		WebDriverWait waitToBeEnabled = new WebDriverWait(driver, timeOutInSeconds);
		waitToBeEnabled.until(ExpectedConditions.presenceOfElementLocated((by)));	
	}
}
