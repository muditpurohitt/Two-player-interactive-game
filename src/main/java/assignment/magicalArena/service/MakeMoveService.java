package assignment.magicalArena.service;

import assignment.magicalArena.model.Game;

//this contains the main logic
public class MakeMoveService {
    private Game game;
    public MakeMoveService(Game game){
        this.game = game;
    }
    public Integer play(){
        int attackValue = game.getAttacker().rollDice()*game.getAttacker().getAttack();
        int defendValue = game.getDefender().rollDice()*game.getDefender().getStrength();
        //if attack value is less than defend value, no damage is inflicted to the defender
        int damage = attackValue <= defendValue ? 0: attackValue - defendValue;
        game.getDefender().setHealth(game.getDefender().getHealth() - damage);

        return damage;
    }
}
