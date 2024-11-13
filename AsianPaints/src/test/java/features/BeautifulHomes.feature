Feature: Beautiful homes

  Scenario: validate user is able to estimate kitchen design ideas 
    Given Browser is open and url is navigated
    When The user clicks on beautiful homes
    And The user is able to hover on Design Ideas
    And The user is able to click on home desgin  ideas
    And The user is able to click on image
    And Scroll till get estimate
    And click on get estimate
    Then Select the nearest dimension of your kitchen will be displayed
