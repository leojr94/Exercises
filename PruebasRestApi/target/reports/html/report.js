$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_ApiRest.feature");
formatter.feature({
  "name": "Buscar info servicio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Recupera info servidor",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "El \u003cid\u003e en una base datos",
  "keyword": "Given "
});
formatter.step({
  "name": "Valido \u003ctitulo\u003e y \u003cepisodio\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "titulo",
        "episodio"
      ]
    },
    {
      "cells": [
        "1",
        "\"A New Hope\"",
        "4"
      ]
    },
    {
      "cells": [
        "5",
        "\"Attack of the Clones\"",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Recupera info servidor",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 1 en una base datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsApi.idBase(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"A New Hope\" y 4",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsApi.validoTituloEpisodio(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recupera info servidor",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 5 en una base datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsApi.idBase(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido \"Attack of the Clones\" y 2",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsApi.validoTituloEpisodio(String,int)"
});
formatter.result({
  "status": "passed"
});
});