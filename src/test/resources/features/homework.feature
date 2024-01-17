@c_scenarioHomeWork

Feature: Edit Profile Page

  @c_scenarioErrorMessage
  Scenario Outline: User enters invalid credentials
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Examples:
      | userEmail      | password  |
      | john@gmail.com | John1234. |

  @c_scenarioErrorMessage
  Scenario Outline: User enters invalid credentials
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then the login should fail with an error message "<errorMessage>"
    Examples:
      | userEmail        | password   | errorMessage                             |
      | john@gmaildd.com | John1234.  | Email address is incorrect. Please check |
      | eddiem@kraft.com | eddiem1233 | Password is incorrect. Please check      |
      | mike@gmail.com   |            | Please enter your password!              |
      |                  | mike1234   | Please enter your email.                 |




