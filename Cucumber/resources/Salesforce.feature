Feature:Login into Salesforce Application

Scenario:Login into Salesforce with valid UN and valid PWD
Given User launch the Salesforce application
When User enter value into UN textbox
And User enter value into PWD textbox
Then user click on rememberme checkbox 


Scenario:Login into Salesforce with valid UN and invalid PWD
Given User launch the Salesforce application
When User enter value into UN textbox
And User enter value into PWD textbox
Then user click on login button

Scenario:user change the lastName of profile
Given User launch the Salesforce application
When User enter value into UN textbox
And User enter value into PWD textbox
Then user click on login button
When user click on home button
when user click on profile name
and user click on edit icon 
when user click on about button 
Then enter the last name
