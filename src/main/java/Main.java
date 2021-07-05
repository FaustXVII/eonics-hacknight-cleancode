import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int credits = 50;

    public static void main (String... args){
        System.out.println("High-Low\n");
        System.out.println("- place a bet");
        System.out.println("- Is the sum of 2 dice below 7, low wins");
        System.out.println("- Is the sum of 2 dice above 7, high wins");
        System.out.println("- Is the sum of 2 dice 7, 7 wins double the bet!\n");


        System.out.println("You have " + credits + " credits");
        System.out.println("Place a bet");
        var bet = new Scanner(System.in).nextInt();

        System.out.println("What you wanna bet on?");
        System.out.println("1. High");
        System.out.println("2. Low");
        System.out.println("3. 7");
        var betOn = new Scanner(System.in).nextInt();


        System.out.println("Roll the dice! ");
        var roll_1 = new Random().nextInt(6) +1;
        var roll_2 = new Random().nextInt(6) +1;

        System.out.println("You Rolled a : " + roll_1 + " and a " + roll_2);

        var sum = roll_1 + roll_2;
        System.out.println("The sum is: "  + sum);

        if(sum > 7){
            if (betOn == 1){
                System.out.println("You won!");
                credits += bet;
            }else{
                System.out.println("You Lost!");
                credits -= bet;
            }
        }

        if(sum < 7){
            if (betOn == 2){
                System.out.println("You won!");
                credits += bet;
            }else{
                System.out.println("You Lost!");
                credits -= bet;
            }
        }

        if(sum == 7){
            if (betOn == 3){
                System.out.println("You won!");
                credits += (bet * 2);
            }else{
                System.out.println("You Lost!");
                credits -= bet;
            }
        }

        System.out.println("You have " + credits + " credits");

        if(credits < 1){
            System.out.println("\nGame Over!");
        }else {
            main();
        }

    }
}

