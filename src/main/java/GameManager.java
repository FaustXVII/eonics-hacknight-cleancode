import gameObjects.GameState;
import gameObjects.dice.Dice;
import io.input.InputAdapter;
import io.output.OutputAdapter;

final class GameManager {
    private final InputAdapter input;
    private final OutputAdapter output;
    private final GameState state;


    GameManager(final InputAdapter input, final OutputAdapter output, final GameState state){
        this.input = input;
        this.output = output;
        this.state = state;
    }

    void startNewGame(){
        output.displayGameRules();
        startGameRound();
    }

    private void startGameRound(){
        output.displayCreditsToSpend(state);

        output.displayQuestion_HowMuchYouWannaBet();
        final var bet = input.getBetAmountFromUser(state);
        state.placeBet(bet);

        output.displayQuestion_OnWhatOutcomeDoYouBet();
        final var betOn = input.getBetOnFromUser();
        state.setBetOption(betOn);

        final var diceResults = new Dice().rollTwoDice();
        output.displayDiceRollResults(diceResults);
        final var winningBet = diceResults.getWinningBetOption();
        state.setWinningBet(winningBet);
        state.updateCreditsBasedOnOutcome();

        output.displayScoreScreen(state);
        output.displayCreditsToSpend(state);

        if(state.canPlayAgain()) {
            startGameRound();
        }
    }
}
