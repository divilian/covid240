
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class ReservationSystem {

    private int year;
    private String chainName;
    private ArrayList<Resort> resorts;

    ReservationSystem(Scanner s) {
        init();
        this.chainName = s.nextLine();
        this.year = Integer.valueOf(s.nextLine().split(" ")[0]);
        s.nextLine();    // throw away "=====" header

        try {
            while (true) {
                Resort r = new Resort(s);
                add(r);
            }
        } catch (Exception e) {
            
        }
    }

    private void init() {
        resorts = new ArrayList<Resort>();
    }

    ReservationSystem(String chainName) {
        init();
        this.chainName = chainName;
        this.year = 2020;
    }

    void add(Resort r) {
        resorts.add(r);
    }

    public String toString() {
        String x = this.chainName + " (" + this.year + " season) with " +
            this.resorts.size() + " properties:";

        for (Resort r: resorts) {
            x = x + "\n\t" + r.name;
        }
        return x;
    }

    void persist(PrintWriter pw) {
        pw.println(this.chainName);
        pw.println("" + this.year + " season");
        pw.println("===========================");
        for (Resort r: resorts) {
            r.persist(pw);
        }
        pw.println("-END-");
    }

    public static void main(String args[]) {
/*
        ReservationSystem daviesInns = new ReservationSystem("Davies Inns");
        Resort r = new Resort("Inn #1", "123", "a stinky place", 1, 1);
        Resort r2 = new Resort("Yoda's Hut", "---", "wormy and icky", 1, 1);
        Resort r3 = new Resort("Mariott at Coruscant", "1123",
            "a world-class enterprise", 5, 5);

        daviesInns.add(r);
        daviesInns.add(r2);
        daviesInns.add(r3);
        System.out.println(daviesInns);    
*/

        try {
            File f = new File("exampleFormat.txt");
            Scanner s = new Scanner(f);
            ReservationSystem example = new ReservationSystem(s);
            System.out.println("example = " + example);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
