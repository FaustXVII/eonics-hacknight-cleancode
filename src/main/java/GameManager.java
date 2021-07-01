import gameObjects.GameState;
import gameObjects.dice.Dice;
import io.input.InputAdapter;
import io.output.OutputAdapter;

public class GameManager {
    private final InputAdapter input;
    private final OutputAdapter output;
    private final GameState state;


    public GameManager(final InputAdapter input, final OutputAdapter output, final GameState state){
        this.input = input;
        this.output = output;
        this.state = state;
    }

    public void startNewGame(){
        output.displayGameRules();
        startGameRound();
    }

    private void startGameRound(){
        output.displayCreditsToSpend(state);

        howMuchYouWannaBet();
        OnWhatOutcomeDoYouBet();
        rollTheDice();

        output.displayScoreScreen(state);
        output.displayCreditsToSpend(state);

        nextRound();
    }

    private void howMuchYouWannaBet() {
        output.displayQuestion_HowMuchYouWannaBet();
        final var bet = input.getBetAmountFromUser(state);
        state.placeBet(bet);
    }

    private void OnWhatOutcomeDoYouBet() {
        output.displayQuestion_OnWhatOutcomeDoYouBet();
        final var betOn = input.getBetOnFromUser();
        state.setBetOption(betOn);
    }

    private void rollTheDice() {
        // Start round N - state
        final var diceResults = new Dice().rollTwoDice();
        output.displayDiceRollResults(diceResults);
        final var winningBet = diceResults.getWinningBetOption();
        state.setWinningBet(winningBet);
        state.updateCreditsBasedOnOutcome();
    }

    private void nextRound() {
        if(state.canPlayAgain()) {
            startGameRound();
        }
    }
}
