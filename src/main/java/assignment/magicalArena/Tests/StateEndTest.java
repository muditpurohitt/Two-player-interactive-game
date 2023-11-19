package assignment.magicalArena.Tests;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateEndTest {
    @Test
    void testCheckStateEnd() {
        GameController gameController = new GameController();
        List<Player> lst = new ArrayList<>();
        lst.add(new Player("Player1", 1, 50, 10, 100, new RollRandom()));
        lst.add(new Player("Player2", 2, 40, 12, 120, new RollRandom()));
        Game game = Game.getBuilder().setPlayers(lst).setStrategy(new CheckHeathWinningStrategy()).build();
        game.setGameState(GameState.END);

        assertEquals(GameState.END, gameController.checkState(game));
    }
}
