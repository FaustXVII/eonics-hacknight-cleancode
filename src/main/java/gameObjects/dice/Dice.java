package gameObjects.dice;

import java.util.Random;

public class Dice {

    public DiceResults rollTwoDice(){
        final var r1 = random();
        final var r2 = random();

        return new DiceResults(r1, r2);
    }

    private int random(){
        return new Random().nextInt(6) + 1;
    }
}