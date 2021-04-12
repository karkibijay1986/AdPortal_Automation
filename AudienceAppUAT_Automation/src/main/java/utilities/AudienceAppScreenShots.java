package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AudienceAppScreenShots {
	public static AudienceAppScreenShots adPortalScreenShots;
	public WebDriver driver;
	File source;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	public AudienceAppScreenShots(WebDriver driver) {
		this.driver = driver;
	}


	public void takeScreenShotAudienceAppUAT() {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceAppUATRegressioin_"
							+ timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalHotGBudget( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_HotG_Budget/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void takeScreenShotCreateProposalHotGImpressions( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_HotG_Impressions/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalHotGMonthlyBudgetBroadcast( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_HotG_MonthlyBudgetBroadcast/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalHotGMonthlyBudgetCalendar( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_HotG_MonthlyBudgetCalendar/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotLoginTest(String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_LogIn_feature/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalLocalBudget( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Local_Budget/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalLocalImpressions( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Local_Impressions/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotCreateProposalLocalMonthlyBudgetBroadcastAudienceAppUAT( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Local_MonthlyBudget(Broadcast)_AddSpectrumNews/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalLocalMonthlyBudgetCalendar( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Local_MonthlyBudget(Calendar)/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalInterconnectBudget( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Interconnect_Budget/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalInterconnectImpressions( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Interconnect_Impressions/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalInterconnectMonthlyBudgetBroadcast( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Interconnect_MonthlyBudget(Broadcast)/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void takeScreenShotCreateProposalInterconnectMonthlyBudgetCalendar( String filename) {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/SyncDrive/Product Development (James Harris)/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_CreateProposal_Interconnect_MonthlyBudget(Calendar)_AddSpectrumNews/"
							+ filename + timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}


