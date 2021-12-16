Feature: Verify JanuaryMonth data

  @smoke
  Scenario Outline: Validate January month data. Test Case Name:January's shoes testing . Priority: Critical. Risk: High.

    Given click on the month "<month>"
    Then verify the month shoes count "<month>" "<ShoeCount>"
    And verify all the shoe details are correct "<month>"
    Then close the browser


    Examples:
      | month     | ShoeCount |
      | January   | 5         |
      | February  | 2         |
      | March     | 2         |
      | April     | 2         |
      | May       | 2         |
      | June      | 2         |
      | July      | 2         |
      | August    | 2         |
      | September | 2         |
      | October   | 2         |
      | November  | 2         |
      | December  | 0        |
      | All Shoes | 25      |
