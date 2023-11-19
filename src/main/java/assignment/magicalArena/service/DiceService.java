package assignment.magicalArena.service;

import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceRollStrategy.DiceRollStrategy;

import java.util.Random;
import java.util.Scanner;

public class DiceService {
    private Player player;
    DiceRollStrategy diceRollStrategy;
    Scanner scn;

    public DiceService(Player player, DiceRollStrategy diceRollStrategy){
        this.player = player;
        this.diceRollStrategy = diceRollStrategy;
        scn = new Scanner(System.in);
    }
    public Integer roll(){
        System.out.println(player.getName() +" please press enter to roll the dice");
        scn.nextLine();
        return diceRollStrategy.roll();
    }
}
