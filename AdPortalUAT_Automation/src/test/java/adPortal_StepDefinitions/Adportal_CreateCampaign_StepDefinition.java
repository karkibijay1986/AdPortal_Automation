package adPortal_StepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;

import AdportalPageObjects.CommercialPage;
import AdportalPageObjects.LogInPage;
import AdportalPageObjects.ReachPage;
import AdportalPageObjects.RequestDashBoardPage;
import AdportalPageObjects.ReviewOrderPage;
import AdportalPageObjects.SchedulePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.AdPortalScreenShots;

public class Adportal_CreateCampaign_StepDefinition {
	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private RequestDashBoardPage requestDashBoardPage = new RequestDashBoardPage (DriverFactory.getDriver());
	private ReachPage reachPage = new ReachPage (DriverFactory.getDriver());
	private ReviewOrderPage reviewOrderPage = new ReviewOrderPage (DriverFactory.getDriver());
	private SchedulePage schedulePage = new SchedulePage (DriverFactory.getDriver());
	private CommercialPage commercialPage = new CommercialPage (DriverFactory.getDriver());
	private AdPortalScreenShots adPortalScreenShots = new AdPortalScreenShots (DriverFactory.getDriver());
	private JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
	
	@Given("User is on AdPortal UAT signup page and clicks log in")
	public void user_is_on_ad_portal_uat_signup_page_and_clicks_log_in() {
		logInPage.navigateTo_LogInPage();
	    
	}

	@When("User enters email and password and clicks log in")
	public void user_enters_email_and_password_and_clicks_log_in() {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Spectrum123!");
		logInPage.clickLogIn();
	}

	@Then("User should land on request dashboard page and be able to create a campaign")
	public void user_should_land_on_request_dashboard_page_and_be_able_to_create_a_campaign() {
		requestDashBoardPage.request_DashBoardPage_With_Drafts_verification();
	    
	}

	@Then("User should be able to get started with the campaign")
	public void user_should_be_able_to_get_started_with_the_campaign() {
		requestDashBoardPage.delete_DraftCampaign();
		reachPage.explicitly_Wait_For_ReachPageNextButton();
		reachPage.click_ReachPageNextButton();
		reachPage.select_RaiseAwareness();
		reachPage.click_ReachPage1NextButton();
	}

	@Then("User enters the address and selects the distance and clicks next")
	public void user_enters_the_address_and_selects_the_distance_and_clicks_next() {
		reachPage.enter_Address("Austin");
		reachPage.click_DropDownArrow();
		reachPage.clickDistance_JSExecutor();
		reachPage.click_DropDownArrow();
		reachPage.click_ReachPage2NextButton();
		reachPage.click_Use_My_Selection();
		reachPage.click_ReachPage3NextButton();
	}

	@Then("User should be able to schedule a campaign")
	public void user_should_be_able_to_schedule_a_campaign() {
		schedulePage.select_CampaignStartDate();
		schedulePage.click_Schedule1of3NextButton();
		schedulePage.waitForRecommendedPackages();
		schedulePage.click_EnterMyOwnBudget_And_EnterBudget("1000");
		schedulePage.select_CampaignLength();
		schedulePage.click_SchedulePage2of3NextButton();
	}

	@Then("User should be able to review campaign")
	public void user_should_be_able_to_review_campaign() throws InterruptedException {
		schedulePage.wait_For_CustomCampaignBoxNextButton();
		Thread.sleep(3000);
		adPortalScreenShots.takeScreenShotCreateCampaign("Review_YourCampaign_Top_");
		js.executeScript("window.scrollBy(0,800)");
		adPortalScreenShots.takeScreenShotCreateCampaign("Review_YourCampaign_Bottom_");
		schedulePage.click_SchedulePage3_NextButton();
	}

	@Then("User should be able to name their campaign and upload commercial")
	public void user_should_be_able_to_name_their_campaign_and_upload_commercial() throws AWTException, InterruptedException {
		schedulePage.enter_CampaignName_Or_Continue_With_Commercial("TestCampaign");
		commercialPage.enter_Things_To_KnowAbout1("Test1");
		commercialPage.enter_Things_To_KnowAbout2("Test2");
		commercialPage.enter_Things_To_KnowAbout3("Test3");
		commercialPage.enter_Commercial_TagLine("Commercial tagline");
		commercialPage.click_commercial_UploadBox();
		commercialPage.click_ImageRights_CheckBox();
		commercialPage.click_CommericialPage1_NextButton();
		commercialPage.convert_Your_Customers("Give us a call");
		commercialPage.enter_Street_Address("6501 S Fiddlers Green cir");
		commercialPage.enter_Apartment("007");
		commercialPage.enter_City("Greenwood Village");
		commercialPage.select_State("CO");
		commercialPage.enter_Zip_Code("80111");
		commercialPage.enter_PhoneNumber("1234567890");
		commercialPage.enter_Email_Address("MSTestEmail@charter.com");
		commercialPage.enter_Website_URL("Adportal.com");
		commercialPage.enter_FaceBook_URL("ProductQAfacebook.com");
		commercialPage.enter_Other_Way_To_Contact("MSolutionsTestemail@charter.com");
		commercialPage.enter_Other_Message_For_Audience("This is a test campaign");
		commercialPage.click_commercialPage2_NextButton();
		commercialPage.select_No_Voice_Preference();
		//commercialPage.select_No_Music_Preference();
		commercialPage.select_No_Color_Preference();
		commercialPage.enter_Special_Instructions("Stay home and watch your campaign air");
		commercialPage.click_CommercialPage3_NextButton();
		adPortalScreenShots.takeScreenShotCreateCampaign("ReviewYourOrder_Top_");
		js.executeScript("window.scrollBy(0,1000)");
		adPortalScreenShots.takeScreenShotCreateCampaign("ReviewYourOrder_Bottom_");
		reviewOrderPage.click_place_OrderButton();
	}

	@Then("User should be able to enter credit card information and place an order")
	public void user_should_be_able_to_enter_credit_card_information_and_place_an_order() {
		reviewOrderPage.enter_Credit_Card_FirstNAme("zztestspp");
		reviewOrderPage.enter_Credit_Card_LastName("Solutions");
		reviewOrderPage.enter_Credit_Card_Number("1234567890123456");
		reviewOrderPage.select_Credit_Card_Expiration_Month();
		reviewOrderPage.select_Credit_Card_Expiration_Year("2024");
		reviewOrderPage.enter_Credit_Card_SecurtiyCode("7777");
		reviewOrderPage.enter_Billing_Street_Address("6399 S Fiddlers Green cir");
		reviewOrderPage.enter_Billing_Apt("007");
		reviewOrderPage.enter_Billing_Zip_Code("80111");
		reviewOrderPage.enter_Billing_City("Greenwood Village");
		reviewOrderPage.select_dropDown_Billing_State("CO");
		reviewOrderPage.enter_Billing_Phone_Number("9876543210");
		adPortalScreenShots.takeScreenShotCreateCampaign("CheckOutPage_Top_");
		js.executeScript("window.scrollBy(0,1000)");
		adPortalScreenShots.takeScreenShotCreateCampaign("CheckOutPage_Bottom_");
	}


}
