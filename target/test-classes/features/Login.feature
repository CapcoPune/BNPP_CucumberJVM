Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Successfully logging in
Given user is  on homepage
When user navigates to Login Page
When user enters username "blog.cucumber@gmail.com" and Password "blog.cucumber@gmail.com"
Then success message is displayed