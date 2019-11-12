
Feature: SignIn to TestMeApp
  

  Scenario Outline: Login To TestMeApp
    Given User opens TestMeApp
   	When User enters username as "<username>"
    Then User enters password as "<password>"
    And User clicks on Login button
    And Login Successful


  Examples: 
  		| username | password |
      | Lalitha | Password123 |