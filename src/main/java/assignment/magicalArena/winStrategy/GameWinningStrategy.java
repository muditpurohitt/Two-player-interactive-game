package assignment.magicalArena.winStrategy;

import assignment.magicalArena.model.Move;

public interface GameWinningStrategy {
    public boolean checkWinner(Move move);
}
