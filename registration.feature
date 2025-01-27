
Feature: Registration feature

    Scenario Outline: Validating Registration feature using old and new user data
    Given the browser is open and navigated to the url
    When user navigates to Login page
    And  user enters username "<username>" email "<email>" and password "<password>"
    Then verify the status "<Expected Status>" of registration
    And browser is closed

    Examples: 
      | username    | email               |  password          |      Expected Status  | 
      | askalsa |     asip@gmail.com  |      yuep@343eedWW     |      Fail             |
      | apperows   |    po89qor@gmail.com |      wishd$234@ghE5  |      success         |
