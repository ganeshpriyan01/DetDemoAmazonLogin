Feature: Validate Amazone login page

@amazonLoginPage
Scenario Outline: Amazon details

Given I open server url
Then I validate Amazone page title
When I click loginButton
When I enter username <username>
And I click continue button
And I enter userpassword <password>
And I enter submit button
And I perform mouse over action
And I click logout button

Examples:
|username|password|
|ganeshpriyan02@gmail.com|123456|
