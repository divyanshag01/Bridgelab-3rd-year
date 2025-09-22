
// Question_10: Program for deck of cards (initialize, shuffle, distribute)
import java.util.*;
public class Question_10 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        Collections.shuffle(deck);
        System.out.println("Shuffled deck: " + deck);
        System.out.println("\nDistributing 5 cards to 4 players:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.remove(0) + ", ");
            }
            System.out.println();
        }
    }
}
