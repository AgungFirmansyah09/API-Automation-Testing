@User
Feature: User Transaction
  AS user has login
  and user create data
  and user Get data

  @CREATE-User
  Scenario: POST Create user Successfully
    When user send POST Create user request to server
    Then response status code should be 201
    And response structure should match json schema "CreateUser.json"

  @UPDATE-User
    Scenario: PUT Update user Successfully
    When user send PUT Update user request to server
    Then response status code should be 200
    And response structure should match json schema "UpdateUser.json"

  @GET-List
  Scenario: GET list User Successfully
    When user send  GET list user request to server
    Then response status code should be 200
    And response structure should match json schema "GetListUser.json"

  @GET-Single
  Scenario: GET Single User Successfully
    When user send GET Single user request to server
    Then response status code should be 200
    And response structure should match json schema "GetSingleUSer.json"

  @DELETE-User
  Scenario: DELETE user Successfully
    When user send DELETE user request to server
    Then response status code should be 204



