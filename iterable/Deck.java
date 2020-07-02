
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Deck implements Iterable<Card> {

    private ArrayList<Card> cards = new ArrayList<Card>();

    Deck() {
        for (int i=0; i<=9; i++) {
            cards.add(new Card(Card.Color.RED, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.YELLOW, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.BLUE, Card.Rank.NUMBERED, i));
            cards.add(new Card(Card.Color.GREEN, Card.Rank.NUMBERED, i));
        }
        cards.add(new Card(Card.Color.NONE, Card.Rank.WILD_DRAW_4, -1));
    }

    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    void shuffle() { 
        Collections.shuffle(cards);
    }

    void discard(Card c) { }

    Card draw() { return null; }

}
