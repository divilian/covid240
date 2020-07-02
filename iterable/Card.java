
import java.util.ArrayList;

public class Card {

    enum Color { RED, BLUE, GREEN, YELLOW, NONE };

    enum Rank { NUMBERED, WILD, WILD_DRAW_4 };

    private Color color;
    private Rank rank;
    private int number;

    Card(Color c, Rank r, int num) {
        this.color = c;
        this.rank = r;
        this.number = num;
    }

    public String toString() {
        if (color == Color.NONE) {
            return "wild";
        } else {
            String retval = "";
            switch (color) {
            case RED:
                retval += "red ";
                break;
            case GREEN:
                retval += "green ";
                break;
            case BLUE:
                retval += "blue ";
                break;
            case YELLOW:
                retval += "yellow ";
                break;
            }
            return retval + number;
        }
    }

    public static void main(String args[]) {
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(Color.RED, Rank.NUMBERED, 5));
        deck.add(new Card(Color.BLUE, Rank.NUMBERED, 6));
        deck.add(new Card(Color.NONE, Rank.WILD, -1));

        for (Card c: deck) {
            System.out.println("Card: " + c);
        }
    }
}
