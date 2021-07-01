package io.input;

import gameObjects.BetOptions;
import gameObjects.Credits;
import gameObjects.GameState;

public interface InputAdapter {
    Credits getBetAmountFromUser(final GameState state);

    BetOptions getBetOnFromUser();
}
