package assignment.magicalArena.model;

public class Move {
    private Player player;
    private Integer dice;

    public Move(Player player, Integer dice){
        this.player = player;
        this.dice = dice;
    }

    public Player getPlayer(){return player;}
    public Integer getDiceVlaue(){return dice;}

}