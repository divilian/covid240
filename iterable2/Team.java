
import java.util.ArrayList;
import java.util.Iterator;

class Team {
    private String name;
    private ArrayList<Pitcher> pitchers;
    private ArrayList<Fielder> fielders;

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
