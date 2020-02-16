#Author: enrortega01@gmail.com

Feature: Noticia de El Tiempo
  
  Scenario: Generar Doc apartir de noticia
    Given La pag de El Tiempo
    When Escojo una noticia    
    Then Generar doc texto plano
    

 