$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddBooksToCart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 5,
  "name": "Add Books to my cart",
  "description": "",
  "id": "add-books-to-my-cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Log into Amazon account",
  "description": "",
  "id": "add-books-to-my-cart;log-into-amazon-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Amazon"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on Landing Page of AUT",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Login with valid \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am logged into my Account successfully as \"\u003cUser\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "add-books-to-my-cart;log-into-amazon-account;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "User"
      ],
      "line": 15,
      "id": "add-books-to-my-cart;log-into-amazon-account;;1"
    },
    {
      "cells": [
        "capcodrive@gmail.com",
        "CapcoDrive098!",
        "capco"
      ],
      "line": 16,
      "id": "add-books-to-my-cart;log-into-amazon-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Log into Amazon account",
  "description": "",
  "id": "add-books-to-my-cart;log-into-amazon-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Amazon"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on Landing Page of AUT",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Login with valid \"capcodrive@gmail.com\" and \"CapcoDrive098!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am logged into my Account successfully as \"capco\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GenericSteps.launchApp()"
});
formatter.result({
  "duration": 7481469900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "capcodrive@gmail.com",
      "offset": 20
    },
    {
      "val": "CapcoDrive098!",
      "offset": 47
    }
  ],
  "location": "GenericSteps.login(String,String)"
});
formatter.result({
  "duration": 2322918200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 45
    }
  ],
  "location": "GenericSteps.verifyLogin(String)"
});
formatter.result({
  "duration": 107059700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Select Books from catogery and add to Cart",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Amazon"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on logged in as \"\u003cUser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I go to \"\u003cDept\u003e\" Departments Tab",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I Select the SubCategory1 \"\u003cCategory1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the SubCategory2 \"\u003cCategory2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select the SubCategory3 again \"\u003cCategory3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select the Book by Name \"\u003cBook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Add the item to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the item in my Cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;",
  "rows": [
    {
      "cells": [
        "User",
        "Dept",
        "Category1",
        "Category2",
        "Category3",
        "Book"
      ],
      "line": 30,
      "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;1"
    },
    {
      "cells": [
        "capco",
        "Books",
        "Arts \u0026 Photography Books",
        "Photography \u0026 Video",
        "Fashion",
        "Tom Ford"
      ],
      "line": 31,
      "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Select Books from catogery and add to Cart",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Amazon"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on logged in as \"capco\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I go to \"Books\" Departments Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I Select the SubCategory1 \"Arts \u0026 Photography Books\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the SubCategory2 \"Photography \u0026 Video\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select the SubCategory3 again \"Fashion\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select the Book by Name \"Tom Ford\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Add the item to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should see the item in my Cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 22
    }
  ],
  "location": "AddBooksToCart.verifyloggedUser(String)"
});
formatter.result({
  "duration": 100900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 9
    }
  ],
  "location": "AddBooksToCart.selectDepartment(String)"
});
formatter.result({
  "duration": 2057061300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arts \u0026 Photography Books",
      "offset": 27
    }
  ],
  "location": "AddBooksToCart.selectCategory(String)"
});
formatter.result({
  "duration": 2540144100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Photography \u0026 Video",
      "offset": 25
    }
  ],
  "location": "AddBooksToCart.select_kkthe(String)"
});
formatter.result({
  "duration": 1851076900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fashion",
      "offset": 31
    }
  ],
  "location": "AddBooksToCart.selectthe(String)"
});
formatter.result({
  "duration": 2116710400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom Ford",
      "offset": 25
    }
  ],
  "location": "AddBooksToCart.select_the_Book_by_Name(String)"
});
formatter.result({
  "duration": 2237568400,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.add_the_item_to_the_Cart()"
});
formatter.result({
  "duration": 2016045100,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.verifyCart()"
});
formatter.result({
  "duration": 18777700,
  "status": "passed"
});
formatter.uri("DataTableJson.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End Tests",
  "description": "Description: The purpose of this feature is to test End 2 End integration.",
  "id": "automated-end2end-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 10,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 11,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter \"Lakshay\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTableJson.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 83000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 15
    }
  ],
  "location": "DataTableJson.he_search_for(String)"
});
formatter.result({
  "duration": 99100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 7
    }
  ],
  "location": "DataTableJson.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 11941000,
  "status": "passed"
});
});