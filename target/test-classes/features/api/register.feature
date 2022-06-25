@Register
Feature: user register

  @Positive-Register
  Scenario: POST User Register Successful
    When user send user send POST success register request to server
    Then response status code should be 200
    And response structure should match json schema "registerSuccess.json"

  @Nefative-Register
  Scenario: POST User Register Unsuccessful
    When user send user send POST invalid register request to server
    Then response status code should be 400
    And response structure should match json schema "registerUnsuccess.json"

