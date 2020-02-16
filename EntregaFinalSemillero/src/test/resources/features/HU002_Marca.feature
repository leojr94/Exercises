#Author: your.email@your.domain.com
Feature: Busqueda circuito

  Scenario: Busqueda circuito SILVERSTONE en pag Marca
    Given Pagina web Marca
    When Se busca Gran Premio de Gran Bretana
    Then Validar nombre circuito sea "SILVERSTONE"
