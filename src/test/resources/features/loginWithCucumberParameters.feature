@regression @parameteriz @paralleltest
Feature: Login tests with Cucumber Parameters

  #mike
  @parameterizeMike
  Scenario: Login with Mike - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to log in
    And Validate that "mike" is visible at top right

    #John
  @parameterizejhon @smoke
  Scenario: Login with Jhon- Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to log in
    And Validate that "John" is visible at top right

    #Eddie Murphy
  @parameterizeeddiem
  Scenario: Login with Eddie - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "eddiem@kraft.com" and "eddiem12"
    Then The user should be able to log in
    And Validate that "Eddie Murphy" is visible at top right






