Feature: Search and Place the Order

  @TC
  Scenario: Search for Items and Validate the Results
    Given USer is on GrenKart Landing page
    When User searched for Cucumber Vegetable
    Then Cucumber Vegetable results are Displayed.

  @TC
  Scenario Outline: Search for Items and checkout the Results
    Given USer is on GrenKart Landing page
    When User searched for <name> Vegetable
    Then <name> Vegetable results are Displayed.
    And User add the items to cart
    And User proceed to check out the searched items
    And Verify if the <name> was present in checkout page

    Examples: 
      | name    |
      | Tomato  |
      | Brinjal |
      | Carrot  |
