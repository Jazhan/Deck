import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card implements Comparable<Card> {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int compareTo(Card c) {
        if (this.value > c.value) {
            return 1;
        }
        else if (this.value < c.value) {
            return -1;
        }
        else return this.suit.compareTo(c.suit);
    }
    public int getValue() {
        return value;
    }
    public String getSuit() {
        return suit;
    }
    public String toString() {
        return value + " of " + suit;
    }   

//Decks //


}
