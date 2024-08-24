Feature: DashBoardPage

Background:

Given user has already logged in to the application
|username|password|
|iamfd|password|
|sudarshan|killekar|

Scenario: Verifying Dashboard page Nav options 
#Given User is on dashbaord page
Then User gets the Nav options
| Dashboard |
| Create Job |
|Ready for delivery|
| Download Delivery Note|
| Inward CC Jobs |
And Nav sections count should be 5
When user click on job created today
Then search job number "JOB_34171" 

  