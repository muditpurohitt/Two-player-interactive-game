package assignment.magicalArena.winStrategy;

import assignment.magicalArena.model.Move;
import assignment.magicalArena.model.Player;

public class CheckHeathWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Player defender) {
        if(defender.getHealth() <= 0) return true;
        return false;
    }
}
