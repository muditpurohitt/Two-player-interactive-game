package assignment.magicalArena.model;

public class Player {
    private String name;
    private Integer id;
    private PlayerType playerType;
    private Integer strength;
    private Integer attack;
    private Integer health;
    private Dice dice;

    public Player(String name, Integer id, PlayerType playerType,
                  Integer strength, Integer attack, Integer health, Dice dice){
        this.name = name;
        this.playerType = playerType;
        this.id = id;
        this.strength = strength;
        this.attack = attack;
        this.health = health;
        this.dice = dice;
    }

    public String getName(){return name;}
    public Integer getId(){return id;}
    public PlayerType getType(){return playerType;}
    public Integer getHealth(){return health;}
    public Integer getStrength(){return strength;}
    public Integer getAttack(){return attack;}

    // roll the dice functionality here?
}
