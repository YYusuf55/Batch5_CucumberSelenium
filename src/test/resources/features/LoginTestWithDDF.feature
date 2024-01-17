Feature: Data Driven Test in Cucumber


  @c_DDF_wirtCucumber
  Scenario Outline: DDF Login Test
    Given The user is on the login page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The user verifies that profil name welcome message contains in excel "<sheetName>" <rowNumber>
    And The user verifies that "<infoTitle>" info in excel "<sheetName>" <rowNumber>
    Examples:
      | sheetName | rowNumber | infoTitle |
      | QA 1      | 0         | job       |
      | QA 1      | 0         | skills    |
      | QA 1      | 1         | job       |
      | QA 1      | 1         | skills    |
      | QA 1      | 2         | job       |
      | QA 1      | 2         | skills    |
      | QA 1      | 3         | job       |
      | QA 1      | 3         | skills    |
      | QA 1      | 4         | job       |
      | QA 1      | 4         | skills    |
