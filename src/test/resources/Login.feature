Feature: Login functionality

  in order to do online banking
  as a para bank customer
  I want to login successfully

  Scenario: Successful Login
    Given Customer In the login page of parabank website
    When Customer enters valid credentials
    Then Customer should be landed in the overview page and see the logout button

