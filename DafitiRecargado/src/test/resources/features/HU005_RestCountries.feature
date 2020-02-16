#Author: enrortega01@gmail.com
Feature: Recuperar info de un pais

  Scenario Outline: Recuperar info
    Given El <code> en una base datos
    Then Valido <pais> y <capital>

    Examples: 
      | code  | pais        | capital        |
      | "aus" | "Australia" | "Canberra"     |
      | "arg" | "Argentina" | "Buenos Aires" |
      | "fra" | "France"    | "Paris"        |
