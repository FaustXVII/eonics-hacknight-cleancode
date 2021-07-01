package gameObjects.dice;

import gameObjects.BetOptions;

public class DiceResults {
    final int rollOne;
    final int rollTwo;
    final int sum;

    public DiceResults(final int rollOne, final int rollTwo){
        this.rollOne = rollOne;
        this.rollTwo = rollTwo;
        sum = rollOne + rollTwo;
    }

    public int getRollOne() {
        return rollOne;
    }

    public int getRollTwo() {
        return rollTwo;
    }

    public int getSum(){
        return  sum;
    }

    public BetOptions getWinningBetOption(){
        if(sum > 7)
            return BetOptions.HIGH;

        if(sum < 7)
            return BetOptions.LOW;

        return BetOptions.SEVEN;
    }
}
