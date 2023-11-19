package assignment.magicalArena.Tests;

import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceService;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceServiceTest {
    @Test
    void testDiceService() {
        // Test the DiceService to ensure it generates valid dice rolls
        Player player = new Player("TestPlayer", 1, 100, 20, 50);
        DiceService diceService = new DiceService(player);

        // Mock user pressing enter
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        System.setIn(in);

        int rollResult = diceService.roll();
        assertTrue(rollResult >= 1 && rollResult <= 6);
    }
}
