
@tag
Feature: Multipleuser

  @tag1
  Scenario: useraccount
    Given I want to create account
    When i want to enter credentials
    | username | value | 
    | meena    |     5 | 
    | sowmi    |     7 | 
    
    Then account should be created
   
  
     
      