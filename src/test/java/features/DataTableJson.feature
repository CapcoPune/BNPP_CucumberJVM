Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration.
 
 @Data
Scenario Outline: Customer place an order by purchasing an item from search 
 Given user is on Home Page
 When he search for "dress"
 And enter "<customer>" personal details on checkout page

Examples:
 |customer|
 |Chetana|