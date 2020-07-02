

public class Simulator {
    public static void main(String args[]) {
        Deck d = new Deck();
        d.shuffle();
        for (Card c: d) {
            System.out.println("here's a card: " + c);
        }
    }
}
