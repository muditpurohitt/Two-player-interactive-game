//code simulation happens here
package assignment.magicalArena;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.types.GameState;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Game game = gameController.startGame();
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