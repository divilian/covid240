public class MainSmaller {

    public static void main(String args[]) {

        File paperclips = new File("paperclips.txt", 1000);
        Directory jezebel = new Directory("jezebel");
        Directory filbert = new Directory("filbert");
        Directory cpsc240 = new Directory("CPSC 240");
        Directory classes = new Directory("classes");
        File gradPlan = new File("gradPlan.txt", 200);
        Directory root = new Directory("/");
        File igpay = new File("Igpay.java", 400);
        Directory home = new Directory("home");
        Directory hobbies = new Directory("hobbies");

        jezebel.addEntry(classes);
        home.addEntry(jezebel);
        root.addEntry(home);
        classes.addEntry(gradPlan);
        hobbies.addEntry(paperclips);
        home.addEntry(filbert);
        classes.addEntry(cpsc240);
        cpsc240.addEntry(igpay);
        filbert.addEntry(hobbies);

        System.out.println("Jezebel is using " +
            jezebel.size() + " bytes.");

    }
}
