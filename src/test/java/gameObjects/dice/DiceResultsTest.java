package gameObjects.dice;

import gameObjects.BetOptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceResultsTest {

    @Test
    void getWinningBetOption_High() {
        // Given
        final var subject = new DiceResults(6, 2);

        // When
        final var result = subject.getWinningBetOption();


        // Then
        assertEquals(BetOptions.HIGH, result);
    }

    @Test
    void getWinningBetOption_Low() {
        // Given
        final var subject = new DiceResults(5, 1);

        // When
        final var result = subject.getWinningBetOption();


        // Then
        assertEquals(BetOptions.LOW, result);
    }

    @Test
    void getWinningBetOption_Seven() {
        // Given
        final var subject = new DiceResults(6, 1);

        // When
        final var result = subject.getWinningBetOption();


        // Then
        assertEquals(BetOptions.SEVEN, result);
    }
}