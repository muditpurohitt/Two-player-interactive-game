package assignment.magicalArena.service;

import assignment.magicalArena.model.Game;
import assignment.magicalArena.model.Player;
import assignment.magicalArena.model.types.GameState;

//
public class GameStatusUpdatingService {
    private Game game;
    public GameStatusUpdatingService(Game game){
        this.game = game;
    }
    public void update(){
        if(game.getGameWinningStrategy().checkWinner(game.getDefender())){
            game.setGameState(GameState.END);
            game.setWinner(game.getAttacker());
        }
        else{
            Player temp = game.getDefender();
            game.setDefender(game.getAttacker());
            game.setAttacker(temp);
        }
    }
}
