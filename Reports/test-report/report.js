$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/execution.feature");
formatter.feature({
  "line": 1,
  "name": "To get property details from ikman",
  "description": "",
  "id": "to-get-property-details-from-ikman",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Ikman Automation",
  "description": "",
  "id": "to-get-property-details-from-ikman;ikman-automation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open chrome and go to ikmanlk",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on property button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on houses",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Colombo",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I set min,max prices and the bed count",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i should be ale to get verified advertisement details",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iOpenChromeAndGoToIkmanlk()"
});
formatter.result({
  "duration": 9321109333,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPropertyButton()"
});
formatter.result({
  "duration": 3248169086,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnHouses()"
});
formatter.result({
  "duration": 1617103408,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnColombo()"
});
formatter.result({
  "duration": 31925228247,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSetMinMaxPriCesAndTheBedCount()"
});
formatter.result({
  "duration": 4293160296,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAleToGetVerifiedAdvertisementDetails()"
});
formatter.result({
  "duration": 9047003259,
  "status": "passed"
});
});