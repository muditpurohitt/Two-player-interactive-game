package assignment.magicalArena.service.winStrategy;

import assignment.magicalArena.model.Player;

public class CheckHeathWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Player defender) {
        if(defender.getHealth() <= 0) return true;
        return false;
    }
}
