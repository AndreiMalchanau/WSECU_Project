Feature: EnterBriskTable
 
 
@smoke
  Scenario: enterBriskTableOk
    Given I click on the arrowDown button
    When I locate BriskTable window and click on it
    Then I relocate to new window
    And I verify that 'Teachers' is there
    Then I see the message about entering successfully