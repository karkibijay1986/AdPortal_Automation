
@cucumberHooks
@CreateProposal_Local
Feature: AudienceApp UAT create proposal Local feature


Background:
Given User enters AudienceApp UAT log in url
When User enters email and password to log in
Then User should be able to log in and land on Market page 
Then User clicks Let's Begin in home page

@CreateProposal_Local_Budget
Scenario: Create a proposal local Budget 
Given User selects Order Type as local ,DMA as Austin,Ad Zones and clicks Next
When User should see an Audience page
Then User selects demographics,propensity and auto in the audience page
Then User selects goals flight dates,plan specifics campaign type as Budget and network exclusions 
Then User views network details and Adds Spectrum News 

@CreateProposal_Local_Impressions
Scenario: Create a proposal local Impressions 
Given  User selects Order Type as local ,DMA as Birmingham,Ad Zones and clicks Next
When User should be directed to Audience page
Then User selects demographics,propensity and auto from the audience page
Then User selects goals flight dates,plan specifics campaign type as impressions and network exclusions 
Then User should be able to create a proposal after user views network details and clicks save and finish

@CreateProposal_Local_MonthlyBudgetBroadcast
Scenario: Create a local MonthlyBudgetBroadcast proposal
Given User selects Order Type,DMA as NY,Ad Zones and clicks Next
When User should land on Audience page
Then User selects audience demographics,propensity and auto
Then User selects goals flight dates, plan specifics and network exclusions 
Then User Views network details and Adds HPOs and Spectrum News 


@CreateProposal_Local_MonthlyBudgetCalendar
Scenario: Create a local MonthlyBudgetCalendar proposal
Given User selects Order Type,DMA as Cincinnati,Ad Zones and clicks Next
When User should land on AUDIENCE page
Then User selects audience demographics,propensity and auto in Audience Page
Then User selects flight dates, plan specifics and network exclusions in GOALS page and clicks run proposal
Then User clicks Save and Finish and should be able to create a proposal