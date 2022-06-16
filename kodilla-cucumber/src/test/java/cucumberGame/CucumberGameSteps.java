package cucumberGame;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CucumberGameSteps implements En {

    private int number;
    private String answer;

    public CucumberGameSteps() {
        Given("number is divisible of three", () -> {
            number = 3;
        });

        Given("number is divisible of five", () -> {
            number = 5;
        });

        Given("number is divisible by three and five", () -> {
            number = 15;
        });

        Given("another case", () -> {
            number = 1;
        });

        When("I enter a number", () -> {
            CucumberGame fizzBuzz = new CucumberGame();
            answer = fizzBuzz.play(number);
        });

        Then("I should be told the correct {string}", (String string) -> {
            Assert.assertEquals(string, answer);
        });
    }
}
