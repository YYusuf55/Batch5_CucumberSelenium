@regression
Feature: Navigation Menu Tests
# User Story: As a user, I sholdd be able to navigate all menus without any problem


  @mike

  Scenario: Navigation with Mike
    Given Login as Mike
    Then Validate that Dashboard is visible
    When Go to developers menu
    Then Validate that Developers is visible

  @sebestian
  Scenario: Navigation with Sebastian
    Given Login as Sebastian
    Then Validate that Dashboard is visible
    When Go to Forms-Input menu
    Then Validate that General Form Elements text is visible

  @Jhon
  Scenario: Navigation as Jhon
    Given Login as Jhon
    Then Validate that Dashboard is visible
    When Go go My Profile menu
    Then Validate that user Profile text is visible
