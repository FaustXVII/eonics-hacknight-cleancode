package gameObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditsTest {

    @Test
    void subtract() {
        // Given
        final var subject = new Credits(50);

        // When
        subject.subtract(new Credits(30));

        // Then
        assertEquals(subject.getNumberOfCredits(), 20);

    }

    @Test
    void addFourTimes() {
        // Given
        final var subject = new Credits(50);

        // When
        subject.addFourTimes(new Credits(30));

        // Then
        assertEquals(subject.getNumberOfCredits(), 170);
    }

    @Test
    void addTwice() {
        // Given
        final var subject = new Credits(50);

        // When
        subject.addTwice(new Credits(30));

        // Then
        assertEquals(subject.getNumberOfCredits(), 110);
    }
}