package io.output;

import gameObjects.GameState;
import gameObjects.dice.DiceResults;

public class ConsolePrinter implements OutputAdapter {
    @Override
    public void displayGameRules() {
        final var message =
            "High 'n Low\n\n" +
            "This is how a game of High 'n Low works:\n" +
            "You place a bet on high, low or seven\n" +
            "You roll two, 6 eyed dice\n" +
            "Is the sum greater than seven, High wins double the bet\n" +
            "Is the sum less than seven, low wins double the bet\n" +
            "Is the sum seven, seven wins 4 times the bet!\n" +
            "In all cases, if you lose, the amount you bet is gone.\n";

        System.out.println(message);
    }

    @Override
    public void displayQuestion_HowMuchYouWannaBet() {
        final var message =
            "Enter how much you would like to bet.";

        System.out.println(message);
    }

    @Override
    public void displayQuestion_OnWhatOutcomeDoYouBet() {
        final var message =
            "On what outcome would you like to bet?\n" +
                "1. High\n" +
                "2. Low\n" +
                "3. Seven";

        System.out.println(message);
    }

    @Override
    public void displayDiceRollResults(final DiceResults diceResults) {
        final var message =
            "You rolled a [" + diceResults.getRollOne() + "] and a [" + diceResults.getRollTwo() + "]\n" +
            "Total : " + diceResults.getSum();

        System.out.println(message);
    }

    @Override
    public void displayScoreScreen(final GameState state) {
        final String message;
        if (state.isWinner())
            message = "You won!";
        else
            message = "You lost!";


        System.out.println(message);
    }

    @Override
    public void displayCreditsToSpend(final GameState state) {
        System.out.println("Your balance: [" + state.getCreditsToSpend().getNumberOfCredits() + "] credits.");
    }
}
