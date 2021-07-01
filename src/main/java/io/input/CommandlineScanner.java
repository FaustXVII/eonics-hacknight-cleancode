package io.input;

import gameObjects.BetOptions;
import gameObjects.Credits;
import gameObjects.GameState;

import java.util.Scanner;

public class CommandlineScanner implements InputAdapter{
    private final RuntimeException simpleWrongInputException = new RuntimeException("Invalid input");

    @Override
    public Credits getBetAmountFromUser(final GameState state) {
        final var input = new Scanner(System.in).nextInt();

        if(input > state.getCreditsToSpend().getNumberOfCredits())
            throw simpleWrongInputException;

        return new Credits(input);
    }

    @Override
    public BetOptions getBetOnFromUser() {
        final var input = new Scanner(System.in).nextInt();

        if (input == 1)
            return BetOptions.HIGH;

        if (input == 2)
            return BetOptions.LOW;

        if (input == 3)
            return BetOptions.SEVEN;

        throw simpleWrongInputException;
    }
}
