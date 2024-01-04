package assignment.magicalArena.model;

import assignment.magicalArena.service.DiceRollStrategy.DiceRollStrategy;
import assignment.magicalArena.service.DiceService;
import assignment.magicalArena.service.PrintPlayersService;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private Integer index;
    private Integer strength;
    private Integer attack;
    private Integer health;
    private DiceRollStrategy diceRollStrategy;

    public Player(String name, Integer index, Integer strength, Integer attack, Integer health, DiceRollStrategy diceRollStrategy){
        this.name = name;
        this.index = index;
        this.strength = strength;
        this.attack = attack;
        this.health = health;
        this.diceRollStrategy = diceRollStrategy;
    }

    public String getName(){return name;}
    public Integer getIndex(){return index;}
    public Integer getHealth(){return health;}
    public void setHealth(Integer value){this.health = value;}
    public Integer getStrength(){return strength;}
    public Integer getAttack(){return attack;}

    //player rolls the dice
    public Integer rollDice() {return new DiceService(this, diceRollStrategy).roll();}
}
