package gameObjects.dice;

import java.util.Random;

public class Dice {
    private static final int OFFSET_LET_RANDOM_START_AT_ONE_INSTEAD_OF_ZERO = 1;

    public DiceResults rollTwoDice(){
        final var rollOne = roll6EyedDice();
        final var rollTwo = roll6EyedDice();

        return new DiceResults(rollOne, rollTwo);
    }

    private int roll6EyedDice(){
        return new Random().nextInt(6) + OFFSET_LET_RANDOM_START_AT_ONE_INSTEAD_OF_ZERO;
    }
}