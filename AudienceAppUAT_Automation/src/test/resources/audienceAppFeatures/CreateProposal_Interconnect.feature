@cucumberHooks
@CreateProposalInterconnect
Feature: AudienceApp UAT create proposal Interconnect feature


Background:
Given User enters url to get to AudienceApp UAT Log in page 
When User enters valid email ID and password and clicks Log in
Then User should be logged in directed to Home page 
Then User clicks Let's begin in the home page and starts creating proposal

@CreateProposalInterconnectBudget
Scenario: Create a proposal Interconnect Budget 
Given User selects Order Type as Interconnect ,DMA as Charlotte,Ad Zones and clicks Next
When User should be taken to Audience page
Then User selects demographics,propensity and auto in the Audience page
Then User selects goals flight dates,plan specifics campaign type as Budget and network exclusions for interconnect
Then User should be able to create a proposal after viewing network details and Adding Spectrum News


@CreateProposalInterconnectImpressions
Scenario: Create a proposal Interconnect,impressions
Given User selects Order Type as Interconnect,DMA as Austin,Ad Zones and clicks Next
When User should be directed to Audience Page
Then User selects demographics,propensity and auto in the Audience Page
Then User selects goals flight dates,plan specifics campaign type as impressions and network exclusions for interconnect
Then User should be able to create a proposal after viewing network details

@CreateProposal_Interconnect_MonthlyBudget(Broadcast)
Scenario: Create a proposal Interconnect MOnthlyBudget(Broadcast)
Given User selects Order Type as Interconnect ,DMA as Austin,Ad Zones and clicks Next
When User should be directed to audience page
Then User selects demographics,propensity and auto in audience page
Then User selects goals flight dates,plan specifics campaign type as MonthlyBudgetBroadcast and network exclusions for interconnect
Then User should be able to create a proposal after viewing network details and clicking save and finish

@CreateProposal_Interconnect_MonthlyBudget(Calendar)
Scenario: Create an interconnect MonthlyBudgetCalendar proposal
Given User selects Order Type,DMA as Columbus,Ad Zones and clicks Next
When User should land on audience page
Then User selects audience demographics,propensity and auto in audience page
Then User selects flight dates, plan specifics and network exclusions in goals page and clicks run proposal
Then User views network details,clicks Save and Finish and should be able to create a proposal