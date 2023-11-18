package assignment.magicalArena.model;

import assignment.magicalArena.model.types.GameState;
import assignment.magicalArena.winStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private GameState gameState;
    private Player attacker;
    private Player defender;
    private Player winner;
    private GameWinningStrategy gameWinningStrategy;

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

    public Player getWinnerPlayer() {
        return winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Integer getAttackerIndex() {
        return attacker.getIndex();
    }

    public Integer getDefenderIndex() {
        return defender.getIndex();
    }

    public void makeMove(){
        /*
          1. get the attacker
          2. get the defender
          3. define attack value
          4. define defend value
          5. update reduced health
        */

        System.out.println("Attacker : " + attacker.getName());
        System.out.println("Defender : " + defender.getName());

        int attackValue = attacker.rollDice()*attacker.getAttack();
        int defendValue = defender.rollDice()*defender.getStrength();
        defender.setHealth(attackValue - defendValue);

        if(gameWinningStrategy.checkWinner(defender)){
            gameState = GameState.END;
            winner = defender;
        }
        else{
            Player temp = defender;
            defender = attacker;
            attacker = temp;
        }
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
