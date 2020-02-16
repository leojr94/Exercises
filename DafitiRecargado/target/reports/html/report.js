$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU005_RestCountries.feature");
formatter.feature({
  "name": "Recuperar info de un pais",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Recuperar info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "El \u003ccode\u003e en una base datos",
  "keyword": "Given "
});
formatter.step({
  "name": "Valido \u003cpais\u003e y \u003ccapital\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "code",
        "pais",
        "capital"
      ]
    },
    {
      "cells": [
        "\"aus\"",
        "\"Australia\"",
        "\"Canberra\""
      ]
    },
    {
      "cells": [
        "\"arg\"",
        "\"Argentina\"",
        "\"Buenos Aires\""
      ]
    },
    {
      "cells": [
        "\"fra\"",
        "\"France\"",
        "\"Paris\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Recuperar info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El \"aus\" en una base datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionRestCountries.codeBase(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Australia\" y \"Canberra\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionRestCountries.validoPaisCapital(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recuperar info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El \"arg\" en una base datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionRestCountries.codeBase(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Argentina\" y \"Buenos Aires\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionRestCountries.validoPaisCapital(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recuperar info",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El \"fra\" en una base datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionRestCountries.codeBase(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"France\" y \"Paris\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionRestCountries.validoPaisCapital(String,String)"
});
formatter.result({
  "status": "passed"
});
});