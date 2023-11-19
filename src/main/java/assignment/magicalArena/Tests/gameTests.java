package assignment.magicalArena.Tests;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class gameWinningTest {
    @Test
    void testGameWinning() {
        // Test the winning condition of the game
        Player player1 = new Player("Player1", 1, 100, 20, 50);
        Player player2 = new Player("Player2", 2, 120, 15, 30);
        List<Player> lst = new ArrayList<>();
        lst.add(player1);
        lst.add(player2);
        Game game = Game.getBuilder().setPlayers(lst).setStrategy(new CheckHeathWinningStrategy()).build();
        game.setWinner(player1);

        assertEquals(GameState.END, game.getGameState());
        assertEquals(player1, game.getWinnerPlayer());
    }
}
