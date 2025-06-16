@regression


Feature: Call Chrome session

  #This feature file basically like a setup for the testcases like a precondition
  #the main goal here is to pass the chrome session-id to the Selenium web driver



  Scenario Outline: Pre-condition setup

    Given Open Sellerlab
    When User enters "<Email>" and click next
    And User re-enter "<password>" and next
    And Wait for Mobile_auth
    Then User can choose idp



    Examples:
      | Email           | password          |
      |  |  |
