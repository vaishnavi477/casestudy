Feature: User moves to cart without adding any item

  Scenario: User moves to cart without adding any item in it
    Given User registered in TestMeApp 
    When User search a particular product 
    And try to proceed to payment without adding any item in the cart
    Then TestMeApp doesn't display the cart icon
    
    

