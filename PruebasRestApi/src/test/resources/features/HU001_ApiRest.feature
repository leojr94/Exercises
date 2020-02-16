#Author: enrortega01@gmail.com
Feature: Buscar info servicio

  Scenario Outline: Recupera info servidor
    Given El <id> en una base datos
    Then Valido <titulo> y <episodio>

    Examples: 
      | id | titulo                 | episodio |
      |  1 | "A New Hope"           |        4 |
      |  5 | "Attack of the Clones" |        2 |
