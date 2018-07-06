Feature: Simple Game play

  Scenario: Play Game to get Foo
    Given Create a game play
    When I play with number 3
    Then The result is "Foo"

  Scenario: Play Game to get Boo
    Given Create a game play
    When I play with number 5
    Then The result is "Boo"

  Scenario: Play Game to get FooBoo
    Given Create a game play
    When I play with number 15
    Then The result is "FooBoo"