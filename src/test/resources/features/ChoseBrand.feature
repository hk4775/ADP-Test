Feature: Chose a brand feature

  @smoke
  Scenario Outline: validate shoe store details Test Case Name:Shoe store details based on calendar month Sick. Priority: Critical. Risk: High.

    Given verify Welcome to Shoe store is displayed
    Then verify chose a brand
    And verify brand details are  displayed
    Then close the browser


    Examples:
      | test |
      | 1   |
