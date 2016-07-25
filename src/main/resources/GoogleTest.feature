Feature: Basic search

  Scenario: Perform google search
    Given Anonymous user opening google home page
    When User type in search bar "rectangle" word
    Then Search results should appear