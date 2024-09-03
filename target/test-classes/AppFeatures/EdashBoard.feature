Feature: Verifying EngineerDashBoardPage

Background:
Given Engineer has already logged in to the application
|username|password|
|iameng|password|
|sudarshan|killekar|

Scenario: Verify for Texts presents on engineer DashBoard page
Given : Engineer is on DashBoard 
Then : Engineer Verifies for "Pending for repair" Text on DashBoardPage
Then : Engineer Verifies for "Repair completed" Text on DashBoardPage

Scenario: Clicking On repair job 
When : engineer verifies for repair job option
And : engineer clicks on pending for Pending for repair 
#Then : Engineer clicks on Repair job menu option
#Then Engineer Begins to repair 
#Then : Engineer searches for the "39523053933055" to begin repair
#Then : Engineer gets data of device
