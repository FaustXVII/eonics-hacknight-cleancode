package gameObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    void updateCreditsBasedOnOutcome_winHigh() {
        // Given
        final GameState subject = initState(BetOptions.HIGH, BetOptions.HIGH);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_winLow() {
        // Given
        final GameState subject = initState(BetOptions.LOW, BetOptions.LOW);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_winSeven() {
        // Given
        final GameState subject = initState(BetOptions.SEVEN, BetOptions.SEVEN);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() > 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseHigh() {
        // Given
        final GameState subject = initState(BetOptions.HIGH, BetOptions.LOW);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() < 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseLow() {
        // Given
        final GameState subject = initState(BetOptions.LOW, BetOptions.HIGH);

        // When
        subject.updateCreditsBasedOnOutcome();

        // Then
        assertTrue(subject.getCreditsToSpend().getNumberOfCredits() < 50);

    }

    @Test
    void updateCreditsBasedOnOutcome_loseSeven() {
        // Given
        final GameState subject = initState(BetOptions.SEVEN, BetOptions.HIGH);

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