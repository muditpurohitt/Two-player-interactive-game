package assignment.magicalArena.service.ConsoleInputServices;

import java.util.Scanner;

public class StringInput {
    String returnString;
    Scanner scn;
    public StringInput(String returnString){
        this.returnString = returnString;
        scn = new Scanner(System.in);
    }

    public String takeInput(){
        try{
            returnString = scn.next();
        }
        catch (Exception e){
            System.out.println("Please enter a valid name");
            return takeInput();
        }
        finally{
            return returnString;
        }
    }
}
