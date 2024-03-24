Feature: USD should get selected

  @dropdown
  Scenario: user is able to select USD in currency dropdown

    Given user enter website address
    And user click on currency dropdown
    Then user select the usd

