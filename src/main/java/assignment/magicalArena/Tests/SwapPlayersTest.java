package assignment.magicalArena.Tests;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapPlayersTest {
    @Test
    void testSwapPlayers() {
        Player player1 = new Player("Player1", 1, 50, 10, 100, new RollRandom());
        Player player2 = new Player("Player2", 2, 40, 12, 120, new RollRandom());

        List<Player> lst = new ArrayList<>();
        lst.add(player1);
        lst.add(player2);
        Game game = Game.getBuilder().setPlayers(lst).setStrategy(new CheckHeathWinningStrategy()).build();


        Player originalAttacker = game.getAttacker();
        Player originalDefender = game.getDefender();

        // Swap players in the game
        Player temp = game.getDefender();
        game.setDefender(game.getAttacker());
        game.setAttacker(temp);

        // Ensure that the players are swapped correctly
        assertEquals(originalDefender, game.getAttacker());
        assertEquals(originalAttacker, game.getDefender());
    }
}
