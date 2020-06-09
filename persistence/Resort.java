
import java.io.PrintWriter;
import java.io.File;

class Resort {
    String name;
    private String phone;
    private String desc;
    private int rating;
    private int price;

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
    }
}

