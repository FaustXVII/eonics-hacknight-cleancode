package mocks;

import gameObjects.BetOptions;
import gameObjects.Credits;
import gameObjects.GameState;
import io.input.InputAdapter;

public class InputMock implements InputAdapter {
    @Override
    public Credits getBetAmountFromUser(GameState state) {
        return new Credits(10);
    }

    @Override
    public BetOptions getBetOnFromUser() {
        return BetOptions.HIGH;
    }
}
