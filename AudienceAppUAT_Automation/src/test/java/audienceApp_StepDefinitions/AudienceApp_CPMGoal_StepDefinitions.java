package audienceApp_StepDefinitions;

import java.awt.AWTException;

import audienceAppPageObjects.AudiencePage;
import audienceAppPageObjects.GoalsPage;
import audienceAppPageObjects.LogInPage;
import audienceAppPageObjects.MarketPage;
import audienceAppPageObjects.ProposalPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.AudienceAppScreenShots;

public class AudienceApp_CPMGoal_StepDefinitions {

	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private GoalsPage goalsPage = new GoalsPage(DriverFactory.getDriver());
	private AudiencePage audiencePage = new AudiencePage(DriverFactory.getDriver());
	private MarketPage marketPage = new MarketPage(DriverFactory.getDriver());
	private ProposalPage proposalPage = new ProposalPage(DriverFactory.getDriver());
	private AudienceAppScreenShots audienceAppScreenShots = new AudienceAppScreenShots(DriverFactory.getDriver());

	
	@Given("User enters AudienceApp UAT Log in url")
	public void user_enters_audience_app_uat_Log_in_url() {
		logInPage.navigateTo_AudienceAppUATLogInPage(); 
	}

	@When("User enters email and password to Log in")
	public void user_enters_email_and_password_to_Log_in() {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Metallica@8848");
		logInPage.clickLogIn();
	}

	@Then("User should be able to Log in and land on Market page")
	public void user_should_be_able_to_Log_in_and_land_on_Market_page() {
		logInPage.letsBegin_Page_verification();
	}

	@Then("User clicks Let's Begin in Home page")
	public void user_clicks_let_s_begin_in_Home_page() {
		logInPage.click_Button_LetsBegin();
	}

	@Given("User selects Order Type as local,DMA as Austin,Ad Zones and clicks Next")
	public void user_selects_order_type_as_local_dma_as_austin_ad_zones_and_clicks_next() {
		marketPage.select_OrderType_Local();
		marketPage.select_Local_DMA_AustinTX();
		marketPage.select_AdZones_For_AustinTX();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User lands on the Audience page")
	public void user_should_land_on_the_audience_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects demographics,propensity and auto in Audience page")
	public void user_selects_demographics_propensity_and_auto_in_Audience_Page() {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_SelectAll();
		audiencePage.select_Age_Select25to54();
		audiencePage.select_Income_SelectAll();
		audiencePage.select_PresenceOfChildren();
		audiencePage.select_EducationLevel();
		audiencePage.Slect_Propensity();
		audiencePage.Select_Auto();
		audiencePage.select_AutoOwnerShip();
		audiencePage.select_AutoOwnerShip_InGarageCar();
		audiencePage.click_AudiencePage_NextButton();
	}

	@Then("User selects goals flight dates,plan specifics campaign type as Budget,CPM as Goal and network exclusions")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_budget_cpm_as_goal_and_network_exclusions() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_CampaignType_Budget();
		goalsPage.enterBudgetAmount("5000");
		goalsPage.enterCPMGoal("60");
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("Monthly_Budget_");
		goalsPage.select_networkExclusionsNationalNews();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to create a proposal after viewing network details and Adds Spectrum News  and clicks save and finish")
	public void user_should_be_able_to_create_a_proposal_after_viewing_network_details_and_adds_spectrum_news_and_clicks_save_and_finish() throws InterruptedException {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

	@Given("User selects Order Type as Interconnect,DMA as BuffaloNY,Ad Zones and clicks Next")
	public void user_selects_order_type_as_local_dma_as_buffaloNY_ad_zones_and_clicks_next() throws AWTException {
	marketPage.select_OrderType_Interconnect();
	marketPage.select_DMA_NY_Interconnect();
	marketPage.select_AdZones_For_NY_Interconnect();
	marketPage.click_MarketPage_NextButton();
	}

	@When("User lands on Audience page")
	public void user_should_be_directed_to_Audience_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects demographics,propensity and auto from the Audience page")
	public void user_selects_demographics_propensity_and_auto_from_the_Audience_page() {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_SelectAll();
		audiencePage.select_Age_Select25to54();
		audiencePage.select_Income_SelectAll();
		audiencePage.select_PresenceOfChildren();
		audiencePage.select_EducationLevel();
		audiencePage.Slect_Propensity();
		audiencePage.Select_Auto();
		audiencePage.select_AutoOwnerShip();
		audiencePage.select_AutoOwnerShip_InGarageCar();
		audiencePage.click_AudiencePage_NextButton();
	
	}

	@Then("User selects goals flight dates,plan specifics campaign type as impressions,CPM as Goal and network exclusions")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_impressions_cpm_as_goal_and_network_exclusions() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_CampaignType_Budget();
		goalsPage.enterBudgetAmount("5000");
		goalsPage.enterCPMGoal("60");
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("Monthly_Budget_");
		goalsPage.select_networkExclusionsNationalNews();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to create a proposal after viewing network details and clicks save and finish")
	public void user_should_be_able_to_create_a_proposal_after_viewing_network_details_and_clicks_save_and_finish() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

}
