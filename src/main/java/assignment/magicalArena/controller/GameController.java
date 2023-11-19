package assignment.magicalArena.controller;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.ConsoleInputServices.InputService;
import assignment.magicalArena.service.winStrategy.GameWinningStrategy;

import java.util.List;

public class GameController {

    public List<Player> getInput(){
        return new InputService().getInput();
    }

    public Game startGame(List<Player> players, GameWinningStrategy gameWinningStrategy) throws Exception {
        return Game.getBuilder().setPlayers(players).setStrategy(gameWinningStrategy).build();
    }
    public void printPlayers(Game game){
        game.printPlayers();
    }

    public Player getWinner(Game game){
        return game.getWinnerPlayer();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }
}

