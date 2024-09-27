Feature: Account Creation in Salesforce

Scenario Outline: Creating Mulitple New Account in Salesforce

Given Set the Environment
And Enter the Username as 'gokul.sekar@testleaf.com'
And Enter the Password as 'Leaf$321'
When Click on the login button
And Click on the toggle menu
And Click on the View All link
And Click on the App Launcher
And Click on the Sales option
And Click on the Accounts Tab
And Click on the New button
Given Enter the account name as <Account Name>
When Click on Ownership drop down and select as Public
And Click on the Save button
Then Verify Account Created

Examples:
|Account Name|
|K.Boomiraja|
|B.Aadvika|