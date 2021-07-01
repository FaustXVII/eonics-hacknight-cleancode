package io.output;

import gameObjects.GameState;
import gameObjects.dice.DiceResults;

public interface OutputAdapter {
    void displayGameRules();

    void displayQuestion_HowMuchYouWannaBet();

    void displayQuestion_OnWhatOutcomeDoYouBet();

    void displayDiceRollResults(final DiceResults diceResults);

    void displayScoreScreen(final GameState state);

    void displayCreditsToSpend(final GameState state);
}
