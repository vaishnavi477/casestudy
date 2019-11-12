
Feature: User Story

  Scenario: To Purchase a product in TestMeApp
  
    Given TestMeApp opened by User 
    When User enters username 
    Then User enters password
    And User presses Login button
    And Login done succesfully
    When User points to All Categories
    And User selects Electronics
    And User selects Headphone
    Then User searches for HeadPhone
    Then User adds HeadPhone to cart
    Then User clicks on cart
    Then User clicks on checkout
    Then Appliance bought

