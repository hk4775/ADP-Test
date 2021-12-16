Feature: Selenium simple test case

  @Test
  Scenario Outline: Validate generic request is not awarded after batch run for employee currently sick. Test Case Name:TTS2_TFBatchRun_GenericRequest_Currently Sick. Priority: Critical. Risk: High.

    When getUsers is invoked
    Then response should be successful



    Examples:
      |employee_sequence|
      | 4 				|
