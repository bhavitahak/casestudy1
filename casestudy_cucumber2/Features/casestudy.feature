Feature: Register to TestMeApp

  Background: 
    Given App is launched

  @Registration
  Scenario: registration
    Given SignUp
    And username is "bhavitahaakh"
    And first name is "bhavita"
    And lastname is "hak"
    And password is "bhavitah12345"
    And confirm password is "bhavitah12345"
    And gender is "female"
    And username is "bhavita"
    And email is "bhavita@gmail.com"
    And mobile number is "9876543210"
    And DOB is "08/08/1997"
    And address is "hyderabad"
    And security question is "What is your birth place?"
    And answer is "jammu"
    Then Register

  @Login
  Scenario Outline: Login
    Given Signin
    And Enter "<user>"
    And Type "<pass>"
    Then login

    Examples: 
      | user         |  | pass          |
      | bhavitahaakh |  | bhavitah12345 |

  @Addtocart
  Scenario: product purchase
    Given signin with credentials "lalitha" and "password123"
    And search for a product
    And click on find details
    And click on add to cart
    And click on cart
    Then check if the added product is in cart or not
    And click on proceed to checkout
