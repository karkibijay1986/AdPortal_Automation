@cucumberHooks
@AlternativePackages
Feature: AdPortal Create Alternative packages feature

Background:
Given User is on AdPortal UAT sign up page and clicks LogIn
When User enters email,password and clicks log in
Then User should land on request dashboard page and be able to conntiune with campaign
Then User should be able to get started with the campaign creation


@PromoteYourEvent_AlternativePackages
Scenario: Create a promote event campaign by choosing recommended packages

Given User selects promote your event as business goals
When User enters address and distance for the campaign and clicks Next
Then User selects campaign start date for promote your event and clicks Next
Then User choses recommended campaign package for promote your event
Then User should be able to review campaign in your campaign details page
Then User should be able to name their campaign and upload a commercial 
Then User should be able to enter credit card information for payment and place an order


@RaiseAwareness_AlternativePackages
Scenario: Create a raise awareness campaign by choosing recommended packages
Given User selects Raise Awareness as business goals
When User enters the address and distance for the campaign and clicks next
Then User selects campaign start date for raise awareness event and clicks Next
Then User choses recommended campaign package for raise awareness
Then User should be able to review campaign in campaign details page
Then User enters name for their campaign and uploads a commercial 
Then User enters credit card information and place an order
