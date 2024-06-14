Feature:Login to salesforce application

Scenario:Login to salesforce application with valid username and valid password

Given user opens salesforce application
When user is on "loginPage"
When user enters the username in username textbox as "Sahana@tek.com"
When user enters the password in password textbox as "Siri@123"
And user click on login button
Then user validates the homepage