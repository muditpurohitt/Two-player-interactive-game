package assignment.magicalArena.Tests;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintPlayersTest {
    @Test
    void testPrintPlayers() {
        GameController gameController = new GameController();
        List<Player> lst = new ArrayList<>();
        lst.add(new Player("Player1", 1, 50, 10, 100, new RollRandom()));
        lst.add(new Player("Player2", 2, 40, 12, 120, new RollRandom()));
        Game game = Game.getBuilder().setPlayers(lst).setStrategy(new CheckHeathWinningStrategy()).build();

        // Redirect System.out to capture output
        TestPrintStream testPrintStream = new TestPrintStream();
        System.setOut(testPrintStream);

        // Print players and capture the output
        gameController.printPlayers(game);
        String output = testPrintStream.getOutput();

        // Reset System.out
        System.setOut(System.out);

        // Validate the output contains player information
        assertTrue(output.contains("Player1"));
        assertTrue(output.contains("Player2"));
        assertTrue(output.contains("50"));
        assertTrue(output.contains("40"));
        assertTrue(output.contains("10"));
        assertTrue(output.contains("12"));
        assertTrue(output.contains("100"));
        assertTrue(output.contains("120"));
    }

    private static class TestPrintStream extends PrintStream {
        private final StringBuilder output;

        TestPrintStream() {
            super(System.out);
            this.output = new StringBuilder();
        }

        @Override
        public void println(String x) {
            output.append(x).append("\n");
        }

        String getOutput() {
            return output.toString();
        }
    }
}
