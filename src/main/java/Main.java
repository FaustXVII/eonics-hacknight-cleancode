import gameObjects.GameState;
import io.input.CommandlineScanner;
import io.output.ConsolePrinter;

public class Main {
    public static void main (String... args){
        new GameManager(new CommandlineScanner(), new ConsolePrinter(), new GameState()).startNewGame();
    }
}
