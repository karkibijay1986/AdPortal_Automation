@cucumberHooks
@CPMAsAGoal
Feature: AudienceApp UAT create proposal CPMAsAGoal feature

Background:
Given User enters AudienceApp UAT Log in url
When User enters email and password to Log in
Then User should be able to Log in and land on Market page 
Then User clicks Let's Begin in Home page


@CreateProposal_Local_Budget_CPMAsAGoal
Scenario: Create a proposal local Budget  and include CPM as a Goal 
Given User selects Order Type as local,DMA as Austin,Ad Zones and clicks Next
When User lands on the Audience page
Then User selects demographics,propensity and auto in Audience page
Then User selects goals flight dates,plan specifics campaign type as Budget,CPM as Goal and network exclusions 
Then User should be able to create a proposal after viewing network details and Adds Spectrum News  and clicks save and finish


@CreateProposal_Interconnect_Impressions_CPMAsAGoal
Scenario: Create a proposal Interconnect Impressions and include CPM as a Goal 
Given User selects Order Type as Interconnect,DMA as BuffaloNY,Ad Zones and clicks Next
When User lands on Audience page
Then User selects demographics,propensity and auto from the Audience page
Then User selects goals flight dates,plan specifics campaign type as impressions,CPM as Goal and network exclusions 
Then User should be able to create a proposal after viewing network details and clicks save and finish