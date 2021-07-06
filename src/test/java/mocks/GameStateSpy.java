package mocks;

import gameObjects.GameState;

public class GameStateSpy extends GameState {
    @Override
    public boolean canPlayAgain() {
        return false;
    }
}
