//code simulation happens here
package assignment.magicalArena;

import assignment.magicalArena.controller.GameController;
import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.winStrategy.CheckHeathWinningStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Game game = gameController.startGame(gameController.getInput(new RollRandom()), new CheckHeathWinningStrategy());

        Scanner scn = new Scanner(System.in);
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            gameController.printPlayers(game);
            gameController.makeMove(game);

            //functionality to quit anytime q is pressed
            System.out.print("Enter 'q' anytime, to exit: ");
            String userInput = scn.nextLine();
            if ("q".equalsIgnoreCase(userInput)) {
                System.out.println("Exiting the game...");
                break;
            }
        }

        try{System.out.println(gameController.getWinner(game).getName()+ " won the game...");}
        catch (Exception e){System.out.println("Game exited in between");}
    }

}