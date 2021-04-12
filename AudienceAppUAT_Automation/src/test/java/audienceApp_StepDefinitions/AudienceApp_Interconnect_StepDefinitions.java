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

public class AudienceApp_Interconnect_StepDefinitions {
	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private GoalsPage goalsPage = new GoalsPage(DriverFactory.getDriver());
	private AudiencePage audiencePage = new AudiencePage(DriverFactory.getDriver());
	private MarketPage marketPage = new MarketPage(DriverFactory.getDriver());
	private ProposalPage proposalPage = new ProposalPage(DriverFactory.getDriver());
	private AudienceAppScreenShots audienceAppScreenShots = new AudienceAppScreenShots(DriverFactory.getDriver());
	
	
	@Given("User enters url to get to AudienceApp UAT Log in page")
	public void user_enters_url_to_get_to_audience_app_uat_Log_in_page() {
		logInPage.navigateTo_AudienceAppUATLogInPage();
	}

	@When("User enters valid email ID and password and clicks Log in")
	public void user_enters_valid_email_id_and_password_and_clicks_Log_in() {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Metallica@8848");
		logInPage.clickLogIn();
	}

	@Then("User should be logged in directed to Home Page")
	public void user_should_be_logged_in_directed_to_home_Page() {
		logInPage.letsBegin_Page_verification();
	}

	@Then("User clicks Let's begin in the home page and starts creating Proposal")
	public void user_clicks_let_s_begin_in_the_home_page_and_starts_creating_Proposal() {
		logInPage.click_Button_LetsBegin();
	}

	@Given("User selects Order Type as Interconnect ,DMA as Charlotte,Ad Zones and clicks Next")
	public void user_selects_order_type_as_interconnect_dma_as_charlotte_ad_zones_and_clicks_next() {
	marketPage.select_OrderType_Interconnect();
	marketPage.select_DMA_NY_Interconnect();
	marketPage.select_AdZones_For_NY_Interconnect();
	marketPage.click_MarketPage_NextButton();
	}

	@When("User should be taken to Audience page")
	public void user_should_be_taken_to_audience_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects demographics,propensity and auto in the Audience page")
	public void user_selects_demographics_propensity_and_auto_in_the_Audience_page() {
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

	@Then("User selects goals flight dates,plan specifics campaign type as Budget and network exclusions for interconnect")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_budget_and_network_exclusions_for_interconnect() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_CampaignType_Budget();
		goalsPage.enterBudgetAmount("3000");
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectBudget("Interconnect_Monthly_Budget_");
		goalsPage.select_networkExclusionsNationalNews();
		goalsPage.click_RunProposal();
	}

	@When("User should be able to create a proposal after viewing network details and Adding Spectrum News")
	public void user_should_be_able_to_create_a_proposal_after_viewing_network_details_and_adding_spectrum_news() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectBudget("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		// proposalPage.addSpectrumNewsBudget_NY_Interconnect("1000");
		// proposalPage.waitForAddOnsBarToAppear();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectBudget("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

	@Given("User selects Order Type as Interconnect,DMA as Austin,Ad Zones and clicks Next")
	public void user_selects_order_type_as_interconnect_dma_as_austin_ad_Zones_and_clicks_next() throws AWTException {
	
		marketPage.select_OrderType_Interconnect();
		marketPage.select_DMA_AustinTX_Interconnect();
		marketPage.select_AdZones_For_AustinTX_Interconnect();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should be directed to Audience Page")
	public void user_should_be_directed_to_audience_Page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects demographics,propensity and auto in the Audience Page")
	public void user_selects_demographics_propensity_and_auto_in_the_audience_page() {
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

	@Then("User selects goals flight dates,plan specifics campaign type as impressions and network exclusions for interconnect")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_impressions_and_network_exclusions_for_interconnect() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_CampaignType_Impressions("50000");
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectImpressions("Interconnect_Monthly_Impressions_");
		goalsPage.select_networkExclusionsKidsAndFamily_AustinInterconnect();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to create a proposal after viewing network details")
	public void user_should_be_able_to_create_a_proposal_after_viewing_network_details() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectImpressions("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectImpressions("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();

	}

	@Given("User selects Order Type as Interconnect ,DMA as Austin,Ad Zones and clicks Next")
	public void user_selects_order_type_as_interconnect_dma_as_austin_ad_zones_and_clicks_next() throws AWTException {
		marketPage.select_OrderType_Interconnect();
		// audienceAppUATMarketPage.select_DMA_AustinTX_Interconnect();
		marketPage.select_DMA_AustinTX_Interconnect_RegressionFlow();
		marketPage.select_AdZones_For_AustinTX_Interconnect();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should be directed to audience page")
	public void user_should_be_directed_to_audience_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects demographics,propensity and auto in audience page")
	public void user_selects_demographics_propensity_and_auto_in_audience_page() {
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

	@Then("User selects goals flight dates,plan specifics campaign type as MonthlyBudgetBroadcast and network exclusions for interconnect")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_monthly_budget_broadcast_and_network_exclusions_for_interconnect() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_campaignType_MonthlyBudgetBroadcast("190");
		audienceAppScreenShots
				.takeScreenShotCreateProposalInterconnectMonthlyBudgetBroadcast("Interconnect_MonthlyBudgetBroadcast_");
		goalsPage.select_networkExclusionsNationalNews();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to create a proposal after viewing network details and clicking save and finish")
	public void user_should_be_able_to_create_a_proposal_after_viewing_network_details_and_clicking_save_and_finish() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectBudget("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		proposalPage.AddHPOs();
		// proposalPage.addSpectrumNewsBudget_Austin_Interconnect("1000");
		// proposalPage.waitForAddOnsBarToAppear();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectMonthlyBudgetBroadcast("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

	@Given("User selects Order Type,DMA as Columbus,Ad Zones and clicks Next")
	public void user_selects_order_type_dma_as_columbus_ad_zones_and_clicks_next() throws AWTException {
		marketPage.select_OrderType_Interconnect();
		marketPage.select_DMA_ColumbusOH();
		marketPage.select_InterconnectAdZones_For_ColumbusOH();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should land on audience page")
	public void user_should_land_on_audience_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is" + pageTitle);
	}

	@Then("User selects audience demographics,propensity and auto in audience page")
	public void user_selects_audience_demographics_propensity_and_auto_in_audience_page() {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_SelectAll();
		audiencePage.select_Age_Select25to54();
		audiencePage.select_Income_SelectAll();
		audiencePage.select_PresenceOfChildren();
		audiencePage.select_EducationLevel();
		audiencePage.Slect_Propensity();
		audiencePage.Select_Auto();
		audiencePage.select_AutoOwnerShip();
		audiencePage.select_AutoOwnerShip();
		audiencePage.click_AudiencePage_NextButton();
	}

	@Then("User selects flight dates, plan specifics and network exclusions in goals page and clicks run proposal")
	public void user_selects_flight_dates_plan_specifics_and_network_exclusions_in_goals_page_and_clicks_run_proposal() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_campaignType_MonthlyBudgetCalendar("2000");
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectMonthlyBudgetCalendar("Monthly_BudgetCalendar_");
		goalsPage.select_networkExclusionsNationalNews();
		goalsPage.click_RunProposal();
	}

	@Then("User views network details,clicks Save and Finish and should be able to create a proposal")
	public void user_views_network_details_clicks_save_and_finish_and_should_be_able_to_create_a_proposal() {
	
		proposalPage.click_ViewNetworkDetailsMonthlyBudgetCalendar();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectMonthlyBudgetCalendar("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		// proposalPage.addSpectrumNewsBudget_Columbus_Interconnect("2000");
		// proposalPage.waitForAddOnsBarToAppear();
		audienceAppScreenShots.takeScreenShotCreateProposalInterconnectMonthlyBudgetCalendar("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

}
