#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Add Books to my cart 
  

@Amazon
  Scenario Outline: Log into Amazon account 
    Given I am on Landing Page of AUT
    When I Login with valid "<UserName>" and "<Password>"
    Then I am logged into my Account successfully as "<User>"
    
 Examples:    
    | UserName            | Password       | User  |             
 		| capcodrive@gmail.com| CapcoDrive098! | capco |
 @Amazon
 Scenario Outline: Select Books from catogery and add to Cart 
    Given I am on logged in as "<User>"
    When I go to "<Dept>" Departments Tab
 	  And  I Select the SubCategory1 "<Category1>"
  	And Select the SubCategory2 "<Category2>"
  	And Select the SubCategory3 again "<Category3>"
    And Select the Book by Name "<Book>"
    And Add the item to the Cart 
    Then I should see the item in my Cart 
       

   Examples: 
     |User | Dept | Category1                 | Category2 					| Category3 | Book     |
     |capco| Books| Arts & Photography Books  | Photography & Video | Fashion   |	Tom Ford |
 