class Ballplayer {

    private String name, position;
    private int uni, numHits, numAtBats;

    Ballplayer(String name) {
        this.name = name;
        numHits = 0;
        numAtBats = 0;
    }

    void setUni(int uni) {
        this.uni = uni;
    }

    void strikeout() {
        numAtBats++;
    }

    void getAHit() {
        numHits++;
        numAtBats++;
    }

    public String toString() {
        return "#" + uni + " " + name + " -- " + getBattingAverage();
    }

    double getBattingAverage() {
        return ((double) numHits)/numAtBats;
    }
}

