
@tag
Feature: Multiple user login
 
  Scenario Outline: Title of your scenario outline
    Given Enters username "<username>"
    When Enters password "<password>" 
    Then Displays homepage

    Examples: 
      | username  | password | 
      | sowmiya   |    123   | 
      | mercy     |    456   | 
      | Anitha    |    789   |
      | priya     |    001   |