@regression @listandmap @grid
Feature: Dashboard Menu Checks
  #TASK-1
  #login with john
  #validate the dashboard menu: Dashboard, Developers, Components, Forms, JavaScript, John
  #concentrate on Cucumber List feature
  Background:
    Given The user is on the login page

  @list
  Scenario: Cucumber List-1

    When  The user logs in using "john@gmail.com" and "John1234."
    Then Validate that dashboard menu has following
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | John       |

    #TASK-2
  # login with John
  # navigate to user profile menu
  # validate following menu Overview,Edit Profile,Add Experience,Add Education,Change Password
  @list2
  Scenario: Cucumber List-2

    When  The user logs in using "john@gmail.com" and "John1234."
    When Navigate to "John" and "My Profile"
    Then Validate that overview menu has followings
      | Overview        |
      | Edit Profile    |
      | Add Experience  |
      | Add Education   |
      | Change Password |


#TASK-3
  # login with john
  # validate the dashboard menu: Dashboard, Developers, Components, Forms, JavaScript, John
  # concentrate on Cucumber Map feature
  @map @smoke
  Scenario: Cucumber Map

    When The user logs in using following menu
      | username | john@gmail.com |
      | password | John1234.      |
      | name     | John           |
    Then Validate that dashboard menu has following
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | John       |

  @c_dataTable_s_outline
  Scenario Outline:Map Example with Scenario Outline test <name>

    When The user logs in using following menu
      | username | <userEmail> |
      | password | <password>  |
      | name     | <name>      |
    Then Validate that dashboard menu has following
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | <name>     |

    Examples:
      | userEmail      | password  | name |
      | john@gmail.com | John1234. | John |
