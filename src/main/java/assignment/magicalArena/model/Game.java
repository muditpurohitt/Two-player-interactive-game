package assignment.magicalArena.model;

import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.service.*;
import assignment.magicalArena.service.DiceRollStrategy.DiceRollStrategy;
import assignment.magicalArena.service.MakeMoveService;
import assignment.magicalArena.service.winStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    //ATTRIBUTES
    private List<Player> players;
    private GameState gameState;
    private Player attacker;
    private Player defender;
    private Player winner;
    private GameWinningStrategy gameWinningStrategy;

    //CONSTRUCTOR
    private Game(List<Player> players, GameWinningStrategy gameWinningStrategy){
        this.players = players;
        this.gameWinningStrategy = gameWinningStrategy;
        this.gameState = GameState.IN_PROGRESS;

        if(players.get(0).getHealth() > players.get(0).getHealth()){
            this.attacker = players.get(1);
            this.defender = players.get(0);
        }
        else{
            this.attacker = players.get(0);
            this.defender = players.get(1);
        }
    }



    //METHODS
    public Player getWinnerPlayer() {
        return winner;
    }
    public void setWinner(Player player){
        winner = player;
    }
    public Player getAttacker() {
        return attacker;
    }
    public void setAttacker(Player player){ attacker = player;}
    public Player getDefender() {
        return defender;
    }
    public void setDefender(Player player){ defender = player;}
    public GameState getGameState() {
        return gameState;
    }
    public void setGameState(GameState state) { gameState = state; }
    public GameWinningStrategy getGameWinningStrategy() {return gameWinningStrategy;}
    public static Builder getBuilder(){
        return new Builder();
    }
    public void printPlayers() {new PrintPlayersService(players).print();}
    public void makeMove(){
        System.out.println("Attacker : " + attacker.getName());
        System.out.println("Defender : " + defender.getName());

        Integer damage = new MakeMoveService(this).play();

        System.out.println(defender.getName() + " incurred a damage of " + damage + " now has health: " + defender.getHealth());

        new GameStatusUpdatingService(this).update();
    }




    //BUILDER
    public static class Builder{
        private List<Player> players;
        private GameWinningStrategy gameWinningStrategy;
        private Builder(){
            this.players = new ArrayList<>();
        }


        public Builder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }
        public Builder setStrategy(GameWinningStrategy gameWinningStrategy){
            this.gameWinningStrategy = gameWinningStrategy;
            return this;
        }
        public Game build(){
            return new Game(players,gameWinningStrategy);
        }
    }
}
