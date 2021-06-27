import java.util.Random;
import java.util.Scanner;

public class GameManager {
    public void startNewGame(){
        MessagePrinter.printGameRules();

        startNewRound(new GameState());
    }

    public void startNewRound(GameState state){
        // place bet
        MessagePrinter.printAmountOfCredits(state);

        MessagePrinter.printBetAmount();
        var bet = new Scanner(System.in).nextInt();

        MessagePrinter.printBetOn();
        var betOn = new Scanner(System.in).nextInt();

        rollDice(state, bet, betOn);
    }

    private void rollDice(GameState state, int bet, int betOn) {
        var roll_1 = new Random().nextInt(6) +1;
        var roll_2 = new Random().nextInt(6) +1;

        System.out.println("You Rolled a : " + roll_1 + " and a " + roll_2);

        var sum = roll_1 + roll_2;
        System.out.println("The sum is: "  + sum);

        if(sum > 7){
            if (betOn == 1){
                System.out.println("You won!");
                state.addToCredits(bet);
            }else{
                System.out.println("You Lost!");
                state.removeFromCredits(bet);
            }
        }

        if(sum < 7){
            if (betOn == 2){
                System.out.println("You won!");
                state.addToCredits(bet);
            }else{
                System.out.println("You Lost!");
                state.removeFromCredits(bet);
            }
        }

        if(sum == 7){
            if (betOn == 3){
                System.out.println("You won!");
                state.addToCredits(bet * 2);
            }else{
                System.out.println("You Lost!");
                state.removeFromCredits(bet);
            }
        }


        isGameOver(state);
    }

    private void isGameOver(GameState state) {
        if(state.getCredits() < 1){
            System.out.println("\nGame Over!");
        }else {
            startNewRound(state);
        }
    }

}
