package assignment.magicalArena.service.ConsoleInputServices;

import java.util.Scanner;

public class IntegerInput {
    private Integer returnValue;
    private Scanner scn;
    public IntegerInput(Integer returnValue) {
        this.returnValue = returnValue;
        scn = new Scanner(System.in);
    }

    public Integer takeInput() {
        try {
            System.out.print("Enter a number less than 16000000: ");
            int userInput = scn.nextInt();

            if (userInput >= 16000000) {
                System.out.println("Please enter a number less than 16000000.");
                return takeInput();
            } else {
                returnValue = userInput;
            }
        } catch (Exception e) {
            scn.nextLine();
            return takeInput();
        }

        return returnValue;
    }
}
