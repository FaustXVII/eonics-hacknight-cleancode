import gameObjects.GameState;
import io.input.CommandlineScanner;
import io.output.ConsolePrinter;

public class Main {
    private static int credits = 50;

    public static void main (String... args){
        new GameManager(new CommandlineScanner(), new ConsolePrinter(), new GameState()).startNewGame();
    }
}
