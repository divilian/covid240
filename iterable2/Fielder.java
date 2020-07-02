
class Fielder extends Ballplayer {
    enum Position { FirstBase, SecondBase, Shortstop, ThirdBase, Catcher, Outfield };
    
    private Position pos;
    private int numHits;
    private int numABs;

    Fielder(String name, int birthYear, Position pos, int uni) {
        super(name, birthYear, uni);
        this.pos = pos;
        this.numHits = 0;
        this.numABs = 0;
    }

    public String toString() {
        return "fielder " + name;
    }
}
