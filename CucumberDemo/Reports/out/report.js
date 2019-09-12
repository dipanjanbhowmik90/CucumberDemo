$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "To validate the google search functionality",
  "description": "",
  "id": "to-validate-the-google-search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "",
  "description": "The google search functionality works fine on hitting search button",
  "id": "to-validate-the-google-search-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@ExamplesUserInput"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# concrete example illustrating how the software should behave"
    }
  ],
  "line": 16,
  "name": "We have already opened the \"\u003cURL\u003e\" url",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I search \"\u003cSearchText\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I navigate to the search result page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am successfully able to validate the google search results",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "to-validate-the-google-search-functionality;;",
  "rows": [
    {
      "cells": [
        "URL",
        "SearchText"
      ],
      "line": 22,
      "id": "to-validate-the-google-search-functionality;;;1"
    },
    {
      "cells": [
        "www.google.com",
        "Cucumber BDD tutorial"
      ],
      "line": 23,
      "id": "to-validate-the-google-search-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "",
  "description": "The google search functionality works fine on hitting search button",
  "id": "to-validate-the-google-search-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@ExamplesUserInput"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "# concrete example illustrating how the software should behave"
    }
  ],
  "line": 16,
  "name": "We have already opened the \"www.google.com\" url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I search \"Cucumber BDD tutorial\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I navigate to the search result page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I am successfully able to validate the google search results",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});