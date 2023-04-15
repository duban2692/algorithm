#Author: duban2692@gmail.com

Feature: Login Saucedemo
  As a transactional user
  I want to use Saucedemo aplication
  to make transactions in aplication

  Scenario: User is logged in Saucedemo
    Given transactional user navigate to the login page
    When enter your credentials
    Then he should be logged in