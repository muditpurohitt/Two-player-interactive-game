package assignment.magicalArena.winStrategy;

import assignment.magicalArena.model.Move;
import assignment.magicalArena.model.Player;

public class CheckHeathWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Player Attacker) {
        if(Attacker.getHealth() <= 0)
    }
}
