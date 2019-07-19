$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddBooksToCart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Chetana Kolgiri"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Add Books to the cart."
    }
  ],
  "line": 5,
  "name": "Add Books to my cart",
  "description": "",
  "id": "add-books-to-my-cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Select Books from catogery and add to Cart",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Book"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am logged in as \"\u003cUser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I go to \"\u003cDept\u003e\" Departments Tab",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I Select the SubCategory1 \"\u003cCategory1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the SubCategory2 \"\u003cCategory2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select the SubCategory3 again \"\u003cCategory3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Book by Name \"\u003cBook\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Add the item to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see the item in my Cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
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
      "line": 28,
      "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;1"
    },
    {
      "cells": [
        "capco",
        "Books",
        "Arts \u0026 Photography Books",
        "Photography \u0026 Video",
        "Fashion",
        "GUCCI: The Making Of"
      ],
      "line": 29,
      "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;2"
    },
    {
      "cells": [
        "capco",
        "Books",
        "Arts \u0026 Photography Books",
        "Photography \u0026 Video",
        "Fashion",
        "Chanel: Collections and Creations"
      ],
      "line": 30,
      "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 106387200,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Log into Amazon account",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "I am on Landing Page of AUT",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Login with valid \"capcodrive@gmail.com\" and \"CapcoDrive098!\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am logged into my Account successfully as \"capco\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepts.launchApp()"
});
formatter.result({
  "duration": 8657182400,
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
  "location": "BackgroundStepts.login(String,String)"
});
formatter.result({
  "duration": 3147851400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 45
    }
  ],
  "location": "BackgroundStepts.verifyLogin(String)"
});
formatter.result({
  "duration": 390534700,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Select Books from catogery and add to Cart",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Book"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am logged in as \"capco\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I go to \"Books\" Departments Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I Select the SubCategory1 \"Arts \u0026 Photography Books\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the SubCategory2 \"Photography \u0026 Video\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select the SubCategory3 again \"Fashion\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Book by Name \"GUCCI: The Making Of\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Add the item to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see the item in my Cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 19
    }
  ],
  "location": "AddBooksToCart.verifyloggedUser(String)"
});
formatter.result({
  "duration": 105300,
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
  "duration": 1826535900,
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
  "duration": 2485989700,
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
  "duration": 2084631100,
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
  "duration": 2520567500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GUCCI: The Making Of",
      "offset": 25
    }
  ],
  "location": "AddBooksToCart.select_the_Book_by_Name(String)"
});
formatter.result({
  "duration": 3359614000,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.add_the_item_to_the_Cart()"
});
formatter.result({
  "duration": 3494551800,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.verifyCart()"
});
formatter.result({
  "duration": 2213619400,
  "status": "passed"
});
formatter.before({
  "duration": 1134900,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Log into Amazon account",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "I am on Landing Page of AUT",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Login with valid \"capcodrive@gmail.com\" and \"CapcoDrive098!\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am logged into my Account successfully as \"capco\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundStepts.launchApp()"
});
formatter.result({
  "duration": 6385218200,
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
  "location": "BackgroundStepts.login(String,String)"
});
formatter.result({
  "duration": 2774477100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 45
    }
  ],
  "location": "BackgroundStepts.verifyLogin(String)"
});
formatter.result({
  "duration": 59341800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Select Books from catogery and add to Cart",
  "description": "",
  "id": "add-books-to-my-cart;select-books-from-catogery-and-add-to-cart;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Book"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am logged in as \"capco\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I go to \"Books\" Departments Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I Select the SubCategory1 \"Arts \u0026 Photography Books\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the SubCategory2 \"Photography \u0026 Video\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select the SubCategory3 again \"Fashion\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Book by Name \"Chanel: Collections and Creations\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Add the item to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see the item in my Cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "capco",
      "offset": 19
    }
  ],
  "location": "AddBooksToCart.verifyloggedUser(String)"
});
formatter.result({
  "duration": 84900,
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
  "duration": 1944325200,
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
  "duration": 2291476900,
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
  "duration": 1916694000,
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
  "duration": 1621901800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chanel: Collections and Creations",
      "offset": 25
    }
  ],
  "location": "AddBooksToCart.select_the_Book_by_Name(String)"
});
formatter.result({
  "duration": 4761131500,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.add_the_item_to_the_Cart()"
});
formatter.result({
  "duration": 3189656100,
  "status": "passed"
});
formatter.match({
  "location": "AddBooksToCart.verifyCart()"
});
formatter.result({
  "duration": 2296150600,
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
  "line": 5,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Data"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 11,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Chetana"
      ],
      "line": 12,
      "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1185500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Data"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter \"Chetana\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DataTableJson.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 852200,
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
  "duration": 591200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chetana",
      "offset": 7
    }
  ],
  "location": "DataTableJson.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 26587300,
  "status": "passed"
});
formatter.after({
  "duration": 316060700,
  "status": "passed"
});
});