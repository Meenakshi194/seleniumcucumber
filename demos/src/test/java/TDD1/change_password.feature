
Feature: changepassword


  Scenario: Success changepassword


    Given User enters password "abc@123"
    When User re-enters password "abc@123"
 
   Then password changed
   
   
  