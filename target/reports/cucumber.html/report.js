$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Bank\u0026CashLogin.feature");
formatter.feature({
  "name": "Techfios billing loginpage functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@B\u0026CashFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user should be able to make new account with valid credentials in bank \u0026 cash menu",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "user should be able to land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Bank \u0026 Cash Menu button",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on New account under Bank \u0026 cash menu button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to land on Accounts Page",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters account Title as \"\u003cAccount Title\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters description as \"\u003cDescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters initial balance as \"\u003cInitial balance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters account number as \"\u003cAccount number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters contact person as \"\u003cContact person\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters phone as \"\u003cPhone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters internet banking url as \"\u003cInternet banking url\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to land on Accounts page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Account Title",
        "Description",
        "Initial balance",
        "Account number",
        "Contact person",
        "Phone",
        "Internet banking url"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Checking Account",
        "saving money",
        "200000",
        "123456789",
        "MGA",
        "987654321",
        "www.bofa.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user should be able to make new account with valid credentials in bank \u0026 cash menu",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@B\u0026CashFeature"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepdefinition.user_is_on_the_tecfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepdefinition.User_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepdefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepdefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepdefinition.user_should_be_able_to_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Bank \u0026 Cash Menu button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.DashboardStepDefinition.user_clicks_on_Bank_Cash_Menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on New account under Bank \u0026 cash menu button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.DashboardStepDefinition.user_clicks_on_New_account_under_Bank_cash_menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Accounts Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.DashboardStepDefinition.user_should_be_able_to_land_on_Accounts_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account Title as \"Checking Account\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_account_Title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters description as \"saving money\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initial balance as \"200000\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_initial_balance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account number as \"123456789\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_account_number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contact person as \"MGA\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_contact_person_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phone as \"987654321\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_phone_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internet banking url as \"www.bofa.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_enters_internet_banking_url_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Accounts page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BankCashNewAccountStepdefinition.user_should_be_able_to_land_on_Accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});