package assignment.magicalArena.service.InputServices;

import assignment.magicalArena.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputService {
    private List<Player> players;

    public InputService(){
        players = new ArrayList<>();
    }

    public List<Player> getInput(){
        for(int i = 0; i < 2; i++){
            System.out.println(" Please enter Player " + (i+1) + " :");

            System.out.print(" Name: ");
            String name = new StringInput("Kai").takeInput();

            System.out.print(" Max Attack: ");
            Integer attack = new IntegerInput(500).takeInput();

            System.out.print(" Max Strength: ");
            Integer strength = new IntegerInput(500).takeInput();

            System.out.print(" Max health: ");
            Integer health = new IntegerInput(500).takeInput();
            System.out.println();

            players.add(new Player(name, i, strength, attack, health));
        }
        return players;
    }
}
