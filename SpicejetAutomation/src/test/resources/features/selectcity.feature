Feature: Selecting city

  @selectcity
  Scenario: Selecting city in flights to search flights

    Given user is in homepage
    And user is able to select specefic city
    Then selected city is displayed

