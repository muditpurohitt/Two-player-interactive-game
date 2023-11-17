package assignment.magicalArena.model;

import assignment.magicalArena.model.types.PlayerType;

public class Player {
    private String name;
    private Integer index;
    private PlayerType playerType;
    private Integer strength;
    private Integer attack;
    private Integer health;
    private Dice dice;

    // move? should move be included as a class....
    // attributes - list of players, final health of defender after the move

    public Player(String name, Integer index, PlayerType playerType,
                  Integer strength, Integer attack, Integer health, Dice dice){
        this.name = name;
        this.playerType = playerType;
        this.index = index;
        this.strength = strength;
        this.attack = attack;
        this.health = health;
        this.dice = dice;
    }

    public String getName(){return name;}
    public Integer getIndex(){return index;}
    public PlayerType getType(){return playerType;}
    public Integer getHealth(){return health;}
    public Integer getStrength(){return strength;}
    public Integer getAttack(){return attack;}

    // roll the dice functionality here?
}
