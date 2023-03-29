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

public class Deck {
    private Card[] cardObjects = new Card[52];
    private int count = 0;
    
    public Deck() {
        //Loop to fill with cards 2-K Clubs
        for (int i = 2; i < 15; i++) {
            cardObjects[i-2] = new Card(i, 'C');
            count++;
        }
        //Loop to fill with cards 2-K Diamonds
        for (int i = 15; i < 28; i++) {
            cardObjects[i-2] = new Card(i-13, 'D');
            count++;
        }
        //Loop to fill with cards 2-K Hearts
        for (int i = 28; i < 41; i++) {
            cardObjects[i-2] = new Card(i-26, 'H');
            count++;
        }
        //Loop to fill with cards 2-K Spades
        for (int i = 41; i < 54; i++) {
            cardObjects[i-2] = new Card(i-39, 'S');
            count++;
        }
    }
    
    public int getCount() {
        return count;
    }
    
    public void shuffle() {
        for (int i = 0; i < cardObjects.length; i++) {
            int j = (int)(Math.random()*cardObjects.length);
           
            Card temp = cardObjects[i];
            cardObjects[i] = cardObjects[j];
            cardObjects[j] = temp;
       }
    }
    //Deals thirteen cards
    public Card [] dealThirteenCards() {
        Card[] thirteenCards = new Card[13];
        for (int i = 0; i < 13; i++) {
            thirteenCards[i] = cardObjects[i];
            count--;
        }
        return thirteenCards;
    }
    public String toString() {
        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        
        int count = 0;
        for (int i = 0; i < cardObjects.length; i++) {
            if (i < 13) {
                line1 = line1 + cardObjects[i].toString() + ", ";
            }
            else if ((i > 12) && (i < 25)) {
                line2 = line2 + cardObjects[i].toString() + ", ";
            }
            else if ((i > 24) && (i < 37)) {
                line3 = line3 + cardObjects[i].toString() + ", ";
            }
            else if ((i > 36) && (i < 51)) {
                line4 = line4 + cardObjects[i].toString() + ", ";
            }
            else {
                line4 = line4 + cardObjects[i].toString();
            }
        }
        
        String complete = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4;
        return complete;
    }
}

