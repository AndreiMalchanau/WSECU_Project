#Author: andrei.malchanau7@gmail.com

Feature: Negative Login


Scenario: Invalid Loginn
Given I enter invalid login
Then I click Sign In button
When I enter inalid password
Then I click SignIn button
And I validate message box pops up that says "Sorry, incorrect username."

