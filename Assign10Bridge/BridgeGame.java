/**
 * Bridge Game
 * The BridgeGame class contains a main() method which tests methods
 * built into the Card and Deck classes.  
 * 
 * @author Erica Eddy
 * @version April 2021
 */
public class BridgeGame {
    public static void main(String [] args) {
        // create a basic deck and print it to see if it's in order
        Deck myDeck = new Deck();
        System.out.println("Printing original deck ...");
        System.out.println("--------------------------");
        System.out.println(myDeck);
        System.out.println();

        // shuffle the deck randomly
        myDeck.shuffle();
        System.out.println("Printing shuffled deck ...");
        System.out.println("--------------------------");        
        System.out.println(myDeck);
        System.out.println();

        // create 4 hands to hold 13 cards each, then count their points
        Hand [] hands = new Hand[4];
        int [] highCardPoints = new int[4];
        int [] distributionPoints = new int[4];
        
        for (int h = 0; h < hands.length; h++)  {
           hands[h] = new Hand(myDeck.dealThirteenCards());
           // find out each hand's points
           highCardPoints[h] = hands[h].countHighCardPoints();
           distributionPoints[h] = hands[h].countDistributionPoints();
        }

        // String array to hold "name" of hand (directions)
        String [] player = {"North","South","East","West"};
        
        // print each hand's contents
        for (int h = 0; h < hands.length; h++)  {
            System.out.println("Printing " + player[h] + " Hand:  " +
                   highCardPoints[h] + " high card, " + 
                   distributionPoints[h] + " distribution points (" +
                   (highCardPoints[h]+distributionPoints[h]) +
                   " total points)\n" + hands[h]);
            System.out.println();
        }
    }
}
