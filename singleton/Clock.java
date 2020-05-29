

public class Clock {

    int numMoves;
    static Clock theInstance = null;
    
    public static Clock instance() {
        if (theInstance == null) {
            theInstance = new Clock(); // lazy instantiation
        }
        return theInstance;
    }

    private Clock() {
        this.numMoves = 0;
    }

    void incTime() {
        this.numMoves++;
    }

    int getTime() {
        return this.numMoves;
    }

}
