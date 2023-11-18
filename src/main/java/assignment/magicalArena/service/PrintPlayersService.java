package assignment.magicalArena.service;

import assignment.magicalArena.model.Player;

import java.util.List;

public class PrintPlayersService {
    private List<Player> players;

    public PrintPlayersService(List<Player> players){
        this.players = players;
    }
    public void print(){
        for(int i = 0; i < players.size(); i++){
            System.out.println("Name : " + players.get(i).getName() +
                    "  Attack: " + players.get(i).getAttack() + "  Strength: "
                    + players.get(i).getStrength() + "  Health: " + players.get(i).getHealth());
        }
    }
}
