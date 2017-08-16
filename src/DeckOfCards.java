import java.util.Iterator;

public class DeckOfCards implements Iterable<Card>{
        private Card deck[];
        
        private static final String suits[] = {"spades", "hearts", "diamonds", "clubs"};
        DeckOfCards() {
            deck = new Card[52];
            int index = 0;
            for (String suit : suits) {
                for (int i = 1; i <= 13; i++) {
                    deck[index++] = new Card(suit, i);
                }
            }
        }
    public Iterator <Card> iterator() {
        return new CardIterator();
    }
    private class CardIterator implements Iterator<Card>{
        private int current;
        CardIterator() {
            current=0;
        }
        @Override
        public boolean hasNext() {
            return (current < deck.length);
        }
        @Override
        public Card next() {
            return deck[current++];
        }
    }
}

