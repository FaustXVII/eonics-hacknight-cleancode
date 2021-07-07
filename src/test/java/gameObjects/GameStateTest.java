package gameObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    void updateCreditsBasedOnOutcome_winHigh() {
        // Given
        final GameState subject = initState(BetOptions.H, BetOptions.H);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_winLow() {
        // Given
        final GameState subject = initState(BetOptions.L, BetOptions.L);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_winSeven() {
        // Given
        final GameState subject = initState(BetOptions.S, BetOptions.S);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseHigh() {
        // Given
        final GameState subject = initState(BetOptions.H, BetOptions.L);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() < 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseLow() {
        // Given
        final GameState subject = initState(BetOptions.L, BetOptions.H);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() < 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseSeven() {
        // Given
        final GameState subject = initState(BetOptions.S, BetOptions.H);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() < 50);

    }

    private GameState initState(final BetOptions bet, final BetOptions win) {
        final var subject = new GameState();
        subject.placeBet(new Credits(30));
        subject.setBetOption(bet);
        subject.setWinningBet(win);
        return subject;
    }
}