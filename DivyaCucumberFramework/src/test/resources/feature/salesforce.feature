Feature:Automate Salesforce Application

Scenario:Login to Salesforce Application with valid username and valid Password
Given user open Salesforce application
When user is on "LoginPage"
When user enters the username in unTextBox as "Sahana@tek.com"
When user enters the password in pwdTextBox as "Siri@123"
And click on login button
Then verify homepage with url as "https://tekarch95-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom"
