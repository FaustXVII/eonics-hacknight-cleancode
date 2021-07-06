import gameObjects.Credits;
import mocks.GameStateSpy;
import mocks.InputMock;
import mocks.OutputSpy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {

    @Test
    void startNewGame() {
        // Given
        final var inputMock = new InputMock();
        final var outputSpy = new OutputSpy();
        final var state = new GameStateSpy();
        final var subject = new GameManager(inputMock, outputSpy, state);

        // When
        subject.startNewGame();

        // Then
        if(outputSpy.isWinner()) {
            assertEquals(new Credits(60).getNumberOfCredits(), outputSpy.getCredits().getNumberOfCredits());
        }else {
            assertEquals(new Credits(40).getNumberOfCredits(), outputSpy.getCredits().getNumberOfCredits());
        }
    }
}