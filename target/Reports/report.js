$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/loginfunction.feature");
formatter.feature({
  "name": "To validate the Login Funtionality in FB application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Login Functionality by passing invalid values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To open a browser and maximize",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_open_a_browser_and_maximize()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the FB application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_FB_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_invalid_username_in_email_field()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.step.StepDefinition.to_pass_the_invalid_username_in_email_field(StepDefinition.java:31)\r\n\tat ✽.To pass the invalid username in email field(file:src/test/resources/loginfunction.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To pass the invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_invalid_password_in_password_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click a  login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_a_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check whether it should navigate to the error page or home page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_check_whether_it_should_navigate_to_the_error_page_or_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close a browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_close_a_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "To validate positive and negative combination Testcases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and max window",
  "keyword": "Given "
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.step({
  "name": "To pass positive and negative \"\u003cemaildata\u003e\" data to email field",
  "keyword": "When "
});
formatter.step({
  "name": "To pass positive and \"\u003cpassworddata\u003e\" negative data to password field",
  "keyword": "When "
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildata",
        "passworddata"
      ]
    },
    {
      "cells": [
        "java",
        "Java123"
      ]
    },
    {
      "cells": [
        "Cucumber",
        "cucumber123"
      ]
    },
    {
      "cells": [
        "Selenium",
        "selenium123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate positive and negative combination Testcases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and max window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_the_browser_and_max_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"java\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and \"Java123\" negative data to password field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeTestcases.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate positive and negative combination Testcases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and max window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_the_browser_and_max_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"Cucumber\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and \"cucumber123\" negative data to password field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeTestcases.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate positive and negative combination Testcases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and max window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_the_browser_and_max_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"Selenium\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and \"selenium123\" negative data to password field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegativeTestcases.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegativeTestcases.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});