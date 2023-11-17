package assignment.magicalArena.controller;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.winStrategy.GameWinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(List<Player> players, GameWinningStrategy gameWinningStrategy) throws Exception {
        //to start the game, we need players from the user, the players will be initializing the attributes
        //using builder design pattern to build the game for validations of the attributes
        return Game.getBuilder().setPlayers(players).setStrategy(gameWinningStrategy).build();
    }
    public void printPlayers(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game game){
        return null;
    }
}

