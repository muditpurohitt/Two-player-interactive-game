 MAGICAL ARENA 
============================================================================
How to run the application-

1\. Navigate to Magical Arena -\> src -\> main -\> java -\> assignment
-\> magicalArena 2. Run the main file. 3. You will be prompted by the
console for the inputs to play. 4. You can quit the game after every
move by pressing \'q\' on the keyboard. 5. Enjoy the game

==============================================================================
Explainiation -

The code has been written keeping in mind the SOLID principles.

1.Design pattens used- a. Builder Design Pattern b. Strategy Design
Pattern

2.Project structure The project is divided into 4 directories a.
Controller - Contains GameController class that interacts with the main
class and mediates between the service layer and main class. b. model -
Contains the following model classes  1. Player 2. Game 3. GameState c.
services - This directory contains the classes that have the business
logic and algorithms. All these classes do the actual computation.
MakeMoveService contains the core alogorithm of the game. d. Tests -
This directory contins the unit test cases that test various features of
the application

2\. Algorithms In the start of the game the player that has less health
is the attacker and then both the players take alternate turns as
attacker. a. GameWinningStrategy - Both the attacker and the defender
roll the dice and defender incurs damage on the following formula-

damage = Math.max(0, (Attacker.attack \* attackerDiceValue -
Defender.strength \* defenderDiceValue)) defender.health =
defender.health - damage

It is important to note that if the value of damage is less than 0, no
damage is inflicted to the defender.

b. Dice roll strategy- During a move, both the attacker and the defender
are prompted to press return key on the console, which rolls the dice
for them respectively. The value of the dice is generated by a random
number generator and lies between 1 and 6. The players cannot get a
number of their choice on a roll,

c. Player Initialization- The players are initialized by taking
following inputs from the console -  1. Player name 2. Attack value 3.
Strength value 4. Health value

Note - the maximum value of 2, 3, and 4th inputs is
16000000(Integer.MAX_VALUE/6) to avoid overflow. The variable that
stores these values is an integer and we are multiplying it by the value
of dice roll (which can be 6 at max)
