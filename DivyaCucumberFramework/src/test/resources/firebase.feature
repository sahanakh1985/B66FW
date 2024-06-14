Feature:Login Functionality

Background:
Given the url "https://qa-tekarch.firebaseapp.com/"


Scenario:Login using valid email and valid password
When user enter valid email "admin123@gmail.com"
When user enter valid password "admin123"
And I click on button
Then user should enters the home page

Scenario:Login using incorrect email and valid password
When user enter valid email "admin12345@gmail.com"
When user enter valid password "admin123"
And I click on button
Then user should get error alert

Scenario:Login using no email and  no password
When user enter valid email ""
When user enter valid password ""
And I click on button
Then user should get different alert msg