Feature: product purchase

  Background: 
    Given App is up
    @Registration
    Scenario: User Registration
    Given user will enter the credentials
    
	@Regression
  Scenario Outline: microwave purchase
    Given John purchase microwave for "<price>" dollars
    And has a receipt
    When John returns the microwave
    Then he got the refund of "<price>" dollars

    Examples: 
      | price |
      |   abc |
      |   200 |
      |   300 |
      |   400 |

   @FunctionalTest @Smoke
  Scenario: microwave purchase
    Given John purchase microwave for 100 dollars
    And has a receipt
    When John returns the microwave
    Then he got the refund of 100 dollars
    
    @FunctionalTest
  Scenario: microwave purchase
    Given John purchase microwave for 100 dollars
    And has a receipt
    When John returns the microwave
    Then he got the refund of 100 dollars
    
    @DataDriven
    Scenario: credentials
    Given credentials are
    |user1|
    |user2|
    |user3|
    |user4|
    |user5|
    |user6|
      