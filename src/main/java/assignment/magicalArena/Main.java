//code simulation happens here
package assignment.magicalArena;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Game game = null;

        try{game = gameController.startGame(gameController.getInput(), new CheckHeathWinningStrategy());}
        catch (Exception e){
            System.out.println("Please enter 2 players");
        }

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.printPlayers(game);
            gameController.makeMove(game);
        }

        System.out.println(gameController.getWinner(game).getName()+ " won the game...");
    }

}