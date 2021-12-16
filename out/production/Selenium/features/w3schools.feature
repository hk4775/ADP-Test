Feature: Selenium simple test case

  @w3
  Scenario Outline: Validate generic request is not awarded after batch run for employee currently sick. Test Case Name:TTS2_TFBatchRun_GenericRequest_Currently Sick. Priority: Critical. Risk: High.

    Given Launch the browser
    When Navigate to URL
    And click on try it button
    And type Mona in popup
    And click on ok
    And  validate Mona text is displayed
    And click on home icon
    And validate that login button is displayed


    Examples:
      | url               |
      | www.w3schools.com |
