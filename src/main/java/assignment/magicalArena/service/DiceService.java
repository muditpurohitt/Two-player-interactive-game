package assignment.magicalArena.service;

import assignment.magicalArena.model.Player;

import java.util.Random;
import java.util.Scanner;

public class DiceService {
    private Player player;
    Scanner scn;

    public DiceService(Player player){
        this.player = player;
        scn = new Scanner(System.in);
    }
    public Integer roll(){
        System.out.println(player.getName() +" please press enter to roll the dice");
        scn.nextLine();
        Random random = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int min = 1;
        int max = 6;
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println(
                "You got " + randomNumber + " on the dice");
        return randomNumber;
    }
}
