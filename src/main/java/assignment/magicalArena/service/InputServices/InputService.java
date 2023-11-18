package assignment.magicalArena.service;

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
        String name = "Kai";
        Integer strength = 500;
        Integer attack = 500;
        Integer health = 500;
        for(int i = 0; i < 2; i++){
            Scanner scn = new Scanner(System.in);
            System.out.print(" Please enter Player " + (i+1) + " :");

            System.out.print(" Name: ");
            try{
                name = scn.nextLine();
            }
            catch (Exception e) {
                System.out.println("Please enter a valid name");
                name = scn.nextLine();
            }

            System.out.print(" Max Attack: ");
            try{
                attack = scn.nextInt();
            }
            catch (Exception e){
                System.out.println("Please enter a valid number less than 100000000");
                attack = scn.nextInt();
            }

            System.out.print(" Max Strength: ");
            try{
                strength = scn.nextInt();
            }
            catch (Exception e){
                System.out.println("Please enter a valid number less than 100000000");
                strength = scn.nextInt();
            }

            System.out.print(" Max health: ");
            try{
                health = scn.nextInt();
            }
            catch (Exception e){
                System.out.println("Please enter a valid number less than 100000000");
                health = scn.nextInt();
            }
            System.out.println();

            players.add(new Player(name, i, strength, attack, health));
        }
        return players;
    }
}