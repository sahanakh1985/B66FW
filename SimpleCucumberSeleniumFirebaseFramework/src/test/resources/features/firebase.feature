Feature:Login to FireBase Application

Background:
Given user enter the url
When user enter username and password
And user click on login button
Then user see the homepage


Scenario:Login With valid username and password


Scenario:Login with valid un and pw and click on windows
When user mouse-over on "SwitchTo"
When user clicks on the "Windows" button
Then user click on "Click on new Window" button

Scenario:Login with valid un and pw and click on double-click
When user mouse-over on "Interactions"
When user clicks on the "Double click" button


Scenario:Login with valid un and pw and click on OpenTabs
When user mouse-over on "Switch To"
When user clicks on the "Tabs" button
Then user counts the number of "tabs"

Scenario:Login with valid un and pw and click on tooltip
When user mouse-over on "Interactions"
When user clicks on the "Tooltip" button
And user  mouse-over on "Right" 
Then get text of element "Right"

Scenario:Login with valid un and pw and handle alert pop-up
When user mouse-over on "Switch To"
When user clicks on the "Alert" button
And user click on "window alert" button
Then user switch to "Alert"
And user click on "prompt alert" button
And user switch to "Alert"

Scenario:Login with valid un and pw and perform autoComplete
When user mouse-over on "Widget"
When user click on  "autocomplete" button
And user enter country name
Then user counts the number of "countries"

Scenario:Login with valid un and pw and handle table
When user mouse-over on "widget"
When user click on  "table" button
Then user counts the number of "table data"






