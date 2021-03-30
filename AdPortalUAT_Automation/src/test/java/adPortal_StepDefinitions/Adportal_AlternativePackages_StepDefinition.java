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

public class Adportal_AlternativePackages_StepDefinition {
	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private RequestDashBoardPage requestDashBoardPage = new RequestDashBoardPage (DriverFactory.getDriver());
	private ReachPage reachPage = new ReachPage (DriverFactory.getDriver());
	private ReviewOrderPage reviewOrderPage = new ReviewOrderPage (DriverFactory.getDriver());
	private SchedulePage schedulePage = new SchedulePage (DriverFactory.getDriver());
	private CommercialPage commercialPage = new CommercialPage (DriverFactory.getDriver());
	private AdPortalScreenShots adPortalScreenShots = new AdPortalScreenShots (DriverFactory.getDriver());
	private JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
	
	@Given("User is on AdPortal UAT sign up page and clicks LogIn")
	public void user_is_on_ad_portal_uat_sign_up_page_and_clicks_log_in() {
		logInPage.navigateTo_LogInPage();
			}

	@When("User enters email,password and clicks log in")
	public void user_enters_email_password_and_clicks_log_in() {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Spectrum123!");
		logInPage.clickLogIn();
	}

	@Then("User should land on request dashboard page and be able to conntiune with campaign")
	public void user_should_land_on_request_dashboard_page_and_be_able_to_conntiune_with_campaign() {
		requestDashBoardPage.request_DashBoardPage_With_Drafts_verification();
	}

	@Then("User should be able to get started with the campaign creation")
	public void user_should_be_able_to_get_started_with_the_campaign_creation() {
		requestDashBoardPage.get_Started_Or_ContinueCamapaign();
		reachPage.explicitly_Wait_For_ReachPageNextButton();
		reachPage.click_ReachPageNextButton();
	}

	@Given("User selects promote your event as business goals")
	public void user_selects_promote_your_event_as_business_goals() {
		reachPage.select_PromoteYourEvent();
		reachPage.click_ReachPage1NextButton();
	}

	@When("User enters address and distance for the campaign and clicks Next")
	public void user_enters_address_and_distance_for_the_campaign_and_clicks_next() {
		reachPage.enter_Address("Charlotte");
		reachPage.click_DropDownArrow();
		reachPage.clickDistance_JSExecutor();
		reachPage.click_DropDownArrow();
		reachPage.click_ReachPage2NextButton();
		reachPage.click_Use_My_Selection();
		reachPage.click_ReachPage3NextButton();	
	}

	@Then("User selects campaign start date for promote your event and clicks Next")
	public void user_selects_campaign_start_date_for_promote_your_event_and_clicks_next() {
		schedulePage.select_CampaignStartDate();
		schedulePage.click_Schedule1of3NextButton();
		schedulePage.waitForRecommendedPackages();
	}

	@Then("User choses recommended campaign package for promote your event")
	public void user_choses_recommended_campaign_package_for_promote_your_event() {
	    adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("ALternative_Packages");
		schedulePage.click_SchedulePage2of3NextButton();
	}

	@Then("User should be able to review campaign in your campaign details page")
	public void user_should_be_able_to_review_campaign_in_your_campaign_details_page() throws InterruptedException {
		schedulePage.wait_For_CustomCampaignBoxNextButton();
		Thread.sleep(5000);
		adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("Review_YourCampaign_Top_");
		js.executeScript("window.scrollBy(0,800)");
		adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("Review_YourCampaign_Bottom_");	
		schedulePage.click_SchedulePage3_NextButton();
	}

	@Then("User should be able to name their campaign and upload a commercial")
	public void user_should_be_able_to_name_their_campaign_and_upload_a_commercial() throws InterruptedException, AWTException {
		schedulePage.enter_CampaignName_Or_Continue_With_Commercial("TestCampaign");
		commercialPage.enter_Things_To_KnowAbout1("Test1");
		commercialPage.enter_Things_To_KnowAbout2("Test2");
		commercialPage.enter_Things_To_KnowAbout3("Test3");
		commercialPage.enter_Commercial_TagLine("Commercial tagline");
		commercialPage.click_CommericialPage1_NextButton();
		commercialPage.complete_GetTheirAttention_Page();	
		commercialPage.convert_Your_Customers("Give us a call");
		commercialPage.enter_Street_Address("6501 S Fiddlers Green cir");
		commercialPage.enter_Apartment("007");
		commercialPage.enter_City("Greenwood Village");
		commercialPage.select_State("CO");
		commercialPage.enter_Zip_Code("80111");
		commercialPage.enter_PhoneNumber("1234567890");
		commercialPage.enter_Email_Address("MSTestEmail@charter.com");
		commercialPage.enter_Website_URL("Adportal.com");
		commercialPage.enter_FaceBook_URL("ProductQAFacebook.com");
		commercialPage.enter_Other_Way_To_Contact("MSolutionsTestemail@charter.com");
		commercialPage.click_commercialPage2_NextButton();
		commercialPage.select_No_Voice_Preference();
		//commercialPage.select_No_Music_Preference();
		commercialPage.select_No_Color_Preference();
		commercialPage.enter_Special_Instructions("Stay home and watch your campaign air");
		commercialPage.click_CommercialPage3_NextButton();
		adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("ReviewYourOrder_Page");
		reviewOrderPage.click_place_OrderButton();
	}

	@Then("User should be able to enter credit card information for payment and place an order")
	public void user_should_be_able_to_enter_credit_card_information_for_payment_and_place_an_order() {
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
		adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("CheckOutPage_Top_");
		js.executeScript("window.scrollBy(0,1000)");
		adPortalScreenShots.take_ScreenShot_PromoteYourEvent_AlternativePackages("CheckOutPage_Bottom_");
	}

	@Given("User selects Raise Awareness as business goals")
	public void user_selects_raise_awareness_as_business_goals() {
		reachPage.select_RaiseAwareness();
		reachPage.click_ReachPage1NextButton();	}

	@When("User enters the address and distance for the campaign and clicks next")
	public void user_enters_the_address_and_distance_for_the_campaign_and_clicks_next() {
		reachPage.enter_Address("Austin");
		reachPage.click_DropDownArrow();
		reachPage.clickDistance_JSExecutor();
		reachPage.click_DropDownArrow();
		reachPage.click_ReachPage2NextButton();
		reachPage.click_Use_My_Selection();
		reachPage.click_ReachPage3NextButton();
	}

	@Then("User selects campaign start date for raise awareness event and clicks Next")
	public void user_selects_campaign_start_date_for_raise_awareness_event_and_clicks_next() {
		schedulePage.select_CampaignStartDate();
		schedulePage.click_Schedule1of3NextButton();
		schedulePage.waitForRecommendedPackages();	}

	@Then("User choses recommended campaign package for raise awareness")
	public void user_choses_recommended_campaign_package_for_raise_awareness() {
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("ALternative_Packages");
		schedulePage.click_SchedulePage2of3NextButton();	}

	@Then("User should be able to review campaign in campaign details page")
	public void user_should_be_able_to_review_campaign_in_campaign_details_page() throws InterruptedException {
		schedulePage.wait_For_CustomCampaignBoxNextButton();
		Thread.sleep(5000);
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("Review_YourCampaign_Top_");
		js.executeScript("window.scrollBy(0,800)");
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("Review_YourCampaign_Bottom_");	
		schedulePage.click_SchedulePage3_NextButton();
	}

	@Then("User enters name for their campaign and uploads a commercial")
	public void user_enters_name_for_their_campaign_and_uploads_a_commercial() throws InterruptedException, AWTException {
		schedulePage.enter_CampaignName_Or_Continue_With_Commercial("TestCampaign");
		commercialPage.enter_Things_To_KnowAbout1("Test1");
		commercialPage.enter_Things_To_KnowAbout2("Test2");
		commercialPage.enter_Things_To_KnowAbout3("Test3");
		commercialPage.enter_Commercial_TagLine("Commercial tagline");
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
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("ReviewYourOrder_page");
		reviewOrderPage.click_place_OrderButton();
	}

	@Then("User enters credit card information and place an order")
	public void user_enters_credit_card_information_and_place_an_order() {
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
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("CheckOutPage_Top_");
		js.executeScript("window.scrollBy(0,1000)");
		adPortalScreenShots.take_ScreenShot_RaiseAwareness_AlternativePackages("CheckOutPage_Bottom_");
	}

}
