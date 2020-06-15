import java.util.ArrayList;

class Team {

    private String name;
    private ArrayList<Ballplayer> roster;

    Team(String name) {
        roster = new ArrayList<Ballplayer>();
        this.name = name;
    }

    void add(Ballplayer bp) {
        roster.add(bp);
    }

    void printRoster() {
        System.out.println(name + " roster:");
        for (Ballplayer bp: roster) {
            System.out.println(bp);
        }
    }

    public static void main(String args[]) {
        Team yankees = new Team("Yankees");
        
        Ballplayer dimaggio = new Ballplayer("Dimaggio, Joe");
        dimaggio.setUni(5);
        dimaggio.strikeout();
        dimaggio.getAHit();
        dimaggio.strikeout();
        dimaggio.strikeout();
        dimaggio.getAHit();

        Ballplayer mantle = new Ballplayer("Mantle, Mickey");
        mantle.setUni(7);
        mantle.strikeout();
        mantle.getAHit();
        mantle.strikeout();
        mantle.getAHit();
        mantle.strikeout();
        mantle.strikeout();

        Ballplayer jackson = new Ballplayer("Jackson, Reggie");
        jackson.setUni(44);
        jackson.strikeout();
        jackson.strikeout();
        jackson.getAHit();
        jackson.getAHit();
        jackson.strikeout();
        jackson.strikeout();
        jackson.strikeout();

        Ballplayer jeter = new Ballplayer("Jeter, Derek");
        jeter.setUni(2);
        jeter.getAHit();
        jeter.getAHit();
        jeter.strikeout();
        jeter.strikeout();
        jeter.strikeout();
        jeter.strikeout();
        jeter.strikeout();
        jeter.getAHit();

        yankees.add(dimaggio);
        yankees.add(mantle);
        yankees.add(jackson);
        yankees.add(jeter);

        yankees.printRoster();
        
    }

}
