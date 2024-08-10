Feature: Create Job 

 

Background:
Given :User has already Logged into the application 
|username|password|
|iamfd|password|

Scenario Outline: Create job page with multiple set of data 
Given :User is on the Create job page
When :User enters the data from the given Sheetname "<SheetName>" and rownumber <RowNumber>
Then : User clicks on Submit button for excel data 

Examples:
|SheetName|RowNumber|
|createJob|0|
#|createJob|1|
#|createJob|2|
#|createJob|3|
#|createJob|4|
#|createJob|5|