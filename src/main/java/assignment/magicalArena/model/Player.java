package assignment.magicalArena.model;

public class Player {
    private String name;
    private Integer index;
    private Integer strength;
    private Integer attack;
    private Integer health;
    private Dice dice;

    // move? should move be included as a class....
    // attributes - list of players, final health of defender after the move

    public Player(String name, Integer index, Integer strength, Integer attack, Integer health, Dice dice){
        this.name = name;
        this.index = index;
        this.strength = strength;
        this.attack = attack;
        this.health = health;
        this.dice = dice;
    }

    public String getName(){return name;}
    public Integer getIndex(){return index;}
    public Integer getHealth(){return health;}
    public Integer getStrength(){return strength;}
    public Integer getAttack(){return attack;}

    public void printPlayer(){
        System.out.println("Name : " + name + "  Attack: " + attack + "  Strength: " + strength + "  Health: " + health);
    }

    // roll the dice functionality here?

}
