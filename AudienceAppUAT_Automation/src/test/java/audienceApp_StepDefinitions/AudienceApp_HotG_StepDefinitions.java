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

public class AudienceApp_HotG_StepDefinitions {

	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private GoalsPage goalsPage = new GoalsPage(DriverFactory.getDriver());
	private AudiencePage audiencePage = new AudiencePage(DriverFactory.getDriver());
	private MarketPage marketPage = new MarketPage(DriverFactory.getDriver());
	private ProposalPage proposalPage = new ProposalPage(DriverFactory.getDriver());
	private AudienceAppScreenShots audienceAppScreenShots = new AudienceAppScreenShots(DriverFactory.getDriver());


	@Given("User enters url to get to AudienceApp UAT log in page")
	public void user_enters_url_to_get_to_audience_app_uat_log_in_page() {
		logInPage.navigateTo_AudienceAppUATLogInPage();
	}

	@When("User enters valid email ID and password and clicks log in")
	public void user_enters_valid_email_id_and_password_and_clicks_log_in() {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Metallica@8848");
		logInPage.clickLogIn();
	}

	@Then("User should be logged in and directed to home page")
	public void user_should_be_logged_in_directed_to_home_page() {
		logInPage.letsBegin_Page_verification();
	}

	@Then("User clicks let's begin in the home page and starts creating proposal")
	public void user_clicks_let_s_begin_in_the_home_page_and_starts_creating_proposal() {
		logInPage.click_Button_LetsBegin();
	}

	@Given("User selects Order Type as HotG,DMA as Birmingham,Ad Zones and clicks Next")
	public void user_selects_order_type_as_hot_g_dma_as_birmingham_ad_zones_and_clicks_next() {
		marketPage.select_OrderType_HotG();
		marketPage.select_DMA_BirminghamAL_HotG();
		marketPage.select_AdZones_For_BirminghamAL_HotG();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should be directed to audience page to select the audience")
	public void user_should_be_directed_to_audience_page_to_select_the_audience() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is " + pageTitle);
	}

	@Then("User selects demographics,propensity and auto selections in the audience page")
	public void user_selects_demographics_propensity_and_auto_selections_in_the_audience_page() throws AWTException {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_Male();
		audiencePage.select_Age_Select25to54();
		audiencePage.select_Income_SelectAll();
		audiencePage.select_PresenceOfChildren();
		audiencePage.select_EducationLevel();
		// audienceAppUATAudiencePage.select_HomeOwner();
		audiencePage.Slect_Propensity();
		audiencePage.Select_Auto();
		audiencePage.page_Scroll_Down();
		audiencePage.select_AutoOwnerShip();
		audiencePage.select_AutoOwnerShip_InGarageCar();
		audiencePage.page_Scroll_Down();
		audiencePage.click_AudiencePage_NextButton();
	}

	@Then("User selects goals flight dates,plan specifics campaign type as Budget and network exclusions for hotG")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_budget_and_network_exclusions_for_hot_g() {

		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		// audienceAppUATGoalsPage.click_Box_FlightEndDate();
		// audienceAppUATGoalsPage.select_FlightEndDateFromCalender();
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_CampaignType_Budget();
		goalsPage.enterBudgetAmount("500");
		audienceAppScreenShots.takeScreenShotCreateProposalHotGBudget("HotG_Monthly_Budget_");
		goalsPage.select_networkExclusionsSpanish_HotG();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to complete a Budget proposal after viewing network details and clicking save and finish")
	public void user_should_be_able_to_complete_a_budget_proposal_after_viewing_network_details() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGBudget("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGBudget("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

	@Given("User selects Order Type as HotG,DMA as DFW,Ad Zones and clicks next")
	public void user_selects_order_type_as_hot_g_dma_as_dfw_ad_zones_and_clicks_next() {
		marketPage.select_OrderType_HotG();
		marketPage.select_DMA_NY_HotG();
		marketPage.select_AdZones_HotG_Massachusetts();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should be directed to the Audience Page to select Audience")
	public void user_should_be_directed_to_the_audience_page_to_select_audience() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is " + pageTitle);
	}

	@Then("User selects audience demographics,propensity and auto in the Audience Page")
	public void user_selects_audience_demographics_propensity_and_auto_in_the_audience_page() {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_Male();
		audiencePage.select_Age_Select25to54();
		audiencePage.select_Income_SelectAll();
		audiencePage.select_EducationLevel();
		audiencePage.Slect_Propensity();
		audiencePage.Select_Auto();
		audiencePage.select_AutoOwnerShip();
		audiencePage.select_AutoOwnerShip_InGarageCar();
		audiencePage.click_AudiencePage_NextButton();
	}

	@Then("User selects goals flight dates,plan specifics campaign type as impressions and network exclusions for HotG")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_impressions_and_network_exclusions_for_hot_g() {
	goalsPage.select_Goals_FlightDates();
	goalsPage.click_Box_FlightstartDate();
	goalsPage.select_FlightStartDateFromCalender();
	goalsPage.select_FlightLength("12");
	goalsPage.select_Goal_PlanSpecifics();
	goalsPage.select_CampaignType_Impressions("50000");
		audienceAppScreenShots.takeScreenShotCreateProposalHotGImpressions("HotG_Monthly_Impressions_");
		goalsPage.select_networkExclusionsSpanish_HotG();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to complete an Impressions proposal after viewing network details and clicking save and finish")
	public void user_should_be_able_to_complete_an_impressions_proposal_after_viewing_network_details_and_clicking_save_and_finish() {
		
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGImpressions("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGImpressions("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();

	}

	@Then("User selects Order Type as HotG,DMA as Los Angeles,Ad Zones and clicks Next")
	public void user_selects_order_type_as_hot_g_dma_as_los_angeles_ad_zones_and_clicks_next() {
		marketPage.select_OrderType_HotG();
		marketPage.select_DMA_CharlotteNC_HotG();
		marketPage.select_AdZones_For_CharlotteNC_HotG();
		marketPage.click_MarketPage_NextButton();
	}

	@Then("User should be directed to the Audience page to select the audience")
	public void user_should_be_directed_to_the_audience_page_to_select_the_audience() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is " + pageTitle);
	}

	@Then("User selects audience demographics,propensity and auto in the audience page")
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
		audiencePage.select_AutoOwnerShip_InGarageCar();
		audiencePage.click_AudiencePage_NextButton();
	}

	@Then("User selects goals flight dates,plan specifics campaign type as MonthlyBudgetBroadcast and network exclusions for HotG")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_monthly_budget_broadcast_and_network_exclusions_for_hot_g() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_campaignType_MonthlyBudgetBroadcast("2000");
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetBroadcast("HotG_MonthlyBudgetBroadcast_");
		goalsPage.select_networkExclusionsSpanish_HotG();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to complete a MonthlyBudgetBoradcast proposal after viewing network details and clicking save and finish")
	public void user_should_be_able_to_complete_a_monthly_budget_boradcast_proposal_after_viewing_network_details_and_clicking_save_and_finish() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetBroadcast("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetBroadcast("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

	@Given("User selects Order Type as HotG,DMA as Kansas City,Ad Zones and clicks Next")
	public void user_selects_order_type_as_hot_g_dma_as_kansas_city_ad_zones_and_clicks_next() {
		marketPage.select_OrderType_HotG();
		marketPage.select_DMA_CharlotteNC_HotG();
		marketPage.select_AdZones_For_CharlotteNC_HotG();
		marketPage.click_MarketPage_NextButton();
	}

	@When("User should be directed to audience page to select audience")
	public void user_should_be_directed_to_audience_page_to_select_audience() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		System.out.println("The page title is " + pageTitle);
	}

	@Then("User selects Audience demographics,propensity and auto in Audience Page")
	public void user_selects_audience_Demographics_propensity_and_auto_in_audience_page() {
		audiencePage.click_Demographics();
		audiencePage.select_Gender_Male();
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

	@Then("User selects goals flight dates,plan specifics campaign type as MonthlyBudgetCalendar and network exclusions for HotG")
	public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_monthly_budget_calendar_and_network_exclusions_for_hot_g() {
		goalsPage.select_Goals_FlightDates();
		goalsPage.click_Box_FlightstartDate();
		goalsPage.select_FlightStartDateFromCalender();
		goalsPage.select_FlightLength("12");
		goalsPage.select_Goal_PlanSpecifics();
		goalsPage.select_campaignType_MonthlyBudgetCalendar("350");
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetCalendar("HotG_MonthlyBudgetCalendar_");
		goalsPage.select_networkExclusionsSpanish_HotG();
		goalsPage.click_RunProposal();
	}

	@Then("User should be able to complete a MonthlyBudgetCalendar proposal after viewing network details and clicking save and finish")
	public void user_should_be_able_to_complete_a_monthly_budget_calendar_proposal_after_viewing_network_details_and_clicking_save_and_finish() {
		proposalPage.click_ViewNetworkDetails();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetCalendar("NetworkDetails_");
		proposalPage.returnTo_ProposalSummaryPage();
		audienceAppScreenShots.takeScreenShotCreateProposalHotGMonthlyBudgetCalendar("ProposalPage_");
		proposalPage.logOut_AudienceApp_With_ExitWarning();
	}

}
