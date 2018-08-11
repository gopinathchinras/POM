Feature: Creating a new lead
Background:
Given Open the browser
And Launch the URL 
And Maximize the window
And Set the timeout

@smoke @sanity
Scenario Outline:  only with mandatory fields positive scenario

Given Enter the Username as DemoSalesManager  
And Enter the Password as crmsfa
And Click the Login button
And Click the CRMSFA
And Click the Leads option
And Click the Create Lead option
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
And Enter the Company Name as <companyName>
When Click the Create button
Then Verify the successful creation of new lead
And Close the browser 

Examples:

|firstName|lastName|companyName|
|vijay|vg|Tcs|
|Gopi|gk|Cts|

@sanity
Scenario:  only with mandatory fields negative scenario

Given Enter the Username as DemoSm  
And Enter the Password as crmsfa
And Click the Login button
And Click the CRMSFA
And Click the Leads option
And Click the Create Lead option
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
And Enter the Company Name as <companyName>
When Click the Create button
But Verify the successful creation of new lead
And Close the browser