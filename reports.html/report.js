$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the following functionalities on the Login module",
  "description": "As an Admin User,Application should accept only Admin credentials\r\nif there is an invalid user name and password user must validate the error message\r\nif the user forgot the user name and password, the user should be able to reset",
  "id": "validate-the-following-functionalities-on-the-login-module",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Launch \"browsertype\" Browser and \"Url\"",
  "rows": [
    {
      "cells": [
        "ff",
        "http://server/bank/"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Verify the Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browsertype",
      "offset": 8
    },
    {
      "val": "Url",
      "offset": 34
    }
  ],
  "location": "Login.launchbrowser(String,String,DataTable)"
});
formatter.result({
  "duration": 6280196620,
  "status": "passed"
});
formatter.match({
  "location": "Home.verifyhomepage()"
});
formatter.result({
  "duration": 552205487,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "This scenario is designed to validate the all the tabs are functional is Home page",
  "description": "",
  "id": "validate-the-following-functionalities-on-the-login-module;this-scenario-is-designed-to-validate-the-all-the-tabs-are-functional-is-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@homepage"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "click on each tab and verify that user navigates to correct page.",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.click_on_each_tab_and_verify_that_user_navigates_to_correct_page()"
});
formatter.result({
  "duration": 2379607006,
  "status": "passed"
});
});