package assignment.magicalArena.winStrategy;

import assignment.magicalArena.model.Move;
import assignment.magicalArena.model.Player;

public interface GameWinningStrategy {
    public boolean checkWinner(Player p);
}
