package assignment.magicalArena.service.winStrategy;

import assignment.magicalArena.model.Player;

public interface GameWinningStrategy {
    public boolean checkWinner(Player p);
}
