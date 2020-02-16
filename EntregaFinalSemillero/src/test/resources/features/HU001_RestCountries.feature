#Author: enrortega01@gmail.com
Feature: Calling code and capital

  Scenario Outline: Validar capital
    Given El <callingcode> de una BD
    Then Valido <capital>

    Examples: 
      | callingcode | capital    |
      |          33 | "Paris"    |
      |          27 | "Pretoria" |
      |          20 | "Cairo"    |

  Scenario Outline: Validar calling code
    Given El <callingcode> de una BD
    Then Valido <callingcode>

    Examples: 
      | callingcode |
      |           2 |
      |           3 |
      |           4 |
      |          57 |
