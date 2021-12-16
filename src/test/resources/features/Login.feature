Feature: ShoeStore URL testing

  @smoke
  Scenario Outline: validate shoe store details Test Case Name:Shoe store details based on calendar month Sick. Priority: Critical. Risk: High.

    Given Shoe Store URL is launched
    Then verify Shoe store is loaded correctly
    And verify all the months
    Then close the browser



    Examples:
      | test |
      | 1   |
