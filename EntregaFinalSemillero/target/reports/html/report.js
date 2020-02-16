$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU002_Marca.feature");
formatter.feature({
  "name": "Busqueda circuito",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Busqueda circuito SILVERSTONE en pag Marca",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Pagina web Marca",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsMarca.paginaWebMarca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se busca Gran Premio de Gran Bretana",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsMarca.seBuscaGranPremioDeGranBretana()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validar nombre circuito sea \"SILVERSTONE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsMarca.validarNombreCircuitoSea(String)"
});
formatter.result({
  "status": "passed"
});
}); "status": "passed"
});
formatter.step({
  "name": "El 33 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Paris\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar capital",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 27 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Pretoria\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar capital",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 20 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Cairo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validar calling code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "El \u003ccallingcode\u003e de una BD",
  "keyword": "Given "
});
formatter.step({
  "name": "Valido \u003ccallingcode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "callingcode"
      ]
    },
    {
      "cells": [
        "2"
      ]
    },
    {
      "cells": [
        "3"
      ]
    },
    {
      "cells": [
        "4"
      ]
    },
    {
      "cells": [
        "57"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar calling code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 2 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido 2",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar calling code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 3 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido 3",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar calling code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 4 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido 4",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar calling code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 57 de una BD",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.callingCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido 57",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsRestCountries.valido(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c404\u003e but was \u003c200\u003e.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.sophossolutions.www.stepdefinitionsapi.StepDefinitionsRestCountries.valido(StepDefinitionsRestCountries.java:41)\r\n\tat ✽.Valido 57(src/test/resources/features/HU001_RestCountries.feature:16)\r\n",
  "status": "failed"
});
});