
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;

public class ReservationSystem {

    private int year;
    private String chainName;
    private ArrayList<Resort> resorts;

    ReservationSystem(String chainName) {
        this.chainName = chainName;
        this.year = 2020;
        resorts = new ArrayList<Resort>();
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
        ReservationSystem daviesInns = new ReservationSystem("Davies Inns");
        Resort r = new Resort("Inn #1", "123", "a stinky place", 1, 1);
        Resort r2 = new Resort("Yoda's Hut", "---", "wormy and icky", 1, 1);
        Resort r3 = new Resort("Mariott at Coruscant", "1123",
            "a world-class enterprise", 5, 5);

        daviesInns.add(r);
        daviesInns.add(r2);
        daviesInns.add(r3);
        System.out.println(daviesInns);    

        try {
            File f = new File("daviesInns.txt");
            PrintWriter pw = new PrintWriter(f);
            daviesInns.persist(pw);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
