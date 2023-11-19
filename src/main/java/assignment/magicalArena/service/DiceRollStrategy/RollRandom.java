package assignment.magicalArena.service.DiceRollStrategy;

import java.util.Random;

public class RollRandom implements DiceRollStrategy{
    private Integer randomNumber;
    public RollRandom(){
        randomNumber = 0;
    }
    @Override
    public Integer roll(){
        Random random = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int min = 1;
        int max = 6;
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println(
                "You got " + randomNumber + " on the dice");
        return randomNumber;
    }
}
