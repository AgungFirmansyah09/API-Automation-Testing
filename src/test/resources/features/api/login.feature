@Login
Feature: user login

  @Positive-Login
  Scenario: POST User login Successful
    When user send user send POST success login request to server
    Then response status code should be 200
    And response structure should match json schema "loginSuccessfully.json"

  @Nefative-Login
  Scenario: POST User login Unsuccessful
    When user send user send POST invalid login request to server
    Then response status code should be 400
    And response structure should match json schema "loginUnsuccess.json"

