package assignment.magicalArena.service.ConsoleInputServices;

import assignment.magicalArena.model.Player;
import assignment.magicalArena.service.DiceRollStrategy.DiceRollStrategy;
import assignment.magicalArena.service.DiceRollStrategy.RollRandom;
import assignment.magicalArena.service.DiceService;

import java.util.ArrayList;
import java.util.List;

public class  InputService {
    private List<Player> players;
    DiceRollStrategy diceRollStrategy;

    public InputService(DiceRollStrategy diceRollStrategy){
        players = new ArrayList<>();
        this.diceRollStrategy = diceRollStrategy;
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

            players.add(new Player(name, i, strength, attack, health, diceRollStrategy));
        }
        return players;
    }
}
