Feature:Calculator addition functionality

Scenario:Addition of two numbers
Given the values for A and B
When I add A and B
Then results should be sum of two numbers

Scenario:Addition of three numbers
Given the values for A,B and C
When I add A,B and C
Then results should be sum of three numbers

Scenario:Addition of three numbers negative
Given the values for int  A,B and  String valueC
When I add A,B and C
Then results should be error