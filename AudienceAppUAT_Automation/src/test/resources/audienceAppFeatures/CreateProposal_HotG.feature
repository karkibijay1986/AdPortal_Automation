@cucumberHooks
@CreateProposalHotG
Feature: AudienceApp UAT create proposal HotG feature


Background:
Given User enters url to get to AudienceApp UAT log in page 
When User enters valid email ID and password and clicks log in
Then User should be logged in and directed to home page 
Then User clicks let's begin in the home page and starts creating proposal


@CreateProposalHOTGBudget
Scenario: Create a proposal HotG Budget 
Given User selects Order Type as HotG,DMA as Birmingham,Ad Zones and clicks Next
When User should be directed to audience page to select the audience
Then User selects demographics,propensity and auto selections in the audience page
Then User selects goals flight dates,plan specifics campaign type as Budget and network exclusions for hotG
Then User should be able to complete a Budget proposal after viewing network details and clicking save and finish

@CreateProposalHOTGImpressions
Scenario: Create a proposal HotG,impressions 
Given User selects Order Type as HotG,DMA as DFW,Ad Zones and clicks next
When User should be directed to the Audience Page to select Audience 
Then User selects audience demographics,propensity and auto in the Audience Page
Then User selects goals flight dates,plan specifics campaign type as impressions and network exclusions for HotG
Then User should be able to complete an Impressions proposal after viewing network details and clicking save and finish


@CreateProposal_HOTG_MonthlyBudget(Broadcast)
Scenario: Create a proposal HotG MonthlyBudgetBroadcast 
Given User selects Order Type as HotG,DMA as Los Angeles,Ad Zones and clicks Next
When User should be directed to the Audience page to select the audience
Then User selects audience demographics,propensity and auto in the audience page
Then User selects goals flight dates,plan specifics campaign type as MonthlyBudgetBroadcast and network exclusions for HotG
Then User should be able to complete a MonthlyBudgetBoradcast proposal after viewing network details and clicking save and finish 

@CreateProposal_HOTG_MonthlyBudget(Calendar)
Scenario: Create a proposal HotG MonthlyBudgetCalendar 
Given User selects Order Type as HotG,DMA as Kansas City,Ad Zones and clicks Next
When User should be directed to audience page to select audience
Then User selects Audience demographics,propensity and auto in Audience Page
Then User selects goals flight dates,plan specifics campaign type as MonthlyBudgetCalendar and network exclusions for HotG
Then User should be able to complete a MonthlyBudgetCalendar proposal after viewing network details and clicking save and finish 