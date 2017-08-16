import java.util.List;
import java.util.Random;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards doc = new DeckOfCards();
        DequeOfCards deque = new DequeOfCards(doc);
        deque.display();
        DequeOfCards[] arrayOfDecks = new DequeOfCards[2];
        arrayOfDecks = deque.cut();
        arrayOfDecks[0].display();
        arrayOfDecks[1].display();
    }

//Decks //

	public void shuffle() {
Card list = this.subList(0, this.size(52));
}
private Card subList(int i, Card size) {
	return size;
}

private Card size(int i) {
	// TODO Auto-generated method stub
	return null;
}
	public static void display() {
		for(int i = 0; i < 52; i++);
		System.out.print("The deck is displayed");
	}
	
	public void cut(){
	}
		    Card[] temp = new Card[52];
		    Random random = new Random();
		    int cut= random.nextInt(52);
		    {
		    System.out.println("Cut the deck " + cut);
	}
}
// Decks //   