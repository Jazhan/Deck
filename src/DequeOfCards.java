import java.util.Collections;
import java.util.List;
import java.util.Random;


public class DequeOfCards implements DequeInterface<Card> {
    private DLNode<Card> firstNode;
    private DLNode<Card> lastNode;

    public DequeOfCards() { firstNode = null; lastNode=null;}
    public DequeOfCards(DeckOfCards d) {
        firstNode = null; lastNode = null;
        for (Card c : d) {
            addToBack(c);
        }
    }
    @Override
    public void addToFront(Card newEntry) {
        DLNode<Card> newNode = new DLNode<Card>(null, newEntry, firstNode);
        if (isEmpty())
            lastNode = newNode;
        else
            firstNode.setPrev(newNode);
        firstNode = newNode;

    }
    @Override
    public void addToBack(Card newEntry) {
        DLNode<Card> newNode = new DLNode<Card>(lastNode, newEntry, null);
        if (isEmpty())
            firstNode = newNode;
        else
            lastNode.setNext(newNode);
        lastNode = newNode;
    }
    public void display() {
        DLNode<Card> tmp = firstNode;
        int i = 0;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }
    public DequeOfCards[] cut() {
        Random r = new Random();
        DequeOfCards[] ar = new DequeOfCards[2];


        return ar;
    }
    @Override
    public Card removeFront() {
        Card front = null;
        if (!isEmpty()) {
            front = firstNode.getData();
            firstNode = firstNode.next;

            if (firstNode == null) {
                lastNode = null;
            }
            else
                firstNode.setPrev(null);
        }
        return front;
    }


    @Override
    public Card removeBack() {
        return null;
    }

    @Override
    public Card getBack() {
        return null;
    }

    @Override
    public Card getFront() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    }

    @Override
    public void clear() {

    }

    private class DLNode<T> {
        private T data;
        private DLNode<T> next;
        private DLNode<T> prev;

        DLNode(DLNode<T> prev, T data, DLNode<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
        public String toString() {
            return data.toString();
        }
        public void setNext(DLNode<T> n) {
            this.next = n;
        }
        public void setPrev(DLNode<T> p) {
            this.prev = p;
        }
        public T getData() {
            return data;
        }
    } // end class DLNode<T>

 // end class DequeOfCards

}