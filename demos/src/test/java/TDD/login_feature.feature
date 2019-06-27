
Feature: Login

 @tag1
  Scenario: Success login
    Given User enters username
    When User enters password
   And Click on login button
   Then home page is displayed
   @smoke @tag
   Scenario: invalid login
    Given User enters username
    When User enters incorrect password
   And Click on login button
   Then error message is displayed
   @reg
   Scenario: logout
   Given click on logout link
   Then user logged out