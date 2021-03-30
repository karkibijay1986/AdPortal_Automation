package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AdPortalScreenShots {
	public static AdPortalScreenShots adPortalScreenShots;
	public WebDriver driver;
	File source;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	public AdPortalScreenShots(WebDriver driver) {
		this.driver = driver;
	}

	public void takeScreenShot() {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT AdPortalUAT Automation Test Screenshotss/AdportalRegressioin_"
							+ timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotLoginTest(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_LogIn_feature/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotSSU_SignUp(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_SSU_LogIn_feature/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotHelpCenter_FAQ(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_HelpCenter_FAQ_feature/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotCreateCampaign(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_CreateCampaign_feature/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken for the top section of the page!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShot_Upload_YourOwn_Commercial() {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_Upload_Your_Own_Commercial_feature/AdPortal_Upload_Your_Own_Commercial_feature_"
							+ timeStamp + ".png"));
			System.out.println("Screenshot Taken for the top section of the page!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void take_ScreenShot_ReachIntroPageNewCustomer(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_NewCustomer_ReachPage_feature/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void take_ScreenShot_ReachIntroPage(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_ReachIntroPage_feature/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void take_ScreenShot_RaiseAwareness_AlternativePackages(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_RaiseAwareness_AlternativePackages/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void take_ScreenShot_PromoteYourEvent_AlternativePackages(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AdPortalUAT Automation Test Screenshots/AdPortal_PromoteYourEvent_AlternativePackages/"
							+filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}


