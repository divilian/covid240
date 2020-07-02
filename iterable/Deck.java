
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    Deck() {
        for (int i=0; i<=9; i++) {
            cards.add(new Card(Card.Color.RED, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.YELLOW, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.BLUE, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.GREEN, Card.Rank.NUMBERED, i));
        }
    }

    void shuffle() { 
        Collections.shuffle(cards);
    }

    void discard(Card c) { }

    Card draw() { return null; }

}
