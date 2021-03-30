@cucumberHooks
@SingleSignUpTest
Feature: New customer Single Sign Up LogIn feature



@NewCustomerReachPage
Scenario: Reach page for new customer
Given New user is on AdPortal UAT sign up page
When User enters all required fields with new Email
When  User accepts license agreement and clicks next step and enters required fields
Then User should be able to see Reach page to start the campaign


@NewCustomerSSULogIn
Scenario: Sign up with user email and password
Given  user is on AdPortal UAT sign up page
When User enters all required fields with New Email for SSU
When User accepts license agreement and clicks next step and enters required fields for SSU
Then User should be able to create log in credentials for AdPortal UAT and land in reach page