#Author: Chetana Kolgiri
#Keywords Summary : Add Books to the cart.


Feature: Add Books to my cart 
  


  Background: Log into Amazon account 
    Given I am on Landing Page of AUT
    When I Login with valid "capcodrive@gmail.com" and "CapcoDrive098!"
    Then I am logged into my Account successfully as "capco"
    

 @Book
 Scenario Outline: Select Books from catogery and add to Cart 
    Given I am logged in as "<User>"
    When I go to "<Dept>" Departments Tab
 	  And  I Select the SubCategory1 "<Category1>"
  	And Select the SubCategory2 "<Category2>"
  	And Select the SubCategory3 again "<Category3>"
    And Select the Book by Name "<Book>"
    And Add the item to the Cart 
    Then I should see the item in my Cart 
       

   Examples: 
     |User | Dept | Category1                 | Category2 					| Category3 | Book     |
     |capco| Books| Arts & Photography Books  | Photography & Video | Fashion   |	GUCCI: The Making Of |
     |capco| Books| Arts & Photography Books  | Photography & Video | Fashion   |	Chanel: Collections and Creations |
 