Feature: Selenium simple test case

  @smoke
  Scenario Outline: Validate generic request is not awarded after batch run for employee currently sick. Test Case Name:TTS2_TFBatchRun_GenericRequest_Currently Sick. Priority: Critical. Risk: High.

    Given application is launched
    When click on Login
    And Email is provided
    And Password is provided
    And click on continue with email


    Examples:
      | employee_sequence |
      | 4                 |
