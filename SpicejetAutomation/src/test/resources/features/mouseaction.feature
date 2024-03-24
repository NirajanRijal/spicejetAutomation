Feature: Mouse action

  @mouseaction
  Scenario: Using mouse action on website

    Given user is in homepage
    And user rightclick on deals and open deal page
    And on dealpage user click on flight
    Then user doubleclick and highlight welcome to hot deals

