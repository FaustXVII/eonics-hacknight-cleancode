package gameObjects;

public class GameState {
    private static final int STARTING_CREDITS_AMOUNT = 50;
    private final Credits creditsToSpend;
    private Credits creditsBet;
    private BetOptions placedBet;
    private BetOptions winningBet;

    public GameState(){
        creditsToSpend = new Credits(STARTING_CREDITS_AMOUNT);
    }

    public void placeBet(final Credits credits){
        creditsBet = credits;
        creditsToSpend.subtract(credits);
    }

    public void setBetOption(final BetOptions placedBet){
        this.placedBet = placedBet;
    }

    public boolean isWinner(){
        return winningBet.equals(placedBet);
    }

    public void setWinningBet(final BetOptions winningBet) {
        this.winningBet = winningBet;
    }

    public void updateCreditsBasedOnOutcome(){
        if(winWithA(BetOptions.SEVEN)){
            creditsToSpend.addFourTimes(creditsBet);

        } else if(winWithA(BetOptions.HIGH)){
            creditsToSpend.addTwice(creditsBet);

        } else if(winWithA(BetOptions.LOW)){
            creditsToSpend.addTwice(creditsBet);
        }
    }

    public Credits getCreditsToSpend() {
        return creditsToSpend;
    }

    private boolean winWithA(final BetOptions bet) {
        return placedBet.equals(bet) && winningBet.equals(bet);
    }

    public boolean canPlayAgain(){
        return creditsToSpend.getNumberOfCredits() > 0;
    }
}
