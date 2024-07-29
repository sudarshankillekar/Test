Feature: Login page feature

Background: 
Given user is on login page   

Scenario: Login page title 
When user gets the title of the page
Then page title should be "Phoenix - We Repair"  

Scenario: Verify components username ,password ,Sign in button 
Then User verifies for username and password text 
And User checks validate Sign-in button 

Scenario: Login with correct credentials 
When User enters username "iamfd"
And User enter password "password"
And clicks on Login button
 
