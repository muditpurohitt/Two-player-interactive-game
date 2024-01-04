package assignment.magicalArena.controller;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.ConsoleInputServices.InputService;
import assignment.magicalArena.service.DiceRollStrategy.DiceRollStrategy;
import assignment.magicalArena.service.winStrategy.GameWinningStrategy;

import java.util.List;

public class GameController {

    //takes the input from the console
    public List<Player> getInput(DiceRollStrategy diceRollStrategy){
        return new InputService(diceRollStrategy).getInput();
    }

    //starts the game
    public Game startGame(List<Player> players, GameWinningStrategy gameWinningStrategy){
        return Game.getBuilder().setPlayers(players).setStrategy(gameWinningStrategy).build();
    }

    //prints the players to the console
    public void printPlayers(Game game){
        game.printPlayers();
    }

    //returns the winner to main class
    public Player getWinner(Game game){
        return game.getWinnerPlayer();
    }

    //makes the next move
    public void makeMove(Game game){
        game.makeMove();
    }

    //returns the game state after it move to the main class
    public GameState checkState(Game game){
        return game.getGameState();
    }
}

