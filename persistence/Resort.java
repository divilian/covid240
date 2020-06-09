
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

class Resort {
    String name;
    private String phone;
    private String desc;
    private int rating;
    private int price;

    Resort(Scanner s) {
        this.name = s.nextLine();
        this.phone = s.nextLine();
        String starsLine = s.nextLine();   // "3 stars"
        this.rating = Integer.valueOf(starsLine.split(" ")[0]);
        String dollarsLine = s.nextLine();  // "$$$$"
        this.price = dollarsLine.length();
    }

    Resort(String name, String phone, String desc, int rating, int price) {
        this.name = name;
        this.phone = phone;
        this.desc = desc;
        this.rating = rating;
        this.price = price;
    }

    public String toString() {
        String placeholder = "";
        for (int i=0; i<this.rating; i++) {
            placeholder = placeholder + "*";
        }
        return this.name + " (" + placeholder + ")";
    }

    void persist(PrintWriter pw) {
        pw.println(this.name);
        pw.println(this.phone);
        pw.println("" + this.rating + (this.rating == 1 ? " star" : " stars"));
        for (int i=0; i<this.price; i++) {
            pw.print("$");
        }
        pw.println();
        pw.println(this.desc);
        pw.println(".");
    }

    public static void main(String args[]) {
/*
        Resort anything = new Resort("Brian's Place", "1111111",
            "this place sucks!!!\nI mean seriously??\nThere's no running water!", 1, 5);

        try {
            File f = new File("bathroomBreak.txt");
            PrintWriter pw = new PrintWriter(f);
            anything.persist(pw);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(anything);
*/

        try {
            File f = new File("bathroomBreak.txt");
            Scanner s = new Scanner(f);
            Resort hydratedResort = new Resort(s);
            System.out.println(hydratedResort);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

