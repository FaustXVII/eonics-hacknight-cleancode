package gameObjects.dice;

import gameObjects.BetOptions;

public class DiceResults {
    final int r1; // Roll one
    final int r2; // Roll 2
    final int sum;

    public DiceResults(final int r1, final int r2){
        this.r1 = r1;
        this.r2 = r2;
        sum = r1 + r2;
    }

    public int getR1() {
        return r1;
    }

    public int getR2() {
        return r2;
    }

    public int getSum(){
        return  sum;
    }

    public BetOptions getWinningBetOption(){
        if(sum > 7)
            return BetOptions.H;

        if(sum < 7)
            return BetOptions.L;

        return BetOptions.S;
    }
}
