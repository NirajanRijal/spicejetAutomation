Feature: Selecting required date

  @datepick
  Scenario: Date should select from calendar

    Given user is in homepage
    And user select required departure date
    Then selected date should be displayed

