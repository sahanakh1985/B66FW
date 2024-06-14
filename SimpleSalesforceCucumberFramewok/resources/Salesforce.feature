Feature:Login to Salesforce application

Background:
Given user enters the url
When user enters username and password
and click on Remember me radio button
and  click on login button
Then user validates home page

Scenario:Login with valid username and valid password


Scenario:User automates create account element
Given user click on account link
When user enter account name
And select type as Technology partner from drop down
And set coustomer priority as high

Scenario: user click on create new view under accounts
Given user click on account link
When click on create new view link
And enter view name and view unique name
Then click on save button

Scenario:User merge the accounts
Given user click on account link
When click on merge account link
And enter  merge account name
And  click on Find accounts button
And enter account name 
And select first two account links displayed in the list 
Then click on Next button

Scenario:user create account report
Given user click on account link
When click on accounts with last activity
And select create date in the date field drop down
And  select today date in From and To fileds on the unsaved report filed
And click on the save button on unsaved report page
And enter repert name, report unique name in the pop window 
And click on save 
Then run report button
