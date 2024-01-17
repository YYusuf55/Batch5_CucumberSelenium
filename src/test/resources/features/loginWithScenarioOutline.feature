Feature:Login with scenario Outline

  @c_scenarioOutLine
  Scenario Outline: Different name user type <name>
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then The user should be able to log in
    And Validate that "<name>" is visible at top right
    Examples:
      | userEmail        | password  | name        |
      | john@gmail.com   | John1234. | John        |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy |
      | mike@gmail.com   | mike1234  | mike        |