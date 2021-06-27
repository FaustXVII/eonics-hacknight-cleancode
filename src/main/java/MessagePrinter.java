public  class MessagePrinter {
    public static void printGameRules(){
        System.out.println("High-Low\n");
        System.out.println("- place a bet");
        System.out.println("- Is the sum of 2 dice below 7, low wins");
        System.out.println("- Is the sum of 2 dice above 7, high wins");
        System.out.println("- Is the sum of 2 dice 7, 7 wins double the bet!\n");
    }

    public static void printAmountOfCredits(GameState state){
        System.out.println("You have " + state.getCredits() + " credits");
    }

    public static void printBetAmount(){
        System.out.println("\nPlace a bet");
    }

    public static void printBetOn(){
        System.out.println("What you wanna bet on?");
        System.out.println("1. High");
        System.out.println("2. Low");
        System.out.println("3. 7");
    }

    public void printScore(){

    }

    public void printGameOver(){

    }

}
