package assignment.magicalArena.model;

import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.winStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private GameState gameState;
    private Integer nextPlayerIndex;
    private Player winner;

    private GameWinningStrategy gameWinningStrategy;

    private Game(List<Player> players, GameWinningStrategy gameWinningStrategy){
        this.players = players;
        this.gameWinningStrategy = gameWinningStrategy;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0;
    }

    public Player getWinnerPlayer() {
        return winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void makeMove(){

    }

    public static Builder getBuilder(){
        return new Builder();
    }



    public void printPlayers() {
        for(int i = 0; i < players.size(); i++){
            players.get(i).printPlayer();
        }
    }


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

        public Game build() throws Exception {
            validate();
            return new Game(players,gameWinningStrategy);
        }

        private void validate() throws Exception {
            if(players.size() != 2){
                throw new Exception();
            }
        }



    }
}
