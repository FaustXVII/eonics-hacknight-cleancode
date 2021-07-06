package mocks;

import gameObjects.Credits;
import gameObjects.GameState;
import io.output.ConsolePrinter;

public class OutputSpy extends ConsolePrinter {
    private Credits credits;
    private boolean isWinner;

    @Override
    public void displayScoreScreen(GameState state) {
        credits = state.getCreditsToSpend();
        isWinner = state.isWinner();

        super.displayScoreScreen(state);
    }

    public Credits getCredits() {
        return credits;
    }

    public boolean isWinner() {
        return isWinner;
    }
}
