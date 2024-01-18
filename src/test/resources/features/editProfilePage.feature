@c_editProfile @grid
Feature: Edit Profile Page

  Background:
    Given The user is on the login page

  @c_editProfile_withParam
  Scenario: edit Profile e2e test with param
    When The user logs in using "mike@gmail.com" and "mike1234"
    And Navigate to "mike" and "My Profile"
    And The user navigates to "Edit Profile"
    And The user adds "name" "mike"
    And The user adds "about" "SDET 2024"
    And The user adds "company" "Krafttech SDET"
    And The user adds "QA Automation Engineer" from drop down menu
    And The user adds "website" "www.kraftechsdet.com"
    And The user adds "location" "Ankara"
    And The user adds "skills" "Selenium,Java,API,DB"
    And The user clicks on save changes button

  @c_editProfile_with_s_Outline
  Scenario Outline: edit Profile e2e test with scenario outline

    When The user logs in using "<userEmail>" and "<password>"
    And Navigate to "<name>" and "<menu>"
    And The user navigates to "<subMenu>"
    And The user adds "name" "<fullName>"
    And The user adds "about" "<about>"
    And The user adds "company" "<company>"
    And The user adds "<job>" from drop down menu
    And The user adds "website" "<website>"
    And The user adds "location" "<location>"
    And The user adds "skills" "<skills>"
    And The user clicks on save changes button
    Examples:
      | userEmail      | password  | name | menu       | subMenu      | fullName | about               | company   | job  | website          | location | skills                               |
      | mike@gmail.com | mike1234  | mike | My Profile | Edit Profile | mike     | graduated SDET 2024 | Krafttech | SDET | www.kraftech.com | Istanbul | Selenium, Java, DB, API, GIT, GITHUB |
      | john@gmail.com | John1234. | John | My Profile | Edit Profile | John     | graduated SDET 2023 | Krafttech | SDET | www.kraftech.com | Istanbul | Selenium, Java, DB, API, GIT, GITHUB |
