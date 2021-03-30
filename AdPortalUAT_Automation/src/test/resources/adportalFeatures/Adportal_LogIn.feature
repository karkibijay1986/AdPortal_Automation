@cucumberHooks
@LogInTest 
Feature: AdPortal UAT log in feature

Background:
Given User is on AdPortalUAT SignUp Page and clicks Login link 


@AdPortalLogInDefault
Scenario: Log in with default user email and password
Given User enters username and password 
When User clicks log in
Then User lands on request dashboard page


@ReachIntroPage 
Scenario: User selects next button on reach intro page
Given User enters username and password 
When User clicks log in
Then User lands on request dashboard page
Then User starts or continues with campaign
Then USer should land on intro step of the reach page
Then User clicks on next button 
Then User should be taken to the Reach 1 of 3 page

@HelpCenterFAQ
Scenario: User selects the FAQs in Help Center
Given User enters username and password 
When User clicks log in
Then User lands on request dashboard page
Then  User starts or continues with campaign
Then  User should land on reach page with help center button at the footer of the page
Then  user clicks on help center button it should open the help center page with FAQs
Then  user click FAQs it should open relevant Q/As