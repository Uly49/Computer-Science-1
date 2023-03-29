
/**
 * Name: Ulysses Palomar (palomar)
 * Course: CSCI 241 - Computer Science 1
 * Section: 001
 * Assignment: 1
 * 
 * Project Description: This class creates a guessing game called
 * "High-Low". The player must guess a number between 1 and 100
 * (inclusive). The secret number is picked at random. The player
 * wins if he'she guess the number within the maximum guesses
 * allowed. The player loses if he/she cannot discover the number
 * by that time.
 * 
 * Known Bugs: none
 */
import java.util.*;

public class HighLow
{
//-----------------------------------
//  Date Members
//-----------------------------------
// class constants
private static final int MAX_GUESSES = 6; // max guess per game

// class variables
private static Scanner keyboard;   // input from keyboard
private static int secretNumber;   // number to guess

//----------------------------------
// Private methods called from main()
//   void start ()
//   void describe Rules ()
//   void generatesSecretNumber (   )
//   void playGame ()
//----------------------------------
/**
 * Top level method that calls the other private methods
 * to play the High-Low games.
 */
private static void start () {
    //tell the player how the game works
    describeRules();
    
    // Collect a guess
    System.out.print("ready? Type Y to play, N to quit:   ");
    
    String answer = keyboard.next();
    
    // Keep playing as long as the answer begins with a Y
    while (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
        System.out.println();
        secretNumber = generateSecretNumber( );
        playGame();
        System.out.println("Another game?  ");
        System.out.print("Type Y to play, N to quit:  ");
        answer = keyboard.next();
    }
}
/**
 * Provides a brief explanation of the program to the user
 */
private static void describeRules( ) {
    System.out.println("*** WELCOME TO THE HIGH-LOW GAME ***");
    System.out.println("The objective of this game is for you ");
    System.out.println("to guess the secret number (any ");
    System.out.println("integer between 1 and 100) with the");
    System.out.println("least number of tries. The maximum ");
    System.out.println("number of tries allowed is six. If");
    System.out.println("your guess is higher than the secret ");
    System.out.println("number, the program will reply High. ");
    System.out.println("If your guess is lower, the program ");
    System.out.println("will reply Low");
}

/**
 * Generates and returns a random number between 1 and 100, inclusive
 */
private static int generateSecretNumber( ) {
    double temp = Math.random();
    int num = (int) Math.floor(temp * 100) + 1;
    return num;
}
/**
 * Plays one High-Low game.
 */
private static void playGame( ) {
    int guessCount = 0; // number of guess in the current game
    int guess;          // number guess
    
    do {
        //get the next guess
        guess = getNextGuess();
        
        // increment the count of guesses
        guessCount++;
        
        //check the guess
        if (guess < secretNumber) {
            System.out.println("Your guess is Low");
        }
        else if (guess > secretNumber) {
            System.out.println("Your guess is High");
        }
}
while (guessCount < MAX_GUESSES && guess != secretNumber);

//output appropriate message
if (guess == secretNumber) {
    System.out.print("Congratulations! You guessed it in ");
    System.out.println(guessCount + " tries.");
}
else { // ran out of guesses
    System.out.print("Sorry, the secret number was ");
    System.out.println(secretNumber);
}
}

/**
 * Gets the player's next guess.
 * 
 * @return the next guess entered by the player
 */
private static int getNextGuess( ) {
    int nextGuess;
    
    System.out.print("Enter guess between 1 and 100: ");
    nextGuess = keyboard.nextInt();
    
    // Make sure the guess is in range and if not, ask again.
    // Don't count guesses that are out of range.
    while (nextGuess < 1 || nextGuess > 100) {
        System.out.println("Guess must be between 1 and 100");
        System.out.print("Your next guess: ");
        nextGuess = keyboard.nextInt();
    }
    return nextGuess;
}
/**
 * main() method: sets up keyboard scanner and starts the game.
 */
public static void main (String [] args) {
    // set up Scanner for keyboard input
    keyboard = new Scanner(System.in);
    start();
}
}
