
class Pitcher extends Ballplayer {
    
    private int numStrikeouts;
    private int numWalks;

    Pitcher(String name, int birthYear, int uni) {
        super(name, birthYear, uni);
        this.numStrikeouts = 0;
        this.numWalks = 0;
    }

    public String toString() {
        return "pitcher " + name;
    }
}
