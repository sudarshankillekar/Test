@Login
Feature: Login page feature

Background: 
Given user is on login page   

@smoke
Scenario: Login page title 
When user gets the title of the page
Then page title should be "Phoenix - We Repair"  

@sanity
Scenario: Verify components username ,password ,Sign in button 
Then User verifies for username and password text 
And User checks validate Sign-in button 

@Regression @skip
Scenario Outline: Login with correct credentials 
When User enters username <email>
And User enter password <password>
And clicks on Login button
Examples:
|email|password|
|iamfd|password|
|iameng|password|
 
