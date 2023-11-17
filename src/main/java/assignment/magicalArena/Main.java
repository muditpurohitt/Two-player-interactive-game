//code simulation happens here
package assignment.magicalArena;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.winStrategy.CheckHeathWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        List<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());

        Game game = gameController.startGame(players, new CheckHeathWinningStrategy());
        //in case there are multiple games running, we need to specify which game we are talking about to
        // the GameController
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            /**
             * 1. Print the playes and attributes
             * 2. Identify which playes has to attack
             * 3. Ask player to roll the dice / execute the the dice roll function
             */

            gameController.printPlayers(game);
            gameController.makeMove(game);
        }
    }
}