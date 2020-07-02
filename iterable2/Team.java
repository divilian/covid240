
import java.util.ArrayList;
import java.util.Iterator;

class Team implements Iterable<Ballplayer> {
    private String name;
    private ArrayList<Pitcher> pitchers;
    private ArrayList<Fielder> fielders;

    public Iterator<Ballplayer> iterator() {
        ArrayList<Ballplayer> x = (ArrayList<Ballplayer>) pitchers.clone();
        x.addAll(fielders);
        return x.iterator();
    }

    Team(String name) {
        this.name = name;
        this.pitchers = new ArrayList<Pitcher>();
        this.fielders = new ArrayList<Fielder>();
    }

    void add(Pitcher p) {
        pitchers.add(p);
    }
    void add(Fielder f) {
        fielders.add(f);
    }
}
