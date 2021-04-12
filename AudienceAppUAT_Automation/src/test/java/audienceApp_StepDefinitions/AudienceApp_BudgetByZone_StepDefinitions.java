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

	public class AudienceApp_BudgetByZone_StepDefinitions {
		private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
		private GoalsPage goalsPage = new GoalsPage(DriverFactory.getDriver());
		private AudiencePage audiencePage = new AudiencePage(DriverFactory.getDriver());
		private MarketPage marketPage = new MarketPage(DriverFactory.getDriver());
		private ProposalPage proposalPage = new ProposalPage(DriverFactory.getDriver());
		private AudienceAppScreenShots audienceAppScreenShots = new AudienceAppScreenShots(DriverFactory.getDriver());
		
		
		@Given("User enters AudienceApp UAT log in url")
		public void user_enters_audience_app_uat_log_in_url() {
			logInPage.navigateTo_AudienceAppUATLogInPage();
		}

		@When("User enters email and password to log in")
		public void user_enters_email_and_password_to_log_in() {
			logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
			logInPage.enter_LogInPassword("Metallica@8848");
			logInPage.clickLogIn();
		}

		@Then("User should be able to log in and land on Market page")
		public void user_should_be_able_to_log_in_and_land_on_market_page() {
			logInPage.letsBegin_Page_verification();
		}

		@Then("User clicks Let's Begin in home page")
		public void user_clicks_let_s_begin_in_home_page() {
			logInPage.click_Button_LetsBegin();
		}

		@Given("User selects Order Type as local ,DMA as Austin,Ad Zones and clicks Next")
		public void user_selects_order_type_as_local_dma_as_Austin_ad_zones_and_clicks_next() {
			marketPage.select_OrderType_Local();

			marketPage.select_Local_DMA_AustinTX();
			marketPage.select_AdZones_For_AustinTX();
			// marketPage.select_DMA_CharlotteNC();
			// .select_AdZones_For_CharlotteNC();
			marketPage.click_MarketPage_NextButton();
		}

		@When("User should see an Audience page")
		public void user_should_see_an_audience_page() {
			String pageTitle = DriverFactory.getDriver().getTitle();
			System.out.println("The page title is" + pageTitle);
		}

		@Then("User selects demographics,propensity and auto in the audience page")
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

		@Then("User selects goals flight dates,plan specifics campaign type as Budget and network exclusions")
		public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_budget_and_network_exclusions() {
			goalsPage.select_Goals_FlightDates();
			goalsPage.click_Box_FlightstartDate();
			goalsPage.select_FlightStartDateFromCalender();
			goalsPage.select_FlightLength("12");
			goalsPage.select_Goal_PlanSpecifics();
			goalsPage.select_CampaignType_Budget();
			goalsPage.enterBudgetAmount("3000");
			audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("Monthly_Budget_");
			goalsPage.select_networkExclusionsNationalNews();
			goalsPage.click_RunProposal();
		}

		@Then("User views network details and Adds Spectrum News")
		public void user_views_network_details_and_adds_spectrum_news() {
			proposalPage.click_ViewNetworkDetails();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("NetworkDetails_");
			proposalPage.returnTo_ProposalSummaryPage();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalBudget("ProposalPage_");
			proposalPage.logOut_AudienceApp_With_ExitWarning();
		}

		@Given("User selects Order Type as local ,DMA as Birmingham,Ad Zones and clicks Next")
		public void user_selects_order_type_as_local_dma_as_birmingham_ad_zones_and_clicks_next() throws AWTException {
			marketPage.select_OrderType_Local();
			 //marketPage.select_DMA_BirminghamAL();
			marketPage.select_DMA_BirminghamAL_RegressionFlow();
			marketPage.select_AdZones_For_BirminghamAL();
			marketPage.click_MarketPage_NextButton();
		}

		@When("User should be directed to Audience page")
		public void user_should_be_directed_to_audience_page() {
			String pageTitle = DriverFactory.getDriver().getTitle();
			System.out.println("The page title is" + pageTitle);
		}

		@Then("User selects demographics,propensity and auto from the audience page")
		public void user_selects_demographics_propensity_and_auto_from_the_audience_page() {
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
			audiencePage.click_AudiencePage_NextButton();	}

		@Then("User selects goals flight dates,plan specifics campaign type as impressions and network exclusions")
		public void user_selects_goals_flight_dates_plan_specifics_campaign_type_as_impressions_and_network_exclusions() {
			goalsPage.select_Goals_FlightDates();
			goalsPage.click_Box_FlightstartDate();
			goalsPage.select_FlightStartDateFromCalender();
			goalsPage.select_FlightLength("12");
			goalsPage.select_Goal_PlanSpecifics();
			goalsPage.select_CampaignType_Impressions("60000");
			audienceAppScreenShots.takeScreenShotCreateProposalLocalImpressions("ImpressionsGoals_");
			goalsPage.select_networkExclusionsNationalNews();
			goalsPage.click_RunProposal();
		}

		@Then("User should be able to create a proposal after user views network details and clicks save and finish")
		public void user_should_be_able_to_create_a_proposal_after_user_views_network_details_and_clicks_save_and_finish() {
			proposalPage.click_ViewNetworkDetails();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalImpressions("NetworkDetails_");
			proposalPage.returnTo_ProposalSummaryPage();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalImpressions("ProposalPage_");
			proposalPage.logOut_AudienceApp_With_ExitWarning();
		}

		@Given("User selects Order Type,DMA as NY,Ad Zones and clicks Next")
		public void user_selects_order_type_dma_as_NY_ad_zones_and_clicks_next() throws AWTException {
			marketPage.select_OrderType_Local();
			// marketPage.select_DMA_BuffaloNY();
			marketPage.select_DMA_BuffaloNY_RegressionFLow();
			marketPage.select_AdZones_For_BuffaloNY();
			marketPage.click_MarketPage_NextButton();
		}

		@When("User should land on Audience page")
		public void user_should_land_on_Audience_page() {
			String pageTitle = DriverFactory.getDriver().getTitle();
			System.out.println("The page title is" + pageTitle);
		}

		@Then("User selects audience demographics,propensity and auto")
		public void user_selects_audience_demographics_propensity_and_auto() {
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
			audiencePage.click_AudiencePage_NextButton();	}

		@Then("User selects goals flight dates, plan specifics and network exclusions")
		public void user_selects_goals_flight_dates_plan_specifics_and_network_exclusions() {
			goalsPage.select_Goals_FlightDates();
			goalsPage.click_Box_FlightstartDate();
			goalsPage.select_FlightStartDateFromCalender();
			goalsPage.select_FlightLength("12");
			goalsPage.select_Goal_PlanSpecifics();
			goalsPage.select_campaignType_MonthlyBudgetBroadcast("2000");
			audienceAppScreenShots
					.takeScreenShotCreateProposalLocalMonthlyBudgetBroadcastAudienceAppUAT("Monthly_BudgetBroadcast_");
			goalsPage.select_networkExclusionsKidsAndFamily();
			goalsPage.click_RunProposal();	}

		@Then("User Views network details and Adds HPOs and Spectrum News")
		public void user_views_network_details_and_adds_hp_os_and_spectrum_news() {
			proposalPage.click_ViewNetworkDetails();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalMonthlyBudgetBroadcastAudienceAppUAT("NetworkDetails_");
			proposalPage.returnTo_ProposalSummaryPage();
			// proposalPage.addSpectrumNewsBudget_Buffalo_Local("1000");
			// proposalPage.waitForAddOnsBarToAppear();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalMonthlyBudgetBroadcastAudienceAppUAT("ProposalPage_");
			proposalPage.logOut_AudienceApp_With_ExitWarning();
		}

		@Given("User selects Order Type,DMA as Cincinnati,Ad Zones and clicks Next")
		public void user_selects_order_type_dma_as_Cincinnati_ad_zones_and_clicks_next() throws AWTException {
			marketPage.select_OrderType_Local();
			// marketPage.select_DMA_CincinnatiOH();
			marketPage.select_DMA_CincinnatiOH_RegressionFlow();
			marketPage.select_AdZones_For_CincinnatiOH();
			marketPage.click_MarketPage_NextButton();	}

		@When("User should land on AUDIENCE page")
		public void user_should_land_on_audience_page() {
			String pageTitle = DriverFactory.getDriver().getTitle();
			System.out.println("The page title is" + pageTitle);
		}

		@Then("User selects audience demographics,propensity and auto in Audience Page")
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

		@Then("User selects flight dates, plan specifics and network exclusions in GOALS page and clicks run proposal")
		public void user_selects_flight_dates_plan_specifics_and_network_exclusions_in_goals_page_and_clicks_run_proposal() {
			goalsPage.select_Goals_FlightDates();
			goalsPage.click_Box_FlightstartDate();
			goalsPage.select_FlightStartDateFromCalender();
			goalsPage.select_FlightLength("12");
			goalsPage.select_Goal_PlanSpecifics();
			goalsPage.select_campaignType_MonthlyBudgetCalendar("2000");
			audienceAppScreenShots.takeScreenShotCreateProposalLocalMonthlyBudgetCalendar("Monthly_BudgetCalendar_");
			goalsPage.select_networkExclusionsNationalNewsCincinnatiOH();
			goalsPage.click_RunProposal();	}

		@Then("User clicks Save and Finish and should be able to create a proposal")
		public void user_clicks_save_and_finish_and_should_be_able_to_create_a_proposal() {
			proposalPage.click_ViewNetworkDetailsMonthlyBudgetCalendar();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalMonthlyBudgetCalendar("NetworkDetails_");
			proposalPage.returnTo_ProposalSummaryPage();
			audienceAppScreenShots.takeScreenShotCreateProposalLocalMonthlyBudgetCalendar("ProposalPage_");
			proposalPage.logOut_AudienceApp_With_ExitWarning();
		}


	}



