/**
 * Name: Ulysses Palomar (palomar)
 * Course: CSCI 241 - Computer Science I
 * Assignment: 2
 * 
 * Project/Class Description:
 * This class will initialize the deck of cards
 * Known Bugs:
 * None
 */

public class Hand {
    private Card[] hand;
    
    public Hand(Card [] cardArray) {
        for (int i = 0; i < cardArray.length; i++) {
            hand[i] = cardArray[i];
        }
    }
    
    public int countHighCardPoints() {
        int points = 0;
        for (int i = 0; i < hand.length; i++) {
            points += hand[i].getPoints();
        }
        
        return points;
    }
    
    public int countDistributionPoints() {
        int cCount = 0;
        int dCount = 0;
        int hCount = 0;
        int sCount = 0;
        
        char clubs = 'c';
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getSuit().equals(clubs)) {
                cCount++;
                //Couldn't figure this part out or the toString() method.
                //Sorry
            }
        }      
    }
}