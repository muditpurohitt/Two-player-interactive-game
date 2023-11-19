package assignment.magicalArena.Tests;

import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.DiceService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RollDiceTest {
    @Test
    void testRoll() {
        Player player = new Player("TestPlayer", 1, 50, 10, 100, new RollRandom());
        DiceService diceService = new DiceService(player, new RollRandom());

        // Redirect System.in to provide user input
        InputStream originalSystemIn = System.in;
        System.setIn(new ByteArrayInputStream("\n".getBytes()));

        // Ensure that the roll result is within the expected range
        int rollResult = diceService.roll();
        assertTrue(rollResult >= 1 && rollResult <= 6);

        // Reset System.in
        System.setIn(originalSystemIn);
    }
}
