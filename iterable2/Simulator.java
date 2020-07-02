

public class Simulator {
    public static void main(String args[]) {
        Team yankees = new Team("yankees");
        yankees.add(new Fielder("Ruth", 1900, Fielder.Position.Outfield, 3));
        yankees.add(new Fielder("Gehrig", 1903, Fielder.Position.FirstBase, 4));
        yankees.add(new Pitcher("Rivera", 1973, 21));
        yankees.add(new Pitcher("Ford", 1933, 44));
        yankees.add(new Fielder("Jeter", 1979, Fielder.Position.Shortstop, 2));

        for (Ballplayer b: yankees) {
            System.out.println("On the roster: " + b);
        }
    }
}
