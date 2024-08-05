Feature: DashBoardPage

Background:

Given user has already logged in to the application
|username|password|
|iamfd|password|
|sudarshan|killekar|

Scenario: Verifying Dashboard page Nav options 
Given User is on dashbaord page
Then User gets the Nav options
| Dashboard |
| Create Joob |
|Ready for delivery|
| Download Delivery Note|
| Inward CC Jobs |
And Nav sections count should be 5
Then User Goes on Create Job Page 
  