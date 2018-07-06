package com.aya.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

/**
 * @author Artem
 * @date 03.06.2018
 */
public class SimpleGameStepdefs {

    private SimpleGame simpleGame;
    private String result;

    @Given("^Create a game play$")
    public void createAGamePlay() {
        simpleGame = new SimpleGame();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
        result = simpleGame.play(number);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) {
        Assertions.assertEquals(result, resultString);
    }
}
