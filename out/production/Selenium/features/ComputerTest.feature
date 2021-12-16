Feature: Selenium simple test case

  @ComputerTest
  Scenario Outline: Validate generic request is not awarded after batch run for employee currently sick. Test Case Name:TTS2_TFBatchRun_GenericRequest_Currently Sick. Priority: Critical. Risk: High.

    When I navigate to computerDB gatling link
    And I  click on create a new computer
    And provide computer values
    And click on Create this computer
    Then I navigate to computerDB gatling link
    Then I should be able to see the computer created.
    Then say hello



    Examples:
      |employee_sequence|
      | 4 				|
