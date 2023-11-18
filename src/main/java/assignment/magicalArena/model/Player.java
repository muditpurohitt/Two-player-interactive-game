package assignment.magicalArena.model;

import java.util.Random;

public class Player {
    private String name;
    private Integer index;
    private Integer strength;
    private Integer attack;
    private Integer health;

    // move? should move be included as a class....
    // attributes - list of players, final health of defender after the move

    public Player(String name, Integer index, Integer strength, Integer attack, Integer health){
        this.name = name;
        this.index = index;
        this.strength = strength;
        this.attack = attack;
        this.health = health;
    }

    public String getName(){return name;}
    public Integer getIndex(){return index;}
    public Integer getHealth(){return health;}

    public void setHealth(Integer value){
        this.health = value;
    }

    public Integer getStrength(){return strength;}
    public Integer getAttack(){return attack;}

    public void printPlayer(){
        System.out.println("Name : " + name + "  Attack: " + attack + "  Strength: " + strength + "  Health: " + health);
    }

    public Integer rollDice() {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int min = 1;
        int max = 6;
        int randomNumber = random.nextInt(max - min + 1) + min;

        return randomNumber;
    }
}
