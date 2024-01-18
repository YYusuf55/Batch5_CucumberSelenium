Feature: Negative Login Test
  # Class Task--> Create a negative login test feature
  # use scenario outline with include different data invalid credentials
  # Do not forget to take the message wh,ch show the result as negative
  # Create step def class and if needed create locator and methods in related

  @c_negativeLogin @grid1
  Scenario Outline: Negative Login Test
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    Then The warning message contains "<message>"
    Examples:
      | userEmail           | password      | message                                  |
      | mikewrong@gmail.com | mike1234      | Email address is incorrect. Please check |
      | mikewrong@gmail.com | mike123444444 | Email address is incorrect. Please check |
      | mike@gmail.com      | mike12344444  | Password is incorrect. Please check      |
      |                     | mike1234      | Please enter your email.                 |
      | mike@gmail.com      |               | Please enter your password!              |
      |                     |               | Please enter your email.                 |
      |                     |               | Please enter your password!              |
