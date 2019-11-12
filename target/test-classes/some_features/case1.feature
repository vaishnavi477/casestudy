Feature: TestMeapp Registration

  Scenario: Register to TestMeApp
    Given User opens the TestMeApp
    When user enters user name
    When User enters first name
    And User enters last name
    And User enters password to signin
    Then User confirms the password entered
    And User selects Gender 
    Then User Enters his mail id
    And User enters Contact number
    Then User selects date of birth
    And User enters address
    And User choses a security question
    And User answers the security question
    Then User clicks on Register button
    Then Registration successful

