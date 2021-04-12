package adportalPageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WebDriverWaits;

public class CommercialPage {
	public WebDriver driver;
	JavascriptExecutor executor;
	public WebDriverWaits webDriverWaits;
	
	
	By commercialPage_NextButton = By.xpath("//button[contains(text(),'Next')]");
	By link_Click_Here = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-has-commercial-question[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/u[1]");
	By upload_Your_Own_Commercial_Box = By.xpath("//body/app-root/div/app-order/div/div/div/div/section/app-creative-upload-full-page/app-card-item/div/div/div/div/div/div/div/div/div/label/div[1]");
	By enabled_Button_Next = By.xpath("//a[@class='ap-btn button-right ng-star-inserted']");
	By button_Place_order = By.id("checkout");
	By txtBox_Things_To_KnowAbout1 = By.id("brandInfo0");
	By txtBox_Things_To_KnowAbout2 = By.id("brandInfo1");
	By txtBox_Things_To_KnowAbout3 = By.id("brandInfo2");
	By txtBox_commercial_TagLine = By.id("commercialTagline");
	By commercial_Upload_Box = By.className("upload-file");
	By image_Rights_CheckBox = By.xpath("//body/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-business-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-upload-creatives[1]/label[1]");
	By CommericialPage1_NextButton = By.partialLinkText("Next");
	By txtBox_GiveUsTheDetails = By.id("specialEventDesc");
	By txtBox_EventInfo1 = By.id("eventInfo0");
	By txtBox_EventInfo2 = By.id("eventInfo1");
	By txtBox_EventInfo3 = By.id("eventInfo2");
	By ImagerightsCheckBox_GetTheirAttentionPage = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-special-event-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-upload-creatives[1]/label[1]");
	By getTheirAttentionPage_NextButton = By.partialLinkText("Next");
	By txtBox_primary_Call_To_Action = By.xpath("//input[@id='newCommercialCallToAction']");
	By box_EventStartDate = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/app-regular-date-picker[1]/input[1]");
	By box_EventEndDate = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/app-regular-date-picker[1]/input[1]");
	By calenderBox_TagName = By.tagName("div");
	By date_Button = By.tagName("button");
	By startDate = By.xpath("//input[@id='specialEventStartDate']");
	By endDate = By.xpath("//input[@id='specialEventEndDate']");
	By txtBox_Street_Address_ = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-text-input[1]/div[1]/input[1]");
	By txtBox_Apartment = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-text-input[2]/div[1]/input[1]");
	By txtBox_City = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-text-input[3]/div[1]/input[1]");
	By dropDownArrow_State = By.xpath("//body/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-select-input[1]/div[1]/ng-select[1]/div[1]/span[2]");
	By txtBox_State = By.xpath("//input[@id='state-0']");
	By txt_CO = By.xpath("//div[@id='a94da4daf3aa-5']");
	By txtBox_Zip_Code = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/app-text-input[4]/div[1]/input[1]");
	By button_SaveChanges = By.className("button-text");
	By checkBox_PhoneNumber = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-checkbox-collapsible[1]/label[1]");
	By txtBox_PhoneNumber = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-call-action-description[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/app-checkbox-collapsible[1]/app-text-input[1]/div[1]/input[1]");
	By checkBox_Email = By.xpath("//label[contains(text(),'Email')]");
	By txtBox_Email_Address = By.xpath("//input[@id='email-address']");
	By checkBox_Website = By.xpath("//label[contains(text(),'Website')]");
	By txtBox_Website_URL = By.xpath("//input[@id='website-url']");
	By checkBox_Facebook = By.xpath("//label[contains(text(),'Facebook')]");
	By textBox_Facebook = By.xpath("//input[@id='facebook-url']");
	By checkBox_Other = By.xpath("//label[contains(text(),'Other')]");
	By txtBox_Other_Way_To_Contact = By.xpath("//input[@id='other']");
	By txtBox_Other_Message_For_Audience = By.tagName("textarea");
	By commercialPage2_NextButton = By.partialLinkText("Next");
	By radioButton_No_Voice_Preference = By.xpath("//div[contains(text(),'No voice preference')]");
	By radioButton_Male_Voice = By.xpath("//div[contains(text(),'Male Voice')]");
	By radioButton_Female_Voice = By.xpath("//div[contains(text(),'Female Voice')]");
	By dropDown_MusicPreference_Arrow = By.xpath("//body/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-select-music-input[1]/div[1]/i[1]");
	By dropDown_Music_Preference = By.id("music-preference");
	By radioButton_No_Music_Preference = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/app-select-music-input[1]/ul[1]/li[1]/span[1]");
	By radioButton_Easy_Listening_Music = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/app-select-music-input[1]/ul[1]/li[2]/span[1]");
	By radioButton_Jazz_Music = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/app-select-music-input[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[3]/div[1]/span[1]");
	By radioButton_No_Color_Preference = By.xpath("//div[contains(text(),'No color preference')]");
	By radioButton_Choose_Specific_Colors = By.xpath("//div[contains(text(),'Choose specific colors')]");
	By box_Color_Blues = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/button[1]");
	By box_Color_Greens = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/button[1]");
	By box_Color_Oranges = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-order[1]/div[1]/div[2]/div[1]/div[1]/section[1]/app-creative-look-and-feel[1]/app-card-item[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[6]/button[1]");
	By txtBox_Special_Instructions = By.name("specialInstructions");
	By commercialPage3_NextButton = By.partialLinkText("Next");
	

	public CommercialPage(WebDriver driver) {
		this.driver = driver;
		webDriverWaits = new WebDriverWaits(driver);
	}
	public void click_commercialPage_NextButton() {
		driver.findElement(commercialPage_NextButton).click();
	}

	public void click_Here_Link() {
		driver.findElement(link_Click_Here).click();
	}

	public void upload_Your_Own_Commercial_Box() throws InterruptedException, AWTException {
		WebElement ownCommercialUploadBox = driver.findElement(upload_Your_Own_Commercial_Box);
		ownCommercialUploadBox.click();

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

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(80000);
	}

	public void click_Upload_YourOwnCommercialPage_Next_Button() {
			WebDriverWait wait_For_Next_Button = new WebDriverWait(driver, 300);
			wait_For_Next_Button.until(ExpectedConditions.visibilityOfElementLocated(enabled_Button_Next));

			WebElement nextButtonEnabled = driver.findElement(enabled_Button_Next);
			if (nextButtonEnabled.isEnabled()) {
				nextButtonEnabled.click();
			} else {

				System.out.println("Next button is not enabled");
			}

		
		/*
		 * try { nextButtonEnabled.click();
		 * 
		 * } catch (StaleElementReferenceException e) {
		 * driver.findElement(enabled_Button_Next).click(); }
		 */
		 
		}
	public void click_Button_Place_Order () {
		driver.findElement(button_Place_order).click();
	}

	public void enter_Things_To_KnowAbout1(String text) {
		driver.findElement(txtBox_Things_To_KnowAbout1).clear();
		driver.findElement(txtBox_Things_To_KnowAbout1).sendKeys(text);
	}

	public void enter_Things_To_KnowAbout2(String text) {
		driver.findElement(txtBox_Things_To_KnowAbout2).clear();
		driver.findElement(txtBox_Things_To_KnowAbout2).sendKeys(text);
	}

	public void enter_Things_To_KnowAbout3(String text) {
		driver.findElement(txtBox_Things_To_KnowAbout3).clear();
		driver.findElement(txtBox_Things_To_KnowAbout3).sendKeys(text);
	}

	public void enter_Commercial_TagLine(String text) {
		driver.findElement(txtBox_commercial_TagLine).clear();
		driver.findElement(txtBox_commercial_TagLine).sendKeys(text);
	}

	public void click_commercial_UploadBox() throws AWTException, InterruptedException {
		WebElement uploadBox = driver.findElement(commercial_Upload_Box);
		uploadBox.click();

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

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(8000);
	}
	public void uploadCommercial_ForRegressionTestFlow () throws InterruptedException, AWTException {
		WebElement uploadBox = driver.findElement(commercial_Upload_Box);
		uploadBox.click();

		Robot robot;
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(8000);	
	}
	
	public void complete_GetTheirAttention_Page() throws AWTException, InterruptedException {
	driver.findElement(txtBox_GiveUsTheDetails).clear();
	driver.findElement(txtBox_GiveUsTheDetails).sendKeys("This is health promotion event");
	driver.findElement(txtBox_EventInfo1).clear();
	driver.findElement(txtBox_EventInfo1).sendKeys("This event is a sport event");
	driver.findElement(txtBox_EventInfo2).clear();
	driver.findElement(txtBox_EventInfo2).sendKeys("This event is for Kids health promotion");
	driver.findElement(txtBox_EventInfo3).clear();
	driver.findElement(txtBox_EventInfo3).sendKeys("This is a commnunity event");
	
		/*
		 * WebElement uploadBox = driver.findElement(commercial_Upload_Box);
		 * uploadBox.click();
		 * 
		 * Robot robot; robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);
		 * robot.setAutoDelay(1000);
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(4000); WebElement element =
		 * driver.findElement(ImagerightsCheckBox_GetTheirAttentionPage); Actions
		 * actions = new Actions(driver);
		 * actions.moveToElement(element).click().build().perform();
		 */
	driver.findElement(getTheirAttentionPage_NextButton).click();
		
	}

	public void commercial_Upload() throws AWTException, InterruptedException {
		WebElement uploadBox = driver.findElement(commercial_Upload_Box);
		uploadBox.click();

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

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(8000);
	}

	public void click_ImageRights_CheckBox() {
		WebElement element = driver.findElement(image_Rights_CheckBox);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	public void click_CommericialPage1_NextButton() {
		driver.findElement(CommericialPage1_NextButton).click();

	}

	public void Convert_Your_customers(String text) {
		driver.findElement(txtBox_primary_Call_To_Action).clear();
		driver.findElement(txtBox_primary_Call_To_Action).sendKeys(text);
		
		
	}
	public void select_EventStartAndEndDate() {
		driver.findElement(box_EventStartDate).click();
		driver.findElement(calenderBox_TagName);
		List<WebElement> startDate = driver.findElements(date_Button);
		WebElement sDate = (WebElement) startDate.get(0);
		sDate.click();
		
		driver.findElement(box_EventEndDate).click();
		driver.findElement(calenderBox_TagName);
		List<WebElement> EndDate = driver.findElements(date_Button);
		WebElement eDate = (WebElement) EndDate.get(6);
		{
			int count = 0;
			boolean clicked = false;
			while (count < 10 && !clicked) {
				try {
					
					eDate.click();
					clicked = true;
				} catch (StaleElementReferenceException e) {
					e.toString();
					System.out.println("Trying to recover from a  StaleElementReferenceException");
					count = count + 1;
				}

			}
		}		
		
		
		
	}
	
	public void convert_Your_Customers(String callToAction) {
		driver.findElement(txtBox_primary_Call_To_Action).clear();
		driver.findElement(txtBox_primary_Call_To_Action).sendKeys(callToAction);
	}
	public void enter_startAndEndDate (String sDate, String eDate) {
		driver.findElement(startDate).sendKeys(sDate);
		driver.findElement(endDate).sendKeys(eDate);
	}
	public void enter_Street_Address(String address) {
		driver.findElement(txtBox_Street_Address_).clear();
		driver.findElement(txtBox_Street_Address_).sendKeys(address);
	}

	public void enter_Apartment(String apartment) {
		driver.findElement(txtBox_Apartment).clear();
		driver.findElement(txtBox_Apartment).sendKeys(apartment);
	}

	public void enter_City(String city) {
		driver.findElement(txtBox_City).clear();
		driver.findElement(txtBox_City).sendKeys(city);
	}

	public void select_State(String state) {
		driver.findElement(dropDownArrow_State).click();
		WebElement enter_State = driver.findElement(txtBox_State);
		enter_State.clear();
		enter_State.sendKeys(state);
		enter_State.sendKeys(Keys.ENTER);	
	}
	public void enter_Zip_Code(String zipCode) {
		driver.findElement(txtBox_Zip_Code).clear();
		driver.findElement(txtBox_Zip_Code).sendKeys(zipCode);
	}
	public void click_Button_SaveChanges() {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(button_SaveChanges));
		driver.findElement(button_SaveChanges).click();
	}
	public void enter_PhoneNumber(String phoneNumber) {
		try {
		
			if (driver.findElement(checkBox_PhoneNumber).isSelected()) {
			//driver.findElement(checkBox_PhoneNumber).click();
		driver.findElement(txtBox_PhoneNumber).clear();
		driver.findElement(txtBox_PhoneNumber).sendKeys(phoneNumber);
	}
			else {
				driver.findElement(checkBox_PhoneNumber).click();
				driver.findElement(txtBox_PhoneNumber).clear();
				driver.findElement(txtBox_PhoneNumber).sendKeys(phoneNumber);
			}
		}
		catch (NoSuchElementException e) {
			driver.findElement(checkBox_PhoneNumber).click();
	}
			
	}
	public void enter_Email_Address(String email) {
		driver.findElement(checkBox_Email).click();
		driver.findElement(txtBox_Email_Address).clear();
		driver.findElement(txtBox_Email_Address).sendKeys(email);
	}
	public void enter_Website_URL(String url) {
		driver.findElement(checkBox_Website).click();
		driver.findElement(txtBox_Website_URL).clear();
		driver.findElement(txtBox_Website_URL).sendKeys(url);
	}
	public void enter_FaceBook_URL (String fbURL) {
		driver.findElement(checkBox_Facebook).click();
		driver.findElement(textBox_Facebook).clear();
		driver.findElement(textBox_Facebook).sendKeys(fbURL);
		}
	public void enter_Other_Way_To_Contact(String contact) {
		driver.findElement(checkBox_Other).click();
		driver.findElement(txtBox_Other_Way_To_Contact).clear();
		driver.findElement(txtBox_Other_Way_To_Contact).sendKeys(contact);
	}

	public void enter_Other_Message_For_Audience(String message) {
		driver.findElement(txtBox_Other_Message_For_Audience).clear();
		driver.findElement(txtBox_Other_Message_For_Audience).sendKeys(message);
	}

	public void click_commercialPage2_NextButton() {
		driver.findElement(commercialPage2_NextButton).click();
	}

	public void select_No_Voice_Preference() {
		driver.findElement(radioButton_No_Voice_Preference).click();
	}

	public void select_Male_Voice_Preference() {
		driver.findElement(radioButton_Male_Voice).click();
	}

	public void select_Female_Voice_Preference() {
		driver.findElement(radioButton_Female_Voice).click();
	}

	public void select_No_Music_Preference() throws InterruptedException {
		driver.findElement(dropDown_MusicPreference_Arrow).click();

		while (true) {
			if (driver.findElement(radioButton_No_Music_Preference).isSelected()) {
				System.out.println("No music preference is selected");

				if (!driver.findElement(radioButton_No_Music_Preference).isSelected()) {

					break;
				}
				return;
			}
			break;
		}

		int count = 0;
		boolean clicked = false;
		while (count < 4 && !clicked) {
			try {
				WebElement NoMusicPreference = driver.findElement(radioButton_No_Music_Preference);
				NoMusicPreference.click();
				clicked = true;
			} catch (ElementClickInterceptedException e) {
				driver.findElement(radioButton_No_Music_Preference).click();
				e.toString();
				System.out.println("Trying to click the element:" + e.getMessage());
				count = count + 1;
			}
			driver.findElement(radioButton_No_Music_Preference).click();
		}
		driver.findElement(dropDown_Music_Preference).click();
	//	 Actions action = new Actions(driver); action.sendKeys(Keys.SHIFT, Keys.TAB);
	}

	public void select_Easy_Listening_Music_Preference() {
		driver.findElement(dropDown_Music_Preference).click();
		{
			int count = 0;
			boolean clicked = false;
			while (count < 4 && !clicked) {
				try {
					WebElement MusicPreference = driver.findElement(radioButton_Easy_Listening_Music);
					MusicPreference.click();
					clicked = true;
				} catch (ElementClickInterceptedException e) {
					driver.findElement(radioButton_Easy_Listening_Music).click();
					e.toString();
					System.out.println("Trying to click the element:" + e.getMessage());
					count = count + 1;

				}

			}
		}
		driver.findElement(dropDown_Music_Preference).click();

	}

	public void select_Jazz_Music_Preference() {
		driver.findElement(dropDown_Music_Preference).click();
		driver.findElement(radioButton_Jazz_Music).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.SHIFT, Keys.TAB);
	}

	public void select_No_Color_Preference() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(radioButton_No_Color_Preference)).click().perform();
	}

	public void select_Color_Preference() {
		driver.findElement(radioButton_Choose_Specific_Colors).click();
		WebDriverWait Color_Box_Blue = new WebDriverWait(driver, 60);
		Color_Box_Blue.until(ExpectedConditions.visibilityOfElementLocated(box_Color_Blues));
		driver.findElement(box_Color_Blues).click();
		driver.findElement(box_Color_Greens).click();
		driver.findElement(box_Color_Oranges).click();
	}

	public void enter_Special_Instructions(String instructions) {
		driver.findElement(txtBox_Special_Instructions).clear();
		driver.findElement(txtBox_Special_Instructions).sendKeys(instructions);
	}

	public void click_CommercialPage3_NextButton() {
		WebDriverWait wait_For_click_CommercialPage3_NextButton = new WebDriverWait(driver, 60);
		wait_For_click_CommercialPage3_NextButton
				.until(ExpectedConditions.visibilityOfElementLocated(commercialPage3_NextButton));
		driver.findElement(commercialPage3_NextButton).click();
	}

}
