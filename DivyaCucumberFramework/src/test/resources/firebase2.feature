Feature:Login into firebase application

Background:
Given user open firebase application
When user is on "LoginPage"
When user enters value into textbox as "admin123@gmail.com"
When user enters value intotext box password as "admin123"
When click on Login button
Then  user is on "Homepage"


Scenario:Login with valid user and valid password

Then verify we can see "https://selenium-prd.firebaseapp.com/"


Scenario:Fill up the Student Registration Form
Given click on "Home" tab
Then we can see "Student Registration Form"
When enters the name in  textbox as "Sahana KH"
When enters the  father name in  textbox as "Hemaraju KR"
And enters the postal address as 12345678
And enters the personal address as "Katteri"
Then click on radio button


