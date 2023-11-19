package assignment.magicalArena.Tests;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class WinnerTest {
    @Test
    void testGetWinner() {
        GameController gameController = new GameController();
        List<Player> lst = new ArrayList<>();
        lst.add(new Player("Player1", 1, 50, 10, 100));
        lst.add(new Player("Player2", 2, 40, 12, 120));
        Game game = Game.getBuilder().setPlayers(lst).setStrategy(new CheckHeathWinningStrategy()).build();
        Player winner = game.getPlayers().get(0);
        game.setWinner(winner);

        assertEquals(winner, gameController.getWinner(game));
    }
}
