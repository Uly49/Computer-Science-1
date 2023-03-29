/**
 * Name: Ulysses Palomar (palomar)
 * Course: CSCI 241 - Computer Science I
 * Assignment: 2
 * 
 * Project/Class Description:
 * This class will initialize the cards in the deck
 * Known Bugs:
 * None
 */

public class Card {
    private int rank;
    private char suit;
    private int points;
    
    //Constructor to create new card
    public Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
        if (rank == 11) {
            points = 1;
        }
        else if (rank == 12) {
            points = 2;
        }
        else if (rank == 13) {
            points = 3;
        }
        else if (rank == 14) {
            points = 4;
        }
        else {
            points = 0;
        }
    }
    
    public int getRank() {
        return rank;
    }
    
    public char getSuit() {
        return suit;
    }
    
    public int getPoints() {
        return points;
    }
    
    //Method to return statement describing
    //rank, suit, and points for each card
    public String toString() {
        if (rank == 11) {
            return " J" + suit + "(" + points + ")";
        }
        else if (rank == 12) {
            return " Q" + suit + "(" + points + ")";
        }
        else if (rank == 13) {
            return " K" + suit + "(" + points + ")";
        }
        else if (rank == 14) {
            return " A" + suit + "(" + points + ")";
        }
        else if (rank == 10) {
            return "10" + suit + "(" + points + ")";
        }
        else {
            return " " + rank + suit + "(" + points + ")";
        }
    }
}